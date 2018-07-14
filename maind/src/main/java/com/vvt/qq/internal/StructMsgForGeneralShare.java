package com.vvt.qq.internal;

import java.io.IOException;
import java.io.ObjectInput;

public class StructMsgForGeneralShare
  extends AbsShareMsg
{
  public void readExternal(ObjectInput paramObjectInput)
  {
    i = 1;
    for (;;)
    {
      try
      {
        j = paramObjectInput.readInt();
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
          this.mContentTitle = str1;
          str1 = paramObjectInput.readUTF();
          this.mContentSummary = str1;
          long l = paramObjectInput.readLong();
          this.mSourceAppid = l;
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
          return;
        }
      }
      catch (IOException localIOException)
      {
        int j;
        String str1;
        int k;
        String str3 = localIOException.getMessage();
        if (str3 == null) {
          continue;
        }
        String str2 = localIOException.getMessage();
        str3 = "structmsg_version_error";
        boolean bool = str2.equals(str3);
        if (!bool) {
          continue;
        }
        this.mMsgException = i;
        continue;
        bool = true;
        this.mMsgException = bool;
        continue;
      }
      k = 2;
      if (j < k) {
        continue;
      }
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
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/StructMsgForGeneralShare.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */