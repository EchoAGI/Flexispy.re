package com.vvt.ag;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  public static String a(String paramString, int paramInt)
  {
    int i = 0;
    int j = paramString.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int k = 0;
    for (;;)
    {
      char c;
      if (k < j) {
        c = paramString.charAt(k);
      }
      try
      {
        String str = Character.toString(c);
        Object localObject = "UTF-8";
        localObject = str.getBytes((String)localObject);
        int m = localObject.length;
        i += m;
        if (i > paramInt) {
          return localStringBuilder.toString();
        }
        localStringBuilder.append(str);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;) {}
      }
      k += 1;
    }
  }
  
  public static String a(String paramString1, String paramString2)
  {
    boolean bool = c(paramString1);
    if (!bool)
    {
      bool = c(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      bool = paramString1.endsWith(paramString2);
      if (bool)
      {
        bool = false;
        int i = paramString1.length();
        int j = paramString2.length();
        i -= j;
        paramString1 = paramString1.substring(0, i);
      }
    }
  }
  
  public static String a(int... paramVarArgs)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      j = (char)paramVarArgs[i];
      String str = Character.toString(j);
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String a(Object[] paramArrayOfObject, String paramString)
  {
    int i = 0;
    int j;
    if (paramArrayOfObject == null) {
      j = 0;
    }
    StringBuffer localStringBuffer;
    for (Object localObject = null;; localObject = localStringBuffer.toString())
    {
      return (String)localObject;
      if (paramString == null) {
        paramString = "";
      }
      int k = paramArrayOfObject.length;
      if (k == 0)
      {
        j = 0;
        localObject = null;
        localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>(j);
        while (i < k)
        {
          if (i > 0) {
            localStringBuffer.append(paramString);
          }
          localObject = paramArrayOfObject[i];
          if (localObject != null)
          {
            localObject = paramArrayOfObject[i];
            localStringBuffer.append(localObject);
          }
          i += 1;
        }
      }
      localObject = paramArrayOfObject[0];
      if (localObject == null) {}
      for (j = 16;; j = ((String)localObject).length())
      {
        int m = paramString.length();
        j = (j + m) * k;
        break;
        localObject = paramArrayOfObject[0].toString();
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i > 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static String b(String paramString)
  {
    String str1;
    if (paramString == null) {
      str1 = "";
    }
    for (;;)
    {
      return str1;
      str1 = "null";
      boolean bool = paramString.equals(str1);
      if (bool)
      {
        str1 = "";
      }
      else
      {
        str1 = paramString.trim();
        String str2 = "";
        bool = str1.equals(str2);
        if (bool) {
          str1 = "";
        } else {
          str1 = paramString.trim();
        }
      }
    }
  }
  
  public static boolean c(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean d(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramString == null) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      int i = 0;
      for (;;)
      {
        int j = paramString.length();
        if (i >= j) {
          break label56;
        }
        j = paramString.charAt(i);
        if (j < 0) {
          break;
        }
        int k = 127;
        if (j > k) {
          break;
        }
        i += 1;
      }
      label56:
      bool2 = bool1;
    }
  }
  
  public static String e(String paramString)
  {
    return Pattern.compile("[^\000-﻿]", 66).matcher(paramString).replaceAll("");
  }
  
  public static String f(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      boolean bool1 = true;
      char[] arrayOfChar = paramString.toCharArray();
      int k = arrayOfChar.length;
      i = 0;
      label90:
      int j;
      for (int m = 0; m < k; m = j)
      {
        i = arrayOfChar[m];
        boolean bool2;
        if (bool1)
        {
          bool2 = Character.isLetter(i);
          if (bool2) {}
        }
        else
        {
          bool2 = Character.isWhitespace(i);
          if (!bool2) {
            break label90;
          }
        }
        char c = Character.toUpperCase(i);
        bool1 = Character.isWhitespace(c);
        localStringBuilder.append(c);
        j = m + 1;
      }
      paramString = localStringBuilder.toString();
    }
  }
  
  public static String g(String paramString)
  {
    byte[] arrayOfByte = Base64.decode(paramString.getBytes(), 0);
    String str = new java/lang/String;
    Charset localCharset = Charset.forName("UTF-8");
    str.<init>(arrayOfByte, localCharset);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ag/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */