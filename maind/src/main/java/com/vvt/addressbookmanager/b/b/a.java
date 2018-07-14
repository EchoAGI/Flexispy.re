package com.vvt.addressbookmanager.b.b;

import android.net.Uri;
import android.provider.ContactsContract.RawContactsEntity;

public class a
{
  public static final Uri a = ContactsContract.RawContactsEntity.CONTENT_URI;
  public static final String[] b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final String f;
  public static final String g;
  public static final String h;
  public static final String i;
  
  static
  {
    Object localObject = new String[5];
    localObject[0] = "contact_id";
    localObject[1] = "data1";
    localObject[2] = "data2";
    localObject[3] = "data3";
    localObject[4] = "lookup";
    b = (String[])localObject;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    c = "contact_id" + "=?" + " AND " + "mimetype" + "='";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = c;
    d = str + "vnd.android.cursor.item/name" + "'";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = c;
    e = str + "vnd.android.cursor.item/phone_v2" + "'";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = c;
    f = str + "vnd.android.cursor.item/email_v2" + "'";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = c;
    g = str + "vnd.android.cursor.item/note" + "'";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = c;
    h = str + "vnd.android.cursor.item/photo" + "'";
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = c;
    i = str + "vnd.android.cursor.item/photo" + "'";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */