package com.vvt.qq.internal.pb;

public final class PBInt64Field
  extends PBPrimitiveField
{
  public static final PBInt64Field __repeatHelper__;
  private long value = 0L;
  
  static
  {
    PBInt64Field localPBInt64Field = new com/vvt/qq/internal/pb/PBInt64Field;
    localPBInt64Field.<init>(0L, false);
    __repeatHelper__ = localPBInt64Field;
  }
  
  public PBInt64Field(long paramLong, boolean paramBoolean)
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
    for (int i = CodedOutputStreamMicro.computeInt64Size(paramInt, l);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Long paramLong)
  {
    long l = paramLong.longValue();
    return CodedOutputStreamMicro.computeInt64Size(paramInt, l);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBInt64Field)paramPBField;
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
    long l = paramCodedInputStreamMicro.readInt64();
    this.value = l;
    setHasFlag(true);
  }
  
  protected Long readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Long.valueOf(paramCodedInputStreamMicro.readInt64());
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
      paramCodedOutputStreamMicro.writeInt64(paramInt, l);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Long paramLong)
  {
    long l = paramLong.longValue();
    paramCodedOutputStreamMicro.writeInt64(paramInt, l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBInt64Field.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */