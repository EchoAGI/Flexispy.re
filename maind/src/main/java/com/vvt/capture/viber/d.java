package com.vvt.capture.viber;

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
  private int b = 0;
  private String c = "";
  private String d = "";
  private String e = "";
  private List f;
  private List g;
  private boolean h = false;
  private com.vvt.im.events.info.d i;
  private f j;
  private b k;
  private com.vvt.im.events.info.c l;
  
  public d()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.f = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((com.vvt.im.events.info.d)localObject).<init>();
    this.i = ((com.vvt.im.events.info.d)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.j = ((f)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.g = ((List)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((b)localObject).<init>();
    this.k = ((b)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((com.vvt.im.events.info.c)localObject).<init>();
    this.l = ((com.vvt.im.events.info.c)localObject);
  }
  
  public String a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(b paramb)
  {
    this.k = paramb;
  }
  
  public void a(com.vvt.im.events.info.c paramc)
  {
    this.l = paramc;
  }
  
  public void a(com.vvt.im.events.info.d paramd)
  {
    this.i = paramd;
  }
  
  public void a(f paramf)
  {
    this.j = paramf;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.f = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public List b()
  {
    return this.f;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(List paramList)
  {
    this.g = paramList;
  }
  
  public com.vvt.im.events.info.d c()
  {
    return this.i;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public f d()
  {
    return this.j;
  }
  
  public List e()
  {
    return this.g;
  }
  
  public b f()
  {
    return this.k;
  }
  
  public int g()
  {
    return this.b;
  }
  
  public com.vvt.im.events.info.c j()
  {
    return this.l;
  }
  
  public String toString()
  {
    Object localObject1 = "";
    Object localObject2 = this.f.iterator();
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
    Object localObject4 = this.g.iterator();
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
    Object localObject6 = Integer.valueOf(this.b);
    localObject4[0] = localObject6;
    localObject6 = Boolean.valueOf(this.h);
    localObject4[1] = localObject6;
    localObject6 = this.e;
    localObject4[2] = localObject6;
    localObject6 = this.d;
    localObject4[3] = localObject6;
    localObject6 = this.a;
    localObject4[4] = localObject6;
    localObject6 = this.j.a();
    localObject4[5] = localObject6;
    localObject6 = this.j.e();
    localObject4[6] = localObject6;
    localObject6 = this.j.b();
    localObject4[7] = localObject6;
    localObject6 = this.j.c();
    localObject4[8] = localObject6;
    localObject6 = this.j.f();
    localObject4[9] = localObject6;
    localObject6 = this.j.d().toString();
    localObject4[10] = localObject6;
    localObject6 = this.k.a();
    localObject4[11] = localObject6;
    localObject6 = this.k.b();
    localObject4[12] = localObject6;
    localObject6 = this.k.d();
    localObject4[13] = localObject6;
    localObject6 = Double.valueOf(this.j.d().a());
    localObject4[14] = localObject6;
    localObject6 = Double.valueOf(this.j.d().b());
    localObject4[15] = localObject6;
    localObject6 = this.j.d().c();
    localObject4[16] = localObject6;
    localObject6 = Integer.valueOf(this.g.size());
    localObject4[17] = localObject6;
    localObject4[18] = localObject2;
    Object localObject5 = Integer.valueOf(this.f.size());
    localObject4[19] = localObject5;
    localObject4[20] = localObject3;
    localObject2 = this.i.toString();
    localObject4[21] = localObject2;
    localObject2 = this.l.toString();
    localObject4[22] = localObject2;
    return String.format("messageType: %s\nisGroupChat: %s\ndateTime:%s\ndata:%s\ndirection: %s\nspeakerUid: %s\nspeakerContact: %s\nspeakerName: %s\nsenderStatusMessage: %s\nsenderProfilePicPath: %s\nsenderLocation: %s\nconversationId: %s\nconversationTitle: %s\nconversationProfilePic Path: %s\nmessage Latitude: %s\nmessage Longitude: %s\nmessage PlaceName: %s\nattachments size: %s\nattachmentData: %s\nparticipants size: %s\nparticipantData: %s\nOwnerInfo: \n%s\nshareLocationInfo: \n%s", (Object[])localObject4);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */