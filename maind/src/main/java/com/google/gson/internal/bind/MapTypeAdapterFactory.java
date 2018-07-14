package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

public final class MapTypeAdapterFactory
  implements TypeAdapterFactory
{
  final boolean complexMapKeySerialization;
  private final ConstructorConstructor constructorConstructor;
  
  public MapTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, boolean paramBoolean)
  {
    this.constructorConstructor = paramConstructorConstructor;
    this.complexMapKeySerialization = paramBoolean;
  }
  
  private TypeAdapter getKeyAdapter(Gson paramGson, Type paramType)
  {
    Object localObject = Boolean.TYPE;
    if (paramType != localObject)
    {
      localObject = Boolean.class;
      if (paramType != localObject) {
        break label23;
      }
    }
    for (localObject = TypeAdapters.BOOLEAN_AS_STRING;; localObject = paramGson.getAdapter((TypeToken)localObject))
    {
      return (TypeAdapter)localObject;
      label23:
      localObject = TypeToken.get(paramType);
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    int i = 1;
    Type localType1 = paramTypeToken.getType();
    Class localClass1 = paramTypeToken.getRawType();
    Object localObject1 = Map.class;
    boolean bool = ((Class)localObject1).isAssignableFrom(localClass1);
    Object localObject2;
    if (!bool) {
      localObject2 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject2;
      Class localClass2 = .Gson.Types.getRawType(localType1);
      Type[] arrayOfType = .Gson.Types.getMapKeyAndValueTypes(localType1, localClass2);
      localObject1 = arrayOfType[0];
      TypeAdapter localTypeAdapter1 = getKeyAdapter(paramGson, (Type)localObject1);
      localObject1 = TypeToken.get(arrayOfType[i]);
      TypeAdapter localTypeAdapter2 = paramGson.getAdapter((TypeToken)localObject1);
      ObjectConstructor localObjectConstructor = this.constructorConstructor.get(paramTypeToken);
      localObject2 = new com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
      Type localType2 = arrayOfType[0];
      Type localType3 = arrayOfType[i];
      localObject1 = this;
      ((MapTypeAdapterFactory.Adapter)localObject2).<init>(this, paramGson, localType2, localTypeAdapter1, localType3, localTypeAdapter2, localObjectConstructor);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/MapTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */