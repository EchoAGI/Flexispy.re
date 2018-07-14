package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageActionResend
  extends TLRPC.DecryptedMessageAction
{
  public static int constructor = 1360072880;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.start_seq_no = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.end_seq_no = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.start_seq_no;
    paramAbstractSerializedData.writeInt32(i);
    i = this.end_seq_no;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionResend.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */