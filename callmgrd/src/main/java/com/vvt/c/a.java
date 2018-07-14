package com.vvt.c;

import java.util.Locale;

public class a
{
  private static boolean a = com.vvt.h.a.a;
  private static boolean b = com.vvt.h.a.b;
  private static boolean c = com.vvt.h.a.e;
  
  public static void a()
  {
    bool = a;
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject1 = Locale.getDefault();
        localObject1 = ((Locale)localObject1).getLanguage();
        localObject3 = Locale.ENGLISH;
        localObject3 = ((Locale)localObject3).getLanguage();
        bool = ((String)localObject1).equalsIgnoreCase((String)localObject3);
        if (!bool) {
          continue;
        }
        bool = b;
        if (!bool) {}
      }
      finally
      {
        Object localObject1;
        Object localObject3;
        bool = c;
        if (!bool) {
          continue;
        }
        continue;
      }
      bool = a;
      if (bool) {}
      return;
      localObject1 = new java/util/Locale;
      localObject3 = "en";
      ((Locale)localObject1).<init>((String)localObject3);
      Locale.setDefault((Locale)localObject1);
      bool = b;
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/c/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */