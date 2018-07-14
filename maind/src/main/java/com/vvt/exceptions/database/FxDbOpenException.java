package com.vvt.exceptions.database;

public class FxDbOpenException
  extends FxDatabaseException
{
  private static final long serialVersionUID = 519754861354670986L;
  
  public FxDbOpenException(String paramString)
  {
    super(paramString);
  }
  
  public FxDbOpenException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDbOpenException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */