package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson$2
  extends TypeAdapter
{
  Gson$2(Gson paramGson) {}
  
  public Double read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    double d;
    for (localObject = null;; localObject = Double.valueOf(d))
    {
      return (Double)localObject;
      d = paramJsonReader.nextDouble();
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
      double d = paramNumber.doubleValue();
      Gson.checkValidFloatingPoint(d);
      paramJsonWriter.value(paramNumber);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/Gson$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */