package com.vvt.im.events.store;

import com.vvt.im.a.c;
import com.vvt.im.events.ImType;
import com.vvt.io.q;
import java.io.Serializable;

public class a
{
  public static Object a(String paramString, ImType paramImType)
  {
    Object localObject = null;
    try
    {
      String str = b(paramString, paramImType);
      localObject = q.a(str);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localObject;
  }
  
  public static boolean a(Serializable paramSerializable, String paramString, ImType paramImType)
  {
    String str = b(paramString, paramImType);
    return q.a(paramSerializable, str);
  }
  
  private static String b(String paramString, ImType paramImType)
  {
    String str1 = c.a(paramString, paramImType);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str1;
    String str2 = paramImType.toString();
    arrayOfObject[1] = str2;
    return String.format("%s/store_%s.im", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/store/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */