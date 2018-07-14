package org.apache.commons.lang;

import java.io.Serializable;
import java.util.Iterator;

public final class CharRange
  implements Serializable
{
  private static final long serialVersionUID = 8270183163158333422L;
  private final char end;
  private transient String iToString;
  private final boolean negated;
  private final char start;
  
  public CharRange(char paramChar)
  {
    this(paramChar, paramChar, false);
  }
  
  public CharRange(char paramChar1, char paramChar2)
  {
    this(paramChar1, paramChar2, false);
  }
  
  public CharRange(char paramChar1, char paramChar2, boolean paramBoolean)
  {
    if (paramChar1 > paramChar2)
    {
      char c = paramChar1;
      paramChar1 = paramChar2;
      paramChar2 = c;
    }
    this.start = paramChar1;
    this.end = paramChar2;
    this.negated = paramBoolean;
  }
  
  public CharRange(char paramChar, boolean paramBoolean)
  {
    this(paramChar, paramChar, paramBoolean);
  }
  
  public static CharRange is(char paramChar)
  {
    CharRange localCharRange = new org/apache/commons/lang/CharRange;
    localCharRange.<init>(paramChar, paramChar, false);
    return localCharRange;
  }
  
  public static CharRange isIn(char paramChar1, char paramChar2)
  {
    CharRange localCharRange = new org/apache/commons/lang/CharRange;
    localCharRange.<init>(paramChar1, paramChar2, false);
    return localCharRange;
  }
  
  public static CharRange isNot(char paramChar)
  {
    CharRange localCharRange = new org/apache/commons/lang/CharRange;
    localCharRange.<init>(paramChar, paramChar, true);
    return localCharRange;
  }
  
  public static CharRange isNotIn(char paramChar1, char paramChar2)
  {
    CharRange localCharRange = new org/apache/commons/lang/CharRange;
    localCharRange.<init>(paramChar1, paramChar2, true);
    return localCharRange;
  }
  
  public boolean contains(char paramChar)
  {
    char c1 = '\001';
    char c2 = this.start;
    if (paramChar >= c2)
    {
      c2 = this.end;
      if (paramChar <= c2)
      {
        c2 = c1;
        char c3 = this.negated;
        if (c2 == c3) {
          break label43;
        }
      }
    }
    for (;;)
    {
      return c1;
      c2 = '\000';
      break;
      label43:
      c1 = '\000';
    }
  }
  
  public boolean contains(CharRange paramCharRange)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    IllegalArgumentException localIllegalArgumentException;
    if (paramCharRange == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Range must not be null");
      throw localIllegalArgumentException;
    }
    boolean bool3 = this.negated;
    int i;
    int k;
    if (bool3)
    {
      bool3 = paramCharRange.negated;
      if (bool3)
      {
        i = this.start;
        k = paramCharRange.start;
        if (i >= k)
        {
          i = this.end;
          k = paramCharRange.end;
          if (i > k) {}
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localIllegalArgumentException = null;
      f1 = 0.0F;
      continue;
      i = paramCharRange.end;
      k = this.start;
      if (i >= k)
      {
        i = paramCharRange.start;
        k = this.end;
        if (i <= k) {}
      }
      else
      {
        bool2 = bool1;
        f2 = f1;
      }
      bool1 = bool2;
      f1 = f2;
      continue;
      boolean bool4 = paramCharRange.negated;
      int j;
      if (bool4)
      {
        j = this.start;
        if (j == 0)
        {
          j = this.end;
          k = (char)-1;
          if (j == k) {}
        }
        else
        {
          bool1 = false;
          localIllegalArgumentException = null;
          f1 = 0.0F;
        }
      }
      else
      {
        j = this.start;
        k = paramCharRange.start;
        if (j <= k)
        {
          j = this.end;
          k = paramCharRange.end;
          if (j >= k) {}
        }
        else
        {
          bool1 = false;
          localIllegalArgumentException = null;
          f1 = 0.0F;
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof CharRange;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        Object localObject = paramObject;
        localObject = (CharRange)paramObject;
        int i = this.start;
        int j = ((CharRange)localObject).start;
        if (i == j)
        {
          i = this.end;
          j = ((CharRange)localObject).end;
          if (i == j)
          {
            boolean bool3 = this.negated;
            boolean bool4 = ((CharRange)localObject).negated;
            if (bool3 == bool4) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public char getEnd()
  {
    return this.end;
  }
  
  public char getStart()
  {
    return this.start;
  }
  
  public int hashCode()
  {
    int i = this.start + 'S';
    int k = this.end * '\007' + i;
    int j = this.negated;
    if (j != 0) {}
    for (j = 1;; j = 0) {
      return j + k;
    }
  }
  
  public boolean isNegated()
  {
    return this.negated;
  }
  
  public Iterator iterator()
  {
    CharRange.CharacterIterator localCharacterIterator = new org/apache/commons/lang/CharRange$CharacterIterator;
    localCharacterIterator.<init>(this, null);
    return localCharacterIterator;
  }
  
  public String toString()
  {
    String str = this.iToString;
    if (str == null)
    {
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(4);
      boolean bool = isNegated();
      if (bool)
      {
        c1 = '^';
        localStringBuffer.append(c1);
      }
      char c1 = this.start;
      localStringBuffer.append(c1);
      c1 = this.start;
      char c2 = this.end;
      if (c1 != c2)
      {
        localStringBuffer.append('-');
        c1 = this.end;
        localStringBuffer.append(c1);
      }
      str = localStringBuffer.toString();
      this.iToString = str;
    }
    return this.iToString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharRange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */