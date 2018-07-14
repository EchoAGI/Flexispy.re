package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$30
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Class localClass = paramTypeToken.getRawType();
    Object localObject = Enum.class;
    boolean bool = ((Class)localObject).isAssignableFrom(localClass);
    if (bool)
    {
      localObject = Enum.class;
      if (localClass != localObject) {}
    }
    else
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      bool = localClass.isEnum();
      if (!bool) {
        localClass = localClass.getSuperclass();
      }
      localObject = new com/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;
      ((TypeAdapters.EnumTypeAdapter)localObject).<init>(localClass);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */