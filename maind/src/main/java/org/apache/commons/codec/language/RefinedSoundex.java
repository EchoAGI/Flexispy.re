package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class RefinedSoundex
  implements StringEncoder
{
  public static final RefinedSoundex US_ENGLISH;
  public static final char[] US_ENGLISH_MAPPING = "01360240043788015936020505".toCharArray();
  public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
  private final char[] soundexMapping;
  
  static
  {
    RefinedSoundex localRefinedSoundex = new org/apache/commons/codec/language/RefinedSoundex;
    localRefinedSoundex.<init>();
    US_ENGLISH = localRefinedSoundex;
  }
  
  public RefinedSoundex()
  {
    char[] arrayOfChar = US_ENGLISH_MAPPING;
    this.soundexMapping = arrayOfChar;
  }
  
  public RefinedSoundex(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    this.soundexMapping = arrayOfChar;
  }
  
  public RefinedSoundex(char[] paramArrayOfChar)
  {
    char[] arrayOfChar = new char[paramArrayOfChar.length];
    this.soundexMapping = arrayOfChar;
    arrayOfChar = this.soundexMapping;
    int i = paramArrayOfChar.length;
    System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, i);
  }
  
  public int difference(String paramString1, String paramString2)
  {
    return SoundexUtils.difference(this, paramString1, paramString2);
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
      throw localEncoderException;
    }
    paramObject = (String)paramObject;
    return soundex((String)paramObject);
  }
  
  public String encode(String paramString)
  {
    return soundex(paramString);
  }
  
  char getMappingCode(char paramChar)
  {
    int i = Character.isLetter(paramChar);
    char[] arrayOfChar;
    if (i == 0)
    {
      i = 0;
      arrayOfChar = null;
    }
    for (;;)
    {
      return i;
      arrayOfChar = this.soundexMapping;
      int k = Character.toUpperCase(paramChar) + '﾿';
      int j = arrayOfChar[k];
    }
  }
  
  public String soundex(String paramString)
  {
    int i;
    String str;
    if (paramString == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return str;
      paramString = SoundexUtils.clean(paramString);
      i = paramString.length();
      if (i == 0)
      {
        str = paramString;
      }
      else
      {
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>();
        str = null;
        i = paramString.charAt(0);
        localStringBuffer.append(i);
        int k = 42;
        int m = 0;
        int j = paramString.length();
        if (m < j)
        {
          j = paramString.charAt(m);
          char c = getMappingCode(j);
          if (c == k) {}
          for (;;)
          {
            int n;
            m += 1;
            break;
            if (c != 0) {
              localStringBuffer.append(c);
            }
            k = c;
          }
        }
        str = localStringBuffer.toString();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/RefinedSoundex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */