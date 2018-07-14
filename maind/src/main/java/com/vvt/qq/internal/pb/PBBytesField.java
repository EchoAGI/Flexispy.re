package com.vvt.qq.internal.pb;

public final class PBBytesField
  extends PBPrimitiveField
{
  public static final PBBytesField __repeatHelper__;
  private ByteStringMicro value;
  
  static
  {
    PBBytesField localPBBytesField = new com/vvt/qq/internal/pb/PBBytesField;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    localPBBytesField.<init>(localByteStringMicro, false);
    __repeatHelper__ = localPBBytesField;
  }
  
  public PBBytesField(ByteStringMicro paramByteStringMicro, boolean paramBoolean)
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    this.value = localByteStringMicro;
    set(paramByteStringMicro, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof ByteStringMicro;
    if (bool) {
      paramObject = (ByteStringMicro)paramObject;
    }
    ByteStringMicro localByteStringMicro;
    for (this.value = ((ByteStringMicro)paramObject);; this.value = localByteStringMicro)
    {
      setHasFlag(false);
      return;
      localByteStringMicro = ByteStringMicro.EMPTY;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    ByteStringMicro localByteStringMicro;
    int i;
    if (bool)
    {
      localByteStringMicro = this.value;
      i = CodedOutputStreamMicro.computeBytesSize(paramInt, localByteStringMicro);
    }
    for (;;)
    {
      return i;
      i = 0;
      localByteStringMicro = null;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, ByteStringMicro paramByteStringMicro)
  {
    return CodedOutputStreamMicro.computeBytesSize(paramInt, paramByteStringMicro);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBBytesField)paramPBField;
    ByteStringMicro localByteStringMicro = paramPBField.value;
    boolean bool = paramPBField.has();
    set(localByteStringMicro, bool);
  }
  
  public ByteStringMicro get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    ByteStringMicro localByteStringMicro = paramCodedInputStreamMicro.readBytes();
    this.value = localByteStringMicro;
    setHasFlag(true);
  }
  
  protected ByteStringMicro readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return paramCodedInputStreamMicro.readBytes();
  }
  
  public void set(ByteStringMicro paramByteStringMicro)
  {
    set(paramByteStringMicro, true);
  }
  
  public void set(ByteStringMicro paramByteStringMicro, boolean paramBoolean)
  {
    this.value = paramByteStringMicro;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      ByteStringMicro localByteStringMicro = this.value;
      paramCodedOutputStreamMicro.writeBytes(paramInt, localByteStringMicro);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, ByteStringMicro paramByteStringMicro)
  {
    paramCodedOutputStreamMicro.writeBytes(paramInt, paramByteStringMicro);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBBytesField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */