package com.google.gson.internal;

import java.lang.reflect.Method;

final class UnsafeAllocator$3
  extends UnsafeAllocator
{
  UnsafeAllocator$3(Method paramMethod) {}
  
  public Object newInstance(Class paramClass)
  {
    UnsafeAllocator.access$000(paramClass);
    Method localMethod = this.val$newInstance;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    arrayOfObject[1] = Object.class;
    return localMethod.invoke(null, arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/UnsafeAllocator$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */