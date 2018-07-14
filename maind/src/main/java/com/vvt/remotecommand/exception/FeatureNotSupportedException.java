package com.vvt.remotecommand.exception;

public class FeatureNotSupportedException
  extends RemoteCommandException
{
  public static final String DESC_NOT_AVAILABLE = "Feature not availble";
  private static final long serialVersionUID = -629520020489509767L;
  
  public FeatureNotSupportedException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/FeatureNotSupportedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */