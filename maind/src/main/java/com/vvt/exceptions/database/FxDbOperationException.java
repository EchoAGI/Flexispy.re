package com.vvt.exceptions.database;

public class FxDbOperationException
  extends FxDatabaseException
{
  private static final long serialVersionUID = -3606670042351926058L;
  
  public FxDbOperationException(String paramString)
  {
    super(paramString);
  }
  
  public FxDbOperationException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDbOperationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */