package com.vvt.aa;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  public static String a()
  {
    Object localObject1 = b();
    boolean bool1 = com.vvt.ag.b.a((String)localObject1);
    String str;
    if (bool1)
    {
      localObject1 = Build.MANUFACTURER;
      str = Build.MODEL;
      boolean bool2 = str.startsWith((String)localObject1);
      if (!bool2) {
        break label38;
      }
    }
    label38:
    Object localObject2;
    for (localObject1 = com.vvt.ag.b.f(str);; localObject1 = (String)localObject2 + str)
    {
      return (String)localObject1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = com.vvt.ag.b.f((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = " ";
    }
  }
  
  public static boolean a(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    int i = localTelephonyManager.getPhoneType();
    if (i == 0)
    {
      i = 0;
      localTelephonyManager = null;
    }
    for (;;)
    {
      return i;
      int j = 1;
    }
  }
  
  public static boolean a(String paramString)
  {
    String str1 = "[0-9]+";
    String str2 = paramString.trim();
    String str3 = "+";
    boolean bool = str2.startsWith(str3);
    if (bool) {
      str1 = "\\+[0-9]+";
    }
    return Pattern.compile(str1).matcher(paramString).matches();
  }
  
  public static String b()
  {
    String str = null;
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      if (localBluetoothAdapter != null) {
        str = localBluetoothAdapter.getName();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return str;
  }
  
  public static boolean b(Context paramContext)
  {
    Object localObject1 = paramContext.getPackageManager();
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        Object localObject3 = new Class[bool1];
        int i = 0;
        Object localObject4 = null;
        Object localObject5 = String.class;
        localObject3[0] = localObject5;
        localObject4 = localObject1.getClass();
        localObject5 = "hasSystemFeature";
        localObject3 = ((Class)localObject4).getMethod((String)localObject5, (Class[])localObject3);
        i = 1;
        localObject4 = new Object[i];
        localObject5 = null;
        String str = "android.hardware.telephony";
        localObject4[0] = str;
        localObject1 = ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
        bool1 = localObject1 instanceof Boolean;
        if (!bool1) {
          continue;
        }
        localObject1 = (Boolean)localObject1;
        bool2 = ((Boolean)localObject1).booleanValue();
      }
      catch (Exception localException)
      {
        boolean bool2 = false;
        Object localObject2 = null;
        continue;
      }
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public static long c(Context paramContext)
  {
    l1 = 0L;
    try
    {
      ActivityManager.MemoryInfo localMemoryInfo = new android/app/ActivityManager$MemoryInfo;
      localMemoryInfo.<init>();
      Object localObject1 = "activity";
      localObject1 = paramContext.getSystemService((String)localObject1);
      localObject1 = (ActivityManager)localObject1;
      ((ActivityManager)localObject1).getMemoryInfo(localMemoryInfo);
      long l2 = localMemoryInfo.availMem;
      long l3 = 1048576L;
      l4 = l2 / l3;
    }
    finally
    {
      for (;;)
      {
        long l4 = l1;
      }
    }
    return l4;
  }
  
  public static boolean d(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    int i = localAudioManager.getMode();
    int k = 2;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localAudioManager = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/aa/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */