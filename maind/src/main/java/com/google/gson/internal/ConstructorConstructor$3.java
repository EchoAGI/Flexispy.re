package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ConstructorConstructor$3
  implements ObjectConstructor
{
  ConstructorConstructor$3(ConstructorConstructor paramConstructorConstructor, Constructor paramConstructor) {}
  
  public Object construct()
  {
    try
    {
      localObject1 = this.val$constructor;
      return ((Constructor)localObject1).newInstance(null);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Failed to invoke ");
      localObject3 = this.val$constructor;
      localObject2 = localObject3 + " with no args";
      ((RuntimeException)localObject1).<init>((String)localObject2, localInstantiationException);
      throw ((Throwable)localObject1);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject1 = new java/lang/RuntimeException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Failed to invoke ");
      Object localObject3 = this.val$constructor;
      localObject2 = localObject3 + " with no args";
      localObject3 = localInvocationTargetException.getTargetException();
      ((RuntimeException)localObject1).<init>((String)localObject2, (Throwable)localObject3);
      throw ((Throwable)localObject1);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject1 = new java/lang/AssertionError;
      ((AssertionError)localObject1).<init>(localIllegalAccessException);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/ConstructorConstructor$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */