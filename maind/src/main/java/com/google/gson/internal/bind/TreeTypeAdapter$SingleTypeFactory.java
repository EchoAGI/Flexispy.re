package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.reflect.TypeToken;

final class TreeTypeAdapter$SingleTypeFactory
  implements TypeAdapterFactory
{
  private final JsonDeserializer deserializer;
  private final TypeToken exactType;
  private final Class hierarchyType;
  private final boolean matchRawType;
  private final JsonSerializer serializer;
  
  TreeTypeAdapter$SingleTypeFactory(Object paramObject, TypeToken paramTypeToken, boolean paramBoolean, Class paramClass)
  {
    boolean bool = paramObject instanceof JsonSerializer;
    Object localObject;
    if (bool)
    {
      localObject = paramObject;
      localObject = (JsonSerializer)paramObject;
      this.serializer = ((JsonSerializer)localObject);
      bool = paramObject instanceof JsonDeserializer;
      if (!bool) {
        break label107;
      }
      paramObject = (JsonDeserializer)paramObject;
      label46:
      this.deserializer = ((JsonDeserializer)paramObject);
      localObject = this.serializer;
      if (localObject == null)
      {
        localObject = this.deserializer;
        if (localObject == null) {
          break label112;
        }
      }
      bool = true;
    }
    for (;;)
    {
      .Gson.Preconditions.checkArgument(bool);
      this.exactType = paramTypeToken;
      this.matchRawType = paramBoolean;
      this.hierarchyType = paramClass;
      return;
      bool = false;
      localObject = null;
      break;
      label107:
      paramObject = null;
      break label46;
      label112:
      bool = false;
      localObject = null;
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = this.exactType;
    boolean bool1;
    Object localObject2;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = this.exactType;
      bool1 = ((TypeToken)localObject1).equals(paramTypeToken);
      if (!bool1)
      {
        bool1 = this.matchRawType;
        if (bool1)
        {
          localObject1 = this.exactType.getType();
          localObject2 = paramTypeToken.getRawType();
          if (localObject1 != localObject2) {}
        }
      }
      else
      {
        bool2 = true;
        if (!bool2) {
          break label122;
        }
        localObject1 = new com/google/gson/internal/bind/TreeTypeAdapter;
        localObject2 = this.serializer;
        JsonDeserializer localJsonDeserializer = this.deserializer;
        ((TreeTypeAdapter)localObject1).<init>((JsonSerializer)localObject2, localJsonDeserializer, paramGson, paramTypeToken, this);
      }
    }
    for (;;)
    {
      return (TypeAdapter)localObject1;
      bool2 = false;
      break;
      localObject1 = this.hierarchyType;
      localObject2 = paramTypeToken.getRawType();
      bool2 = ((Class)localObject1).isAssignableFrom((Class)localObject2);
      break;
      label122:
      bool1 = false;
      localObject1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */