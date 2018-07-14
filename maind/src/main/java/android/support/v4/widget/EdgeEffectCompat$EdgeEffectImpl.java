package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

abstract interface EdgeEffectCompat$EdgeEffectImpl
{
  public abstract boolean draw(Object paramObject, Canvas paramCanvas);
  
  public abstract void finish(Object paramObject);
  
  public abstract boolean isFinished(Object paramObject);
  
  public abstract Object newEdgeEffect(Context paramContext);
  
  public abstract boolean onAbsorb(Object paramObject, int paramInt);
  
  public abstract boolean onPull(Object paramObject, float paramFloat);
  
  public abstract boolean onRelease(Object paramObject);
  
  public abstract void setSize(Object paramObject, int paramInt1, int paramInt2);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */