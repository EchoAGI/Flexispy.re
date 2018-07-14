package com.vvt.events;

public enum FxRecipientType
{
  private int mNumber;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/events/FxRecipientType;
    ((FxRecipientType)localObject).<init>("TO", 0, 0);
    TO = (FxRecipientType)localObject;
    localObject = new com/vvt/events/FxRecipientType;
    ((FxRecipientType)localObject).<init>("CC", j, j);
    CC = (FxRecipientType)localObject;
    localObject = new com/vvt/events/FxRecipientType;
    ((FxRecipientType)localObject).<init>("BCC", i, i);
    BCC = (FxRecipientType)localObject;
    localObject = new FxRecipientType[3];
    FxRecipientType localFxRecipientType = TO;
    localObject[0] = localFxRecipientType;
    localFxRecipientType = CC;
    localObject[j] = localFxRecipientType;
    localFxRecipientType = BCC;
    localObject[i] = localFxRecipientType;
    a = (FxRecipientType[])localObject;
  }
  
  private FxRecipientType(int paramInt1)
  {
    this.mNumber = paramInt1;
  }
  
  public int getNumber()
  {
    return this.mNumber;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxRecipientType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */