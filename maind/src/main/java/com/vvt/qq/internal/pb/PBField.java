package com.vvt.qq.internal.pb;

public abstract class PBField
{
  public static PBBoolField initBool(boolean paramBoolean)
  {
    PBBoolField localPBBoolField = new com/vvt/qq/internal/pb/PBBoolField;
    localPBBoolField.<init>(paramBoolean, false);
    return localPBBoolField;
  }
  
  public static PBBytesField initBytes(ByteStringMicro paramByteStringMicro)
  {
    PBBytesField localPBBytesField = new com/vvt/qq/internal/pb/PBBytesField;
    localPBBytesField.<init>(paramByteStringMicro, false);
    return localPBBytesField;
  }
  
  public static PBBytesField initBytes(byte[] paramArrayOfByte)
  {
    PBBytesField localPBBytesField = new com/vvt/qq/internal/pb/PBBytesField;
    ByteStringMicro localByteStringMicro = ByteStringMicro.copyFrom(paramArrayOfByte);
    localPBBytesField.<init>(localByteStringMicro, false);
    return localPBBytesField;
  }
  
  public static PBDoubleField initDouble(double paramDouble)
  {
    PBDoubleField localPBDoubleField = new com/vvt/qq/internal/pb/PBDoubleField;
    localPBDoubleField.<init>(paramDouble, false);
    return localPBDoubleField;
  }
  
  public static PBEnumField initEnum(int paramInt)
  {
    PBEnumField localPBEnumField = new com/vvt/qq/internal/pb/PBEnumField;
    localPBEnumField.<init>(paramInt, false);
    return localPBEnumField;
  }
  
  public static PBFixed32Field initFixed32(int paramInt)
  {
    PBFixed32Field localPBFixed32Field = new com/vvt/qq/internal/pb/PBFixed32Field;
    localPBFixed32Field.<init>(paramInt, false);
    return localPBFixed32Field;
  }
  
  public static PBFixed64Field initFixed64(long paramLong)
  {
    PBFixed64Field localPBFixed64Field = new com/vvt/qq/internal/pb/PBFixed64Field;
    localPBFixed64Field.<init>(paramLong, false);
    return localPBFixed64Field;
  }
  
  public static PBFloatField initFloat(float paramFloat)
  {
    PBFloatField localPBFloatField = new com/vvt/qq/internal/pb/PBFloatField;
    localPBFloatField.<init>(paramFloat, false);
    return localPBFloatField;
  }
  
  public static PBInt32Field initInt32(int paramInt)
  {
    PBInt32Field localPBInt32Field = new com/vvt/qq/internal/pb/PBInt32Field;
    localPBInt32Field.<init>(paramInt, false);
    return localPBInt32Field;
  }
  
  public static PBInt64Field initInt64(long paramLong)
  {
    PBInt64Field localPBInt64Field = new com/vvt/qq/internal/pb/PBInt64Field;
    localPBInt64Field.<init>(paramLong, false);
    return localPBInt64Field;
  }
  
  public static PBRepeatField initRepeat(PBField paramPBField)
  {
    PBRepeatField localPBRepeatField = new com/vvt/qq/internal/pb/PBRepeatField;
    localPBRepeatField.<init>(paramPBField);
    return localPBRepeatField;
  }
  
  public static PBRepeatMessageField initRepeatMessage(Class paramClass)
  {
    PBRepeatMessageField localPBRepeatMessageField = new com/vvt/qq/internal/pb/PBRepeatMessageField;
    localPBRepeatMessageField.<init>(paramClass);
    return localPBRepeatMessageField;
  }
  
  public static PBSFixed32Field initSFixed32(int paramInt)
  {
    PBSFixed32Field localPBSFixed32Field = new com/vvt/qq/internal/pb/PBSFixed32Field;
    localPBSFixed32Field.<init>(paramInt, false);
    return localPBSFixed32Field;
  }
  
  public static PBSFixed64Field initSFixed64(long paramLong)
  {
    PBSFixed64Field localPBSFixed64Field = new com/vvt/qq/internal/pb/PBSFixed64Field;
    localPBSFixed64Field.<init>(paramLong, false);
    return localPBSFixed64Field;
  }
  
  public static PBSInt32Field initSInt32(int paramInt)
  {
    PBSInt32Field localPBSInt32Field = new com/vvt/qq/internal/pb/PBSInt32Field;
    localPBSInt32Field.<init>(paramInt, false);
    return localPBSInt32Field;
  }
  
  public static PBSInt64Field initSInt64(long paramLong)
  {
    PBSInt64Field localPBSInt64Field = new com/vvt/qq/internal/pb/PBSInt64Field;
    localPBSInt64Field.<init>(paramLong, false);
    return localPBSInt64Field;
  }
  
  public static PBStringField initString(String paramString)
  {
    PBStringField localPBStringField = new com/vvt/qq/internal/pb/PBStringField;
    localPBStringField.<init>(paramString, false);
    return localPBStringField;
  }
  
  public static PBUInt32Field initUInt32(int paramInt)
  {
    PBUInt32Field localPBUInt32Field = new com/vvt/qq/internal/pb/PBUInt32Field;
    localPBUInt32Field.<init>(paramInt, false);
    return localPBUInt32Field;
  }
  
  public static PBUInt64Field initUInt64(long paramLong)
  {
    PBUInt64Field localPBUInt64Field = new com/vvt/qq/internal/pb/PBUInt64Field;
    localPBUInt64Field.<init>(paramLong, false);
    return localPBUInt64Field;
  }
  
  public final void clear()
  {
    clear(null);
  }
  
  public abstract void clear(Object paramObject);
  
  public abstract int computeSize(int paramInt);
  
  protected abstract int computeSizeDirectly(int paramInt, Object paramObject);
  
  protected abstract void copyFrom(PBField paramPBField);
  
  public abstract void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro);
  
  protected abstract Object readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro);
  
  public abstract void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt);
  
  protected abstract void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Object paramObject);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */