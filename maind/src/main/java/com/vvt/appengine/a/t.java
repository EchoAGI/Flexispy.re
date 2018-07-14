package com.vvt.appengine.a;

import java.io.File;
import java.util.Comparator;

class t
  implements Comparator
{
  t(q paramq) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getName();
    String str2 = paramFile2.getName();
    return str1.compareTo(str2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */