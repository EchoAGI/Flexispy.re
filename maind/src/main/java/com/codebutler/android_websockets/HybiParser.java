package com.codebutler.android_websockets;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class HybiParser
{
  private static final List n;
  private static final List o;
  private b a;
  private boolean b = true;
  private int c;
  private boolean d;
  private boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private byte[] j;
  private byte[] k;
  private boolean l;
  private ByteArrayOutputStream m;
  
  static
  {
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    Integer[] arrayOfInteger = new Integer[6];
    Integer localInteger1 = Integer.valueOf(0);
    arrayOfInteger[0] = localInteger1;
    localInteger1 = Integer.valueOf(i3);
    arrayOfInteger[i3] = localInteger1;
    localInteger1 = Integer.valueOf(i2);
    arrayOfInteger[i2] = localInteger1;
    localInteger1 = Integer.valueOf(8);
    arrayOfInteger[i1] = localInteger1;
    Integer localInteger2 = Integer.valueOf(9);
    arrayOfInteger[4] = localInteger2;
    localInteger2 = Integer.valueOf(10);
    arrayOfInteger[5] = localInteger2;
    n = Arrays.asList(arrayOfInteger);
    arrayOfInteger = new Integer[i1];
    localInteger1 = Integer.valueOf(0);
    arrayOfInteger[0] = localInteger1;
    localInteger1 = Integer.valueOf(i3);
    arrayOfInteger[i3] = localInteger1;
    localInteger1 = Integer.valueOf(i2);
    arrayOfInteger[i2] = localInteger1;
    o = Arrays.asList(arrayOfInteger);
  }
  
  public HybiParser(b paramb)
  {
    Object localObject = new byte[0];
    this.j = ((byte[])localObject);
    localObject = new byte[0];
    this.k = ((byte[])localObject);
    this.l = false;
    localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>();
    this.m = ((ByteArrayOutputStream)localObject);
    this.a = paramb;
  }
  
  private void a()
  {
    int i1 = 10;
    int i2 = 0;
    Object localObject1 = null;
    int i4 = 1;
    int i5 = 2;
    Object localObject2 = this.k;
    Object localObject3 = this.j;
    localObject2 = a((byte[])localObject2, (byte[])localObject3, 0);
    int i6 = this.f;
    boolean bool;
    int i7;
    if (i6 == 0)
    {
      i2 = this.i;
      if (i2 == 0)
      {
        localObject1 = new com/codebutler/android_websockets/HybiParser$ProtocolError;
        ((HybiParser.ProtocolError)localObject1).<init>("Mode was not set.");
        throw ((Throwable)localObject1);
      }
      localObject1 = this.m;
      ((ByteArrayOutputStream)localObject1).write((byte[])localObject2);
      bool = this.d;
      if (bool)
      {
        localObject1 = this.m.toByteArray();
        i7 = this.i;
        if (i7 != i4) {
          break label136;
        }
        localObject2 = this.a.a();
        localObject1 = c((byte[])localObject1);
        ((e)localObject2).a((String)localObject1);
        b();
      }
    }
    for (;;)
    {
      return;
      label136:
      localObject2 = this.a.a();
      ((e)localObject2).a((byte[])localObject1);
      break;
      if (i6 == i4)
      {
        bool = this.d;
        if (bool)
        {
          localObject1 = c((byte[])localObject2);
          localObject2 = this.a.a();
          ((e)localObject2).a((String)localObject1);
        }
        else
        {
          this.i = i4;
          localObject1 = this.m;
          ((ByteArrayOutputStream)localObject1).write((byte[])localObject2);
        }
      }
      else if (i6 == i5)
      {
        bool = this.d;
        if (bool)
        {
          localObject1 = this.a.a();
          ((e)localObject1).a((byte[])localObject2);
        }
        else
        {
          this.i = i5;
          localObject1 = this.m;
          ((ByteArrayOutputStream)localObject1).write((byte[])localObject2);
        }
      }
      else
      {
        int i8 = 8;
        Object localObject4;
        if (i6 == i8)
        {
          i6 = localObject2.length;
          if (i6 >= i5)
          {
            i3 = localObject2[0] * 256;
            i6 = localObject2[i4];
            i3 += i6;
          }
          i6 = localObject2.length;
          if (i6 > i5) {
            localObject2 = a((byte[])localObject2, i5);
          }
          for (localObject2 = c((byte[])localObject2);; localObject2 = null)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = "Got close op! " + i3 + " " + (String)localObject2;
            Log.d("HybiParser", (String)localObject4);
            localObject3 = this.a.a();
            localObject4 = new java/lang/Exception;
            Object localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = ((StringBuilder)localObject5).append("Got close op! ").append(i3);
            String str = " ";
            localObject5 = str + (String)localObject2;
            ((Exception)localObject4).<init>((String)localObject5);
            ((e)localObject3).a(i3, (String)localObject2, (Exception)localObject4);
            break;
            i7 = 0;
          }
        }
        int i3 = 9;
        if (i6 == i3)
        {
          i3 = localObject2.length;
          i6 = 125;
          if (i3 > i6)
          {
            localObject1 = new com/codebutler/android_websockets/HybiParser$ProtocolError;
            ((HybiParser.ProtocolError)localObject1).<init>("Ping payload too large");
            throw ((Throwable)localObject1);
          }
          localObject3 = "Sending pong!!";
          Log.d("HybiParser", (String)localObject3);
          localObject1 = this.a;
          i6 = -1;
          localObject2 = a((byte[])localObject2, i1, i6);
          ((b)localObject1).b((byte[])localObject2);
        }
        else if (i6 == i1)
        {
          localObject1 = c((byte[])localObject2);
          localObject2 = "HybiParser";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Got pong! ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject1 = (String)localObject1;
          Log.d((String)localObject2, (String)localObject1);
        }
      }
    }
  }
  
  private void a(byte paramByte)
  {
    int i1 = 1;
    int i2 = 0;
    Integer localInteger = null;
    int i3 = paramByte & 0x40;
    int i4 = 64;
    int i5;
    if (i3 == i4)
    {
      i5 = i1;
      i3 = paramByte & 0x20;
      i4 = 32;
      if (i3 != i4) {
        break label103;
      }
      i4 = i1;
      label47:
      i3 = paramByte & 0x10;
      int i6 = 16;
      if (i3 != i6) {
        break label109;
      }
      i3 = i1;
    }
    for (;;)
    {
      if ((i5 == 0) && (i4 == 0) && (i3 == 0)) {
        break label118;
      }
      localObject = new com/codebutler/android_websockets/HybiParser$ProtocolError;
      ((HybiParser.ProtocolError)localObject).<init>("RSV not zero");
      throw ((Throwable)localObject);
      i5 = 0;
      break;
      label103:
      i4 = 0;
      break label47;
      label109:
      i3 = 0;
      localObject = null;
    }
    label118:
    i3 = paramByte & 0x80;
    i4 = 128;
    if (i3 == i4) {
      i3 = i1;
    }
    for (;;)
    {
      this.d = i3;
      i3 = paramByte & 0xF;
      this.f = i3;
      localObject = new byte[0];
      this.j = ((byte[])localObject);
      localObject = new byte[0];
      this.k = ((byte[])localObject);
      localObject = n;
      i2 = this.f;
      localInteger = Integer.valueOf(i2);
      bool = ((List)localObject).contains(localInteger);
      if (bool) {
        break;
      }
      localObject = new com/codebutler/android_websockets/HybiParser$ProtocolError;
      ((HybiParser.ProtocolError)localObject).<init>("Bad opcode");
      throw ((Throwable)localObject);
      bool = false;
      localObject = null;
    }
    Object localObject = o;
    i2 = this.f;
    localInteger = Integer.valueOf(i2);
    boolean bool = ((List)localObject).contains(localInteger);
    if (!bool)
    {
      bool = this.d;
      if (!bool)
      {
        localObject = new com/codebutler/android_websockets/HybiParser$ProtocolError;
        ((HybiParser.ProtocolError)localObject).<init>("Expected non-final packet");
        throw ((Throwable)localObject);
      }
    }
    this.c = i1;
  }
  
  private byte[] a(Object paramObject, int paramInt1, int paramInt2)
  {
    boolean bool1 = this.l;
    if (bool1)
    {
      bool1 = false;
      localObject1 = null;
      return (byte[])localObject1;
    }
    Object localObject1 = "HybiParser";
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Creating frame for: ").append(paramObject).append(" op: ").append(paramInt1);
    String str = " err: ";
    localObject2 = str + paramInt2;
    Log.d((String)localObject1, (String)localObject2);
    bool1 = paramObject instanceof String;
    label106:
    int i1;
    label113:
    int i3;
    int i4;
    label134:
    label148:
    int i7;
    int i6;
    label171:
    byte[] arrayOfByte;
    int i10;
    if (bool1)
    {
      paramObject = (String)paramObject;
      paramObject = b((String)paramObject);
      if (paramInt2 <= 0) {
        break label471;
      }
      i1 = 2;
      i3 = paramObject.length + i1;
      i4 = 125;
      if (i3 > i4) {
        break label480;
      }
      i4 = 2;
      boolean bool3 = this.b;
      if (!bool3) {
        break label504;
      }
      int i5 = 4;
      i7 = i4 + i5;
      boolean bool4 = this.b;
      if (!bool4) {
        break label513;
      }
      i6 = 128;
      int i8 = i3 + i7;
      arrayOfByte = new byte[i8];
      int i9 = (byte)((byte)paramInt1 | 0xFFFFFF80);
      arrayOfByte[0] = i9;
      i10 = 125;
      if (i3 > i10) {
        break label522;
      }
      i10 = 1;
      i6 = (byte)(i6 | i3);
      arrayOfByte[i10] = i6;
    }
    for (;;)
    {
      double d1;
      if (paramInt2 > 0)
      {
        d1 = Math.floor(paramInt2 / 256);
        i6 = (byte)((int)d1 & 0xFF);
        arrayOfByte[i7] = i6;
        i6 = i7 + 1;
        i3 = (byte)(paramInt2 & 0xFF);
        arrayOfByte[i6] = i3;
      }
      i6 = 0;
      str = null;
      i1 += i7;
      i3 = paramObject.length;
      System.arraycopy(paramObject, 0, arrayOfByte, i1, i3);
      boolean bool2 = this.b;
      double d2;
      if (bool2)
      {
        i2 = 4;
        localObject1 = new byte[i2];
        i3 = (byte)(int)Math.floor(Math.random() * 256.0D);
        localObject1[0] = i3;
        i3 = (byte)(int)Math.floor(Math.random() * 256.0D);
        localObject1[1] = i3;
        i3 = (byte)(int)Math.floor(Math.random() * 256.0D);
        localObject1[2] = i3;
        d1 = Math.random();
        d2 = 256.0D;
        d1 = Math.floor(d1 * d2);
        i3 = (byte)(int)d1;
        localObject1[3] = i3;
        i6 = 0;
        str = null;
        i3 = localObject1.length;
        System.arraycopy(localObject1, 0, arrayOfByte, i4, i3);
        a(arrayOfByte, (byte[])localObject1, i7);
      }
      localObject1 = arrayOfByte;
      break;
      paramObject = (byte[])paramObject;
      break label106;
      label471:
      int i2 = 0;
      localObject1 = null;
      break label113;
      label480:
      i4 = (char)-1;
      if (i3 <= i4)
      {
        i4 = 4;
        break label134;
      }
      i4 = 10;
      break label134;
      label504:
      i6 = 0;
      str = null;
      break label148;
      label513:
      i6 = 0;
      str = null;
      break label171;
      label522:
      i10 = (char)-1;
      if (i3 <= i10)
      {
        i6 = (byte)(i6 | 0x7E);
        arrayOfByte[1] = i6;
        d1 = Math.floor(i3 / 256);
        i10 = (byte)(int)d1;
        arrayOfByte[2] = i10;
        i6 = 3;
        i3 = (byte)(i3 & 0xFF);
        arrayOfByte[i6] = i3;
      }
      else
      {
        i6 = (byte)(i6 | 0x7F);
        arrayOfByte[1] = i6;
        d1 = i3;
        d2 = Math.pow(2.0D, 56.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[2] = i10;
        d1 = i3;
        d2 = Math.pow(2.0D, 48.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[3] = i10;
        d1 = i3;
        d2 = Math.pow(2.0D, 40.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[4] = i10;
        d1 = i3;
        d2 = Math.pow(2.0D, 32.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[5] = i10;
        d1 = i3;
        d2 = Math.pow(2.0D, 24.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[6] = i10;
        d1 = i3;
        d2 = Math.pow(2.0D, 16.0D);
        i10 = (byte)((int)Math.floor(d1 / d2) & 0xFF);
        arrayOfByte[7] = i10;
        d1 = i3;
        double d3 = 8.0D;
        d2 = Math.pow(2.0D, d3);
        d1 = Math.floor(d1 / d2);
        i10 = (byte)((int)d1 & 0xFF);
        arrayOfByte[8] = i10;
        i6 = 9;
        i3 = (byte)(i3 & 0xFF);
        arrayOfByte[i6] = i3;
      }
    }
  }
  
  private byte[] a(String paramString, int paramInt1, int paramInt2)
  {
    return a(paramString, paramInt1, paramInt2);
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = paramArrayOfByte.length;
    return Arrays.copyOfRange(paramArrayOfByte, paramInt, i1);
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int i1 = paramArrayOfByte2.length;
    if (i1 == 0) {
      return paramArrayOfByte1;
    }
    i1 = 0;
    for (;;)
    {
      int i2 = paramArrayOfByte1.length - paramInt;
      if (i1 >= i2) {
        break;
      }
      i2 = paramInt + i1;
      int i3 = paramInt + i1;
      i3 = paramArrayOfByte1[i3];
      int i4 = i1 % 4;
      i4 = paramArrayOfByte2[i4];
      i3 = (byte)(i3 ^ i4);
      paramArrayOfByte1[i2] = i3;
      i1 += 1;
    }
  }
  
  private static long b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfByte.length;
    if (i1 < paramInt2)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("length must be less than or equal to removeFromPath.length");
      throw localIllegalArgumentException;
    }
    long l1 = 0L;
    i1 = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    while (i1 < paramInt2)
    {
      int i2 = (paramInt2 + -1 - i1) * 8;
      int i3 = i1 + paramInt1;
      i3 = paramArrayOfByte[i3] & 0xFF;
      i2 = i3 << i2;
      long l2 = i2;
      l1 += l2;
      i1 += 1;
    }
    return l1;
  }
  
  private void b()
  {
    this.i = 0;
    this.m.reset();
  }
  
  private void b(byte paramByte)
  {
    int i1 = 2;
    int i2 = paramByte & 0x80;
    int i4 = 128;
    if (i2 == i4)
    {
      i2 = 1;
      this.e = i2;
      i2 = paramByte & 0x7F;
      this.h = i2;
      i2 = this.h;
      if (i2 < 0) {
        break label87;
      }
      i2 = this.h;
      i4 = 125;
      if (i2 > i4) {
        break label87;
      }
      boolean bool = this.e;
      if (!bool) {
        break label82;
      }
    }
    label82:
    for (int i3 = 3;; i3 = 4)
    {
      this.c = i3;
      return;
      i3 = 0;
      break;
    }
    label87:
    i3 = this.h;
    i4 = 126;
    if (i3 == i4) {}
    for (i3 = i1;; i3 = 8)
    {
      this.g = i3;
      this.c = i1;
      break;
    }
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    int i1 = d(paramArrayOfByte);
    this.h = i1;
    boolean bool = this.e;
    if (bool) {}
    for (int i2 = 3;; i2 = 4)
    {
      this.c = i2;
      return;
    }
  }
  
  private byte[] b(String paramString)
  {
    String str = "UTF-8";
    try
    {
      return paramString.getBytes(str);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localUnsupportedEncodingException);
      throw localRuntimeException;
    }
  }
  
  private String c(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new java/lang/String;
      localObject = "UTF-8";
      str.<init>(paramArrayOfByte, (String)localObject);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
  
  private int d(byte[] paramArrayOfByte)
  {
    String str = null;
    int i1 = paramArrayOfByte.length;
    long l1 = b(paramArrayOfByte, 0, i1);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      l2 = 2147483647L;
      bool = l1 < l2;
      if (!bool) {}
    }
    else
    {
      HybiParser.ProtocolError localProtocolError = new com/codebutler/android_websockets/HybiParser$ProtocolError;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "Bad integer: " + l1;
      localProtocolError.<init>(str);
      throw localProtocolError;
    }
    return (int)l1;
  }
  
  public void a(a parama)
  {
    int i1 = 4;
    for (;;)
    {
      int i2 = parama.available();
      int i4 = -1;
      Object localObject;
      if (i2 == i4)
      {
        localObject = this.a.a();
        Exception localException = new java/lang/Exception;
        localException.<init>("EOF");
        ((e)localObject).a(0, "EOF", localException);
        return;
      }
      i2 = this.c;
      int i3;
      switch (i2)
      {
      default: 
        break;
      case 0: 
        i2 = parama.readByte();
        a(i2);
        break;
      case 1: 
        byte b1 = parama.readByte();
        b(b1);
        break;
      case 2: 
        i3 = this.g;
        localObject = parama.a(i3);
        b((byte[])localObject);
        break;
      case 3: 
        localObject = parama.a(i1);
        this.j = ((byte[])localObject);
        this.c = i1;
        break;
      case 4: 
        i3 = this.h;
        localObject = parama.a(i3);
        this.k = ((byte[])localObject);
        a();
        this.c = 0;
      }
    }
  }
  
  public byte[] a(String paramString)
  {
    return a(paramString, 1, -1);
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 2, -1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/codebutler/android_websockets/HybiParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */