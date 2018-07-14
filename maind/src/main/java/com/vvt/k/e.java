package com.vvt.k;

public class e
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    String str1 = null;
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString1);
      localObject = ((StringBuilder)localObject).append(paramString2);
      localObject = ((StringBuilder)localObject).append(paramString3);
      localObject = ((StringBuilder)localObject).append(paramString4);
      localObject = ((StringBuilder)localObject).toString();
      String str2 = "UTF-8";
      localObject = ((String)localObject).getBytes(str2);
      long l = a.a((byte[])localObject);
      int i = (int)l;
      localObject = Integer.toHexString(i);
      str1 = ((String)localObject).toUpperCase();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/k/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */