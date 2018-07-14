package com.vvt.datadeliverymanager.b.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class c
  extends SQLiteOpenHelper
{
  c(Context paramContext, String paramString, int paramInt)
  {
    super(locala, paramString, null, paramInt);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE ddm (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,  caller_id INTEGER,  cmd_id INTEGER,  priority_request INTEGER,  delivery_request_type INTEGER,  csId INTEGER,  ready_to_resume BOOLEAN,  retry_count INTEGER,  max_retry_count INTEGER,  data_provider_type INTEGER,  is_require_encryption INTEGER,  is_require_compression INTEGER,  delay_time INTEGER);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ddm");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */