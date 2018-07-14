package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class TypeAdapters$29
  extends TypeAdapter
{
  public JsonElement read(JsonReader paramJsonReader)
  {
    Object localObject1 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
    Object localObject2 = paramJsonReader.peek();
    int i = ((JsonToken)localObject2).ordinal();
    int j = localObject1[i];
    Object localObject3;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 3: 
      localObject3 = new com/google/gson/JsonPrimitive;
      localObject1 = paramJsonReader.nextString();
      ((JsonPrimitive)localObject3).<init>((String)localObject1);
    }
    for (;;)
    {
      return (JsonElement)localObject3;
      String str = paramJsonReader.nextString();
      localObject3 = new com/google/gson/JsonPrimitive;
      localObject1 = new com/google/gson/internal/LazilyParsedNumber;
      ((LazilyParsedNumber)localObject1).<init>(str);
      ((JsonPrimitive)localObject3).<init>((Number)localObject1);
      continue;
      localObject3 = new com/google/gson/JsonPrimitive;
      boolean bool = paramJsonReader.nextBoolean();
      localObject1 = Boolean.valueOf(bool);
      ((JsonPrimitive)localObject3).<init>((Boolean)localObject1);
      continue;
      paramJsonReader.nextNull();
      localObject3 = JsonNull.INSTANCE;
      continue;
      localObject3 = new com/google/gson/JsonArray;
      ((JsonArray)localObject3).<init>();
      paramJsonReader.beginArray();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = read(paramJsonReader);
        ((JsonArray)localObject3).add((JsonElement)localObject1);
      }
      paramJsonReader.endArray();
      continue;
      JsonObject localJsonObject = new com/google/gson/JsonObject;
      localJsonObject.<init>();
      paramJsonReader.beginObject();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = paramJsonReader.nextName();
        localObject2 = read(paramJsonReader);
        localJsonObject.add((String)localObject1, (JsonElement)localObject2);
      }
      paramJsonReader.endObject();
      localObject3 = localJsonObject;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, JsonElement paramJsonElement)
  {
    boolean bool1;
    if (paramJsonElement != null)
    {
      bool1 = paramJsonElement.isJsonNull();
      if (!bool1) {}
    }
    else
    {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      bool1 = paramJsonElement.isJsonPrimitive();
      if (bool1)
      {
        JsonPrimitive localJsonPrimitive = paramJsonElement.getAsJsonPrimitive();
        bool1 = localJsonPrimitive.isNumber();
        if (bool1)
        {
          localObject1 = localJsonPrimitive.getAsNumber();
          paramJsonWriter.value((Number)localObject1);
        }
        else
        {
          bool1 = localJsonPrimitive.isBoolean();
          if (bool1)
          {
            bool1 = localJsonPrimitive.getAsBoolean();
            paramJsonWriter.value(bool1);
          }
          else
          {
            localObject1 = localJsonPrimitive.getAsString();
            paramJsonWriter.value((String)localObject1);
          }
        }
      }
      else
      {
        bool1 = paramJsonElement.isJsonArray();
        if (bool1)
        {
          paramJsonWriter.beginArray();
          localObject1 = paramJsonElement.getAsJsonArray().iterator();
          for (;;)
          {
            boolean bool2 = ((Iterator)localObject1).hasNext();
            if (!bool2) {
              break;
            }
            JsonElement localJsonElement = (JsonElement)((Iterator)localObject1).next();
            write(paramJsonWriter, localJsonElement);
          }
          paramJsonWriter.endArray();
        }
        else
        {
          bool1 = paramJsonElement.isJsonObject();
          if (!bool1) {
            break;
          }
          paramJsonWriter.beginObject();
          localObject1 = paramJsonElement.getAsJsonObject().entrySet();
          localObject2 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
            localObject1 = (String)localEntry.getKey();
            paramJsonWriter.name((String)localObject1);
            localObject1 = (JsonElement)localEntry.getValue();
            write(paramJsonWriter, (JsonElement)localObject1);
          }
          paramJsonWriter.endObject();
        }
      }
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Couldn't write ");
    Class localClass = paramJsonElement.getClass();
    localObject2 = localClass;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$29.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */