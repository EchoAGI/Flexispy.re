package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class $Gson$Types$ParameterizedTypeImpl
  implements ParameterizedType, Serializable
{
  private static final long serialVersionUID;
  private final Type ownerType;
  private final Type rawType;
  private final Type[] typeArguments;
  
  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool3 = paramType2 instanceof Class;
    int j;
    if (bool3)
    {
      Object localObject2 = paramType2;
      localObject2 = (Class)paramType2;
      bool3 = Modifier.isStatic(((Class)localObject2).getModifiers());
      if (!bool3)
      {
        Class localClass = ((Class)localObject2).getEnclosingClass();
        if (localClass != null) {}
      }
      else
      {
        j = bool1;
        if ((paramType1 != null) || (j != 0)) {
          bool2 = bool1;
        }
        .Gson.Preconditions.checkArgument(bool2);
      }
    }
    else
    {
      if (paramType1 != null) {
        break label210;
      }
      bool2 = false;
    }
    label210:
    for (localObject1 = null;; localObject1 = .Gson.Types.canonicalize(paramType1))
    {
      this.ownerType = ((Type)localObject1);
      localObject1 = .Gson.Types.canonicalize((Type)paramType2);
      this.rawType = ((Type)localObject1);
      localObject1 = (Type[])paramVarArgs.clone();
      this.typeArguments = ((Type[])localObject1);
      int k = 0;
      for (;;)
      {
        localObject1 = this.typeArguments;
        int i = localObject1.length;
        if (k >= i) {
          break;
        }
        .Gson.Preconditions.checkNotNull(this.typeArguments[k]);
        .Gson.Types.checkNotPrimitive(this.typeArguments[k]);
        localObject1 = this.typeArguments;
        Type localType = .Gson.Types.canonicalize(this.typeArguments[k]);
        localObject1[k] = localType;
        k += 1;
      }
      j = 0;
      break;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof ParameterizedType;
    if (bool)
    {
      paramObject = (ParameterizedType)paramObject;
      bool = .Gson.Types.equals(this, (Type)paramObject);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Type[] getActualTypeArguments()
  {
    return (Type[])this.typeArguments.clone();
  }
  
  public Type getOwnerType()
  {
    return this.ownerType;
  }
  
  public Type getRawType()
  {
    return this.rawType;
  }
  
  public int hashCode()
  {
    int i = Arrays.hashCode(this.typeArguments);
    int j = this.rawType.hashCode();
    i ^= j;
    j = .Gson.Types.hashCodeOrZero(this.ownerType);
    return i ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = (this.typeArguments.length + 1) * 30;
    localStringBuilder.<init>(i);
    Object localObject = .Gson.Types.typeToString(this.rawType);
    localStringBuilder.append((String)localObject);
    localObject = this.typeArguments;
    i = localObject.length;
    if (i == 0) {}
    for (localObject = localStringBuilder.toString();; localObject = ">")
    {
      return (String)localObject;
      localObject = localStringBuilder.append("<");
      String str = .Gson.Types.typeToString(this.typeArguments[0]);
      ((StringBuilder)localObject).append(str);
      int j = 1;
      for (;;)
      {
        localObject = this.typeArguments;
        i = localObject.length;
        if (j >= i) {
          break;
        }
        localObject = localStringBuilder.append(", ");
        str = .Gson.Types.typeToString(this.typeArguments[j]);
        ((StringBuilder)localObject).append(str);
        j += 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */