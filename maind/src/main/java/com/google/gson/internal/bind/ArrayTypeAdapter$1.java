package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ArrayTypeAdapter$1
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Type localType1 = paramTypeToken.getType();
    boolean bool = localType1 instanceof GenericArrayType;
    Object localObject;
    if (!bool)
    {
      bool = localType1 instanceof Class;
      if (bool)
      {
        localObject = localType1;
        localObject = (Class)localType1;
        bool = ((Class)localObject).isArray();
        if (bool) {}
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      Type localType2 = .Gson.Types.getArrayComponentType((Type)localType1);
      localObject = TypeToken.get(localType2);
      TypeAdapter localTypeAdapter = paramGson.getAdapter((TypeToken)localObject);
      localObject = new com/google/gson/internal/bind/ArrayTypeAdapter;
      Class localClass = .Gson.Types.getRawType(localType2);
      ((ArrayTypeAdapter)localObject).<init>(paramGson, localTypeAdapter, localClass);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ArrayTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */