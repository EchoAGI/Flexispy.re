package com.fx.socket;

public class FxSocketException
  extends Exception
{
  private static final long serialVersionUID = 8254108724467070697L;
  private Exception mException;
  
  public FxSocketException(Exception paramException)
  {
    this.mException = paramException;
  }
  
  public Exception getException()
  {
    return this.mException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/FxSocketException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */