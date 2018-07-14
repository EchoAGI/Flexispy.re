package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompat$BaseMotionEventVersionImpl
  implements MotionEventCompat.MotionEventVersionImpl
{
  public int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {}
    for (int i = 0;; i = -1) {
      return i;
    }
  }
  
  public int getPointerId(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
    localIndexOutOfBoundsException.<init>("Pre-Eclair does not support multiple pointers");
    throw localIndexOutOfBoundsException;
  }
  
  public float getX(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getX();
    }
    IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
    localIndexOutOfBoundsException.<init>("Pre-Eclair does not support multiple pointers");
    throw localIndexOutOfBoundsException;
  }
  
  public float getY(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getY();
    }
    IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
    localIndexOutOfBoundsException.<init>("Pre-Eclair does not support multiple pointers");
    throw localIndexOutOfBoundsException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */