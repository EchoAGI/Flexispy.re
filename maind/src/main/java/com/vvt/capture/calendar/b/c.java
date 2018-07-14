package com.vvt.capture.calendar.b;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import com.vvt.ag.b;
import java.util.ArrayList;
import java.util.List;

public class c
{
  public static final Uri a = Uri.parse("content://calendar/events");
  public static final Uri b = Uri.parse("content://com.android.calendar/events");
  public static final Uri c = Uri.parse("content://calendar/calendars");
  public static final Uri d = Uri.parse("content://com.android.calendar/calendars");
  public static final Uri e = Uri.parse("content://calendar/attendees");
  public static final Uri f = Uri.parse("content://com.android.calendar/attendees");
  private int g;
  private String h;
  private int i;
  private List j;
  
  public c()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.j = localArrayList;
  }
  
  public static c a(Cursor paramCursor)
  {
    c localc = new com/vvt/capture/calendar/b/c;
    localc.<init>();
    int k = paramCursor.getColumnIndex("_id");
    k = paramCursor.getInt(k);
    localc.g = k;
    k = paramCursor.getColumnIndex("name");
    String str = b.b(paramCursor.getString(k));
    localc.h = str;
    return localc;
  }
  
  public static Uri c()
  {
    int k = Build.VERSION.SDK_INT;
    int m = 7;
    if (k <= m) {}
    for (Uri localUri = c;; localUri = d) {
      return localUri;
    }
  }
  
  public static Uri d()
  {
    int k = Build.VERSION.SDK_INT;
    int m = 7;
    if (k <= m) {}
    for (Uri localUri = e;; localUri = f) {
      return localUri;
    }
  }
  
  public static Uri e()
  {
    int k = Build.VERSION.SDK_INT;
    int m = 7;
    if (k <= m) {}
    for (Uri localUri = a;; localUri = b) {
      return localUri;
    }
  }
  
  public String a()
  {
    return this.h;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void a(List paramList)
  {
    this.j = paramList;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public List f()
  {
    return this.j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Calendar {");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(" CalendarId: ");
    int k = this.g;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", Events Count: ");
    k = this.i;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", Name:");
    String str = this.h;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */