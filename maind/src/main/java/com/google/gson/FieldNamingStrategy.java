package com.google.gson;

import java.lang.reflect.Field;

public abstract interface FieldNamingStrategy
{
  public abstract String translateName(Field paramField);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/FieldNamingStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */