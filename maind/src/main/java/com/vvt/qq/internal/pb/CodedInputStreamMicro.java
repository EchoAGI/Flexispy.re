package com.vvt.qq.internal.pb;

import java.io.InputStream;
import java.util.ArrayList;

public final class CodedInputStreamMicro
{
  private static final int BUFFER_SIZE = 4096;
  private static final int DEFAULT_RECURSION_LIMIT = 64;
  private static final int DEFAULT_SIZE_LIMIT = 67108864;
  private final byte[] buffer;
  private int bufferPos;
  private int bufferSize;
  private int bufferSizeAfterLimit;
  private int currentLimit = -1 >>> 1;
  private final InputStream input;
  private int lastTag;
  private int recursionDepth;
  private int recursionLimit = 64;
  private int sizeLimit = 67108864;
  private int totalBytesRetired;
  
  private CodedInputStreamMicro(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte['က'];
    this.buffer = arrayOfByte;
    this.bufferSize = 0;
    this.bufferPos = 0;
    this.input = paramInputStream;
  }
  
  private CodedInputStreamMicro(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    int i = paramInt1 + paramInt2;
    this.bufferSize = i;
    this.bufferPos = paramInt1;
    this.input = null;
  }
  
  public static int decodeZigZag32(int paramInt)
  {
    int i = paramInt >>> 1;
    int j = -(paramInt & 0x1);
    return i ^ j;
  }
  
  public static long decodeZigZag64(long paramLong)
  {
    long l1 = paramLong >>> 1;
    long l2 = -(1L & paramLong);
    return l1 ^ l2;
  }
  
  public static CodedInputStreamMicro newInstance(InputStream paramInputStream)
  {
    CodedInputStreamMicro localCodedInputStreamMicro = new com/vvt/qq/internal/pb/CodedInputStreamMicro;
    localCodedInputStreamMicro.<init>(paramInputStream);
    return localCodedInputStreamMicro;
  }
  
  public static CodedInputStreamMicro newInstance(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return newInstance(paramArrayOfByte, 0, i);
  }
  
  public static CodedInputStreamMicro newInstance(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    CodedInputStreamMicro localCodedInputStreamMicro = new com/vvt/qq/internal/pb/CodedInputStreamMicro;
    localCodedInputStreamMicro.<init>(paramArrayOfByte, paramInt1, paramInt2);
    return localCodedInputStreamMicro;
  }
  
  static int readRawVarint32(InputStream paramInputStream)
  {
    int i = 0;
    int j = -1;
    int k = 0;
    int m = 32;
    if (k < m)
    {
      m = paramInputStream.read();
      if (m == j) {
        throw InvalidProtocolBufferMicroException.truncatedMessage();
      }
      int n = (m & 0x7F) << k;
      i |= n;
      m &= 0x80;
      if (m != 0) {
        break label85;
      }
    }
    for (;;)
    {
      m = 64;
      if (k >= m) {
        break label116;
      }
      m = paramInputStream.read();
      if (m == j)
      {
        throw InvalidProtocolBufferMicroException.truncatedMessage();
        label85:
        k += 7;
        break;
      }
      m &= 0x80;
      if (m == 0) {
        return i;
      }
      k += 7;
    }
    label116:
    throw InvalidProtocolBufferMicroException.malformedVarint();
  }
  
  private void recomputeBufferSizeAfterLimit()
  {
    int i = this.bufferSize;
    int j = this.bufferSizeAfterLimit;
    i += j;
    this.bufferSize = i;
    i = this.totalBytesRetired;
    j = this.bufferSize;
    i += j;
    j = this.currentLimit;
    if (i > j)
    {
      j = this.currentLimit;
      i -= j;
      this.bufferSizeAfterLimit = i;
      i = this.bufferSize;
      j = this.bufferSizeAfterLimit;
      i -= j;
      this.bufferSize = i;
    }
    for (;;)
    {
      return;
      i = 0;
      this.bufferSizeAfterLimit = 0;
    }
  }
  
  private boolean refillBuffer(boolean paramBoolean)
  {
    int i = -1;
    int j = 0;
    int k = this.bufferPos;
    int n = this.bufferSize;
    Object localObject1;
    if (k < n)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("refillBuffer() called when buffer wasn't empty.");
      throw ((Throwable)localObject1);
    }
    k = this.totalBytesRetired;
    int i1 = this.bufferSize;
    k += i1;
    int i2 = this.currentLimit;
    if (k != i2)
    {
      k = this.totalBytesRetired;
      int i3 = this.bufferSize;
      k += i3;
      this.totalBytesRetired = k;
      this.bufferPos = 0;
      localObject1 = this.input;
      if (localObject1 == null) {}
      byte[] arrayOfByte;
      for (k = i;; k = ((InputStream)localObject1).read(arrayOfByte))
      {
        this.bufferSize = k;
        k = this.bufferSize;
        if (k != 0)
        {
          k = this.bufferSize;
          if (k >= i) {
            break;
          }
        }
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("InputStream#read(byte[]) returned invalid result: ");
        j = this.bufferSize;
        localObject2 = j + "\nThe InputStream implementation is buggy.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        localObject1 = this.input;
        arrayOfByte = this.buffer;
      }
      k = this.bufferSize;
      if (k == i)
      {
        this.bufferSize = 0;
        if (!paramBoolean)
        {
          k = 0;
          localObject1 = null;
        }
      }
    }
    for (;;)
    {
      return k;
      throw InvalidProtocolBufferMicroException.truncatedMessage();
      recomputeBufferSizeAfterLimit();
      int m = this.totalBytesRetired;
      i = this.bufferSize;
      m += i;
      i = this.bufferSizeAfterLimit;
      m += i;
      i = this.sizeLimit;
      if ((m <= i) && (m >= 0))
      {
        m = 1;
      }
      else
      {
        throw InvalidProtocolBufferMicroException.sizeLimitExceeded();
        if (paramBoolean) {
          break;
        }
        m = 0;
        localObject1 = null;
      }
    }
    throw InvalidProtocolBufferMicroException.truncatedMessage();
  }
  
  public void checkLastTagWas(int paramInt)
  {
    int i = this.lastTag;
    if (i != paramInt) {
      throw InvalidProtocolBufferMicroException.invalidEndTag();
    }
  }
  
  public int getBytesUntilLimit()
  {
    int i = this.currentLimit;
    int j = -1 >>> 1;
    if (i == j) {
      i = -1;
    }
    for (;;)
    {
      return i;
      i = this.currentLimit;
      j = this.totalBytesRetired;
      int k = this.bufferPos;
      j += k;
      i -= j;
    }
  }
  
  public boolean isAtEnd()
  {
    boolean bool1 = false;
    int i = this.bufferPos;
    int j = this.bufferSize;
    if (i == j)
    {
      boolean bool2 = refillBuffer(false);
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void popLimit(int paramInt)
  {
    this.currentLimit = paramInt;
    recomputeBufferSizeAfterLimit();
  }
  
  public int pushLimit(int paramInt)
  {
    if (paramInt < 0) {
      throw InvalidProtocolBufferMicroException.negativeSize();
    }
    int i = this.totalBytesRetired;
    int j = this.bufferPos;
    i = i + j + paramInt;
    j = this.currentLimit;
    if (i > j) {
      throw InvalidProtocolBufferMicroException.truncatedMessage();
    }
    this.currentLimit = i;
    recomputeBufferSizeAfterLimit();
    return j;
  }
  
  public boolean readBool()
  {
    int i = readRawVarint32();
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public ByteStringMicro readBytes()
  {
    int i = readRawVarint32();
    int j = this.bufferSize;
    int k = this.bufferPos;
    j -= k;
    Object localObject;
    if ((i > j) || (i <= 0)) {
      localObject = ByteStringMicro.copyFrom(readRawBytes(i));
    }
    for (;;)
    {
      return (ByteStringMicro)localObject;
      localObject = this.buffer;
      k = this.bufferPos;
      localObject = ByteStringMicro.copyFrom((byte[])localObject, k, i);
      k = this.bufferPos;
      i += k;
      this.bufferPos = i;
    }
  }
  
  public double readDouble()
  {
    return Double.longBitsToDouble(readRawLittleEndian64());
  }
  
  public int readEnum()
  {
    return readRawVarint32();
  }
  
  public int readFixed32()
  {
    return readRawLittleEndian32();
  }
  
  public long readFixed64()
  {
    return readRawLittleEndian64();
  }
  
  public float readFloat()
  {
    return Float.intBitsToFloat(readRawLittleEndian32());
  }
  
  public void readGroup(MessageMicro paramMessageMicro, int paramInt)
  {
    int i = this.recursionDepth;
    int j = this.recursionLimit;
    if (i >= j) {
      throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
    }
    i = this.recursionDepth + 1;
    this.recursionDepth = i;
    paramMessageMicro.mergeFrom(this);
    i = WireFormatMicro.makeTag(paramInt, 4);
    checkLastTagWas(i);
    i = this.recursionDepth + -1;
    this.recursionDepth = i;
  }
  
  public int readInt32()
  {
    return readRawVarint32();
  }
  
  public long readInt64()
  {
    return readRawVarint64();
  }
  
  public void readMessage(MessageMicro paramMessageMicro)
  {
    int i = readRawVarint32();
    int j = this.recursionDepth;
    int k = this.recursionLimit;
    if (j >= k) {
      throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
    }
    i = pushLimit(i);
    j = this.recursionDepth + 1;
    this.recursionDepth = j;
    paramMessageMicro.mergeFrom(this);
    checkLastTagWas(0);
    j = this.recursionDepth + -1;
    this.recursionDepth = j;
    popLimit(i);
  }
  
  public byte readRawByte()
  {
    int i = this.bufferPos;
    int j = this.bufferSize;
    if (i == j)
    {
      i = 1;
      refillBuffer(i);
    }
    byte[] arrayOfByte = this.buffer;
    int k = this.bufferPos;
    int m = k + 1;
    this.bufferPos = m;
    return arrayOfByte[k];
  }
  
  public byte[] readRawBytes(int paramInt)
  {
    int i = 4096;
    boolean bool = true;
    int k = -1;
    int m = 0;
    if (paramInt < 0) {
      throw InvalidProtocolBufferMicroException.negativeSize();
    }
    int n = this.totalBytesRetired;
    int i1 = this.bufferPos;
    n = n + i1 + paramInt;
    i1 = this.currentLimit;
    if (n > i1)
    {
      n = this.currentLimit;
      m = this.totalBytesRetired;
      n -= m;
      m = this.bufferPos;
      n -= m;
      skipRawBytes(n);
      throw InvalidProtocolBufferMicroException.truncatedMessage();
    }
    n = this.bufferSize;
    i1 = this.bufferPos;
    n -= i1;
    Object localObject1;
    Object localObject2;
    if (paramInt <= n)
    {
      localObject1 = new byte[paramInt];
      localObject2 = this.buffer;
      k = this.bufferPos;
      System.arraycopy(localObject2, k, localObject1, 0, paramInt);
      m = this.bufferPos + paramInt;
      this.bufferPos = m;
    }
    for (;;)
    {
      return (byte[])localObject1;
      byte[] arrayOfByte1;
      int i2;
      if (paramInt < i)
      {
        localObject2 = new byte[paramInt];
        n = this.bufferSize;
        k = this.bufferPos;
        n -= k;
        arrayOfByte1 = this.buffer;
        i2 = this.bufferPos;
        System.arraycopy(arrayOfByte1, i2, localObject2, 0, n);
        k = this.bufferSize;
        this.bufferPos = k;
        refillBuffer(bool);
        for (;;)
        {
          k = paramInt - n;
          i2 = this.bufferSize;
          if (k <= i2) {
            break;
          }
          arrayOfByte1 = this.buffer;
          i2 = this.bufferSize;
          System.arraycopy(arrayOfByte1, 0, localObject2, n, i2);
          k = this.bufferSize;
          n += k;
          k = this.bufferSize;
          this.bufferPos = k;
          refillBuffer(bool);
        }
        arrayOfByte1 = this.buffer;
        i2 = paramInt - n;
        System.arraycopy(arrayOfByte1, 0, localObject2, n, i2);
        n = paramInt - n;
        this.bufferPos = n;
        localObject1 = localObject2;
      }
      else
      {
        int j = this.bufferPos;
        int i3 = this.bufferSize;
        n = this.totalBytesRetired;
        i1 = this.bufferSize;
        n += i1;
        this.totalBytesRetired = n;
        this.bufferPos = 0;
        this.bufferSize = 0;
        n = i3 - j;
        n = paramInt - n;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        for (i2 = n; i2 > 0; i2 = n)
        {
          byte[] arrayOfByte2 = new byte[Math.min(i2, i)];
          n = 0;
          localObject1 = null;
          for (;;)
          {
            i1 = arrayOfByte2.length;
            if (n >= i1) {
              break;
            }
            localObject2 = this.input;
            if (localObject2 == null) {}
            for (i1 = k; i1 == k; i1 = ((InputStream)localObject2).read(arrayOfByte2, n, i4))
            {
              throw InvalidProtocolBufferMicroException.truncatedMessage();
              localObject2 = this.input;
              i4 = arrayOfByte2.length - n;
            }
            int i4 = this.totalBytesRetired + i1;
            this.totalBytesRetired = i4;
            n += i1;
          }
          n = arrayOfByte2.length;
          n = i2 - n;
          localArrayList.add(arrayOfByte2);
        }
        byte[] arrayOfByte3 = new byte[paramInt];
        n = i3 - j;
        localObject2 = this.buffer;
        System.arraycopy(localObject2, j, arrayOfByte3, 0, n);
        i1 = n;
        k = 0;
        arrayOfByte1 = null;
        for (;;)
        {
          n = localArrayList.size();
          if (k >= n) {
            break;
          }
          localObject1 = (byte[])localArrayList.get(k);
          j = localObject1.length;
          System.arraycopy(localObject1, 0, arrayOfByte3, i1, j);
          n = localObject1.length + i1;
          k += 1;
          i1 = n;
        }
        localObject1 = arrayOfByte3;
      }
    }
  }
  
  public int readRawLittleEndian32()
  {
    int i = readRawByte() & 0xFF;
    int j = (readRawByte() & 0xFF) << 8;
    i |= j;
    j = (readRawByte() & 0xFF) << 16;
    i |= j;
    j = (readRawByte() & 0xFF) << 24;
    return i | j;
  }
  
  public long readRawLittleEndian64()
  {
    long l1 = 255L;
    int i = readRawByte();
    long l2 = (readRawByte() & l1) << 8;
    long l3 = i & l1;
    long l4 = l2 | l3;
    long l5 = (readRawByte() & l1) << 16;
    l4 |= l5;
    l5 = (readRawByte() & l1) << 24;
    l4 |= l5;
    l5 = (readRawByte() & l1) << 32;
    l4 |= l5;
    l5 = (readRawByte() & l1) << 40;
    l4 |= l5;
    l5 = (readRawByte() & l1) << 48;
    l4 |= l5;
    l5 = (readRawByte() & l1) << 56;
    return l4 | l5;
  }
  
  public int readRawVarint32()
  {
    int i = readRawByte();
    if (i >= 0) {}
    int k;
    do
    {
      for (;;)
      {
        return i;
        i &= 0x7F;
        j = readRawByte();
        if (j >= 0)
        {
          j <<= 7;
          i |= j;
        }
        else
        {
          j = (j & 0x7F) << 7;
          i |= j;
          j = readRawByte();
          if (j >= 0)
          {
            j <<= 14;
            i |= j;
          }
          else
          {
            j = (j & 0x7F) << 14;
            i |= j;
            j = readRawByte();
            if (j < 0) {
              break;
            }
            j <<= 21;
            i |= j;
          }
        }
      }
      j = (j & 0x7F) << 21;
      i |= j;
      j = readRawByte();
      k = j << 28;
      i |= k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      k = 5;
      if (j >= k) {
        break label158;
      }
      k = readRawByte();
      if (k >= 0) {
        break;
      }
      j += 1;
    }
    label158:
    throw InvalidProtocolBufferMicroException.malformedVarint();
  }
  
  public long readRawVarint64()
  {
    long l1 = 0L;
    int i = 0;
    for (;;)
    {
      int j = 64;
      if (i >= j) {
        break;
      }
      j = readRawByte();
      int k = j & 0x7F;
      long l2 = k << i;
      l1 |= l2;
      j &= 0x80;
      if (j == 0) {
        return l1;
      }
      i += 7;
    }
    throw InvalidProtocolBufferMicroException.malformedVarint();
  }
  
  public int readSFixed32()
  {
    return readRawLittleEndian32();
  }
  
  public long readSFixed64()
  {
    return readRawLittleEndian64();
  }
  
  public int readSInt32()
  {
    return decodeZigZag32(readRawVarint32());
  }
  
  public long readSInt64()
  {
    return decodeZigZag64(readRawVarint64());
  }
  
  public String readString()
  {
    int i = readRawVarint32();
    int j = this.bufferSize;
    int k = this.bufferPos;
    j -= k;
    String str1;
    Object localObject;
    if ((i > j) || (i <= 0))
    {
      str1 = new java/lang/String;
      byte[] arrayOfByte = readRawBytes(i);
      localObject = "UTF-8";
      str1.<init>(arrayOfByte, (String)localObject);
    }
    for (;;)
    {
      return str1;
      str1 = new java/lang/String;
      localObject = this.buffer;
      int m = this.bufferPos;
      String str2 = "UTF-8";
      str1.<init>((byte[])localObject, m, i, str2);
      k = this.bufferPos;
      i += k;
      this.bufferPos = i;
    }
  }
  
  public int readTag()
  {
    int i = 0;
    boolean bool = isAtEnd();
    if (bool) {
      this.lastTag = 0;
    }
    for (;;)
    {
      return i;
      i = readRawVarint32();
      this.lastTag = i;
      i = this.lastTag;
      if (i == 0) {
        break;
      }
      i = this.lastTag;
    }
    throw InvalidProtocolBufferMicroException.invalidTag();
  }
  
  public int readUInt32()
  {
    return readRawVarint32();
  }
  
  public long readUInt64()
  {
    return readRawVarint64();
  }
  
  public void resetSizeCounter()
  {
    this.totalBytesRetired = 0;
  }
  
  public int setRecursionLimit(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Recursion limit cannot be negative: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i = this.recursionLimit;
    this.recursionLimit = paramInt;
    return i;
  }
  
  public int setSizeLimit(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Size limit cannot be negative: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i = this.sizeLimit;
    this.sizeLimit = paramInt;
    return i;
  }
  
  public boolean skipField(int paramInt)
  {
    boolean bool = true;
    int i = WireFormatMicro.getTagWireType(paramInt);
    switch (i)
    {
    default: 
      throw InvalidProtocolBufferMicroException.invalidWireType();
    case 0: 
      readInt32();
    }
    for (;;)
    {
      return bool;
      readRawLittleEndian64();
      continue;
      i = readRawVarint32();
      skipRawBytes(i);
      continue;
      skipMessage();
      i = WireFormatMicro.getTagFieldNumber(paramInt);
      int j = 4;
      i = WireFormatMicro.makeTag(i, j);
      checkLastTagWas(i);
      continue;
      bool = false;
      continue;
      readRawLittleEndian32();
    }
  }
  
  public void skipMessage()
  {
    int i = readTag();
    if (i == 0) {}
    for (;;)
    {
      return;
      boolean bool = skipField(i);
      if (bool) {
        break;
      }
    }
  }
  
  public void skipRawBytes(int paramInt)
  {
    int i = 0;
    if (paramInt < 0) {
      throw InvalidProtocolBufferMicroException.negativeSize();
    }
    int j = this.totalBytesRetired;
    int k = this.bufferPos;
    j = j + k + paramInt;
    k = this.currentLimit;
    if (j > k)
    {
      j = this.currentLimit;
      k = this.totalBytesRetired;
      j -= k;
      k = this.bufferPos;
      j -= k;
      skipRawBytes(j);
      throw InvalidProtocolBufferMicroException.truncatedMessage();
    }
    j = this.bufferSize;
    k = this.bufferPos;
    j -= k;
    if (paramInt <= j)
    {
      j = this.bufferPos + paramInt;
      this.bufferPos = j;
    }
    for (;;)
    {
      return;
      j = this.bufferSize;
      k = this.bufferPos;
      j -= k;
      k = this.totalBytesRetired + j;
      this.totalBytesRetired = k;
      this.bufferPos = 0;
      this.bufferSize = 0;
      k = j;
      while (k < paramInt)
      {
        InputStream localInputStream = this.input;
        if (localInputStream == null) {}
        long l;
        for (j = -1; j <= 0; j = (int)l)
        {
          throw InvalidProtocolBufferMicroException.truncatedMessage();
          localInputStream = this.input;
          i = paramInt - k;
          l = i;
          l = localInputStream.skip(l);
        }
        k += j;
        i = this.totalBytesRetired;
        j += i;
        this.totalBytesRetired = j;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/CodedInputStreamMicro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */