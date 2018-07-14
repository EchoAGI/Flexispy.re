package com.vvt.qq.internal.pb;

public final class PBStringField
  extends PBPrimitiveField
{
  public static final PBStringField __repeatHelper__;
  private String value = "";
  
  static
  {
    PBStringField localPBStringField = new com/vvt/qq/internal/pb/PBStringField;
    localPBStringField.<init>("", false);
    __repeatHelper__ = localPBStringField;
  }
  
  public PBStringField(String paramString, boolean paramBoolean)
  {
    set(paramString, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (bool) {
      paramObject = (String)paramObject;
    }
    String str;
    for (this.value = ((String)paramObject);; this.value = str)
    {
      setHasFlag(false);
      return;
      str = "";
    }
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    String str;
    int i;
    if (bool)
    {
      str = this.value;
      i = CodedOutputStreamMicro.computeStringSize(paramInt, str);
    }
    for (;;)
    {
      return i;
      i = 0;
      str = null;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, String paramString)
  {
    return CodedOutputStreamMicro.computeStringSize(paramInt, paramString);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBStringField)paramPBField;
    String str = paramPBField.value;
    boolean bool = paramPBField.has();
    set(str, bool);
  }
  
  public String get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    String str = paramCodedInputStreamMicro.readString();
    this.value = str;
    setHasFlag(true);
  }
  
  protected String readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    return paramCodedInputStreamMicro.readString();
  }
  
  public void set(String paramString)
  {
    set(paramString, true);
  }
  
  public void set(String paramString, boolean paramBoolean)
  {
    this.value = paramString;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool)
    {
      String str = this.value;
      paramCodedOutputStreamMicro.writeString(paramInt, str);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, String paramString)
  {
    paramCodedOutputStreamMicro.writeString(paramInt, paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBStringField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */