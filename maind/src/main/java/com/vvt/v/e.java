package com.vvt.v;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.RunningMode;
import com.vvt.capture.camera.video.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static final boolean a;
  private static final boolean b;
  private String c;
  private RunningMode d;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  public e(String paramString, RunningMode paramRunningMode)
  {
    this.c = paramString;
    this.d = paramRunningMode;
  }
  
  private List b(ContentResolver paramContentResolver)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Object localObject5;
    Object localObject6;
    try
    {
      localObject5 = this.d;
      localObject6 = RunningMode.FULL;
      if (localObject5 == localObject6)
      {
        localObject5 = com.vvt.capture.camera.video.a.a.b();
        boolean bool2 = com.vvt.ag.b.a((String)localObject5);
        if (!bool2) {
          localObject2 = com.vvt.capture.camera.video.a.a.a((String)localObject5);
        }
        localObject6 = this.c;
        localObject2 = com.vvt.capture.camera.video.a.a.a((String)localObject6, (String)localObject5, (List)localObject1, (List)localObject2);
        if (localObject2 == null) {
          break label233;
        }
        int i = ((List)localObject2).size();
        if (i <= 0) {
          break label233;
        }
        localObject1 = ((List)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject1).next();
          localObject2 = (c)localObject2;
          localObject2 = com.vvt.capture.camera.video.b.a.a((c)localObject2);
          localArrayList.add(localObject2);
        }
        bool1 = a;
      }
    }
    finally
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      Object localObject4 = com.vvt.capture.camera.video.b.b;
      localObject4 = com.vvt.capture.camera.video.b.a.a(paramContentResolver, (Uri)localObject4);
      localObject5 = this.c;
      localObject6 = com.vvt.capture.camera.video.b.b;
      localObject4 = com.vvt.capture.camera.video.b.a.a((String)localObject5, paramContentResolver, (Uri)localObject6, (List)localObject1, (List)localObject4);
      break;
      label233:
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private List c(ContentResolver paramContentResolver)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Object localObject5;
    Object localObject6;
    try
    {
      localObject5 = this.d;
      localObject6 = RunningMode.FULL;
      if (localObject5 == localObject6)
      {
        localObject5 = com.vvt.capture.camera.video.a.a.a();
        boolean bool2 = com.vvt.ag.b.a((String)localObject5);
        if (!bool2) {
          localObject2 = com.vvt.capture.camera.video.a.a.a((String)localObject5);
        }
        localObject6 = this.c;
        localObject2 = com.vvt.capture.camera.video.a.a.a((String)localObject6, (String)localObject5, (List)localObject1, (List)localObject2);
        if (localObject2 == null) {
          break label233;
        }
        int i = ((List)localObject2).size();
        if (i <= 0) {
          break label233;
        }
        localObject1 = ((List)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject1).next();
          localObject2 = (c)localObject2;
          localObject2 = com.vvt.capture.camera.video.b.a.a((c)localObject2);
          localArrayList.add(localObject2);
        }
        bool1 = a;
      }
    }
    finally
    {
      bool1 = b;
      if (!bool1) {}
    }
    for (;;)
    {
      if (bool1) {}
      return localArrayList;
      Object localObject4 = com.vvt.capture.camera.video.b.a;
      localObject4 = com.vvt.capture.camera.video.b.a.a(paramContentResolver, (Uri)localObject4);
      localObject5 = this.c;
      localObject6 = com.vvt.capture.camera.video.b.a;
      localObject4 = com.vvt.capture.camera.video.b.a.a((String)localObject5, paramContentResolver, (Uri)localObject6, (List)localObject1, (List)localObject4);
      break;
      label233:
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public List a(ContentResolver paramContentResolver)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    List localList = b(paramContentResolver);
    localArrayList.addAll(localList);
    localList = c(paramContentResolver);
    localArrayList.addAll(localList);
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/v/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */