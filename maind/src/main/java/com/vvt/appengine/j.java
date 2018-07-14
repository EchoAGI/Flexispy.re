package com.vvt.appengine;

import com.vvt.capture.simchange.d;
import com.vvt.preference.FxPrefCommonList;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class j
  implements d
{
  j(b paramb, FxPreferenceType paramFxPreferenceType) {}
  
  public List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = this.a;
      Object localObject2 = this.b;
      localObject1 = ((b)localObject1).a((FxPreferenceType)localObject2);
      localObject1 = (FxPrefCommonList)localObject1;
      if (localObject1 != null)
      {
        localObject2 = ((FxPrefCommonList)localObject1).getList();
        if (localObject2 != null)
        {
          localObject1 = ((FxPrefCommonList)localObject1).getList();
          localArrayList.addAll((Collection)localObject1);
        }
      }
    }
    catch (FxPreferenceException localFxPreferenceException)
    {
      for (;;)
      {
        boolean bool = i.a();
        if (!bool) {}
      }
    }
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */