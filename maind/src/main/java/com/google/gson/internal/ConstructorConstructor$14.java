package com.google.gson.internal;

import java.lang.reflect.Type;

class ConstructorConstructor$14
  implements ObjectConstructor
{
  private final UnsafeAllocator unsafeAllocator;
  
  ConstructorConstructor$14(ConstructorConstructor paramConstructorConstructor, Class paramClass, Type paramType)
  {
    UnsafeAllocator localUnsafeAllocator = UnsafeAllocator.create();
    this.unsafeAllocator = localUnsafeAllocator;
  }
  
  public Object construct()
  {
    try
    {
      localObject1 = this.unsafeAllocator;
      localObject2 = this.val$rawType;
      return ((UnsafeAllocator)localObject1).newInstance((Class)localObject2);
    }
    catch (Exception localException)
    {
      Object localObject1 = new java/lang/RuntimeException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unable to invoke no-args constructor for ");
      Type localType = this.val$type;
      localObject2 = localType + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.";
      ((RuntimeException)localObject1).<init>((String)localObject2, localException);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/ConstructorConstructor$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */