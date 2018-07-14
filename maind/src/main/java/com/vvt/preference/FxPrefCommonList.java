package com.vvt.preference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class FxPrefCommonList
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 1554967700728601860L;
  private List mList;
  
  public FxPrefCommonList()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mList = localArrayList;
  }
  
  public void addItem(String paramString)
  {
    this.mList.add(paramString);
  }
  
  public void clearList()
  {
    this.mList.clear();
  }
  
  public List getList()
  {
    return this.mList;
  }
  
  public abstract int getMaxCapacity();
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/FxPrefCommonList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */