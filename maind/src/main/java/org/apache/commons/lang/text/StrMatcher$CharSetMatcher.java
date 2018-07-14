package org.apache.commons.lang.text;

import java.util.Arrays;

final class StrMatcher$CharSetMatcher
  extends StrMatcher
{
  private final char[] chars;
  
  StrMatcher$CharSetMatcher(char[] paramArrayOfChar)
  {
    char[] arrayOfChar = (char[])paramArrayOfChar.clone();
    this.chars = arrayOfChar;
    Arrays.sort(this.chars);
  }
  
  public int isMatch(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    char[] arrayOfChar = this.chars;
    char c = paramArrayOfChar[paramInt1];
    int i = Arrays.binarySearch(arrayOfChar, c);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = 0;
      arrayOfChar = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrMatcher$CharSetMatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */