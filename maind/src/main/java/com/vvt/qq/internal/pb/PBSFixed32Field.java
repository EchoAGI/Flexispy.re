package com.vvt.qq.internal.pb;

public final class PBSFixed32Field
  extends PBPrimitiveField
{
  public static final PBSFixed32Field __repeatHelper__;
  private int value = 0;
  
  static
  {
    PBSFixed32Field localPBSFixed32Field = new com/vvt/qq/internal/pb/PBSFixed32Field;
    localPBSFixed32Field.<init>(0, false);
    __repeatHelper__ = localPBSFixed32Field;
  }
  
  public PBSFixed32Field(int paramInt, boolean paramBoolean)
  {
    set(paramInt, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    int i;
    if (bool)
    {
      paramObject = (Integer)paramObject;
      i = ((Integer)paramObject).intValue();
    }
    for (this.value = i;; this.value = 0)
    {
      setHasFlag(false);
      return;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    if (bool) {
      i = this.value;
    }
    for (int i = CodedOutputStreamMicro.computeSFixed32Size(paramInt, i);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Integer paramInteger)
  {
    int i = paramInteger.intValue();
    return CodedOutputStreamMicro.computeSFixed32Size(paramInt, i);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBSFixed32Field)paramPBField;
    int i = paramPBField.value;
    boolean bool = paramPBField.has();
    set(i, bool);
  }
  
  public int get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    int i = paramCodedInputStreamMicro.readSFixed32();
    this.value = i;
    setHasFlag(true);
  }
  
  protected Integer readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Integer.valueOf(paramCodedInputStreamMicro.readSFixed32());
  }
  
  public void set(int paramInt)
  {
    set(paramInt, true);
  }
  
  public void set(int paramInt, boolean paramBoolean)
  {
    this.value = paramInt;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      int i = this.value;
      paramCodedOutputStreamMicro.writeSFixed32(paramInt, i);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Integer paramInteger)
  {
    int i = paramInteger.intValue();
    paramCodedOutputStreamMicro.writeSFixed32(paramInt, i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBSFixed32Field.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */