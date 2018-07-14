package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class CollectionTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final ObjectConstructor constructor;
  private final TypeAdapter elementTypeAdapter;
  
  public CollectionTypeAdapterFactory$Adapter(Gson paramGson, Type paramType, TypeAdapter paramTypeAdapter, ObjectConstructor paramObjectConstructor)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter, paramType);
    this.elementTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.constructor = paramObjectConstructor;
  }
  
  public Collection read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    Collection localCollection;
    if (localObject1 == localJsonToken)
    {
      paramJsonReader.nextNull();
      localCollection = null;
    }
    for (;;)
    {
      return localCollection;
      localObject1 = this.constructor;
      localCollection = (Collection)((ObjectConstructor)localObject1).construct();
      paramJsonReader.beginArray();
      for (;;)
      {
        boolean bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = this.elementTypeAdapter;
        Object localObject2 = ((TypeAdapter)localObject1).read(paramJsonReader);
        localCollection.add(localObject2);
      }
      paramJsonReader.endArray();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Collection paramCollection)
  {
    if (paramCollection == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      Iterator localIterator = paramCollection.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject = localIterator.next();
        TypeAdapter localTypeAdapter = this.elementTypeAdapter;
        localTypeAdapter.write(paramJsonWriter, localObject);
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */