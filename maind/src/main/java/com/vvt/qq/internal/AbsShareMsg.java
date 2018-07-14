package com.vvt.qq.internal;

import java.io.ObjectInput;

public class AbsShareMsg
  extends AbsStructMsg
{
  public String mContentCover;
  public int mContentLayout;
  public String mContentSrc;
  public String mContentSummary;
  public String mContentTitle;
  boolean mHasSource;
  public boolean mMsgException;
  public String mSourceAction;
  public String mSourceActionData;
  public long mSourceAppid;
  public String mSourceIcon;
  public String mSourceName;
  public String mSourceUrl;
  public String mSource_A_ActionData;
  public String mSource_I_ActionData;
  
  public void readExternal(ObjectInput paramObjectInput) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/AbsShareMsg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */