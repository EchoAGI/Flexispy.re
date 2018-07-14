package com.vvt.qq.internal.pb;

import java.io.UnsupportedEncodingException;

public final class ByteStringMicro
{
  public static final ByteStringMicro EMPTY;
  private final byte[] bytes;
  private volatile int hash = 0;
  
  static
  {
    ByteStringMicro localByteStringMicro = new com/vvt/qq/internal/pb/ByteStringMicro;
    byte[] arrayOfByte = new byte[0];
    localByteStringMicro.<init>(arrayOfByte);
    EMPTY = localByteStringMicro;
  }
  
  private ByteStringMicro(byte[] paramArrayOfByte)
  {
    this.bytes = paramArrayOfByte;
  }
  
  public static ByteStringMicro copyFrom(String paramString1, String paramString2)
  {
    ByteStringMicro localByteStringMicro = new com/vvt/qq/internal/pb/ByteStringMicro;
    byte[] arrayOfByte = paramString1.getBytes(paramString2);
    localByteStringMicro.<init>(arrayOfByte);
    return localByteStringMicro;
  }
  
  public static ByteStringMicro copyFrom(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return copyFrom(paramArrayOfByte, 0, i);
  }
  
  public static ByteStringMicro copyFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    ByteStringMicro localByteStringMicro = new com/vvt/qq/internal/pb/ByteStringMicro;
    arrayOfByte = (byte[])arrayOfByte;
    localByteStringMicro.<init>(arrayOfByte);
    return localByteStringMicro;
  }
  
  public static ByteStringMicro copyFromUtf8(String paramString)
  {
    try
    {
      ByteStringMicro localByteStringMicro = new com/vvt/qq/internal/pb/ByteStringMicro;
      Object localObject = "UTF-8";
      localObject = paramString.getBytes((String)localObject);
      localByteStringMicro.<init>((byte[])localObject);
      return localByteStringMicro;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("UTF-8 not supported?");
      throw localRuntimeException;
    }
  }
  
  public byte byteAt(int paramInt)
  {
    return this.bytes[paramInt];
  }
  
  public void copyTo(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = this.bytes;
    int i = this.bytes.length;
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, i);
  }
  
  public void copyTo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.bytes, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    label108:
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ByteStringMicro;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ByteStringMicro)paramObject;
        int j = this.bytes.length;
        byte[] arrayOfByte1 = ((ByteStringMicro)paramObject).bytes;
        int i = arrayOfByte1.length;
        if (j != i)
        {
          bool1 = false;
        }
        else
        {
          byte[] arrayOfByte2 = this.bytes;
          byte[] arrayOfByte3 = ((ByteStringMicro)paramObject).bytes;
          i = 0;
          arrayOfByte1 = null;
          for (;;)
          {
            if (i >= j) {
              break label108;
            }
            int k = arrayOfByte2[i];
            int m = arrayOfByte3[i];
            if (k != m)
            {
              bool1 = false;
              break;
            }
            i += 1;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.hash;
    if (i == 0)
    {
      byte[] arrayOfByte = this.bytes;
      int j = this.bytes.length;
      int k = 0;
      int m;
      for (i = j; k < j; i = m)
      {
        m = arrayOfByte[k];
        i *= 31;
        m += i;
        k += 1;
      }
      if (i == 0) {
        i = 1;
      }
      this.hash = i;
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    byte[] arrayOfByte = this.bytes;
    int i = arrayOfByte.length;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfByte = null;
    }
  }
  
  public int size()
  {
    return this.bytes.length;
  }
  
  public byte[] toByteArray()
  {
    int i = this.bytes.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.bytes, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public String toString(String paramString)
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = this.bytes;
    str.<init>(arrayOfByte, paramString);
    return str;
  }
  
  public String toStringUtf8()
  {
    try
    {
      String str1 = new java/lang/String;
      byte[] arrayOfByte = this.bytes;
      String str2 = "UTF-8";
      str1.<init>(arrayOfByte, str2);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("UTF-8 not supported?");
      throw localRuntimeException;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/ByteStringMicro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */