package com.vvt.qq.internal;

import com.vvt.qq.internal.pb.MessageMicro;
import com.vvt.qq.internal.pb.MessageMicro.FieldMap;
import com.vvt.qq.internal.pb.PBField;
import com.vvt.qq.internal.pb.PBInt32Field;
import com.vvt.qq.internal.pb.PBStringField;
import com.vvt.qq.internal.pb.PBUInt64Field;

public final class ForwardExtra
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBInt32Field foward_orgFileSizeType;
  public final PBUInt64Field foward_orgId;
  public final PBStringField foward_orgUin;
  public final PBInt32Field foward_orgUinType;
  public final PBStringField foward_orgUrl;
  public final PBStringField foward_thumbPath;
  
  static
  {
    int i = 2;
    int j = 1;
    long l = 489L;
    int k = 6;
    int[] arrayOfInt = new int[k];
    int[] tmp20_18 = arrayOfInt;
    int[] tmp21_20 = tmp20_18;
    int[] tmp21_20 = tmp20_18;
    tmp21_20[0] = 8;
    tmp21_20[1] = 18;
    int[] tmp30_21 = tmp21_20;
    int[] tmp30_21 = tmp21_20;
    tmp30_21[2] = 24;
    tmp30_21[3] = 34;
    tmp30_21[4] = 42;
    tmp30_21[5] = 48;
    String[] arrayOfString = new String[k];
    arrayOfString[0] = "foward_orgId";
    arrayOfString[j] = "foward_orgUin";
    arrayOfString[i] = "foward_orgUinType";
    arrayOfString[3] = "foward_orgUrl";
    arrayOfString[4] = "foward_thumbPath";
    arrayOfString[5] = "foward_orgFileSizeType";
    Object[] arrayOfObject = new Object[k];
    Object localObject1 = Long.valueOf(0L);
    arrayOfObject[0] = localObject1;
    localObject1 = Long.valueOf(l);
    arrayOfObject[j] = localObject1;
    localObject1 = Integer.valueOf(0);
    arrayOfObject[i] = localObject1;
    Object localObject2 = Long.valueOf(l);
    arrayOfObject[3] = localObject2;
    localObject2 = Long.valueOf(l);
    arrayOfObject[4] = localObject2;
    localObject2 = Integer.valueOf(0);
    arrayOfObject[5] = localObject2;
    __fieldMap__ = MessageMicro.initFieldMap(arrayOfInt, arrayOfString, arrayOfObject, ForwardExtra.class);
  }
  
  public ForwardExtra()
  {
    Object localObject = PBField.initUInt64(0L);
    this.foward_orgId = ((PBUInt64Field)localObject);
    localObject = PBField.initString("foward_orgUin");
    this.foward_orgUin = ((PBStringField)localObject);
    localObject = PBField.initInt32(0);
    this.foward_orgUinType = ((PBInt32Field)localObject);
    localObject = PBField.initString("foward_orgUrl");
    this.foward_orgUrl = ((PBStringField)localObject);
    localObject = PBField.initString("foward_thumbPath");
    this.foward_thumbPath = ((PBStringField)localObject);
    localObject = PBField.initInt32(0);
    this.foward_orgFileSizeType = ((PBInt32Field)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/ForwardExtra.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */