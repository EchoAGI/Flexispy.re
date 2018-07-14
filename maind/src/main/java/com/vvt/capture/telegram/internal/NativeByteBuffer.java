package com.vvt.capture.telegram.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NativeByteBuffer
  extends AbstractSerializedData
{
  private static final ThreadLocal addressWrapper;
  protected int address;
  public ByteBuffer buffer;
  private boolean justCalc = false;
  private int len = 0;
  
  static
  {
    NativeByteBuffer.1 local1 = new com/vvt/capture/telegram/internal/NativeByteBuffer$1;
    local1.<init>();
    addressWrapper = local1;
  }
  
  public NativeByteBuffer(int paramInt)
  {
    int i = native_getFreeBuffer(paramInt);
    this.address = i;
    i = this.address;
    if (i != 0)
    {
      i = this.address;
      ByteBuffer localByteBuffer = native_getJavaByteBuffer(i);
      this.buffer = localByteBuffer;
      this.buffer.position(0);
      this.buffer.limit(paramInt);
      localByteBuffer = this.buffer;
      localByteOrder = ByteOrder.LITTLE_ENDIAN;
      localByteBuffer.order(localByteOrder);
    }
  }
  
  private NativeByteBuffer(int paramInt, boolean paramBoolean) {}
  
  public NativeByteBuffer(boolean paramBoolean)
  {
    this.justCalc = paramBoolean;
  }
  
  public static native int native_getFreeBuffer(int paramInt);
  
  public static native ByteBuffer native_getJavaByteBuffer(int paramInt);
  
  public static native int native_limit(int paramInt);
  
  public static native int native_position(int paramInt);
  
  public static native void native_reuse(int paramInt);
  
  public static NativeByteBuffer wrap(int paramInt)
  {
    NativeByteBuffer localNativeByteBuffer = (NativeByteBuffer)addressWrapper.get();
    if (paramInt != 0)
    {
      localNativeByteBuffer.address = paramInt;
      ByteBuffer localByteBuffer = native_getJavaByteBuffer(paramInt);
      localNativeByteBuffer.buffer = localByteBuffer;
      localByteBuffer = localNativeByteBuffer.buffer;
      int i = native_limit(paramInt);
      localByteBuffer.limit(i);
      int j = native_position(paramInt);
      Object localObject = localNativeByteBuffer.buffer;
      i = ((ByteBuffer)localObject).limit();
      if (j <= i)
      {
        localObject = localNativeByteBuffer.buffer;
        ((ByteBuffer)localObject).position(j);
      }
      localByteBuffer = localNativeByteBuffer.buffer;
      localObject = ByteOrder.LITTLE_ENDIAN;
      localByteBuffer.order((ByteOrder)localObject);
    }
    return localNativeByteBuffer;
  }
  
  public int capacity()
  {
    return this.buffer.capacity();
  }
  
  public void compact()
  {
    this.buffer.compact();
  }
  
  public int getIntFromByte(byte paramByte)
  {
    if (paramByte >= 0) {}
    for (;;)
    {
      return paramByte;
      paramByte += 256;
    }
  }
  
  public int getPosition()
  {
    return this.buffer.position();
  }
  
  public boolean hasRemaining()
  {
    return this.buffer.hasRemaining();
  }
  
  public int length()
  {
    boolean bool = this.justCalc;
    ByteBuffer localByteBuffer;
    if (!bool) {
      localByteBuffer = this.buffer;
    }
    for (int i = localByteBuffer.position();; i = this.len) {
      return i;
    }
  }
  
  public int limit()
  {
    return this.buffer.limit();
  }
  
  public void limit(int paramInt)
  {
    this.buffer.limit(paramInt);
  }
  
  public int position()
  {
    return this.buffer.position();
  }
  
  public void position(int paramInt)
  {
    this.buffer.position(paramInt);
  }
  
  public void put(ByteBuffer paramByteBuffer)
  {
    this.buffer.put(paramByteBuffer);
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
    byte b1 = 1;
    for (;;)
    {
      try
      {
        Object localObject1 = this.buffer;
        byte b2 = ((ByteBuffer)localObject1).get();
        int k = getIntFromByte(b2);
        int i1 = 254;
        Object localObject2;
        if (k >= i1)
        {
          localObject1 = this.buffer;
          k = ((ByteBuffer)localObject1).get();
          int m = getIntFromByte(k);
          localObject2 = this.buffer;
          b1 = ((ByteBuffer)localObject2).get();
          int i = getIntFromByte(b1) << 8;
          m |= i;
          localObject2 = this.buffer;
          i = ((ByteBuffer)localObject2).get();
          int j = getIntFromByte(i) << 16;
          m |= j;
          j = 4;
          i1 = m;
          localObject1 = new byte[i1];
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.get((byte[])localObject1);
          int i2 = i1 + j;
          i2 %= 4;
          if (i2 != 0)
          {
            localByteBuffer = this.buffer;
            localByteBuffer.get();
            j += 1;
            continue;
          }
        }
        int n;
        byte[] arrayOfByte;
        i1 = n;
      }
      catch (Exception localException)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>("read byte array error", localException);
          throw ((Throwable)localObject2);
        }
        n = 0;
        arrayOfByte = null;
        return arrayOfByte;
      }
    }
  }
  
  public NativeByteBuffer readByteBuffer(boolean paramBoolean)
  {
    byte b1 = 1;
    for (;;)
    {
      try
      {
        Object localObject1 = this.buffer;
        byte b2 = ((ByteBuffer)localObject1).get();
        int k = getIntFromByte(b2);
        int i1 = 254;
        Object localObject2;
        if (k >= i1)
        {
          localObject1 = this.buffer;
          k = ((ByteBuffer)localObject1).get();
          int m = getIntFromByte(k);
          localObject2 = this.buffer;
          b1 = ((ByteBuffer)localObject2).get();
          int i = getIntFromByte(b1) << 8;
          m |= i;
          localObject2 = this.buffer;
          i = ((ByteBuffer)localObject2).get();
          int j = getIntFromByte(i) << 16;
          m |= j;
          j = 4;
          i1 = m;
          localObject1 = new com/vvt/capture/telegram/internal/NativeByteBuffer;
          ((NativeByteBuffer)localObject1).<init>(i1);
          ByteBuffer localByteBuffer1 = this.buffer;
          int i2 = localByteBuffer1.limit();
          ByteBuffer localByteBuffer2 = this.buffer;
          ByteBuffer localByteBuffer3 = this.buffer;
          int i3 = localByteBuffer3.position() + i1;
          localByteBuffer2.limit(i3);
          localByteBuffer2 = ((NativeByteBuffer)localObject1).buffer;
          localByteBuffer3 = this.buffer;
          localByteBuffer2.put(localByteBuffer3);
          localByteBuffer2 = this.buffer;
          localByteBuffer2.limit(i2);
          localByteBuffer1 = ((NativeByteBuffer)localObject1).buffer;
          localByteBuffer2 = null;
          localByteBuffer1.position(0);
          i2 = i1 + j;
          i2 %= 4;
          if (i2 != 0)
          {
            localByteBuffer1 = this.buffer;
            localByteBuffer1.get();
            j += 1;
            continue;
          }
        }
        int n;
        NativeByteBuffer localNativeByteBuffer;
        i1 = n;
      }
      catch (Exception localException)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>("read byte array error", localException);
          throw ((Throwable)localObject2);
        }
        n = 0;
        localNativeByteBuffer = null;
        return localNativeByteBuffer;
      }
    }
  }
  
  public void readBytes(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      ByteBuffer localByteBuffer = this.buffer;
      localByteBuffer.get(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      while (!paramBoolean) {}
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("read raw error", localException);
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
    try
    {
      ByteBuffer localByteBuffer = this.buffer;
      i = localByteBuffer.getInt();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (paramBoolean)
        {
          RuntimeException localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("read int32 error", localException);
          throw localRuntimeException;
        }
        int i = 0;
        Object localObject = null;
      }
    }
    return i;
  }
  
  public long readInt64(boolean paramBoolean)
  {
    try
    {
      ByteBuffer localByteBuffer = this.buffer;
      l = localByteBuffer.getLong();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (paramBoolean)
        {
          RuntimeException localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("read int64 error", localException);
          throw localRuntimeException;
        }
        long l = 0L;
      }
    }
    return l;
  }
  
  public String readString(boolean paramBoolean)
  {
    byte b1 = 1;
    try
    {
      localObject1 = this.buffer;
      byte b2 = ((ByteBuffer)localObject1).get();
      int k = getIntFromByte(b2);
      int i2 = 254;
      if (k < i2) {
        break label220;
      }
      localObject1 = this.buffer;
      k = ((ByteBuffer)localObject1).get();
      int m = getIntFromByte(k);
      localObject3 = this.buffer;
      b1 = ((ByteBuffer)localObject3).get();
      int i = getIntFromByte(b1) << 8;
      m |= i;
      localObject3 = this.buffer;
      i = ((ByteBuffer)localObject3).get();
      j = getIntFromByte(i) << 16;
      m |= j;
      i3 = m;
      n = 4;
      j = i3;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3;
        int n;
        byte[] arrayOfByte;
        ByteBuffer localByteBuffer;
        if (paramBoolean)
        {
          localObject3 = new java/lang/RuntimeException;
          ((RuntimeException)localObject3).<init>("read string error", localException);
          throw ((Throwable)localObject3);
        }
        int i1 = 0;
        Object localObject2 = null;
        continue;
        int i3 = i1;
        i1 = j;
        int j = i3;
      }
    }
    arrayOfByte = new byte[j];
    localByteBuffer = this.buffer;
    localByteBuffer.get(arrayOfByte);
    for (;;)
    {
      int i4 = j + n;
      i4 %= 4;
      if (i4 == 0) {
        break;
      }
      localByteBuffer = this.buffer;
      localByteBuffer.get();
      n += 1;
    }
    localObject1 = new java/lang/String;
    localObject3 = "UTF-8";
    ((String)localObject1).<init>(arrayOfByte, (String)localObject3);
    return (String)localObject1;
  }
  
  public void reuse()
  {
    int i = this.address;
    if (i != 0)
    {
      i = this.address;
      native_reuse(i);
    }
  }
  
  public void rewind()
  {
    boolean bool = this.justCalc;
    ByteBuffer localByteBuffer;
    if (bool)
    {
      bool = false;
      localByteBuffer = null;
      this.len = 0;
    }
    for (;;)
    {
      return;
      localByteBuffer = this.buffer;
      localByteBuffer.rewind();
    }
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
        ByteBuffer localByteBuffer1 = this.buffer;
        ByteBuffer localByteBuffer2 = this.buffer;
        int j = localByteBuffer2.position() + paramInt;
        localByteBuffer1.position(j);
      }
      else
      {
        int i = this.len + paramInt;
        this.len = i;
      }
    }
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
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.put(paramByte);
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
    byte b = (byte)paramInt;
    writeByte(b);
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
            ByteBuffer localByteBuffer1 = this.buffer;
            byte b1 = (byte)paramArrayOfByte.length;
            localByteBuffer1.put(b1);
            bool1 = this.justCalc;
            if (bool1) {
              break label248;
            }
            localByteBuffer1 = this.buffer;
            localByteBuffer1.put(paramArrayOfByte);
            k = paramArrayOfByte.length;
            if (k > i) {
              break label270;
            }
            k = 1;
            int n = paramArrayOfByte.length + k;
            n %= 4;
            if (n != 0)
            {
              boolean bool3 = this.justCalc;
              if (bool3) {
                break label275;
              }
              ByteBuffer localByteBuffer3 = this.buffer;
              i = 0;
              localByteBuffer3.put((byte)0);
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
      if (!bool2)
      {
        ByteBuffer localByteBuffer2 = this.buffer;
        byte b2 = -2;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)paramArrayOfByte.length;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(paramArrayOfByte.length >> 8);
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(paramArrayOfByte.length >> 16);
        localByteBuffer2.put(b2);
      }
      else
      {
        int m = this.len + 4;
        this.len = m;
        continue;
        label248:
        m = this.len;
        int i1 = paramArrayOfByte.length;
        m += i1;
        this.len = m;
        continue;
        label270:
        m = 4;
        continue;
        label275:
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
          ByteBuffer localByteBuffer1 = this.buffer;
          byte b1 = (byte)paramInt2;
          localByteBuffer1.put(b1);
          j = this.justCalc;
          if (j != 0) {
            break label257;
          }
          localByteBuffer1 = this.buffer;
          localByteBuffer1.put(paramArrayOfByte, paramInt1, paramInt2);
          if (paramInt2 > i) {
            break label274;
          }
          j = 1;
          int m = paramInt2 + j;
          m %= 4;
          if (m != 0)
          {
            boolean bool2 = this.justCalc;
            if (bool2) {
              break label280;
            }
            ByteBuffer localByteBuffer3 = this.buffer;
            i = 0;
            localByteBuffer3.put((byte)0);
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
      if (!bool1)
      {
        ByteBuffer localByteBuffer2 = this.buffer;
        byte b2 = -2;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)paramInt2;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(paramInt2 >> 8);
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(paramInt2 >> 16);
        localByteBuffer2.put(b2);
      }
      else
      {
        int k = this.len + 4;
        this.len = k;
        continue;
        label257:
        k = this.len + paramInt2;
        this.len = k;
        continue;
        label274:
        k = 4;
        continue;
        label280:
        int n = this.len + 1;
        this.len = n;
      }
    }
  }
  
  public void writeByteBuffer(NativeByteBuffer paramNativeByteBuffer)
  {
    int i = 253;
    for (;;)
    {
      int j;
      try
      {
        j = paramNativeByteBuffer.limit();
        if (j <= i)
        {
          int k = this.justCalc;
          int m;
          if (k == 0)
          {
            ByteBuffer localByteBuffer1 = this.buffer;
            byte b1 = (byte)j;
            localByteBuffer1.put(b1);
            k = this.justCalc;
            if (k != 0) {
              break label267;
            }
            paramNativeByteBuffer.rewind();
            localByteBuffer1 = this.buffer;
            ByteBuffer localByteBuffer3 = paramNativeByteBuffer.buffer;
            localByteBuffer1.put(localByteBuffer3);
            if (j > i) {
              break label284;
            }
            k = 1;
            int i1 = j + k;
            i1 %= 4;
            if (i1 != 0)
            {
              boolean bool2 = this.justCalc;
              if (bool2) {
                break label290;
              }
              localByteBuffer3 = this.buffer;
              i = 0;
              localByteBuffer3.put((byte)0);
              k += 1;
              continue;
            }
          }
          else
          {
            m = this.len + 1;
            this.len = m;
            continue;
          }
          return;
        }
      }
      catch (Exception localException) {}
      boolean bool1 = this.justCalc;
      if (!bool1)
      {
        ByteBuffer localByteBuffer2 = this.buffer;
        byte b2 = -2;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)j;
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(j >> 8);
        localByteBuffer2.put(b2);
        localByteBuffer2 = this.buffer;
        b2 = (byte)(j >> 16);
        localByteBuffer2.put(b2);
      }
      else
      {
        int n = this.len + 4;
        this.len = n;
        continue;
        label267:
        n = this.len + j;
        this.len = n;
        continue;
        label284:
        n = 4;
        continue;
        label290:
        int i2 = this.len + 1;
        this.len = i2;
      }
    }
  }
  
  public void writeBytes(NativeByteBuffer paramNativeByteBuffer)
  {
    boolean bool = this.justCalc;
    if (bool)
    {
      int i = this.len;
      int j = paramNativeByteBuffer.limit();
      i += j;
      this.len = i;
    }
    for (;;)
    {
      return;
      paramNativeByteBuffer.rewind();
      ByteBuffer localByteBuffer1 = this.buffer;
      ByteBuffer localByteBuffer2 = paramNativeByteBuffer.buffer;
      localByteBuffer1.put(localByteBuffer2);
    }
  }
  
  public void writeBytes(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.put(paramArrayOfByte);
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
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
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
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.putInt(paramInt);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      i = this.len + 4;
      this.len = i;
    }
  }
  
  public void writeInt64(long paramLong)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.justCalc;
        if (!bool)
        {
          ByteBuffer localByteBuffer = this.buffer;
          localByteBuffer.putLong(paramLong);
          return;
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      i = this.len + 8;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/NativeByteBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */