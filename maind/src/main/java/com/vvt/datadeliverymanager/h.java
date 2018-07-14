package com.vvt.datadeliverymanager;

import com.vvt.datadeliverymanager.a.a;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.phoenix.prot.command.b;

public class h
{
  private int a;
  private b b;
  private a c;
  private PriorityRequest d;
  private DeliveryRequestType e;
  private long f;
  private int g;
  private int h;
  private DataProviderType i;
  private long j;
  private boolean k;
  private boolean l;
  private boolean m;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void a(a parama)
  {
    this.c = parama;
  }
  
  public void a(DataProviderType paramDataProviderType)
  {
    this.i = paramDataProviderType;
  }
  
  public void a(DeliveryRequestType paramDeliveryRequestType)
  {
    this.e = paramDeliveryRequestType;
  }
  
  public void a(PriorityRequest paramPriorityRequest)
  {
    this.d = paramPriorityRequest;
  }
  
  public void a(b paramb)
  {
    this.b = paramb;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.j = paramLong;
  }
  
  public void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean b()
  {
    return this.k;
  }
  
  public b c()
  {
    return this.b;
  }
  
  public void c(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void c(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public a d()
  {
    return this.c;
  }
  
  public PriorityRequest e()
  {
    return this.d;
  }
  
  public DeliveryRequestType f()
  {
    return this.e;
  }
  
  public long g()
  {
    return this.f;
  }
  
  public int h()
  {
    return this.g;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public DataProviderType j()
  {
    return this.i;
  }
  
  public long k()
  {
    return this.j;
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public boolean m()
  {
    return this.m;
  }
  
  public String n()
  {
    int n = this.a;
    Object localObject;
    switch (n)
    {
    default: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("CALLER ID:");
      int i1 = this.a;
      localObject = ((StringBuilder)localObject).append(i1);
      String str = " NOT DEFINED!";
      localObject = str;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = "ACTIVATION_MANAGER";
      continue;
      localObject = "ADDRESS_BOOK_MANAGER_ID";
      continue;
      localObject = "EVENT_DELIVERY_ID";
      continue;
      localObject = "GET_APP_PROFILE";
      continue;
      localObject = "GET_COMMUNICATION_DIRECTIVE";
      continue;
      localObject = "GET_TIME";
      continue;
      localObject = "GET_URL_PROFILE";
      continue;
      localObject = "PUSH_NOTIFICATION_MANAGER_ID";
      continue;
      localObject = "REMOT_COMMAND_MANAGER_ID";
      continue;
      localObject = "REQUEST_HEART_BEAT";
      continue;
      localObject = "SEND_BOOKMARKS";
      continue;
      localObject = "SEND_INSTALLED_APP";
      continue;
      localObject = "SEND_RUNNING_APP";
      continue;
      localObject = "SYNC_UPDATE_CONFIGURATIONS";
      continue;
      localObject = "SEND_HEARTBEAT";
      continue;
      localObject = "SEND_CALENDAR";
      continue;
      localObject = "SEND_PATTERN";
      continue;
      localObject = "SEND_PIN";
      continue;
      localObject = "GET_BINARY";
      continue;
      localObject = "SEND TEMPORAL APPLICATION CONTROL";
      continue;
      localObject = "GET TEMPORAL APPLICATION CONTROL";
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("DeliveryRequest {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" callerID =");
    String str = n();
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(" isReadyToResume =");
    str = String.valueOf(this.k);
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", commandID =");
    int n = this.b.a();
    localStringBuilder2.append(n);
    localStringBuilder2 = localStringBuilder1.append(", priorityRequest =");
    str = this.d.toString();
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", deliveryRequestType =");
    str = this.e.toString();
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", csId =");
    long l1 = this.f;
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", retryCount =");
    n = this.g;
    localStringBuilder2.append(n);
    localStringBuilder2 = localStringBuilder1.append(", maxRetryCount =");
    n = this.h;
    localStringBuilder2.append(n);
    localStringBuilder2 = localStringBuilder1.append(", dataProviderType =");
    str = this.i.toString();
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", delayTime =");
    l1 = this.j;
    localStringBuilder2.append(l1);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */