package com.vvt.j;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.fx.daemon.b;

public class c
{
  public String a(Context paramContext)
  {
    return paramContext.getApplicationInfo().sourceDir;
  }
  
  public String a(String paramString1, String paramString2)
  {
    Object localObject = "/";
    boolean bool = paramString2.endsWith((String)localObject);
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString2);
      str = "/";
      localObject = ((StringBuilder)localObject).append(str);
      paramString2 = ((StringBuilder)localObject).toString();
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2);
    String str = b.a(paramString1, paramString2);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/j/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */