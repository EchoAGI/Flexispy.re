package com.vvt.qq.internal;

import java.io.ObjectInput;

public abstract class AbsStructMsg
{
  public static final String DEFAULT_MSG_BRIEF = "应用分享";
  public static final String PA_DEFAULT_MSG_BRIEF = "你有新消息";
  public static int SOURCE_ACCOUNT_TYPE_PA;
  public String adverKey;
  public int adverSign;
  public String currentAccountUin;
  public int dynamicMsgMergeIndex;
  public String dynamicMsgMergeKey;
  public int fwFlag;
  public String index;
  public String index_name;
  public String index_type;
  public boolean isSubscript;
  public String mAlgorithmIds;
  public String mArticleIds;
  public String mCommentText;
  public String mCompatibleText;
  public String mCreateTime;
  public boolean mEmptyMsgBriefModified;
  public String mExtraData;
  public String mFileName;
  public long mFileSize;
  int mFlag;
  public String mMsgAction;
  public String mMsgActionData;
  public String mMsgBrief;
  public String mMsgOldText;
  public int mMsgServiceID;
  public int mMsgTemplateID;
  public String mMsgUrl;
  public String mMsg_A_ActionData;
  public String mMsg_I_ActionData;
  public String mOrangeWord;
  public int mPromotionMenuDestructiveIndex;
  public String mPromotionMenus;
  public String mPromotionMsg;
  public int mPromotionType;
  public String mResid;
  public String mSType;
  public String mStrategyIds;
  public String mTagName;
  int mVersion;
  public int messageVersion;
  public long msgId;
  public int sourceAccoutType;
  public String source_puin;
  public String templateIDForPortal;
  public String uin;
  public int uinType;
  public long uniseq;
  
  public abstract void readExternal(ObjectInput paramObjectInput);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/AbsStructMsg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */