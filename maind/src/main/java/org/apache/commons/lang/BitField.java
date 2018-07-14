package org.apache.commons.lang;

public class BitField
{
  private final int _mask;
  private final int _shift_count;
  
  public BitField(int paramInt)
  {
    this._mask = paramInt;
    int i = 0;
    int j = paramInt;
    if (paramInt != 0) {
      for (;;)
      {
        int k = j & 0x1;
        if (k != 0) {
          break;
        }
        i += 1;
        j >>= 1;
      }
    }
    this._shift_count = i;
  }
  
  public int clear(int paramInt)
  {
    return (this._mask ^ 0xFFFFFFFF) & paramInt;
  }
  
  public byte clearByte(byte paramByte)
  {
    return (byte)clear(paramByte);
  }
  
  public short clearShort(short paramShort)
  {
    return (short)clear(paramShort);
  }
  
  public int getRawValue(int paramInt)
  {
    return this._mask & paramInt;
  }
  
  public short getShortRawValue(short paramShort)
  {
    return (short)getRawValue(paramShort);
  }
  
  public short getShortValue(short paramShort)
  {
    return (short)getValue(paramShort);
  }
  
  public int getValue(int paramInt)
  {
    int i = getRawValue(paramInt);
    int j = this._shift_count;
    return i >> j;
  }
  
  public boolean isAllSet(int paramInt)
  {
    int i = this._mask & paramInt;
    int k = this._mask;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isSet(int paramInt)
  {
    int i = this._mask & paramInt;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int set(int paramInt)
  {
    return this._mask | paramInt;
  }
  
  public int setBoolean(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = set(paramInt);; i = clear(paramInt)) {
      return i;
    }
  }
  
  public byte setByte(byte paramByte)
  {
    return (byte)set(paramByte);
  }
  
  public byte setByteBoolean(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (byte b = setByte(paramByte);; b = clearByte(paramByte)) {
      return b;
    }
  }
  
  public short setShort(short paramShort)
  {
    return (short)set(paramShort);
  }
  
  public short setShortBoolean(short paramShort, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (short s = setShort(paramShort);; s = clearShort(paramShort)) {
      return s;
    }
  }
  
  public short setShortValue(short paramShort1, short paramShort2)
  {
    return (short)setValue(paramShort1, paramShort2);
  }
  
  public int setValue(int paramInt1, int paramInt2)
  {
    int i = (this._mask ^ 0xFFFFFFFF) & paramInt1;
    int j = this._shift_count;
    j = paramInt2 << j;
    int k = this._mask;
    j &= k;
    return i | j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/BitField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */