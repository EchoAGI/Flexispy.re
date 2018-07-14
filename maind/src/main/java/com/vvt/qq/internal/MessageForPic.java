package com.vvt.qq.internal;

import com.vvt.ak.a;
import com.vvt.qq.internal.pb.PBBoolField;
import com.vvt.qq.internal.pb.PBInt32Field;
import com.vvt.qq.internal.pb.PBStringField;
import com.vvt.qq.internal.pb.PBUInt32Field;
import com.vvt.qq.internal.pb.PBUInt64Field;

public class MessageForPic
{
  private static final boolean LOGE = a.e;
  private static final String TAG = "MessageForPic";
  public static int defaultSuMsgId;
  public long DSKey;
  public String SpeedInfo;
  public String actMsgContentValue;
  public String action;
  public int aiofileType;
  public boolean bEnableEnc;
  public String bigMsgUrl;
  public String bigThumbMsgUrl;
  public int busiType;
  public int fileSizeFlag;
  public long groupFileID;
  public long height;
  public int imageType;
  public boolean isMixed;
  public boolean isRead;
  public int isReport;
  public boolean isShareAppActionMsg;
  public String localUUID;
  public int mCurrlength;
  public int mDownloadLength;
  public int mNotPredownloadReason;
  public long mPresendTransferedSize;
  public int mShowLength;
  public String md5;
  public int msgVia;
  public String path;
  public int picExtraFlag;
  public Object picExtraObject;
  public int preDownNetworkType;
  public int preDownState;
  public int previewed;
  public String rawMsgUrl;
  public ReportInfo reportInfo;
  public String serverStoreSource;
  public long shareAppID;
  public long size;
  public int subMsgId;
  public int subMsgType;
  public int subThumbHeight;
  public int subThumbWidth;
  public int subVersion;
  public int thumbHeight;
  public String thumbMsgUrl;
  public int thumbSize;
  public int thumbWidth;
  public int type;
  public String uuid;
  public long width;
  
  public MessageForPic()
  {
    int j = defaultSuMsgId;
    this.subMsgId = j;
    this.subVersion = 5;
    this.preDownState = i;
    this.preDownNetworkType = i;
    this.mNotPredownloadReason = 0;
    this.subThumbWidth = i;
    this.subThumbHeight = i;
    this.aiofileType = i;
    this.subMsgType = i;
    this.thumbSize = i;
  }
  
  public boolean doParse(byte[] paramArrayOfByte)
  {
    Object localObject1 = new com/vvt/qq/internal/PicRec;
    ((PicRec)localObject1).<init>();
    try
    {
      ((PicRec)localObject1).mergeFrom(paramArrayOfByte);
      bool1 = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        long l;
        int i;
        boolean bool2;
        int j;
        boolean bool3;
        boolean bool1 = LOGE;
        if (bool1) {}
        bool1 = false;
      }
    }
    if (bool1)
    {
      localObject2 = ((PicRec)localObject1).localPath.get();
      this.path = ((String)localObject2);
      l = ((PicRec)localObject1).size.get();
      this.size = l;
      i = ((PicRec)localObject1).type.get();
      this.type = i;
      bool2 = ((PicRec)localObject1).isRead.get();
      this.isRead = bool2;
      localObject2 = ((PicRec)localObject1).uuid.get();
      this.uuid = ((String)localObject2);
      l = ((PicRec)localObject1).groupFileID.get();
      this.groupFileID = l;
      localObject2 = ((PicRec)localObject1).md5.get();
      this.md5 = ((String)localObject2);
      localObject2 = ((PicRec)localObject1).serverStorageSource.get();
      this.serverStoreSource = ((String)localObject2);
      localObject2 = ((PicRec)localObject1).thumbMsgUrl.get();
      this.thumbMsgUrl = ((String)localObject2);
      localObject2 = ((PicRec)localObject1).bigthumbMsgUrl.get();
      this.bigThumbMsgUrl = ((String)localObject2);
      j = ((PicRec)localObject1).uint32_thumb_width.get();
      this.thumbWidth = j;
      j = ((PicRec)localObject1).uint32_thumb_height.get();
      this.thumbHeight = j;
      l = ((PicRec)localObject1).uint32_width.get();
      this.width = l;
      l = ((PicRec)localObject1).uint32_height.get();
      this.height = l;
      j = ((PicRec)localObject1).uint32_image_type.get();
      this.imageType = j;
      localObject2 = ((PicRec)localObject1).bigMsgUrl.get();
      this.bigMsgUrl = ((String)localObject2);
      localObject2 = ((PicRec)localObject1).rawMsgUrl.get();
      this.rawMsgUrl = ((String)localObject2);
      j = ((PicRec)localObject1).isReport.get();
      this.isReport = j;
      j = ((PicRec)localObject1).version.get();
      this.subVersion = j;
      j = ((PicRec)localObject1).uiOperatorFlag.get();
      this.picExtraFlag = j;
      j = ((PicRec)localObject1).fileSizeFlag.get();
      this.fileSizeFlag = j;
      localObject2 = ((PicRec)localObject1).localUUID.get();
      this.localUUID = ((String)localObject2);
      j = ((PicRec)localObject1).preDownState.get();
      this.preDownState = j;
      j = ((PicRec)localObject1).preDownNetwork.get();
      this.preDownNetworkType = j;
      j = ((PicRec)localObject1).previewed.get();
      this.previewed = j;
      j = ((PicRec)localObject1).uint32_show_len.get();
      this.mShowLength = j;
      j = ((PicRec)localObject1).uint32_download_len.get();
      this.mDownloadLength = j;
      j = ((PicRec)localObject1).uint32_current_len.get();
      this.mCurrlength = j;
      localObject2 = ((PicRec)localObject1).notPredownloadReason;
      j = ((PBUInt32Field)localObject2).get();
      this.mNotPredownloadReason = j;
      localObject1 = ((PicRec)localObject1).enableEnc;
      bool3 = ((PBBoolField)localObject1).get();
      this.bEnableEnc = bool3;
    }
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForPic.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */