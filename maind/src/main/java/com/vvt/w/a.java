package com.vvt.w;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;

public class a
{
  public static long a(Context paramContext)
  {
    long l1 = 1024L;
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    ActivityManager.MemoryInfo localMemoryInfo = new android/app/ActivityManager$MemoryInfo;
    localMemoryInfo.<init>();
    localActivityManager.getMemoryInfo(localMemoryInfo);
    long l2 = localMemoryInfo.availMem;
    boolean bool = l2 < l1;
    if (bool) {}
    for (l2 /= l1;; l2 = 1L) {
      return l2;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/w/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */