package com.vvt.autoupdate;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.util.Pair;
import com.vvt.aa.c;
import com.vvt.base.RunningMode;
import com.vvt.io.p;
import com.vvt.io.q;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import com.vvt.shell.f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d
{
  public static final String a;
  public static final String b;
  private static final boolean c;
  private static final boolean d;
  private static final boolean e;
  private static final boolean f;
  private static final String g;
  private static final String h;
  private static final List i;
  private String j;
  private Context k;
  
  static
  {
    int m = 1;
    c = com.vvt.ak.a.b;
    d = com.vvt.ak.a.a;
    e = com.vvt.ak.a.e;
    f = com.vvt.ak.a.d;
    Object[] arrayOfObject = new Object[m];
    arrayOfObject[0] = "product";
    g = String.format("assets/%s/", arrayOfObject);
    arrayOfObject = new Object[m];
    String str = com.vvt.m.b.a;
    arrayOfObject[0] = str;
    h = String.format("assets/%s/", arrayOfObject);
    arrayOfObject = new Object[2];
    arrayOfObject[0] = "product";
    arrayOfObject[m] = "arm64-v8a";
    a = String.format("%s/%s", arrayOfObject);
    arrayOfObject = new Object[m];
    str = com.vvt.m.b.b;
    arrayOfObject[0] = str;
    b = String.format("assets/%s", arrayOfObject);
    BinaryUpdateHelper.1 local1 = new com/vvt/autoupdate/BinaryUpdateHelper$1;
    local1.<init>();
    i = Collections.unmodifiableList(local1);
  }
  
  private void a(RunningMode paramRunningMode, Context paramContext, String paramString)
  {
    f localf = null;
    boolean bool1 = c;
    if (bool1) {}
    bool1 = com.vvt.aa.a.g();
    Object localObject1;
    Object localObject4;
    if (bool1)
    {
      localObject1 = "alsa_amixer_64";
      localObject4 = localObject1;
    }
    for (;;)
    {
      localObject1 = p.a(paramString, (String)localObject4);
      bool1 = ShellUtil.b((String)localObject1);
      if (bool1) {}
      try
      {
        bool1 = c;
        if (bool1) {}
        bool1 = true;
        ShellUtil.a(bool1);
        localf = f.b();
        bool1 = c;
        if (bool1) {}
        localObject1 = "rm -rf /system/usr/share/alsa;rm /system/xbin/alsa_amixer;";
        localf.a((String)localObject1);
        bool1 = c;
        if (bool1) {}
        localObject1 = "cd /system/usr/share;mkdir alsa;cd alsa;mkdir pcm;mkdir cards;";
        localf.a((String)localObject1);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa";
        str1 = "alsa.conf";
        String str2 = "644";
        String str3 = "u:object_r:system_file:s0";
        String str4 = "root";
        boolean bool3 = true;
        localObject6 = paramString;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/cards";
        str1 = "aliases.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "center_lfe.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "default.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "dmix.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "dpl.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "dsnoop.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "front.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "iec958.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "modem.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "rear.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "side.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "surround40.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "surround41.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "surround50.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "surround51.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        localObject1 = new com/vvt/r/b;
        localObject5 = "/system/usr/share/alsa/pcm";
        str1 = "surround71.conf";
        str2 = "644";
        str3 = "u:object_r:system_file:s0";
        str4 = "root";
        bool3 = true;
        ((com.vvt.r.b)localObject1).<init>((String)localObject5, paramString, str1, str2, str3, str4, bool3, localf);
        localArrayList.add(localObject1);
        bool1 = c;
        if (bool1) {}
        localObject5 = localArrayList.iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject5).next();
          localObject1 = (com.vvt.r.b)localObject1;
          bool4 = true;
          ((com.vvt.r.b)localObject1).a(bool4);
        }
      }
      catch (Exception localException)
      {
        String str1;
        bool1 = e;
        if (bool1) {}
        return;
        Object localObject2 = "alsa_amixer";
        localObject4 = localObject2;
        continue;
        localObject2 = p.a(paramString, (String)localObject4);
        Object localObject5 = "/system/xbin";
        Object localObject6 = "alsa_amixer";
        localObject5 = p.a((String)localObject5, (String)localObject6);
        localObject6 = new java/io/File;
        ((File)localObject6).<init>((String)localObject2);
        boolean bool4 = ((File)localObject6).exists();
        if (bool4)
        {
          int n = 200;
          ShellUtil.a((String)localObject2, (String)localObject5, n);
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          str1 = "chown root:root ";
          localObject6 = ((StringBuilder)localObject6).append(str1);
          localObject6 = ((StringBuilder)localObject6).append((String)localObject5);
          str1 = ";";
          localObject6 = ((StringBuilder)localObject6).append(str1);
          localObject6 = ((StringBuilder)localObject6).toString();
          localf.a((String)localObject6);
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          str1 = "chmod 755 ";
          localObject6 = ((StringBuilder)localObject6).append(str1);
          localObject6 = ((StringBuilder)localObject6).append((String)localObject5);
          str1 = ";";
          localObject6 = ((StringBuilder)localObject6).append(str1);
          localObject6 = ((StringBuilder)localObject6).toString();
          localf.a((String)localObject6);
          n = Build.VERSION.SDK_INT;
          int i2 = 19;
          if (n >= i2)
          {
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            str1 = "chcon u:object_r:system_file:s0 ";
            localObject6 = ((StringBuilder)localObject6).append(str1);
            localObject5 = ((StringBuilder)localObject6).append((String)localObject5);
            localObject6 = ";";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            localf.a((String)localObject5);
          }
          bool6 = com.vvt.io.d.f((String)localObject2);
          if (bool6)
          {
            bool6 = c;
            if (bool6) {}
            localObject5 = "rm %s";
            n = 1;
            localObject6 = new Object[n];
            i2 = 0;
            str1 = null;
            localObject6[0] = localObject2;
            localObject2 = String.format((String)localObject5, (Object[])localObject6);
            localf.a((String)localObject2);
          }
          label1516:
          localObject2 = "";
          localObject2 = RunningMode.FULL;
          if (paramRunningMode != localObject2) {
            break label1869;
          }
          localObject2 = com.vvt.m.b.c;
          label1536:
          bool6 = com.vvt.aa.a.g();
          if (!bool6) {
            break label1878;
          }
          localObject5 = "arm64-v8a";
          localObject2 = p.a((String)localObject2, (String)localObject5);
          localObject5 = "libasound.so";
          localObject2 = p.a((String)localObject2, (String)localObject5);
          localObject5 = "/system/lib64";
          localObject6 = "libasound.so";
          localObject5 = p.a((String)localObject5, (String)localObject6);
          label1589:
          boolean bool5 = ShellUtil.b((String)localObject5);
          if (!bool5)
          {
            bool5 = ShellUtil.b((String)localObject2);
            if (!bool5) {
              break label1911;
            }
            bool5 = c;
            if (bool5) {}
            int i1 = 200;
            ShellUtil.a((String)localObject2, (String)localObject5, i1);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject6 = "chown root:root ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
            localObject6 = ";";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject2).toString();
            localf.a((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject6 = "chmod 755 ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
            localObject6 = ";";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject2 = ((StringBuilder)localObject2).toString();
            localf.a((String)localObject2);
            int m = Build.VERSION.SDK_INT;
            i1 = 19;
            if (m >= i1)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject6 = "chcon u:object_r:system_file:s0 ";
              localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
              localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
              localObject5 = ";";
              localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
              localObject2 = ((StringBuilder)localObject2).toString();
              localf.a((String)localObject2);
            }
          }
        }
        for (;;)
        {
          if (localf != null) {
            localf.d();
          }
          boolean bool2 = c;
          if (!bool2) {
            break;
          }
          break;
          bool2 = e;
          if (!bool2) {
            break label1516;
          }
          break label1516;
          label1869:
          localObject2 = p.a(paramContext);
          break label1536;
          label1878:
          localObject5 = "libasound.so";
          localObject2 = p.a((String)localObject2, (String)localObject5);
          localObject5 = "/system/lib";
          localObject6 = "libasound.so";
          localObject5 = p.a((String)localObject5, (String)localObject6);
          break label1589;
          label1911:
          bool2 = e;
          if (bool2)
          {
            continue;
            bool2 = e;
            if (!bool2) {}
          }
        }
      }
      finally
      {
        if (localf != null) {
          localf.d();
        }
        boolean bool6 = c;
        if (bool6) {}
        ShellUtil.a(false);
      }
    }
  }
  
  private void a(f paramf)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = this.k.getPackageManager();
    String str1 = this.k.getPackageName();
    localObject = ((PackageManager)localObject).getLaunchIntentForPackage(str1).getComponent().getClassName();
    str1 = "pm disable %s/%s";
    int m = 2;
    Object[] arrayOfObject = new Object[m];
    String str2 = this.k.getPackageName();
    arrayOfObject[0] = str2;
    int n = 1;
    arrayOfObject[n] = localObject;
    localObject = String.format(str1, arrayOfObject);
    boolean bool2 = c;
    if (bool2) {}
    paramf.a((String)localObject);
    bool1 = c;
    if (bool1) {}
  }
  
  private void a(f paramf, String paramString1, Set paramSet, String paramString2)
  {
    int m = 2;
    int n = 1;
    boolean bool1 = c;
    if (bool1) {}
    bool1 = ShellUtil.b(paramString1);
    Object localObject1;
    String str1;
    String str2;
    if (bool1)
    {
      bool1 = c;
      if (bool1) {}
      localObject1 = paramSet.iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        str1 = (String)((Iterator)localObject1).next();
        Object localObject2 = new Object[m];
        localObject2[0] = paramString1;
        localObject2[n] = str1;
        str2 = String.format("%s/%s", (Object[])localObject2);
        str1 = p.a(paramString2, str1);
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(str1);
        boolean bool2 = ((File)localObject2).exists();
        if (bool2)
        {
          bool2 = ShellUtil.b(str2);
          if (bool2)
          {
            bool2 = c;
            if (bool2) {}
            arrayOfObject = new Object[n];
            arrayOfObject[0] = str2;
            localObject2 = String.format("rm %s", arrayOfObject);
            paramf.a((String)localObject2);
          }
          bool2 = c;
          if (bool2) {}
          Object[] arrayOfObject = new Object[m];
          arrayOfObject[0] = str1;
          arrayOfObject[n] = str2;
          str1 = String.format("cat '%s' > '%s'", arrayOfObject);
          paramf.a(str1);
          localObject2 = new Object[n];
          localObject2[0] = str2;
          str1 = String.format("chmod 644 %s", (Object[])localObject2);
          paramf.a(str1);
        }
        else
        {
          bool1 = c;
          if (!bool1) {}
        }
      }
      localObject1 = new Object[m];
      localObject1[0] = paramString1;
      str2 = "Success";
      localObject1[n] = str2;
      str1 = String.format("Copy .so files to %s - %s", (Object[])localObject1);
      g(str1);
    }
    for (;;)
    {
      bool1 = c;
      if (bool1) {}
      return;
      localObject1 = new Object[m];
      localObject1[0] = paramString1;
      str2 = "Failed";
      localObject1[n] = str2;
      str1 = String.format("Copy .so files to %s - %s", (Object[])localObject1);
      g(str1);
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  public static boolean a(Boolean paramBoolean, String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    int m = 2;
    Object localObject = new Object[m];
    localObject[0] = paramString;
    String str1 = "is_req_autoupdate_run.dat";
    localObject[1] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    boolean bool4 = ((File)localObject).exists();
    if (bool4) {
      ((File)localObject).delete();
    }
    boolean bool3 = paramBoolean.booleanValue();
    if (bool3) {
      bool1 = q.a(paramBoolean, str2);
    }
    bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    return bool1;
  }
  
  public static Pair b()
  {
    int m = 2;
    boolean bool1 = true;
    long l1 = c();
    long l2 = 104857600L + l1;
    String str1 = "/data";
    long l3 = f(str1);
    String str2 = "dir: /data, size: %d, req: %d, free: %d (all sizes bytes)";
    int n = 3;
    Object[] arrayOfObject1 = new Object[n];
    Object localObject1 = Long.valueOf(l1);
    arrayOfObject1[0] = localObject1;
    localObject1 = Long.valueOf(l2);
    arrayOfObject1[bool1] = localObject1;
    localObject1 = Long.valueOf(l3);
    arrayOfObject1[m] = localObject1;
    Object localObject2 = String.format(str2, arrayOfObject1);
    boolean bool2 = c;
    if (bool2) {}
    bool2 = l3 < l2;
    if (bool2)
    {
      bool2 = c;
      if (bool2) {}
      localObject1 = p.a(com.vvt.m.b.c, "busybox");
      Object[] arrayOfObject2 = new Object[m];
      arrayOfObject2[0] = localObject1;
      localObject1 = com.vvt.m.b.c;
      arrayOfObject2[bool1] = localObject1;
      localObject3 = String.format("%s du -AppEngine1 %s", arrayOfObject2);
      localObject1 = "";
    }
    try
    {
      localObject1 = KMShell.a((String)localObject3);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>((String)localObject2);
    localObject2 = System.getProperty("line.separator");
    localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject3 = "dirInfo: ";
    localObject1 = ((StringBuilder)localObject2).append((String)localObject3).append((String)localObject1);
    localObject2 = Boolean.valueOf(false);
    localObject1 = ((StringBuilder)localObject1).toString();
    for (localObject1 = Pair.create(localObject2, localObject1);; localObject1 = Pair.create(Boolean.valueOf(bool1), localObject2))
    {
      return (Pair)localObject1;
      bool2 = e;
      if (!bool2) {}
    }
  }
  
  public static boolean b(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = c;
    if (bool2) {}
    int m = 2;
    Object[] arrayOfObject = new Object[m];
    arrayOfObject[0] = paramString;
    int n = 1;
    String str = "is_req_autoupdate_run.dat";
    arrayOfObject[n] = str;
    Object localObject = q.a(String.format("%s/%s", arrayOfObject));
    if (localObject != null)
    {
      boolean bool3 = localObject instanceof Boolean;
      if (bool3)
      {
        localObject = (Boolean)localObject;
        bool2 = ((Boolean)localObject).booleanValue();
      }
    }
    for (;;)
    {
      bool1 = c;
      if (bool1) {}
      bool1 = c;
      if (bool1) {}
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public static long c()
  {
    File localFile = new java/io/File;
    String str = com.vvt.m.b.c;
    localFile.<init>(str);
    return com.vvt.io.d.b(localFile);
  }
  
  public static boolean c(String paramString)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = new Object[2];
    localObject[0] = paramString;
    int m = 1;
    String str1 = "autoupdate_log.dat";
    localObject[m] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    bool1 = ((File)localObject).exists();
    boolean bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    return bool1;
  }
  
  public static String d(String paramString)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    int m = 1;
    String str1 = "autoupdate_log.dat";
    arrayOfObject[m] = str1;
    String str2 = com.vvt.io.d.d(String.format("%s/%s", arrayOfObject));
    boolean bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    return str2;
  }
  
  private String e()
  {
    Object localObject1 = "com.android.systemupdate-2.apk";
    Object localObject2 = this.k;
    if (localObject2 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = this.k.getPackageName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "-2.apk";
      localObject1 = (String)localObject2;
    }
    for (;;)
    {
      return (String)localObject1;
      boolean bool = e;
      if (!bool) {}
    }
  }
  
  public static void e(String paramString)
  {
    boolean bool1 = c;
    if (bool1) {}
    Object localObject = new Object[2];
    localObject[0] = paramString;
    int m = 1;
    String str1 = "autoupdate_log.dat";
    localObject[m] = str1;
    String str2 = String.format("%s/%s", (Object[])localObject);
    boolean bool2 = c;
    if (bool2) {}
    localObject = new java/io/File;
    ((File)localObject).<init>(str2);
    bool1 = ((File)localObject).exists();
    if (bool1) {
      ((File)localObject).delete();
    }
    bool1 = c;
    if (bool1) {}
  }
  
  public static long f(String paramString)
  {
    long l1 = 0L;
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(paramString);
      int m = localStatFs.getBlockSize();
      long l2 = m;
      int n = localStatFs.getAvailableBlocks();
      l1 = n * l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = e;
        if (!bool) {}
      }
    }
    bool = c;
    if (bool) {}
    return l1;
  }
  
  private String f()
  {
    return this.j;
  }
  
  private void g()
  {
    bool1 = c;
    if (bool1) {}
    try
    {
      Object localObject = h();
      boolean bool2 = c;
      if (bool2) {}
      String str = "%s reboot -f";
      int m = 1;
      Object[] arrayOfObject = new Object[m];
      arrayOfObject[0] = localObject;
      localObject = String.format(str, arrayOfObject);
      bool2 = c;
      if (bool2) {}
      KMShell.a((String)localObject);
      localObject = this.k;
      com.fx.daemon.b.a((Context)localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = e;
        if (!bool1) {}
      }
    }
    bool1 = c;
    if (bool1) {}
  }
  
  private void g(String paramString)
  {
    bool1 = d;
    if (bool1) {}
    try
    {
      Object localObject1 = new java/util/Date;
      ((Date)localObject1).<init>();
      Object localObject2 = new java/text/SimpleDateFormat;
      Object localObject3 = "yyyy-MM-dd hh:mm:ss";
      ((SimpleDateFormat)localObject2).<init>((String)localObject3);
      localObject1 = ((SimpleDateFormat)localObject2).format((Date)localObject1);
      localObject2 = "%s/%s";
      int m = 2;
      localObject3 = new Object[m];
      int i1 = 0;
      Object localObject4 = null;
      String str = this.j;
      localObject3[0] = str;
      i1 = 1;
      str = "autoupdate_log.dat";
      localObject3[i1] = str;
      localObject2 = String.format((String)localObject2, (Object[])localObject3);
      boolean bool2 = d;
      if (bool2) {}
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      localObject2 = new java/io/BufferedWriter;
      localObject4 = new java/io/FileWriter;
      boolean bool3 = true;
      ((FileWriter)localObject4).<init>((File)localObject3, bool3);
      int n = 1024;
      ((BufferedWriter)localObject2).<init>((Writer)localObject4, n);
      localObject3 = "%s : %s";
      i1 = 2;
      localObject4 = new Object[i1];
      bool3 = false;
      str = null;
      localObject4[0] = localObject1;
      bool1 = true;
      localObject4[bool1] = paramString;
      localObject1 = String.format((String)localObject3, (Object[])localObject4);
      ((BufferedWriter)localObject2).write((String)localObject1);
      ((BufferedWriter)localObject2).newLine();
      ((BufferedWriter)localObject2).close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool1 = d;
        if (!bool1) {}
      }
    }
    bool1 = d;
    if (bool1) {}
  }
  
  private String h()
  {
    return p.a(this.j, "busybox");
  }
  
  private void i()
  {
    boolean bool1 = true;
    boolean bool2 = c;
    if (bool2) {}
    bool2 = c;
    if (bool2) {}
    ShellUtil.a(bool1);
    for (;;)
    {
      try
      {
        bool2 = com.vvt.aa.a.g();
        Object localObject1;
        String str2;
        if (bool2)
        {
          localObject1 = com.vvt.r.a.b;
          str1 = "/system/lib64";
          str2 = str1;
          Iterator localIterator = ((Set)localObject1).iterator();
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break label599;
          }
          localObject1 = localIterator.next();
          localObject1 = (String)localObject1;
          bool1 = c;
          if (bool1) {}
          str1 = "";
          bool1 = com.vvt.aa.a.g();
          if (bool1)
          {
            str1 = "%s/%s/%s";
            int m = 3;
            localObject3 = new Object[m];
            i1 = 0;
            arrayOfObject = null;
            str3 = com.vvt.m.b.c;
            localObject3[0] = str3;
            i1 = 1;
            str3 = "arm64-v8a";
            localObject3[i1] = str3;
            i1 = 2;
            localObject3[i1] = localObject1;
            str1 = String.format(str1, (Object[])localObject3);
            localObject3 = new java/io/File;
            ((File)localObject3).<init>(str1);
            boolean bool3 = ((File)localObject3).exists();
            if (!bool3) {
              continue;
            }
            localObject3 = "%s/%s";
            i1 = 2;
            arrayOfObject = new Object[i1];
            int i2 = 0;
            str3 = null;
            arrayOfObject[0] = str2;
            i2 = 1;
            arrayOfObject[i2] = localObject1;
            localObject1 = String.format((String)localObject3, arrayOfObject);
            bool3 = ShellUtil.b((String)localObject1);
            if (bool3)
            {
              bool3 = c;
              if (bool3) {}
              localObject3 = "rm %s";
              i1 = 1;
              arrayOfObject = new Object[i1];
              i2 = 0;
              str3 = null;
              arrayOfObject[0] = localObject1;
              localObject3 = String.format((String)localObject3, arrayOfObject);
              KMShell.a((String)localObject3);
            }
            bool3 = c;
            if (bool3) {}
            localObject3 = "cat '%s' > '%s'";
            i1 = 2;
            arrayOfObject = new Object[i1];
            i2 = 0;
            str3 = null;
            arrayOfObject[0] = str1;
            i2 = 1;
            arrayOfObject[i2] = localObject1;
            localObject3 = String.format((String)localObject3, arrayOfObject);
            KMShell.a((String)localObject3);
            bool3 = c;
            if (bool3) {}
            localObject3 = "chmod 644 %s";
            i1 = 1;
            arrayOfObject = new Object[i1];
            i2 = 0;
            str3 = null;
            arrayOfObject[0] = localObject1;
            localObject1 = String.format((String)localObject3, arrayOfObject);
            KMShell.a((String)localObject1);
            localObject1 = "rm %s";
            bool3 = true;
            localObject3 = new Object[bool3];
            i1 = 0;
            arrayOfObject = null;
            localObject3[0] = str1;
            localObject1 = String.format((String)localObject1, (Object[])localObject3);
            bool3 = c;
            if (bool3) {}
            KMShell.a((String)localObject1);
            bool2 = ShellUtil.b(str1);
            if (!bool2) {
              continue;
            }
            bool2 = e;
            if (!bool2) {
              continue;
            }
            continue;
          }
        }
        else
        {
          localObject1 = com.vvt.r.a.a;
          str1 = "/system/lib";
          str2 = str1;
          continue;
        }
        String str1 = "%s/%s";
        int n = 2;
        Object localObject3 = new Object[n];
        int i1 = 0;
        Object[] arrayOfObject = null;
        String str3 = com.vvt.m.b.c;
        localObject3[0] = str3;
        i1 = 1;
        localObject3[i1] = localObject1;
        str1 = String.format(str1, (Object[])localObject3);
        continue;
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = f;
        if (!bool2) {
          continue;
        }
        continue;
        bool2 = c;
      }
      catch (Exception localException)
      {
        bool2 = e;
        if (bool2) {}
        bool2 = c;
        if (bool2) {}
        ShellUtil.a(false);
        bool2 = c;
        if (bool2) {}
        return;
      }
      finally
      {
        bool1 = c;
        if (bool1) {}
        ShellUtil.a(false);
      }
      label599:
      if (!bool2) {}
    }
  }
  
  /* Error */
  public Pair a(String paramString, f paramf)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_0
    //   6: istore 5
    //   8: iconst_1
    //   9: istore 6
    //   11: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   14: istore 7
    //   16: iload 7
    //   18: ifeq +3 -> 21
    //   21: ldc -18
    //   23: astore 8
    //   25: new 445	java/io/FileInputStream
    //   28: astore 9
    //   30: aload 9
    //   32: aload_1
    //   33: invokespecial 446	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   36: new 448	java/util/zip/ZipInputStream
    //   39: astore 10
    //   41: aload 10
    //   43: aload 9
    //   45: invokespecial 451	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: aload 10
    //   50: invokevirtual 455	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   53: astore 11
    //   55: aload 11
    //   57: ifnull +535 -> 592
    //   60: ldc -18
    //   62: astore 4
    //   64: aload_0
    //   65: invokespecial 457	com/vvt/autoupdate/d:f	()Ljava/lang/String;
    //   68: astore 4
    //   70: aload 11
    //   72: invokevirtual 462	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   75: astore 12
    //   77: ldc_w 464
    //   80: astore 13
    //   82: aload 12
    //   84: aload 13
    //   86: invokevirtual 468	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   89: iconst_1
    //   90: iadd
    //   91: istore 14
    //   93: aload 11
    //   95: invokevirtual 462	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   98: astore 13
    //   100: aload 13
    //   102: iload 14
    //   104: invokevirtual 472	java/lang/String:substring	(I)Ljava/lang/String;
    //   107: astore 12
    //   109: aload 11
    //   111: invokevirtual 462	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   114: astore 13
    //   116: getstatic 65	com/vvt/autoupdate/d:removeFromPath	Ljava/lang/String;
    //   119: astore 15
    //   121: aload 13
    //   123: aload 15
    //   125: invokevirtual 475	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   128: istore 16
    //   130: iload 16
    //   132: ifeq +68 -> 200
    //   135: ldc_w 477
    //   138: astore 11
    //   140: aload 4
    //   142: aload 11
    //   144: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   147: astore 4
    //   149: iload 6
    //   151: istore 17
    //   153: iload 17
    //   155: ifeq -107 -> 48
    //   158: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   161: istore 17
    //   163: iload 17
    //   165: ifeq +3 -> 168
    //   168: getstatic 79	com/vvt/autoupdate/d:i	Ljava/util/List;
    //   171: astore 11
    //   173: aload 11
    //   175: aload 12
    //   177: invokeinterface 482 2 0
    //   182: istore 17
    //   184: iload 17
    //   186: ifeq +112 -> 298
    //   189: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   192: istore_3
    //   193: iload_3
    //   194: ifeq -146 -> 48
    //   197: goto -149 -> 48
    //   200: aload 11
    //   202: invokevirtual 462	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   205: astore 13
    //   207: getstatic 54	com/vvt/autoupdate/d:AppEngine1	Ljava/lang/String;
    //   210: astore 15
    //   212: aload 13
    //   214: aload 15
    //   216: invokevirtual 475	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   219: istore 16
    //   221: iload 16
    //   223: ifeq +23 -> 246
    //   226: ldc 59
    //   228: astore 11
    //   230: aload 4
    //   232: aload 11
    //   234: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   237: astore 4
    //   239: iload 6
    //   241: istore 17
    //   243: goto -90 -> 153
    //   246: aload 11
    //   248: invokevirtual 462	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   251: astore 11
    //   253: getstatic 48	com/vvt/autoupdate/d:FxFileObserverWorker	Ljava/lang/String;
    //   256: astore 13
    //   258: aload 11
    //   260: aload 13
    //   262: invokevirtual 475	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   265: istore 17
    //   267: iload 17
    //   269: ifeq +10 -> 279
    //   272: iload 6
    //   274: istore 17
    //   276: goto -123 -> 153
    //   279: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   282: istore 17
    //   284: iload 17
    //   286: ifeq +3 -> 289
    //   289: iconst_0
    //   290: istore 17
    //   292: aconst_null
    //   293: astore 11
    //   295: goto -142 -> 153
    //   298: aload 4
    //   300: aload 12
    //   302: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   305: astore 4
    //   307: new 194	java/io/File
    //   310: astore 11
    //   312: aload 11
    //   314: aload 4
    //   316: invokespecial 197	java/io/File:<init>	(Ljava/lang/String;)V
    //   319: aload 11
    //   321: invokevirtual 485	java/io/File:mkdirs	()Z
    //   324: pop
    //   325: aload 11
    //   327: invokevirtual 200	java/io/File:exists	()Z
    //   330: istore 14
    //   332: iload 14
    //   334: ifeq +19 -> 353
    //   337: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   340: istore 14
    //   342: iload 14
    //   344: ifeq +3 -> 347
    //   347: aload 11
    //   349: invokevirtual 307	java/io/File:delete	()Z
    //   352: pop
    //   353: new 487	java/io/FileOutputStream
    //   356: astore 11
    //   358: aload 11
    //   360: aload 4
    //   362: invokespecial 488	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   365: sipush 1024
    //   368: istore 14
    //   370: iload 14
    //   372: newarray <illegal type>
    //   374: astore 12
    //   376: new 490	java/io/BufferedOutputStream
    //   379: astore 13
    //   381: aload 12
    //   383: arraylength
    //   384: istore 18
    //   386: aload 13
    //   388: aload 11
    //   390: iload 18
    //   392: invokespecial 493	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   395: aload 10
    //   397: aload 12
    //   399: invokevirtual 497	java/util/zip/ZipInputStream:read	([B)I
    //   402: istore 18
    //   404: iconst_m1
    //   405: istore 19
    //   407: iload 18
    //   409: iload 19
    //   411: if_icmpeq +83 -> 494
    //   414: iconst_0
    //   415: istore 19
    //   417: aload 13
    //   419: aload 12
    //   421: iconst_0
    //   422: iload 18
    //   424: invokevirtual 500	java/io/BufferedOutputStream:write	([BII)V
    //   427: goto -32 -> 395
    //   430: astore 8
    //   432: aload 10
    //   434: astore 20
    //   436: aload 9
    //   438: astore 4
    //   440: getstatic 33	com/vvt/autoupdate/d:e	Z
    //   443: istore 21
    //   445: iload 21
    //   447: ifeq +3 -> 450
    //   450: aload 8
    //   452: invokevirtual 501	java/lang/Exception:toString	()Ljava/lang/String;
    //   455: astore 8
    //   457: aload 20
    //   459: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   462: aload 4
    //   464: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   467: iconst_0
    //   468: istore 6
    //   470: aconst_null
    //   471: astore 20
    //   473: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   476: istore 5
    //   478: iload 5
    //   480: ifeq +3 -> 483
    //   483: iload 6
    //   485: invokestatic 358	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   488: aload 8
    //   490: invokestatic 364	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   493: areturn
    //   494: aload 13
    //   496: invokevirtual 506	java/io/BufferedOutputStream:flush	()V
    //   499: aload 13
    //   501: invokevirtual 507	java/io/BufferedOutputStream:close	()V
    //   504: aload 10
    //   506: invokevirtual 510	java/util/zip/ZipInputStream:closeEntry	()V
    //   509: aload 11
    //   511: invokestatic 513	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   514: ldc_w 515
    //   517: astore 11
    //   519: iconst_1
    //   520: istore 14
    //   522: iload 14
    //   524: anewarray 4	java/lang/Object
    //   527: astore 12
    //   529: iconst_0
    //   530: istore 16
    //   532: aconst_null
    //   533: astore 13
    //   535: aload 12
    //   537: iconst_0
    //   538: aload 4
    //   540: aastore
    //   541: aload 11
    //   543: aload 12
    //   545: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   548: astore 4
    //   550: aload_2
    //   551: aload 4
    //   553: invokevirtual 110	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   556: pop
    //   557: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   560: istore_3
    //   561: iload_3
    //   562: ifeq -514 -> 48
    //   565: goto -517 -> 48
    //   568: astore 8
    //   570: iconst_0
    //   571: istore 21
    //   573: aconst_null
    //   574: astore 10
    //   576: aconst_null
    //   577: astore 9
    //   579: aload 10
    //   581: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   584: aload 9
    //   586: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   589: aload 8
    //   591: athrow
    //   592: aload 10
    //   594: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   597: aload 9
    //   599: invokestatic 503	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   602: goto -129 -> 473
    //   605: astore 8
    //   607: iconst_0
    //   608: istore 21
    //   610: aconst_null
    //   611: astore 10
    //   613: goto -34 -> 579
    //   616: astore 8
    //   618: goto -39 -> 579
    //   621: astore 8
    //   623: aload 20
    //   625: astore 10
    //   627: aload 4
    //   629: astore 9
    //   631: goto -52 -> 579
    //   634: astore 8
    //   636: iconst_0
    //   637: istore 6
    //   639: aconst_null
    //   640: astore 20
    //   642: goto -202 -> 440
    //   645: astore 8
    //   647: iconst_0
    //   648: istore 6
    //   650: aconst_null
    //   651: astore 20
    //   653: aload 9
    //   655: astore 4
    //   657: goto -217 -> 440
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	660	0	this	d
    //   0	660	1	paramString	String
    //   0	660	2	paramf	f
    //   1	561	3	bool1	boolean
    //   3	653	4	localObject1	Object
    //   6	473	5	bool2	boolean
    //   9	640	6	bool3	boolean
    //   14	3	7	bool4	boolean
    //   23	1	8	str1	String
    //   430	21	8	localException1	Exception
    //   455	34	8	str2	String
    //   568	22	8	localObject2	Object
    //   605	1	8	localObject3	Object
    //   616	1	8	localObject4	Object
    //   621	1	8	localObject5	Object
    //   634	1	8	localException2	Exception
    //   645	1	8	localException3	Exception
    //   28	626	9	localObject6	Object
    //   39	587	10	localObject7	Object
    //   53	489	11	localObject8	Object
    //   75	469	12	localObject9	Object
    //   80	454	13	localObject10	Object
    //   91	12	14	m	int
    //   330	13	14	bool5	boolean
    //   368	155	14	n	int
    //   119	96	15	str3	String
    //   128	403	16	bool6	boolean
    //   151	140	17	bool7	boolean
    //   384	39	18	i1	int
    //   405	11	19	i2	int
    //   434	218	20	localObject11	Object
    //   443	166	21	bool8	boolean
    // Exception table:
    //   from	to	target	type
    //   48	53	430	java/lang/Exception
    //   64	68	430	java/lang/Exception
    //   70	75	430	java/lang/Exception
    //   84	89	430	java/lang/Exception
    //   93	98	430	java/lang/Exception
    //   102	107	430	java/lang/Exception
    //   109	114	430	java/lang/Exception
    //   116	119	430	java/lang/Exception
    //   123	128	430	java/lang/Exception
    //   142	147	430	java/lang/Exception
    //   158	161	430	java/lang/Exception
    //   168	171	430	java/lang/Exception
    //   175	182	430	java/lang/Exception
    //   189	192	430	java/lang/Exception
    //   200	205	430	java/lang/Exception
    //   207	210	430	java/lang/Exception
    //   214	219	430	java/lang/Exception
    //   232	237	430	java/lang/Exception
    //   246	251	430	java/lang/Exception
    //   253	256	430	java/lang/Exception
    //   260	265	430	java/lang/Exception
    //   279	282	430	java/lang/Exception
    //   300	305	430	java/lang/Exception
    //   307	310	430	java/lang/Exception
    //   314	319	430	java/lang/Exception
    //   319	325	430	java/lang/Exception
    //   325	330	430	java/lang/Exception
    //   337	340	430	java/lang/Exception
    //   347	353	430	java/lang/Exception
    //   353	356	430	java/lang/Exception
    //   360	365	430	java/lang/Exception
    //   370	374	430	java/lang/Exception
    //   376	379	430	java/lang/Exception
    //   381	384	430	java/lang/Exception
    //   390	395	430	java/lang/Exception
    //   397	402	430	java/lang/Exception
    //   422	427	430	java/lang/Exception
    //   494	499	430	java/lang/Exception
    //   499	504	430	java/lang/Exception
    //   504	509	430	java/lang/Exception
    //   509	514	430	java/lang/Exception
    //   522	527	430	java/lang/Exception
    //   538	541	430	java/lang/Exception
    //   543	548	430	java/lang/Exception
    //   551	557	430	java/lang/Exception
    //   557	560	430	java/lang/Exception
    //   25	28	568	finally
    //   32	36	568	finally
    //   36	39	605	finally
    //   43	48	605	finally
    //   48	53	616	finally
    //   64	68	616	finally
    //   70	75	616	finally
    //   84	89	616	finally
    //   93	98	616	finally
    //   102	107	616	finally
    //   109	114	616	finally
    //   116	119	616	finally
    //   123	128	616	finally
    //   142	147	616	finally
    //   158	161	616	finally
    //   168	171	616	finally
    //   175	182	616	finally
    //   189	192	616	finally
    //   200	205	616	finally
    //   207	210	616	finally
    //   214	219	616	finally
    //   232	237	616	finally
    //   246	251	616	finally
    //   253	256	616	finally
    //   260	265	616	finally
    //   279	282	616	finally
    //   300	305	616	finally
    //   307	310	616	finally
    //   314	319	616	finally
    //   319	325	616	finally
    //   325	330	616	finally
    //   337	340	616	finally
    //   347	353	616	finally
    //   353	356	616	finally
    //   360	365	616	finally
    //   370	374	616	finally
    //   376	379	616	finally
    //   381	384	616	finally
    //   390	395	616	finally
    //   397	402	616	finally
    //   422	427	616	finally
    //   494	499	616	finally
    //   499	504	616	finally
    //   504	509	616	finally
    //   509	514	616	finally
    //   522	527	616	finally
    //   538	541	616	finally
    //   543	548	616	finally
    //   551	557	616	finally
    //   557	560	616	finally
    //   440	443	621	finally
    //   450	455	621	finally
    //   25	28	634	java/lang/Exception
    //   32	36	634	java/lang/Exception
    //   36	39	645	java/lang/Exception
    //   43	48	645	java/lang/Exception
  }
  
  public void a()
  {
    boolean bool1 = c;
    if (bool1) {}
    String str = this.j;
    Object localObject = "aud_backup";
    str = p.a(str, (String)localObject);
    boolean bool2 = c;
    if (bool2) {}
    localObject = new java/io/File;
    ((File)localObject).<init>(str);
    com.vvt.io.d.a((File)localObject);
    bool1 = c;
    if (bool1) {}
  }
  
  public void a(Context paramContext)
  {
    this.k = paramContext;
  }
  
  public void a(RunningMode paramRunningMode)
  {
    boolean bool1 = c;
    if (bool1) {}
    bool1 = c;
    if (bool1) {}
    Object localObject1 = null;
    Object localObject2 = RunningMode.LIMITED_1;
    Object localObject6;
    if (paramRunningMode == localObject2)
    {
      try
      {
        localObject1 = f.b();
        bool1 = c;
        if (bool1) {}
        bool1 = c;
        if (bool1) {}
        bool1 = true;
        ShellUtil.a(bool1);
        bool1 = com.vvt.aa.a.b();
        if (!bool1) {
          break label236;
        }
        bool1 = c;
        if (bool1) {}
        a((f)localObject1);
        bool1 = c;
        if (bool1) {}
        Object localObject5 = "/system/lib";
        Set localSet = com.vvt.r.a.a;
        localObject6 = "product";
        bool1 = c;
        if (bool1) {}
        localObject2 = this.k;
        com.vvt.r.a.a((Context)localObject2, (String)localObject6, (f)localObject1, (String)localObject5, localSet, false);
        bool1 = com.vvt.aa.a.g();
        if (bool1)
        {
          bool1 = c;
          if (bool1) {}
          localSet = com.vvt.r.a.b;
          localObject5 = "/system/lib64";
          localObject6 = com.vvt.m.b.a;
          localObject2 = this.k;
          com.vvt.r.a.a((Context)localObject2, (String)localObject6, (f)localObject1, (String)localObject5, localSet, false);
        }
        localObject2 = this.k;
        localObject2 = p.a((Context)localObject2);
        localObject6 = RunningMode.LIMITED_1;
        localObject5 = this.k;
        a((RunningMode)localObject6, (Context)localObject5, (String)localObject2);
        if (localObject1 != null) {
          ((f)localObject1).d();
        }
        bool1 = c;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool1 = e;
          if ((!bool1) || (localObject1 != null)) {
            ((f)localObject1).d();
          }
          bool1 = c;
          if (!bool1) {}
        }
      }
      finally
      {
        if (localObject1 == null) {
          break label286;
        }
        ((f)localObject1).d();
        bool2 = c;
        if (!bool2) {
          break label296;
        }
        ShellUtil.a(false);
      }
      ShellUtil.a(false);
    }
    for (;;)
    {
      bool1 = c;
      if (bool1) {}
      return;
      label236:
      bool1 = c;
      if (!bool1) {
        break;
      }
      break;
      label286:
      boolean bool2;
      label296:
      Object localObject4 = RunningMode.FULL;
      if (paramRunningMode == localObject4)
      {
        bool1 = com.vvt.aa.a.c();
        if (bool1)
        {
          bool1 = c.a();
          if (bool1)
          {
            bool1 = c;
            if (bool1) {}
            i();
          }
        }
        bool1 = c;
        if (bool1) {}
        localObject4 = com.vvt.m.b.c;
        localObject6 = RunningMode.FULL;
        localObject1 = this.k;
        a((RunningMode)localObject6, (Context)localObject1, (String)localObject4);
      }
    }
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  /* Error */
  public void a(String paramString, e parame)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   21: istore 6
    //   23: iload 6
    //   25: ifeq +3 -> 28
    //   28: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifeq +3 -> 38
    //   38: iload 5
    //   40: invokestatic 100	com/vvt/shell/ShellUtil:a	(Z)V
    //   43: ldc_w 544
    //   46: astore 7
    //   48: aload_0
    //   49: aload 7
    //   51: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   54: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   57: istore 6
    //   59: iload 6
    //   61: ifeq +3 -> 64
    //   64: new 194	java/io/File
    //   67: astore 8
    //   69: aload 8
    //   71: aload_1
    //   72: invokespecial 197	java/io/File:<init>	(Ljava/lang/String;)V
    //   75: iconst_0
    //   76: istore 6
    //   78: aconst_null
    //   79: astore 7
    //   81: getstatic 547	java/io/File:separator	Ljava/lang/String;
    //   84: astore 9
    //   86: aload_1
    //   87: aload 9
    //   89: invokevirtual 468	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   92: istore 5
    //   94: aload_1
    //   95: iconst_0
    //   96: iload 5
    //   98: invokevirtual 550	java/lang/String:substring	(II)Ljava/lang/String;
    //   101: astore 7
    //   103: aload_0
    //   104: invokespecial 552	com/vvt/autoupdate/d:e	()Ljava/lang/String;
    //   107: astore 9
    //   109: aload 7
    //   111: aload 9
    //   113: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   116: astore 10
    //   118: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   121: istore 6
    //   123: iload 6
    //   125: ifeq +3 -> 128
    //   128: new 194	java/io/File
    //   131: astore 11
    //   133: aload 11
    //   135: aload 10
    //   137: invokespecial 197	java/io/File:<init>	(Ljava/lang/String;)V
    //   140: aload 11
    //   142: invokevirtual 200	java/io/File:exists	()Z
    //   145: istore 6
    //   147: iload 6
    //   149: ifeq +9 -> 158
    //   152: aload 11
    //   154: invokevirtual 307	java/io/File:delete	()Z
    //   157: pop
    //   158: aload 8
    //   160: aload 11
    //   162: invokevirtual 556	java/io/File:renameTo	(Ljava/io/File;)Z
    //   165: istore 6
    //   167: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   170: istore 5
    //   172: iload 5
    //   174: ifeq +3 -> 177
    //   177: iload 6
    //   179: ifeq +959 -> 1138
    //   182: ldc_w 558
    //   185: astore 7
    //   187: iconst_1
    //   188: istore 5
    //   190: iload 5
    //   192: anewarray 4	java/lang/Object
    //   195: astore 9
    //   197: iconst_0
    //   198: istore 12
    //   200: aconst_null
    //   201: astore 13
    //   203: ldc_w 298
    //   206: astore 14
    //   208: aload 9
    //   210: iconst_0
    //   211: aload 14
    //   213: aastore
    //   214: aload 7
    //   216: aload 9
    //   218: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   221: astore 7
    //   223: aload_0
    //   224: aload 7
    //   226: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   229: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   232: istore 6
    //   234: iload 6
    //   236: ifeq +3 -> 239
    //   239: invokestatic 105	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   242: astore 9
    //   244: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   247: istore 6
    //   249: iload 6
    //   251: ifeq +3 -> 254
    //   254: aload_0
    //   255: aload 10
    //   257: aload 9
    //   259: invokevirtual 561	com/vvt/autoupdate/d:a	(Ljava/lang/String;Lcom/vvt/shell/f;)Landroid/util/Pair;
    //   262: astore 13
    //   264: aload 13
    //   266: getfield 565	android/util/Pair:first	Ljava/lang/Object;
    //   269: astore 7
    //   271: aload 7
    //   273: checkcast 309	java/lang/Boolean
    //   276: astore 7
    //   278: aload 7
    //   280: invokevirtual 312	java/lang/Boolean:booleanValue	()Z
    //   283: istore 6
    //   285: iload 6
    //   287: ifeq +943 -> 1230
    //   290: ldc_w 567
    //   293: astore 7
    //   295: iconst_1
    //   296: istore 12
    //   298: iload 12
    //   300: anewarray 4	java/lang/Object
    //   303: astore 13
    //   305: iconst_0
    //   306: istore 15
    //   308: aconst_null
    //   309: astore 14
    //   311: ldc_w 298
    //   314: astore 16
    //   316: aload 13
    //   318: iconst_0
    //   319: aload 16
    //   321: aastore
    //   322: aload 7
    //   324: aload 13
    //   326: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   329: astore 7
    //   331: aload_0
    //   332: aload 7
    //   334: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   337: aload_0
    //   338: getfield 259	com/vvt/autoupdate/d:k	Landroid/content/Context;
    //   341: astore 7
    //   343: aload 7
    //   345: invokevirtual 268	android/content/Context:getPackageName	()Ljava/lang/String;
    //   348: astore 14
    //   350: ldc_w 569
    //   353: astore 7
    //   355: aload 14
    //   357: aload 7
    //   359: invokestatic 570	com/fx/daemon/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   362: astore 13
    //   364: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   367: istore 6
    //   369: iload 6
    //   371: ifeq +3 -> 374
    //   374: aload 13
    //   376: invokestatic 574	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   379: istore 6
    //   381: iload 6
    //   383: ifne +980 -> 1363
    //   386: ldc_w 569
    //   389: astore 7
    //   391: aload 7
    //   393: aload 13
    //   395: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   398: astore 7
    //   400: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   403: istore 17
    //   405: iload 17
    //   407: ifeq +3 -> 410
    //   410: ldc -20
    //   412: astore 16
    //   414: iconst_1
    //   415: istore 18
    //   417: iload 18
    //   419: anewarray 4	java/lang/Object
    //   422: astore 19
    //   424: aconst_null
    //   425: astore 20
    //   427: aload 19
    //   429: iconst_0
    //   430: aload 7
    //   432: aastore
    //   433: aload 16
    //   435: aload 19
    //   437: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   440: astore 7
    //   442: aload 9
    //   444: aload 7
    //   446: invokevirtual 110	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   449: pop
    //   450: ldc_w 576
    //   453: astore 7
    //   455: iconst_1
    //   456: istore 17
    //   458: iload 17
    //   460: anewarray 4	java/lang/Object
    //   463: astore 16
    //   465: iconst_0
    //   466: istore 18
    //   468: aconst_null
    //   469: astore 19
    //   471: ldc_w 298
    //   474: astore 20
    //   476: aload 16
    //   478: iconst_0
    //   479: aload 20
    //   481: aastore
    //   482: aload 7
    //   484: aload 16
    //   486: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   489: astore 7
    //   491: aload_0
    //   492: aload 7
    //   494: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   497: ldc_w 569
    //   500: astore 7
    //   502: aload_0
    //   503: invokespecial 552	com/vvt/autoupdate/d:e	()Ljava/lang/String;
    //   506: astore 16
    //   508: aload 7
    //   510: aload 16
    //   512: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   515: astore 7
    //   517: invokestatic 525	com/vvt/aa/a:removeFromPath	()Z
    //   520: istore 17
    //   522: iload 17
    //   524: ifeq +105 -> 629
    //   527: new 114	java/util/ArrayList
    //   530: astore 16
    //   532: aload 16
    //   534: invokespecial 115	java/util/ArrayList:<init>	()V
    //   537: ldc_w 569
    //   540: astore 16
    //   542: aload 14
    //   544: aload 16
    //   546: invokestatic 579	com/fx/daemon/removeFromPath:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    //   549: astore 14
    //   551: aload 14
    //   553: invokevirtual 582	java/util/ArrayList:size	()I
    //   556: istore 17
    //   558: iload 17
    //   560: ifle +960 -> 1520
    //   563: aload 14
    //   565: invokevirtual 174	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   568: astore 7
    //   570: aload 7
    //   572: invokeinterface 179 1 0
    //   577: istore 12
    //   579: iload 12
    //   581: ifeq +1060 -> 1641
    //   584: aload 7
    //   586: invokeinterface 183 1 0
    //   591: astore 7
    //   593: aload 7
    //   595: checkcast 42	java/lang/String
    //   598: astore 7
    //   600: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   603: istore_3
    //   604: iload_3
    //   605: ifeq +3 -> 608
    //   608: aload 7
    //   610: invokestatic 584	com/fx/daemon/removeFromPath:f	(Ljava/lang/String;)Ljava/lang/String;
    //   613: astore 7
    //   615: ldc_w 586
    //   618: astore 4
    //   620: aload 7
    //   622: aload 4
    //   624: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   627: astore 7
    //   629: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   632: istore_3
    //   633: iload_3
    //   634: ifeq +3 -> 637
    //   637: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   640: istore_3
    //   641: iload_3
    //   642: ifeq +3 -> 645
    //   645: aload 10
    //   647: aload 7
    //   649: invokestatic 589	com/vvt/shell/ShellUtil:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   652: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   655: istore_3
    //   656: iload_3
    //   657: ifeq +3 -> 660
    //   660: ldc_w 294
    //   663: astore 4
    //   665: iconst_1
    //   666: istore 12
    //   668: iload 12
    //   670: anewarray 4	java/lang/Object
    //   673: astore 13
    //   675: iconst_0
    //   676: istore 21
    //   678: aconst_null
    //   679: astore 10
    //   681: aload 13
    //   683: iconst_0
    //   684: aload 7
    //   686: aastore
    //   687: aload 4
    //   689: aload 13
    //   691: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   694: astore 7
    //   696: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   699: istore_3
    //   700: iload_3
    //   701: ifeq +3 -> 704
    //   704: aload 9
    //   706: aload 7
    //   708: invokevirtual 110	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   711: pop
    //   712: ldc_w 591
    //   715: astore 7
    //   717: iconst_1
    //   718: istore_3
    //   719: iload_3
    //   720: anewarray 4	java/lang/Object
    //   723: astore 4
    //   725: iconst_0
    //   726: istore 12
    //   728: aconst_null
    //   729: astore 13
    //   731: ldc_w 298
    //   734: astore 10
    //   736: aload 4
    //   738: iconst_0
    //   739: aload 10
    //   741: aastore
    //   742: aload 7
    //   744: aload 4
    //   746: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   749: astore 7
    //   751: aload_0
    //   752: aload 7
    //   754: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   757: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   760: istore 6
    //   762: iload 6
    //   764: ifeq +3 -> 767
    //   767: ldc -1
    //   769: astore 7
    //   771: getstatic 443	com/vvt/r/a:a	Ljava/util/Set;
    //   774: astore 4
    //   776: aload_0
    //   777: getfield 390	com/vvt/autoupdate/d:j	Ljava/lang/String;
    //   780: astore 13
    //   782: aload_0
    //   783: aload 9
    //   785: aload 7
    //   787: aload 4
    //   789: aload 13
    //   791: invokespecial 594	com/vvt/autoupdate/d:a	(Lcom/vvt/shell/f;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V
    //   794: invokestatic 85	com/vvt/aa/a:FxFileObserverWorker	()Z
    //   797: istore 6
    //   799: iload 6
    //   801: ifeq +53 -> 854
    //   804: ldc -6
    //   806: astore 7
    //   808: getstatic 439	com/vvt/r/a:removeFromPath	Ljava/util/Set;
    //   811: astore 4
    //   813: aload_0
    //   814: getfield 390	com/vvt/autoupdate/d:j	Ljava/lang/String;
    //   817: astore 13
    //   819: ldc 59
    //   821: astore 10
    //   823: aload 13
    //   825: aload 10
    //   827: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   830: astore 13
    //   832: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   835: istore 21
    //   837: iload 21
    //   839: ifeq +3 -> 842
    //   842: aload_0
    //   843: aload 9
    //   845: aload 7
    //   847: aload 4
    //   849: aload 13
    //   851: invokespecial 594	com/vvt/autoupdate/d:a	(Lcom/vvt/shell/f;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V
    //   854: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   857: istore 6
    //   859: iload 6
    //   861: ifeq +3 -> 864
    //   864: aload_0
    //   865: invokespecial 457	com/vvt/autoupdate/d:f	()Ljava/lang/String;
    //   868: astore 7
    //   870: ldc_w 477
    //   873: astore 4
    //   875: aload 7
    //   877: aload 4
    //   879: invokestatic 92	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   882: astore 7
    //   884: getstatic 523	com/vvt/base/RunningMode:LIMITED_1	Lcom/vvt/base/RunningMode;
    //   887: astore 4
    //   889: aload_0
    //   890: getfield 259	com/vvt/autoupdate/d:k	Landroid/content/Context;
    //   893: astore 13
    //   895: aload_0
    //   896: aload 4
    //   898: aload 13
    //   900: aload 7
    //   902: invokespecial 534	com/vvt/autoupdate/d:a	(Lcom/vvt/base/RunningMode;Landroid/content/Context;Ljava/lang/String;)V
    //   905: ldc_w 596
    //   908: astore 7
    //   910: iconst_1
    //   911: istore_3
    //   912: iload_3
    //   913: anewarray 4	java/lang/Object
    //   916: astore 4
    //   918: iconst_0
    //   919: istore 12
    //   921: aconst_null
    //   922: astore 13
    //   924: ldc_w 298
    //   927: astore 10
    //   929: aload 4
    //   931: iconst_0
    //   932: aload 10
    //   934: aastore
    //   935: aload 7
    //   937: aload 4
    //   939: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   942: astore 7
    //   944: aload_0
    //   945: aload 7
    //   947: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   950: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   953: istore 6
    //   955: iload 6
    //   957: ifeq +3 -> 960
    //   960: aload 8
    //   962: invokevirtual 200	java/io/File:exists	()Z
    //   965: istore 6
    //   967: iload 6
    //   969: ifeq +9 -> 978
    //   972: aload 8
    //   974: invokevirtual 307	java/io/File:delete	()Z
    //   977: pop
    //   978: aload 11
    //   980: invokevirtual 200	java/io/File:exists	()Z
    //   983: istore 6
    //   985: iload 6
    //   987: ifeq +9 -> 996
    //   990: aload 11
    //   992: invokevirtual 307	java/io/File:delete	()Z
    //   995: pop
    //   996: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   999: istore 6
    //   1001: iload 6
    //   1003: ifeq +3 -> 1006
    //   1006: iconst_1
    //   1007: istore 6
    //   1009: iload 6
    //   1011: invokestatic 358	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1014: astore 7
    //   1016: aload_0
    //   1017: getfield 390	com/vvt/autoupdate/d:j	Ljava/lang/String;
    //   1020: astore 4
    //   1022: aload 7
    //   1024: aload 4
    //   1026: invokestatic 599	com/vvt/autoupdate/d:a	(Ljava/lang/Boolean;Ljava/lang/String;)Z
    //   1029: pop
    //   1030: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1033: istore 6
    //   1035: iload 6
    //   1037: ifeq +3 -> 1040
    //   1040: iconst_1
    //   1041: istore 6
    //   1043: ldc_w 601
    //   1046: astore 4
    //   1048: aload_2
    //   1049: iload 6
    //   1051: aload 4
    //   1053: invokeinterface 606 3 0
    //   1058: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1061: istore 6
    //   1063: iload 6
    //   1065: ifeq +3 -> 1068
    //   1068: ldc2_w 607
    //   1071: lstore 22
    //   1073: lload 22
    //   1075: invokestatic 616	android/os/SystemClock:sleep	(J)V
    //   1078: ldc_w 618
    //   1081: astore 7
    //   1083: aload_0
    //   1084: aload 7
    //   1086: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   1089: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1092: istore 6
    //   1094: iload 6
    //   1096: ifeq +3 -> 1099
    //   1099: aload_0
    //   1100: invokespecial 620	com/vvt/autoupdate/d:FxFileObserverWorker	()V
    //   1103: aload 9
    //   1105: ifnull +8 -> 1113
    //   1108: aload 9
    //   1110: invokevirtual 188	com/vvt/shell/f:d	()V
    //   1113: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1116: istore 6
    //   1118: iload 6
    //   1120: ifeq +3 -> 1123
    //   1123: iconst_0
    //   1124: invokestatic 100	com/vvt/shell/ShellUtil:a	(Z)V
    //   1127: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1130: istore 6
    //   1132: iload 6
    //   1134: ifeq +3 -> 1137
    //   1137: return
    //   1138: ldc_w 558
    //   1141: astore 7
    //   1143: iconst_1
    //   1144: istore 5
    //   1146: iload 5
    //   1148: anewarray 4	java/lang/Object
    //   1151: astore 9
    //   1153: iconst_0
    //   1154: istore 12
    //   1156: aconst_null
    //   1157: astore 13
    //   1159: ldc_w 302
    //   1162: astore 8
    //   1164: aload 9
    //   1166: iconst_0
    //   1167: aload 8
    //   1169: aastore
    //   1170: aload 7
    //   1172: aload 9
    //   1174: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1177: astore 7
    //   1179: aload_0
    //   1180: aload 7
    //   1182: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   1185: iconst_0
    //   1186: istore 6
    //   1188: aconst_null
    //   1189: astore 7
    //   1191: ldc_w 622
    //   1194: astore 9
    //   1196: aload_2
    //   1197: iconst_0
    //   1198: aload 9
    //   1200: invokeinterface 606 3 0
    //   1205: iconst_0
    //   1206: ifeq +7 -> 1213
    //   1209: aconst_null
    //   1210: invokevirtual 188	com/vvt/shell/f:d	()V
    //   1213: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1216: istore 6
    //   1218: iload 6
    //   1220: ifeq +3 -> 1223
    //   1223: iconst_0
    //   1224: invokestatic 100	com/vvt/shell/ShellUtil:a	(Z)V
    //   1227: goto -90 -> 1137
    //   1230: ldc_w 567
    //   1233: astore 7
    //   1235: iconst_1
    //   1236: istore_3
    //   1237: iload_3
    //   1238: anewarray 4	java/lang/Object
    //   1241: astore 4
    //   1243: aconst_null
    //   1244: astore 8
    //   1246: ldc_w 302
    //   1249: astore 10
    //   1251: aload 4
    //   1253: iconst_0
    //   1254: aload 10
    //   1256: aastore
    //   1257: aload 7
    //   1259: aload 4
    //   1261: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1264: astore 7
    //   1266: aload_0
    //   1267: aload 7
    //   1269: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   1272: iconst_0
    //   1273: istore_3
    //   1274: aconst_null
    //   1275: astore 4
    //   1277: new 206	java/lang/StringBuilder
    //   1280: astore 7
    //   1282: aload 7
    //   1284: invokespecial 207	java/lang/StringBuilder:<init>	()V
    //   1287: ldc_w 624
    //   1290: astore 8
    //   1292: aload 7
    //   1294: aload 8
    //   1296: invokevirtual 213	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1299: astore 8
    //   1301: aload 13
    //   1303: getfield 627	android/util/Pair:second	Ljava/lang/Object;
    //   1306: astore 7
    //   1308: aload 7
    //   1310: checkcast 42	java/lang/String
    //   1313: astore 7
    //   1315: aload 8
    //   1317: aload 7
    //   1319: invokevirtual 213	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1322: astore 7
    //   1324: aload 7
    //   1326: invokevirtual 219	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1329: astore 7
    //   1331: aload_2
    //   1332: iconst_0
    //   1333: aload 7
    //   1335: invokeinterface 606 3 0
    //   1340: aload 9
    //   1342: ifnull +8 -> 1350
    //   1345: aload 9
    //   1347: invokevirtual 188	com/vvt/shell/f:d	()V
    //   1350: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1353: istore 6
    //   1355: iload 6
    //   1357: ifeq -134 -> 1223
    //   1360: goto -137 -> 1223
    //   1363: ldc_w 576
    //   1366: astore 7
    //   1368: iconst_1
    //   1369: istore 17
    //   1371: iload 17
    //   1373: anewarray 4	java/lang/Object
    //   1376: astore 16
    //   1378: iconst_0
    //   1379: istore 18
    //   1381: aconst_null
    //   1382: astore 19
    //   1384: ldc_w 629
    //   1387: astore 20
    //   1389: aload 16
    //   1391: iconst_0
    //   1392: aload 20
    //   1394: aastore
    //   1395: aload 7
    //   1397: aload 16
    //   1399: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1402: astore 7
    //   1404: aload_0
    //   1405: aload 7
    //   1407: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   1410: goto -913 -> 497
    //   1413: astore 7
    //   1415: aload 9
    //   1417: astore 4
    //   1419: getstatic 33	com/vvt/autoupdate/d:e	Z
    //   1422: istore 5
    //   1424: iload 5
    //   1426: ifeq +3 -> 1429
    //   1429: ldc_w 631
    //   1432: astore 9
    //   1434: iconst_1
    //   1435: istore 12
    //   1437: iload 12
    //   1439: anewarray 4	java/lang/Object
    //   1442: astore 13
    //   1444: aconst_null
    //   1445: astore 8
    //   1447: aload 7
    //   1449: invokevirtual 501	java/lang/Exception:toString	()Ljava/lang/String;
    //   1452: astore 10
    //   1454: aload 13
    //   1456: iconst_0
    //   1457: aload 10
    //   1459: aastore
    //   1460: aload 9
    //   1462: aload 13
    //   1464: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1467: astore 9
    //   1469: aload_0
    //   1470: aload 9
    //   1472: invokespecial 300	com/vvt/autoupdate/d:FxFileObserverWorker	(Ljava/lang/String;)V
    //   1475: iconst_0
    //   1476: istore 5
    //   1478: aconst_null
    //   1479: astore 9
    //   1481: aload 7
    //   1483: invokevirtual 634	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1486: astore 7
    //   1488: aload_2
    //   1489: iconst_0
    //   1490: aload 7
    //   1492: invokeinterface 606 3 0
    //   1497: aload 4
    //   1499: ifnull +8 -> 1507
    //   1502: aload 4
    //   1504: invokevirtual 188	com/vvt/shell/f:d	()V
    //   1507: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1510: istore 6
    //   1512: iload 6
    //   1514: ifeq -391 -> 1123
    //   1517: goto -394 -> 1123
    //   1520: aload 13
    //   1522: invokestatic 574	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1525: istore 15
    //   1527: iload 15
    //   1529: ifeq +121 -> 1650
    //   1532: ldc_w 636
    //   1535: astore 13
    //   1537: aload 7
    //   1539: aload 13
    //   1541: invokevirtual 639	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   1544: istore 12
    //   1546: iconst_m1
    //   1547: istore 15
    //   1549: iload 12
    //   1551: iload 15
    //   1553: if_icmpeq +88 -> 1641
    //   1556: iconst_0
    //   1557: istore_3
    //   1558: aconst_null
    //   1559: astore 4
    //   1561: aload 7
    //   1563: iconst_0
    //   1564: iload 12
    //   1566: invokevirtual 550	java/lang/String:substring	(II)Ljava/lang/String;
    //   1569: astore 7
    //   1571: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1574: istore_3
    //   1575: iload_3
    //   1576: ifeq +3 -> 1579
    //   1579: aload 7
    //   1581: invokestatic 584	com/fx/daemon/removeFromPath:f	(Ljava/lang/String;)Ljava/lang/String;
    //   1584: astore 7
    //   1586: goto -971 -> 615
    //   1589: astore 7
    //   1591: iconst_0
    //   1592: istore 5
    //   1594: aconst_null
    //   1595: astore 9
    //   1597: aload 9
    //   1599: ifnull +8 -> 1607
    //   1602: aload 9
    //   1604: invokevirtual 188	com/vvt/shell/f:d	()V
    //   1607: getstatic 26	com/vvt/autoupdate/d:MyUncaughtExceptionHandler	Z
    //   1610: istore_3
    //   1611: iload_3
    //   1612: ifeq +3 -> 1615
    //   1615: iconst_0
    //   1616: invokestatic 100	com/vvt/shell/ShellUtil:a	(Z)V
    //   1619: aload 7
    //   1621: athrow
    //   1622: astore 7
    //   1624: goto -27 -> 1597
    //   1627: astore 7
    //   1629: aload 4
    //   1631: astore 9
    //   1633: goto -36 -> 1597
    //   1636: astore 7
    //   1638: goto -219 -> 1419
    //   1641: iconst_0
    //   1642: istore 6
    //   1644: aconst_null
    //   1645: astore 7
    //   1647: goto -1032 -> 615
    //   1650: aload 13
    //   1652: astore 7
    //   1654: goto -122 -> 1532
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1657	0	this	d
    //   0	1657	1	paramString	String
    //   0	1657	2	parame	e
    //   1	1611	3	bool1	boolean
    //   3	1627	4	localObject1	Object
    //   6	33	5	bool2	boolean
    //   92	5	5	m	int
    //   170	1423	5	bool3	boolean
    //   11	1632	6	bool4	boolean
    //   46	1360	7	localObject2	Object
    //   1413	69	7	localException1	Exception
    //   1486	99	7	str1	String
    //   1589	31	7	localObject3	Object
    //   1622	1	7	localObject4	Object
    //   1627	1	7	localObject5	Object
    //   1636	1	7	localException2	Exception
    //   1645	8	7	localObject6	Object
    //   67	1379	8	localObject7	Object
    //   84	1548	9	localObject8	Object
    //   116	1342	10	str2	String
    //   131	860	11	localFile	File
    //   198	1240	12	bool5	boolean
    //   1544	21	12	n	int
    //   201	1450	13	localObject9	Object
    //   206	358	14	localObject10	Object
    //   306	1222	15	bool6	boolean
    //   1547	7	15	i1	int
    //   314	1084	16	localObject11	Object
    //   403	120	17	bool7	boolean
    //   556	816	17	i2	int
    //   415	965	18	i3	int
    //   422	961	19	arrayOfObject	Object[]
    //   425	968	20	str3	String
    //   676	162	21	bool8	boolean
    //   1071	3	22	l	long
    // Exception table:
    //   from	to	target	type
    //   244	247	1413	java/lang/Exception
    //   257	262	1413	java/lang/Exception
    //   264	269	1413	java/lang/Exception
    //   271	276	1413	java/lang/Exception
    //   278	283	1413	java/lang/Exception
    //   298	303	1413	java/lang/Exception
    //   319	322	1413	java/lang/Exception
    //   324	329	1413	java/lang/Exception
    //   332	337	1413	java/lang/Exception
    //   337	341	1413	java/lang/Exception
    //   343	348	1413	java/lang/Exception
    //   357	362	1413	java/lang/Exception
    //   364	367	1413	java/lang/Exception
    //   374	379	1413	java/lang/Exception
    //   393	398	1413	java/lang/Exception
    //   400	403	1413	java/lang/Exception
    //   417	422	1413	java/lang/Exception
    //   430	433	1413	java/lang/Exception
    //   435	440	1413	java/lang/Exception
    //   444	450	1413	java/lang/Exception
    //   458	463	1413	java/lang/Exception
    //   479	482	1413	java/lang/Exception
    //   484	489	1413	java/lang/Exception
    //   492	497	1413	java/lang/Exception
    //   502	506	1413	java/lang/Exception
    //   510	515	1413	java/lang/Exception
    //   517	520	1413	java/lang/Exception
    //   527	530	1413	java/lang/Exception
    //   532	537	1413	java/lang/Exception
    //   544	549	1413	java/lang/Exception
    //   551	556	1413	java/lang/Exception
    //   563	568	1413	java/lang/Exception
    //   570	577	1413	java/lang/Exception
    //   584	591	1413	java/lang/Exception
    //   593	598	1413	java/lang/Exception
    //   600	603	1413	java/lang/Exception
    //   608	613	1413	java/lang/Exception
    //   622	627	1413	java/lang/Exception
    //   629	632	1413	java/lang/Exception
    //   637	640	1413	java/lang/Exception
    //   647	652	1413	java/lang/Exception
    //   652	655	1413	java/lang/Exception
    //   668	673	1413	java/lang/Exception
    //   684	687	1413	java/lang/Exception
    //   689	694	1413	java/lang/Exception
    //   696	699	1413	java/lang/Exception
    //   706	712	1413	java/lang/Exception
    //   719	723	1413	java/lang/Exception
    //   739	742	1413	java/lang/Exception
    //   744	749	1413	java/lang/Exception
    //   752	757	1413	java/lang/Exception
    //   757	760	1413	java/lang/Exception
    //   771	774	1413	java/lang/Exception
    //   776	780	1413	java/lang/Exception
    //   789	794	1413	java/lang/Exception
    //   794	797	1413	java/lang/Exception
    //   808	811	1413	java/lang/Exception
    //   813	817	1413	java/lang/Exception
    //   825	830	1413	java/lang/Exception
    //   832	835	1413	java/lang/Exception
    //   849	854	1413	java/lang/Exception
    //   854	857	1413	java/lang/Exception
    //   864	868	1413	java/lang/Exception
    //   877	882	1413	java/lang/Exception
    //   884	887	1413	java/lang/Exception
    //   889	893	1413	java/lang/Exception
    //   900	905	1413	java/lang/Exception
    //   912	916	1413	java/lang/Exception
    //   932	935	1413	java/lang/Exception
    //   937	942	1413	java/lang/Exception
    //   945	950	1413	java/lang/Exception
    //   950	953	1413	java/lang/Exception
    //   960	965	1413	java/lang/Exception
    //   972	978	1413	java/lang/Exception
    //   978	983	1413	java/lang/Exception
    //   990	996	1413	java/lang/Exception
    //   996	999	1413	java/lang/Exception
    //   1009	1014	1413	java/lang/Exception
    //   1016	1020	1413	java/lang/Exception
    //   1024	1030	1413	java/lang/Exception
    //   1030	1033	1413	java/lang/Exception
    //   1051	1058	1413	java/lang/Exception
    //   1058	1061	1413	java/lang/Exception
    //   1073	1078	1413	java/lang/Exception
    //   1084	1089	1413	java/lang/Exception
    //   1089	1092	1413	java/lang/Exception
    //   1099	1103	1413	java/lang/Exception
    //   1237	1241	1413	java/lang/Exception
    //   1254	1257	1413	java/lang/Exception
    //   1259	1264	1413	java/lang/Exception
    //   1267	1272	1413	java/lang/Exception
    //   1277	1280	1413	java/lang/Exception
    //   1282	1287	1413	java/lang/Exception
    //   1294	1299	1413	java/lang/Exception
    //   1301	1306	1413	java/lang/Exception
    //   1308	1313	1413	java/lang/Exception
    //   1317	1322	1413	java/lang/Exception
    //   1324	1329	1413	java/lang/Exception
    //   1333	1340	1413	java/lang/Exception
    //   1371	1376	1413	java/lang/Exception
    //   1392	1395	1413	java/lang/Exception
    //   1397	1402	1413	java/lang/Exception
    //   1405	1410	1413	java/lang/Exception
    //   1520	1525	1413	java/lang/Exception
    //   1539	1544	1413	java/lang/Exception
    //   1564	1569	1413	java/lang/Exception
    //   1571	1574	1413	java/lang/Exception
    //   1579	1584	1413	java/lang/Exception
    //   49	54	1589	finally
    //   54	57	1589	finally
    //   64	67	1589	finally
    //   71	75	1589	finally
    //   81	84	1589	finally
    //   87	92	1589	finally
    //   96	101	1589	finally
    //   103	107	1589	finally
    //   111	116	1589	finally
    //   118	121	1589	finally
    //   128	131	1589	finally
    //   135	140	1589	finally
    //   140	145	1589	finally
    //   152	158	1589	finally
    //   160	165	1589	finally
    //   167	170	1589	finally
    //   190	195	1589	finally
    //   211	214	1589	finally
    //   216	221	1589	finally
    //   224	229	1589	finally
    //   229	232	1589	finally
    //   239	242	1589	finally
    //   1146	1151	1589	finally
    //   1167	1170	1589	finally
    //   1172	1177	1589	finally
    //   1180	1185	1589	finally
    //   1198	1205	1589	finally
    //   244	247	1622	finally
    //   257	262	1622	finally
    //   264	269	1622	finally
    //   271	276	1622	finally
    //   278	283	1622	finally
    //   298	303	1622	finally
    //   319	322	1622	finally
    //   324	329	1622	finally
    //   332	337	1622	finally
    //   337	341	1622	finally
    //   343	348	1622	finally
    //   357	362	1622	finally
    //   364	367	1622	finally
    //   374	379	1622	finally
    //   393	398	1622	finally
    //   400	403	1622	finally
    //   417	422	1622	finally
    //   430	433	1622	finally
    //   435	440	1622	finally
    //   444	450	1622	finally
    //   458	463	1622	finally
    //   479	482	1622	finally
    //   484	489	1622	finally
    //   492	497	1622	finally
    //   502	506	1622	finally
    //   510	515	1622	finally
    //   517	520	1622	finally
    //   527	530	1622	finally
    //   532	537	1622	finally
    //   544	549	1622	finally
    //   551	556	1622	finally
    //   563	568	1622	finally
    //   570	577	1622	finally
    //   584	591	1622	finally
    //   593	598	1622	finally
    //   600	603	1622	finally
    //   608	613	1622	finally
    //   622	627	1622	finally
    //   629	632	1622	finally
    //   637	640	1622	finally
    //   647	652	1622	finally
    //   652	655	1622	finally
    //   668	673	1622	finally
    //   684	687	1622	finally
    //   689	694	1622	finally
    //   696	699	1622	finally
    //   706	712	1622	finally
    //   719	723	1622	finally
    //   739	742	1622	finally
    //   744	749	1622	finally
    //   752	757	1622	finally
    //   757	760	1622	finally
    //   771	774	1622	finally
    //   776	780	1622	finally
    //   789	794	1622	finally
    //   794	797	1622	finally
    //   808	811	1622	finally
    //   813	817	1622	finally
    //   825	830	1622	finally
    //   832	835	1622	finally
    //   849	854	1622	finally
    //   854	857	1622	finally
    //   864	868	1622	finally
    //   877	882	1622	finally
    //   884	887	1622	finally
    //   889	893	1622	finally
    //   900	905	1622	finally
    //   912	916	1622	finally
    //   932	935	1622	finally
    //   937	942	1622	finally
    //   945	950	1622	finally
    //   950	953	1622	finally
    //   960	965	1622	finally
    //   972	978	1622	finally
    //   978	983	1622	finally
    //   990	996	1622	finally
    //   996	999	1622	finally
    //   1009	1014	1622	finally
    //   1016	1020	1622	finally
    //   1024	1030	1622	finally
    //   1030	1033	1622	finally
    //   1051	1058	1622	finally
    //   1058	1061	1622	finally
    //   1073	1078	1622	finally
    //   1084	1089	1622	finally
    //   1089	1092	1622	finally
    //   1099	1103	1622	finally
    //   1237	1241	1622	finally
    //   1254	1257	1622	finally
    //   1259	1264	1622	finally
    //   1267	1272	1622	finally
    //   1277	1280	1622	finally
    //   1282	1287	1622	finally
    //   1294	1299	1622	finally
    //   1301	1306	1622	finally
    //   1308	1313	1622	finally
    //   1317	1322	1622	finally
    //   1324	1329	1622	finally
    //   1333	1340	1622	finally
    //   1371	1376	1622	finally
    //   1392	1395	1622	finally
    //   1397	1402	1622	finally
    //   1405	1410	1622	finally
    //   1520	1525	1622	finally
    //   1539	1544	1622	finally
    //   1564	1569	1622	finally
    //   1571	1574	1622	finally
    //   1579	1584	1622	finally
    //   1419	1422	1627	finally
    //   1437	1442	1627	finally
    //   1447	1452	1627	finally
    //   1457	1460	1627	finally
    //   1462	1467	1627	finally
    //   1470	1475	1627	finally
    //   1481	1486	1627	finally
    //   1490	1497	1627	finally
    //   49	54	1636	java/lang/Exception
    //   54	57	1636	java/lang/Exception
    //   64	67	1636	java/lang/Exception
    //   71	75	1636	java/lang/Exception
    //   81	84	1636	java/lang/Exception
    //   87	92	1636	java/lang/Exception
    //   96	101	1636	java/lang/Exception
    //   103	107	1636	java/lang/Exception
    //   111	116	1636	java/lang/Exception
    //   118	121	1636	java/lang/Exception
    //   128	131	1636	java/lang/Exception
    //   135	140	1636	java/lang/Exception
    //   140	145	1636	java/lang/Exception
    //   152	158	1636	java/lang/Exception
    //   160	165	1636	java/lang/Exception
    //   167	170	1636	java/lang/Exception
    //   190	195	1636	java/lang/Exception
    //   211	214	1636	java/lang/Exception
    //   216	221	1636	java/lang/Exception
    //   224	229	1636	java/lang/Exception
    //   229	232	1636	java/lang/Exception
    //   239	242	1636	java/lang/Exception
    //   1146	1151	1636	java/lang/Exception
    //   1167	1170	1636	java/lang/Exception
    //   1172	1177	1636	java/lang/Exception
    //   1180	1185	1636	java/lang/Exception
    //   1198	1205	1636	java/lang/Exception
  }
  
  public Pair d()
  {
    long l1 = 30720L;
    int m = 2;
    boolean bool1 = true;
    Object localObject1 = "/system";
    long l2 = f((String)localObject1);
    Object localObject2 = new Object[m];
    Object localObject3 = Long.valueOf(l1);
    localObject2[0] = localObject3;
    localObject3 = Long.valueOf(l2);
    localObject2[bool1] = localObject3;
    String str = String.format("dir: /system, req: %d, free: %d (all in bytes)", (Object[])localObject2);
    boolean bool2 = c;
    if (bool2) {}
    boolean bool3 = l2 < l1;
    if (bool3)
    {
      bool3 = c;
      if (bool3) {}
      localObject1 = h();
      localObject4 = this.k.getPackageName();
      localObject2 = "%s du -AppEngine1 /data/data/%s";
      localObject3 = new Object[m];
      localObject3[0] = localObject1;
      localObject3[bool1] = localObject4;
      localObject4 = String.format((String)localObject2, (Object[])localObject3);
      localObject1 = "";
    }
    try
    {
      localObject1 = KMShell.a((String)localObject4);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(str);
    str = System.getProperty("line.separator");
    localObject4 = ((StringBuilder)localObject4).append(str);
    str = "dirInfo: ";
    localObject1 = ((StringBuilder)localObject4).append(str).append((String)localObject1);
    localObject4 = Boolean.valueOf(false);
    localObject1 = ((StringBuilder)localObject1).toString();
    for (localObject1 = Pair.create(localObject4, localObject1);; localObject1 = Pair.create(Boolean.valueOf(bool1), str))
    {
      return (Pair)localObject1;
      bool3 = e;
      if (!bool3) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/autoupdate/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */