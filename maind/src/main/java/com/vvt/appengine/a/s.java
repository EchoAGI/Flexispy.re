package com.vvt.appengine.a;

import java.io.File;
import java.io.FilenameFilter;

class s
  implements FilenameFilter
{
  s(q paramq, String paramString) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    String str = this.a;
    return paramString.startsWith(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */