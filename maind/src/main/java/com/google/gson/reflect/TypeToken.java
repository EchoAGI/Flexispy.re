package com.google.gson.reflect;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class TypeToken
{
  final int hashCode;
  final Class rawType;
  final Type type;
  
  protected TypeToken()
  {
    Object localObject = getSuperclassTypeParameter(getClass());
    this.type = ((Type)localObject);
    localObject = .Gson.Types.getRawType(this.type);
    this.rawType = ((Class)localObject);
    int i = this.type.hashCode();
    this.hashCode = i;
  }
  
  TypeToken(Type paramType)
  {
    Object localObject = .Gson.Types.canonicalize((Type).Gson.Preconditions.checkNotNull(paramType));
    this.type = ((Type)localObject);
    localObject = .Gson.Types.getRawType(this.type);
    this.rawType = ((Class)localObject);
    int i = this.type.hashCode();
    this.hashCode = i;
  }
  
  private static AssertionError buildUnexpectedTypeError(Type paramType, Class... paramVarArgs)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Unexpected type. Expected one of: ");
    int i = paramVarArgs.length;
    int j = 0;
    Object localObject1 = null;
    while (j < i)
    {
      Class localClass = paramVarArgs[j];
      Object localObject2 = localClass.getName();
      localObject2 = localStringBuilder.append((String)localObject2);
      String str1 = ", ";
      ((StringBuilder)localObject2).append(str1);
      j += 1;
    }
    localObject1 = localStringBuilder.append("but got: ");
    String str2 = paramType.getClass().getName();
    localObject1 = ((StringBuilder)localObject1).append(str2).append(", for type token: ");
    str2 = paramType.toString();
    ((StringBuilder)localObject1).append(str2).append('.');
    localObject1 = new java/lang/AssertionError;
    str2 = localStringBuilder.toString();
    ((AssertionError)localObject1).<init>(str2);
    return (AssertionError)localObject1;
  }
  
  public static TypeToken get(Class paramClass)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramClass);
    return localTypeToken;
  }
  
  public static TypeToken get(Type paramType)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramType);
    return localTypeToken;
  }
  
  static Type getSuperclassTypeParameter(Class paramClass)
  {
    Type localType = paramClass.getGenericSuperclass();
    boolean bool = localType instanceof Class;
    if (bool)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Missing type parameter.");
      throw localRuntimeException;
    }
    return .Gson.Types.canonicalize(((ParameterizedType)localType).getActualTypeArguments()[0]);
  }
  
  private static boolean isAssignableFrom(Type paramType, GenericArrayType paramGenericArrayType)
  {
    Object localObject1 = paramGenericArrayType.getGenericComponentType();
    boolean bool = localObject1 instanceof ParameterizedType;
    Object localObject2;
    HashMap localHashMap;
    if (bool)
    {
      localObject2 = paramType;
      bool = paramType instanceof GenericArrayType;
      if (bool)
      {
        paramType = (GenericArrayType)paramType;
        localObject2 = paramType.getGenericComponentType();
        localObject1 = (ParameterizedType)localObject1;
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
      }
    }
    for (bool = isAssignableFrom((Type)localObject2, (ParameterizedType)localObject1, localHashMap);; bool = true)
    {
      return bool;
      bool = paramType instanceof Class;
      if (!bool) {
        break;
      }
      Object localObject3 = paramType;
      for (localObject3 = (Class)paramType;; localObject3 = ((Class)localObject3).getComponentType())
      {
        bool = ((Class)localObject3).isArray();
        if (!bool) {
          break;
        }
      }
      localObject2 = localObject3;
      break;
    }
  }
  
  private static boolean isAssignableFrom(Type paramType, ParameterizedType paramParameterizedType, Map paramMap)
  {
    boolean bool1;
    Object localObject1;
    if (paramType == null)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      bool1 = paramParameterizedType.equals(paramType);
      if (bool1)
      {
        bool1 = true;
      }
      else
      {
        Class localClass = .Gson.Types.getRawType(paramType);
        Object localObject2 = null;
        bool1 = paramType instanceof ParameterizedType;
        if (bool1)
        {
          localObject2 = paramType;
          localObject2 = (ParameterizedType)paramType;
        }
        if (localObject2 != null)
        {
          Type[] arrayOfType1 = ((ParameterizedType)localObject2).getActualTypeArguments();
          TypeVariable[] arrayOfTypeVariable = localClass.getTypeParameters();
          int m = 0;
          for (;;)
          {
            int i = arrayOfType1.length;
            if (m >= i) {
              break;
            }
            Type localType1 = arrayOfType1[m];
            TypeVariable localTypeVariable = arrayOfTypeVariable[m];
            for (;;)
            {
              j = localType1 instanceof TypeVariable;
              if (j == 0) {
                break;
              }
              Object localObject3 = localType1;
              localObject3 = (TypeVariable)localType1;
              localObject1 = ((TypeVariable)localObject3).getName();
              localType1 = (Type)paramMap.get(localObject1);
            }
            localObject1 = localTypeVariable.getName();
            paramMap.put(localObject1, localType1);
            m += 1;
          }
          j = typeEquals((ParameterizedType)localObject2, paramParameterizedType, paramMap);
          if (j != 0)
          {
            j = 1;
            continue;
          }
        }
        Type[] arrayOfType2 = localClass.getGenericInterfaces();
        int n = arrayOfType2.length;
        int j = 0;
        localObject1 = null;
        for (;;)
        {
          if (j >= n) {
            break label260;
          }
          Type localType2 = arrayOfType2[j];
          HashMap localHashMap = new java/util/HashMap;
          localHashMap.<init>(paramMap);
          boolean bool3 = isAssignableFrom(localType2, paramParameterizedType, localHashMap);
          if (bool3)
          {
            j = 1;
            break;
          }
          int k;
          j += 1;
        }
        label260:
        Type localType3 = localClass.getGenericSuperclass();
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(paramMap);
        boolean bool2 = isAssignableFrom(localType3, paramParameterizedType, (Map)localObject1);
      }
    }
  }
  
  private static boolean matches(Type paramType1, Type paramType2, Map paramMap)
  {
    boolean bool = paramType2.equals(paramType1);
    Object localObject;
    if (!bool)
    {
      bool = paramType1 instanceof TypeVariable;
      if (bool)
      {
        paramType1 = (TypeVariable)paramType1;
        localObject = paramType1.getName();
        localObject = paramMap.get(localObject);
        bool = paramType2.equals(localObject);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean typeEquals(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map paramMap)
  {
    boolean bool1 = false;
    Type localType1 = paramParameterizedType1.getRawType();
    Type localType2 = paramParameterizedType2.getRawType();
    boolean bool2 = localType1.equals(localType2);
    int j;
    if (bool2)
    {
      Type[] arrayOfType1 = paramParameterizedType1.getActualTypeArguments();
      Type[] arrayOfType2 = paramParameterizedType2.getActualTypeArguments();
      j = 0;
      int i = arrayOfType1.length;
      if (j >= i) {
        break label103;
      }
      localType1 = arrayOfType1[j];
      localType2 = arrayOfType2[j];
      boolean bool3 = matches(localType1, localType2, paramMap);
      if (bool3) {
        break label94;
      }
    }
    for (;;)
    {
      return bool1;
      label94:
      j += 1;
      break;
      label103:
      bool1 = true;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof TypeToken;
    Type localType1;
    if (bool)
    {
      localType1 = this.type;
      paramObject = (TypeToken)paramObject;
      Type localType2 = ((TypeToken)paramObject).type;
      bool = .Gson.Types.equals(localType1, localType2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localType1 = null;
    }
  }
  
  public final Class getRawType()
  {
    return this.rawType;
  }
  
  public final Type getType()
  {
    return this.type;
  }
  
  public final int hashCode()
  {
    return this.hashCode;
  }
  
  public boolean isAssignableFrom(TypeToken paramTypeToken)
  {
    Type localType = paramTypeToken.getType();
    return isAssignableFrom(localType);
  }
  
  public boolean isAssignableFrom(Class paramClass)
  {
    return isAssignableFrom(paramClass);
  }
  
  public boolean isAssignableFrom(Type paramType)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    if (paramType == null) {}
    for (;;)
    {
      return bool2;
      localObject1 = this.type;
      bool3 = localObject1.equals(paramType);
      if (bool3)
      {
        bool2 = bool1;
      }
      else
      {
        localObject1 = this.type;
        bool3 = localObject1 instanceof Class;
        Object localObject2;
        if (bool3)
        {
          localObject1 = this.rawType;
          localObject2 = .Gson.Types.getRawType(paramType);
          bool2 = ((Class)localObject1).isAssignableFrom((Class)localObject2);
        }
        else
        {
          localObject1 = this.type;
          bool3 = localObject1 instanceof ParameterizedType;
          if (!bool3) {
            break;
          }
          localObject1 = (ParameterizedType)this.type;
          localObject2 = new java/util/HashMap;
          ((HashMap)localObject2).<init>();
          bool2 = isAssignableFrom(paramType, (ParameterizedType)localObject1, (Map)localObject2);
        }
      }
    }
    Object localObject1 = this.type;
    boolean bool3 = localObject1 instanceof GenericArrayType;
    if (bool3)
    {
      localObject1 = this.rawType;
      localObject3 = .Gson.Types.getRawType(paramType);
      bool3 = ((Class)localObject1).isAssignableFrom((Class)localObject3);
      if (bool3)
      {
        localObject1 = (GenericArrayType)this.type;
        bool3 = isAssignableFrom(paramType, (GenericArrayType)localObject1);
        if (bool3) {
          bool3 = bool1;
        }
      }
      for (;;)
      {
        bool2 = bool3;
        break;
        bool3 = false;
        localObject1 = null;
      }
    }
    localObject1 = this.type;
    Object localObject3 = new Class[3];
    localObject3[0] = Class.class;
    localObject3[bool1] = ParameterizedType.class;
    localObject3[2] = GenericArrayType.class;
    throw buildUnexpectedTypeError((Type)localObject1, (Class[])localObject3);
  }
  
  public final String toString()
  {
    return .Gson.Types.typeToString(this.type);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/reflect/TypeToken.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */