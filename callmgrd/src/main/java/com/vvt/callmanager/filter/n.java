package com.vvt.callmanager.filter;

import android.os.Parcel;

import com.vvt.callmanager.Mitm;

public abstract class n
{
  private Mitm a;
  private n b;
  private n c;
  private o d;
  private int e;
  private int f;
  
  public n(Mitm paramf)
  {
    this.a = paramf;
    this.f = 0;
    this.e = 0;
  }
  
  private void a()
  {
    o localo = this.d;
    if (localo != null)
    {
      localo = this.d;
      localo.a();
    }
  }
  
  public abstract void a(Parcel paramParcel);
  
  public void a(n paramn)
  {
    this.b = paramn;
  }
  
  public void a(o paramo)
  {
    this.d = paramo;
  }
  
  public abstract void b(Parcel paramParcel);
  
  public void b(n paramn)
  {
    this.c = paramn;
  }
  
  protected void c(Parcel paramParcel)
  {
    int i = this.e;
    if (i == 0)
    {
      i = this.e + 1;
      this.e = i;
      i = this.f;
      if (i > 0) {
        a();
      }
    }
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((n)localObject).b(paramParcel);
    }
    for (;;)
    {
      return;
      localObject = this.a;
      ((Mitm)localObject).a(paramParcel);
    }
  }
  
  public void d()
  {
    int i = this.f;
    if (i == 0)
    {
      Parcel localParcel = i.a(i.b);
      d(localParcel);
    }
  }
  
  protected void d(Parcel paramParcel)
  {
    int i = this.f;
    if (i == 0)
    {
      i = this.f + 1;
      this.f = i;
      i = this.e;
      if (i > 0) {
        a();
      }
    }
    Object localObject = this.c;
    if (localObject != null)
    {
      localObject = this.c;
      ((n)localObject).a(paramParcel);
    }
    for (;;)
    {
      return;
      localObject = this.a;
      ((Mitm)localObject).b(paramParcel);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */