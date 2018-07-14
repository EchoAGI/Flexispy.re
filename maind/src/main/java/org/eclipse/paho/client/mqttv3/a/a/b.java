package org.eclipse.paho.client.mqttv3.a.a;

public class b
{
  private static final char[] a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
  
  private static final long a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = 0L;
    int i = 0;
    int j = 0;
    long l2 = l1;
    int k;
    int m;
    if (paramInt2 > 0)
    {
      paramInt2 += -1;
      k = paramInt1 + 1;
      m = paramArrayOfByte[paramInt1];
      i = 47;
      if (m != i) {
        break label187;
      }
    }
    label187:
    for (long l3 = 1L;; l3 = l1)
    {
      int n = 48;
      if (m >= n)
      {
        n = 57;
        if (m <= n)
        {
          i = m + 2 + -48;
          l3 = i;
        }
      }
      n = 65;
      if (m >= n)
      {
        n = 90;
        if (m <= n)
        {
          i = m + 12 + -65;
          l3 = i;
        }
      }
      n = 97;
      if (m >= n)
      {
        n = 122;
        if (m <= n)
        {
          i = m + 38 + -97;
          l3 = i;
        }
      }
      l3 <<= j;
      l2 += l3;
      i = j + 6;
      j = i;
      paramInt1 = k;
      break;
      return l2;
    }
  }
  
  private static final String a(long paramLong, int paramInt)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>(paramInt);
    while (paramInt > 0)
    {
      paramInt += -1;
      char[] arrayOfChar = a;
      long l = 63 & paramLong;
      int i = (int)l;
      char c = arrayOfChar[i];
      localStringBuffer.append(c);
      c = '\006';
      paramLong >>= c;
    }
    return localStringBuffer.toString();
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int i = 3;
    int j = 2;
    int k = paramArrayOfByte.length;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int m = (k + 2) / 3 * 4;
    localStringBuffer.<init>(m);
    m = 0;
    int i1;
    long l1;
    String str1;
    while (k >= i)
    {
      n = (paramArrayOfByte[m] & 0xFF) << 16;
      i1 = m + 1;
      i1 = (paramArrayOfByte[i1] & 0xFF) << 8;
      n |= i1;
      i1 = m + 2;
      i1 = paramArrayOfByte[i1] & 0xFF;
      n |= i1;
      l1 = n;
      int i2 = 4;
      str1 = a(l1, i2);
      localStringBuffer.append(str1);
      m += 3;
      k += -3;
    }
    if (k == j)
    {
      n = (paramArrayOfByte[m] & 0xFF) << 8;
      i1 = m + 1;
      i1 = paramArrayOfByte[i1] & 0xFF;
      n |= i1;
      l1 = n;
      str1 = a(l1, i);
      localStringBuffer.append(str1);
    }
    int n = 1;
    if (k == n)
    {
      k = paramArrayOfByte[m] & 0xFF;
      long l2 = k;
      String str2 = a(l2, j);
      localStringBuffer.append(str2);
    }
    return localStringBuffer.toString();
  }
  
  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    int i = arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[i * 3 / 4];
    int j = 0;
    int k = 0;
    int m = i;
    int n = 0;
    long l1;
    int i1;
    long l2;
    int i2;
    for (;;)
    {
      j = 4;
      if (m < j) {
        break;
      }
      l1 = a(arrayOfByte1, n, 4);
      m += -4;
      n += 4;
      j = 2;
      while (j >= 0)
      {
        i1 = k + j;
        l2 = 0xFF & l1;
        i2 = (byte)(int)l2;
        arrayOfByte2[i1] = i2;
        i1 = 8;
        l1 >>= i1;
        j += -1;
      }
      j = k + 3;
      k = j;
    }
    j = 3;
    if (m == j)
    {
      l1 = a(arrayOfByte1, n, 3);
      j = 1;
      while (j >= 0)
      {
        i1 = k + j;
        l2 = 0xFF & l1;
        i2 = (byte)(int)l2;
        arrayOfByte2[i1] = i2;
        i1 = 8;
        l1 >>= i1;
        j += -1;
      }
    }
    j = 2;
    if (m == j)
    {
      long l3 = a(arrayOfByte1, n, 2);
      long l4 = 255L;
      l3 &= l4;
      j = (byte)(int)l3;
      arrayOfByte2[k] = j;
    }
    return arrayOfByte2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */