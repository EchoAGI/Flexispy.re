package com.vvt.qq.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.io.ObjectInput;

public class StructMsgForAudioShare
  extends AbsShareMsg
{
  public static final int ServcieId = 2;
  
  public void readExternal(ObjectInput paramObjectInput)
  {
    i = 1;
    for (;;)
    {
      try
      {
        int j = paramObjectInput.readInt();
        this.mVersion = j;
        if (j == i)
        {
          j = paramObjectInput.readInt();
          this.mMsgTemplateID = j;
          str1 = paramObjectInput.readUTF();
          this.mMsgAction = str1;
          str1 = paramObjectInput.readUTF();
          this.mMsgActionData = str1;
          str1 = paramObjectInput.readUTF();
          this.mMsg_A_ActionData = str1;
          str1 = paramObjectInput.readUTF();
          this.mMsg_I_ActionData = str1;
          str1 = paramObjectInput.readUTF();
          this.mMsgUrl = str1;
          str1 = paramObjectInput.readUTF();
          this.mMsgBrief = str1;
          j = paramObjectInput.readInt();
          this.mContentLayout = j;
          str1 = paramObjectInput.readUTF();
          this.mContentCover = str1;
          str1 = paramObjectInput.readUTF();
          this.mContentSrc = str1;
          str1 = paramObjectInput.readUTF();
          this.mContentTitle = str1;
          str1 = paramObjectInput.readUTF();
          this.mContentSummary = str1;
          long l1 = paramObjectInput.readLong();
          this.mSourceAppid = l1;
          str1 = paramObjectInput.readUTF();
          this.mSourceIcon = str1;
          str1 = paramObjectInput.readUTF();
          this.mSourceName = str1;
          str1 = paramObjectInput.readUTF();
          this.mSourceUrl = str1;
          str1 = paramObjectInput.readUTF();
          this.mSourceAction = str1;
          str1 = paramObjectInput.readUTF();
          this.mSourceActionData = str1;
          str1 = paramObjectInput.readUTF();
          this.mSource_A_ActionData = str1;
          str1 = paramObjectInput.readUTF();
          this.mSource_I_ActionData = str1;
          j = paramObjectInput.readInt();
          this.fwFlag = j;
          str1 = this.mSourceName;
          k = TextUtils.isEmpty(str1);
          if (k != 0)
          {
            str1 = this.mSourceIcon;
            k = TextUtils.isEmpty(str1);
            if (k != 0) {}
          }
          else
          {
            k = 1;
            this.mHasSource = k;
          }
          return;
        }
      }
      catch (IOException localIOException)
      {
        String str1;
        int k;
        int n;
        int i1;
        long l2;
        boolean bool2;
        int i2;
        int i3;
        int i4;
        int m;
        String str3 = localIOException.getMessage();
        if (str3 == null) {
          continue;
        }
        String str2 = localIOException.getMessage();
        str3 = "structmsg_version_error";
        boolean bool1 = str2.equals(str3);
        if (!bool1) {
          continue;
        }
        this.mMsgException = i;
        continue;
        bool1 = true;
        this.mMsgException = bool1;
        continue;
      }
      n = 2;
      if (k < n) {
        continue;
      }
      i1 = paramObjectInput.readInt();
      this.mMsgTemplateID = i1;
      str3 = paramObjectInput.readUTF();
      this.mMsgAction = str3;
      str3 = paramObjectInput.readUTF();
      this.mMsgActionData = str3;
      str3 = paramObjectInput.readUTF();
      this.mMsg_A_ActionData = str3;
      str3 = paramObjectInput.readUTF();
      this.mMsg_I_ActionData = str3;
      str3 = paramObjectInput.readUTF();
      this.mMsgUrl = str3;
      str3 = paramObjectInput.readUTF();
      this.mMsgBrief = str3;
      i1 = paramObjectInput.readInt();
      this.mContentLayout = i1;
      str3 = paramObjectInput.readUTF();
      this.mContentCover = str3;
      str3 = paramObjectInput.readUTF();
      this.mContentSrc = str3;
      str3 = paramObjectInput.readUTF();
      this.mContentTitle = str3;
      str3 = paramObjectInput.readUTF();
      this.mContentSummary = str3;
      l2 = paramObjectInput.readLong();
      this.mSourceAppid = l2;
      str3 = paramObjectInput.readUTF();
      this.mSourceIcon = str3;
      str3 = paramObjectInput.readUTF();
      this.mSourceName = str3;
      str3 = paramObjectInput.readUTF();
      this.mSourceUrl = str3;
      str3 = paramObjectInput.readUTF();
      this.mSourceAction = str3;
      str3 = paramObjectInput.readUTF();
      this.mSourceActionData = str3;
      str3 = paramObjectInput.readUTF();
      this.mSource_A_ActionData = str3;
      str3 = paramObjectInput.readUTF();
      this.mSource_I_ActionData = str3;
      i1 = paramObjectInput.readInt();
      this.fwFlag = i1;
      i1 = paramObjectInput.readInt();
      this.mFlag = i1;
      bool2 = paramObjectInput.readBoolean();
      this.mHasSource = bool2;
      str3 = paramObjectInput.readUTF();
      this.mCommentText = str3;
      i2 = 3;
      if (k >= i2)
      {
        str3 = paramObjectInput.readUTF();
        this.mCompatibleText = str3;
        l2 = paramObjectInput.readLong();
        this.msgId = l2;
        i3 = paramObjectInput.readInt();
        this.mPromotionType = i3;
        str3 = paramObjectInput.readUTF();
        this.mPromotionMsg = str3;
        str3 = paramObjectInput.readUTF();
        this.mPromotionMenus = str3;
        i3 = paramObjectInput.readInt();
        this.mPromotionMenuDestructiveIndex = i3;
        i3 = 5;
        if (k >= i3)
        {
          str3 = paramObjectInput.readUTF();
          this.source_puin = str3;
          i4 = 7;
          if (k >= i4)
          {
            m = paramObjectInput.readInt();
            this.adverSign = m;
            str1 = paramObjectInput.readUTF();
            this.adverKey = str1;
            str1 = paramObjectInput.readUTF();
            this.index = str1;
            str1 = paramObjectInput.readUTF();
            this.index_name = str1;
            str1 = paramObjectInput.readUTF();
            this.index_type = str1;
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/StructMsgForAudioShare.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */