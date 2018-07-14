package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

class ConstructorConstructor$5
  implements ObjectConstructor
{
  ConstructorConstructor$5(ConstructorConstructor paramConstructorConstructor, Type paramType) {}
  
  public Object construct()
  {
    Object localObject1 = this.val$type;
    boolean bool = localObject1 instanceof ParameterizedType;
    if (bool)
    {
      localObject1 = ((ParameterizedType)this.val$type).getActualTypeArguments();
      localObject2 = null;
      Object localObject3 = localObject1[0];
      bool = localObject3 instanceof Class;
      if (bool) {
        return EnumSet.noneOf((Class)localObject3);
      }
      localObject1 = new com/google/gson/JsonIOException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid EnumSet type: ");
      str = this.val$type.toString();
      localObject2 = str;
      ((JsonIOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/google/gson/JsonIOException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Invalid EnumSet type: ");
    String str = this.val$type.toString();
    localObject2 = str;
    ((JsonIOException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/ConstructorConstructor$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */