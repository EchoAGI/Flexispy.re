package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class MapTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final ObjectConstructor constructor;
  private final TypeAdapter keyTypeAdapter;
  private final TypeAdapter valueTypeAdapter;
  
  public MapTypeAdapterFactory$Adapter(MapTypeAdapterFactory paramMapTypeAdapterFactory, Gson paramGson, Type paramType1, TypeAdapter paramTypeAdapter1, Type paramType2, TypeAdapter paramTypeAdapter2, ObjectConstructor paramObjectConstructor)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter1, paramType1);
    this.keyTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter2, paramType2);
    this.valueTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.constructor = paramObjectConstructor;
  }
  
  private String keyToString(JsonElement paramJsonElement)
  {
    boolean bool = paramJsonElement.isJsonPrimitive();
    JsonPrimitive localJsonPrimitive;
    if (bool)
    {
      localJsonPrimitive = paramJsonElement.getAsJsonPrimitive();
      bool = localJsonPrimitive.isNumber();
      if (bool) {
        localObject = String.valueOf(localJsonPrimitive.getAsNumber());
      }
    }
    for (;;)
    {
      return (String)localObject;
      bool = localJsonPrimitive.isBoolean();
      if (bool)
      {
        bool = localJsonPrimitive.getAsBoolean();
        localObject = Boolean.toString(bool);
      }
      else
      {
        bool = localJsonPrimitive.isString();
        if (bool)
        {
          localObject = localJsonPrimitive.getAsString();
        }
        else
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
          bool = paramJsonElement.isJsonNull();
          if (!bool) {
            break;
          }
          localObject = "null";
        }
      }
    }
    Object localObject = new java/lang/AssertionError;
    ((AssertionError)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public Map read(JsonReader paramJsonReader)
  {
    JsonToken localJsonToken = paramJsonReader.peek();
    Object localObject1 = JsonToken.NULL;
    Map localMap;
    if (localJsonToken == localObject1)
    {
      paramJsonReader.nextNull();
      localMap = null;
    }
    for (;;)
    {
      return localMap;
      localMap = (Map)this.constructor.construct();
      localObject1 = JsonToken.BEGIN_ARRAY;
      boolean bool;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      if (localJsonToken == localObject1)
      {
        paramJsonReader.beginArray();
        for (;;)
        {
          bool = paramJsonReader.hasNext();
          if (!bool) {
            break;
          }
          paramJsonReader.beginArray();
          localObject2 = this.keyTypeAdapter.read(paramJsonReader);
          localObject1 = this.valueTypeAdapter;
          localObject3 = ((TypeAdapter)localObject1).read(paramJsonReader);
          localObject4 = localMap.put(localObject2, localObject3);
          if (localObject4 != null)
          {
            localObject1 = new com/google/gson/JsonSyntaxException;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = "duplicate key: " + localObject2;
            ((JsonSyntaxException)localObject1).<init>((String)localObject5);
            throw ((Throwable)localObject1);
          }
          paramJsonReader.endArray();
        }
        paramJsonReader.endArray();
      }
      else
      {
        paramJsonReader.beginObject();
        do
        {
          bool = paramJsonReader.hasNext();
          if (!bool) {
            break;
          }
          JsonReaderInternalAccess.INSTANCE.promoteNameToValue(paramJsonReader);
          localObject2 = this.keyTypeAdapter.read(paramJsonReader);
          localObject1 = this.valueTypeAdapter;
          localObject3 = ((TypeAdapter)localObject1).read(paramJsonReader);
          localObject4 = localMap.put(localObject2, localObject3);
        } while (localObject4 == null);
        localObject1 = new com/google/gson/JsonSyntaxException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = "duplicate key: " + localObject2;
        ((JsonSyntaxException)localObject1).<init>((String)localObject5);
        throw ((Throwable)localObject1);
        paramJsonReader.endObject();
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Map paramMap)
  {
    if (paramMap == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      Object localObject1 = this.this$0;
      boolean bool1 = ((MapTypeAdapterFactory)localObject1).complexMapKeySerialization;
      Map.Entry localEntry;
      Object localObject2;
      Object localObject3;
      if (!bool1)
      {
        paramJsonWriter.beginObject();
        localObject1 = paramMap.entrySet().iterator();
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject1).hasNext();
          if (!bool3) {
            break;
          }
          localEntry = (Map.Entry)((Iterator)localObject1).next();
          localObject2 = String.valueOf(localEntry.getKey());
          paramJsonWriter.name((String)localObject2);
          localObject2 = this.valueTypeAdapter;
          localObject3 = localEntry.getValue();
          ((TypeAdapter)localObject2).write(paramJsonWriter, localObject3);
        }
        paramJsonWriter.endObject();
      }
      else
      {
        boolean bool4 = false;
        ArrayList localArrayList1 = new java/util/ArrayList;
        int i = paramMap.size();
        localArrayList1.<init>(i);
        ArrayList localArrayList2 = new java/util/ArrayList;
        i = paramMap.size();
        localArrayList2.<init>(i);
        localObject1 = paramMap.entrySet();
        localObject2 = ((Set)localObject1).iterator();
        boolean bool2 = ((Iterator)localObject2).hasNext();
        JsonElement localJsonElement;
        if (bool2)
        {
          localEntry = (Map.Entry)((Iterator)localObject2).next();
          localObject1 = this.keyTypeAdapter;
          localObject3 = localEntry.getKey();
          localJsonElement = ((TypeAdapter)localObject1).toJsonTree(localObject3);
          localArrayList1.add(localJsonElement);
          localObject1 = localEntry.getValue();
          localArrayList2.add(localObject1);
          bool2 = localJsonElement.isJsonArray();
          if (!bool2)
          {
            bool2 = localJsonElement.isJsonObject();
            if (!bool2) {}
          }
          else
          {
            bool2 = true;
          }
          for (;;)
          {
            bool4 |= bool2;
            break;
            bool2 = false;
            localObject1 = null;
          }
        }
        int k;
        int j;
        if (bool4)
        {
          paramJsonWriter.beginArray();
          k = 0;
          for (;;)
          {
            j = localArrayList1.size();
            if (k >= j) {
              break;
            }
            paramJsonWriter.beginArray();
            Streams.write((JsonElement)localArrayList1.get(k), paramJsonWriter);
            localObject1 = this.valueTypeAdapter;
            localObject2 = localArrayList2.get(k);
            ((TypeAdapter)localObject1).write(paramJsonWriter, localObject2);
            paramJsonWriter.endArray();
            k += 1;
          }
          paramJsonWriter.endArray();
        }
        else
        {
          paramJsonWriter.beginObject();
          k = 0;
          for (;;)
          {
            j = localArrayList1.size();
            if (k >= j) {
              break;
            }
            localJsonElement = (JsonElement)localArrayList1.get(k);
            localObject1 = keyToString(localJsonElement);
            paramJsonWriter.name((String)localObject1);
            localObject1 = this.valueTypeAdapter;
            localObject2 = localArrayList2.get(k);
            ((TypeAdapter)localObject1).write(paramJsonWriter, localObject2);
            k += 1;
          }
          paramJsonWriter.endObject();
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */