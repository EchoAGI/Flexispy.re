package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class VelocityTrackerCompat
{
  static final VelocityTrackerCompat.VelocityTrackerVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;
      ((VelocityTrackerCompat.HoneycombVelocityTrackerVersionImpl)localObject).<init>();
    }
    for (IMPL = (VelocityTrackerCompat.VelocityTrackerVersionImpl)localObject;; IMPL = (VelocityTrackerCompat.VelocityTrackerVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;
      ((VelocityTrackerCompat.BaseVelocityTrackerVersionImpl)localObject).<init>();
    }
  }
  
  public static float getXVelocity(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return IMPL.getXVelocity(paramVelocityTracker, paramInt);
  }
  
  public static float getYVelocity(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return IMPL.getYVelocity(paramVelocityTracker, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/VelocityTrackerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */