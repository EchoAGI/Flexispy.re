package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;

 enum ManageCommonDataConstant$CommonData$2
{
  ManageCommonDataConstant$CommonData$2()
  {
    super(paramString, paramInt, null);
  }
  
  public int getCode()
  {
    return 46;
  }
  
  public FeatureId getFeatureId()
  {
    return FeatureId.CALL_WATCH_NOTIFICATION;
  }
  
  public ManageCommonDataConstant.CommonDataType getType()
  {
    return ManageCommonDataConstant.CommonDataType.RESET;
  }
  
  public boolean requiresRoot()
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/ManageCommonDataConstant$CommonData$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */