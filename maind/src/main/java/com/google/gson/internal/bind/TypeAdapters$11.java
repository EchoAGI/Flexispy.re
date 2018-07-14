package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$11
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      localObject = null;
    }
    for (;;)
    {
      return (Number)localObject;
      try
      {
        long l = paramJsonReader.nextLong();
        localObject = Long.valueOf(l);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject = new com/google/gson/JsonSyntaxException;
        ((JsonSyntaxException)localObject).<init>(localNumberFormatException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    paramJsonWriter.value(paramNumber);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */