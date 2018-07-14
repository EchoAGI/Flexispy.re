package com.vvt.capture.audio;

import android.content.ContentResolver;
import com.vvt.base.RunningMode;
import com.vvt.base.capture.e;
import com.vvt.base.capture.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends com.vvt.base.capture.b
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.capture.f b;
  private com.vvt.base.a c;
  private e d;
  private String e;
  
  public a(String paramString, RunningMode paramRunningMode, ContentResolver paramContentResolver, com.vvt.base.a parama)
  {
    this.c = parama;
    this.e = paramString;
    Object localObject = new com/vvt/capture/audio/b/b;
    ((com.vvt.capture.audio.b.b)localObject).<init>(paramContentResolver);
    this.d = ((e)localObject);
    localObject = RunningMode.FULL;
    int i;
    if (paramRunningMode == localObject)
    {
      i = 1;
      if (i == 0) {
        break label77;
      }
      localObject = new com/vvt/capture/audio/a/b;
      ((com.vvt.capture.audio.a.b)localObject).<init>();
    }
    for (;;)
    {
      this.b = ((com.vvt.base.capture.f)localObject);
      return;
      i = 0;
      localObject = null;
      break;
      label77:
      localObject = new com/vvt/capture/audio/b/f;
      ((com.vvt.capture.audio.b.f)localObject).<init>(paramContentResolver);
    }
  }
  
  protected g a(g paramg)
  {
    boolean bool = paramg instanceof AudioReference;
    if (bool) {
      paramg = (AudioReference)paramg;
    }
    for (;;)
    {
      return paramg;
      paramg = new com/vvt/capture/audio/AudioReference;
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
        boolean bool2 = localObject instanceof c;
        if (bool2)
        {
          localObject = com.vvt.capture.audio.b.a.a((c)localObject);
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
  
  protected com.vvt.base.capture.f c()
  {
    return this.b;
  }
  
  protected String d()
  {
    return "AudioCapture";
  }
  
  protected String e()
  {
    return this.e;
  }
  
  protected String f()
  {
    return "audio.ref";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */