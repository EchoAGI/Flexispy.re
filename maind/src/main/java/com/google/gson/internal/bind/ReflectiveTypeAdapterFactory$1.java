package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

class ReflectiveTypeAdapterFactory$1
  extends ReflectiveTypeAdapterFactory.BoundField
{
  ReflectiveTypeAdapterFactory$1(ReflectiveTypeAdapterFactory paramReflectiveTypeAdapterFactory, String paramString, boolean paramBoolean1, boolean paramBoolean2, Field paramField, boolean paramBoolean3, TypeAdapter paramTypeAdapter, Gson paramGson, TypeToken paramTypeToken, boolean paramBoolean4)
  {
    super(paramString, paramBoolean1, paramBoolean2);
  }
  
  void read(JsonReader paramJsonReader, Object paramObject)
  {
    Object localObject1 = this.val$typeAdapter;
    Object localObject2 = ((TypeAdapter)localObject1).read(paramJsonReader);
    if (localObject2 == null)
    {
      boolean bool = this.val$isPrimitive;
      if (bool) {}
    }
    else
    {
      localObject1 = this.val$field;
      ((Field)localObject1).set(paramObject, localObject2);
    }
  }
  
  void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject1 = this.val$field;
    Object localObject2 = ((Field)localObject1).get(paramObject);
    boolean bool = this.val$jsonAdapterPresent;
    Object localObject3;
    if (bool) {
      localObject3 = this.val$typeAdapter;
    }
    for (;;)
    {
      ((TypeAdapter)localObject3).write(paramJsonWriter, localObject2);
      return;
      localObject3 = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
      localObject1 = this.val$context;
      TypeAdapter localTypeAdapter = this.val$typeAdapter;
      Type localType = this.val$fieldType.getType();
      ((TypeAdapterRuntimeTypeWrapper)localObject3).<init>((Gson)localObject1, localTypeAdapter, localType);
    }
  }
  
  public boolean writeField(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = this.serialized;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Field localField = this.val$field;
      Object localObject = localField.get(paramObject);
      if (localObject != paramObject) {
        bool1 = true;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */