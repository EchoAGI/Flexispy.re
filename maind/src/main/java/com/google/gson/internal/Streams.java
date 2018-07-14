package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams
{
  private Streams()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static JsonElement parse(JsonReader paramJsonReader)
  {
    i = 1;
    try
    {
      paramJsonReader.peek();
      i = 0;
      localObject = TypeAdapters.JSON_ELEMENT;
      localObject = ((TypeAdapter)localObject).read(paramJsonReader);
      localObject = (JsonElement)localObject;
    }
    catch (EOFException localEOFException)
    {
      while (i != 0) {
        localObject = JsonNull.INSTANCE;
      }
      localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(localEOFException);
      throw ((Throwable)localObject);
    }
    catch (MalformedJsonException localMalformedJsonException)
    {
      localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(localMalformedJsonException);
      throw ((Throwable)localObject);
    }
    catch (IOException localIOException)
    {
      localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(localNumberFormatException);
      throw ((Throwable)localObject);
    }
    return (JsonElement)localObject;
  }
  
  public static void write(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    TypeAdapters.JSON_ELEMENT.write(paramJsonWriter, paramJsonElement);
  }
  
  public static Writer writerForAppendable(Appendable paramAppendable)
  {
    boolean bool = paramAppendable instanceof Writer;
    if (bool) {}
    Streams.AppendableWriter localAppendableWriter;
    for (paramAppendable = (Writer)paramAppendable;; paramAppendable = localAppendableWriter)
    {
      return paramAppendable;
      localAppendableWriter = new com/google/gson/internal/Streams$AppendableWriter;
      localAppendableWriter.<init>(paramAppendable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/Streams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */