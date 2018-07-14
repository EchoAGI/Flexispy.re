package com.krecorder.call.callrecorder;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class v
{
  private short a;
  private short b;
  private int c;
  private short d;
  private int e;
  
  public v() {}
  
  public v(short paramShort1, short paramShort2, int paramInt1, short paramShort3, int paramInt2)
  {
    this.a = paramShort1;
    this.c = paramInt1;
    this.b = paramShort2;
    this.d = paramShort3;
    this.e = paramInt2;
  }
  
  public void a(RandomAccessFile paramRandomAccessFile)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(44);
    Object localObject = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order((ByteOrder)localObject);
    Charset localCharset = Charset.forName("ASCII");
    localObject = "RIFF".getBytes(localCharset);
    localByteBuffer.put((byte[])localObject);
    int i = this.e + 36;
    localByteBuffer.putInt(i);
    localCharset = Charset.forName("ASCII");
    localObject = "WAVE".getBytes(localCharset);
    localByteBuffer.put((byte[])localObject);
    localCharset = Charset.forName("ASCII");
    localObject = "fmt ".getBytes(localCharset);
    localByteBuffer.put((byte[])localObject);
    localByteBuffer.putInt(16);
    i = this.a;
    localByteBuffer.putShort(i);
    short s1 = this.b;
    localByteBuffer.putShort(s1);
    int j = this.c;
    localByteBuffer.putInt(j);
    j = this.b;
    int m = this.c;
    j *= m;
    int n = this.d;
    j = j * n / 8;
    localByteBuffer.putInt(j);
    j = this.b;
    int i1 = this.d;
    j = (short)(j * i1 / 8);
    localByteBuffer.putShort(j);
    short s2 = this.d;
    localByteBuffer.putShort(s2);
    localCharset = Charset.forName("ASCII");
    localObject = "data".getBytes(localCharset);
    localByteBuffer.put((byte[])localObject);
    int k = this.e;
    localByteBuffer.putInt(k);
    localObject = localByteBuffer.array();
    int i2 = localByteBuffer.array().length;
    paramRandomAccessFile.write((byte[])localObject, 0, i2);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Short.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = Short.valueOf(this.b);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.c);
    arrayOfObject[2] = localObject;
    localObject = Short.valueOf(this.d);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.e);
    arrayOfObject[4] = localObject;
    return String.format("WaveHeader format=%d numChannels=%d sampleRate=%d bitsPerSample=%d numBytes=%d", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */