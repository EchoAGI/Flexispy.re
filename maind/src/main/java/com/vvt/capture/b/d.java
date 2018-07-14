package com.vvt.capture.b;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.e;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
  extends c
{
  private int c;
  private String d;
  private List e;
  private List f;
  private boolean g;
  private String h;
  private String i;
  private boolean j;
  private com.vvt.im.events.info.d k;
  private f l;
  private b m;
  private com.vvt.im.events.info.c n;
  private boolean o;
  
  public d()
  {
    a(0);
    this.d = "";
    this.g = false;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    a((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((com.vvt.im.events.info.d)localObject).<init>();
    a((com.vvt.im.events.info.d)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    a((f)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.f = ((List)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((b)localObject).<init>();
    a((b)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((com.vvt.im.events.info.c)localObject).<init>();
    a((com.vvt.im.events.info.c)localObject);
  }
  
  public String a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(b paramb)
  {
    this.m = paramb;
  }
  
  public void a(com.vvt.im.events.info.c paramc)
  {
    this.n = paramc;
  }
  
  public void a(com.vvt.im.events.info.d paramd)
  {
    this.k = paramd;
  }
  
  public void a(f paramf)
  {
    this.l = paramf;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.e = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public String b()
  {
    return this.i;
  }
  
  public void b(String paramString)
  {
    this.h = paramString;
  }
  
  public void b(List paramList)
  {
    this.f = paramList;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public List c()
  {
    return this.e;
  }
  
  public void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public com.vvt.im.events.info.d d()
  {
    return this.k;
  }
  
  public f e()
  {
    return this.l;
  }
  
  public void e(String paramString)
  {
    this.i = paramString;
  }
  
  public List f()
  {
    return this.f;
  }
  
  public b j()
  {
    return this.m;
  }
  
  public int k()
  {
    return this.c;
  }
  
  public com.vvt.im.events.info.c l()
  {
    return this.n;
  }
  
  public boolean m()
  {
    return this.o;
  }
  
  public String toString()
  {
    Object localObject1 = "";
    Object localObject2 = this.e.iterator();
    boolean bool;
    for (Object localObject3 = localObject1;; localObject3 = localObject1)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (e)((Iterator)localObject2).next();
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
      localObject1 = ((e)localObject1).toString();
      localObject1 = (String)localObject1;
    }
    localObject1 = "";
    Object localObject4 = this.f.iterator();
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (a)((Iterator)localObject4).next();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
      localObject1 = ((a)localObject1).toString();
      localObject1 = (String)localObject1;
    }
    localObject4 = new Object[23];
    Object localObject6 = Integer.valueOf(this.c);
    localObject4[0] = localObject6;
    localObject6 = Boolean.valueOf(this.g);
    localObject4[1] = localObject6;
    localObject6 = this.a;
    localObject4[2] = localObject6;
    localObject6 = this.d;
    localObject4[3] = localObject6;
    localObject6 = this.b;
    localObject4[4] = localObject6;
    localObject6 = this.l.a();
    localObject4[5] = localObject6;
    localObject6 = this.l.e();
    localObject4[6] = localObject6;
    localObject6 = this.l.b();
    localObject4[7] = localObject6;
    localObject6 = this.l.c();
    localObject4[8] = localObject6;
    localObject6 = this.l.f();
    localObject4[9] = localObject6;
    localObject6 = this.l.d().toString();
    localObject4[10] = localObject6;
    localObject6 = this.m.a();
    localObject4[11] = localObject6;
    localObject6 = this.m.b();
    localObject4[12] = localObject6;
    localObject6 = this.m.d();
    localObject4[13] = localObject6;
    localObject6 = Double.valueOf(this.l.d().a());
    localObject4[14] = localObject6;
    localObject6 = Double.valueOf(this.l.d().b());
    localObject4[15] = localObject6;
    localObject6 = this.l.d().c();
    localObject4[16] = localObject6;
    localObject6 = Boolean.valueOf(this.j);
    localObject4[17] = localObject6;
    localObject6 = Integer.valueOf(this.f.size());
    localObject4[18] = localObject6;
    localObject4[19] = localObject2;
    Object localObject5 = Integer.valueOf(this.e.size());
    localObject4[20] = localObject5;
    localObject4[21] = localObject3;
    localObject2 = this.k.toString();
    localObject4[22] = localObject2;
    return String.format("FacebookMessageData { type: %s, isGroupChat: %s, dateTime:%s, data:%s, direction: %s, speakerUid: %s, speakerContact: %s, speakerName: %s, senderStatusMessage: %s, senderProfilePicPath: %s, senderLocation: %s, conversationId: %s, conversationTitle: %s, conversationProfilePic Path: %s, message Latitude: %s, message Longitude: %s, message PlaceName: %s, isAttachment: %s, attachments size: %s, attachment data: %s, participants size: %s, participantData: %s, OwnerInfo: \n%s }", (Object[])localObject4);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */