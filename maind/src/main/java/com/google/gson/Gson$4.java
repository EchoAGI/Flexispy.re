package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class Gson$4
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    long l;
    for (localObject = null;; localObject = Long.valueOf(l))
    {
      return (Number)localObject;
      l = paramJsonReader.nextLong();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    if (paramNumber == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      String str = paramNumber.toString();
      paramJsonWriter.value(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/Gson$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */