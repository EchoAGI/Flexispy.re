package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_replyKeyboardMarkup
  extends TLRPC.ReplyMarkup
{
  public static int constructor = 889353612;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    if (k != 0)
    {
      k = i;
      this.resize = k;
      k = this.flags & 0x2;
      if (k == 0) {
        break label158;
      }
      k = i;
      label56:
      this.single_use = k;
      k = this.flags & 0x4;
      if (k == 0) {
        break label167;
      }
      k = i;
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      this.selective = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break label176;
      }
      if (!paramBoolean) {
        break label209;
      }
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new Object[i];
      Object localObject3 = Integer.valueOf(k);
      localObject2[0] = localObject3;
      localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
      ((RuntimeException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      k = 0;
      localObject3 = null;
      break;
      label158:
      k = 0;
      localObject3 = null;
      break label56;
      label167:
      k = 0;
      localObject3 = null;
    }
    label176:
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.TL_keyboardButtonRow.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        label209:
        return;
      }
      localObject1 = this.rows;
      ((ArrayList)localObject1).add(localObject2);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.resize;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.single_use;
      if (!bool2) {
        break label157;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.selective;
      if (!bool3) {
        break label168;
      }
    }
    label157:
    label168:
    for (int m = this.flags | 0x4;; m = this.flags & 0xFFFFFFFB)
    {
      this.flags = m;
      m = this.flags;
      paramAbstractSerializedData.writeInt32(m);
      paramAbstractSerializedData.writeInt32(481674261);
      int n = this.rows.size();
      paramAbstractSerializedData.writeInt32(n);
      m = 0;
      TLRPC.TL_keyboardButtonRow localTL_keyboardButtonRow = null;
      for (int i1 = 0; i1 < n; i1 = m)
      {
        localTL_keyboardButtonRow = (TLRPC.TL_keyboardButtonRow)this.rows.get(i1);
        localTL_keyboardButtonRow.serializeToStream(paramAbstractSerializedData);
        m = i1 + 1;
      }
      m = this.flags & 0xFFFFFFFE;
      break;
      m = this.flags & 0xFFFFFFFD;
      break label46;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_replyKeyboardMarkup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */