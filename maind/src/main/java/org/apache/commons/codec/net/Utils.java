package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

class Utils
{
  static int digit16(byte paramByte)
  {
    char c = (char)paramByte;
    int j = 16;
    int k = Character.digit(c, j);
    int i = -1;
    if (k == i)
    {
      DecoderException localDecoderException = new org/apache/commons/codec/DecoderException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "Invalid URL encoding: not a valid digit (radix 16): " + paramByte;
      localDecoderException.<init>((String)localObject);
      throw localDecoderException;
    }
    return k;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/net/Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */