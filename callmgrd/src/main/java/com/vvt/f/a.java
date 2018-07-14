package com.vvt.f;

public class a
{
  public static String a(int... paramVarArgs)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      j = (char)paramVarArgs[i];
      String str = Character.toString(j);
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static boolean a(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i > 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean b(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/Mitm/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */