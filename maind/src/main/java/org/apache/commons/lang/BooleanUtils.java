package org.apache.commons.lang;

import org.apache.commons.lang.math.NumberUtils;

public class BooleanUtils
{
  public static boolean isFalse(Boolean paramBoolean)
  {
    boolean bool1 = false;
    if (paramBoolean == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramBoolean.booleanValue();
      if (!bool2) {
        bool1 = true;
      }
    }
  }
  
  public static boolean isNotFalse(Boolean paramBoolean)
  {
    boolean bool = isFalse(paramBoolean);
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isNotTrue(Boolean paramBoolean)
  {
    boolean bool = isTrue(paramBoolean);
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isTrue(Boolean paramBoolean)
  {
    boolean bool1 = false;
    if (paramBoolean == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramBoolean.booleanValue();
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  public static Boolean negate(Boolean paramBoolean)
  {
    boolean bool;
    Boolean localBoolean;
    if (paramBoolean == null)
    {
      bool = false;
      localBoolean = null;
    }
    for (;;)
    {
      return localBoolean;
      bool = paramBoolean.booleanValue();
      if (bool) {
        localBoolean = Boolean.FALSE;
      } else {
        localBoolean = Boolean.TRUE;
      }
    }
  }
  
  public static boolean toBoolean(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean toBoolean(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (paramInt1 == paramInt2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramInt1 != paramInt3) {
        break;
      }
      bool = false;
      localIllegalArgumentException = null;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("The Integer did not match either specified value");
    throw localIllegalArgumentException;
  }
  
  public static boolean toBoolean(Boolean paramBoolean)
  {
    boolean bool1 = false;
    if (paramBoolean == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramBoolean.booleanValue();
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  public static boolean toBoolean(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3)
  {
    boolean bool1 = true;
    if (paramInteger1 == null) {
      if (paramInteger2 != null) {}
    }
    for (;;)
    {
      return bool1;
      if (paramInteger3 != null) {
        break;
      }
      bool1 = false;
      localIllegalArgumentException = null;
      continue;
      boolean bool2 = paramInteger1.equals(paramInteger2);
      if (!bool2)
      {
        bool1 = paramInteger1.equals(paramInteger3);
        if (!bool1) {
          break;
        }
        bool1 = false;
        localIllegalArgumentException = null;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("The Integer did not match either specified value");
    throw localIllegalArgumentException;
  }
  
  public static boolean toBoolean(String paramString)
  {
    int i = 69;
    int j = 3;
    int k = 2;
    int m = 0;
    float f1 = 0.0F;
    int n = 1;
    float f2 = Float.MIN_VALUE;
    String str = "true";
    if (paramString == str) {}
    for (;;)
    {
      return n;
      if (paramString == null)
      {
        n = 0;
        f2 = 0.0F;
      }
      else
      {
        int i2 = paramString.length();
        switch (i2)
        {
        }
        int i5;
        do
        {
          n = 0;
          f2 = 0.0F;
          break;
          int i3 = paramString.charAt(0);
          int i4 = paramString.charAt(n);
          i2 = 111;
          if (i3 != i2)
          {
            i2 = 79;
            if (i3 != i2) {}
          }
          else
          {
            i2 = 110;
            if (i4 != i2)
            {
              i2 = 78;
              if (i4 != i2) {}
            }
            else
            {
              m = n;
              f1 = f2;
            }
          }
          n = m;
          f2 = f1;
          break;
          i5 = paramString.charAt(0);
          i2 = 121;
          if (i5 == i2)
          {
            i2 = paramString.charAt(n);
            i6 = 101;
            if (i2 != i6)
            {
              i2 = paramString.charAt(n);
              if (i2 != i) {}
            }
            else
            {
              i2 = paramString.charAt(k);
              i6 = 115;
              if (i2 == i6) {
                break;
              }
              i2 = paramString.charAt(k);
              i6 = 83;
              if (i2 == i6) {
                break;
              }
            }
            i1 = 0;
            f2 = 0.0F;
            break;
          }
          i2 = 89;
          if (i5 == i2)
          {
            i2 = paramString.charAt(i1);
            if (i2 != i)
            {
              i2 = paramString.charAt(i1);
              i6 = 101;
              if (i2 != i6) {}
            }
            else
            {
              i2 = paramString.charAt(k);
              i6 = 83;
              if (i2 == i6) {
                break;
              }
              i2 = paramString.charAt(k);
              i6 = 115;
              if (i2 == i6) {
                break;
              }
            }
            i1 = 0;
            f2 = 0.0F;
            break;
          }
          i1 = 0;
          f2 = 0.0F;
          break;
          i5 = paramString.charAt(0);
          i2 = 116;
          if (i5 == i2)
          {
            i2 = paramString.charAt(i1);
            i6 = 114;
            if (i2 != i6)
            {
              i2 = paramString.charAt(i1);
              i6 = 82;
              if (i2 != i6) {}
            }
            else
            {
              i2 = paramString.charAt(k);
              i6 = 117;
              if (i2 != i6)
              {
                i2 = paramString.charAt(k);
                i6 = 85;
                if (i2 != i6) {}
              }
              else
              {
                i2 = paramString.charAt(j);
                i6 = 101;
                if (i2 == i6) {
                  break;
                }
                i2 = paramString.charAt(j);
                if (i2 == i) {
                  break;
                }
              }
            }
            i1 = 0;
            f2 = 0.0F;
            break;
          }
          i2 = 84;
        } while (i5 != i2);
        i2 = paramString.charAt(i1);
        int i6 = 82;
        if (i2 != i6)
        {
          i2 = paramString.charAt(i1);
          i6 = 114;
          if (i2 != i6) {}
        }
        else
        {
          i2 = paramString.charAt(k);
          i6 = 85;
          if (i2 != i6)
          {
            i2 = paramString.charAt(k);
            i6 = 117;
            if (i2 != i6) {}
          }
          else
          {
            i2 = paramString.charAt(j);
            if (i2 == i) {
              continue;
            }
            i2 = paramString.charAt(j);
            i6 = 101;
            if (i2 == i6) {
              continue;
            }
          }
        }
        int i1 = 0;
        f2 = 0.0F;
      }
    }
  }
  
  public static boolean toBoolean(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = true;
    if (paramString1 == null) {
      if (paramString2 != null) {}
    }
    for (;;)
    {
      return bool1;
      if (paramString3 != null) {
        break;
      }
      bool1 = false;
      localIllegalArgumentException = null;
      continue;
      boolean bool2 = paramString1.equals(paramString2);
      if (!bool2)
      {
        bool1 = paramString1.equals(paramString3);
        if (!bool1) {
          break;
        }
        bool1 = false;
        localIllegalArgumentException = null;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("The String did not match either specified value");
    throw localIllegalArgumentException;
  }
  
  public static boolean toBooleanDefaultIfNull(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null) {
      return paramBoolean1;
    }
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (bool = true;; bool = false)
    {
      paramBoolean1 = bool;
      break;
    }
  }
  
  public static Boolean toBooleanObject(int paramInt)
  {
    if (paramInt == 0) {}
    for (Boolean localBoolean = Boolean.FALSE;; localBoolean = Boolean.TRUE) {
      return localBoolean;
    }
  }
  
  public static Boolean toBooleanObject(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 == paramInt2) {
      localObject = Boolean.TRUE;
    }
    for (;;)
    {
      return (Boolean)localObject;
      if (paramInt1 == paramInt3)
      {
        localObject = Boolean.FALSE;
      }
      else
      {
        if (paramInt1 != paramInt4) {
          break;
        }
        localObject = null;
      }
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("The Integer did not match any specified value");
    throw ((Throwable)localObject);
  }
  
  public static Boolean toBooleanObject(Integer paramInteger)
  {
    int i;
    Boolean localBoolean;
    if (paramInteger == null)
    {
      i = 0;
      localBoolean = null;
    }
    for (;;)
    {
      return localBoolean;
      i = paramInteger.intValue();
      if (i == 0) {
        localBoolean = Boolean.FALSE;
      } else {
        localBoolean = Boolean.TRUE;
      }
    }
  }
  
  public static Boolean toBooleanObject(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    Object localObject = null;
    if (paramInteger1 == null) {
      if (paramInteger2 == null) {
        localObject = Boolean.TRUE;
      }
    }
    for (;;)
    {
      return (Boolean)localObject;
      if (paramInteger3 == null)
      {
        localObject = Boolean.FALSE;
      }
      else if (paramInteger4 != null)
      {
        boolean bool;
        do
        {
          localObject = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject).<init>("The Integer did not match any specified value");
          throw ((Throwable)localObject);
          bool = paramInteger1.equals(paramInteger2);
          if (bool)
          {
            localObject = Boolean.TRUE;
            break;
          }
          bool = paramInteger1.equals(paramInteger3);
          if (bool)
          {
            localObject = Boolean.FALSE;
            break;
          }
          bool = paramInteger1.equals(paramInteger4);
        } while (!bool);
      }
    }
  }
  
  public static Boolean toBooleanObject(String paramString)
  {
    Object localObject = "true";
    boolean bool = ((String)localObject).equalsIgnoreCase(paramString);
    if (bool) {
      localObject = Boolean.TRUE;
    }
    for (;;)
    {
      return (Boolean)localObject;
      localObject = "false";
      bool = ((String)localObject).equalsIgnoreCase(paramString);
      if (bool)
      {
        localObject = Boolean.FALSE;
      }
      else
      {
        localObject = "on";
        bool = ((String)localObject).equalsIgnoreCase(paramString);
        if (bool)
        {
          localObject = Boolean.TRUE;
        }
        else
        {
          localObject = "off";
          bool = ((String)localObject).equalsIgnoreCase(paramString);
          if (bool)
          {
            localObject = Boolean.FALSE;
          }
          else
          {
            localObject = "yes";
            bool = ((String)localObject).equalsIgnoreCase(paramString);
            if (bool)
            {
              localObject = Boolean.TRUE;
            }
            else
            {
              localObject = "no";
              bool = ((String)localObject).equalsIgnoreCase(paramString);
              if (bool)
              {
                localObject = Boolean.FALSE;
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
  }
  
  public static Boolean toBooleanObject(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = null;
    if (paramString1 == null) {
      if (paramString2 == null) {
        localObject = Boolean.TRUE;
      }
    }
    for (;;)
    {
      return (Boolean)localObject;
      if (paramString3 == null)
      {
        localObject = Boolean.FALSE;
      }
      else if (paramString4 != null)
      {
        boolean bool;
        do
        {
          localObject = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject).<init>("The String did not match any specified value");
          throw ((Throwable)localObject);
          bool = paramString1.equals(paramString2);
          if (bool)
          {
            localObject = Boolean.TRUE;
            break;
          }
          bool = paramString1.equals(paramString3);
          if (bool)
          {
            localObject = Boolean.FALSE;
            break;
          }
          bool = paramString1.equals(paramString4);
        } while (!bool);
      }
    }
  }
  
  public static Boolean toBooleanObject(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE) {
      return localBoolean;
    }
  }
  
  public static int toInteger(Boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramBoolean == null) {
      return paramInt3;
    }
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (;;)
    {
      paramInt3 = paramInt1;
      break;
      paramInt1 = paramInt2;
    }
  }
  
  public static int toInteger(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  public static int toInteger(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean) {}
    for (;;)
    {
      return paramInt1;
      paramInt1 = paramInt2;
    }
  }
  
  public static Integer toIntegerObject(Boolean paramBoolean)
  {
    boolean bool;
    Integer localInteger;
    if (paramBoolean == null)
    {
      bool = false;
      localInteger = null;
    }
    for (;;)
    {
      return localInteger;
      bool = paramBoolean.booleanValue();
      if (bool) {
        localInteger = NumberUtils.INTEGER_ONE;
      } else {
        localInteger = NumberUtils.INTEGER_ZERO;
      }
    }
  }
  
  public static Integer toIntegerObject(Boolean paramBoolean, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3)
  {
    if (paramBoolean == null) {
      return paramInteger3;
    }
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (;;)
    {
      paramInteger3 = paramInteger1;
      break;
      paramInteger1 = paramInteger2;
    }
  }
  
  public static Integer toIntegerObject(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Integer localInteger = NumberUtils.INTEGER_ONE;; localInteger = NumberUtils.INTEGER_ZERO) {
      return localInteger;
    }
  }
  
  public static Integer toIntegerObject(boolean paramBoolean, Integer paramInteger1, Integer paramInteger2)
  {
    if (paramBoolean) {}
    for (;;)
    {
      return paramInteger1;
      paramInteger1 = paramInteger2;
    }
  }
  
  public static String toString(Boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    if (paramBoolean == null) {
      return paramString3;
    }
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (;;)
    {
      paramString3 = paramString1;
      break;
      paramString1 = paramString2;
    }
  }
  
  public static String toString(boolean paramBoolean, String paramString1, String paramString2)
  {
    if (paramBoolean) {}
    for (;;)
    {
      return paramString1;
      paramString1 = paramString2;
    }
  }
  
  public static String toStringOnOff(Boolean paramBoolean)
  {
    return toString(paramBoolean, "on", "off", null);
  }
  
  public static String toStringOnOff(boolean paramBoolean)
  {
    return toString(paramBoolean, "on", "off");
  }
  
  public static String toStringTrueFalse(Boolean paramBoolean)
  {
    return toString(paramBoolean, "true", "false", null);
  }
  
  public static String toStringTrueFalse(boolean paramBoolean)
  {
    return toString(paramBoolean, "true", "false");
  }
  
  public static String toStringYesNo(Boolean paramBoolean)
  {
    return toString(paramBoolean, "yes", "no", null);
  }
  
  public static String toStringYesNo(boolean paramBoolean)
  {
    return toString(paramBoolean, "yes", "no");
  }
  
  public static Boolean xor(Boolean[] paramArrayOfBoolean)
  {
    Object localObject;
    if (paramArrayOfBoolean == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Array must not be null");
      throw ((Throwable)localObject);
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Array is empty");
      throw ((Throwable)localObject);
    }
    boolean[] arrayOfBoolean = null;
    for (;;)
    {
      try
      {
        arrayOfBoolean = ArrayUtils.toPrimitive(paramArrayOfBoolean);
        boolean bool = xor(arrayOfBoolean);
        if (bool)
        {
          localObject = Boolean.TRUE;
          return (Boolean)localObject;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The array must not contain any null elements");
        throw ((Throwable)localObject);
      }
      localObject = Boolean.FALSE;
    }
  }
  
  public static boolean xor(boolean[] paramArrayOfBoolean)
  {
    boolean bool = false;
    int i = 1;
    IllegalArgumentException localIllegalArgumentException;
    if (paramArrayOfBoolean == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Array must not be null");
      throw localIllegalArgumentException;
    }
    int j = paramArrayOfBoolean.length;
    if (j == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Array is empty");
      throw localIllegalArgumentException;
    }
    int k = 0;
    int m = 0;
    for (;;)
    {
      j = paramArrayOfBoolean.length;
      if (m >= j) {
        break;
      }
      j = paramArrayOfBoolean[m];
      if (j != 0)
      {
        if (k >= i) {
          break label98;
        }
        k += 1;
      }
      m += 1;
    }
    if (k == i) {}
    for (;;)
    {
      bool = i;
      label98:
      return bool;
      i = 0;
      localIllegalArgumentException = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/BooleanUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */