package com.vvt.g;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static final boolean a = com.vvt.h.a.a;
  
  public static String a(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = b(paramString).replace("+", "").replace("-", "").replace("(", "").replace(")", "");
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
  
  private static String b(String paramString)
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/g/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */