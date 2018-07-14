package org.sqlite.database;

import org.sqlite.database.sqlite.SQLiteDatabase;
import org.sqlite.database.sqlite.SQLiteStatement;

public class ExtraUtils
{
  private static final boolean DEBUG = false;
  public static final int STATEMENT_ABORT = 6;
  public static final int STATEMENT_ATTACH = 3;
  public static final int STATEMENT_BEGIN = 4;
  public static final int STATEMENT_COMMIT = 5;
  public static final int STATEMENT_DDL = 8;
  public static final int STATEMENT_OTHER = 99;
  public static final int STATEMENT_PRAGMA = 7;
  public static final int STATEMENT_SELECT = 1;
  public static final int STATEMENT_UNPREPARED = 9;
  public static final int STATEMENT_UPDATE = 2;
  private static final String TAG = "ExtraUtils";
  
  public static int cursorPickFillWindowStartPosition(int paramInt1, int paramInt2)
  {
    int i = paramInt2 / 3;
    return Math.max(paramInt1 - i, 0);
  }
  
  public static int findRowIdColumnIndex(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str1 = paramArrayOfString[j];
      String str2 = "_id";
      boolean bool = str1.equals(str2);
      if (!bool) {}
    }
    for (;;)
    {
      return j;
      j += 1;
      break;
      j = -1;
    }
  }
  
  public static int getTypeOfObject(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    }
    for (;;)
    {
      return i;
      boolean bool1 = paramObject instanceof byte[];
      if (bool1)
      {
        int j = 4;
      }
      else
      {
        boolean bool2 = paramObject instanceof Float;
        if (!bool2)
        {
          bool2 = paramObject instanceof Double;
          if (!bool2) {}
        }
        else
        {
          int k = 2;
          continue;
        }
        boolean bool3 = paramObject instanceof Long;
        if (!bool3)
        {
          bool3 = paramObject instanceof Integer;
          if (!bool3)
          {
            bool3 = paramObject instanceof Short;
            if (!bool3)
            {
              bool3 = paramObject instanceof Byte;
              if (!bool3) {
                break label86;
              }
            }
          }
        }
        bool3 = true;
        continue;
        label86:
        int m = 3;
      }
    }
  }
  
  public static long longForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    SQLiteStatement localSQLiteStatement = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      long l = longForQuery(localSQLiteStatement, paramArrayOfString);
      return l;
    }
    finally
    {
      localSQLiteStatement.close();
    }
  }
  
  public static long longForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    return paramSQLiteStatement.simpleQueryForLong();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/ExtraUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */