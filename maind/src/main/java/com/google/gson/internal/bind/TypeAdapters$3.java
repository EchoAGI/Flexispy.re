package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$3
  extends TypeAdapter
{
  public Boolean read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    boolean bool;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (Boolean)localObject;
      localObject = paramJsonReader.peek();
      localJsonToken = JsonToken.STRING;
      if (localObject == localJsonToken)
      {
        bool = Boolean.parseBoolean(paramJsonReader.nextString());
        localObject = Boolean.valueOf(bool);
      }
      else
      {
        bool = paramJsonReader.nextBoolean();
        localObject = Boolean.valueOf(bool);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Boolean paramBoolean)
  {
    paramJsonWriter.value(paramBoolean);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */