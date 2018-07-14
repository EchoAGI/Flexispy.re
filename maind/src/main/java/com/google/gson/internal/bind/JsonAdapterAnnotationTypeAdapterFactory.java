package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  
  public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor)
  {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Class localClass = paramTypeToken.getRawType();
    Object localObject = JsonAdapter.class;
    JsonAdapter localJsonAdapter = (JsonAdapter)localClass.getAnnotation((Class)localObject);
    if (localJsonAdapter == null) {}
    for (localObject = null;; localObject = getTypeAdapter((ConstructorConstructor)localObject, paramGson, paramTypeToken, localJsonAdapter))
    {
      return (TypeAdapter)localObject;
      localObject = this.constructorConstructor;
    }
  }
  
  TypeAdapter getTypeAdapter(ConstructorConstructor paramConstructorConstructor, Gson paramGson, TypeToken paramTypeToken, JsonAdapter paramJsonAdapter)
  {
    Object localObject1 = TypeToken.get(paramJsonAdapter.value());
    localObject1 = paramConstructorConstructor.get((TypeToken)localObject1);
    Object localObject2 = ((ObjectConstructor)localObject1).construct();
    boolean bool = localObject2 instanceof TypeAdapter;
    if (bool) {
      localObject3 = localObject2;
    }
    for (Object localObject3 = (TypeAdapter)localObject2;; localObject3 = ((TypeAdapterFactory)localObject2).create(paramGson, paramTypeToken))
    {
      if (localObject3 != null) {
        localObject3 = ((TypeAdapter)localObject3).nullSafe();
      }
      return (TypeAdapter)localObject3;
      bool = localObject2 instanceof TypeAdapterFactory;
      if (!bool) {
        break;
      }
      localObject2 = (TypeAdapterFactory)localObject2;
    }
    bool = localObject2 instanceof JsonSerializer;
    if (!bool)
    {
      bool = localObject2 instanceof JsonDeserializer;
      if (!bool) {}
    }
    else
    {
      bool = localObject2 instanceof JsonSerializer;
      Object localObject4;
      if (bool)
      {
        localObject1 = localObject2;
        localObject1 = (JsonSerializer)localObject2;
        localObject4 = localObject1;
        label151:
        bool = localObject2 instanceof JsonDeserializer;
        if (!bool) {
          break label203;
        }
        localObject2 = (JsonDeserializer)localObject2;
      }
      label203:
      for (Object localObject5 = localObject2;; localObject5 = null)
      {
        localObject3 = new com/google/gson/internal/bind/TreeTypeAdapter;
        localObject1 = paramGson;
        ((TreeTypeAdapter)localObject3).<init>((JsonSerializer)localObject4, (JsonDeserializer)localObject5, paramGson, paramTypeToken, null);
        break;
        localObject4 = null;
        break label151;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference.");
    throw ((Throwable)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */