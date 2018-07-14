package com.vvt.capture.telegram.internal.SQLite;

public class SQLiteException
  extends Exception
{
  private static final long serialVersionUID = -2398298479089615621L;
  public final int errorCode;
  
  public SQLiteException()
  {
    this.errorCode = 0;
  }
  
  public SQLiteException(int paramInt, String paramString)
  {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public SQLiteException(String paramString)
  {
    this(0, paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SQLite/SQLiteException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */