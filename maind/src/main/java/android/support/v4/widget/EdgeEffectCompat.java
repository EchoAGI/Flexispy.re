package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class EdgeEffectCompat
{
  private static final EdgeEffectCompat.EdgeEffectImpl IMPL;
  private Object mEdgeEffect;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;
      ((EdgeEffectCompat.EdgeEffectIcsImpl)localObject).<init>();
    }
    for (IMPL = (EdgeEffectCompat.EdgeEffectImpl)localObject;; IMPL = (EdgeEffectCompat.EdgeEffectImpl)localObject)
    {
      return;
      localObject = new android/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;
      ((EdgeEffectCompat.BaseEdgeEffectImpl)localObject).<init>();
    }
  }
  
  public EdgeEffectCompat(Context paramContext)
  {
    Object localObject = IMPL.newEdgeEffect(paramContext);
    this.mEdgeEffect = localObject;
  }
  
  public boolean draw(Canvas paramCanvas)
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    return localEdgeEffectImpl.draw(localObject, paramCanvas);
  }
  
  public void finish()
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    localEdgeEffectImpl.finish(localObject);
  }
  
  public boolean isFinished()
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    return localEdgeEffectImpl.isFinished(localObject);
  }
  
  public boolean onAbsorb(int paramInt)
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    return localEdgeEffectImpl.onAbsorb(localObject, paramInt);
  }
  
  public boolean onPull(float paramFloat)
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    return localEdgeEffectImpl.onPull(localObject, paramFloat);
  }
  
  public boolean onRelease()
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    return localEdgeEffectImpl.onRelease(localObject);
  }
  
  public void setSize(int paramInt1, int paramInt2)
  {
    EdgeEffectCompat.EdgeEffectImpl localEdgeEffectImpl = IMPL;
    Object localObject = this.mEdgeEffect;
    localEdgeEffectImpl.setSize(localObject, paramInt1, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/EdgeEffectCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */