package com.google.gson.internal;

import com.google.gson.stream.JsonReader;

public abstract class JsonReaderInternalAccess
{
  public static JsonReaderInternalAccess INSTANCE;
  
  public abstract void promoteNameToValue(JsonReader paramJsonReader);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/JsonReaderInternalAccess.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */