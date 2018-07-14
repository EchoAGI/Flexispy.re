package com.vvt.capture.calendar.e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public class c
  implements b
{
  private ContentResolver a;
  
  public c(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
  }
  
  public Cursor a()
  {
    ContentResolver localContentResolver = this.a;
    Uri localUri = com.vvt.capture.calendar.b.c.c();
    return localContentResolver.query(localUri, null, null, null, null);
  }
  
  public Cursor a(int paramInt)
  {
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = "0";
    Object localObject = Integer.toString(paramInt);
    arrayOfString1[1] = localObject;
    ContentResolver localContentResolver = this.a;
    localObject = com.vvt.capture.calendar.b.c.e();
    String[] arrayOfString2 = new String[0];
    return localContentResolver.query((Uri)localObject, arrayOfString2, "(deleted = ?) AND (calendar_id = ?)", arrayOfString1, null);
  }
  
  public Cursor a(int paramInt, String paramString)
  {
    String[] arrayOfString = new String[2];
    Object localObject = String.valueOf(paramInt);
    arrayOfString[0] = localObject;
    arrayOfString[1] = paramString;
    ContentResolver localContentResolver = this.a;
    localObject = com.vvt.capture.calendar.b.c.d();
    return localContentResolver.query((Uri)localObject, null, "(event_id=?) AND (attendeeEmail=?)", arrayOfString, null);
  }
  
  public Cursor a(String paramString)
  {
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = paramString;
    ContentResolver localContentResolver = this.a;
    Uri localUri = com.vvt.capture.calendar.b.c.e();
    String[] arrayOfString2 = new String[0];
    return localContentResolver.query(localUri, arrayOfString2, "_sync_id = ?", arrayOfString1, null);
  }
  
  public Cursor a(String paramString, String[] paramArrayOfString)
  {
    ContentResolver localContentResolver = this.a;
    Uri localUri = com.vvt.capture.calendar.b.c.e();
    String[] arrayOfString = new String[0];
    return localContentResolver.query(localUri, arrayOfString, paramString, paramArrayOfString, null);
  }
  
  public Cursor b(int paramInt)
  {
    int i = 1;
    String[] arrayOfString = new String[2];
    Object localObject1 = String.valueOf(paramInt);
    arrayOfString[0] = localObject1;
    Object localObject2 = String.valueOf(i);
    arrayOfString[i] = localObject2;
    localObject2 = this.a;
    localObject1 = com.vvt.capture.calendar.b.c.d();
    return ((ContentResolver)localObject2).query((Uri)localObject1, null, "(event_id=?) AND (attendeeRelationship=?)", arrayOfString, null);
  }
  
  public boolean b()
  {
    return true;
  }
  
  public boolean c()
  {
    return true;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/e/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */