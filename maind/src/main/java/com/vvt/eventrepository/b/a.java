package com.vvt.eventrepository.b;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

class a
  extends ContextWrapper
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public File getDatabasePath(String paramString)
  {
    File localFile1 = new java/io/File;
    localFile1.<init>(paramString);
    File localFile2 = localFile1.getParentFile();
    boolean bool = localFile2.exists();
    if (!bool)
    {
      localFile2 = localFile1.getParentFile();
      localFile2.mkdirs();
    }
    return localFile1;
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString), null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */