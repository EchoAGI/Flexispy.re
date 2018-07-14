package com.vvt.capture.telegram.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SerializedData
  extends AbstractSerializedData
{
  private DataInputStream in;
  private ByteArrayInputStream inbuf;
  protected boolean isOut;
  private boolean justCalc;
  private int len;
  private DataOutputStream out;
  private ByteArrayOutputStream outbuf;
  
  public SerializedData()
  {
    this.isOut = true;
    this.justCalc = false;
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>();
    this.outbuf = ((ByteArrayOutputStream)localObject);
    localObject = new java/io/DataOutputStream;
    ByteArrayOutputStream localByteArrayOutputStream = this.outbuf;
    ((DataOutputStream)localObject).<init>(localByteArrayOutputStream);
    this.out = ((DataOutputStream)localObject);
  }
  
  public SerializedData(int paramInt)
  {
    this.isOut = true;
    this.justCalc = false;
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>(paramInt);
    this.outbuf = ((ByteArrayOutputStream)localObject);
    localObject = new java/io/DataOutputStream;
    ByteArrayOutputStream localByteArrayOutputStream = this.outbuf;
    ((DataOutputStream)localObject).<init>(localByteArrayOutputStream);
    this.out = ((DataOutputStream)localObject);
  }
  
  public SerializedData(File paramFile)
  {
    this.isOut = true;
    this.justCalc = false;
    Object localObject1 = new java/io/FileInputStream;
    ((FileInputStream)localObject1).<init>(paramFile);
    Object localObject2 = new byte[(int)paramFile.length()];
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>((InputStream)localObject1);
    localDataInputStream.readFully((byte[])localObject2);
    ((FileInputStream)localObject1).close();
    this.isOut = false;
    localObject1 = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject1).<init>((byte[])localObject2);
    this.inbuf = ((ByteArrayInputStream)localObject1);
    localObject1 = new java/io/DataInputStream;
    localObject2 = this.inbuf;
    ((DataInputStream)localObject1).<init>((InputStream)localObject2);
    this.in = ((DataInputStream)localObject1);
  }
  
  public SerializedData(boolean paramBoolean)
  {
    boolean bool = true;
    this.isOut = bool;
    this.justCalc = false;
    if (!paramBoolean)
    {
      Object localObject = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject).<init>();
      this.outbuf = ((ByteArrayOutputStream)localObject);
      localObject = new java/io/DataOutputStream;
      ByteArrayOutputStream localByteArrayOutputStream = this.outbuf;
      ((DataOutputStream)localObject).<init>(localByteArrayOutputStream);
      this.out = ((DataOutputStream)localObject);
    }
    this.justCalc = paramBoolean;
    this.len = 0;
  }
  
  public SerializedData(byte[] paramArrayOfByte)
  {
    this.isOut = true;
    this.justCalc = false;
    this.isOut = false;
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    this.inbuf = ((ByteArrayInputStream)localObject);
    localObject = new java/io/DataInputStream;
    ByteArrayInputStream localByteArrayInputStream = this.inbuf;
    ((DataInputStream)localObject).<init>(localByteArrayInputStream);
    this.in = ((DataInputStream)localObject);
    this.len = 0;
  }
  
  private void writeInt32(int paramInt, DataOutputStream paramDataOutputStream)
  {
    int i = 0;
    for (;;)
    {
      int j = 4;
      if (i < j)
      {
        j = i * 8;
        j = paramInt >> j;
        try
        {
          paramDataOutputStream.write(j);
          i += 1;
        }
        catch (Exception localException) {}
      }
    }
  }
  
  private void writeInt64(long paramLong, DataOutputStream paramDataOutputStream)
  {
    int i = 0;
    for (;;)
    {
      int j = 8;
      if (i < j)
      {
        j = i * 8;
        long l = paramLong >> j;
        j = (int)l;
        try
        {
          paramDataOutputStream.write(j);
          i += 1;
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void cleanup()
  {
    for (;;)
    {
      try
      {
        localObject = this.inbuf;
        if (localObject != null)
        {
          localObject = this.inbuf;
          ((ByteArrayInputStream)localObject).close();
          localObject = null;
          this.inbuf = null;
        }
      }
      catch (Exception localException4)
      {
        Object localObject;
        continue;
      }
      try
      {
        localObject = this.in;
        if (localObject != null)
        {
          localObject = this.in;
          ((DataInputStream)localObject).close();
          localObject = null;
          this.in = null;
        }
      }
      catch (Exception localException3)
      {
        continue;
      }
      try
      {
        localObject = this.outbuf;
        if (localObject != null)
        {
          localObject = this.outbuf;
          ((ByteArrayOutputStream)localObject).close();
          localObject = null;
          this.outbuf = null;
        }
      }
      catch (Exception localException2)
      {
        continue;
      }
      try
      {
        localObject = this.out;
        if (localObject != null)
        {
          localObject = this.out;
          ((DataOutputStream)localObject).close();
          localObject = null;
          this.out = null;
        }
        return;
      }
      catch (Exception localException1) {}
    }
  }
  
  public int getPosition()
  {
    return this.len;
  }
  
  public int length()
  {
    boolean bool = this.justCalc;
    Object localObject;
    int i;
    if (!bool)
    {
      bool = this.isOut;
      if (bool)
      {
        localObject = this.outbuf;
        i = ((ByteArrayOutputStream)localObject).size();
      }
    }
    for (;;)
    {
      return i;
      localObject = this.inbuf;
      i = ((ByteArrayInputStream)localObject).available();
      continue;
      i = this.len;
    }
  }
  
  public boolean readBool(boolean paramBoolean)
  {
    boolean bool = false;
    RuntimeException localRuntimeException = null;
    int i = readInt32(paramBoolean);
    int j = -1720552011;
    if (i == j) {
      bool = true;
    }
    do
    {
      return bool;
      j = -1132882121;
    } while ((i == j) || (!paramBoolean));
    localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("Not bool value!");
    throw localRuntimeException;
  }
  
  public byte[] readByteArray(boolean paramBoolean)
  {
    int i = 1;
    for (;;)
    {
      try
      {
        Object localObject1 = this.in;
        int j = ((DataInputStream)localObject1).read();
        int k = this.len + 1;
        this.len = k;
        k = 254;
        Object localObject2;
        if (j >= k)
        {
          localObject1 = this.in;
          j = ((DataInputStream)localObject1).read();
          localObject2 = this.in;
          i = ((DataInputStream)localObject2).read() << 8;
          j |= i;
          localObject2 = this.in;
          i = ((DataInputStream)localObject2).read() << 16;
          j |= i;
          i = this.len + 3;
          this.len = i;
          i = 4;
          k = j;
          localObject1 = new byte[k];
          DataInputStream localDataInputStream = this.in;
          localDataInputStream.read((byte[])localObject1);
          int m = this.len + 1;
          this.len = m;
          m = k + i;
          m %= 4;
          if (m != 0)
          {
            localDataInputStream = this.in;
            localDataInputStream.read();
            m = this.len + 1;
            this.len = m;
            i += 1;
            continue;
          }
        }
        byte[] arrayOfByte;
        k = j;
      }
      catch (Exception localException)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>("read byte array error", localException);
          throw ((Throwable)localObject2);
        }
        j = 0;
        arrayOfByte = null;
        return arrayOfByte;
      }
    }
  }
  
  public NativeByteBuffer readByteBuffer(boolean paramBoolean)
  {
    return null;
  }
  
  public void readBytes(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      DataInputStream localDataInputStream = this.in;
      localDataInputStream.read(paramArrayOfByte);
      int i = this.len;
      int j = paramArrayOfByte.length;
      i += j;
      this.len = i;
      return;
    }
    catch (Exception localException)
    {
      while (!paramBoolean) {}
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("read bytes error", localException);
      throw localRuntimeException;
    }
  }
  
  public byte[] readData(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[paramInt];
    readBytes(arrayOfByte, paramBoolean);
    return arrayOfByte;
  }
  
  public double readDouble(boolean paramBoolean)
  {
    try
    {
      l = readInt64(paramBoolean);
      d = Double.longBitsToDouble(l);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (paramBoolean)
        {
          RuntimeException localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("read double error", localException);
          throw localRuntimeException;
        }
        long l = 0L;
        double d = 0.0D;
      }
    }
    return d;
  }
  
  public int readInt32(boolean paramBoolean)
  {
    int i = 0;
    localRuntimeException = null;
    int j = 0;
    int k = 0;
    Object localObject = null;
    for (;;)
    {
      int m = 4;
      if (j < m) {}
      try
      {
        DataInputStream localDataInputStream = this.in;
        m = localDataInputStream.read();
        int n = j * 8;
        m = m << n | k;
        k = this.len + 1;
        this.len = k;
        j += 1;
        k = m;
      }
      catch (Exception localException)
      {
        while (!paramBoolean) {}
        localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("read int32 error", localException);
        throw localRuntimeException;
      }
    }
    i = k;
    return i;
  }
  
  public long readInt64(boolean paramBoolean)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject = null;
    int j = 0;
    long l2 = l1;
    for (;;)
    {
      int k = 8;
      if (j < k) {}
      try
      {
        DataInputStream localDataInputStream = this.in;
        k = localDataInputStream.read();
        long l3 = k;
        int m = j * 8;
        l3 = l3 << m | l2;
        i = this.len + 1;
        this.len = i;
        i = j + 1;
        j = i;
        l2 = l3;
      }
      catch (Exception localException)
      {
        while (!paramBoolean) {}
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("read int64 error", localException);
        throw localRuntimeException;
      }
    }
    l1 = l2;
    return l1;
  }
  
  public String readString(boolean paramBoolean)
  {
    i = 1;
    try
    {
      localObject1 = this.in;
      j = ((DataInputStream)localObject1).read();
      int k = this.len + 1;
      this.len = k;
      k = 254;
      if (j < k) {
        break label246;
      }
      localObject1 = this.in;
      j = ((DataInputStream)localObject1).read();
      localObject3 = this.in;
      i = ((DataInputStream)localObject3).read() << 8;
      j |= i;
      localObject3 = this.in;
      i = ((DataInputStream)localObject3).read() << 16;
      j |= i;
      i = this.len + 3;
      this.len = i;
      m = j;
      j = 4;
      i = m;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3;
        byte[] arrayOfByte;
        DataInputStream localDataInputStream;
        int n;
        if (paramBoolean)
        {
          localObject3 = new java/lang/RuntimeException;
          ((RuntimeException)localObject3).<init>("read string error", localException);
          throw ((Throwable)localObject3);
        }
        int j = 0;
        Object localObject2 = null;
        continue;
        int m = j;
        j = i;
        i = m;
      }
    }
    arrayOfByte = new byte[i];
    localDataInputStream = this.in;
    localDataInputStream.read(arrayOfByte);
    n = this.len + 1;
    this.len = n;
    for (;;)
    {
      n = i + j;
      n %= 4;
      if (n == 0) {
        break;
      }
      localDataInputStream = this.in;
      localDataInputStream.read();
      n = this.len + 1;
      this.len = n;
      j += 1;
    }
    localObject1 = new java/lang/String;
    localObject3 = "UTF-8";
    ((String)localObject1).<init>(arrayOfByte, (String)localObject3);
    return (String)localObject1;
  }
  
  protected void set(byte[] paramArrayOfByte)
  {
    this.isOut = false;
    Object localObject = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject).<init>(paramArrayOfByte);
    this.inbuf = ((ByteArrayInputStream)localObject);
    localObject = new java/io/DataInputStream;
    ByteArrayInputStream localByteArrayInputStream = this.inbuf;
    ((DataInputStream)localObject).<init>(localByteArrayInputStream);
    this.in = ((DataInputStream)localObject);
  }
  
  public void skip(int paramInt)
  {
    if (paramInt == 0) {}
    for (;;)
    {
      return;
      boolean bool = this.justCalc;
      if (!bool)
      {
        DataInputStream localDataInputStream = this.in;
        if (localDataInputStream != null) {
          try
          {
            localDataInputStream = this.in;
            localDataInputStream.skipBytes(paramInt);
          }
          catch (Exception localException) {}
        }
      }
      else
      {
        int i = this.len + paramInt;
        this.len = i;
      }
    }
  }
  
  public byte[] toByteArray()
  {
    return this.outbuf.toByteArray();
  }
  
  public void writeBool(boolean paramBoolean)
  {
    boolean bool = this.justCalc;
    int i;
    if (!bool) {
      if (paramBoolean)
      {
        i = -1720552011;
        writeInt32(i);
      }
    }
    for (;;)
    {
      return;
      i = -1132882121;
      writeInt32(i);
      continue;
      i = this.len + 4;
      this.len = i;
    }
  }
  
  public void writeByte(byte paramByte)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          DataOutputStream localDataOutputStream = this.out;
          localDataOutputStream.writeByte(paramByte);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      i = this.len + 1;
      this.len = i;
    }
  }
  
  public void writeByte(int paramInt)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          DataOutputStream localDataOutputStream = this.out;
          int j = (byte)paramInt;
          localDataOutputStream.writeByte(j);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      i = this.len + 1;
      this.len = i;
    }
  }
  
  public void writeByteArray(byte[] paramArrayOfByte)
  {
    int i = 253;
    for (;;)
    {
      try
      {
        int j = paramArrayOfByte.length;
        if (j <= i)
        {
          boolean bool1 = this.justCalc;
          int k;
          if (!bool1)
          {
            DataOutputStream localDataOutputStream1 = this.out;
            int n = paramArrayOfByte.length;
            localDataOutputStream1.write(n);
            bool1 = this.justCalc;
            if (bool1) {
              break label238;
            }
            localDataOutputStream1 = this.out;
            localDataOutputStream1.write(paramArrayOfByte);
            k = paramArrayOfByte.length;
            if (k > i) {
              break label260;
            }
            k = 1;
            n = paramArrayOfByte.length + k;
            n %= 4;
            if (n != 0)
            {
              boolean bool3 = this.justCalc;
              if (bool3) {
                break label265;
              }
              DataOutputStream localDataOutputStream3 = this.out;
              i = 0;
              localDataOutputStream3.write(0);
              k += 1;
              continue;
            }
          }
          else
          {
            k = this.len + 1;
            this.len = k;
            continue;
          }
          return;
        }
      }
      catch (Exception localException) {}
      boolean bool2 = this.justCalc;
      int i1;
      if (!bool2)
      {
        DataOutputStream localDataOutputStream2 = this.out;
        i1 = 254;
        localDataOutputStream2.write(i1);
        localDataOutputStream2 = this.out;
        i1 = paramArrayOfByte.length;
        localDataOutputStream2.write(i1);
        localDataOutputStream2 = this.out;
        i1 = paramArrayOfByte.length >> 8;
        localDataOutputStream2.write(i1);
        localDataOutputStream2 = this.out;
        i1 = paramArrayOfByte.length >> 16;
        localDataOutputStream2.write(i1);
      }
      else
      {
        int m = this.len + 4;
        this.len = m;
        continue;
        label238:
        m = this.len;
        i1 = paramArrayOfByte.length;
        m += i1;
        this.len = m;
        continue;
        label260:
        m = 4;
        continue;
        label265:
        i1 = this.len + 1;
        this.len = i1;
      }
    }
  }
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 253;
    if (paramInt2 <= i) {}
    for (;;)
    {
      try
      {
        int j = this.justCalc;
        if (j == 0)
        {
          DataOutputStream localDataOutputStream1 = this.out;
          localDataOutputStream1.write(paramInt2);
          j = this.justCalc;
          if (j != 0) {
            break label239;
          }
          localDataOutputStream1 = this.out;
          localDataOutputStream1.write(paramArrayOfByte, paramInt1, paramInt2);
          if (paramInt2 > i) {
            break label256;
          }
          j = 1;
          int m = paramInt2 + j;
          m %= 4;
          if (m != 0)
          {
            boolean bool2 = this.justCalc;
            if (bool2) {
              break label262;
            }
            DataOutputStream localDataOutputStream3 = this.out;
            i = 0;
            localDataOutputStream3.write(0);
            j += 1;
            continue;
          }
        }
        else
        {
          j = this.len + 1;
          this.len = j;
          continue;
        }
        return;
      }
      catch (Exception localException) {}
      boolean bool1 = this.justCalc;
      int n;
      if (!bool1)
      {
        DataOutputStream localDataOutputStream2 = this.out;
        n = 254;
        localDataOutputStream2.write(n);
        localDataOutputStream2 = this.out;
        localDataOutputStream2.write(paramInt2);
        localDataOutputStream2 = this.out;
        n = paramInt2 >> 8;
        localDataOutputStream2.write(n);
        localDataOutputStream2 = this.out;
        n = paramInt2 >> 16;
        localDataOutputStream2.write(n);
      }
      else
      {
        int k = this.len + 4;
        this.len = k;
        continue;
        label239:
        k = this.len + paramInt2;
        this.len = k;
        continue;
        label256:
        k = 4;
        continue;
        label262:
        n = this.len + 1;
        this.len = n;
      }
    }
  }
  
  public void writeByteBuffer(NativeByteBuffer paramNativeByteBuffer) {}
  
  public void writeBytes(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          DataOutputStream localDataOutputStream = this.out;
          localDataOutputStream.write(paramArrayOfByte);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        int j;
        continue;
      }
      i = this.len;
      j = paramArrayOfByte.length;
      i += j;
      this.len = i;
    }
  }
  
  public void writeBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          DataOutputStream localDataOutputStream = this.out;
          localDataOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      i = this.len + paramInt2;
      this.len = i;
    }
  }
  
  public void writeDouble(double paramDouble)
  {
    try
    {
      long l = Double.doubleToRawLongBits(paramDouble);
      writeInt64(l);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void writeInt32(int paramInt)
  {
    boolean bool = this.justCalc;
    if (!bool)
    {
      DataOutputStream localDataOutputStream = this.out;
      writeInt32(paramInt, localDataOutputStream);
    }
    for (;;)
    {
      return;
      int i = this.len + 4;
      this.len = i;
    }
  }
  
  public void writeInt64(long paramLong)
  {
    boolean bool = this.justCalc;
    if (!bool)
    {
      DataOutputStream localDataOutputStream = this.out;
      writeInt64(paramLong, localDataOutputStream);
    }
    for (;;)
    {
      return;
      int i = this.len + 8;
      this.len = i;
    }
  }
  
  public void writeString(String paramString)
  {
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
      writeByteArray((byte[])localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/SerializedData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */