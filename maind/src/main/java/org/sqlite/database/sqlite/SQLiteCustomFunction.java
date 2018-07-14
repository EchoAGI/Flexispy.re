package org.sqlite.database.sqlite;

public final class SQLiteCustomFunction
{
  public final SQLiteDatabase.CustomFunction callback;
  public final String name;
  public final int numArgs;
  
  public SQLiteCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    if (paramString == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("name must not be null.");
      throw localIllegalArgumentException;
    }
    this.name = paramString;
    this.numArgs = paramInt;
    this.callback = paramCustomFunction;
  }
  
  private void dispatchCallback(String[] paramArrayOfString)
  {
    this.callback.callback(paramArrayOfString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteCustomFunction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */