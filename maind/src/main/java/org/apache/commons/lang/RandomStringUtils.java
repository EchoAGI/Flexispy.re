package org.apache.commons.lang;

import java.util.Random;

public class RandomStringUtils
{
  private static final Random RANDOM;
  
  static
  {
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    RANDOM = localRandom;
  }
  
  public static String random(int paramInt)
  {
    return random(paramInt, false, false);
  }
  
  public static String random(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    Random localRandom = RANDOM;
    return random(paramInt1, paramInt2, paramInt3, paramBoolean1, paramBoolean2, null, localRandom);
  }
  
  public static String random(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, char[] paramArrayOfChar)
  {
    Random localRandom = RANDOM;
    return random(paramInt1, paramInt2, paramInt3, paramBoolean1, paramBoolean2, paramArrayOfChar, localRandom);
  }
  
  public static String random(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, char[] paramArrayOfChar, Random paramRandom)
  {
    int i = 56320;
    int j = 55296;
    int k = 128;
    Object localObject1;
    if (paramInt1 == 0) {
      localObject1 = "";
    }
    for (;;)
    {
      return (String)localObject1;
      if (paramInt1 < 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Requested random string length " + paramInt1 + " is less than 0.";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramInt3 = 123;
        paramInt2 = 32;
        if ((!paramBoolean1) && (!paramBoolean2))
        {
          paramInt2 = 0;
          paramInt3 = -1 >>> 1;
        }
      }
      char[] arrayOfChar = new char[paramInt1];
      int m = paramInt3 - paramInt2;
      int n = paramInt1;
      paramInt1 = n + -1;
      if (n != 0)
      {
        label147:
        int i2;
        if (paramArrayOfChar == null)
        {
          int i1 = paramRandom.nextInt(m) + paramInt2;
          int i3 = (char)i1;
          boolean bool;
          if (paramBoolean1)
          {
            bool = Character.isLetter(i3);
            if (bool) {}
          }
          else if (paramBoolean2)
          {
            bool = Character.isDigit(i3);
            if (bool) {}
          }
          else
          {
            if ((paramBoolean1) || (paramBoolean2)) {
              break label373;
            }
          }
          if (i3 < i) {
            break label274;
          }
          i2 = 57343;
          if (i3 > i2) {
            break label274;
          }
          if (paramInt1 != 0) {
            break label242;
          }
          paramInt1 += 1;
        }
        for (;;)
        {
          n = paramInt1;
          break;
          i2 = paramRandom.nextInt(m) + paramInt2;
          int i4 = paramArrayOfChar[i2];
          break label147;
          label242:
          arrayOfChar[paramInt1] = i4;
          paramInt1 += -1;
          i2 = (char)(paramRandom.nextInt(k) + j);
          arrayOfChar[paramInt1] = i2;
          continue;
          label274:
          if (i4 >= j)
          {
            i2 = 56191;
            if (i4 <= i2)
            {
              if (paramInt1 == 0)
              {
                paramInt1 += 1;
                continue;
              }
              i2 = (char)(paramRandom.nextInt(k) + i);
              arrayOfChar[paramInt1] = i2;
              paramInt1 += -1;
              arrayOfChar[paramInt1] = i4;
              continue;
            }
          }
          i2 = 56192;
          if (i4 >= i2)
          {
            i2 = 56319;
            if (i4 <= i2)
            {
              paramInt1 += 1;
              continue;
            }
          }
          arrayOfChar[paramInt1] = i4;
          continue;
          label373:
          paramInt1 += 1;
        }
      }
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(arrayOfChar);
    }
  }
  
  public static String random(int paramInt, String paramString)
  {
    Random localRandom;
    if (paramString == null) {
      localRandom = RANDOM;
    }
    for (Object localObject = random(paramInt, 0, 0, false, false, null, localRandom);; localObject = random(paramInt, (char[])localObject))
    {
      return (String)localObject;
      localObject = paramString.toCharArray();
    }
  }
  
  public static String random(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return random(paramInt, 0, 0, paramBoolean1, paramBoolean2);
  }
  
  public static String random(int paramInt, char[] paramArrayOfChar)
  {
    Random localRandom;
    int i;
    if (paramArrayOfChar == null)
    {
      localRandom = RANDOM;
      i = 0;
    }
    for (String str = random(paramInt, 0, 0, false, false, null, localRandom);; str = random(paramInt, 0, i, false, false, paramArrayOfChar, localRandom))
    {
      return str;
      i = paramArrayOfChar.length;
      localRandom = RANDOM;
    }
  }
  
  public static String randomAlphabetic(int paramInt)
  {
    return random(paramInt, true, false);
  }
  
  public static String randomAlphanumeric(int paramInt)
  {
    boolean bool = true;
    return random(paramInt, bool, bool);
  }
  
  public static String randomAscii(int paramInt)
  {
    return random(paramInt, 32, 127, false, false);
  }
  
  public static String randomNumeric(int paramInt)
  {
    return random(paramInt, false, true);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/RandomStringUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */