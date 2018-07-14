package com.vvt.qq.internal.pb;

public final class WireFormatMicro
{
  static final int MESSAGE_SET_ITEM = 1;
  static final int MESSAGE_SET_ITEM_END_TAG = 0;
  static final int MESSAGE_SET_ITEM_TAG = 0;
  static final int MESSAGE_SET_MESSAGE = 3;
  static final int MESSAGE_SET_MESSAGE_TAG = 0;
  static final int MESSAGE_SET_TYPE_ID = 2;
  static final int MESSAGE_SET_TYPE_ID_TAG = 0;
  static final int TAG_TYPE_BITS = 3;
  static final int TAG_TYPE_MASK = 7;
  static final int WIRETYPE_END_GROUP = 4;
  static final int WIRETYPE_FIXED32 = 5;
  static final int WIRETYPE_FIXED64 = 1;
  static final int WIRETYPE_LENGTH_DELIMITED = 2;
  static final int WIRETYPE_START_GROUP = 3;
  static final int WIRETYPE_VARINT;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    MESSAGE_SET_ITEM_TAG = makeTag(k, i);
    MESSAGE_SET_ITEM_END_TAG = makeTag(k, 4);
    MESSAGE_SET_TYPE_ID_TAG = makeTag(j, 0);
    MESSAGE_SET_MESSAGE_TAG = makeTag(i, j);
  }
  
  public static int getTagFieldNumber(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  static int getTagWireType(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  static int makeTag(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/WireFormatMicro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */