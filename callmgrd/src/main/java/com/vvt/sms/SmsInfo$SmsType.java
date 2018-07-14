package com.vvt.sms;

public enum SmsInfo$SmsType
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/sms/SmsInfo$SmsType;
    ((SmsType)localObject).<init>("GSM", 0);
    GSM = (SmsType)localObject;
    localObject = new com/vvt/sms/SmsInfo$SmsType;
    ((SmsType)localObject).<init>("CDMA", i);
    CDMA = (SmsType)localObject;
    localObject = new SmsType[2];
    SmsType localSmsType = GSM;
    localObject[0] = localSmsType;
    localSmsType = CDMA;
    localObject[i] = localSmsType;
    a = (SmsType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/sms/SmsInfo$SmsType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */