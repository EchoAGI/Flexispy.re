package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicInteger;

final class TypeAdapters$8
  extends TypeAdapter
{
  public AtomicInteger read(JsonReader paramJsonReader)
  {
    try
    {
      localObject = new java/util/concurrent/atomic/AtomicInteger;
      int i = paramJsonReader.nextInt();
      ((AtomicInteger)localObject).<init>(i);
      return (AtomicInteger)localObject;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(localNumberFormatException);
      throw ((Throwable)localObject);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicInteger paramAtomicInteger)
  {
    long l = paramAtomicInteger.get();
    paramJsonWriter.value(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */