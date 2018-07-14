package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;

final class Gson$6
  extends TypeAdapter
{
  Gson$6(TypeAdapter paramTypeAdapter) {}
  
  public AtomicLongArray read(JsonReader paramJsonReader)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramJsonReader.beginArray();
    Long localLong;
    for (;;)
    {
      boolean bool = paramJsonReader.hasNext();
      if (!bool) {
        break;
      }
      long l1 = ((Number)this.val$longAdapter.read(paramJsonReader)).longValue();
      localLong = Long.valueOf(l1);
      localArrayList.add(localLong);
    }
    paramJsonReader.endArray();
    int i = localArrayList.size();
    AtomicLongArray localAtomicLongArray = new java/util/concurrent/atomic/AtomicLongArray;
    localAtomicLongArray.<init>(i);
    int j = 0;
    while (j < i)
    {
      localLong = (Long)localArrayList.get(j);
      long l2 = localLong.longValue();
      localAtomicLongArray.set(j, l2);
      j += 1;
    }
    return localAtomicLongArray;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicLongArray paramAtomicLongArray)
  {
    paramJsonWriter.beginArray();
    int i = 0;
    int j = paramAtomicLongArray.length();
    while (i < j)
    {
      TypeAdapter localTypeAdapter = this.val$longAdapter;
      long l = paramAtomicLongArray.get(i);
      Long localLong = Long.valueOf(l);
      localTypeAdapter.write(paramJsonWriter, localLong);
      i += 1;
    }
    paramJsonWriter.endArray();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/Gson$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */