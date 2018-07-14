package com.vvt.exceptions.database;

public abstract class FxDatabaseException
  extends Exception
{
  private static final long serialVersionUID = -840488234837363059L;
  
  public FxDatabaseException() {}
  
  public FxDatabaseException(String paramString)
  {
    super(paramString);
  }
  
  public FxDatabaseException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDatabaseException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */