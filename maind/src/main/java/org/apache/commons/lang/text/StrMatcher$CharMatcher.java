package org.apache.commons.lang.text;

final class StrMatcher$CharMatcher
  extends StrMatcher
{
  private final char ch;
  
  StrMatcher$CharMatcher(char paramChar)
  {
    this.ch = paramChar;
  }
  
  public int isMatch(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.ch;
    int j = paramArrayOfChar[paramInt1];
    if (i == j) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrMatcher$CharMatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */