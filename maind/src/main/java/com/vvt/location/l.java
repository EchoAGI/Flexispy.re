package com.vvt.location;

import android.os.ConditionVariable;
import com.vvt.http.a.a;
import com.vvt.http.a.b;
import com.vvt.http.d;

class l
  implements d
{
  private ConditionVariable a;
  private Exception b;
  private a c;
  
  public l(ConditionVariable paramConditionVariable)
  {
    this.a = paramConditionVariable;
  }
  
  private void c()
  {
    this.a.open();
  }
  
  public Exception a()
  {
    return this.b;
  }
  
  public void a(int paramInt, Exception paramException)
  {
    this.b = paramException;
    c();
  }
  
  public void a(a parama)
  {
    this.c = parama;
    c();
  }
  
  public void a(b paramb) {}
  
  public void a(Exception paramException)
  {
    this.b = paramException;
    c();
  }
  
  public a b()
  {
    return this.c;
  }
  
  public void b(a parama)
  {
    this.c = parama;
    c();
  }
  
  public void b(Exception paramException)
  {
    this.b = paramException;
    c();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */