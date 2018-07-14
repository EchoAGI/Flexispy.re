package org.eclipse.paho.client.mqttv3.d;

public final class b
{
  private static int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    String str1 = paramCharSequence1.toString();
    String str2 = paramCharSequence2.toString();
    return str1.indexOf(str2, paramInt);
  }
  
  public static boolean a(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      i = paramCharSequence.length();
      if (i != 0) {
        break label19;
      }
    }
    label19:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    boolean bool;
    char[] arrayOfChar;
    if (paramCharSequence2 == null)
    {
      bool = false;
      arrayOfChar = null;
    }
    for (;;)
    {
      return bool;
      arrayOfChar = b(paramCharSequence2);
      bool = a(paramCharSequence1, arrayOfChar);
    }
  }
  
  public static boolean a(CharSequence paramCharSequence, char[] paramArrayOfChar)
  {
    boolean bool1 = true;
    int i = a(paramCharSequence);
    if (i == 0)
    {
      i = a(paramArrayOfChar);
      if (i == 0) {}
    }
    else
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      int k = paramCharSequence.length();
      int m = paramArrayOfChar.length;
      int n = k + -1;
      int i1 = m + -1;
      int j;
      for (int i2 = 0;; i2 = j)
      {
        if (i2 >= k) {
          break label165;
        }
        char c1 = paramCharSequence.charAt(i2);
        i = 0;
        for (;;)
        {
          if (i >= m) {
            break label154;
          }
          char c2 = paramArrayOfChar[i];
          if (c2 == c1)
          {
            boolean bool2 = Character.isHighSurrogate(c1);
            if ((!bool2) || (i == i1)) {
              break;
            }
            if (i2 < n)
            {
              int i3 = i + 1;
              i3 = paramArrayOfChar[i3];
              int i4 = i2 + 1;
              i4 = paramCharSequence.charAt(i4);
              if (i3 == i4) {
                break;
              }
            }
          }
          i += 1;
        }
        label154:
        j = i2 + 1;
      }
      label165:
      bool1 = false;
    }
  }
  
  public static boolean a(CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j;
    if (paramCharSequence == null) {
      if (paramArrayOfCharSequence == null) {
        j = i;
      }
    }
    for (;;)
    {
      label27:
      boolean bool;
      if (paramArrayOfCharSequence != null)
      {
        int k = j;
        j = 0;
        int m = paramArrayOfCharSequence.length;
        if (j < m)
        {
          CharSequence localCharSequence;
          if (k == 0)
          {
            localCharSequence = paramArrayOfCharSequence[j];
            bool = localCharSequence.equals(paramCharSequence);
            if (!bool) {}
          }
          else
          {
            bool = i;
          }
          for (;;)
          {
            j += 1;
            break label27;
            j = 0;
            break;
            bool = false;
            localCharSequence = null;
          }
        }
      }
      else
      {
        bool = j;
      }
      return bool;
      j = 0;
    }
  }
  
  private static boolean a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      if (i != 0) {
        break label15;
      }
    }
    label15:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static int b(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    int i = 0;
    int j = a(paramCharSequence1);
    if (j == 0)
    {
      j = a(paramCharSequence2);
      if (j == 0) {}
    }
    else
    {
      j = 0;
      return j;
    }
    int k = 0;
    for (;;)
    {
      i = a(paramCharSequence1, paramCharSequence2, i);
      int m = -1;
      if (i == m) {
        break;
      }
      k += 1;
      m = paramCharSequence2.length();
      i += m;
    }
  }
  
  private static char[] b(CharSequence paramCharSequence)
  {
    boolean bool = paramCharSequence instanceof String;
    char[] arrayOfChar;
    if (bool)
    {
      paramCharSequence = (String)paramCharSequence;
      arrayOfChar = paramCharSequence.toCharArray();
    }
    for (;;)
    {
      return arrayOfChar;
      int j = paramCharSequence.length();
      int i = paramCharSequence.length();
      arrayOfChar = new char[i];
      int k = 0;
      while (k < j)
      {
        int m = paramCharSequence.charAt(k);
        arrayOfChar[k] = m;
        k += 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/d/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */