package com.vvt.capture.wa.a;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.e;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
  extends b
{
  private int b = 0;
  private String c = "";
  private String d = "";
  private boolean e = false;
  private List f;
  private boolean g;
  private List h;
  private d i;
  private com.vvt.im.events.info.c j;
  private f k;
  private com.vvt.im.events.info.b l;
  
  public c()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.f = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.h = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((d)localObject).<init>();
    a((d)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((com.vvt.im.events.info.c)localObject).<init>();
    a((com.vvt.im.events.info.c)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.k = ((f)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((com.vvt.im.events.info.b)localObject).<init>();
    this.l = ((com.vvt.im.events.info.b)localObject);
  }
  
  public String a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(a parama)
  {
    this.f.add(parama);
  }
  
  public void a(com.vvt.im.events.info.b paramb)
  {
    this.l = paramb;
  }
  
  public void a(com.vvt.im.events.info.c paramc)
  {
    this.j = paramc;
  }
  
  public void a(d paramd)
  {
    this.i = paramd;
  }
  
  public void a(e parame)
  {
    this.h.add(parame);
  }
  
  public void a(f paramf)
  {
    this.k = paramf;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public List b()
  {
    return this.f;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public List c()
  {
    return this.h;
  }
  
  public d d()
  {
    return this.i;
  }
  
  public com.vvt.im.events.info.c e()
  {
    return this.j;
  }
  
  public f f()
  {
    return this.k;
  }
  
  public com.vvt.im.events.info.b g()
  {
    return this.l;
  }
  
  public int j()
  {
    return this.b;
  }
  
  public String toString()
  {
    Object localObject1 = "";
    try
    {
      Object localObject2 = this.h;
      localObject2 = ((List)localObject2).iterator();
      boolean bool1;
      for (Object localObject3 = localObject1;; localObject3 = localObject1)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject2).next();
        localObject1 = (e)localObject1;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject1 = ((e)localObject1).toString();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = "";
      localObject2 = this.f;
      Object localObject4 = ((List)localObject2).iterator();
      for (localObject2 = localObject1;; localObject2 = localObject1)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject4).next();
        localObject1 = (a)localObject1;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
        localObject1 = ((a)localObject1).toString();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = "textRepresentation: %s\nisGroupChat: %s\ndateTime:%s\ndata:%s\ndirection: %s\nspeakerUid: %s\nspeakerName: %s\nsenderStatusMessage: %s\nsenderProfilePicPath: %s\nsenderLocation: %s\nconversationId: %s\nconversationTitle: %s\nconversationProfilePicPath: %s\nisHasMedia: %s\nattachments size: %s\nattachmentData: %s\nparticipants size: %s\nparticipantData: %s\nshareLocationData: %s\nownerData:\n%s";
      int m = 20;
      localObject4 = new Object[m];
      int n = 0;
      Object localObject5 = null;
      int i1 = this.b;
      Object localObject6 = Integer.valueOf(i1);
      localObject4[0] = localObject6;
      n = 1;
      boolean bool2 = this.e;
      localObject6 = Boolean.valueOf(bool2);
      localObject4[n] = localObject6;
      n = 2;
      localObject6 = this.d;
      localObject4[n] = localObject6;
      n = 3;
      localObject6 = this.c;
      localObject4[n] = localObject6;
      n = 4;
      localObject6 = this.a;
      localObject4[n] = localObject6;
      n = 5;
      localObject6 = this.k;
      localObject6 = ((f)localObject6).a();
      localObject4[n] = localObject6;
      n = 6;
      localObject6 = this.k;
      localObject6 = ((f)localObject6).b();
      localObject4[n] = localObject6;
      n = 7;
      localObject6 = this.k;
      localObject6 = ((f)localObject6).c();
      localObject4[n] = localObject6;
      n = 8;
      localObject6 = this.k;
      localObject6 = ((f)localObject6).f();
      localObject4[n] = localObject6;
      n = 9;
      localObject6 = this.k;
      localObject6 = ((f)localObject6).d();
      localObject6 = ((com.vvt.im.events.info.c)localObject6).toString();
      localObject4[n] = localObject6;
      n = 10;
      localObject6 = this.l;
      localObject6 = ((com.vvt.im.events.info.b)localObject6).a();
      localObject4[n] = localObject6;
      n = 11;
      localObject6 = this.l;
      localObject6 = ((com.vvt.im.events.info.b)localObject6).b();
      localObject4[n] = localObject6;
      n = 12;
      localObject6 = this.l;
      localObject6 = ((com.vvt.im.events.info.b)localObject6).d();
      localObject4[n] = localObject6;
      n = 13;
      bool2 = this.g;
      localObject6 = Boolean.valueOf(bool2);
      localObject4[n] = localObject6;
      n = 14;
      localObject6 = this.f;
      int i2 = ((List)localObject6).size();
      localObject6 = Integer.valueOf(i2);
      localObject4[n] = localObject6;
      n = 15;
      localObject4[n] = localObject2;
      int i3 = 16;
      localObject5 = this.h;
      n = ((List)localObject5).size();
      localObject5 = Integer.valueOf(n);
      localObject4[i3] = localObject5;
      i3 = 17;
      localObject4[i3] = localObject3;
      i3 = 18;
      localObject3 = this.j;
      localObject3 = ((com.vvt.im.events.info.c)localObject3).toString();
      localObject4[i3] = localObject3;
      i3 = 19;
      localObject3 = this.i;
      localObject3 = ((d)localObject3).toString();
      localObject4[i3] = localObject3;
      localObject1 = String.format((String)localObject1, (Object[])localObject4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "Error on .tostring.";
      }
    }
    return (String)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */