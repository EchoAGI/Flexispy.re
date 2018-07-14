package com.android.internal.telephony;

public abstract class SmsMessageBase
{
  protected String mEmailBody;
  protected String mEmailFrom;
  protected int mIndexOnIcc;
  protected boolean mIsEmail;
  protected boolean mIsMwi;
  protected String mMessageBody;
  public int mMessageRef;
  protected boolean mMwiDontStore;
  protected boolean mMwiSense;
  protected SmsAddress mOriginatingAddress;
  protected byte[] mPdu;
  protected String mPseudoSubject;
  protected String mScAddress;
  protected long mScTimeMillis;
  protected int mStatusOnIcc;
  protected byte[] mUserData;
  protected SmsHeader mUserDataHeader;
  
  public SmsMessageBase()
  {
    this.mStatusOnIcc = i;
    this.mIndexOnIcc = i;
  }
  
  protected void extractEmailAddressFromMessageBody()
  {
    int i = 2;
    Object localObject = this.mMessageBody;
    String str = "( /)|( )";
    localObject = ((String)localObject).split(str, i);
    int j = localObject.length;
    if (j < i) {}
    for (;;)
    {
      return;
      str = localObject[0];
      this.mEmailFrom = str;
      j = 1;
      localObject = localObject[j];
      this.mEmailBody = ((String)localObject);
      this.mIsEmail = false;
    }
  }
  
  public String getDisplayMessageBody()
  {
    boolean bool = this.mIsEmail;
    if (bool) {}
    for (String str = this.mEmailBody;; str = getMessageBody()) {
      return str;
    }
  }
  
  public String getDisplayOriginatingAddress()
  {
    boolean bool = this.mIsEmail;
    if (bool) {}
    for (String str = this.mEmailFrom;; str = getOriginatingAddress()) {
      return str;
    }
  }
  
  public String getEmailBody()
  {
    return this.mEmailBody;
  }
  
  public String getEmailFrom()
  {
    return this.mEmailFrom;
  }
  
  public int getIndexOnIcc()
  {
    return this.mIndexOnIcc;
  }
  
  public String getMessageBody()
  {
    return this.mMessageBody;
  }
  
  public abstract SmsConstants.MessageClass getMessageClass();
  
  public String getOriginatingAddress()
  {
    Object localObject = this.mOriginatingAddress;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mOriginatingAddress.getAddressString()) {
      return (String)localObject;
    }
  }
  
  public byte[] getPdu()
  {
    return this.mPdu;
  }
  
  public abstract int getProtocolIdentifier();
  
  public String getPseudoSubject()
  {
    String str = this.mPseudoSubject;
    if (str == null) {}
    for (str = "";; str = this.mPseudoSubject) {
      return str;
    }
  }
  
  public String getServiceCenterAddress()
  {
    return this.mScAddress;
  }
  
  public abstract int getStatus();
  
  public int getStatusOnIcc()
  {
    return this.mStatusOnIcc;
  }
  
  public long getTimestampMillis()
  {
    return this.mScTimeMillis;
  }
  
  public byte[] getUserData()
  {
    return this.mUserData;
  }
  
  public SmsHeader getUserDataHeader()
  {
    return this.mUserDataHeader;
  }
  
  public abstract boolean isCphsMwiMessage();
  
  public boolean isEmail()
  {
    return this.mIsEmail;
  }
  
  public abstract boolean isMWIClearMessage();
  
  public abstract boolean isMWISetMessage();
  
  public abstract boolean isMwiDontStore();
  
  public abstract boolean isReplace();
  
  public abstract boolean isReplyPathPresent();
  
  public abstract boolean isStatusReportMessage();
  
  protected void parseMessageBody()
  {
    SmsAddress localSmsAddress = this.mOriginatingAddress;
    if (localSmsAddress != null)
    {
      localSmsAddress = this.mOriginatingAddress;
      boolean bool = localSmsAddress.couldBeEmailGateway();
      if (bool) {
        extractEmailAddressFromMessageBody();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/SmsMessageBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */