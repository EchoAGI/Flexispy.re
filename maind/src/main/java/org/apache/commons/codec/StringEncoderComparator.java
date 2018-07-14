package org.apache.commons.codec;

import java.util.Comparator;

public class StringEncoderComparator
  implements Comparator
{
  private final StringEncoder stringEncoder;
  
  public StringEncoderComparator()
  {
    this.stringEncoder = null;
  }
  
  public StringEncoderComparator(StringEncoder paramStringEncoder)
  {
    this.stringEncoder = paramStringEncoder;
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    i = 0;
    try
    {
      StringEncoder localStringEncoder = this.stringEncoder;
      Object localObject1 = localStringEncoder.encode(paramObject1);
      localObject1 = (Comparable)localObject1;
      localStringEncoder = this.stringEncoder;
      Object localObject2 = localStringEncoder.encode(paramObject2);
      localObject2 = (Comparable)localObject2;
      i = ((Comparable)localObject1).compareTo(localObject2);
    }
    catch (EncoderException localEncoderException)
    {
      for (;;)
      {
        i = 0;
      }
    }
    return i;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/StringEncoderComparator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */