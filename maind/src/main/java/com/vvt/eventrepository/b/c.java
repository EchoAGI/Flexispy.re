package com.vvt.eventrepository.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOpenException;
import java.io.File;
import java.io.IOException;

public class c
{
  private SQLiteDatabase a = null;
  private String b;
  
  public c(String paramString)
  {
    this.b = paramString;
  }
  
  public SQLiteDatabase a()
  {
    return this.a;
  }
  
  public void a(Context paramContext)
  {
    Object localObject1 = this.a;
    if (localObject1 == null) {}
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject1 = this.b;
        localObject1 = d.a((String)localObject1);
        localObject2 = new com/vvt/eventrepository/b/b;
        int i = 5;
        ((b)localObject2).<init>(paramContext, (String)localObject1, i);
        localObject1 = ((b)localObject2).getWritableDatabase();
        this.a = ((SQLiteDatabase)localObject1);
        return;
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        FxDbCorruptException localFxDbCorruptException = new com/vvt/exceptions/database/FxDbCorruptException;
        localFxDbCorruptException.<init>();
        throw localFxDbCorruptException;
      }
      finally
      {
        localObject2 = new com/vvt/exceptions/database/FxDbOpenException;
        ((FxDbOpenException)localObject2).<init>("An error occured opening the database. Please check inner exception for details.", localThrowable);
      }
      SQLiteDatabase localSQLiteDatabase = this.a;
      boolean bool = localSQLiteDatabase.isOpen();
      if (!bool)
      {
        b();
        a(paramContext);
      }
    }
  }
  
  public void b()
  {
    SQLiteDatabase localSQLiteDatabase = this.a;
    if (localSQLiteDatabase != null)
    {
      localSQLiteDatabase = this.a;
      boolean bool = localSQLiteDatabase.isOpen();
      if (bool)
      {
        this.a.close();
        bool = false;
        localSQLiteDatabase = null;
        this.a = null;
      }
    }
  }
  
  public boolean b(Context paramContext)
  {
    b();
    String str = d.a(this.b);
    return paramContext.deleteDatabase(str);
  }
  
  public long c()
  {
    try
    {
      String str = this.b;
      str = d.a(str);
      File localFile = new java/io/File;
      localFile.<init>(str);
      l = localFile.length();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        long l = 0L;
      }
    }
    return l;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */