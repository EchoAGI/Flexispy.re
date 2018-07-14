package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class Soundex
  implements StringEncoder
{
  public static final Soundex US_ENGLISH;
  public static final char[] US_ENGLISH_MAPPING = "01230120022455012623010202".toCharArray();
  public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
  private int maxLength = 4;
  private final char[] soundexMapping;
  
  static
  {
    Soundex localSoundex = new org/apache/commons/codec/language/Soundex;
    localSoundex.<init>();
    US_ENGLISH = localSoundex;
  }
  
  public Soundex()
  {
    char[] arrayOfChar = US_ENGLISH_MAPPING;
    this.soundexMapping = arrayOfChar;
  }
  
  public Soundex(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    this.soundexMapping = arrayOfChar;
  }
  
  public Soundex(char[] paramArrayOfChar)
  {
    char[] arrayOfChar = new char[paramArrayOfChar.length];
    this.soundexMapping = arrayOfChar;
    arrayOfChar = this.soundexMapping;
    int i = paramArrayOfChar.length;
    System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, i);
  }
  
  private char getMappingCode(String paramString, int paramInt)
  {
    char c1 = 'W';
    char c2 = 'H';
    int i = paramString.charAt(paramInt);
    int j = map(i);
    i = 1;
    if (paramInt > i)
    {
      i = 48;
      if (j != i)
      {
        i = paramInt + -1;
        int k = paramString.charAt(i);
        if ((c2 == k) || (c1 == k))
        {
          i = paramInt + -2;
          char c3 = paramString.charAt(i);
          int m = map(c3);
          if ((m == j) || (c2 == c3) || (c1 == c3)) {
            j = 0;
          }
        }
      }
    }
    return j;
  }
  
  private char[] getSoundexMapping()
  {
    return this.soundexMapping;
  }
  
  private char map(char paramChar)
  {
    int i = paramChar + '﾿';
    Object localObject1;
    if (i >= 0)
    {
      localObject1 = getSoundexMapping();
      int j = localObject1.length;
      if (i < j) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "The character is not mapped: " + paramChar;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return getSoundexMapping()[i];
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
      localEncoderException.<init>("Parameter supplied to Soundex encode is not of type java.lang.String");
      throw localEncoderException;
    }
    paramObject = (String)paramObject;
    return soundex((String)paramObject);
  }
  
  public String encode(String paramString)
  {
    return soundex(paramString);
  }
  
  public int getMaxLength()
  {
    return this.maxLength;
  }
  
  public void setMaxLength(int paramInt)
  {
    this.maxLength = paramInt;
  }
  
  public String soundex(String paramString)
  {
    if (paramString == null) {
      i = 0;
    }
    for (String str = null;; str = paramString)
    {
      return str;
      paramString = SoundexUtils.clean(paramString);
      i = paramString.length();
      if (i != 0) {
        break;
      }
    }
    char[] arrayOfChar = new char[4];
    char[] tmp36_34 = arrayOfChar;
    char[] tmp37_36 = tmp36_34;
    char[] tmp37_36 = tmp36_34;
    tmp37_36[0] = 48;
    tmp37_36[1] = 48;
    tmp37_36[2] = 48;
    tmp37_36[3] = 48;
    int j = 1;
    int k = 1;
    int i = paramString.charAt(0);
    arrayOfChar[0] = i;
    int m = getMappingCode(paramString, 0);
    for (;;)
    {
      i = paramString.length();
      int n;
      if (j < i)
      {
        i = arrayOfChar.length;
        if (k < i)
        {
          n = j + 1;
          int i1 = getMappingCode(paramString, j);
          if (i1 == 0) {
            break label177;
          }
          i = 48;
          if ((i1 != i) && (i1 != m))
          {
            int i2 = k + 1;
            arrayOfChar[k] = i1;
            k = i2;
          }
          m = i1;
          j = n;
          continue;
        }
      }
      str = new java/lang/String;
      str.<init>(arrayOfChar);
      break;
      label177:
      j = n;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/Soundex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */