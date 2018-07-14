package com.vvt.capture.hangouts;

import com.vvt.im.events.info.a;
import com.vvt.im.events.info.b;
import com.vvt.im.events.info.c;
import com.vvt.im.events.info.d;
import com.vvt.im.events.info.e;
import com.vvt.im.events.info.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HangoutsData
{
  private int a = 0;
  private String b = "";
  private long c = -1;
  private String d = "";
  private HangoutsData.Direction e;
  private String f = "";
  private List g;
  private List h;
  private boolean i = false;
  private d j;
  private f k;
  private b l;
  private c m;
  
  public HangoutsData()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.g = ((List)localObject);
    localObject = new com/vvt/im/events/info/d;
    ((d)localObject).<init>();
    this.j = ((d)localObject);
    localObject = new com/vvt/im/events/info/f;
    ((f)localObject).<init>();
    this.k = ((f)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.h = ((List)localObject);
    localObject = new com/vvt/im/events/info/b;
    ((b)localObject).<init>();
    this.l = ((b)localObject);
    localObject = new com/vvt/im/events/info/c;
    ((c)localObject).<init>();
    this.m = ((c)localObject);
  }
  
  public long a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(HangoutsData.Direction paramDirection)
  {
    this.e = paramDirection;
  }
  
  public void a(b paramb)
  {
    this.l = paramb;
  }
  
  public void a(c paramc)
  {
    this.m = paramc;
  }
  
  public void a(d paramd)
  {
    this.j = paramd;
  }
  
  public void a(f paramf)
  {
    this.k = paramf;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(List paramList)
  {
    this.g = paramList;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
  
  public void b(List paramList)
  {
    this.h = paramList;
  }
  
  public HangoutsData.Direction c()
  {
    return this.e;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public List d()
  {
    return this.g;
  }
  
  public d e()
  {
    return this.j;
  }
  
  public f f()
  {
    return this.k;
  }
  
  public List g()
  {
    return this.h;
  }
  
  public b h()
  {
    return this.l;
  }
  
  public int i()
  {
    return this.a;
  }
  
  public c j()
  {
    return this.m;
  }
  
  public String toString()
  {
    Object localObject1 = "";
    Object localObject2 = this.g.iterator();
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
    localObject2 = this.h;
    if (localObject2 != null)
    {
      localObject4 = this.h.iterator();
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
    }
    localObject2 = localObject1;
    Object localObject4 = "HangoutsData { messageType: %s, isGroupChat: %s, dateTime:%s, data:%s, direction: %s, speakerUid: %s, speakerContact: %s, speakerName: %s, senderStatusMessage: %s, senderProfilePicPath: %s, senderLocation: %s, conversationId: %s, conversationTitle: %s, conversationProfilePic Path: %s, message Latitude: %s, message Longitude: %s, message PlaceName: %s, attachments size: %s, attachmentData: %s, participants size: %s, participantData: %s, OwnerInfo: \n%s, shareLocationInfo: \n%s}";
    Object localObject5 = new Object[23];
    localObject1 = Integer.valueOf(this.a);
    localObject5[0] = localObject1;
    Object localObject6 = Boolean.valueOf(this.i);
    localObject5[1] = localObject6;
    localObject6 = this.f;
    localObject5[2] = localObject6;
    localObject6 = this.d;
    localObject5[3] = localObject6;
    localObject6 = this.e;
    localObject5[4] = localObject6;
    localObject6 = this.k.a();
    localObject5[5] = localObject6;
    localObject6 = this.k.e();
    localObject5[6] = localObject6;
    localObject6 = this.k.b();
    localObject5[7] = localObject6;
    localObject6 = this.k.c();
    localObject5[8] = localObject6;
    localObject6 = this.k.f();
    localObject5[9] = localObject6;
    localObject6 = this.k.d().toString();
    localObject5[10] = localObject6;
    localObject6 = this.l.a();
    localObject5[11] = localObject6;
    localObject6 = this.l.b();
    localObject5[12] = localObject6;
    localObject6 = this.l.d();
    localObject5[13] = localObject6;
    localObject6 = Double.valueOf(this.k.d().a());
    localObject5[14] = localObject6;
    double d1 = this.k.d().b();
    localObject6 = Double.valueOf(d1);
    localObject5[15] = localObject6;
    int n = 16;
    localObject6 = this.k.d().c();
    localObject5[n] = localObject6;
    int i1 = 17;
    localObject1 = this.h;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      n = ((List)localObject1).size();
    }
    for (;;)
    {
      localObject1 = Integer.valueOf(n);
      localObject5[i1] = localObject1;
      localObject5[18] = localObject2;
      localObject2 = Integer.valueOf(this.g.size());
      localObject5[19] = localObject2;
      localObject5[20] = localObject3;
      localObject3 = this.j.toString();
      localObject5[21] = localObject3;
      localObject3 = this.m.toString();
      localObject5[22] = localObject3;
      return String.format((String)localObject4, (Object[])localObject5);
      n = 0;
      localObject1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/HangoutsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */