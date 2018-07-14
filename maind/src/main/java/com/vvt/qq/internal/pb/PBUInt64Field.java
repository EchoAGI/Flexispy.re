package com.vvt.qq.internal.pb;

public final class PBUInt64Field
  extends PBPrimitiveField
{
  public static final PBUInt64Field __repeatHelper__;
  private long value = 0L;
  
  static
  {
    PBUInt64Field localPBUInt64Field = new com/vvt/qq/internal/pb/PBUInt64Field;
    localPBUInt64Field.<init>(0L, false);
    __repeatHelper__ = localPBUInt64Field;
  }
  
  public PBUInt64Field(long paramLong, boolean paramBoolean)
  {
    set(paramLong, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof Long;
    long l;
    if (bool)
    {
      paramObject = (Long)paramObject;
      l = ((Long)paramObject).longValue();
    }
    for (this.value = l;; this.value = l)
    {
      setHasFlag(false);
      return;
      l = 0L;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    long l;
    if (bool) {
      l = this.value;
    }
    for (int i = CodedOutputStreamMicro.computeUInt64Size(paramInt, l);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Long paramLong)
  {
    long l = paramLong.longValue();
    return CodedOutputStreamMicro.computeUInt64Size(paramInt, l);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBUInt64Field)paramPBField;
    long l = paramPBField.value;
    boolean bool = paramPBField.has();
    set(l, bool);
  }
  
  public long get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    long l = paramCodedInputStreamMicro.readUInt64();
    this.value = l;
    setHasFlag(true);
  }
  
  protected Long readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Long.valueOf(paramCodedInputStreamMicro.readUInt64());
  }
  
  public void set(long paramLong)
  {
    set(paramLong, true);
  }
  
  public void set(long paramLong, boolean paramBoolean)
  {
    this.value = paramLong;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      long l = this.value;
      paramCodedOutputStreamMicro.writeUInt64(paramInt, l);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Long paramLong)
  {
    long l = paramLong.longValue();
    paramCodedOutputStreamMicro.writeUInt64(paramInt, l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBUInt64Field.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */