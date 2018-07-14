package com.vvt.g;

import java.util.Comparator;
import java.util.Map.Entry;

final class b
  implements Comparator
{
  public int a(Map.Entry paramEntry1, Map.Entry paramEntry2)
  {
    Comparable localComparable = (Comparable)paramEntry2.getValue();
    Object localObject = paramEntry1.getValue();
    return localComparable.compareTo(localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/FxFileObserverWorker/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */