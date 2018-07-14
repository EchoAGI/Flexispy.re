package com.vvt.b;

import java.io.File;

public class b
{
  public static String a(String paramString1, String paramString2)
  {
    File localFile1 = new java/io/File;
    localFile1.<init>(paramString1);
    File localFile2 = new java/io/File;
    localFile2.<init>(localFile1, paramString2);
    return localFile2.getPath();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/b/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */