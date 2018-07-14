package com.vvt.exceptions.database;

public class FxDbCorruptException
  extends FxDatabaseException
{
  private static final long serialVersionUID = -5222277790094626380L;
  
  public FxDbCorruptException() {}
  
  public FxDbCorruptException(String paramString)
  {
    super(paramString);
  }
  
  public FxDbCorruptException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDbCorruptException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */