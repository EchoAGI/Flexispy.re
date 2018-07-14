package org.sqlite.database.sqlite;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public final class SqliteWrapper
{
  private static final String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
  private static final String TAG = "SqliteWrapper";
  
  public static void checkSQLiteException(Context paramContext, SQLiteException paramSQLiteException)
  {
    boolean bool = isLowMemory(paramSQLiteException);
    if (bool)
    {
      Toast.makeText(paramContext, "low memory", 0).show();
      return;
    }
    throw paramSQLiteException;
  }
  
  public static int delete(Context paramContext, ContentResolver paramContentResolver, Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    try
    {
      i = paramContentResolver.delete(paramUri, paramString, paramArrayOfString);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str1 = "SqliteWrapper";
        String str2 = "Catch a SQLiteException when delete: ";
        Log.e(str1, str2, localSQLiteException);
        checkSQLiteException(paramContext, localSQLiteException);
        int i = -1;
      }
    }
    return i;
  }
  
  public static Uri insert(Context paramContext, ContentResolver paramContentResolver, Uri paramUri, ContentValues paramContentValues)
  {
    try
    {
      localUri = paramContentResolver.insert(paramUri, paramContentValues);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Uri localUri;
        String str1 = "SqliteWrapper";
        String str2 = "Catch a SQLiteException when insert: ";
        Log.e(str1, str2, localSQLiteException);
        checkSQLiteException(paramContext, localSQLiteException);
        Object localObject = null;
      }
    }
    return localUri;
  }
  
  private static boolean isLowMemory(SQLiteException paramSQLiteException)
  {
    return paramSQLiteException.getMessage().equals("unable to open database file");
  }
  
  public static Cursor query(Context paramContext, ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    try
    {
      localCursor = paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Cursor localCursor;
        String str1 = "SqliteWrapper";
        String str2 = "Catch a SQLiteException when query: ";
        Log.e(str1, str2, localSQLiteException);
        checkSQLiteException(paramContext, localSQLiteException);
        Object localObject = null;
      }
    }
    return localCursor;
  }
  
  public static boolean requery(Context paramContext, Cursor paramCursor)
  {
    try
    {
      bool = paramCursor.requery();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str1 = "SqliteWrapper";
        String str2 = "Catch a SQLiteException when requery: ";
        Log.e(str1, str2, localSQLiteException);
        checkSQLiteException(paramContext, localSQLiteException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public static int update(Context paramContext, ContentResolver paramContentResolver, Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    try
    {
      i = paramContentResolver.update(paramUri, paramContentValues, paramString, paramArrayOfString);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        String str1 = "SqliteWrapper";
        String str2 = "Catch a SQLiteException when update: ";
        Log.e(str1, str2, localSQLiteException);
        checkSQLiteException(paramContext, localSQLiteException);
        int i = -1;
      }
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SqliteWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */