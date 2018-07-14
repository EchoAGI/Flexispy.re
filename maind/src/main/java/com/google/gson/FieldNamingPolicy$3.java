package com.google.gson;

import java.lang.reflect.Field;

 enum FieldNamingPolicy$3
{
  FieldNamingPolicy$3()
  {
    super(paramString, paramInt, null);
  }
  
  public String translateName(Field paramField)
  {
    return upperCaseFirstLetter(separateCamelCase(paramField.getName(), " "));
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/FieldNamingPolicy$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */