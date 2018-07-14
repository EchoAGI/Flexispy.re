package com.vvt.d;

public class a
{
  private static b a = ;
  
  public static void a(String paramString1, String paramString2)
  {
    Class localClass = a.class;
    String str = "(tid:%d|%s) %s";
    int i = 3;
    try
    {
      Object localObject2 = new Object[i];
      int j = 0;
      Object localObject3 = Thread.currentThread();
      long l = ((Thread)localObject3).getId();
      localObject3 = Long.valueOf(l);
      localObject2[0] = localObject3;
      j = 1;
      localObject3 = Thread.currentThread();
      localObject3 = ((Thread)localObject3).getName();
      localObject2[j] = localObject3;
      j = 2;
      localObject2[j] = paramString2;
      str = String.format(str, (Object[])localObject2);
      localObject2 = a;
      ((b)localObject2).b(paramString1, str);
      return;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/d/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */