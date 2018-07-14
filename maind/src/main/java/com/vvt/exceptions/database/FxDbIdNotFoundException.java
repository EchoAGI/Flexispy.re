package com.vvt.exceptions.database;

public class FxDbIdNotFoundException
  extends FxDatabaseException
{
  public static final String UPLOAD_ACTUAL_MEDIA_PAIRING_ID_NOT_FOUND = "Pairing ID: %s not found!";
  private static final long serialVersionUID = -4249103796614547657L;
  
  public FxDbIdNotFoundException(String paramString)
  {
    super(paramString);
  }
  
  public FxDbIdNotFoundException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/exceptions/database/FxDbIdNotFoundException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */