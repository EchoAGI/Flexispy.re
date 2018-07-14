package com.vvt.ag;

public class c
{
  private static String a(String paramString)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = "-";
    boolean bool = paramString.startsWith((String)localObject1);
    if (bool)
    {
      localObject1 = "-";
      int k = paramString.indexOf((String)localObject1) + 1;
      paramString = paramString.substring(k);
    }
    localObject1 = paramString.split("\\.");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int m = localObject1.length;
    Object localObject2;
    if (m == j)
    {
      localObject1 = localObject1[0];
      localObject1 = localStringBuilder.append((String)localObject1).append(".").append("0").append(".");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      m = localObject1.length;
      String str;
      if (m == i)
      {
        localObject2 = localObject1[0];
        localObject2 = localStringBuilder.append((String)localObject2);
        str = ".";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = localObject1[j];
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(".");
        localObject2 = "0";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        m = localObject1.length;
        int n = 3;
        if (m == n)
        {
          localObject2 = localObject1[0];
          localObject2 = localStringBuilder.append((String)localObject2).append(".");
          str = localObject1[j];
          localObject2 = ((StringBuilder)localObject2).append(str);
          str = ".";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject1 = localObject1[i];
          ((StringBuilder)localObject2).append((String)localObject1);
        }
      }
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    boolean bool2 = b.a(paramString1);
    if (!bool2)
    {
      bool2 = b.a(paramString1);
      if (!bool2) {
        break label22;
      }
    }
    for (;;)
    {
      return bool1;
      label22:
      String str1 = a(paramString1);
      String str2 = a(paramString2);
      long l1 = b(str2);
      long l2 = b(str1);
      bool2 = l1 < l2;
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  private static long b(String paramString)
  {
    Object localObject = paramString.trim();
    String str1 = ".";
    boolean bool = ((String)localObject).contains(str1);
    long l1;
    if (bool)
    {
      str1 = ".";
      int i = ((String)localObject).lastIndexOf(str1);
      String str2 = ((String)localObject).substring(0, i);
      l1 = b(str2);
      long l2 = 100;
      l1 *= l2;
      i += 1;
      localObject = ((String)localObject).substring(i);
    }
    for (long l3 = b((String)localObject) + l1;; l3 = ((Long)localObject).longValue())
    {
      return l3;
      localObject = Long.valueOf((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ag/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */