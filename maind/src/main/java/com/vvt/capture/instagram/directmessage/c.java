package com.vvt.capture.instagram.directmessage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c
  implements FilenameFilter
{
  c(Pattern paramPattern) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    return this.a.matcher(paramString).find();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */