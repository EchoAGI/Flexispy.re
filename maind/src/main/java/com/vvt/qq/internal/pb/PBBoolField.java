package com.vvt.qq.internal.pb;

public final class PBBoolField
  extends PBPrimitiveField
{
  public static final PBBoolField __repeatHelper__;
  private boolean value = false;
  
  static
  {
    PBBoolField localPBBoolField = new com/vvt/qq/internal/pb/PBBoolField;
    localPBBoolField.<init>(false, false);
    __repeatHelper__ = localPBBoolField;
  }
  
  public PBBoolField(boolean paramBoolean1, boolean paramBoolean2)
  {
    set(paramBoolean1, paramBoolean2);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof Boolean;
    if (bool)
    {
      paramObject = (Boolean)paramObject;
      bool = ((Boolean)paramObject).booleanValue();
    }
    for (this.value = bool;; this.value = false)
    {
      setHasFlag(false);
      return;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    if (bool) {
      bool = this.value;
    }
    for (int i = CodedOutputStreamMicro.computeBoolSize(paramInt, bool);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Boolean paramBoolean)
  {
    boolean bool = paramBoolean.booleanValue();
    return CodedOutputStreamMicro.computeBoolSize(paramInt, bool);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBBoolField)paramPBField;
    boolean bool1 = paramPBField.value;
    boolean bool2 = paramPBField.has();
    set(bool1, bool2);
  }
  
  public boolean get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    boolean bool = paramCodedInputStreamMicro.readBool();
    this.value = bool;
    setHasFlag(true);
  }
  
  protected Boolean readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Boolean.valueOf(paramCodedInputStreamMicro.readBool());
  }
  
  public void set(boolean paramBoolean)
  {
    set(paramBoolean, true);
  }
  
  public void set(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.value = paramBoolean1;
    setHasFlag(paramBoolean2);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      bool = this.value;
      paramCodedOutputStreamMicro.writeBool(paramInt, bool);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Boolean paramBoolean)
  {
    boolean bool = paramBoolean.booleanValue();
    paramCodedOutputStreamMicro.writeBool(paramInt, bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBBoolField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */