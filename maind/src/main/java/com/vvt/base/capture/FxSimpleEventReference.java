package com.vvt.base.capture;

import java.io.Serializable;

public class FxSimpleEventReference
  implements g, Serializable
{
  private static final long serialVersionUID = -6695997491231164585L;
  private long id;
  
  public Long getReference()
  {
    return Long.valueOf(this.id);
  }
  
  public boolean isChangeFound(g paramg)
  {
    Object localObject = paramg.getReference();
    boolean bool1 = localObject instanceof Long;
    boolean bool2;
    if (bool1)
    {
      long l1 = this.id;
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      bool2 = l1 < l2;
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
      continue;
      bool2 = false;
      localObject = null;
    }
  }
  
  public boolean isNewEventFound(g paramg)
  {
    Object localObject = paramg.getReference();
    boolean bool1 = localObject instanceof Long;
    boolean bool2;
    if (bool1)
    {
      long l1 = this.id;
      localObject = (Long)localObject;
      long l2 = ((Long)localObject).longValue();
      bool2 = l1 < l2;
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
      continue;
      bool2 = false;
      localObject = null;
    }
  }
  
  public void setReference(Long paramLong)
  {
    long l = paramLong.longValue();
    this.id = l;
  }
  
  public String toString()
  {
    return String.valueOf(this.id);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/capture/FxSimpleEventReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */