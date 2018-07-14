package org.apache.commons.lang.text;

final class StrMatcher$StringMatcher
  extends StrMatcher
{
  private final char[] chars;
  
  StrMatcher$StringMatcher(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    this.chars = arrayOfChar;
  }
  
  public int isMatch(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    char[] arrayOfChar = this.chars;
    int i = arrayOfChar.length;
    int j = paramInt1 + i;
    if (j > paramInt3)
    {
      i = 0;
      return i;
    }
    int k = 0;
    for (;;)
    {
      arrayOfChar = this.chars;
      j = arrayOfChar.length;
      if (k >= j) {
        break;
      }
      arrayOfChar = this.chars;
      j = arrayOfChar[k];
      int m = paramArrayOfChar[paramInt1];
      if (j != m)
      {
        i = 0;
        break;
      }
      k += 1;
      paramInt1 += 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrMatcher$StringMatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */