package com.vvt.callmanager.ref;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class MonitorList
  implements Serializable, Iterable
{
  private static final long serialVersionUID = 5861075021746983037L;
  private List mMonitors;
  
  public MonitorList(List paramList)
  {
    this.mMonitors = paramList;
  }
  
  public Iterator iterator()
  {
    return this.mMonitors.iterator();
  }
  
  public int size()
  {
    List localList = this.mMonitors;
    int i;
    if (localList == null)
    {
      i = 0;
      localList = null;
    }
    for (;;)
    {
      return i;
      localList = this.mMonitors;
      i = localList.size();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/MonitorList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */