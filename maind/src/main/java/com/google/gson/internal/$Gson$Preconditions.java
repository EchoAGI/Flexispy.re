package com.google.gson.internal;

public final class $Gson$Preconditions
{
  private $Gson$Preconditions()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static void checkArgument(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
  }
  
  public static Object checkNotNull(Object paramObject)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>();
      throw localNullPointerException;
    }
    return paramObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/$Gson$Preconditions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */