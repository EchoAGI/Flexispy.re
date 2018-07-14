package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public class KeyEventCompat
{
  static final KeyEventCompat.KeyEventVersionImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/KeyEventCompat$HoneycombKeyEventVersionImpl;
      ((KeyEventCompat.HoneycombKeyEventVersionImpl)localObject).<init>();
    }
    for (IMPL = (KeyEventCompat.KeyEventVersionImpl)localObject;; IMPL = (KeyEventCompat.KeyEventVersionImpl)localObject)
    {
      return;
      localObject = new android/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;
      ((KeyEventCompat.BaseKeyEventVersionImpl)localObject).<init>();
    }
  }
  
  public static boolean hasModifiers(KeyEvent paramKeyEvent, int paramInt)
  {
    KeyEventCompat.KeyEventVersionImpl localKeyEventVersionImpl = IMPL;
    int i = paramKeyEvent.getMetaState();
    return localKeyEventVersionImpl.metaStateHasModifiers(i, paramInt);
  }
  
  public static boolean hasNoModifiers(KeyEvent paramKeyEvent)
  {
    KeyEventCompat.KeyEventVersionImpl localKeyEventVersionImpl = IMPL;
    int i = paramKeyEvent.getMetaState();
    return localKeyEventVersionImpl.metaStateHasNoModifiers(i);
  }
  
  public static boolean metaStateHasModifiers(int paramInt1, int paramInt2)
  {
    return IMPL.metaStateHasModifiers(paramInt1, paramInt2);
  }
  
  public static boolean metaStateHasNoModifiers(int paramInt)
  {
    return IMPL.metaStateHasNoModifiers(paramInt);
  }
  
  public static int normalizeMetaState(int paramInt)
  {
    return IMPL.normalizeMetaState(paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/KeyEventCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */