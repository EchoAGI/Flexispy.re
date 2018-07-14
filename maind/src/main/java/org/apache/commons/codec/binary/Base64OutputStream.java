package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class Base64OutputStream
  extends FilterOutputStream
{
  private final Base64 base64;
  private final boolean doEncode;
  private final byte[] singleByte;
  
  public Base64OutputStream(OutputStream paramOutputStream)
  {
    this(paramOutputStream, true);
  }
  
  public Base64OutputStream(OutputStream paramOutputStream, boolean paramBoolean)
  {
    super(paramOutputStream);
    Object localObject = new byte[1];
    this.singleByte = ((byte[])localObject);
    this.doEncode = paramBoolean;
    localObject = new org/apache/commons/codec/binary/Base64;
    ((Base64)localObject).<init>();
    this.base64 = ((Base64)localObject);
  }
  
  public Base64OutputStream(OutputStream paramOutputStream, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    super(paramOutputStream);
    Object localObject = new byte[1];
    this.singleByte = ((byte[])localObject);
    this.doEncode = paramBoolean;
    localObject = new org/apache/commons/codec/binary/Base64;
    ((Base64)localObject).<init>(paramInt, paramArrayOfByte);
    this.base64 = ((Base64)localObject);
  }
  
  private void flush(boolean paramBoolean)
  {
    Object localObject = this.base64;
    int i = ((Base64)localObject).avail();
    if (i > 0)
    {
      byte[] arrayOfByte = new byte[i];
      localObject = this.base64;
      int j = ((Base64)localObject).readResults(arrayOfByte, 0, i);
      if (j > 0)
      {
        localObject = this.out;
        ((OutputStream)localObject).write(arrayOfByte, 0, j);
      }
    }
    if (paramBoolean)
    {
      localObject = this.out;
      ((OutputStream)localObject).flush();
    }
  }
  
  public void close()
  {
    int i = -1;
    boolean bool = this.doEncode;
    Base64 localBase64;
    byte[] arrayOfByte;
    if (bool)
    {
      localBase64 = this.base64;
      arrayOfByte = this.singleByte;
      localBase64.encode(arrayOfByte, 0, i);
    }
    for (;;)
    {
      flush();
      this.out.close();
      return;
      localBase64 = this.base64;
      arrayOfByte = this.singleByte;
      localBase64.decode(arrayOfByte, 0, i);
    }
  }
  
  public void flush()
  {
    flush(true);
  }
  
  public void write(int paramInt)
  {
    byte[] arrayOfByte = this.singleByte;
    int i = (byte)paramInt;
    arrayOfByte[0] = i;
    arrayOfByte = this.singleByte;
    write(arrayOfByte, 0, 1);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject;
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
      int j = paramArrayOfByte.length;
      if (i <= j) {}
    }
    else
    {
      localObject = new java/lang/IndexOutOfBoundsException;
      ((IndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    boolean bool;
    if (paramInt2 > 0)
    {
      bool = this.doEncode;
      if (!bool) {
        break label118;
      }
      localObject = this.base64;
      ((Base64)localObject).encode(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      bool = false;
      localObject = null;
      flush(false);
      return;
      label118:
      localObject = this.base64;
      ((Base64)localObject).decode(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/binary/Base64OutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */