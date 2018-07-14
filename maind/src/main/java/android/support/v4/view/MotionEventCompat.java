package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public class MotionEventCompat
{
  public static final int ACTION_HOVER_ENTER = 9;
  public static final int ACTION_HOVER_EXIT = 10;
  public static final int ACTION_HOVER_MOVE = 7;
  public static final int ACTION_MASK = 255;
  public static final int ACTION_POINTER_DOWN = 5;
  public static final int ACTION_POINTER_INDEX_MASK = 65280;
  public static final int ACTION_POINTER_INDEX_SHIFT = 8;
  public static final int ACTION_POINTER_UP = 6;
  public static final int ACTION_SCROLL = 8;
  static final MotionEventCompat.MotionEventVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 5;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;
      ((MotionEventCompat.EclairMotionEventVersionImpl)localObject).<init>();
    }
    for (IMPL = (MotionEventCompat.MotionEventVersionImpl)localObject;; IMPL = (MotionEventCompat.MotionEventVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;
      ((MotionEventCompat.BaseMotionEventVersionImpl)localObject).<init>();
    }
  }
  
  public static int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.findPointerIndex(paramMotionEvent, paramInt);
  }
  
  public static int getActionIndex(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getAction() & 0xFF00) >> 8;
  }
  
  public static int getActionMasked(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() & 0xFF;
  }
  
  public static int getPointerId(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getPointerId(paramMotionEvent, paramInt);
  }
  
  public static float getX(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getX(paramMotionEvent, paramInt);
  }
  
  public static float getY(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getY(paramMotionEvent, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/MotionEventCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */