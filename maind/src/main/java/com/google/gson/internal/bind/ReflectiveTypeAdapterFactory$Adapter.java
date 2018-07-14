package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final Map boundFields;
  private final ObjectConstructor constructor;
  
  ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor paramObjectConstructor, Map paramMap)
  {
    this.constructor = paramObjectConstructor;
    this.boundFields = paramMap;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    Object localObject2;
    if (localObject1 == localJsonToken)
    {
      paramJsonReader.nextNull();
      localObject2 = null;
    }
    for (;;)
    {
      return localObject2;
      localObject1 = this.constructor;
      localObject2 = ((ObjectConstructor)localObject1).construct();
      try
      {
        paramJsonReader.beginObject();
        for (;;)
        {
          boolean bool = paramJsonReader.hasNext();
          if (!bool) {
            break label143;
          }
          String str = paramJsonReader.nextName();
          localObject1 = this.boundFields;
          localObject3 = ((Map)localObject1).get(str);
          localObject3 = (ReflectiveTypeAdapterFactory.BoundField)localObject3;
          if (localObject3 != null)
          {
            bool = ((ReflectiveTypeAdapterFactory.BoundField)localObject3).deserialized;
            if (bool) {
              break;
            }
          }
          paramJsonReader.skipValue();
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          Object localObject3;
          localObject1 = new com/google/gson/JsonSyntaxException;
          ((JsonSyntaxException)localObject1).<init>(localIllegalStateException);
          throw ((Throwable)localObject1);
          ((ReflectiveTypeAdapterFactory.BoundField)localObject3).read(paramJsonReader, localObject2);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>(localIllegalAccessException);
        throw ((Throwable)localObject1);
      }
      label143:
      paramJsonReader.endObject();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginObject();
      try
      {
        Object localObject1 = this.boundFields;
        localObject1 = ((Map)localObject1).values();
        localObject1 = ((Collection)localObject1).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          Object localObject2 = ((Iterator)localObject1).next();
          localObject2 = (ReflectiveTypeAdapterFactory.BoundField)localObject2;
          bool = ((ReflectiveTypeAdapterFactory.BoundField)localObject2).writeField(paramObject);
          if (bool)
          {
            String str = ((ReflectiveTypeAdapterFactory.BoundField)localObject2).name;
            paramJsonWriter.name(str);
            ((ReflectiveTypeAdapterFactory.BoundField)localObject2).write(paramJsonWriter, paramObject);
          }
        }
        paramJsonWriter.endObject();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>(localIllegalAccessException);
        throw ((Throwable)localObject1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */