package com.vvt.capture.telegram.internal;

public class TLRPC$TL_accountDaysTTL
  extends TLObject
{
  public static int constructor = -1194283041;
  public int days;
  
  public static TL_accountDaysTTL TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_accountDaysTTL", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_accountDaysTTL)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_accountDaysTTL;
      ((TL_accountDaysTTL)localObject).<init>();
      ((TL_accountDaysTTL)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.days = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.days;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_accountDaysTTL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */