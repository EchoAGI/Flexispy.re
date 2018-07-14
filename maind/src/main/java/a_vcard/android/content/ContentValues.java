package a_vcard.android.content;

import a_vcard.android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ContentValues
{
  public static final String TAG = "ContentValues";
  private HashMap mValues;
  
  public ContentValues()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(8);
    this.mValues = localHashMap;
  }
  
  public ContentValues(int paramInt)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(paramInt, 1.0F);
    this.mValues = localHashMap;
  }
  
  public ContentValues(ContentValues paramContentValues)
  {
    HashMap localHashMap1 = new java/util/HashMap;
    HashMap localHashMap2 = paramContentValues.mValues;
    localHashMap1.<init>(localHashMap2);
    this.mValues = localHashMap1;
  }
  
  private ContentValues(HashMap paramHashMap)
  {
    this.mValues = paramHashMap;
  }
  
  public void clear()
  {
    this.mValues.clear();
  }
  
  public boolean containsKey(String paramString)
  {
    return this.mValues.containsKey(paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof ContentValues;
    HashMap localHashMap1;
    if (!bool)
    {
      bool = false;
      localHashMap1 = null;
    }
    for (;;)
    {
      return bool;
      localHashMap1 = this.mValues;
      paramObject = (ContentValues)paramObject;
      HashMap localHashMap2 = ((ContentValues)paramObject).mValues;
      bool = localHashMap1.equals(localHashMap2);
    }
  }
  
  public Object get(String paramString)
  {
    return this.mValues.get(paramString);
  }
  
  public Boolean getAsBoolean(String paramString)
  {
    localObject1 = this.mValues;
    localObject2 = ((HashMap)localObject1).get(paramString);
    try
    {
      localObject2 = (Boolean)localObject2;
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;)
      {
        boolean bool = localObject2 instanceof CharSequence;
        if (bool)
        {
          localObject1 = localObject2.toString();
          localObject2 = Boolean.valueOf((String)localObject1);
        }
        else
        {
          localObject1 = "ContentValues";
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Cannot cast value for ").append(paramString);
          String str = " to a Boolean";
          localObject3 = str;
          Log.e((String)localObject1, (String)localObject3);
          localObject2 = null;
        }
      }
    }
    return (Boolean)localObject2;
  }
  
  public Byte getAsByte(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        b = ((Number)localObject4).byteValue();
        localObject2 = Byte.valueOf(b);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        byte b;
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Byte.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Byte value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Byte";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Byte)localObject1;
      b = 0;
      localObject2 = null;
    }
  }
  
  public byte[] getAsByteArray(String paramString)
  {
    HashMap localHashMap = this.mValues;
    Object localObject = localHashMap.get(paramString);
    boolean bool = localObject instanceof byte[];
    if (bool) {}
    for (localObject = (byte[])localObject;; localObject = null) {
      return (byte[])localObject;
    }
  }
  
  public Double getAsDouble(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        double d = ((Number)localObject4).doubleValue();
        localObject2 = Double.valueOf(d);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Double.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Double value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Double";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Double)localObject1;
      bool = false;
      localObject2 = null;
    }
  }
  
  public Float getAsFloat(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        f = ((Number)localObject4).floatValue();
        localObject2 = Float.valueOf(f);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        float f;
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Float.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Float value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Float";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Float)localObject1;
      bool = false;
      localObject2 = null;
      f = 0.0F;
    }
  }
  
  public Integer getAsInteger(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        i = ((Number)localObject4).intValue();
        localObject2 = Integer.valueOf(i);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        int i;
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Integer.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Integer value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Integer";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Integer)localObject1;
      i = 0;
      localObject2 = null;
    }
  }
  
  public Long getAsLong(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        long l = ((Number)localObject4).longValue();
        localObject2 = Long.valueOf(l);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Long.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Long value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Long";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Long)localObject1;
      bool = false;
      localObject2 = null;
    }
  }
  
  public Short getAsShort(String paramString)
  {
    localObject1 = null;
    localObject2 = this.mValues;
    localObject3 = ((HashMap)localObject2).get(paramString);
    Object localObject4;
    if (localObject3 != null) {
      localObject4 = localObject3;
    }
    for (;;)
    {
      try
      {
        localObject4 = (Number)localObject3;
        localObject2 = localObject4;
        s = ((Number)localObject4).shortValue();
        localObject2 = Short.valueOf(s);
        localObject1 = localObject2;
      }
      catch (ClassCastException localClassCastException)
      {
        short s;
        boolean bool = localObject3 instanceof CharSequence;
        if (!bool) {
          continue;
        }
        try
        {
          localObject2 = localObject3.toString();
          localObject1 = Short.valueOf((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject2 = "ContentValues";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Cannot parse Short value for ").append(localObject3);
          str = " at key ";
          localObject5 = str + paramString;
          Log.e((String)localObject2, (String)localObject5);
        }
        continue;
        localObject2 = "ContentValues";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Cannot cast value for ").append(paramString);
        String str = " to a Short";
        localObject5 = str;
        Log.e((String)localObject2, (String)localObject5);
        continue;
      }
      return (Short)localObject1;
      s = 0;
      localObject2 = null;
    }
  }
  
  public String getAsString(String paramString)
  {
    Object localObject1 = this.mValues;
    Object localObject2 = ((HashMap)localObject1).get(paramString);
    if (localObject2 != null) {}
    for (localObject1 = this.mValues.get(paramString).toString();; localObject1 = null) {
      return (String)localObject1;
    }
  }
  
  public ArrayList getStringArrayList(String paramString)
  {
    return (ArrayList)this.mValues.get(paramString);
  }
  
  public int hashCode()
  {
    return this.mValues.hashCode();
  }
  
  public void put(String paramString, Boolean paramBoolean)
  {
    this.mValues.put(paramString, paramBoolean);
  }
  
  public void put(String paramString, Byte paramByte)
  {
    this.mValues.put(paramString, paramByte);
  }
  
  public void put(String paramString, Double paramDouble)
  {
    this.mValues.put(paramString, paramDouble);
  }
  
  public void put(String paramString, Float paramFloat)
  {
    this.mValues.put(paramString, paramFloat);
  }
  
  public void put(String paramString, Integer paramInteger)
  {
    this.mValues.put(paramString, paramInteger);
  }
  
  public void put(String paramString, Long paramLong)
  {
    this.mValues.put(paramString, paramLong);
  }
  
  public void put(String paramString, Short paramShort)
  {
    this.mValues.put(paramString, paramShort);
  }
  
  public void put(String paramString1, String paramString2)
  {
    this.mValues.put(paramString1, paramString2);
  }
  
  public void put(String paramString, byte[] paramArrayOfByte)
  {
    this.mValues.put(paramString, paramArrayOfByte);
  }
  
  public void putAll(ContentValues paramContentValues)
  {
    HashMap localHashMap1 = this.mValues;
    HashMap localHashMap2 = paramContentValues.mValues;
    localHashMap1.putAll(localHashMap2);
  }
  
  public void putNull(String paramString)
  {
    this.mValues.put(paramString, null);
  }
  
  public void putStringArrayList(String paramString, ArrayList paramArrayList)
  {
    this.mValues.put(paramString, paramArrayList);
  }
  
  public void remove(String paramString)
  {
    this.mValues.remove(paramString);
  }
  
  public int size()
  {
    return this.mValues.size();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.mValues.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str1 = (String)localIterator.next();
      String str2 = getAsString(str1);
      int i = localStringBuilder.length();
      if (i > 0)
      {
        localObject = " ";
        localStringBuilder.append((String)localObject);
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(str1);
      String str3 = "=";
      localObject = str3 + str2;
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public Set valueSet()
  {
    return this.mValues.entrySet();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/content/ContentValues.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */