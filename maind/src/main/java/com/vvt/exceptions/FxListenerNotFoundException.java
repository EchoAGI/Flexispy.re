package com.vvt.exceptions;

public class FxListenerNotFoundException
  extends Throwable
{
  private static final long serialVersionUID = 1L;
  private int callerID;
  private int cmdID;
  private long csID;
  
  public FxListenerNotFoundException() {}
  
  public FxListenerNotFoundException(String paramString)
  {
    super(paramString);
  }
  
  public long getCSID()
  {
    return this.csID;
  }
  
  public int getCallerID()
  {
    return this.callerID;
  }
  
  public int getCmdID()
  {
    return this.cmdID;
  }
  
  public void setCSID(long paramLong)
  {
    this.csID = paramLong;
  }
  
  public void setCallerID(int paramInt)
  {
    this.callerID = paramInt;
  }
  
  public void setCmdID(int paramInt)
  {
    this.cmdID = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/FxListenerNotFoundException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */