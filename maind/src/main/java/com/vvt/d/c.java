package com.vvt.d;

import android.content.ContentResolver;
import android.net.Uri;

class c
  extends com.vvt.i.a
{
  private ContentResolver b;
  
  public c(a parama, ContentResolver paramContentResolver)
  {
    super(paramContentResolver);
    this.b = paramContentResolver;
  }
  
  protected Uri a()
  {
    return d.a(this.b, 0);
  }
  
  protected void b()
  {
    a.a(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/d/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */