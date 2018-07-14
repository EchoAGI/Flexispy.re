package com.android.mockcdma;

import java.io.UnsupportedEncodingException;

public final class BearerData
{
  public boolean A;
  public boolean B;
  public boolean C;
  public boolean D;
  public int E;
  public int F;
  public b G;
  public int a;
  public int b;
  public boolean c = false;
  public int d = 0;
  public boolean e = false;
  public int f = 0;
  public boolean g = false;
  public int h = 0;
  public boolean i = false;
  public int j = 1;
  public boolean k = false;
  public int l = 0;
  public boolean m = false;
  public int n;
  public int o;
  public boolean p;
  public k q;
  public boolean r;
  public int s;
  public a t;
  public a u;
  public a v;
  public boolean w;
  public int x;
  public boolean y;
  public int z;
  
  public BearerData()
  {
    this.n = i1;
    this.o = i1;
    this.r = false;
  }
  
  public static BearerData a(byte[] paramArrayOfByte)
  {
    int i1 = 1;
    Object localObject2;
    try
    {
      localObject1 = new com/android/mockcdma/BitwiseInputStream;
      ((BitwiseInputStream)localObject1).<init>(paramArrayOfByte);
      localObject2 = new com/android/mockcdma/BearerData;
      ((BearerData)localObject2).<init>();
      i2 = 0;
      localCodingException1 = null;
    }
    catch (BitwiseInputStream.AccessException localAccessException)
    {
      BearerData.CodingException localCodingException1;
      int i3;
      int i6;
      i2 = 0;
      localObject3 = null;
      return (BearerData)localObject3;
      switch (i3)
      {
      case 16: 
      case 18: 
      case 19: 
      default: 
        localObject3 = new com/android/mockcdma/BearerData$CodingException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = "unsupported bearer data subparameter (";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).append(i3);
        localObject5 = ")";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((BearerData.CodingException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
    }
    catch (BearerData.CodingException localCodingException2)
    {
      Object localObject1;
      int i5;
      for (;;) {}
      bool1 = a((BearerData)localObject2, (BitwiseInputStream)localObject1);
      while (bool1)
      {
        i2 |= i5;
        break;
        bool1 = b((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = r((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = c((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = d((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = f((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = g((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = h((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = i((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = k((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = j((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = l((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = m((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = n((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = o((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = p((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = q((BearerData)localObject2, (BitwiseInputStream)localObject1);
        continue;
        bool1 = e((BearerData)localObject2, (BitwiseInputStream)localObject1);
      }
      bool1 = i2 & 0x1;
      if (bool1) {
        break label511;
      }
      localObject4 = new com/android/mockcdma/BearerData$CodingException;
      localObject2 = "missing MESSAGE_IDENTIFIER subparam";
      ((BearerData.CodingException)localObject4).<init>((String)localObject2);
      throw ((Throwable)localObject4);
      label511:
      Object localObject5 = ((BearerData)localObject2).q;
      if (localObject5 == null) {
        break label558;
      }
      localObject5 = ((BearerData)localObject2).q;
      i4 = ((k)localObject5).e;
      if (i4 != i1) {
        break label564;
      }
      int i2 = i2 ^ 0x1 ^ 0x2;
      if (i2 == 0) {
        break label554;
      }
      label554:
      d((BearerData)localObject2);
    }
    i3 = ((BitwiseInputStream)localObject1).a();
    if (i3 > 0)
    {
      i3 = 8;
      i3 = ((BitwiseInputStream)localObject1).a(i3);
      i5 = i1 << i3;
      i6 = i2 & i5;
      if (i6 != 0)
      {
        localCodingException1 = new com/android/mockcdma/BearerData$CodingException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = "illegal duplicate subparameter (";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).append(i3);
        localObject5 = ")";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject2).toString();
        localCodingException1.<init>((String)localObject2);
        throw localCodingException1;
      }
    }
    for (;;)
    {
      Object localObject3;
      boolean bool1;
      int i4;
      label558:
      Object localObject4 = localObject2;
      continue;
      label564:
      localObject4 = ((BearerData)localObject2).q;
      boolean bool2 = ((BearerData)localObject2).p;
      a((k)localObject4, bool2);
    }
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = 10;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>(paramInt);
    int i2 = 0;
    BearerData.CodingException localCodingException = null;
    if (i2 < paramInt)
    {
      int i3 = i2 / 2;
      i3 = paramArrayOfByte[i3];
      int i4 = i2 % 2 * 4;
      i4 = 4 - i4;
      i3 = i3 >>> i4 & 0xF;
      int i5 = 1;
      if (i3 >= i5)
      {
        int i6 = 9;
        if (i3 <= i6)
        {
          String str = Integer.toString(i3, i1);
          ((StringBuffer)localObject).append(str);
        }
      }
      char c1;
      for (;;)
      {
        i2 += 1;
        break;
        if (i3 == i1)
        {
          i3 = 48;
          ((StringBuffer)localObject).append(i3);
        }
        else
        {
          int i7 = 11;
          if (i3 == i7)
          {
            c1 = '*';
            ((StringBuffer)localObject).append(c1);
          }
          else
          {
            char c2 = '\f';
            if (c1 != c2) {
              break label175;
            }
            c1 = '#';
            ((StringBuffer)localObject).append(c1);
          }
        }
      }
      label175:
      localCodingException = new com/android/mockcdma/BearerData$CodingException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid SMS address DTMF code (" + c1 + ")";
      localCodingException.<init>((String)localObject);
      throw localCodingException;
    }
    return ((StringBuffer)localObject).toString();
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = (paramInt1 % 2 + paramInt1) / 2;
    i1 = paramInt2 - i1;
    try
    {
      localObject1 = new java/lang/String;
      i1 *= 2;
      localObject2 = "utf-16be";
      ((String)localObject1).<init>(paramArrayOfByte, paramInt1, i1, (String)localObject2);
      return (String)localObject1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject1 = new com/android/mockcdma/BearerData$CodingException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "UTF-16 decode failed: " + localUnsupportedEncodingException;
      ((BearerData.CodingException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
  }
  
  private static void a(BearerData paramBearerData)
  {
    int i1 = 6;
    int i2 = 3;
    Object localObject1 = new com/android/mockcdma/BitwiseInputStream;
    Object localObject3 = paramBearerData.q.j;
    ((BitwiseInputStream)localObject1).<init>((byte[])localObject3);
    int i3 = ((BitwiseInputStream)localObject1).a() / 6;
    Object localObject4 = paramBearerData.q;
    int i5 = ((k)localObject4).i;
    int i7 = 14;
    if ((i3 > i7) || (i3 < i2) || (i3 < i5))
    {
      localObject1 = new com/android/mockcdma/BearerData$CodingException;
      ((BearerData.CodingException)localObject1).<init>("IS-91 voicemail status decoding failed");
      throw ((Throwable)localObject1);
    }
    int i4;
    Object localObject2;
    try
    {
      localObject5 = new java/lang/StringBuffer;
      ((StringBuffer)localObject5).<init>(i3);
      for (;;)
      {
        i3 = ((BitwiseInputStream)localObject1).a();
        if (i3 < i1) {
          break;
        }
        localObject3 = k.a;
        i2 = 6;
        i2 = ((BitwiseInputStream)localObject1).a(i2);
        i3 = localObject3[i2];
        ((StringBuffer)localObject5).append(i3);
      }
      String str;
      int i8;
      int i9;
      int i6;
      localObject2 = new com/android/mockcdma/BearerData$CodingException;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localObject3 = new com/android/mockcdma/BearerData$CodingException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str = "IS-91 voicemail status decoding failed: " + localNumberFormatException;
      ((BearerData.CodingException)localObject3).<init>(str);
      throw ((Throwable)localObject3);
      str = ((StringBuffer)localObject5).toString();
      i4 = 0;
      localObject3 = null;
      i8 = 2;
      localObject3 = str.substring(0, i8);
      i4 = Integer.parseInt((String)localObject3);
      paramBearerData.E = i4;
      i4 = 2;
      i4 = str.charAt(i4);
      i8 = 32;
      if (i4 == i8)
      {
        i4 = 0;
        localObject3 = null;
      }
      for (paramBearerData.d = 0;; paramBearerData.d = i4)
      {
        i4 = 1;
        paramBearerData.c = i4;
        localObject3 = paramBearerData.q;
        i9 = 3;
        i5 += -3;
        str = str.substring(i9, i6);
        ((k)localObject3).k = str;
        return;
        i9 = 33;
        if (i4 != i9) {
          break;
        }
        i4 = 2;
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localObject3 = new com/android/mockcdma/BearerData$CodingException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject2 = "IS-91 voicemail status decoding failed: " + localIndexOutOfBoundsException;
      ((BearerData.CodingException)localObject3).<init>((String)localObject2);
      throw ((Throwable)localObject3);
    }
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    Object localObject5 = "IS-91 voicemail status decoding failed: illegal priority setting (";
    localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
    localObject3 = ((StringBuilder)localObject4).append(i4);
    localObject4 = ")";
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject3 = ((StringBuilder)localObject3).toString();
    ((BearerData.CodingException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  private static void a(b paramb)
  {
    int i1 = paramb.a;
    int i2 = 1;
    if (i1 == i2) {}
    for (;;)
    {
      try
      {
        String str1 = new java/lang/String;
        byte[] arrayOfByte1 = paramb.g;
        byte[] arrayOfByte2 = paramb.g;
        int i3 = arrayOfByte2.length;
        String str2 = "US-ASCII";
        str1.<init>(arrayOfByte1, 0, i3, str2);
        paramb.f = str1;
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localObject = new com/android/mockcdma/BearerData$CodingException;
        ((BearerData.CodingException)localObject).<init>("invalid SMS address ASCII code");
        throw ((Throwable)localObject);
      }
      Object localObject = paramb.g;
      i2 = paramb.c;
      localObject = a((byte[])localObject, i2);
      paramb.f = ((String)localObject);
    }
  }
  
  private static void a(k paramk, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2;
    int i1;
    int i2;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    Object localObject3;
    if (paramBoolean)
    {
      localObject2 = paramk.j;
      i1 = localObject2[0] & 0xFF;
      i2 = i1 + 1 + 0;
      arrayOfByte1 = new byte[i1];
      arrayOfByte2 = paramk.j;
      int i3 = 1;
      System.arraycopy(arrayOfByte2, i3, arrayOfByte1, 0, i1);
      localObject3 = g.a(arrayOfByte1);
      paramk.d = ((g)localObject3);
    }
    for (;;)
    {
      i1 = paramk.e;
      switch (i1)
      {
      case 1: 
      case 5: 
      case 6: 
      case 7: 
      default: 
        localObject2 = new com/android/mockcdma/BearerData$CodingException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("unsupported user data encoding (");
        i1 = paramk.e;
        localObject1 = i1 + ")";
        ((BearerData.CodingException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      case 0: 
        arrayOfByte1 = new byte[paramk.i];
        i1 = paramk.i;
        arrayOfByte2 = paramk.j;
        int i4 = arrayOfByte2.length;
        if (i1 < i4)
        {
          i1 = paramk.i;
          arrayOfByte2 = paramk.j;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i1);
          paramk.j = arrayOfByte1;
          localObject1 = paramk.j;
          i1 = paramk.i;
          localObject2 = d((byte[])localObject1, i2, i1);
          paramk.k = ((String)localObject2);
        }
        break;
      }
      for (;;)
      {
        return;
        localObject3 = paramk.j;
        i1 = localObject3.length;
        break;
        localObject1 = paramk.j;
        i1 = paramk.i;
        localObject2 = b((byte[])localObject1, i2, i1);
        paramk.k = ((String)localObject2);
        continue;
        localObject1 = paramk.j;
        i1 = paramk.i;
        localObject2 = a((byte[])localObject1, i2, i1);
        paramk.k = ((String)localObject2);
        continue;
        localObject1 = paramk.j;
        i1 = paramk.i;
        localObject2 = c((byte[])localObject1, i2, i1);
        paramk.k = ((String)localObject2);
        continue;
        localObject1 = paramk.j;
        i1 = paramk.i;
        localObject2 = d((byte[])localObject1, i2, i1);
        paramk.k = ((String)localObject2);
      }
      i2 = 0;
      localObject2 = null;
    }
  }
  
  private static boolean a(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 0;
    int i2 = 8;
    int i3 = 1;
    int i5 = paramBitwiseInputStream.a(i2) * 8;
    int i6 = 24;
    if (i5 >= i6)
    {
      i5 += -24;
      i6 = paramBitwiseInputStream.a(4);
      paramBearerData.a = i6;
      i6 = paramBitwiseInputStream.a(i2) << 8;
      paramBearerData.b = i6;
      i6 = paramBearerData.b;
      i2 = paramBitwiseInputStream.a(i2);
      i6 |= i2;
      paramBearerData.b = i6;
      i6 = paramBitwiseInputStream.a(i3);
      if (i6 == i3) {
        i1 = i3;
      }
      paramBearerData.p = i1;
      paramBitwiseInputStream.c(3);
    }
    for (i1 = i5;; i1 = i5)
    {
      if ((i3 != 0) && (i1 > 0)) {}
      paramBitwiseInputStream.c(i1);
      return i3;
      int i4 = 0;
    }
  }
  
  private static String b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = 32;
    char c1 = '\r';
    int i2 = 10;
    int i3 = paramInt1 * 8;
    Object localObject1;
    Object localObject2;
    int i4;
    Object localObject3;
    try
    {
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>(paramInt2);
      localObject2 = new com/android/mockcdma/BitwiseInputStream;
      ((BitwiseInputStream)localObject2).<init>(paramArrayOfByte);
      i4 = i3 * 8;
      int i5 = paramInt2 * 7;
      i4 += i5;
      int i6 = ((BitwiseInputStream)localObject2).a();
      if (i6 < i4)
      {
        BearerData.CodingException localCodingException = new com/android/mockcdma/BearerData$CodingException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "insufficient data (wanted ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append(i4);
        String str2 = " bits, but only have ";
        localObject1 = ((StringBuilder)localObject1).append(str2);
        int i8 = ((BitwiseInputStream)localObject2).a();
        localObject1 = ((StringBuilder)localObject1).append(i8);
        localObject2 = ")";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localCodingException.<init>((String)localObject1);
        throw localCodingException;
      }
    }
    catch (BitwiseInputStream.AccessException localAccessException)
    {
      localObject1 = new com/android/mockcdma/BearerData$CodingException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str1 = "7bit ASCII decode failed: " + localAccessException;
      ((BearerData.CodingException)localObject1).<init>(str1);
      throw ((Throwable)localObject1);
    }
    ((BitwiseInputStream)localObject2).c(i3);
    i3 = 0;
    String str1 = null;
    if (i3 < paramInt2)
    {
      i4 = 7;
      i4 = ((BitwiseInputStream)localObject2).a(i4);
      if (i4 >= i1)
      {
        int i7 = k.c;
        if (i4 <= i7)
        {
          localObject3 = k.a;
          i4 += -32;
          i4 = localObject3[i4];
          ((StringBuffer)localObject1).append(i4);
        }
      }
      for (;;)
      {
        i3 += 1;
        break;
        char c2;
        if (i4 == i2)
        {
          c2 = '\n';
          ((StringBuffer)localObject1).append(c2);
        }
        else if (c2 == c1)
        {
          c2 = '\r';
          ((StringBuffer)localObject1).append(c2);
        }
        else
        {
          c2 = ' ';
          ((StringBuffer)localObject1).append(c2);
        }
      }
    }
    return ((StringBuffer)localObject1).toString();
  }
  
  private static void b(BearerData paramBearerData)
  {
    Object localObject1 = new com/android/mockcdma/BitwiseInputStream;
    Object localObject2 = paramBearerData.q.j;
    ((BitwiseInputStream)localObject1).<init>((byte[])localObject2);
    int i1 = ((BitwiseInputStream)localObject1).a() / 6;
    k localk = paramBearerData.q;
    int i2 = localk.i;
    int i3 = 14;
    if ((i1 > i3) || (i1 < i2))
    {
      localObject2 = new com/android/mockcdma/BearerData$CodingException;
      ((BearerData.CodingException)localObject2).<init>("IS-91 voicemail status decoding failed");
      throw ((Throwable)localObject2);
    }
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>(i1);
    i1 = 0;
    localObject2 = null;
    while (i1 < i2)
    {
      char[] arrayOfChar = k.a;
      int i4 = ((BitwiseInputStream)localObject1).a(6);
      char c1 = arrayOfChar[i4];
      localStringBuffer.append(c1);
      i1 += 1;
    }
    localObject2 = paramBearerData.q;
    localObject1 = localStringBuffer.toString();
    ((k)localObject2).k = ((String)localObject1);
  }
  
  private static boolean b(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 5;
    int i2 = 8;
    int i3 = 1;
    int i4 = paramBitwiseInputStream.a(i2) * 8;
    k localk1 = new com/android/mockcdma/k;
    localk1.<init>();
    paramBearerData.q = localk1;
    localk1 = paramBearerData.q;
    int i5 = paramBitwiseInputStream.a(i1);
    localk1.e = i5;
    paramBearerData.q.f = i3;
    localk1 = paramBearerData.q;
    i5 = 0;
    localk1.g = 0;
    localk1 = paramBearerData.q;
    int i6 = localk1.e;
    int i7;
    if (i6 != i3)
    {
      localk1 = paramBearerData.q;
      i7 = localk1.e;
      i5 = 10;
      if (i7 != i5) {}
    }
    else
    {
      localObject = paramBearerData.q;
      i7 = paramBitwiseInputStream.a(i2);
      ((k)localObject).g = i7;
      i1 = 13;
    }
    localk1 = paramBearerData.q;
    i5 = paramBitwiseInputStream.a(i2);
    localk1.i = i5;
    i1 += 8;
    i1 = i4 - i1;
    k localk2 = paramBearerData.q;
    Object localObject = paramBitwiseInputStream.b(i1);
    localk2.j = ((byte[])localObject);
    return i3;
  }
  
  private static String c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 * 8;
    int i2 = (i1 + 6) / 7;
    int i3 = paramInt2 - i2;
    i2 *= 7;
    i1 = i2 - i1;
    Object localObject = c.a(paramArrayOfByte, paramInt1, i3, i1);
    if (localObject == null)
    {
      localObject = new com/android/mockcdma/BearerData$CodingException;
      ((BearerData.CodingException)localObject).<init>("7bit GSM decoding failed");
      throw ((Throwable)localObject);
    }
    return (String)localObject;
  }
  
  private static void c(BearerData paramBearerData)
  {
    Object localObject1 = new com/android/mockcdma/BitwiseInputStream;
    Object localObject2 = paramBearerData.q.j;
    ((BitwiseInputStream)localObject1).<init>((byte[])localObject2);
    int i1 = ((BitwiseInputStream)localObject1).a() / 4;
    localObject2 = paramBearerData.q;
    int i2 = ((k)localObject2).i;
    int i3 = 14;
    if (i1 <= i3)
    {
      i3 = 3;
      if ((i1 >= i3) && (i1 >= i2)) {}
    }
    else
    {
      localObject1 = new com/android/mockcdma/BearerData$CodingException;
      ((BearerData.CodingException)localObject1).<init>("IS-91 voicemail status decoding failed");
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/android/mockcdma/b;
    ((b)localObject1).<init>();
    ((b)localObject1).a = 0;
    byte[] arrayOfByte = paramBearerData.q.j;
    ((b)localObject1).g = arrayOfByte;
    i2 = (byte)i2;
    ((b)localObject1).c = i2;
    a((b)localObject1);
    paramBearerData.G = ((b)localObject1);
  }
  
  private static boolean c(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = 1;
    int i4 = paramBitwiseInputStream.a(i1) * 8;
    label74:
    label99:
    int i7;
    if (i4 >= i1)
    {
      i1 = i4 + -8;
      i4 = paramBitwiseInputStream.a(i2);
      if (i4 == i2)
      {
        i4 = i2;
        paramBearerData.A = i4;
        int i5 = paramBitwiseInputStream.a(i2);
        if (i5 != i2) {
          break label161;
        }
        i5 = i2;
        paramBearerData.B = i5;
        int i6 = paramBitwiseInputStream.a(i2);
        if (i6 != i2) {
          break label167;
        }
        i6 = i2;
        paramBearerData.C = i6;
        i7 = paramBitwiseInputStream.a(i2);
        if (i7 == i2) {
          bool = i2;
        }
        paramBearerData.D = bool;
        paramBitwiseInputStream.c(4);
        i7 = i1;
      }
    }
    for (;;)
    {
      if ((i2 != 0) && (i7 > 0)) {}
      paramBitwiseInputStream.c(i7);
      return i2;
      int i8 = 0;
      break;
      label161:
      i8 = 0;
      break label74;
      label167:
      i8 = 0;
      break label99;
      int i3 = 0;
    }
  }
  
  private static String d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      String str1 = new java/lang/String;
      int i1 = paramInt2 - paramInt1;
      localObject = "ISO-8859-1";
      str1.<init>(paramArrayOfByte, paramInt1, i1, (String)localObject);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      BearerData.CodingException localCodingException = new com/android/mockcdma/BearerData$CodingException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "ISO-8859-1 decode failed: " + localUnsupportedEncodingException;
      localCodingException.<init>(str2);
      throw localCodingException;
    }
  }
  
  private static void d(BearerData paramBearerData)
  {
    Object localObject1 = paramBearerData.q;
    int i1 = ((k)localObject1).g;
    switch (i1)
    {
    default: 
      localObject1 = new com/android/mockcdma/BearerData$CodingException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("unsupported IS-91 message type (");
      int i2 = paramBearerData.q.g;
      localObject2 = i2 + ")";
      ((BearerData.CodingException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 130: 
      a(paramBearerData);
    }
    for (;;)
    {
      return;
      c(paramBearerData);
      continue;
      b(paramBearerData);
    }
  }
  
  private static boolean d(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = e.a((byte)paramBitwiseInputStream.a(i1));
      paramBearerData.E = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    return bool;
  }
  
  private static boolean e(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    int i3 = 16;
    if (i2 >= i3)
    {
      i2 += -16;
      bool = true;
      i3 = paramBitwiseInputStream.a(i1) << 8;
      i1 = paramBitwiseInputStream.a(i1);
      i3 |= i1;
      paramBearerData.F = i3;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    return bool;
  }
  
  private static boolean f(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 4;
    int i2 = 8;
    int i3 = 1;
    float f1 = Float.MIN_VALUE;
    int i4 = paramBitwiseInputStream.a(i2) * 8;
    b localb = new com/android/mockcdma/b;
    localb.<init>();
    int i5 = paramBitwiseInputStream.a(i3);
    localb.a = i5;
    i5 = localb.a;
    int i6;
    if (i5 == i3)
    {
      i6 = paramBitwiseInputStream.a(3);
      localb.e = i6;
      i1 = paramBitwiseInputStream.a(i1);
      localb.d = i1;
      i1 = (byte)i2;
      i6 = i2;
    }
    for (;;)
    {
      i2 = paramBitwiseInputStream.a(i2);
      localb.c = i2;
      i1 = (byte)(i1 + 8);
      i1 = i4 - i1;
      i2 = localb.c;
      i6 *= i2;
      i2 = i1 - i6;
      if (i1 < i6)
      {
        BearerData.CodingException localCodingException = new com/android/mockcdma/BearerData$CodingException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject = "CALLBACK_NUMBER subparam encoding size error (remainingBits + " + i1 + ", dataBits + " + i6 + ", paddingBits + " + i2 + ")";
        localCodingException.<init>((String)localObject);
        throw localCodingException;
      }
      Object localObject = paramBitwiseInputStream.b(i6);
      localb.g = ((byte[])localObject);
      paramBitwiseInputStream.c(i2);
      a(localb);
      paramBearerData.G = localb;
      return i3;
      i6 = i1;
      i1 = i3;
    }
  }
  
  private static boolean g(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(2);
      paramBearerData.n = i1;
      i1 = paramBitwiseInputStream.a(6);
      paramBearerData.o = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.m = bool;
    return bool;
  }
  
  private static boolean h(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 48;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(8) * 8;
    if (i2 >= i1)
    {
      i2 += -48;
      bool = true;
      a locala = a.a(paramBitwiseInputStream.b(i1));
      paramBearerData.t = locala;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    return bool;
  }
  
  private static boolean i(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 48;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(8) * 8;
    if (i2 >= i1)
    {
      i2 += -48;
      bool = true;
      a locala = a.a(paramBitwiseInputStream.b(i1));
      paramBearerData.u = locala;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    return bool;
  }
  
  private static boolean j(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 48;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(8) * 8;
    if (i2 >= i1)
    {
      i2 += -48;
      bool = true;
      a locala = a.a(paramBitwiseInputStream.b(i1));
      paramBearerData.v = locala;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    return bool;
  }
  
  private static boolean k(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(i1);
      paramBearerData.z = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.y = bool;
    return bool;
  }
  
  private static boolean l(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(i1);
      paramBearerData.x = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.w = bool;
    return bool;
  }
  
  private static boolean m(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(2);
      paramBearerData.f = i1;
      i1 = 6;
      paramBitwiseInputStream.c(i1);
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.e = bool;
    return bool;
  }
  
  private static boolean n(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(i1);
      paramBearerData.l = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.k = bool;
    return bool;
  }
  
  private static boolean o(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(2);
      paramBearerData.j = i1;
      i1 = 6;
      paramBitwiseInputStream.c(i1);
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.i = bool;
    return bool;
  }
  
  private static boolean p(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(2);
      paramBearerData.d = i1;
      i1 = 6;
      paramBitwiseInputStream.c(i1);
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.c = bool;
    return bool;
  }
  
  private static boolean q(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(2);
      paramBearerData.h = i1;
      i1 = 6;
      paramBitwiseInputStream.c(i1);
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.g = bool;
    return bool;
  }
  
  private static boolean r(BearerData paramBearerData, BitwiseInputStream paramBitwiseInputStream)
  {
    int i1 = 8;
    boolean bool = false;
    int i2 = paramBitwiseInputStream.a(i1) * 8;
    if (i2 >= i1)
    {
      i2 += -8;
      bool = true;
      i1 = paramBitwiseInputStream.a(i1);
      paramBearerData.s = i1;
    }
    if ((bool) && (i2 > 0)) {}
    paramBitwiseInputStream.c(i2);
    paramBearerData.r = bool;
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("BearerData ");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("{ messageType=");
    int i1 = this.a;
    localObject1 = i1;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(", messageId=");
    i1 = this.b;
    localObject1 = i1;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = ((StringBuilder)localObject1).append(", priority=");
    boolean bool3 = this.c;
    label184:
    label240:
    label296:
    label352:
    label408:
    label464:
    label511:
    label558:
    label614:
    label661:
    int i11;
    if (bool3)
    {
      int i3 = this.d;
      localObject1 = Integer.valueOf(i3);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", privacy=");
      boolean bool4 = this.e;
      if (!bool4) {
        break label1081;
      }
      int i4 = this.f;
      localObject1 = Integer.valueOf(i4);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", alert=");
      boolean bool5 = this.g;
      if (!bool5) {
        break label1088;
      }
      int i5 = this.h;
      localObject1 = Integer.valueOf(i5);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", displayMode=");
      boolean bool6 = this.i;
      if (!bool6) {
        break label1095;
      }
      int i6 = this.j;
      localObject1 = Integer.valueOf(i6);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", language=");
      boolean bool7 = this.k;
      if (!bool7) {
        break label1102;
      }
      int i7 = this.l;
      localObject1 = Integer.valueOf(i7);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", errorClass=");
      boolean bool8 = this.m;
      if (!bool8) {
        break label1109;
      }
      int i8 = this.n;
      localObject1 = Integer.valueOf(i8);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", msgStatus=");
      boolean bool9 = this.m;
      if (!bool9) {
        break label1116;
      }
      int i9 = this.o;
      localObject1 = Integer.valueOf(i9);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", msgCenterTimeStamp=");
      localObject1 = this.t;
      if (localObject1 == null) {
        break label1123;
      }
      localObject1 = this.t;
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", validityPeriodAbsolute=");
      localObject1 = this.u;
      if (localObject1 == null) {
        break label1130;
      }
      localObject1 = this.u;
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", validityPeriodRelative=");
      boolean bool10 = this.w;
      if (!bool10) {
        break label1137;
      }
      int i10 = this.x;
      localObject1 = Integer.valueOf(i10);
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", deferredDeliveryTimeAbsolute=");
      localObject1 = this.v;
      if (localObject1 == null) {
        break label1144;
      }
      localObject1 = this.v;
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append(", deferredDeliveryTimeRelative=");
      boolean bool11 = this.y;
      if (!bool11) {
        break label1151;
      }
      i11 = this.z;
    }
    label1081:
    label1088:
    label1095:
    label1102:
    label1109:
    label1116:
    label1123:
    label1130:
    label1137:
    label1144:
    label1151:
    for (localObject1 = Integer.valueOf(i11);; localObject1 = "unset")
    {
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", userAckReq=");
      boolean bool1 = this.A;
      localObject1 = bool1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", deliveryAckReq=");
      bool1 = this.B;
      localObject1 = bool1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", readAckReq=");
      bool1 = this.C;
      localObject1 = bool1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", reportReq=");
      bool1 = this.D;
      localObject1 = bool1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", numberOfMessages=");
      int i2 = this.E;
      localObject1 = i2;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", callbackNumber=");
      localObject2 = this.G;
      localObject1 = localObject2;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", depositIndex=");
      i2 = this.F;
      localObject1 = i2;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", hasUserDataHeader=");
      boolean bool2 = this.p;
      localObject1 = bool2;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", userData=");
      localObject2 = this.q;
      localObject1 = localObject2;
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
      localObject1 = "unset";
      break;
      localObject1 = "unset";
      break label184;
      localObject1 = "unset";
      break label240;
      localObject1 = "unset";
      break label296;
      localObject1 = "unset";
      break label352;
      localObject1 = "unset";
      break label408;
      localObject1 = "unset";
      break label464;
      localObject1 = "unset";
      break label511;
      localObject1 = "unset";
      break label558;
      localObject1 = "unset";
      break label614;
      localObject1 = "unset";
      break label661;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/BearerData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */