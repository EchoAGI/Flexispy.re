package com.vvt.qq.internal.pb;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStreamMicro
{
  public static final int DEFAULT_BUFFER_SIZE = 4096;
  public static final int LITTLE_ENDIAN_32_SIZE = 4;
  public static final int LITTLE_ENDIAN_64_SIZE = 8;
  private final byte[] buffer;
  private final int limit;
  private final OutputStream output;
  private int position;
  
  private CodedOutputStreamMicro(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    this.output = paramOutputStream;
    this.buffer = paramArrayOfByte;
    this.position = 0;
    int i = paramArrayOfByte.length;
    this.limit = i;
  }
  
  private CodedOutputStreamMicro(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.output = null;
    this.buffer = paramArrayOfByte;
    this.position = paramInt1;
    int i = paramInt1 + paramInt2;
    this.limit = i;
  }
  
  public static int computeBoolSize(int paramInt, boolean paramBoolean)
  {
    int i = computeTagSize(paramInt);
    int j = computeBoolSizeNoTag(paramBoolean);
    return i + j;
  }
  
  public static int computeBoolSizeNoTag(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int computeByteArraySize(int paramInt, byte[] paramArrayOfByte)
  {
    int i = computeTagSize(paramInt);
    int j = computeByteArraySizeNoTag(paramArrayOfByte);
    return i + j;
  }
  
  public static int computeByteArraySizeNoTag(byte[] paramArrayOfByte)
  {
    int i = computeRawVarint32Size(paramArrayOfByte.length);
    int j = paramArrayOfByte.length;
    return i + j;
  }
  
  public static int computeBytesSize(int paramInt, ByteStringMicro paramByteStringMicro)
  {
    int i = computeTagSize(paramInt);
    int j = computeBytesSizeNoTag(paramByteStringMicro);
    return i + j;
  }
  
  public static int computeBytesSizeNoTag(ByteStringMicro paramByteStringMicro)
  {
    int i = computeRawVarint32Size(paramByteStringMicro.size());
    int j = paramByteStringMicro.size();
    return i + j;
  }
  
  public static int computeDoubleSize(int paramInt, double paramDouble)
  {
    int i = computeTagSize(paramInt);
    int j = computeDoubleSizeNoTag(paramDouble);
    return i + j;
  }
  
  public static int computeDoubleSizeNoTag(double paramDouble)
  {
    return 8;
  }
  
  public static int computeEnumSize(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeEnumSizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeEnumSizeNoTag(int paramInt)
  {
    return computeRawVarint32Size(paramInt);
  }
  
  public static int computeFixed32Size(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeFixed32SizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeFixed32SizeNoTag(int paramInt)
  {
    return 4;
  }
  
  public static int computeFixed64Size(int paramInt, long paramLong)
  {
    int i = computeTagSize(paramInt);
    int j = computeFixed64SizeNoTag(paramLong);
    return i + j;
  }
  
  public static int computeFixed64SizeNoTag(long paramLong)
  {
    return 8;
  }
  
  public static int computeFloatSize(int paramInt, float paramFloat)
  {
    int i = computeTagSize(paramInt);
    int j = computeFloatSizeNoTag(paramFloat);
    return i + j;
  }
  
  public static int computeFloatSizeNoTag(float paramFloat)
  {
    return 4;
  }
  
  public static int computeGroupSize(int paramInt, MessageMicro paramMessageMicro)
  {
    int i = computeTagSize(paramInt) * 2;
    int j = computeGroupSizeNoTag(paramMessageMicro);
    return i + j;
  }
  
  public static int computeGroupSizeNoTag(MessageMicro paramMessageMicro)
  {
    return paramMessageMicro.getCachedSize();
  }
  
  public static int computeInt32Size(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeInt32SizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeInt32SizeNoTag(int paramInt)
  {
    if (paramInt >= 0) {}
    for (int i = computeRawVarint32Size(paramInt);; i = 10) {
      return i;
    }
  }
  
  public static int computeInt64Size(int paramInt, long paramLong)
  {
    int i = computeTagSize(paramInt);
    int j = computeInt64SizeNoTag(paramLong);
    return i + j;
  }
  
  public static int computeInt64SizeNoTag(long paramLong)
  {
    return computeRawVarint64Size(paramLong);
  }
  
  public static int computeMessageSize(int paramInt, MessageMicro paramMessageMicro)
  {
    int i = computeTagSize(paramInt);
    int j = computeMessageSizeNoTag(paramMessageMicro);
    return i + j;
  }
  
  public static int computeMessageSizeNoTag(MessageMicro paramMessageMicro)
  {
    int i = paramMessageMicro.getCachedSize();
    int j = computeRawVarint32Size(i);
    return i + j;
  }
  
  public static int computeRawVarint32Size(int paramInt)
  {
    int i = paramInt & 0xFFFFFF80;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = paramInt & 0xC000;
      if (i == 0)
      {
        i = 2;
      }
      else
      {
        i = 0xFFE00000 & paramInt;
        if (i == 0)
        {
          i = 3;
        }
        else
        {
          i = 0xF0000000 & paramInt;
          if (i == 0) {
            i = 4;
          } else {
            i = 5;
          }
        }
      }
    }
  }
  
  public static int computeRawVarint64Size(long paramLong)
  {
    long l1 = 0L;
    long l2 = Byte.MIN_VALUE & paramLong;
    int i = l2 < l1;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      l2 = 0xFFFFFFFFFFFFC000 & paramLong;
      boolean bool1 = l2 < l1;
      if (!bool1)
      {
        int j = 2;
      }
      else
      {
        l2 = 0xFFE00000 & paramLong;
        boolean bool2 = l2 < l1;
        if (!bool2)
        {
          int k = 3;
        }
        else
        {
          l2 = 0xF0000000 & paramLong;
          boolean bool3 = l2 < l1;
          if (!bool3)
          {
            int m = 4;
          }
          else
          {
            l2 = 0xFFFFFFF800000000 & paramLong;
            boolean bool4 = l2 < l1;
            if (!bool4)
            {
              int n = 5;
            }
            else
            {
              l2 = 0xFFFFFC0000000000 & paramLong;
              boolean bool5 = l2 < l1;
              if (!bool5)
              {
                int i1 = 6;
              }
              else
              {
                l2 = 0xFFFE000000000000 & paramLong;
                boolean bool6 = l2 < l1;
                if (!bool6)
                {
                  int i2 = 7;
                }
                else
                {
                  l2 = 0xFF00000000000000 & paramLong;
                  boolean bool7 = l2 < l1;
                  if (!bool7)
                  {
                    int i3 = 8;
                  }
                  else
                  {
                    l2 = 0x8000000000000000 & paramLong;
                    boolean bool8 = l2 < l1;
                    int i4;
                    if (!bool8) {
                      i4 = 9;
                    } else {
                      i4 = 10;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static int computeSFixed32Size(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeSFixed32SizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeSFixed32SizeNoTag(int paramInt)
  {
    return 4;
  }
  
  public static int computeSFixed64Size(int paramInt, long paramLong)
  {
    int i = computeTagSize(paramInt);
    int j = computeSFixed64SizeNoTag(paramLong);
    return i + j;
  }
  
  public static int computeSFixed64SizeNoTag(long paramLong)
  {
    return 8;
  }
  
  public static int computeSInt32Size(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeSInt32SizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeSInt32SizeNoTag(int paramInt)
  {
    return computeRawVarint32Size(encodeZigZag32(paramInt));
  }
  
  public static int computeSInt64Size(int paramInt, long paramLong)
  {
    int i = computeTagSize(paramInt);
    int j = computeSInt64SizeNoTag(paramLong);
    return i + j;
  }
  
  public static int computeSInt64SizeNoTag(long paramLong)
  {
    return computeRawVarint64Size(encodeZigZag64(paramLong));
  }
  
  public static int computeStringSize(int paramInt, String paramString)
  {
    int i = computeTagSize(paramInt);
    int j = computeStringSizeNoTag(paramString);
    return i + j;
  }
  
  public static int computeStringSizeNoTag(String paramString)
  {
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
      int i = localObject.length;
      int j = localObject.length;
      return computeRawVarint32Size(j) + i;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("UTF-8 not supported.");
      throw localRuntimeException;
    }
  }
  
  public static int computeTagSize(int paramInt)
  {
    return computeRawVarint32Size(WireFormatMicro.makeTag(paramInt, 0));
  }
  
  public static int computeUInt32Size(int paramInt1, int paramInt2)
  {
    int i = computeTagSize(paramInt1);
    int j = computeUInt32SizeNoTag(paramInt2);
    return i + j;
  }
  
  public static int computeUInt32SizeNoTag(int paramInt)
  {
    return computeRawVarint32Size(paramInt);
  }
  
  public static int computeUInt64Size(int paramInt, long paramLong)
  {
    int i = computeTagSize(paramInt);
    int j = computeUInt64SizeNoTag(paramLong);
    return i + j;
  }
  
  public static int computeUInt64SizeNoTag(long paramLong)
  {
    return computeRawVarint64Size(paramLong);
  }
  
  public static int encodeZigZag32(int paramInt)
  {
    int i = paramInt << 1;
    int j = paramInt >> 31;
    return i ^ j;
  }
  
  public static long encodeZigZag64(long paramLong)
  {
    long l1 = paramLong << 1;
    long l2 = paramLong >> 63;
    return l1 ^ l2;
  }
  
  public static CodedOutputStreamMicro newInstance(OutputStream paramOutputStream)
  {
    return newInstance(paramOutputStream, 4096);
  }
  
  public static CodedOutputStreamMicro newInstance(OutputStream paramOutputStream, int paramInt)
  {
    CodedOutputStreamMicro localCodedOutputStreamMicro = new com/vvt/qq/internal/pb/CodedOutputStreamMicro;
    byte[] arrayOfByte = new byte[paramInt];
    localCodedOutputStreamMicro.<init>(paramOutputStream, arrayOfByte);
    return localCodedOutputStreamMicro;
  }
  
  public static CodedOutputStreamMicro newInstance(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return newInstance(paramArrayOfByte, 0, i);
  }
  
  public static CodedOutputStreamMicro newInstance(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    CodedOutputStreamMicro localCodedOutputStreamMicro = new com/vvt/qq/internal/pb/CodedOutputStreamMicro;
    localCodedOutputStreamMicro.<init>(paramArrayOfByte, paramInt1, paramInt2);
    return localCodedOutputStreamMicro;
  }
  
  private void refreshBuffer()
  {
    Object localObject = this.output;
    if (localObject == null)
    {
      localObject = new com/vvt/qq/internal/pb/CodedOutputStreamMicro$OutOfSpaceException;
      ((CodedOutputStreamMicro.OutOfSpaceException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = this.output;
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    ((OutputStream)localObject).write(arrayOfByte, 0, i);
    this.position = 0;
  }
  
  public void checkNoSpaceLeft()
  {
    int i = spaceLeft();
    if (i != 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Did not write as much data as expected.");
      throw localIllegalStateException;
    }
  }
  
  public void flush()
  {
    OutputStream localOutputStream = this.output;
    if (localOutputStream != null) {
      refreshBuffer();
    }
  }
  
  public int spaceLeft()
  {
    Object localObject = this.output;
    if (localObject == null)
    {
      int i = this.limit;
      int j = this.position;
      return i - j;
    }
    localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    throw ((Throwable)localObject);
  }
  
  public void writeBool(int paramInt, boolean paramBoolean)
  {
    writeTag(paramInt, 0);
    writeBoolNoTag(paramBoolean);
  }
  
  public void writeBoolNoTag(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      writeRawByte(i);
      return;
    }
  }
  
  public void writeByteArray(int paramInt, byte[] paramArrayOfByte)
  {
    writeTag(paramInt, 2);
    writeByteArrayNoTag(paramArrayOfByte);
  }
  
  public void writeByteArrayNoTag(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    writeRawVarint32(i);
    writeRawBytes(paramArrayOfByte);
  }
  
  public void writeBytes(int paramInt, ByteStringMicro paramByteStringMicro)
  {
    writeTag(paramInt, 2);
    writeBytesNoTag(paramByteStringMicro);
  }
  
  public void writeBytesNoTag(ByteStringMicro paramByteStringMicro)
  {
    byte[] arrayOfByte = paramByteStringMicro.toByteArray();
    int i = arrayOfByte.length;
    writeRawVarint32(i);
    writeRawBytes(arrayOfByte);
  }
  
  public void writeDouble(int paramInt, double paramDouble)
  {
    writeTag(paramInt, 1);
    writeDoubleNoTag(paramDouble);
  }
  
  public void writeDoubleNoTag(double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    writeRawLittleEndian64(l);
  }
  
  public void writeEnum(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 0);
    writeEnumNoTag(paramInt2);
  }
  
  public void writeEnumNoTag(int paramInt)
  {
    writeRawVarint32(paramInt);
  }
  
  public void writeFixed32(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 5);
    writeFixed32NoTag(paramInt2);
  }
  
  public void writeFixed32NoTag(int paramInt)
  {
    writeRawLittleEndian32(paramInt);
  }
  
  public void writeFixed64(int paramInt, long paramLong)
  {
    writeTag(paramInt, 1);
    writeFixed64NoTag(paramLong);
  }
  
  public void writeFixed64NoTag(long paramLong)
  {
    writeRawLittleEndian64(paramLong);
  }
  
  public void writeFloat(int paramInt, float paramFloat)
  {
    writeTag(paramInt, 5);
    writeFloatNoTag(paramFloat);
  }
  
  public void writeFloatNoTag(float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    writeRawLittleEndian32(i);
  }
  
  public void writeGroup(int paramInt, MessageMicro paramMessageMicro)
  {
    writeTag(paramInt, 3);
    writeGroupNoTag(paramMessageMicro);
    writeTag(paramInt, 4);
  }
  
  public void writeGroupNoTag(MessageMicro paramMessageMicro)
  {
    paramMessageMicro.writeTo(this);
  }
  
  public void writeInt32(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 0);
    writeInt32NoTag(paramInt2);
  }
  
  public void writeInt32NoTag(int paramInt)
  {
    if (paramInt >= 0) {
      writeRawVarint32(paramInt);
    }
    for (;;)
    {
      return;
      long l = paramInt;
      writeRawVarint64(l);
    }
  }
  
  public void writeInt64(int paramInt, long paramLong)
  {
    writeTag(paramInt, 0);
    writeInt64NoTag(paramLong);
  }
  
  public void writeInt64NoTag(long paramLong)
  {
    writeRawVarint64(paramLong);
  }
  
  public void writeMessage(int paramInt, MessageMicro paramMessageMicro)
  {
    writeTag(paramInt, 2);
    writeMessageNoTag(paramMessageMicro);
  }
  
  public void writeMessageNoTag(MessageMicro paramMessageMicro)
  {
    int i = paramMessageMicro.getCachedSize();
    writeRawVarint32(i);
    paramMessageMicro.writeTo(this);
  }
  
  public void writeRawByte(byte paramByte)
  {
    int i = this.position;
    int j = this.limit;
    if (i == j) {
      refreshBuffer();
    }
    byte[] arrayOfByte = this.buffer;
    j = this.position;
    int k = j + 1;
    this.position = k;
    arrayOfByte[j] = paramByte;
  }
  
  public void writeRawByte(int paramInt)
  {
    byte b = (byte)paramInt;
    writeRawByte(b);
  }
  
  public void writeRawBytes(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    writeRawBytes(paramArrayOfByte, 0, i);
  }
  
  public void writeRawBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.limit;
    int j = this.position;
    i -= j;
    if (i >= paramInt2)
    {
      byte[] arrayOfByte1 = this.buffer;
      j = this.position;
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte1, j, paramInt2);
      i = this.position + paramInt2;
      this.position = i;
    }
    for (;;)
    {
      return;
      i = this.limit;
      j = this.position;
      i -= j;
      byte[] arrayOfByte2 = this.buffer;
      int k = this.position;
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte2, k, i);
      j = paramInt1 + i;
      i = paramInt2 - i;
      k = this.limit;
      this.position = k;
      refreshBuffer();
      k = this.limit;
      Object localObject;
      if (i <= k)
      {
        localObject = this.buffer;
        System.arraycopy(paramArrayOfByte, j, localObject, 0, i);
        this.position = i;
      }
      else
      {
        localObject = this.output;
        ((OutputStream)localObject).write(paramArrayOfByte, j, i);
      }
    }
  }
  
  public void writeRawLittleEndian32(int paramInt)
  {
    int i = paramInt & 0xFF;
    writeRawByte(i);
    i = paramInt >> 8 & 0xFF;
    writeRawByte(i);
    i = paramInt >> 16 & 0xFF;
    writeRawByte(i);
    i = paramInt >> 24 & 0xFF;
    writeRawByte(i);
  }
  
  public void writeRawLittleEndian64(long paramLong)
  {
    int i = (int)paramLong & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 8) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 16) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 24) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 32) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 40) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 48) & 0xFF;
    writeRawByte(i);
    i = (int)(paramLong >> 56) & 0xFF;
    writeRawByte(i);
  }
  
  public void writeRawVarint32(int paramInt)
  {
    for (;;)
    {
      int i = paramInt & 0xFFFFFF80;
      if (i == 0) {
        break;
      }
      i = paramInt & 0x7F | 0x80;
      writeRawByte(i);
      paramInt >>>= 7;
    }
    writeRawByte(paramInt);
  }
  
  public void writeRawVarint64(long paramLong)
  {
    for (;;)
    {
      long l1 = Byte.MIN_VALUE & paramLong;
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool) {
        break;
      }
      i = (int)paramLong & 0x7F | 0x80;
      writeRawByte(i);
      i = 7;
      paramLong >>>= i;
    }
    int i = (int)paramLong;
    writeRawByte(i);
  }
  
  public void writeSFixed32(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 5);
    writeSFixed32NoTag(paramInt2);
  }
  
  public void writeSFixed32NoTag(int paramInt)
  {
    writeRawLittleEndian32(paramInt);
  }
  
  public void writeSFixed64(int paramInt, long paramLong)
  {
    writeTag(paramInt, 1);
    writeSFixed64NoTag(paramLong);
  }
  
  public void writeSFixed64NoTag(long paramLong)
  {
    writeRawLittleEndian64(paramLong);
  }
  
  public void writeSInt32(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 0);
    writeSInt32NoTag(paramInt2);
  }
  
  public void writeSInt32NoTag(int paramInt)
  {
    int i = encodeZigZag32(paramInt);
    writeRawVarint32(i);
  }
  
  public void writeSInt64(int paramInt, long paramLong)
  {
    writeTag(paramInt, 0);
    writeSInt64NoTag(paramLong);
  }
  
  public void writeSInt64NoTag(long paramLong)
  {
    long l = encodeZigZag64(paramLong);
    writeRawVarint64(l);
  }
  
  public void writeString(int paramInt, String paramString)
  {
    writeTag(paramInt, 2);
    writeStringNoTag(paramString);
  }
  
  public void writeStringNoTag(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    int i = arrayOfByte.length;
    writeRawVarint32(i);
    writeRawBytes(arrayOfByte);
  }
  
  public void writeTag(int paramInt1, int paramInt2)
  {
    int i = WireFormatMicro.makeTag(paramInt1, paramInt2);
    writeRawVarint32(i);
  }
  
  public void writeUInt32(int paramInt1, int paramInt2)
  {
    writeTag(paramInt1, 0);
    writeUInt32NoTag(paramInt2);
  }
  
  public void writeUInt32NoTag(int paramInt)
  {
    writeRawVarint32(paramInt);
  }
  
  public void writeUInt64(int paramInt, long paramLong)
  {
    writeTag(paramInt, 0);
    writeUInt64NoTag(paramLong);
  }
  
  public void writeUInt64NoTag(long paramLong)
  {
    writeRawVarint64(paramLong);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/CodedOutputStreamMicro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */