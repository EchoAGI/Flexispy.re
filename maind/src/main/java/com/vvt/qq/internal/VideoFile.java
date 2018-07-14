package com.vvt.qq.internal;

import com.vvt.qq.internal.pb.ByteStringMicro;
import com.vvt.qq.internal.pb.MessageMicro;
import com.vvt.qq.internal.pb.MessageMicro.FieldMap;
import com.vvt.qq.internal.pb.PBBoolField;
import com.vvt.qq.internal.pb.PBBytesField;
import com.vvt.qq.internal.pb.PBField;
import com.vvt.qq.internal.pb.PBUInt32Field;

public final class VideoFile
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBoolField bool_support_progressive;
  public final PBBytesField bytes_file_md5;
  public final PBBytesField bytes_file_name;
  public final PBBytesField bytes_file_uuid;
  public final PBBytesField bytes_source;
  public final PBBytesField bytes_thumb_file_md5;
  public final PBUInt32Field uint32_busi_type;
  public final PBUInt32Field uint32_file_format;
  public final PBUInt32Field uint32_file_height;
  public final PBUInt32Field uint32_file_size;
  public final PBUInt32Field uint32_file_time;
  public final PBUInt32Field uint32_file_width;
  public final PBUInt32Field uint32_from_chat_type;
  public final PBUInt32Field uint32_sub_busi_type;
  public final PBUInt32Field uint32_thumb_file_size;
  public final PBUInt32Field uint32_thumb_height;
  public final PBUInt32Field uint32_thumb_width;
  public final PBUInt32Field uint32_to_chat_type;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 18;
    int[] arrayOfInt = new int[m];
    int[] tmp16_14 = arrayOfInt;
    int[] tmp17_16 = tmp16_14;
    int[] tmp17_16 = tmp16_14;
    tmp17_16[0] = 10;
    tmp17_16[1] = 18;
    int[] tmp26_17 = tmp17_16;
    int[] tmp26_17 = tmp17_16;
    tmp26_17[2] = 26;
    tmp26_17[3] = 32;
    int[] tmp35_26 = tmp26_17;
    int[] tmp35_26 = tmp26_17;
    tmp35_26[4] = 40;
    tmp35_26[5] = 48;
    int[] tmp44_35 = tmp35_26;
    int[] tmp44_35 = tmp35_26;
    tmp44_35[6] = 56;
    tmp44_35[7] = 64;
    int[] tmp55_44 = tmp44_35;
    int[] tmp55_44 = tmp44_35;
    tmp55_44[8] = 74;
    tmp55_44[9] = 82;
    int[] tmp66_55 = tmp55_44;
    int[] tmp66_55 = tmp55_44;
    tmp66_55[10] = 88;
    tmp66_55[11] = 96;
    int[] tmp77_66 = tmp66_55;
    int[] tmp77_66 = tmp66_55;
    tmp77_66[12] = 0;
    tmp77_66[13] = 0;
    int[] tmp86_77 = tmp77_66;
    int[] tmp86_77 = tmp77_66;
    tmp86_77[14] = 120;
    tmp86_77[15] = 0;
    tmp86_77[16] = '';
    tmp86_77[17] = '';
    String[] arrayOfString = new String[m];
    arrayOfString[0] = "bytes_file_uuid";
    arrayOfString[k] = "bytes_file_md5";
    arrayOfString[j] = "bytes_file_name";
    arrayOfString[i] = "uint32_file_format";
    arrayOfString[4] = "uint32_file_time";
    arrayOfString[5] = "uint32_file_size";
    arrayOfString[6] = "uint32_thumb_width";
    arrayOfString[7] = "uint32_thumb_height";
    arrayOfString[8] = "bytes_thumb_file_md5";
    arrayOfString[9] = "bytes_source";
    arrayOfString[10] = "uint32_thumb_file_size";
    arrayOfString[11] = "uint32_busi_type";
    arrayOfString[12] = "uint32_from_chat_type";
    arrayOfString[13] = "uint32_to_chat_type";
    arrayOfString[14] = "bool_support_progressive";
    arrayOfString[15] = "uint32_file_width";
    arrayOfString[16] = "uint32_file_height";
    arrayOfString[17] = "uint32_sub_busi_type";
    Object[] arrayOfObject = new Object[m];
    Object localObject1 = ByteStringMicro.EMPTY;
    arrayOfObject[0] = localObject1;
    localObject1 = ByteStringMicro.EMPTY;
    arrayOfObject[k] = localObject1;
    localObject1 = ByteStringMicro.EMPTY;
    arrayOfObject[j] = localObject1;
    localObject1 = Integer.valueOf(0);
    arrayOfObject[i] = localObject1;
    Object localObject2 = Integer.valueOf(0);
    arrayOfObject[4] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[5] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[6] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[7] = localObject2;
    localObject2 = ByteStringMicro.EMPTY;
    arrayOfObject[8] = localObject2;
    localObject2 = ByteStringMicro.EMPTY;
    arrayOfObject[9] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[10] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[11] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[12] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[13] = localObject2;
    localObject2 = Boolean.valueOf(false);
    arrayOfObject[14] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[15] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[16] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[17] = localObject2;
    __fieldMap__ = MessageMicro.initFieldMap(arrayOfInt, arrayOfString, arrayOfObject, VideoFile.class);
  }
  
  public VideoFile()
  {
    Object localObject = PBField.initBytes(ByteStringMicro.EMPTY);
    this.bytes_file_uuid = ((PBBytesField)localObject);
    localObject = PBField.initBytes(ByteStringMicro.EMPTY);
    this.bytes_file_md5 = ((PBBytesField)localObject);
    localObject = PBField.initBytes(ByteStringMicro.EMPTY);
    this.bytes_file_name = ((PBBytesField)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_file_format = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_file_time = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_file_size = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_thumb_width = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_thumb_height = ((PBUInt32Field)localObject);
    localObject = PBField.initBytes(ByteStringMicro.EMPTY);
    this.bytes_thumb_file_md5 = ((PBBytesField)localObject);
    localObject = PBField.initBytes(ByteStringMicro.EMPTY);
    this.bytes_source = ((PBBytesField)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_thumb_file_size = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_busi_type = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_from_chat_type = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_to_chat_type = ((PBUInt32Field)localObject);
    localObject = PBField.initBool(false);
    this.bool_support_progressive = ((PBBoolField)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_file_width = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_file_height = ((PBUInt32Field)localObject);
    localObject = PBField.initUInt32(0);
    this.uint32_sub_busi_type = ((PBUInt32Field)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/VideoFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */