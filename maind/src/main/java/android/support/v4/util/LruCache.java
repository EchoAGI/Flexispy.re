package android.support.v4.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LruCache
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;
  
  public LruCache(int paramInt)
  {
    if (paramInt <= 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("maxSize <= 0");
      throw ((Throwable)localObject);
    }
    this.maxSize = paramInt;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>(0, 0.75F, true);
    this.map = ((LinkedHashMap)localObject);
  }
  
  private int safeSizeOf(Object paramObject1, Object paramObject2)
  {
    int i = sizeOf(paramObject1, paramObject2);
    if (i < 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Negative size: " + paramObject1 + "=" + paramObject2;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    return i;
  }
  
  private void trimToSize(int paramInt)
  {
    for (;;)
    {
      try
      {
        int i = this.size;
        Object localObject1;
        if (i >= 0)
        {
          localObject1 = this.map;
          boolean bool1 = ((LinkedHashMap)localObject1).isEmpty();
          if (bool1)
          {
            j = this.size;
            if (j == 0) {}
          }
        }
        else
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = getClass();
          localObject5 = ((Class)localObject5).getName();
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ".sizeOf() is reporting inconsistent results!";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
      finally {}
      int j = this.size;
      if (j > paramInt)
      {
        localObject3 = this.map;
        boolean bool2 = ((LinkedHashMap)localObject3).isEmpty();
        if (!bool2) {}
      }
      else
      {
        return;
      }
      Object localObject3 = this.map;
      localObject3 = ((LinkedHashMap)localObject3).entrySet();
      localObject3 = ((Set)localObject3).iterator();
      Object localObject6 = ((Iterator)localObject3).next();
      localObject6 = (Map.Entry)localObject6;
      Object localObject7 = ((Map.Entry)localObject6).getKey();
      Object localObject8 = ((Map.Entry)localObject6).getValue();
      localObject3 = this.map;
      ((LinkedHashMap)localObject3).remove(localObject7);
      int k = this.size;
      int m = safeSizeOf(localObject7, localObject8);
      k -= m;
      this.size = k;
      k = this.evictionCount + 1;
      this.evictionCount = k;
      k = 1;
      int n = 0;
      Object localObject4 = null;
      entryRemoved(k, localObject7, localObject8, null);
    }
  }
  
  protected Object create(Object paramObject)
  {
    return null;
  }
  
  public final int createCount()
  {
    try
    {
      int i = this.createCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final void evictAll()
  {
    trimToSize(-1);
  }
  
  public final int evictionCount()
  {
    try
    {
      int i = this.evictionCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object get(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null");
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      Object localObject4;
      int i;
      Object localObject5;
      try
      {
        localObject1 = this.map;
        localObject4 = ((LinkedHashMap)localObject1).get(paramObject);
        if (localObject4 != null)
        {
          i = this.hitCount + 1;
          this.hitCount = i;
          localObject5 = localObject4;
          return localObject5;
        }
        i = this.missCount + 1;
        this.missCount = i;
        localObject5 = create(paramObject);
        if (localObject5 == null)
        {
          localObject5 = null;
          continue;
        }
      }
      finally {}
      try
      {
        i = this.createCount + 1;
        this.createCount = i;
        LinkedHashMap localLinkedHashMap = this.map;
        localObject4 = localLinkedHashMap.put(paramObject, localObject5);
        if (localObject4 != null)
        {
          localLinkedHashMap = this.map;
          localLinkedHashMap.put(paramObject, localObject4);
        }
        for (;;)
        {
          if (localObject4 == null) {
            break label201;
          }
          i = 0;
          localLinkedHashMap = null;
          entryRemoved(false, paramObject, localObject5, localObject4);
          localObject5 = localObject4;
          break;
          i = this.size;
          int j = safeSizeOf(paramObject, localObject5);
          i += j;
          this.size = i;
        }
        i = this.maxSize;
      }
      finally {}
      label201:
      trimToSize(i);
    }
  }
  
  public final int hitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int maxSize()
  {
    try
    {
      int i = this.maxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int missCount()
  {
    try
    {
      int i = this.missCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    if ((paramObject1 == null) || (paramObject2 == null))
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null || value == null");
      throw ((Throwable)localObject1);
    }
    try
    {
      int i = this.putCount + 1;
      this.putCount = i;
      i = this.size;
      int j = safeSizeOf(paramObject1, paramObject2);
      i += j;
      this.size = i;
      localObject1 = this.map;
      Object localObject3 = ((LinkedHashMap)localObject1).put(paramObject1, paramObject2);
      if (localObject3 != null)
      {
        i = this.size;
        j = safeSizeOf(paramObject1, localObject3);
        i -= j;
        this.size = i;
      }
      if (localObject3 != null)
      {
        i = 0;
        localObject1 = null;
        entryRemoved(false, paramObject1, localObject3, paramObject2);
      }
      i = this.maxSize;
      trimToSize(i);
      return localObject3;
    }
    finally {}
  }
  
  public final int putCount()
  {
    try
    {
      int i = this.putCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object remove(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.map;
      Object localObject3 = ((LinkedHashMap)localObject1).remove(paramObject);
      int i;
      int j;
      if (localObject3 != null)
      {
        i = this.size;
        j = safeSizeOf(paramObject, localObject3);
        i -= j;
        this.size = i;
      }
      if (localObject3 != null)
      {
        i = 0;
        localObject1 = null;
        j = 0;
        entryRemoved(false, paramObject, localObject3, null);
      }
      return localObject3;
    }
    finally {}
  }
  
  public final int size()
  {
    try
    {
      int i = this.size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected int sizeOf(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  public final Map snapshot()
  {
    try
    {
      LinkedHashMap localLinkedHashMap1 = new java/util/LinkedHashMap;
      LinkedHashMap localLinkedHashMap2 = this.map;
      localLinkedHashMap1.<init>(localLinkedHashMap2);
      return localLinkedHashMap1;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.hitCount;
      int k = this.missCount;
      int m = j + k;
      if (m != 0)
      {
        j = this.hitCount * 100;
        i = j / m;
      }
      String str = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]";
      k = 4;
      Object[] arrayOfObject = new Object[k];
      int n = 0;
      int i1 = this.maxSize;
      Integer localInteger = Integer.valueOf(i1);
      arrayOfObject[0] = localInteger;
      n = 1;
      i1 = this.hitCount;
      localInteger = Integer.valueOf(i1);
      arrayOfObject[n] = localInteger;
      n = 2;
      i1 = this.missCount;
      localInteger = Integer.valueOf(i1);
      arrayOfObject[n] = localInteger;
      n = 3;
      localInteger = Integer.valueOf(i);
      arrayOfObject[n] = localInteger;
      str = String.format(str, arrayOfObject);
      return str;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/LruCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */