package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final Gson gson;
  
  static
  {
    ObjectTypeAdapter.1 local1 = new com/google/gson/internal/bind/ObjectTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  ObjectTypeAdapter(Gson paramGson)
  {
    this.gson = paramGson;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    JsonToken localJsonToken = paramJsonReader.peek();
    Object localObject1 = ObjectTypeAdapter.2.$SwitchMap$com$google$gson$stream$JsonToken;
    int i = localJsonToken.ordinal();
    int j = localObject1[i];
    Object localObject2;
    boolean bool;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 1: 
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      paramJsonReader.beginArray();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = read(paramJsonReader);
        ((List)localObject2).add(localObject1);
      }
      paramJsonReader.endArray();
    }
    for (;;)
    {
      return localObject2;
      LinkedTreeMap localLinkedTreeMap = new com/google/gson/internal/LinkedTreeMap;
      localLinkedTreeMap.<init>();
      paramJsonReader.beginObject();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = paramJsonReader.nextName();
        Object localObject3 = read(paramJsonReader);
        localLinkedTreeMap.put(localObject1, localObject3);
      }
      paramJsonReader.endObject();
      localObject2 = localLinkedTreeMap;
      continue;
      localObject2 = paramJsonReader.nextString();
      continue;
      double d = paramJsonReader.nextDouble();
      localObject2 = Double.valueOf(d);
      continue;
      bool = paramJsonReader.nextBoolean();
      localObject2 = Boolean.valueOf(bool);
      continue;
      paramJsonReader.nextNull();
      localObject2 = null;
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
      Gson localGson = this.gson;
      Class localClass = paramObject.getClass();
      TypeAdapter localTypeAdapter = localGson.getAdapter(localClass);
      boolean bool = localTypeAdapter instanceof ObjectTypeAdapter;
      if (bool)
      {
        paramJsonWriter.beginObject();
        paramJsonWriter.endObject();
      }
      else
      {
        localTypeAdapter.write(paramJsonWriter, paramObject);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ObjectTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */