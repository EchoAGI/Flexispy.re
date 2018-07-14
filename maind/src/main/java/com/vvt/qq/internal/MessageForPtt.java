package com.vvt.qq.internal;

import com.vvt.qq.internal.pb.PBBoolField;
import com.vvt.qq.internal.pb.PBInt32Field;
import com.vvt.qq.internal.pb.PBStringField;
import com.vvt.qq.internal.pb.PBUInt32Field;
import com.vvt.qq.internal.pb.PBUInt64Field;

public class MessageForPtt
{
  public static final int PTT_SIZE_ANIM_START = 254;
  public static final int PTT_SIZE_RECV_ERROR = 252;
  public static final int PTT_SIZE_SATUTS_ERROR = 255;
  public static final int PTT_SIZE_UI_SEND = 253;
  public static final int STT_ABLE = 1;
  public static final int STT_DONE = 2;
  public static final int STT_EMPTY = 0;
  public static final int VIPFLAG_NONE = 0;
  public static final int VIPFLAG_SVIP = 2;
  public static final int VIPFLAG_VIP = 1;
  public static final int VOICE_CHANDE_YES = 1;
  public static final int VOICE_CHANGE_NO;
  public int busiType;
  public boolean c2cViaOffline;
  public boolean canParse;
  public String directUrl;
  public boolean expandStt;
  public long extFlag;
  public long fileSize;
  public String fullLocalPath;
  public long groupFileID;
  public String groupFileKeyStr;
  public boolean isReadPtt;
  public int isReport;
  public int itemType;
  public int longPttVipFlag;
  public String md5;
  public long msgRecTime;
  public long msgTime;
  public int msgVia;
  public int sampleRate;
  public String storageSource;
  public int sttAbility;
  public String sttText;
  public int subVersion;
  public String timeStr;
  public String url;
  public String urlAtServer;
  public int voiceChangeFlag;
  public int voiceLength;
  public int voiceType;
  
  public boolean doParse(byte[] paramArrayOfByte)
  {
    l1 = 0L;
    int i = 0;
    localObject1 = new com/vvt/qq/internal/PttRec;
    ((PttRec)localObject1).<init>();
    for (;;)
    {
      boolean bool6;
      try
      {
        localObject3 = ((PttRec)localObject1).mergeFrom(paramArrayOfByte);
        localObject3 = (PttRec)localObject3;
        bool1 = true;
      }
      catch (Exception localException2)
      {
        Object localObject3;
        boolean bool1;
        int j;
        boolean bool2;
        int k;
        boolean bool3;
        int m;
        boolean bool4;
        int n;
        boolean bool5;
        int i1;
        Object localObject4 = localObject1;
        this.canParse = false;
        continue;
        long l2 = l1;
        continue;
        bool6 = false;
        localObject1 = null;
        continue;
        bool6 = false;
        localObject1 = null;
        continue;
        bool6 = false;
        localObject1 = null;
        continue;
        localObject1 = "";
        continue;
        localObject1 = "";
        continue;
        long l3 = -1;
        continue;
      }
      try
      {
        this.canParse = bool1;
        bool1 = this.canParse;
        if (!bool1) {
          continue;
        }
        localObject1 = ((PttRec)localObject3).localPath.get();
        this.url = ((String)localObject1);
        l2 = ((PttRec)localObject3).size.get();
        this.fileSize = l2;
        j = ((PttRec)localObject3).type.get();
        this.itemType = j;
        bool2 = ((PttRec)localObject3).isRead.get();
        this.isReadPtt = bool2;
        localObject1 = ((PttRec)localObject3).uuid.get();
        this.urlAtServer = ((String)localObject1);
        k = ((PttRec)localObject3).pttFlag.get();
        this.sttAbility = k;
        localObject1 = ((PttRec)localObject3).md5.get();
        this.md5 = ((String)localObject1);
        localObject1 = ((PttRec)localObject3).serverStorageSource.get();
        this.storageSource = ((String)localObject1);
        k = ((PttRec)localObject3).version.get();
        this.subVersion = k;
        k = ((PttRec)localObject3).isReport.get();
        this.isReport = k;
        l2 = ((PttRec)localObject3).groupFileID.get();
        this.groupFileID = l2;
        localObject1 = ((PttRec)localObject3).sttText.get();
        this.sttText = ((String)localObject1);
        k = ((PttRec)localObject3).longPttVipFlag.get();
        this.longPttVipFlag = k;
        localObject1 = ((PttRec)localObject3).expandStt;
        bool3 = ((PBBoolField)localObject1).has();
        if (!bool3) {
          break label751;
        }
        localObject1 = ((PttRec)localObject3).expandStt;
        bool3 = ((PBBoolField)localObject1).get();
      }
      catch (Exception localException1)
      {
        continue;
        bool6 = false;
        Object localObject2 = null;
      }
    }
    this.expandStt = bool3;
    localObject1 = ((PttRec)localObject3).group_file_key;
    bool3 = ((PBStringField)localObject1).has();
    if (bool3)
    {
      localObject1 = ((PttRec)localObject3).group_file_key.get();
      this.groupFileKeyStr = ((String)localObject1);
    }
    localObject1 = ((PttRec)localObject3).msgTime;
    bool3 = ((PBUInt64Field)localObject1).has();
    if (bool3)
    {
      localObject1 = ((PttRec)localObject3).msgTime;
      l2 = ((PBUInt64Field)localObject1).get();
      this.msgTime = l2;
      localObject1 = ((PttRec)localObject3).msgRecTime;
      bool3 = ((PBUInt64Field)localObject1).has();
      if (bool3)
      {
        localObject1 = ((PttRec)localObject3).msgRecTime;
        l1 = ((PBUInt64Field)localObject1).get();
      }
      this.msgRecTime = l1;
      localObject1 = ((PttRec)localObject3).voiceType;
      bool3 = ((PBUInt32Field)localObject1).has();
      if (!bool3) {
        break label698;
      }
      localObject1 = ((PttRec)localObject3).voiceType;
      m = ((PBUInt32Field)localObject1).get();
      this.voiceType = m;
      localObject1 = ((PttRec)localObject3).voiceLength;
      bool4 = ((PBUInt32Field)localObject1).has();
      if (!bool4) {
        break label707;
      }
      localObject1 = ((PttRec)localObject3).voiceLength;
      n = ((PBUInt32Field)localObject1).get();
      this.voiceLength = n;
      localObject1 = ((PttRec)localObject3).voiceChangeFlag;
      bool5 = ((PBUInt32Field)localObject1).has();
      if (!bool5) {
        break label716;
      }
      localObject1 = ((PttRec)localObject3).voiceChangeFlag;
      i1 = ((PBUInt32Field)localObject1).get();
      this.voiceChangeFlag = i1;
      localObject1 = ((PttRec)localObject3).busiType;
      bool6 = ((PBUInt32Field)localObject1).has();
      if (bool6)
      {
        localObject1 = ((PttRec)localObject3).busiType;
        i = ((PBUInt32Field)localObject1).get();
      }
      this.busiType = i;
      localObject1 = ((PttRec)localObject3).directUrl;
      bool6 = ((PBStringField)localObject1).has();
      if (!bool6) {
        break label725;
      }
      localObject1 = ((PttRec)localObject3).directUrl.get();
      this.directUrl = ((String)localObject1);
      localObject1 = ((PttRec)localObject3).fullLocalPath;
      bool6 = ((PBStringField)localObject1).has();
      if (!bool6) {
        break label732;
      }
      localObject1 = ((PttRec)localObject3).fullLocalPath.get();
      this.fullLocalPath = ((String)localObject1);
      localObject1 = ((PttRec)localObject3).extFlag;
      bool6 = ((PBUInt64Field)localObject1).has();
      if (!bool6) {
        break label739;
      }
      localObject3 = ((PttRec)localObject3).extFlag;
      l3 = ((PBUInt64Field)localObject3).get();
      this.extFlag = l3;
      return this.canParse;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForPtt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */