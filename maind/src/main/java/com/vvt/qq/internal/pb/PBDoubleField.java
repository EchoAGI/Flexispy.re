package com.vvt.qq.internal.pb;

public final class PBDoubleField
  extends PBPrimitiveField
{
  public static final PBDoubleField __repeatHelper__;
  private double value = 0.0D;
  
  static
  {
    PBDoubleField localPBDoubleField = new com/vvt/qq/internal/pb/PBDoubleField;
    localPBDoubleField.<init>(0.0D, false);
    __repeatHelper__ = localPBDoubleField;
  }
  
  public PBDoubleField(double paramDouble, boolean paramBoolean)
  {
    set(paramDouble, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof Double;
    double d;
    if (bool)
    {
      paramObject = (Double)paramObject;
      d = ((Double)paramObject).doubleValue();
    }
    for (this.value = d;; this.value = d)
    {
      setHasFlag(false);
      return;
      d = 0.0D;
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    double d;
    if (bool) {
      d = this.value;
    }
    for (int i = CodedOutputStreamMicro.computeDoubleSize(paramInt, d);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, Double paramDouble)
  {
    double d = paramDouble.doubleValue();
    return CodedOutputStreamMicro.computeDoubleSize(paramInt, d);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBDoubleField)paramPBField;
    double d = paramPBField.value;
    boolean bool = paramPBField.has();
    set(d, bool);
  }
  
  public double get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    double d = paramCodedInputStreamMicro.readDouble();
    this.value = d;
    setHasFlag(true);
  }
  
  protected Double readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return Double.valueOf(paramCodedInputStreamMicro.readDouble());
  }
  
  public void set(double paramDouble)
  {
    set(paramDouble, true);
  }
  
  public void set(double paramDouble, boolean paramBoolean)
  {
    this.value = paramDouble;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      double d = this.value;
      paramCodedOutputStreamMicro.writeDouble(paramInt, d);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Double paramDouble)
  {
    double d = paramDouble.doubleValue();
    paramCodedOutputStreamMicro.writeDouble(paramInt, d);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBDoubleField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */