package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$4
  extends TypeAdapter
{
  public Boolean read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    for (localObject = null;; localObject = Boolean.valueOf(paramJsonReader.nextString())) {
      return (Boolean)localObject;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Boolean paramBoolean)
  {
    if (paramBoolean == null) {}
    for (String str = "null";; str = paramBoolean.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */