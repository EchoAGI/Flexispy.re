package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

final class TypeAdapters$26
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = paramTypeToken.getRawType();
    Class localClass = Timestamp.class;
    if (localObject != localClass) {
      localObject = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      TypeAdapter localTypeAdapter = paramGson.getAdapter(Date.class);
      localObject = new com/google/gson/internal/bind/TypeAdapters$26$1;
      ((TypeAdapters.26.1)localObject).<init>(this, localTypeAdapter);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$26.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */