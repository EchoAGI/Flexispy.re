package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URL;

final class TypeAdapters$21
  extends TypeAdapter
{
  public URL read(JsonReader paramJsonReader)
  {
    URL localURL = null;
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    for (;;)
    {
      return localURL;
      String str = paramJsonReader.nextString();
      localObject = "null";
      boolean bool = ((String)localObject).equals(str);
      if (!bool)
      {
        localURL = new java/net/URL;
        localURL.<init>(str);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, URL paramURL)
  {
    if (paramURL == null) {}
    for (String str = null;; str = paramURL.toExternalForm())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */