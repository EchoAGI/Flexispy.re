package com.google.gson.internal;

final class UnsafeAllocator$4
  extends UnsafeAllocator
{
  public Object newInstance(Class paramClass)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Cannot allocate " + paramClass;
    localUnsupportedOperationException.<init>((String)localObject);
    throw localUnsupportedOperationException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/UnsafeAllocator$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */