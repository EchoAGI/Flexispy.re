package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson$3
  extends TypeAdapter
{
  Gson$3(Gson paramGson) {}
  
  public Float read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    float f;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      f = 0.0F;
    }
    for (localObject = null;; localObject = Float.valueOf(f))
    {
      return (Float)localObject;
      double d = paramJsonReader.nextDouble();
      f = (float)d;
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
      float f = paramNumber.floatValue();
      double d = f;
      Gson.checkValidFloatingPoint(d);
      paramJsonWriter.value(paramNumber);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/Gson$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */