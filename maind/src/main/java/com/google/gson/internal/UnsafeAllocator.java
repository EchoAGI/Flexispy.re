package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class UnsafeAllocator
{
  private static void assertInstantiable(Class paramClass)
  {
    int i = paramClass.getModifiers();
    boolean bool = Modifier.isInterface(i);
    UnsupportedOperationException localUnsupportedOperationException;
    Object localObject;
    String str;
    if (bool)
    {
      localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Interface can't be instantiated! Interface name: ");
      str = paramClass.getName();
      localObject = str;
      localUnsupportedOperationException.<init>((String)localObject);
      throw localUnsupportedOperationException;
    }
    bool = Modifier.isAbstract(i);
    if (bool)
    {
      localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Abstract class can't be instantiated! Class name: ");
      str = paramClass.getName();
      localObject = str;
      localUnsupportedOperationException.<init>((String)localObject);
      throw localUnsupportedOperationException;
    }
  }
  
  public static UnsafeAllocator create()
  {
    Object localObject1 = "sun.misc.Unsafe";
    try
    {
      Class localClass1 = Class.forName((String)localObject1);
      localObject1 = "theUnsafe";
      Field localField = localClass1.getDeclaredField((String)localObject1);
      bool = true;
      localField.setAccessible(bool);
      bool = false;
      localObject1 = null;
      Object localObject4 = localField.get(null);
      localObject1 = "allocateInstance";
      i = 1;
      localObject5 = new Class[i];
      j = 0;
      arrayOfClass = null;
      localClass2 = Class.class;
      localObject5[0] = localClass2;
      Method localMethod1 = localClass1.getMethod((String)localObject1, (Class[])localObject5);
      localObject1 = new com/google/gson/internal/UnsafeAllocator$1;
      ((UnsafeAllocator.1)localObject1).<init>(localMethod1, localObject4);
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        boolean bool;
        int i;
        Class[] arrayOfClass;
        Class localClass2;
        Object localObject2 = ObjectStreamClass.class;
        Object localObject5 = "getConstructorId";
        int j = 1;
        try
        {
          arrayOfClass = new Class[j];
          k = 0;
          localClass2 = null;
          localClass3 = Class.class;
          arrayOfClass[0] = localClass3;
          Method localMethod2 = ((Class)localObject2).getDeclaredMethod((String)localObject5, arrayOfClass);
          bool = true;
          localMethod2.setAccessible(bool);
          bool = false;
          localObject2 = null;
          i = 1;
          localObject5 = new Object[i];
          j = 0;
          arrayOfClass = null;
          localClass2 = Object.class;
          localObject5[0] = localClass2;
          localObject2 = localMethod2.invoke(null, (Object[])localObject5);
          localObject2 = (Integer)localObject2;
          int m = ((Integer)localObject2).intValue();
          localObject2 = ObjectStreamClass.class;
          localObject5 = "newInstance";
          j = 2;
          arrayOfClass = new Class[j];
          k = 0;
          localClass2 = null;
          localClass3 = Class.class;
          arrayOfClass[0] = localClass3;
          k = 1;
          localClass3 = Integer.TYPE;
          arrayOfClass[k] = localClass3;
          localMethod3 = ((Class)localObject2).getDeclaredMethod((String)localObject5, arrayOfClass);
          bool = true;
          localMethod3.setAccessible(bool);
          localObject2 = new com/google/gson/internal/UnsafeAllocator$2;
          ((UnsafeAllocator.2)localObject2).<init>(localMethod3, m);
        }
        catch (Exception localException2)
        {
          int k;
          Class localClass3;
          Method localMethod3;
          Object localObject3 = ObjectInputStream.class;
          localObject5 = "newInstance";
          j = 2;
          try
          {
            arrayOfClass = new Class[j];
            k = 0;
            localClass2 = null;
            localClass3 = Class.class;
            arrayOfClass[0] = localClass3;
            k = 1;
            localClass3 = Class.class;
            arrayOfClass[k] = localClass3;
            localMethod3 = ((Class)localObject3).getDeclaredMethod((String)localObject5, arrayOfClass);
            bool = true;
            localMethod3.setAccessible(bool);
            localObject3 = new com/google/gson/internal/UnsafeAllocator$3;
            ((UnsafeAllocator.3)localObject3).<init>(localMethod3);
          }
          catch (Exception localException3)
          {
            UnsafeAllocator.4 local4 = new com/google/gson/internal/UnsafeAllocator$4;
            local4.<init>();
          }
        }
      }
    }
    return (UnsafeAllocator)localObject1;
  }
  
  public abstract Object newInstance(Class paramClass);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/UnsafeAllocator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */