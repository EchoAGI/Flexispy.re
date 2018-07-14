package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;

public final class TreeTypeAdapter
  extends TypeAdapter
{
  private final TreeTypeAdapter.GsonContextImpl context;
  private TypeAdapter delegate;
  private final JsonDeserializer deserializer;
  private final Gson gson;
  private final JsonSerializer serializer;
  private final TypeAdapterFactory skipPast;
  private final TypeToken typeToken;
  
  public TreeTypeAdapter(JsonSerializer paramJsonSerializer, JsonDeserializer paramJsonDeserializer, Gson paramGson, TypeToken paramTypeToken, TypeAdapterFactory paramTypeAdapterFactory)
  {
    TreeTypeAdapter.GsonContextImpl localGsonContextImpl = new com/google/gson/internal/bind/TreeTypeAdapter$GsonContextImpl;
    localGsonContextImpl.<init>(this, null);
    this.context = localGsonContextImpl;
    this.serializer = paramJsonSerializer;
    this.deserializer = paramJsonDeserializer;
    this.gson = paramGson;
    this.typeToken = paramTypeToken;
    this.skipPast = paramTypeAdapterFactory;
  }
  
  private TypeAdapter delegate()
  {
    TypeAdapter localTypeAdapter = this.delegate;
    if (localTypeAdapter != null) {}
    for (;;)
    {
      return localTypeAdapter;
      Gson localGson = this.gson;
      TypeAdapterFactory localTypeAdapterFactory = this.skipPast;
      TypeToken localTypeToken = this.typeToken;
      localTypeAdapter = localGson.getDelegateAdapter(localTypeAdapterFactory, localTypeToken);
      this.delegate = localTypeAdapter;
    }
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, Object paramObject)
  {
    TreeTypeAdapter.SingleTypeFactory localSingleTypeFactory = new com/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
    localSingleTypeFactory.<init>(paramObject, paramTypeToken, false, null);
    return localSingleTypeFactory;
  }
  
  public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken paramTypeToken, Object paramObject)
  {
    Object localObject = paramTypeToken.getType();
    Class localClass = paramTypeToken.getRawType();
    if (localObject == localClass) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new com/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
      ((TreeTypeAdapter.SingleTypeFactory)localObject).<init>(paramObject, paramTypeToken, bool, null);
      return (TypeAdapterFactory)localObject;
    }
  }
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, Object paramObject)
  {
    TreeTypeAdapter.SingleTypeFactory localSingleTypeFactory = new com/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
    localSingleTypeFactory.<init>(paramObject, null, false, paramClass);
    return localSingleTypeFactory;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject = this.deserializer;
    if (localObject == null) {
      localObject = delegate().read(paramJsonReader);
    }
    for (;;)
    {
      return localObject;
      JsonElement localJsonElement = Streams.parse(paramJsonReader);
      boolean bool = localJsonElement.isJsonNull();
      if (bool)
      {
        bool = false;
        localObject = null;
      }
      else
      {
        localObject = this.deserializer;
        Type localType = this.typeToken.getType();
        TreeTypeAdapter.GsonContextImpl localGsonContextImpl = this.context;
        localObject = ((JsonDeserializer)localObject).deserialize(localJsonElement, localType, localGsonContextImpl);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject = this.serializer;
    if (localObject == null)
    {
      localObject = delegate();
      ((TypeAdapter)localObject).write(paramJsonWriter, paramObject);
    }
    for (;;)
    {
      return;
      if (paramObject == null)
      {
        paramJsonWriter.nullValue();
      }
      else
      {
        localObject = this.serializer;
        Type localType = this.typeToken.getType();
        TreeTypeAdapter.GsonContextImpl localGsonContextImpl = this.context;
        JsonElement localJsonElement = ((JsonSerializer)localObject).serialize(paramObject, localType, localGsonContextImpl);
        Streams.write(localJsonElement, paramJsonWriter);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TreeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */