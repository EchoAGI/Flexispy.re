package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  
  public CollectionTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor)
  {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Type localType1 = paramTypeToken.getType();
    Class localClass = paramTypeToken.getRawType();
    Object localObject1 = Collection.class;
    boolean bool = ((Class)localObject1).isAssignableFrom(localClass);
    Object localObject2;
    if (!bool) {
      localObject2 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject2;
      Type localType2 = .Gson.Types.getCollectionElementType(localType1, localClass);
      localObject1 = TypeToken.get(localType2);
      TypeAdapter localTypeAdapter = paramGson.getAdapter((TypeToken)localObject1);
      localObject1 = this.constructorConstructor;
      ObjectConstructor localObjectConstructor = ((ConstructorConstructor)localObject1).get(paramTypeToken);
      localObject2 = new com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
      ((CollectionTypeAdapterFactory.Adapter)localObject2).<init>(paramGson, localType2, localTypeAdapter, localObjectConstructor);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/CollectionTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */