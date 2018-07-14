package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class TypeAdapters$EnumTypeAdapter
  extends TypeAdapter
{
  private final Map constantToName;
  private final Map nameToConstant;
  
  public TypeAdapters$EnumTypeAdapter(Class paramClass)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.nameToConstant = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.constantToName = ((Map)localObject1);
    try
    {
      localObject1 = paramClass.getEnumConstants();
      localObject1 = (Enum[])localObject1;
      int i = localObject1.length;
      int m;
      for (int j = 0; j < i; j = m)
      {
        Object localObject2 = localObject1[j];
        String str = ((Enum)localObject2).name();
        Object localObject3 = paramClass.getField(str);
        Object localObject4 = SerializedName.class;
        Object localObject5 = ((Field)localObject3).getAnnotation((Class)localObject4);
        localObject5 = (SerializedName)localObject5;
        if (localObject5 != null)
        {
          str = ((SerializedName)localObject5).value();
          localObject4 = ((SerializedName)localObject5).alternate();
          int k = localObject4.length;
          m = 0;
          localObject3 = null;
          while (m < k)
          {
            Object localObject6 = localObject4[m];
            Map localMap = this.nameToConstant;
            localMap.put(localObject6, localObject2);
            m += 1;
          }
        }
        localObject3 = this.nameToConstant;
        ((Map)localObject3).put(str, localObject2);
        localObject3 = this.constantToName;
        ((Map)localObject3).put(localObject2, str);
        m = j + 1;
      }
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localObject1 = new java/lang/AssertionError;
      ((AssertionError)localObject1).<init>(localNoSuchFieldException);
      throw ((Throwable)localObject1);
    }
  }
  
  public Enum read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2) {
      paramJsonReader.nextNull();
    }
    for (localObject1 = null;; localObject1 = (Enum)((Map)localObject1).get(localObject2))
    {
      return (Enum)localObject1;
      localObject1 = this.nameToConstant;
      localObject2 = paramJsonReader.nextString();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Enum paramEnum)
  {
    if (paramEnum == null) {}
    for (String str = null;; str = (String)this.constantToName.get(paramEnum))
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */