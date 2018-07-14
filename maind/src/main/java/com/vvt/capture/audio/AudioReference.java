package com.vvt.capture.audio;

import com.vvt.ak.a;
import com.vvt.base.capture.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AudioReference
  implements g, Serializable
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final long serialVersionUID = 6744733899893510633L;
  private HashMap ref;
  
  public AudioReference()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.ref = localHashMap;
  }
  
  private boolean a(List paramList1, List paramList2)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = b;
    if ((!bool) || ((paramList1 != null) && (paramList2 != null)))
    {
      i = paramList1.size();
      int k = paramList2.size();
      if (i == k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  private boolean b(List paramList1, List paramList2)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = b;
    if ((!bool) || ((paramList1 != null) && (paramList2 != null)))
    {
      i = paramList1.size();
      int k = paramList2.size();
      if (i <= k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public HashMap getReference()
  {
    return this.ref;
  }
  
  public boolean isChangeFound(g paramg)
  {
    boolean bool1 = true;
    boolean bool2 = paramg instanceof AudioReference;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool2)
    {
      paramg = (AudioReference)paramg;
      new ArrayList();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      bool2 = b;
      if (bool2) {}
      localObject1 = (List)paramg.getReference().get("internal");
      localObject2 = this.ref;
      str = "internal";
      localObject2 = (List)((HashMap)localObject2).get(str);
      bool2 = a((List)localObject1, (List)localObject2);
      if (bool2) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = b;
      if (bool2) {}
      localObject1 = (List)paramg.getReference().get("external");
      localObject2 = this.ref;
      str = "external";
      localObject2 = (List)((HashMap)localObject2).get(str);
      bool2 = a((List)localObject1, (List)localObject2);
      if (bool2)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public boolean isNewEventFound(g paramg)
  {
    boolean bool1 = true;
    boolean bool2 = paramg instanceof AudioReference;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool2)
    {
      paramg = (AudioReference)paramg;
      new ArrayList();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      bool2 = b;
      if (bool2) {}
      localObject1 = (List)paramg.getReference().get("internal");
      localObject2 = this.ref;
      str = "internal";
      localObject2 = (List)((HashMap)localObject2).get(str);
      bool2 = b((List)localObject1, (List)localObject2);
      if (bool2) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = b;
      if (bool2) {}
      localObject1 = (List)paramg.getReference().get("external");
      localObject2 = this.ref;
      str = "external";
      localObject2 = (List)((HashMap)localObject2).get(str);
      bool2 = b((List)localObject1, (List)localObject2);
      if (bool2)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public void setReference(HashMap paramHashMap)
  {
    this.ref = paramHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/AudioReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */