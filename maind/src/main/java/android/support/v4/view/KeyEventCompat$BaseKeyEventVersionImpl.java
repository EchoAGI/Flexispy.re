package android.support.v4.view;

class KeyEventCompat$BaseKeyEventVersionImpl
  implements KeyEventCompat.KeyEventVersionImpl
{
  private static final int META_ALL_MASK = 247;
  private static final int META_MODIFIER_MASK = 247;
  
  private static int metaStateFilterDirectionalModifiers(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 1;
    int j = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int k = paramInt2 & paramInt3;
    int m;
    int n;
    if (k != 0)
    {
      m = i;
      n = paramInt4 | paramInt5;
      k = paramInt2 & n;
      if (k == 0) {
        break label71;
      }
    }
    for (;;)
    {
      if (m != 0)
      {
        if (i != 0)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("bad arguments");
          throw localIllegalArgumentException;
          m = 0;
          break;
          label71:
          i = 0;
          continue;
        }
        j = n ^ 0xFFFFFFFF;
        paramInt1 &= j;
      }
    }
    for (;;)
    {
      return paramInt1;
      if (i != 0)
      {
        j = paramInt3 ^ 0xFFFFFFFF;
        paramInt1 &= j;
      }
    }
  }
  
  public boolean metaStateHasModifiers(int paramInt1, int paramInt2)
  {
    int i = 1;
    paramInt1 = metaStateFilterDirectionalModifiers(normalizeMetaState(paramInt1) & 0xF7, paramInt2, i, 64, 128);
    int k = 2;
    int m = 16;
    int n = 32;
    paramInt1 = metaStateFilterDirectionalModifiers(paramInt1, paramInt2, k, m, n);
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return i;
      int j = 0;
    }
  }
  
  public boolean metaStateHasNoModifiers(int paramInt)
  {
    int i = normalizeMetaState(paramInt) & 0xF7;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int normalizeMetaState(int paramInt)
  {
    int i = paramInt & 0xC0;
    if (i != 0) {
      paramInt |= 0x1;
    }
    i = paramInt & 0x30;
    if (i != 0) {
      paramInt |= 0x2;
    }
    return paramInt & 0xF7;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */