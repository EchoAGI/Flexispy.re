package com.krecorder.call.a;

import java.io.File;

public class a
{
  public static boolean a()
  {
    boolean bool1 = true;
    String[] arrayOfString = new String[9];
    arrayOfString[0] = "/sbin/";
    arrayOfString[bool1] = "/system/bin/";
    arrayOfString[2] = "/system/xbin/";
    arrayOfString[3] = "/data/local/xbin/";
    arrayOfString[4] = "/data/local/bin/";
    arrayOfString[5] = "/system/sd/xbin/";
    arrayOfString[6] = "/system/bin/failsafe/";
    arrayOfString[7] = "/data/local/";
    String str = "/su/bin/";
    arrayOfString[8] = str;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      Object localObject1 = arrayOfString[j];
      File localFile = new java/io/File;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "su";
      localObject1 = (String)localObject2;
      localFile.<init>((String)localObject1);
      boolean bool2 = localFile.exists();
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      j += 1;
      break;
      bool1 = false;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */