package com.vvt.ag;

public class a
{
  private static char[] a;
  private static byte[] b;
  
  static
  {
    int i = 64;
    int j = 0;
    Object localObject1 = new char[i];
    a = (char[])localObject1;
    int k = 65;
    int m = 0;
    Object localObject2 = null;
    char[] arrayOfChar;
    for (;;)
    {
      n = 90;
      if (k > n) {
        break;
      }
      arrayOfChar = a;
      n = m + 1;
      arrayOfChar[m] = k;
      k = (char)(k + 1);
      m = n;
    }
    k = 97;
    for (;;)
    {
      n = 122;
      if (k > n) {
        break;
      }
      arrayOfChar = a;
      n = m + 1;
      arrayOfChar[m] = k;
      k = (char)(k + 1);
      m = n;
    }
    k = 48;
    for (;;)
    {
      n = 57;
      if (k > n) {
        break;
      }
      arrayOfChar = a;
      n = m + 1;
      arrayOfChar[m] = k;
      k = (char)(k + 1);
      m = n;
    }
    localObject1 = a;
    int n = m + 1;
    int i1 = 43;
    localObject1[m] = i1;
    localObject1 = a;
    m = n + 1;
    m = 47;
    localObject1[n] = m;
    b = new byte[''];
    k = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = b;
      m = localObject2.length;
      if (k >= m) {
        break;
      }
      localObject2 = b;
      n = -1;
      localObject2[k] = n;
      k += 1;
    }
    while (j < i)
    {
      localObject1 = b;
      localObject2 = a;
      m = localObject2[j];
      n = (byte)j;
      localObject1[m] = n;
      j += 1;
    }
  }
  
  public static void a(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    int k = 0;
    int m = 0;
    int n = 0;
    char[] arrayOfChar = null;
    int i2 = 0;
    int i1;
    while (k < j)
    {
      i3 = paramArrayOfByte[k];
      m <<= 8;
      i3 = i3 & 0xFF | m;
      m = n + 8;
      n = 24;
      if (m == n)
      {
        m = 0;
        int i4 = i3;
        i3 = i2;
        i2 = i4;
        for (;;)
        {
          n = 4;
          if (m >= n) {
            break;
          }
          arrayOfChar = a;
          int i5 = i2 >>> 18 & 0x3F;
          n = arrayOfChar[i5];
          paramAppendable.append(n);
          i2 <<= 6;
          i1 = i3 + 1;
          i3 = i1 % paramInt;
          if (i3 == 0) {
            paramAppendable.append(paramString);
          }
          m += 1;
          i3 = i1;
        }
        m = 0;
        i2 = i3;
        i3 = 0;
      }
      k += 1;
      i1 = m;
      m = i3;
    }
    int i3 = i1 / 8;
    i3 = (3 - i3) % 3;
    i = m;
    m = i1;
    while (m > 0)
    {
      arrayOfChar = a;
      k = i >>> 18 & 0x3F;
      i1 = arrayOfChar[k];
      paramAppendable.append(i1);
      i <<= 6;
      m += -6;
      i2 += 1;
      i1 = i2 % paramInt;
      if (i1 == 0) {
        paramAppendable.append(paramString);
      }
    }
    for (;;)
    {
      i = i3 + -1;
      if (i3 <= 0) {
        break;
      }
      paramAppendable.append('=');
      i3 = i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ag/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */