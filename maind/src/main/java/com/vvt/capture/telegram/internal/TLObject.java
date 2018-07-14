package com.vvt.capture.telegram.internal;

public class TLObject
{
  private static final ThreadLocal sizeCalculator;
  public boolean disableFree = false;
  
  static
  {
    TLObject.1 local1 = new com/vvt/capture/telegram/internal/TLObject$1;
    local1.<init>();
    sizeCalculator = local1;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return null;
  }
  
  public void freeResources() {}
  
  public int getObjectSize()
  {
    NativeByteBuffer localNativeByteBuffer = (NativeByteBuffer)sizeCalculator.get();
    localNativeByteBuffer.rewind();
    AbstractSerializedData localAbstractSerializedData = (AbstractSerializedData)sizeCalculator.get();
    serializeToStream(localAbstractSerializedData);
    return localNativeByteBuffer.length();
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean) {}
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */