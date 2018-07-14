package com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class $Gson$Types
{
  static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
  
  private $Gson$Types()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static GenericArrayType arrayOf(Type paramType)
  {
    .Gson.Types.GenericArrayTypeImpl localGenericArrayTypeImpl = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
    localGenericArrayTypeImpl.<init>(paramType);
    return localGenericArrayTypeImpl;
  }
  
  public static Type canonicalize(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject1 = paramType;
      localObject1 = (Class)paramType;
      bool = ((Class)localObject1).isArray();
      if (bool)
      {
        localObject2 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
        localObject3 = canonicalize(((Class)localObject1).getComponentType());
        ((.Gson.Types.GenericArrayTypeImpl)localObject2).<init>((Type)localObject3);
        localObject2 = (Type)localObject2;
      }
    }
    for (;;)
    {
      return (Type)localObject2;
      localObject2 = localObject1;
      break;
      bool = paramType instanceof ParameterizedType;
      Object localObject5;
      if (bool)
      {
        Object localObject4 = paramType;
        localObject4 = (ParameterizedType)paramType;
        localObject2 = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
        localObject3 = ((ParameterizedType)localObject4).getOwnerType();
        localObject5 = ((ParameterizedType)localObject4).getRawType();
        Type[] arrayOfType = ((ParameterizedType)localObject4).getActualTypeArguments();
        ((.Gson.Types.ParameterizedTypeImpl)localObject2).<init>((Type)localObject3, (Type)localObject5, arrayOfType);
      }
      else
      {
        bool = paramType instanceof GenericArrayType;
        if (bool)
        {
          Object localObject6 = paramType;
          localObject6 = (GenericArrayType)paramType;
          localObject2 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
          localObject3 = ((GenericArrayType)localObject6).getGenericComponentType();
          ((.Gson.Types.GenericArrayTypeImpl)localObject2).<init>((Type)localObject3);
        }
        else
        {
          bool = paramType instanceof WildcardType;
          if (bool)
          {
            Object localObject7 = paramType;
            localObject7 = (WildcardType)paramType;
            localObject2 = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
            localObject3 = ((WildcardType)localObject7).getUpperBounds();
            localObject5 = ((WildcardType)localObject7).getLowerBounds();
            ((.Gson.Types.WildcardTypeImpl)localObject2).<init>((Type[])localObject3, (Type[])localObject5);
          }
          else
          {
            localObject2 = paramType;
          }
        }
      }
    }
  }
  
  static void checkNotPrimitive(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool)
    {
      paramType = (Class)paramType;
      bool = paramType.isPrimitive();
      if (bool) {
        break label30;
      }
    }
    label30:
    for (bool = true;; bool = false)
    {
      .Gson.Preconditions.checkArgument(bool);
      return;
    }
  }
  
  private static Class declaringClassOf(TypeVariable paramTypeVariable)
  {
    Object localObject = paramTypeVariable.getGenericDeclaration();
    boolean bool = localObject instanceof Class;
    if (bool) {}
    for (localObject = (Class)localObject;; localObject = null) {
      return (Class)localObject;
    }
  }
  
  static boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean equals(Type paramType1, Type paramType2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Type localType1 = null;
    if (paramType1 == paramType2) {
      bool2 = bool1;
    }
    boolean bool3;
    Type localType2;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            return bool2;
            bool3 = paramType1 instanceof Class;
            if (bool3)
            {
              bool2 = paramType1.equals(paramType2);
            }
            else
            {
              bool3 = paramType1 instanceof ParameterizedType;
              if (bool3)
              {
                bool3 = paramType2 instanceof ParameterizedType;
                if (bool3)
                {
                  Object localObject1 = paramType1;
                  localObject1 = (ParameterizedType)paramType1;
                  Object localObject2 = paramType2;
                  localObject2 = (ParameterizedType)paramType2;
                  localObject3 = ((ParameterizedType)localObject1).getOwnerType();
                  localObject4 = ((ParameterizedType)localObject2).getOwnerType();
                  bool3 = equal(localObject3, localObject4);
                  if (bool3)
                  {
                    localObject3 = ((ParameterizedType)localObject1).getRawType();
                    localObject4 = ((ParameterizedType)localObject2).getRawType();
                    bool3 = localObject3.equals(localObject4);
                    if (bool3)
                    {
                      localObject3 = ((ParameterizedType)localObject1).getActualTypeArguments();
                      localObject4 = ((ParameterizedType)localObject2).getActualTypeArguments();
                      bool3 = Arrays.equals((Object[])localObject3, (Object[])localObject4);
                      if (!bool3) {}
                    }
                  }
                  for (;;)
                  {
                    bool2 = bool1;
                    break;
                    bool1 = false;
                    localType2 = null;
                  }
                }
              }
              else
              {
                bool3 = paramType1 instanceof GenericArrayType;
                if (!bool3) {
                  break;
                }
                bool1 = paramType2 instanceof GenericArrayType;
                if (bool1)
                {
                  Object localObject5 = paramType1;
                  localObject5 = (GenericArrayType)paramType1;
                  Object localObject6 = paramType2;
                  localObject6 = (GenericArrayType)paramType2;
                  localType2 = ((GenericArrayType)localObject5).getGenericComponentType();
                  localType1 = ((GenericArrayType)localObject6).getGenericComponentType();
                  bool2 = equals(localType2, localType1);
                }
              }
            }
          }
          bool3 = paramType1 instanceof WildcardType;
          if (!bool3) {
            break;
          }
          bool3 = paramType2 instanceof WildcardType;
        } while (!bool3);
        Object localObject7 = paramType1;
        localObject7 = (WildcardType)paramType1;
        Object localObject8 = paramType2;
        localObject8 = (WildcardType)paramType2;
        localObject3 = ((WildcardType)localObject7).getUpperBounds();
        localObject4 = ((WildcardType)localObject8).getUpperBounds();
        bool3 = Arrays.equals((Object[])localObject3, (Object[])localObject4);
        if (bool3)
        {
          localObject3 = ((WildcardType)localObject7).getLowerBounds();
          localObject4 = ((WildcardType)localObject8).getLowerBounds();
          bool3 = Arrays.equals((Object[])localObject3, (Object[])localObject4);
          if (!bool3) {}
        }
        for (;;)
        {
          bool2 = bool1;
          break;
          bool1 = false;
          localType2 = null;
        }
        bool3 = paramType1 instanceof TypeVariable;
      } while (!bool3);
      bool3 = paramType2 instanceof TypeVariable;
    } while (!bool3);
    Object localObject9 = paramType1;
    localObject9 = (TypeVariable)paramType1;
    Object localObject10 = paramType2;
    localObject10 = (TypeVariable)paramType2;
    Object localObject3 = ((TypeVariable)localObject9).getGenericDeclaration();
    Object localObject4 = ((TypeVariable)localObject10).getGenericDeclaration();
    if (localObject3 == localObject4)
    {
      localObject3 = ((TypeVariable)localObject9).getName();
      localObject4 = ((TypeVariable)localObject10).getName();
      bool3 = ((String)localObject3).equals(localObject4);
      if (!bool3) {}
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      bool1 = false;
      localType2 = null;
    }
  }
  
  public static Type getArrayComponentType(Type paramType)
  {
    boolean bool = paramType instanceof GenericArrayType;
    if (bool) {
      paramType = (GenericArrayType)paramType;
    }
    for (Object localObject = paramType.getGenericComponentType();; localObject = paramType.getComponentType())
    {
      return (Type)localObject;
      paramType = (Class)paramType;
    }
  }
  
  public static Type getCollectionElementType(Type paramType, Class paramClass)
  {
    Object localObject1 = Collection.class;
    Object localObject2 = getSupertype(paramType, paramClass, (Class)localObject1);
    boolean bool = localObject2 instanceof WildcardType;
    if (bool)
    {
      localObject1 = ((WildcardType)localObject2).getUpperBounds();
      localObject2 = localObject1[0];
    }
    bool = localObject2 instanceof ParameterizedType;
    if (bool) {
      localObject2 = (ParameterizedType)localObject2;
    }
    for (localObject1 = localObject2.getActualTypeArguments()[0];; localObject1 = Object.class) {
      return (Type)localObject1;
    }
  }
  
  static Type getGenericSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    if (paramClass2 == paramClass1) {}
    for (;;)
    {
      return paramType;
      boolean bool = paramClass2.isInterface();
      Object localObject;
      if (bool)
      {
        Class[] arrayOfClass = paramClass1.getInterfaces();
        int i = 0;
        int j = arrayOfClass.length;
        for (;;)
        {
          if (i >= j) {
            break label120;
          }
          localObject = arrayOfClass[i];
          if (localObject == paramClass2)
          {
            localObject = paramClass1.getGenericInterfaces();
            paramType = localObject[i];
            break;
          }
          localObject = arrayOfClass[i];
          bool = paramClass2.isAssignableFrom((Class)localObject);
          if (bool)
          {
            localObject = paramClass1.getGenericInterfaces()[i];
            Class localClass1 = arrayOfClass[i];
            paramType = getGenericSupertype((Type)localObject, localClass1, paramClass2);
            break;
          }
          i += 1;
        }
      }
      label120:
      bool = paramClass1.isInterface();
      if (!bool) {
        for (;;)
        {
          localObject = Object.class;
          if (paramClass1 == localObject) {
            break label194;
          }
          Class localClass2 = paramClass1.getSuperclass();
          if (localClass2 == paramClass2)
          {
            paramType = paramClass1.getGenericSuperclass();
            break;
          }
          bool = paramClass2.isAssignableFrom(localClass2);
          if (bool)
          {
            localObject = paramClass1.getGenericSuperclass();
            paramType = getGenericSupertype((Type)localObject, localClass2, paramClass2);
            break;
          }
          paramClass1 = localClass2;
        }
      }
      label194:
      paramType = paramClass2;
    }
  }
  
  public static Type[] getMapKeyAndValueTypes(Type paramType, Class paramClass)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = Properties.class;
    Class localClass;
    if (paramType == localObject1)
    {
      localObject1 = new Type[i];
      localObject1[0] = String.class;
      localClass = String.class;
      localObject1[j] = localClass;
    }
    for (;;)
    {
      return (Type[])localObject1;
      localObject1 = Map.class;
      Type localType = getSupertype(paramType, paramClass, (Class)localObject1);
      boolean bool = localType instanceof ParameterizedType;
      if (bool)
      {
        Object localObject2 = localType;
        localObject2 = (ParameterizedType)localType;
        localObject1 = ((ParameterizedType)localObject2).getActualTypeArguments();
      }
      else
      {
        localObject1 = new Type[i];
        localObject1[0] = Object.class;
        localClass = Object.class;
        localObject1[j] = localClass;
      }
    }
  }
  
  public static Class getRawType(Type paramType)
  {
    Object localObject1 = null;
    boolean bool = paramType instanceof Class;
    if (bool) {
      paramType = (Class)paramType;
    }
    Object localObject4;
    for (;;)
    {
      return paramType;
      bool = paramType instanceof ParameterizedType;
      if (bool)
      {
        Object localObject2 = paramType;
        localObject2 = (ParameterizedType)paramType;
        Object localObject3 = ((ParameterizedType)localObject2).getRawType();
        bool = localObject3 instanceof Class;
        .Gson.Preconditions.checkArgument(bool);
        localObject3 = (Class)localObject3;
        paramType = (Type)localObject3;
      }
      else
      {
        bool = paramType instanceof GenericArrayType;
        if (bool)
        {
          Type localType = ((GenericArrayType)paramType).getGenericComponentType();
          localObject4 = Array.newInstance(getRawType(localType), 0);
          paramType = localObject4.getClass();
        }
        else
        {
          bool = paramType instanceof TypeVariable;
          if (bool)
          {
            paramType = Object.class;
          }
          else
          {
            bool = paramType instanceof WildcardType;
            if (!bool) {
              break;
            }
            localObject4 = ((WildcardType)paramType).getUpperBounds()[0];
            paramType = getRawType((Type)localObject4);
          }
        }
      }
    }
    if (paramType == null) {}
    for (String str = "null";; str = ((Class)localObject4).getName())
    {
      localObject4 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Expected a Class, ParameterizedType, or GenericArrayType, but <" + paramType + "> is of type " + str;
      ((IllegalArgumentException)localObject4).<init>((String)localObject1);
      throw ((Throwable)localObject4);
      localObject4 = paramType.getClass();
    }
  }
  
  static Type getSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    .Gson.Preconditions.checkArgument(paramClass2.isAssignableFrom(paramClass1));
    Type localType = getGenericSupertype(paramType, paramClass1, paramClass2);
    return resolve(paramType, paramClass1, localType);
  }
  
  static int hashCodeOrZero(Object paramObject)
  {
    if (paramObject != null) {}
    for (int i = paramObject.hashCode();; i = 0) {
      return i;
    }
  }
  
  private static int indexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfObject.length;
      if (i >= j) {
        break;
      }
      localObject = paramArrayOfObject[i];
      boolean bool = paramObject.equals(localObject);
      if (bool) {
        return i;
      }
      i += 1;
    }
    Object localObject = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public static ParameterizedType newParameterizedTypeWithOwner(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    .Gson.Types.ParameterizedTypeImpl localParameterizedTypeImpl = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
    localParameterizedTypeImpl.<init>(paramType1, paramType2, paramVarArgs);
    return localParameterizedTypeImpl;
  }
  
  public static Type resolve(Type paramType1, Class paramClass, Type paramType2)
  {
    boolean bool1;
    boolean bool2;
    Object localObject1;
    do
    {
      bool1 = paramType2 instanceof TypeVariable;
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      localObject1 = paramType2;
      localObject1 = (TypeVariable)paramType2;
      paramType2 = resolveTypeVariable(paramType1, paramClass, (TypeVariable)localObject1);
    } while (paramType2 != localObject1);
    Object localObject2 = paramType2;
    for (;;)
    {
      return (Type)localObject2;
      bool1 = paramType2 instanceof Class;
      bool2 = bool1;
      Object localObject3;
      Object localObject5;
      Type localType1;
      if (bool1)
      {
        localObject3 = paramType2;
        localObject3 = (Class)paramType2;
        bool2 = ((Class)localObject3).isArray();
        if (bool2)
        {
          Object localObject4 = paramType2;
          localObject4 = (Class)paramType2;
          localObject5 = ((Class)localObject4).getComponentType();
          localType1 = resolve(paramType1, paramClass, (Type)localObject5);
          if (localObject5 == localType1) {}
          for (;;)
          {
            localObject2 = localObject4;
            break;
            localObject4 = arrayOf(localType1);
          }
        }
      }
      bool1 = paramType2 instanceof GenericArrayType;
      bool2 = bool1;
      if (bool1)
      {
        localObject2 = paramType2;
        localObject2 = (GenericArrayType)paramType2;
        localObject5 = ((GenericArrayType)localObject2).getGenericComponentType();
        localType1 = resolve(paramType1, paramClass, (Type)localObject5);
        if (localObject5 != localType1) {
          localObject2 = arrayOf(localType1);
        }
      }
      else
      {
        bool1 = paramType2 instanceof ParameterizedType;
        bool2 = bool1;
        if (bool1)
        {
          localObject2 = paramType2;
          localObject2 = (ParameterizedType)paramType2;
          Type localType2 = ((ParameterizedType)localObject2).getOwnerType();
          Type localType3 = resolve(paramType1, paramClass, localType2);
          if (localType3 != localType2) {}
          Type[] arrayOfType1;
          for (int j = 1;; j = 0)
          {
            arrayOfType1 = ((ParameterizedType)localObject2).getActualTypeArguments();
            int k = 0;
            int m = arrayOfType1.length;
            for (;;)
            {
              bool1 = k;
              if (k >= m) {
                break;
              }
              localObject3 = arrayOfType1[k];
              Type localType4 = resolve(paramType1, paramClass, (Type)localObject3);
              localObject3 = arrayOfType1[k];
              if (localType4 != localObject3)
              {
                if (j == 0)
                {
                  arrayOfType1 = (Type[])arrayOfType1.clone();
                  j = 1;
                }
                arrayOfType1[k] = localType4;
              }
              k += 1;
            }
          }
          if (j != 0)
          {
            localObject3 = ((ParameterizedType)localObject2).getRawType();
            localObject2 = newParameterizedTypeWithOwner(localType3, (Type)localObject3, arrayOfType1);
          }
        }
        else
        {
          bool1 = paramType2 instanceof WildcardType;
          bool2 = bool1;
          if (bool1)
          {
            localObject2 = paramType2;
            localObject2 = (WildcardType)paramType2;
            Type[] arrayOfType2 = ((WildcardType)localObject2).getLowerBounds();
            Type[] arrayOfType3 = ((WildcardType)localObject2).getUpperBounds();
            int i = arrayOfType2.length;
            bool2 = i;
            int n = 1;
            if (i == n)
            {
              localObject3 = arrayOfType2[0];
              Type localType5 = resolve(paramType1, paramClass, (Type)localObject3);
              bool2 = false;
              localObject3 = arrayOfType2[0];
              if (localType5 != localObject3) {
                localObject2 = supertypeOf(localType5);
              }
            }
            else
            {
              i = arrayOfType3.length;
              bool2 = i;
              n = 1;
              if (i == n)
              {
                localObject3 = arrayOfType3[0];
                Type localType6 = resolve(paramType1, paramClass, (Type)localObject3);
                bool2 = false;
                localObject3 = arrayOfType3[0];
                if (localType6 != localObject3) {
                  localObject2 = subtypeOf(localType6);
                }
              }
            }
          }
          else
          {
            localObject2 = paramType2;
          }
        }
      }
    }
  }
  
  static Type resolveTypeVariable(Type paramType, Class paramClass, TypeVariable paramTypeVariable)
  {
    Class localClass = declaringClassOf(paramTypeVariable);
    if (localClass == null) {}
    for (;;)
    {
      return paramTypeVariable;
      Object localObject = getGenericSupertype(paramType, paramClass, localClass);
      boolean bool = localObject instanceof ParameterizedType;
      if (bool)
      {
        int i = indexOf(localClass.getTypeParameters(), paramTypeVariable);
        localObject = (ParameterizedType)localObject;
        Type[] arrayOfType = ((ParameterizedType)localObject).getActualTypeArguments();
        paramTypeVariable = arrayOfType[i];
      }
    }
  }
  
  public static WildcardType subtypeOf(Type paramType)
  {
    .Gson.Types.WildcardTypeImpl localWildcardTypeImpl = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType1 = new Type[1];
    arrayOfType1[0] = paramType;
    Type[] arrayOfType2 = EMPTY_TYPE_ARRAY;
    localWildcardTypeImpl.<init>(arrayOfType1, arrayOfType2);
    return localWildcardTypeImpl;
  }
  
  public static WildcardType supertypeOf(Type paramType)
  {
    int i = 1;
    .Gson.Types.WildcardTypeImpl localWildcardTypeImpl = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType1 = new Type[i];
    arrayOfType1[0] = Object.class;
    Type[] arrayOfType2 = new Type[i];
    arrayOfType2[0] = paramType;
    localWildcardTypeImpl.<init>(arrayOfType1, arrayOfType2);
    return localWildcardTypeImpl;
  }
  
  public static String typeToString(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool) {
      paramType = (Class)paramType;
    }
    for (String str = paramType.getName();; str = paramType.toString()) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/$Gson$Types.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */