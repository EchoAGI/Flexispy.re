package com.vvt.capture.qq;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class h {
  static volatile boolean a;
  static volatile boolean b;
  static Field c;
  static Field d;
  
  static {
    boolean bool = true;
    d = null;
    c = null;
    b = bool;
    a = bool;
  }
  
  public static String a(char[] paramArrayOfChar)
  {
    try
    {
      str1 = new java/lang/String;
      str1.<init>();
      boolean bool1 = b;
      if (!bool1) {
        break label133;
      }
      Object localObject1 = d;
      boolean bool2;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        localObject2 = "value";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
        d = (Field)localObject1;
        localObject1 = d;
        bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        localObject2 = "count";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
        c = (Field)localObject1;
        localObject1 = c;
        bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = d;
      ((Field)localObject1).set(str1, paramArrayOfChar);
      localObject1 = c;
      int i = paramArrayOfChar.length;
      Object localObject2 = Integer.valueOf(i);
      ((Field)localObject1).set(str1, localObject2);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        String str1;
        localNoSuchFieldException.printStackTrace();
        b = false;
        String str2 = new java/lang/String;
        str2.<init>(paramArrayOfChar);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        label133:
        localIllegalAccessException.printStackTrace();
      }
    }
    return str1;
  }
  
  public static char[] a(String paramString)
  {
    try
    {
      bool1 = a;
      if (!bool1) {
        break label72;
      }
      localObject1 = d;
      if (localObject1 == null)
      {
        localObject1 = String.class;
        String str = "value";
        localObject1 = ((Class)localObject1).getDeclaredField(str);
        d = (Field)localObject1;
        localObject1 = d;
        boolean bool2 = true;
        ((Field)localObject1).setAccessible(bool2);
      }
      localObject1 = d;
      localObject1 = ((Field)localObject1).get(paramString);
      localObject1 = (char[])localObject1;
      localObject1 = (char[])localObject1;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        localNoSuchFieldException.printStackTrace();
        a = false;
        boolean bool1 = false;
        Object localObject2 = null;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        label72:
        localIllegalAccessException.printStackTrace();
      }
    }
    return (char[])localObject1;
  }
  
  public static final String b(String paramString)
  {
    localObject = "MD5";
    try
    {
      localObject = MessageDigest.getInstance((String)localObject);
      byte[] arrayOfByte1 = paramString.getBytes();
      ((MessageDigest)localObject).update(arrayOfByte1);
      byte[] arrayOfByte2 = ((MessageDigest)localObject).digest();
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      int i = arrayOfByte2.length;
      int j = 0;
      localObject = null;
      int k = 0;
      arrayOfByte1 = null;
      while (k < i)
      {
        j = arrayOfByte2[k] & 0xFF;
        for (localObject = Integer.toHexString(j);; localObject = ((StringBuilder)localObject).toString())
        {
          int m = ((String)localObject).length();
          int n = 2;
          if (m >= n) {
            break;
          }
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>();
          String str = "0";
          localStringBuilder2 = localStringBuilder2.append(str);
          localObject = localStringBuilder2.append((String)localObject);
        }
        localStringBuilder1.append((String)localObject);
        j = k + 1;
        k = j;
      }
      localObject = localStringBuilder1.toString();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localNoSuchAlgorithmException.printStackTrace();
        localObject = "";
      }
    }
    return (String)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */