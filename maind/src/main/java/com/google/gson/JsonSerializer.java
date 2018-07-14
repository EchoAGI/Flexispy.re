package com.google.gson;

import java.lang.reflect.Type;

public abstract interface JsonSerializer
{
  public abstract JsonElement serialize(Object paramObject, Type paramType, JsonSerializationContext paramJsonSerializationContext);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/JsonSerializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */