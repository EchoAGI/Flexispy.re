package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class Metaphone
  implements StringEncoder
{
  private static final String FRONTV = "EIY";
  private static final String VARSON = "CSPTG";
  private static final String VOWELS = "AEIOU";
  private int maxCodeLen = 4;
  
  private boolean isLastChar(int paramInt1, int paramInt2)
  {
    int i = paramInt2 + 1;
    if (i == paramInt1) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private boolean isNextChar(StringBuffer paramStringBuffer, int paramInt, char paramChar)
  {
    boolean bool = false;
    if (paramInt >= 0)
    {
      int i = paramStringBuffer.length() + -1;
      if (paramInt < i)
      {
        i = paramInt + 1;
        i = paramStringBuffer.charAt(i);
        if (i != paramChar) {
          break label46;
        }
      }
    }
    label46:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean isPreviousChar(StringBuffer paramStringBuffer, int paramInt, char paramChar)
  {
    boolean bool = false;
    if (paramInt > 0)
    {
      int i = paramStringBuffer.length();
      if (paramInt < i)
      {
        i = paramInt + -1;
        i = paramStringBuffer.charAt(i);
        if (i != paramChar) {
          break label44;
        }
      }
    }
    label44:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean isVowel(StringBuffer paramStringBuffer, int paramInt)
  {
    String str = "AEIOU";
    int i = paramStringBuffer.charAt(paramInt);
    int j = str.indexOf(i);
    if (j >= 0) {
      j = 1;
    }
    for (;;)
    {
      return j;
      int k = 0;
      str = null;
    }
  }
  
  private boolean regionMatch(StringBuffer paramStringBuffer, int paramInt, String paramString)
  {
    boolean bool = false;
    if (paramInt >= 0)
    {
      int i = paramString.length() + paramInt + -1;
      int j = paramStringBuffer.length();
      if (i < j)
      {
        i = paramString.length() + paramInt;
        String str = paramStringBuffer.substring(paramInt, i);
        bool = str.equals(paramString);
      }
    }
    return bool;
  }
  
  public Object encode(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (!bool)
    {
      EncoderException localEncoderException = new org/apache/commons/codec/EncoderException;
      localEncoderException.<init>("Parameter supplied to Metaphone encode is not of type java.lang.String");
      throw localEncoderException;
    }
    paramObject = (String)paramObject;
    return metaphone((String)paramObject);
  }
  
  public String encode(String paramString)
  {
    return metaphone(paramString);
  }
  
  public int getMaxCodeLen()
  {
    return this.maxCodeLen;
  }
  
  public boolean isMetaphoneEqual(String paramString1, String paramString2)
  {
    String str1 = metaphone(paramString1);
    String str2 = metaphone(paramString2);
    return str1.equals(str2);
  }
  
  public String metaphone(String paramString)
  {
    char c1 = 'X';
    char c2 = 'K';
    char c3 = 'S';
    int i = 72;
    int j = 1;
    int k = 0;
    int m;
    Object localObject;
    if (paramString != null)
    {
      m = paramString.length();
      if (m != 0) {}
    }
    else
    {
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      m = paramString.length();
      if (m == j)
      {
        localObject = Locale.ENGLISH;
        localObject = paramString.toUpperCase((Locale)localObject);
      }
      else
      {
        localObject = Locale.ENGLISH;
        char[] arrayOfChar = paramString.toUpperCase((Locale)localObject).toCharArray();
        StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
        localStringBuffer1.<init>(40);
        StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
        localStringBuffer2.<init>(10);
        localObject = null;
        m = arrayOfChar[0];
        switch (m)
        {
        default: 
          localStringBuffer1.append(arrayOfChar);
        }
        int i13;
        int i14;
        int i20;
        for (;;)
        {
          i13 = localStringBuffer1.length();
          i14 = 0;
          for (;;)
          {
            m = localStringBuffer2.length();
            int i15 = getMaxCodeLen();
            if ((m >= i15) || (i14 >= i13)) {
              break label1846;
            }
            i20 = localStringBuffer1.charAt(i14);
            m = 67;
            if (i20 == m) {
              break;
            }
            boolean bool1 = isPreviousChar(localStringBuffer1, i14, i20);
            if (!bool1) {
              break;
            }
            i14 += 1;
            n = localStringBuffer2.length();
            i15 = getMaxCodeLen();
            if (n > i15)
            {
              n = getMaxCodeLen();
              localStringBuffer2.setLength(n);
            }
          }
          int n = arrayOfChar[j];
          int i16 = 78;
          if (n == i16)
          {
            n = arrayOfChar.length + -1;
            localStringBuffer1.append(arrayOfChar, j, n);
          }
          else
          {
            localStringBuffer1.append(arrayOfChar);
            continue;
            n = arrayOfChar[j];
            int i17 = 69;
            if (n == i17)
            {
              n = arrayOfChar.length + -1;
              localStringBuffer1.append(arrayOfChar, j, n);
            }
            else
            {
              localStringBuffer1.append(arrayOfChar);
              continue;
              n = arrayOfChar[j];
              int i18 = 82;
              if (n == i18)
              {
                n = arrayOfChar.length + -1;
                localStringBuffer1.append(arrayOfChar, j, n);
              }
              else
              {
                n = arrayOfChar[j];
                int i1;
                if (n == i)
                {
                  i1 = arrayOfChar.length + -1;
                  localStringBuffer1.append(arrayOfChar, j, i1);
                  i1 = 0;
                  localObject = null;
                  char c7 = 'W';
                  localStringBuffer1.setCharAt(0, c7);
                }
                else
                {
                  localStringBuffer1.append(arrayOfChar);
                  continue;
                  i1 = 0;
                  localObject = null;
                  arrayOfChar[0] = c3;
                  localStringBuffer1.append(arrayOfChar);
                }
              }
            }
          }
        }
        switch (i20)
        {
        }
        for (;;)
        {
          i14 += 1;
          break;
          if (i14 == 0)
          {
            localStringBuffer2.append(i20);
            continue;
            boolean bool2 = isPreviousChar(localStringBuffer1, i14, 'M');
            if (bool2)
            {
              bool2 = isLastChar(i13, i14);
              if (bool2) {}
            }
            else
            {
              localStringBuffer2.append(i20);
              continue;
              bool2 = isPreviousChar(localStringBuffer1, i14, c3);
              int i19;
              if (bool2)
              {
                bool2 = isLastChar(i13, i14);
                if (!bool2)
                {
                  localObject = "EIY";
                  i19 = i14 + 1;
                  i19 = localStringBuffer1.charAt(i19);
                  int i2 = ((String)localObject).indexOf(i19);
                  if (i2 >= 0) {
                    continue;
                  }
                }
              }
              localObject = "CIA";
              boolean bool3 = regionMatch(localStringBuffer1, i14, (String)localObject);
              if (bool3)
              {
                localStringBuffer2.append(c1);
              }
              else
              {
                bool3 = isLastChar(i13, i14);
                if (!bool3)
                {
                  localObject = "EIY";
                  i19 = i14 + 1;
                  i19 = localStringBuffer1.charAt(i19);
                  int i3 = ((String)localObject).indexOf(i19);
                  if (i3 >= 0)
                  {
                    localStringBuffer2.append(c3);
                    continue;
                  }
                }
                boolean bool4 = isPreviousChar(localStringBuffer1, i14, c3);
                if (bool4)
                {
                  bool4 = isNextChar(localStringBuffer1, i14, i);
                  if (bool4)
                  {
                    localStringBuffer2.append(c2);
                    continue;
                  }
                }
                bool4 = isNextChar(localStringBuffer1, i14, i);
                if (bool4)
                {
                  if (i14 == 0)
                  {
                    int i4 = 3;
                    if (i13 >= i4)
                    {
                      boolean bool5 = isVowel(localStringBuffer1, 2);
                      if (bool5)
                      {
                        localStringBuffer2.append(c2);
                        continue;
                      }
                    }
                  }
                  localStringBuffer2.append(c1);
                }
                else
                {
                  localStringBuffer2.append(c2);
                  continue;
                  int i5 = i14 + 1;
                  boolean bool6 = isLastChar(i13, i5);
                  if (!bool6)
                  {
                    bool6 = isNextChar(localStringBuffer1, i14, 'G');
                    if (bool6)
                    {
                      localObject = "EIY";
                      i19 = i14 + 2;
                      i19 = localStringBuffer1.charAt(i19);
                      int i6 = ((String)localObject).indexOf(i19);
                      if (i6 >= 0)
                      {
                        i6 = 74;
                        localStringBuffer2.append(i6);
                        i14 += 2;
                        continue;
                      }
                    }
                  }
                  char c4 = 'T';
                  localStringBuffer2.append(c4);
                  continue;
                  int i7 = i14 + 1;
                  boolean bool7 = isLastChar(i13, i7);
                  if (bool7)
                  {
                    bool7 = isNextChar(localStringBuffer1, i14, i);
                    if (bool7) {}
                  }
                  else
                  {
                    int i8 = i14 + 1;
                    boolean bool8 = isLastChar(i13, i8);
                    boolean bool9;
                    if (!bool8)
                    {
                      bool8 = isNextChar(localStringBuffer1, i14, i);
                      if (bool8)
                      {
                        int i9 = i14 + 2;
                        bool9 = isVowel(localStringBuffer1, i9);
                        if (!bool9) {
                          continue;
                        }
                      }
                    }
                    if (i14 > 0)
                    {
                      localObject = "GN";
                      bool9 = regionMatch(localStringBuffer1, i14, (String)localObject);
                      if (!bool9)
                      {
                        localObject = "GNED";
                        bool9 = regionMatch(localStringBuffer1, i14, (String)localObject);
                        if (bool9) {}
                      }
                    }
                    else
                    {
                      bool9 = isPreviousChar(localStringBuffer1, i14, 'G');
                      if (bool9) {}
                      for (k = 1;; k = 0)
                      {
                        bool9 = isLastChar(i13, i14);
                        if (bool9) {
                          break label1344;
                        }
                        localObject = "EIY";
                        i19 = i14 + 1;
                        i19 = localStringBuffer1.charAt(i19);
                        int i10 = ((String)localObject).indexOf(i19);
                        if ((i10 < 0) || (k != 0)) {
                          break label1344;
                        }
                        i10 = 74;
                        localStringBuffer2.append(i10);
                        break;
                      }
                      label1344:
                      localStringBuffer2.append(c2);
                      continue;
                      boolean bool10 = isLastChar(i13, i14);
                      if (!bool10)
                      {
                        int i11;
                        if (i14 > 0)
                        {
                          localObject = "CSPTG";
                          i19 = i14 + -1;
                          i19 = localStringBuffer1.charAt(i19);
                          i11 = ((String)localObject).indexOf(i19);
                          if (i11 >= 0) {}
                        }
                        else
                        {
                          i11 = i14 + 1;
                          boolean bool11 = isVowel(localStringBuffer1, i11);
                          if (bool11)
                          {
                            localStringBuffer2.append(i);
                            continue;
                            localStringBuffer2.append(i20);
                            continue;
                            if (i14 > 0)
                            {
                              bool11 = isPreviousChar(localStringBuffer1, i14, 'C');
                              if (!bool11) {
                                localStringBuffer2.append(i20);
                              }
                            }
                            else
                            {
                              localStringBuffer2.append(i20);
                              continue;
                              bool11 = isNextChar(localStringBuffer1, i14, i);
                              if (bool11)
                              {
                                char c5 = 'F';
                                localStringBuffer2.append(c5);
                              }
                              else
                              {
                                localStringBuffer2.append(i20);
                                continue;
                                localStringBuffer2.append(c2);
                                continue;
                                localObject = "SH";
                                boolean bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                if (!bool12)
                                {
                                  localObject = "SIO";
                                  bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                  if (!bool12)
                                  {
                                    localObject = "SIA";
                                    bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                    if (!bool12) {
                                      break label1620;
                                    }
                                  }
                                }
                                localStringBuffer2.append(c1);
                                continue;
                                label1620:
                                localStringBuffer2.append(c3);
                                continue;
                                localObject = "TIA";
                                bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                if (!bool12)
                                {
                                  localObject = "TIO";
                                  bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                  if (!bool12) {}
                                }
                                else
                                {
                                  localStringBuffer2.append(c1);
                                  continue;
                                }
                                localObject = "TCH";
                                bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                if (!bool12)
                                {
                                  localObject = "TH";
                                  bool12 = regionMatch(localStringBuffer1, i14, (String)localObject);
                                  char c6;
                                  if (bool12)
                                  {
                                    c6 = '0';
                                    localStringBuffer2.append(c6);
                                  }
                                  else
                                  {
                                    c6 = 'T';
                                    localStringBuffer2.append(c6);
                                    continue;
                                    c6 = 'F';
                                    localStringBuffer2.append(c6);
                                    continue;
                                    boolean bool13 = isLastChar(i13, i14);
                                    if (!bool13)
                                    {
                                      int i12 = i14 + 1;
                                      boolean bool14 = isVowel(localStringBuffer1, i12);
                                      if (bool14)
                                      {
                                        localStringBuffer2.append(i20);
                                        continue;
                                        localStringBuffer2.append(c2);
                                        localStringBuffer2.append(c3);
                                        continue;
                                        localStringBuffer2.append(c3);
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
                  }
                }
              }
            }
          }
        }
        label1846:
        localObject = localStringBuffer2.toString();
      }
    }
  }
  
  public void setMaxCodeLen(int paramInt)
  {
    this.maxCodeLen = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/Metaphone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */