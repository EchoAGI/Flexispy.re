package com.vvt.exceptions.database;

public class FxDbNotOpenException
  extends FxDatabaseException
{
  private static final long serialVersionUID = 7675877715025553998L;
  
  public FxDbNotOpenException(String paramString)
  {
    super(paramString);
  }
  
  public FxDbNotOpenException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDbNotOpenException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */