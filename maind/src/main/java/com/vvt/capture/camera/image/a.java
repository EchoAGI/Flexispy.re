package com.vvt.capture.camera.image;

import android.content.ContentResolver;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.e;
import com.vvt.base.capture.f;
import com.vvt.capture.camera.image.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private f b;
  private com.vvt.base.a c;
  private e d;
  private String e;
  
  public a(String paramString, RunningMode paramRunningMode, ContentResolver paramContentResolver, com.vvt.base.a parama)
  {
    this.c = parama;
    this.e = paramString;
    Object localObject = new com/vvt/capture/camera/image/b/c;
    ((c)localObject).<init>(paramContentResolver);
    this.d = ((e)localObject);
    localObject = RunningMode.FULL;
    int i;
    String str;
    if (paramRunningMode == localObject)
    {
      i = 1;
      if (i == 0) {
        break label85;
      }
      localObject = new com/vvt/capture/camera/image/a/b;
      str = this.e;
      ((com.vvt.capture.camera.image.a.b)localObject).<init>(str);
    }
    for (;;)
    {
      this.b = ((f)localObject);
      return;
      i = 0;
      localObject = null;
      break;
      label85:
      localObject = new com/vvt/capture/camera/image/b/g;
      str = this.e;
      ((com.vvt.capture.camera.image.b.g)localObject).<init>(str, paramContentResolver);
    }
  }
  
  protected com.vvt.base.capture.g a(com.vvt.base.capture.g paramg)
  {
    boolean bool = paramg instanceof CameraImageReference;
    if (bool) {
      paramg = (CameraImageReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/capture/camera/image/CameraImageReference;
      paramg.<init>();
    }
  }
  
  protected void a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = a;
    if ((!bool1) || (paramList != null))
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = localIterator.next();
        boolean bool2 = localObject instanceof b;
        if (bool2)
        {
          localObject = com.vvt.capture.camera.image.b.b.a((b)localObject);
          localArrayList.add(localObject);
        }
      }
      Object localObject = this.c;
      if (localObject != null)
      {
        bool1 = a;
        if (bool1) {}
        localObject = this.c;
        ((com.vvt.base.a)localObject).a(localArrayList);
      }
    }
  }
  
  protected e b()
  {
    return this.d;
  }
  
  protected f c()
  {
    return this.b;
  }
  
  protected String d()
  {
    return "CameraImageCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "image.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/image/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */