package com.android.internal.telephony.uicc;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.android.internal.telephony.GsmAlphabet;
import com.vvt.callmanager.ref.g;
import java.io.UnsupportedEncodingException;

public class IccUtils
{
  private static final boolean LOGE = g.e;
  static final String LOG_TAG = "IccUtils";
  
  public static String adnStringFieldToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 1;
    String str1;
    if (paramInt2 == 0) {
      str1 = "";
    }
    int n;
    int i1;
    String str3;
    String str4;
    String str2;
    for (;;)
    {
      return str1;
      if (paramInt2 < i) {
        break;
      }
      int j = paramArrayOfByte[paramInt1];
      n = -128;
      if (j != n) {
        break;
      }
      j = paramInt2 + -1;
      i1 = j / 2;
      n = 0;
      str3 = null;
      try
      {
        str1 = new java/lang/String;
        int i2 = paramInt1 + 1;
        i1 *= 2;
        str4 = "utf-16be";
        str1.<init>(paramArrayOfByte, i2, i1, str4);
        str3 = str1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        int k;
        for (;;)
        {
          k = LOGE;
          if (k == 0) {}
        }
        str2 = str3.substring(0, k);
      }
      if (str3 == null) {
        break;
      }
      j = str3.length();
      while (j > 0)
      {
        i = j + -1;
        i = str3.charAt(i);
        i1 = (char)-1;
        if (i != i1) {
          break;
        }
        j += -1;
      }
    }
    int m = 3;
    if (paramInt2 >= m)
    {
      m = paramArrayOfByte[paramInt1];
      n = -127;
      if (m == n)
      {
        m = paramInt1 + 1;
        m = paramArrayOfByte[m] & 0xFF;
        n = paramInt2 + -3;
        if (m > n) {
          m = paramInt2 + -3;
        }
        n = paramInt1 + 2;
        n = (char)((paramArrayOfByte[n] & 0xFF) << 7);
        paramInt1 += 3;
        i1 = n;
        n = paramInt1;
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        for (;;)
        {
          if (m <= 0) {
            break label489;
          }
          i = paramArrayOfByte[n];
          if (i < 0)
          {
            i = (char)((paramArrayOfByte[n] & 0x7F) + i1);
            localStringBuilder.append(i);
            n += 1;
            m += -1;
          }
          i = 0;
          for (;;)
          {
            if (i < m)
            {
              int i3 = n + i;
              i3 = paramArrayOfByte[i3];
              if (i3 >= 0)
              {
                i += 1;
                continue;
                m = 4;
                if (paramInt2 < m) {
                  break label520;
                }
                m = paramArrayOfByte[paramInt1];
                n = -126;
                if (m != n) {
                  break label520;
                }
                m = paramInt1 + 1;
                m = paramArrayOfByte[m] & 0xFF;
                n = paramInt2 + -4;
                if (m > n) {
                  m = paramInt2 + -4;
                }
                n = paramInt1 + 2;
                n = (paramArrayOfByte[n] & 0xFF) << 8;
                i1 = paramInt1 + 3;
                i1 = paramArrayOfByte[i1] & 0xFF;
                n = (char)(n | i1);
                paramInt1 += 4;
                i1 = n;
                n = paramInt1;
                break;
              }
            }
          }
          str4 = GsmAlphabet.gsm8BitUnpackedToString(paramArrayOfByte, n, i);
          localStringBuilder.append(str4);
          n += i;
          m -= i;
        }
        label489:
        str2 = localStringBuilder.toString();
        break;
      }
      str2 = "".trim();
      str2 = GsmAlphabet.gsm8BitUnpackedToString(paramArrayOfByte, n, paramInt2, str2);
      break;
      label520:
      m = 0;
      str2 = null;
      i1 = 0;
      i = 0;
      n = paramInt1;
    }
  }
  
  public static String bcdToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 9;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int j = paramInt2 * 2;
    localStringBuilder.<init>(j);
    j = paramInt1;
    int k = paramInt1 + paramInt2;
    if (j < k)
    {
      k = paramArrayOfByte[j] & 0xF;
      if (k <= i) {}
    }
    else
    {
      label50:
      return localStringBuilder.toString();
    }
    k = (char)(k + 48);
    localStringBuilder.append(k);
    int m = paramArrayOfByte[j] >> 4 & 0xF;
    int n = 15;
    if (m == n) {}
    for (;;)
    {
      j += 1;
      break;
      if (m > i) {
        break label50;
      }
      m = (char)(m + 48);
      localStringBuilder.append(m);
    }
  }
  
  private static int bitToRGB(int paramInt)
  {
    int i = 1;
    if (paramInt == i) {}
    for (i = -1;; i = -16777216) {
      return i;
    }
  }
  
  public static String bytesToHexString(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null) {
      i = 0;
    }
    StringBuilder localStringBuilder;
    for (String str1 = null;; str1 = localStringBuilder.toString())
    {
      return str1;
      localStringBuilder = new java/lang/StringBuilder;
      i = paramArrayOfByte.length * 2;
      localStringBuilder.<init>(i);
      i = 0;
      str1 = null;
      for (;;)
      {
        int j = paramArrayOfByte.length;
        if (i >= j) {
          break;
        }
        j = paramArrayOfByte[i] >> 4 & 0xF;
        j = "0123456789abcdef".charAt(j);
        localStringBuilder.append(j);
        int k = paramArrayOfByte[i] & 0xF;
        String str2 = "0123456789abcdef";
        k = str2.charAt(k);
        localStringBuilder.append(k);
        i += 1;
      }
    }
  }
  
  public static int cdmaBcdByteToInt(byte paramByte)
  {
    int i = 0;
    int j = paramByte & 0xF0;
    int k = 144;
    if (j <= k) {
      i = (paramByte >> 4 & 0xF) * 10;
    }
    j = paramByte & 0xF;
    k = 9;
    if (j <= k)
    {
      j = paramByte & 0xF;
      i += j;
    }
    return i;
  }
  
  public static String cdmaBcdToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 9;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramInt2);
    int n;
    for (int j = 0;; j = n)
    {
      if (j < paramInt2)
      {
        int k = paramArrayOfByte[paramInt1] & 0xF;
        if (k > i) {
          k = 0;
        }
        k = (char)(k + 48);
        localStringBuilder.append(k);
        j += 1;
        if (j != paramInt2) {}
      }
      else
      {
        return localStringBuilder.toString();
      }
      int m = paramArrayOfByte[paramInt1] >> 4 & 0xF;
      if (m > i) {
        m = 0;
      }
      m = (char)(m + 48);
      localStringBuilder.append(m);
      n = j + 1;
      paramInt1 += 1;
    }
  }
  
  private static int[] getCLUT(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null)
    {
      i = 0;
      localObject = null;
      return (int[])localObject;
    }
    int[] arrayOfInt = new int[paramInt2];
    int i = paramInt2 * 3;
    int j = paramInt1 + i;
    i = 0;
    Object localObject = null;
    int k = -16777216;
    for (;;)
    {
      int m = i + 1;
      int n = paramInt1 + 1;
      int i1 = (paramArrayOfByte[paramInt1] & 0xFF) << 16 | k;
      int i2 = n + 1;
      n = (paramArrayOfByte[n] & 0xFF) << 8 | i1;
      paramInt1 = i2 + 1;
      i1 = paramArrayOfByte[i2] & 0xFF;
      n |= i1;
      arrayOfInt[i] = n;
      if (paramInt1 >= j)
      {
        localObject = arrayOfInt;
        break;
      }
      i = m;
    }
  }
  
  public static int gsmBcdByteToInt(byte paramByte)
  {
    int i = 0;
    int j = paramByte & 0xF0;
    int k = 144;
    if (j <= k) {
      i = paramByte >> 4 & 0xF;
    }
    j = paramByte & 0xF;
    k = 9;
    if (j <= k)
    {
      j = (paramByte & 0xF) * 10;
      i += j;
    }
    return i;
  }
  
  static int hexCharToInt(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        c = paramChar + '￐';
      }
    }
    for (;;)
    {
      return c;
      c = 'A';
      if (paramChar >= c)
      {
        c = 'F';
        if (paramChar <= c)
        {
          c = paramChar + '﾿' + 10;
          continue;
        }
      }
      c = 'a';
      if (paramChar < c) {
        break;
      }
      c = 'f';
      if (paramChar > c) {
        break;
      }
      c = paramChar + 'ﾟ' + 10;
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "invalid hex char '" + paramChar + "'";
    localRuntimeException.<init>((String)localObject);
    throw localRuntimeException;
  }
  
  public static byte[] hexStringToBytes(String paramString)
  {
    int i;
    byte[] arrayOfByte;
    if (paramString == null)
    {
      i = 0;
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      int j = paramString.length();
      i = j / 2;
      arrayOfByte = new byte[i];
      int k = 0;
      while (k < j)
      {
        int m = k / 2;
        int n = hexCharToInt(paramString.charAt(k)) << 4;
        int i1 = k + 1;
        i1 = hexCharToInt(paramString.charAt(i1));
        n = (byte)(n | i1);
        arrayOfByte[m] = n;
        k += 2;
      }
    }
  }
  
  private static int[] mapTo2OrderBitColor(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i = 8;
    int j = 1;
    int m = i % paramInt3;
    if (m != 0)
    {
      j = LOGE;
      if (j == 0) {}
    }
    int[] arrayOfInt;
    label214:
    for (Object localObject = mapToNon2OrderBitColor(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfInt, paramInt3);; localObject = arrayOfInt)
    {
      return (int[])localObject;
      int n;
      switch (paramInt3)
      {
      default: 
        arrayOfInt = new int[paramInt2];
        n = i / paramInt3;
        i = 0;
      }
      for (;;)
      {
        if (i >= paramInt2) {
          break label214;
        }
        int i1 = paramInt1 + 1;
        int i2 = paramArrayOfByte[paramInt1];
        int i3 = i;
        i = 0;
        for (;;)
        {
          if (i < n)
          {
            int i4 = n - i + -1;
            int i5 = i3 + 1;
            i4 *= paramInt3;
            i4 = i2 >> i4 & j;
            i4 = paramArrayOfInt[i4];
            arrayOfInt[i3] = i4;
            i += 1;
            i3 = i5;
            continue;
            int k = 3;
            break;
            k = 15;
            break;
            k = 255;
            break;
          }
        }
        i = i3;
        paramInt1 = i1;
      }
    }
  }
  
  private static int[] mapToNon2OrderBitColor(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i = 8 % paramInt3;
    if (i == 0)
    {
      boolean bool = LOGE;
      if (!bool) {}
    }
    for (int[] arrayOfInt = mapTo2OrderBitColor(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfInt, paramInt3);; arrayOfInt = new int[paramInt2]) {
      return arrayOfInt;
    }
  }
  
  public static String networkNameToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[paramInt1] & 0x80;
    int j = 128;
    String str1;
    if (i == j)
    {
      i = 1;
      if (paramInt2 >= i) {}
    }
    else
    {
      str1 = "";
      return str1;
    }
    i = paramArrayOfByte[paramInt1] >>> 4 & 0x7;
    switch (i)
    {
    default: 
      str1 = "";
    }
    for (;;)
    {
      j = paramArrayOfByte[paramInt1] & 0x40;
      if (j == 0) {
        break;
      }
      break;
      i = paramArrayOfByte[paramInt1] & 0x7;
      i = ((paramInt2 + -1) * 8 - i) / 7;
      j = paramInt1 + 1;
      str1 = GsmAlphabet.gsm7BitPackedToString(paramArrayOfByte, j, i);
      continue;
      boolean bool;
      try
      {
        str1 = new java/lang/String;
        j = paramInt1 + 1;
        int k = paramInt2 + -1;
        String str3 = "utf-16";
        str1.<init>(paramArrayOfByte, j, k, str3);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        String str2 = "";
        bool = LOGE;
      }
      if (!bool) {}
    }
  }
  
  public static Bitmap parseToBnW(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 7;
    int j = 0;
    Bitmap.Config localConfig = null;
    int k = paramArrayOfByte[0] & 0xFF;
    int m = 2;
    int n = paramArrayOfByte[1] & 0xFF;
    int i1 = k * n;
    int[] arrayOfInt = new int[i1];
    int i2 = i;
    int i5;
    for (int i3 = 0; i3 < i1; i3 = i5)
    {
      int i4 = i3 % 8;
      if (i4 == 0)
      {
        i2 = m + 1;
        j = paramArrayOfByte[m];
        m = i2;
        i2 = i;
      }
      i5 = i3 + 1;
      i4 = i2 + -1;
      i2 = bitToRGB(j >> i2 & 0x1);
      arrayOfInt[i3] = i2;
      i2 = i4;
    }
    if (i3 != i1)
    {
      boolean bool = LOGE;
      if (!bool) {}
    }
    localConfig = Bitmap.Config.ARGB_8888;
    return Bitmap.createBitmap(arrayOfInt, k, n, localConfig);
  }
  
  public static Bitmap parseToRGB(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    int i = paramArrayOfByte[0] & 0xFF;
    int j = paramArrayOfByte[bool] & 0xFF;
    int k = paramArrayOfByte[2] & 0xFF;
    int m = paramArrayOfByte[3] & 0xFF;
    int n = (paramArrayOfByte[4] & 0xFF) << 8;
    int i1 = 6;
    int i2 = paramArrayOfByte[5] & 0xFF;
    n |= i2;
    int[] arrayOfInt1 = getCLUT(paramArrayOfByte, n, m);
    if (bool == paramBoolean)
    {
      m += -1;
      arrayOfInt1[m] = 0;
    }
    m = 8 % k;
    if (m == 0) {
      m = i * j;
    }
    for (int[] arrayOfInt2 = mapTo2OrderBitColor(paramArrayOfByte, i1, m, arrayOfInt1, k);; arrayOfInt2 = mapToNon2OrderBitColor(paramArrayOfByte, i1, m, arrayOfInt1, k))
    {
      Bitmap.Config localConfig = Bitmap.Config.RGB_565;
      return Bitmap.createBitmap(arrayOfInt2, i, j, localConfig);
      m = i * j;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/uicc/IccUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */