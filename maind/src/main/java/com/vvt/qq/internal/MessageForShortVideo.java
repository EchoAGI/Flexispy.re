package com.vvt.qq.internal;

import com.vvt.qq.internal.pb.ByteStringMicro;
import com.vvt.qq.internal.pb.PBBytesField;
import com.vvt.qq.internal.pb.PBUInt32Field;

public class MessageForShortVideo
{
  public boolean canPrase = false;
  public String md5;
  public int thumbFileSize;
  public int thumbHeight;
  public int thumbWidth;
  public String uuid;
  public int videoFileFormat;
  public String videoFileName;
  public int videoFileSize;
  public int videoFileTime;
  
  public boolean doParse(byte[] paramArrayOfByte)
  {
    Object localObject1 = new com/vvt/qq/internal/VideoFile;
    ((VideoFile)localObject1).<init>();
    try
    {
      ((VideoFile)localObject1).mergeFrom(paramArrayOfByte);
      bool = true;
      this.canPrase = bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool;
        Object localObject2;
        int j;
        int i = 0;
        Object localObject3 = null;
        this.canPrase = false;
      }
    }
    bool = this.canPrase;
    if (bool)
    {
      localObject2 = ((VideoFile)localObject1).bytes_file_name.get().toStringUtf8();
      this.videoFileName = ((String)localObject2);
      localObject2 = ((VideoFile)localObject1).bytes_file_uuid.get().toStringUtf8();
      this.uuid = ((String)localObject2);
      localObject2 = HexUtil.bytes2HexStr(((VideoFile)localObject1).bytes_file_md5.get().toByteArray());
      this.md5 = ((String)localObject2);
      i = ((VideoFile)localObject1).uint32_file_format.get();
      this.videoFileFormat = i;
      i = ((VideoFile)localObject1).uint32_file_size.get();
      this.videoFileSize = i;
      i = ((VideoFile)localObject1).uint32_file_time.get();
      this.videoFileTime = i;
      localObject2 = ((VideoFile)localObject1).uint32_thumb_width;
      i = ((PBUInt32Field)localObject2).get();
      this.thumbWidth = i;
      localObject1 = ((VideoFile)localObject1).uint32_thumb_height;
      j = ((PBUInt32Field)localObject1).get();
      this.thumbHeight = j;
    }
    return this.canPrase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForShortVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */