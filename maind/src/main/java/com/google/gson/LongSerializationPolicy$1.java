package com.google.gson;

 enum LongSerializationPolicy$1
{
  LongSerializationPolicy$1()
  {
    super(paramString, paramInt, null);
  }
  
  public JsonElement serialize(Long paramLong)
  {
    JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
    localJsonPrimitive.<init>(paramLong);
    return localJsonPrimitive;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/LongSerializationPolicy$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */