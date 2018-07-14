package com.vvt.eventrepository.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.eventresult.a;
import com.vvt.events.FxEventDirection;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;

public class q
{
  private SQLiteDatabase a;
  
  public q(SQLiteDatabase paramSQLiteDatabase)
  {
    this.a = paramSQLiteDatabase;
  }
  
  public int a()
  {
    Cursor localCursor = null;
    int i = 0;
    String str1 = null;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("SELECT COUNT(*) as count FROM ").append("event_base").append(" WHERE ").append("event_type").append(" != ");
    Object localObject3 = FxEventType.SYSTEM;
    int j = ((FxEventType)localObject3).getNumber();
    localObject2 = j;
    try
    {
      localObject3 = this.a;
      localCursor = ((SQLiteDatabase)localObject3).rawQuery((String)localObject2, null);
      if (localCursor != null)
      {
        boolean bool = localCursor.moveToFirst();
        if (bool)
        {
          str1 = "count";
          i = localCursor.getColumnIndex(str1);
          i = localCursor.getInt(i);
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return i;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str2 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str2);
        throw ((Throwable)localObject2);
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
  }
  
  public a a(FxEventType paramFxEventType)
  {
    int i = 0;
    String str1 = null;
    a locala = new com/vvt/eventrepository/eventresult/a;
    locala.<init>();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = "SELECT COUNT(*) as count FROM " + "event_base" + " WHERE " + "event_type" + " = ?";
    localObject2 = null;
    for (;;)
    {
      try
      {
        localObject4 = this.a;
        j = 1;
        arrayOfString = new String[j];
        k = 0;
        m = paramFxEventType.getNumber();
        str3 = Integer.toString(m);
        arrayOfString[0] = str3;
        localObject2 = ((SQLiteDatabase)localObject4).rawQuery((String)localObject3, arrayOfString);
        if (localObject2 == null) {
          break label1615;
        }
        boolean bool1 = ((Cursor)localObject2).moveToFirst();
        if (!bool1) {
          break label1615;
        }
        localObject3 = "count";
        int n = ((Cursor)localObject2).getColumnIndex((String)localObject3);
        n = ((Cursor)localObject2).getInt(n);
        m = n;
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "SELECT COUNT(*) as count FROM ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_base";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " WHERE ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_type";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " AND ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "direction";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        localObject4 = this.a;
        j = 2;
        arrayOfString = new String[j];
        k = 0;
        int i5 = paramFxEventType.getNumber();
        Object localObject5 = Integer.toString(i5);
        arrayOfString[0] = localObject5;
        k = 1;
        localObject5 = FxEventDirection.IN;
        i5 = ((FxEventDirection)localObject5).getNumber();
        localObject5 = Integer.toString(i5);
        arrayOfString[k] = localObject5;
        localObject2 = ((SQLiteDatabase)localObject4).rawQuery((String)localObject3, arrayOfString);
        if (localObject2 == null) {
          break label1609;
        }
        boolean bool2 = ((Cursor)localObject2).moveToFirst();
        if (!bool2) {
          break label1609;
        }
        localObject3 = "count";
        int i1 = ((Cursor)localObject2).getColumnIndex((String)localObject3);
        i1 = ((Cursor)localObject2).getInt(i1);
        k = i1;
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "SELECT COUNT(*) as count FROM ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_base";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " WHERE ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_type";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " AND ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "direction";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        localObject4 = this.a;
        j = 2;
        arrayOfString = new String[j];
        i5 = 0;
        localObject5 = null;
        int i6 = paramFxEventType.getNumber();
        Object localObject6 = Integer.toString(i6);
        arrayOfString[0] = localObject6;
        i5 = 1;
        localObject6 = FxEventDirection.OUT;
        i6 = ((FxEventDirection)localObject6).getNumber();
        localObject6 = Integer.toString(i6);
        arrayOfString[i5] = localObject6;
        localObject2 = ((SQLiteDatabase)localObject4).rawQuery((String)localObject3, arrayOfString);
        if (localObject2 == null) {
          break label1600;
        }
        boolean bool3 = ((Cursor)localObject2).moveToFirst();
        if (!bool3) {
          break label1600;
        }
        localObject3 = "count";
        int i2 = ((Cursor)localObject2).getColumnIndex((String)localObject3);
        i2 = ((Cursor)localObject2).getInt(i2);
        j = i2;
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "SELECT COUNT(*) as count FROM ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_base";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " WHERE ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "event_type";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " AND ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = "direction";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        localObject4 = this.a;
        i5 = 2;
        localObject5 = new String[i5];
        i6 = 0;
        localObject6 = null;
        int i7 = paramFxEventType.getNumber();
        Object localObject7 = Integer.toString(i7);
        localObject5[0] = localObject7;
        i6 = 1;
        localObject7 = FxEventDirection.MISSED_CALL;
        i7 = ((FxEventDirection)localObject7).getNumber();
        localObject7 = Integer.toString(i7);
        localObject5[i6] = localObject7;
        localObject2 = ((SQLiteDatabase)localObject4).rawQuery((String)localObject3, (String[])localObject5);
        if (localObject2 == null) {
          break label1591;
        }
        boolean bool4 = ((Cursor)localObject2).moveToFirst();
        if (!bool4) {
          break label1591;
        }
        localObject3 = "count";
        int i3 = ((Cursor)localObject2).getColumnIndex((String)localObject3);
        i3 = ((Cursor)localObject2).getInt(i3);
        i8 = i3;
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject5 = "SELECT COUNT(*) as count FROM ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = "event_base";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = " WHERE ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = "event_type";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = " AND ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = "direction";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject5 = " = ?";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject3 = ((StringBuilder)localObject3).toString();
        localObject5 = this.a;
        i6 = 2;
        localObject6 = new String[i6];
        i7 = 0;
        localObject7 = null;
        int i9 = paramFxEventType.getNumber();
        Object localObject8 = Integer.toString(i9);
        localObject6[0] = localObject8;
        i7 = 1;
        localObject8 = FxEventDirection.UNKNOWN;
        i9 = ((FxEventDirection)localObject8).getNumber();
        localObject8 = Integer.toString(i9);
        localObject6[i7] = localObject8;
        localObject2 = ((SQLiteDatabase)localObject5).rawQuery((String)localObject3, (String[])localObject6);
        if (localObject2 != null)
        {
          boolean bool5 = ((Cursor)localObject2).moveToFirst();
          if (bool5)
          {
            localObject3 = "count";
            i4 = ((Cursor)localObject2).getColumnIndex((String)localObject3);
            i4 = ((Cursor)localObject2).getInt(i4);
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "SELECT COUNT(*) as count FROM ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "event_base";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = " WHERE ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "event_type";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = " = ?";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = " AND ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "direction";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = " = ?";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            localObject6 = this.a;
            i7 = 2;
            localObject7 = new String[i7];
            i9 = 0;
            localObject8 = null;
            int i10 = paramFxEventType.getNumber();
            Object localObject9 = Integer.toString(i10);
            localObject7[0] = localObject9;
            i9 = 1;
            localObject9 = FxEventDirection.LOCAL_IM;
            i10 = ((FxEventDirection)localObject9).getNumber();
            localObject9 = Integer.toString(i10);
            localObject7[i9] = localObject9;
            localObject2 = ((SQLiteDatabase)localObject6).rawQuery((String)localObject5, (String[])localObject7);
            if (localObject2 != null)
            {
              boolean bool6 = ((Cursor)localObject2).moveToFirst();
              if (bool6)
              {
                str1 = "count";
                i = ((Cursor)localObject2).getColumnIndex(str1);
                i = ((Cursor)localObject2).getInt(i);
              }
            }
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            if (localObject2 != null) {
              ((Cursor)localObject2).close();
            }
            locala.a(k);
            locala.f(i);
            locala.c(i8);
            locala.b(j);
            locala.e(m);
            locala.d(i4);
            return locala;
          }
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str2 = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject3).<init>(str2);
          throw ((Throwable)localObject3);
        }
        finally
        {
          if (localObject2 != null) {
            ((Cursor)localObject2).close();
          }
        }
      }
      finally
      {
        localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject4 = localThrowable.getMessage();
        ((FxDbOperationException)localObject3).<init>((String)localObject4, localThrowable);
      }
      int i4 = 0;
      localObject3 = null;
      continue;
      label1591:
      int i8 = 0;
      Object localObject4 = null;
      continue;
      label1600:
      int j = 0;
      String[] arrayOfString = null;
      continue;
      label1609:
      int k = 0;
      continue;
      label1615:
      int m = 0;
      String str3 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */