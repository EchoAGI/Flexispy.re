package com.google.gson;

import java.lang.reflect.Type;

public abstract interface JsonDeserializationContext
{
  public abstract Object deserialize(JsonElement paramJsonElement, Type paramType);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/JsonDeserializationContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */