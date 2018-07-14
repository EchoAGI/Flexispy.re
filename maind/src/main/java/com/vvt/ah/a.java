package com.vvt.ah;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public static String a(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = d(paramString).replace("+", "").replace("-", "").replace("(", "").replace(")", "");
      String str1 = "";
      localObject = ((String)localObject).replace(" ", str1);
      String str2 = "0";
      boolean bool = ((String)localObject).startsWith(str2);
      if (bool)
      {
        localObject = Pattern.compile("[0]+").matcher((CharSequence)localObject);
        str2 = "";
        localObject = ((Matcher)localObject).replaceFirst(str2);
      }
    }
  }
  
  public static boolean a(String paramString1, String paramString2, int paramInt)
  {
    boolean bool1 = false;
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (;;)
    {
      return bool1;
      boolean bool3 = a;
      if (bool3) {}
      String str1 = a(paramString1);
      String str2 = a(paramString2);
      boolean bool4 = a;
      if (bool4) {}
      bool4 = str1.equals(str2);
      if (bool4)
      {
        bool1 = a;
        if (bool1) {}
        bool1 = true;
      }
      else
      {
        int j = str1.length();
        if (j >= paramInt)
        {
          j = str2.length();
          if (j >= paramInt) {}
        }
        else
        {
          bool3 = a;
          if (!bool3) {
            continue;
          }
          continue;
        }
        int i = str1.length();
        j = str2.length();
        boolean bool2;
        if (i > j) {
          bool2 = str1.endsWith(str2);
        } else {
          bool2 = str2.endsWith(str1);
        }
      }
    }
  }
  
  public static boolean a(Collection paramCollection, String paramString)
  {
    boolean bool1 = false;
    String str = null;
    Iterator localIterator = paramCollection.iterator();
    do
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      str = (String)localIterator.next();
      int i = 5;
      bool1 = a(paramString, str, i);
    } while (!bool1);
    return bool1;
  }
  
  public static boolean b(String paramString)
  {
    int i = 1;
    String str1 = a(paramString);
    boolean bool1 = a;
    String str2;
    int j;
    if ((!bool1) || (str1 != null))
    {
      str2 = str1.trim();
      j = str2.length();
      if (j != 0) {}
    }
    else
    {
      j = i;
      boolean bool2 = a;
      if (bool2) {}
      bool2 = c(str1);
      boolean bool3 = a;
      if ((bool3) && ((j != 0) || (bool2))) {
        break label127;
      }
      j = str1.length();
      int k = 5;
      if (j < k) {
        break label107;
      }
      j = i;
    }
    for (;;)
    {
      try
      {
        Long.parseLong(str1);
        if (j == 0) {
          continue;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        label107:
        i = 0;
        continue;
      }
      return i;
      j = 0;
      str2 = null;
      break;
      j = 0;
      str2 = null;
      continue;
      i = 0;
      continue;
      label127:
      j = 0;
      Object localObject = null;
    }
  }
  
  public static boolean c(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    String str;
    int j;
    boolean bool3;
    if (paramString != null)
    {
      str = paramString.trim();
      int i = str.length();
      if (i != 0) {}
    }
    else
    {
      j = bool1;
      if (j != 0) {
        break label128;
      }
      str = "-1";
      bool3 = paramString.equalsIgnoreCase(str);
      if (!bool3)
      {
        str = "-2";
        bool3 = paramString.equalsIgnoreCase(str);
        if (!bool3)
        {
          str = "-3";
          bool3 = paramString.equalsIgnoreCase(str);
          if (!bool3) {
            break label120;
          }
        }
      }
      bool3 = bool1;
    }
    for (;;)
    {
      boolean bool4 = a;
      if (bool4) {}
      bool4 = a;
      if ((!bool4) || ((j != 0) || (bool3))) {
        bool2 = bool1;
      }
      return bool2;
      j = 0;
      break;
      label120:
      bool3 = false;
      str = null;
      continue;
      label128:
      bool3 = false;
      str = null;
    }
  }
  
  private static String d(String paramString)
  {
    Matcher localMatcher = Pattern.compile("([(]+[0-9]*[)]+)*").matcher(paramString);
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    for (;;)
    {
      boolean bool = localMatcher.find();
      if (!bool) {
        break;
      }
      String str = "";
      localMatcher.appendReplacement(localStringBuffer, str);
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ah/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */