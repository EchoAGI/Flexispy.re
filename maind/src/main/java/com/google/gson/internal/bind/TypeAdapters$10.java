package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class TypeAdapters$10
  extends TypeAdapter
{
  public AtomicIntegerArray read(JsonReader paramJsonReader)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramJsonReader.beginArray();
    Object localObject;
    for (;;)
    {
      boolean bool = paramJsonReader.hasNext();
      if (bool) {
        try
        {
          int j = paramJsonReader.nextInt();
          localObject = Integer.valueOf(j);
          localArrayList.add(localObject);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject = new com/google/gson/JsonSyntaxException;
          ((JsonSyntaxException)localObject).<init>(localNumberFormatException);
          throw ((Throwable)localObject);
        }
      }
    }
    paramJsonReader.endArray();
    int k = localArrayList.size();
    AtomicIntegerArray localAtomicIntegerArray = new java/util/concurrent/atomic/AtomicIntegerArray;
    localAtomicIntegerArray.<init>(k);
    int m = 0;
    while (m < k)
    {
      localObject = (Integer)localArrayList.get(m);
      int i = ((Integer)localObject).intValue();
      localAtomicIntegerArray.set(m, i);
      m += 1;
    }
    return localAtomicIntegerArray;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicIntegerArray paramAtomicIntegerArray)
  {
    paramJsonWriter.beginArray();
    int i = 0;
    int j = paramAtomicIntegerArray.length();
    while (i < j)
    {
      int k = paramAtomicIntegerArray.get(i);
      long l = k;
      paramJsonWriter.value(l);
      i += 1;
    }
    paramJsonWriter.endArray();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */