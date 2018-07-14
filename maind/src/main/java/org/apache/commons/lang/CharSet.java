package org.apache.commons.lang;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharSet
  implements Serializable
{
  public static final CharSet ASCII_ALPHA;
  public static final CharSet ASCII_ALPHA_LOWER;
  public static final CharSet ASCII_ALPHA_UPPER;
  public static final CharSet ASCII_NUMERIC;
  protected static final Map COMMON;
  public static final CharSet EMPTY;
  private static final long serialVersionUID = 5947847346149275958L;
  private final Set set;
  
  static
  {
    CharSet localCharSet = new org/apache/commons/lang/CharSet;
    Object localObject = (String)null;
    localCharSet.<init>(null);
    EMPTY = localCharSet;
    localObject = new org/apache/commons/lang/CharSet;
    ((CharSet)localObject).<init>("a-zA-Z");
    ASCII_ALPHA = (CharSet)localObject;
    localObject = new org/apache/commons/lang/CharSet;
    ((CharSet)localObject).<init>("a-z");
    ASCII_ALPHA_LOWER = (CharSet)localObject;
    localObject = new org/apache/commons/lang/CharSet;
    ((CharSet)localObject).<init>("A-Z");
    ASCII_ALPHA_UPPER = (CharSet)localObject;
    localObject = new org/apache/commons/lang/CharSet;
    ((CharSet)localObject).<init>("0-9");
    ASCII_NUMERIC = (CharSet)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    COMMON = Collections.synchronizedMap((Map)localObject);
    localObject = COMMON;
    localCharSet = EMPTY;
    ((Map)localObject).put(null, localCharSet);
    localObject = COMMON;
    localCharSet = EMPTY;
    ((Map)localObject).put("", localCharSet);
    localObject = COMMON;
    localCharSet = ASCII_ALPHA;
    ((Map)localObject).put("a-zA-Z", localCharSet);
    localObject = COMMON;
    localCharSet = ASCII_ALPHA;
    ((Map)localObject).put("A-Za-z", localCharSet);
    localObject = COMMON;
    localCharSet = ASCII_ALPHA_LOWER;
    ((Map)localObject).put("a-z", localCharSet);
    localObject = COMMON;
    localCharSet = ASCII_ALPHA_UPPER;
    ((Map)localObject).put("A-Z", localCharSet);
    localObject = COMMON;
    localCharSet = ASCII_NUMERIC;
    ((Map)localObject).put("0-9", localCharSet);
  }
  
  protected CharSet(String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.set = localHashSet;
    add(paramString);
  }
  
  protected CharSet(String[] paramArrayOfString)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.set = ((Set)localObject);
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      localObject = paramArrayOfString[j];
      add((String)localObject);
      j += 1;
    }
  }
  
  public static CharSet getInstance(String paramString)
  {
    Map localMap = COMMON;
    Object localObject = localMap.get(paramString);
    if (localObject != null) {
      localObject = (CharSet)localObject;
    }
    for (;;)
    {
      return (CharSet)localObject;
      localObject = new org/apache/commons/lang/CharSet;
      ((CharSet)localObject).<init>(paramString);
    }
  }
  
  public static CharSet getInstance(String[] paramArrayOfString)
  {
    CharSet localCharSet;
    if (paramArrayOfString == null) {
      localCharSet = null;
    }
    for (;;)
    {
      return localCharSet;
      localCharSet = new org/apache/commons/lang/CharSet;
      localCharSet.<init>(paramArrayOfString);
    }
  }
  
  protected void add(String paramString)
  {
    int i = 94;
    int j = 45;
    if (paramString == null) {}
    for (;;)
    {
      return;
      int k = paramString.length();
      int m = 0;
      while (m < k)
      {
        int n = k - m;
        int i1 = 4;
        if (n >= i1)
        {
          i1 = paramString.charAt(m);
          if (i1 == i)
          {
            i1 = m + 2;
            i1 = paramString.charAt(i1);
            if (i1 == j)
            {
              localSet = this.set;
              int i2 = m + 1;
              i2 = paramString.charAt(i2);
              int i4 = m + 3;
              i4 = paramString.charAt(i4);
              localCharRange = CharRange.isNotIn(i2, i4);
              localSet.add(localCharRange);
              m += 4;
              continue;
            }
          }
        }
        i1 = 3;
        if (n >= i1)
        {
          i1 = m + 1;
          i1 = paramString.charAt(i1);
          if (i1 == j)
          {
            localSet = this.set;
            char c1 = paramString.charAt(m);
            int i5 = m + 2;
            i5 = paramString.charAt(i5);
            localCharRange = CharRange.isIn(c1, i5);
            localSet.add(localCharRange);
            m += 3;
            continue;
          }
        }
        i1 = 2;
        if (n >= i1)
        {
          i1 = paramString.charAt(m);
          if (i1 == i)
          {
            localSet = this.set;
            int i3 = m + 1;
            i3 = paramString.charAt(i3);
            localCharRange = CharRange.isNot(i3);
            localSet.add(localCharRange);
            m += 2;
            continue;
          }
        }
        Set localSet = this.set;
        char c2 = paramString.charAt(m);
        CharRange localCharRange = CharRange.is(c2);
        localSet.add(localCharRange);
        m += 1;
      }
    }
  }
  
  public boolean contains(char paramChar)
  {
    Set localSet = this.set;
    Iterator localIterator = localSet.iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      CharRange localCharRange = (CharRange)localIterator.next();
      bool = localCharRange.contains(paramChar);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localSet = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof CharSet;
      Set localSet1;
      if (!bool)
      {
        bool = false;
        localSet1 = null;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (CharSet)paramObject;
        localSet1 = this.set;
        Set localSet2 = ((CharSet)localObject).set;
        bool = localSet1.equals(localSet2);
      }
    }
  }
  
  public CharRange[] getCharRanges()
  {
    Set localSet = this.set;
    CharRange[] arrayOfCharRange = new CharRange[this.set.size()];
    return (CharRange[])localSet.toArray(arrayOfCharRange);
  }
  
  public int hashCode()
  {
    return this.set.hashCode() + 89;
  }
  
  public String toString()
  {
    return this.set.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */