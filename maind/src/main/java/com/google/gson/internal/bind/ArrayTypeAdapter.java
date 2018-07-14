package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class ArrayTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final Class componentType;
  private final TypeAdapter componentTypeAdapter;
  
  static
  {
    ArrayTypeAdapter.1 local1 = new com/google/gson/internal/bind/ArrayTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public ArrayTypeAdapter(Gson paramGson, TypeAdapter paramTypeAdapter, Class paramClass)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter, paramClass);
    this.componentTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.componentType = paramClass;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject1 == localJsonToken)
    {
      paramJsonReader.nextNull();
      localObject2 = null;
      return localObject2;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramJsonReader.beginArray();
    for (;;)
    {
      boolean bool = paramJsonReader.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = this.componentTypeAdapter;
      Object localObject3 = ((TypeAdapter)localObject1).read(paramJsonReader);
      localArrayList.add(localObject3);
    }
    paramJsonReader.endArray();
    localObject1 = this.componentType;
    int j = localArrayList.size();
    Object localObject2 = Array.newInstance((Class)localObject1, j);
    int k = 0;
    for (;;)
    {
      int i = localArrayList.size();
      if (k >= i) {
        break;
      }
      localObject1 = localArrayList.get(k);
      Array.set(localObject2, k, localObject1);
      k += 1;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      int i = 0;
      int j = Array.getLength(paramObject);
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        TypeAdapter localTypeAdapter = this.componentTypeAdapter;
        localTypeAdapter.write(paramJsonWriter, localObject);
        i += 1;
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ArrayTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */