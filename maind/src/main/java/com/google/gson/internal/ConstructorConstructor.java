package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ConstructorConstructor
{
  private final Map instanceCreators;
  
  public ConstructorConstructor(Map paramMap)
  {
    this.instanceCreators = paramMap;
  }
  
  private ObjectConstructor newDefaultConstructor(Class paramClass)
  {
    bool = false;
    localObject = null;
    try
    {
      localObject = new Class[0];
      Constructor localConstructor = paramClass.getDeclaredConstructor((Class[])localObject);
      bool = localConstructor.isAccessible();
      if (!bool)
      {
        bool = true;
        localConstructor.setAccessible(bool);
      }
      localObject = new com/google/gson/internal/ConstructorConstructor$3;
      ((ConstructorConstructor.3)localObject).<init>(this, localConstructor);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        bool = false;
        localObject = null;
      }
    }
    return (ObjectConstructor)localObject;
  }
  
  private ObjectConstructor newDefaultImplementationConstructor(Type paramType, Class paramClass)
  {
    Object localObject = Collection.class;
    boolean bool = ((Class)localObject).isAssignableFrom(paramClass);
    if (bool)
    {
      localObject = SortedSet.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool)
      {
        localObject = new com/google/gson/internal/ConstructorConstructor$4;
        ((ConstructorConstructor.4)localObject).<init>(this);
      }
    }
    for (;;)
    {
      return (ObjectConstructor)localObject;
      localObject = EnumSet.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool)
      {
        localObject = new com/google/gson/internal/ConstructorConstructor$5;
        ((ConstructorConstructor.5)localObject).<init>(this, paramType);
      }
      else
      {
        localObject = Set.class;
        bool = ((Class)localObject).isAssignableFrom(paramClass);
        if (bool)
        {
          localObject = new com/google/gson/internal/ConstructorConstructor$6;
          ((ConstructorConstructor.6)localObject).<init>(this);
        }
        else
        {
          localObject = Queue.class;
          bool = ((Class)localObject).isAssignableFrom(paramClass);
          if (bool)
          {
            localObject = new com/google/gson/internal/ConstructorConstructor$7;
            ((ConstructorConstructor.7)localObject).<init>(this);
          }
          else
          {
            localObject = new com/google/gson/internal/ConstructorConstructor$8;
            ((ConstructorConstructor.8)localObject).<init>(this);
            continue;
            localObject = Map.class;
            bool = ((Class)localObject).isAssignableFrom(paramClass);
            if (bool)
            {
              localObject = ConcurrentNavigableMap.class;
              bool = ((Class)localObject).isAssignableFrom(paramClass);
              if (bool)
              {
                localObject = new com/google/gson/internal/ConstructorConstructor$9;
                ((ConstructorConstructor.9)localObject).<init>(this);
              }
              else
              {
                localObject = ConcurrentMap.class;
                bool = ((Class)localObject).isAssignableFrom(paramClass);
                if (bool)
                {
                  localObject = new com/google/gson/internal/ConstructorConstructor$10;
                  ((ConstructorConstructor.10)localObject).<init>(this);
                }
                else
                {
                  localObject = SortedMap.class;
                  bool = ((Class)localObject).isAssignableFrom(paramClass);
                  if (bool)
                  {
                    localObject = new com/google/gson/internal/ConstructorConstructor$11;
                    ((ConstructorConstructor.11)localObject).<init>(this);
                  }
                  else
                  {
                    bool = paramType instanceof ParameterizedType;
                    if (bool)
                    {
                      localObject = String.class;
                      paramType = (ParameterizedType)paramType;
                      Class localClass = TypeToken.get(paramType.getActualTypeArguments()[0]).getRawType();
                      bool = ((Class)localObject).isAssignableFrom(localClass);
                      if (!bool)
                      {
                        localObject = new com/google/gson/internal/ConstructorConstructor$12;
                        ((ConstructorConstructor.12)localObject).<init>(this);
                        continue;
                      }
                    }
                    localObject = new com/google/gson/internal/ConstructorConstructor$13;
                    ((ConstructorConstructor.13)localObject).<init>(this);
                  }
                }
              }
            }
            else
            {
              bool = false;
              localObject = null;
            }
          }
        }
      }
    }
  }
  
  private ObjectConstructor newUnsafeAllocator(Type paramType, Class paramClass)
  {
    ConstructorConstructor.14 local14 = new com/google/gson/internal/ConstructorConstructor$14;
    local14.<init>(this, paramClass, paramType);
    return local14;
  }
  
  public ObjectConstructor get(TypeToken paramTypeToken)
  {
    Type localType = paramTypeToken.getType();
    Class localClass = paramTypeToken.getRawType();
    Map localMap = this.instanceCreators;
    InstanceCreator localInstanceCreator1 = (InstanceCreator)localMap.get(localType);
    Object localObject;
    if (localInstanceCreator1 != null)
    {
      localObject = new com/google/gson/internal/ConstructorConstructor$1;
      ((ConstructorConstructor.1)localObject).<init>(this, localInstanceCreator1, localType);
    }
    for (;;)
    {
      return (ObjectConstructor)localObject;
      localMap = this.instanceCreators;
      InstanceCreator localInstanceCreator2 = (InstanceCreator)localMap.get(localClass);
      if (localInstanceCreator2 != null)
      {
        localObject = new com/google/gson/internal/ConstructorConstructor$2;
        ((ConstructorConstructor.2)localObject).<init>(this, localInstanceCreator2, localType);
      }
      else
      {
        localObject = newDefaultConstructor(localClass);
        if (localObject == null)
        {
          ObjectConstructor localObjectConstructor = newDefaultImplementationConstructor(localType, localClass);
          if (localObjectConstructor != null) {
            localObject = localObjectConstructor;
          } else {
            localObject = newUnsafeAllocator(localType, localClass);
          }
        }
      }
    }
  }
  
  public String toString()
  {
    return this.instanceCreators.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/ConstructorConstructor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */