package com.vvt.capture.a;

import java.io.File;
import java.io.FilenameFilter;

class m
  implements FilenameFilter
{
  m(l paraml) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    String str = l.a(this.a);
    return paramString.startsWith(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/a/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */