package com.google.gson.internal;

import java.lang.reflect.Method;

final class UnsafeAllocator$1
  extends UnsafeAllocator
{
  UnsafeAllocator$1(Method paramMethod, Object paramObject) {}
  
  public Object newInstance(Class paramClass)
  {
    UnsafeAllocator.access$000(paramClass);
    Method localMethod = this.val$allocateInstance;
    Object localObject = this.val$unsafe;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramClass;
    return localMethod.invoke(localObject, arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/UnsafeAllocator$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */