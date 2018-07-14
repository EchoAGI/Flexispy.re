package com.vvt.addressbookmanager.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class b
  extends SQLiteOpenHelper
{
  public b(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE contacts(_id INTEGER PRIMARY KEY,client_id TEXT NOT NULL,server_id INTEGER,contact_state INTEGER,send_state INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE contact_number(_id INTEGER,number TEXT NOT NULL,FOREIGN KEY(_id) REFERENCES contacts(_id));");
    paramSQLiteDatabase.execSQL("CREATE TABLE contact_mail(_id INTEGER,email TEXT NOT NULL,FOREIGN KEY(_id) REFERENCES contacts(_id));");
    paramSQLiteDatabase.execSQL("CREATE TRIGGER delete_contact_number AFTER DELETE ON contacts BEGIN DELETE FROM contact_number WHERE old._id == contact_number._id;END;");
    paramSQLiteDatabase.execSQL("CREATE TRIGGER delete_contact_mail AFTER DELETE ON contacts BEGIN DELETE FROM contact_mail WHERE old._id == contact_mail._id;END;");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS contact_number");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS contact_mail");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */