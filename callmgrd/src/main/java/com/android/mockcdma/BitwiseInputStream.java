package com.android.mockcdma;

public class BitwiseInputStream
{
  private byte[] a;
  private int b;
  private int c;
  
  public BitwiseInputStream(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    int i = paramArrayOfByte.length << 3;
    this.c = i;
    this.b = 0;
  }
  
  public int a()
  {
    int i = this.c;
    int j = this.b;
    return i - j;
  }
  
  public int a(int paramInt)
  {
    int i = 8;
    int j = this.b >>> 3;
    int k = this.b & 0x7;
    k = 16 - k;
    int m = k - paramInt;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      k = this.b + paramInt;
      int n = this.c;
      if (k <= n) {}
    }
    else
    {
      localObject1 = new com/android/mockcdma/BitwiseInputStream$AccessException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("illegal read (pos ");
      m = this.b;
      localObject2 = ((StringBuilder)localObject2).append(m).append(", end ");
      m = this.c;
      localObject2 = m + ", bits " + paramInt + ")";
      ((BitwiseInputStream.AccessException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.a;
    k = (localObject1[j] & 0xFF) << 8;
    if (m < i)
    {
      byte[] arrayOfByte = this.a;
      j += 1;
      j = arrayOfByte[j] & 0xFF;
      k |= j;
    }
    k >>>= m;
    m = 32 - paramInt;
    j = -1 >>> m;
    k &= j;
    j = this.b + paramInt;
    this.b = j;
    return k;
  }
  
  public byte[] b(int paramInt)
  {
    int i = 0;
    int j = paramInt >>> 3;
    int k = paramInt & 0x7;
    if (k > 0) {}
    byte[] arrayOfByte;
    for (k = 1;; k = 0)
    {
      k += j;
      arrayOfByte = new byte[k];
      while (i < k)
      {
        int m = i << 3;
        m = paramInt - m;
        int n = Math.min(8, m);
        m = a(n);
        n = 8 - n;
        n = (byte)(m << n);
        arrayOfByte[i] = n;
        i += 1;
      }
    }
    return arrayOfByte;
  }
  
  public void c(int paramInt)
  {
    int i = this.b + paramInt;
    int j = this.c;
    if (i > j)
    {
      BitwiseInputStream.AccessException localAccessException = new com/android/mockcdma/BitwiseInputStream$AccessException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("illegal skip (pos ");
      int k = this.b;
      localObject = ((StringBuilder)localObject).append(k).append(", end ");
      k = this.c;
      localObject = k + ", bits " + paramInt + ")";
      localAccessException.<init>((String)localObject);
      throw localAccessException;
    }
    i = this.b + paramInt;
    this.b = i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/BitwiseInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */