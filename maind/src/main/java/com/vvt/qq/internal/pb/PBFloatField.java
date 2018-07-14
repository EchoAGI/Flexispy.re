package com.vvt.qq.internal.pb;

public final class PBFloatField
  extends PBPrimitiveField
{
  public static final PBFloatField __repeatHelper__;
  private float value = 0.0F;
  
  static
  {
    PBFloatField localPBFloatField = new com/vvt/qq/internal/pb/PBFloatField;
    localPBFloatField.<init>(0.0F, false);
    __repeatHelper__ = localPBFloatField;
  }
  
  public PBFloatField(float paramFloat, boolean paramBoolean)
  {
    set(paramFloat, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof Float;
    float f;
    if (bool)
    {
      paramObject = (Float)paramObject;
      f = ((Float)paramObject).floatValue();
    }
    for (this.value = f;; this.value = 0.0F)
    {
      setHasFlag(false);
      return;
      bool = false;
      f = 0.0F;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    float f;
    int i;
    if (bool)
    {
      f = this.value;
      i = CodedOutputStreamMicro.computeFloatSize(paramInt, f);
    }
    for (;;)
    {
      return i;
      i = 0;
      f = 0.0F;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    return CodedOutputStreamMicro.computeFloatSize(paramInt, f);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBFloatField)paramPBField;
    float f = paramPBField.value;
    boolean bool = paramPBField.has();
    set(f, bool);
  }
  
  public float get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    float f = paramCodedInputStreamMicro.readFloat();
    this.value = f;
    setHasFlag(true);
  }
  
  protected Float readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Float.valueOf(paramCodedInputStreamMicro.readFloat());
  }
  
  public void set(float paramFloat)
  {
    set(paramFloat, true);
  }
  
  public void set(float paramFloat, boolean paramBoolean)
  {
    this.value = paramFloat;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      float f = this.value;
      paramCodedOutputStreamMicro.writeFloat(paramInt, f);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramCodedOutputStreamMicro.writeFloat(paramInt, f);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBFloatField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */