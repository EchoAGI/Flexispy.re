package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

class ConstructorConstructor$1
  implements ObjectConstructor
{
  ConstructorConstructor$1(ConstructorConstructor paramConstructorConstructor, InstanceCreator paramInstanceCreator, Type paramType) {}
  
  public Object construct()
  {
    InstanceCreator localInstanceCreator = this.val$typeCreator;
    Type localType = this.val$type;
    return localInstanceCreator.createInstance(localType);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/ConstructorConstructor$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */