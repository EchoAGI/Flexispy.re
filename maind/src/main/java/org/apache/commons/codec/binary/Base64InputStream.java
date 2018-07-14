package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.InputStream;

public class Base64InputStream
  extends FilterInputStream
{
  private final Base64 base64;
  private final boolean doEncode;
  private final byte[] singleByte;
  
  public Base64InputStream(InputStream paramInputStream)
  {
    this(paramInputStream, false);
  }
  
  public Base64InputStream(InputStream paramInputStream, boolean paramBoolean)
  {
    super(paramInputStream);
    Object localObject = new byte[1];
    this.singleByte = ((byte[])localObject);
    this.doEncode = paramBoolean;
    localObject = new org/apache/commons/codec/binary/Base64;
    ((Base64)localObject).<init>();
    this.base64 = ((Base64)localObject);
  }
  
  public Base64InputStream(InputStream paramInputStream, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    super(paramInputStream);
    Object localObject = new byte[1];
    this.singleByte = ((byte[])localObject);
    this.doEncode = paramBoolean;
    localObject = new org/apache/commons/codec/binary/Base64;
    ((Base64)localObject).<init>(paramInt, paramArrayOfByte);
    this.base64 = ((Base64)localObject);
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
  {
    int i = 1;
    byte[] arrayOfByte = this.singleByte;
    for (int j = read(arrayOfByte, 0, i); j == 0; j = read(arrayOfByte, 0, i)) {
      arrayOfByte = this.singleByte;
    }
    int k;
    if (j > 0)
    {
      arrayOfByte = this.singleByte;
      k = arrayOfByte[0];
      if (k < 0)
      {
        arrayOfByte = this.singleByte;
        k = arrayOfByte[0] + 256;
      }
    }
    for (;;)
    {
      return k;
      arrayOfByte = this.singleByte;
      k = arrayOfByte[0];
      continue;
      k = -1;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      localObject = new java/lang/IndexOutOfBoundsException;
      ((IndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = paramArrayOfByte.length;
    if (paramInt1 <= i)
    {
      i = paramInt1 + paramInt2;
      int m = paramArrayOfByte.length;
      if (i <= m) {}
    }
    else
    {
      localObject = new java/lang/IndexOutOfBoundsException;
      ((IndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    if (paramInt2 == 0)
    {
      i = 0;
      localObject = null;
      return i;
    }
    Object localObject = this.base64;
    boolean bool1 = ((Base64)localObject).hasData();
    label124:
    byte[] arrayOfByte;
    int n;
    if (!bool1)
    {
      bool1 = this.doEncode;
      if (!bool1) {
        break label220;
      }
      int j = 4096;
      arrayOfByte = new byte[j];
      localObject = this.in;
      n = ((InputStream)localObject).read(arrayOfByte);
      if (n > 0)
      {
        j = paramArrayOfByte.length;
        if (j == paramInt2)
        {
          localObject = this.base64;
          ((Base64)localObject).setInitialBuffer(paramArrayOfByte, paramInt1, paramInt2);
        }
      }
      boolean bool2 = this.doEncode;
      if (!bool2) {
        break label228;
      }
      localObject = this.base64;
      ((Base64)localObject).encode(arrayOfByte, 0, n);
    }
    for (;;)
    {
      localObject = this.base64;
      int k = ((Base64)localObject).readResults(paramArrayOfByte, paramInt1, paramInt2);
      break;
      label220:
      k = 8192;
      break label124;
      label228:
      localObject = this.base64;
      ((Base64)localObject).decode(arrayOfByte, 0, n);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/Base64InputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */