package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$33
  implements TypeAdapterFactory
{
  TypeAdapters$33(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter) {}
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Class localClass = paramTypeToken.getRawType();
    Object localObject = this.val$unboxed;
    if (localClass != localObject)
    {
      localObject = this.val$boxed;
      if (localClass != localObject) {
        break label38;
      }
    }
    label38:
    for (localObject = this.val$typeAdapter;; localObject = null) {
      return (TypeAdapter)localObject;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Factory[type=");
    Object localObject = this.val$boxed.getName();
    localStringBuilder = localStringBuilder.append((String)localObject).append("+");
    localObject = this.val$unboxed.getName();
    localStringBuilder = localStringBuilder.append((String)localObject).append(",adapter=");
    localObject = this.val$typeAdapter;
    return localObject + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$33.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */