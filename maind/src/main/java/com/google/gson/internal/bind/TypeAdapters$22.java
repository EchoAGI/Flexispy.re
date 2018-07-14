package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URI;
import java.net.URISyntaxException;

final class TypeAdapters$22
  extends TypeAdapter
{
  public URI read(JsonReader paramJsonReader)
  {
    Object localObject1 = null;
    Object localObject2 = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject2 == localJsonToken) {
      paramJsonReader.nextNull();
    }
    for (;;)
    {
      return (URI)localObject1;
      try
      {
        String str = paramJsonReader.nextString();
        localObject2 = "null";
        boolean bool = ((String)localObject2).equals(str);
        if (bool) {
          continue;
        }
        localObject1 = new java/net/URI;
        ((URI)localObject1).<init>(str);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        localObject1 = new com/google/gson/JsonIOException;
        ((JsonIOException)localObject1).<init>(localURISyntaxException);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, URI paramURI)
  {
    if (paramURI == null) {}
    for (String str = null;; str = paramURI.toASCIIString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$22.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */