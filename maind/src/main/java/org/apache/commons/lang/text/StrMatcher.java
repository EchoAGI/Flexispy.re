package org.apache.commons.lang.text;

public abstract class StrMatcher
{
  private static final StrMatcher COMMA_MATCHER;
  private static final StrMatcher DOUBLE_QUOTE_MATCHER;
  private static final StrMatcher NONE_MATCHER;
  private static final StrMatcher QUOTE_MATCHER;
  private static final StrMatcher SINGLE_QUOTE_MATCHER;
  private static final StrMatcher SPACE_MATCHER;
  private static final StrMatcher SPLIT_MATCHER;
  private static final StrMatcher TAB_MATCHER;
  private static final StrMatcher TRIM_MATCHER;
  
  static
  {
    Object localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    ((StrMatcher.CharMatcher)localObject).<init>(',');
    COMMA_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    ((StrMatcher.CharMatcher)localObject).<init>('\t');
    TAB_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    ((StrMatcher.CharMatcher)localObject).<init>(' ');
    SPACE_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharSetMatcher;
    char[] arrayOfChar = " \t\n\r\f".toCharArray();
    ((StrMatcher.CharSetMatcher)localObject).<init>(arrayOfChar);
    SPLIT_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$TrimMatcher;
    ((StrMatcher.TrimMatcher)localObject).<init>();
    TRIM_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    ((StrMatcher.CharMatcher)localObject).<init>('\'');
    SINGLE_QUOTE_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    ((StrMatcher.CharMatcher)localObject).<init>('"');
    DOUBLE_QUOTE_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$CharSetMatcher;
    arrayOfChar = "'\"".toCharArray();
    ((StrMatcher.CharSetMatcher)localObject).<init>(arrayOfChar);
    QUOTE_MATCHER = (StrMatcher)localObject;
    localObject = new org/apache/commons/lang/text/StrMatcher$NoMatcher;
    ((StrMatcher.NoMatcher)localObject).<init>();
    NONE_MATCHER = (StrMatcher)localObject;
  }
  
  public static StrMatcher charMatcher(char paramChar)
  {
    StrMatcher.CharMatcher localCharMatcher = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
    localCharMatcher.<init>(paramChar);
    return localCharMatcher;
  }
  
  public static StrMatcher charSetMatcher(String paramString)
  {
    int i;
    Object localObject;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      localObject = NONE_MATCHER;
    }
    for (;;)
    {
      return (StrMatcher)localObject;
      i = paramString.length();
      int j = 1;
      char[] arrayOfChar;
      if (i == j)
      {
        localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
        arrayOfChar = null;
        j = paramString.charAt(0);
        ((StrMatcher.CharMatcher)localObject).<init>(j);
      }
      else
      {
        localObject = new org/apache/commons/lang/text/StrMatcher$CharSetMatcher;
        arrayOfChar = paramString.toCharArray();
        ((StrMatcher.CharSetMatcher)localObject).<init>(arrayOfChar);
      }
    }
  }
  
  public static StrMatcher charSetMatcher(char[] paramArrayOfChar)
  {
    int i;
    Object localObject;
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      if (i != 0) {}
    }
    else
    {
      localObject = NONE_MATCHER;
    }
    for (;;)
    {
      return (StrMatcher)localObject;
      i = paramArrayOfChar.length;
      int j = 1;
      if (i == j)
      {
        localObject = new org/apache/commons/lang/text/StrMatcher$CharMatcher;
        j = paramArrayOfChar[0];
        ((StrMatcher.CharMatcher)localObject).<init>(j);
      }
      else
      {
        localObject = new org/apache/commons/lang/text/StrMatcher$CharSetMatcher;
        ((StrMatcher.CharSetMatcher)localObject).<init>(paramArrayOfChar);
      }
    }
  }
  
  public static StrMatcher commaMatcher()
  {
    return COMMA_MATCHER;
  }
  
  public static StrMatcher doubleQuoteMatcher()
  {
    return DOUBLE_QUOTE_MATCHER;
  }
  
  public static StrMatcher noneMatcher()
  {
    return NONE_MATCHER;
  }
  
  public static StrMatcher quoteMatcher()
  {
    return QUOTE_MATCHER;
  }
  
  public static StrMatcher singleQuoteMatcher()
  {
    return SINGLE_QUOTE_MATCHER;
  }
  
  public static StrMatcher spaceMatcher()
  {
    return SPACE_MATCHER;
  }
  
  public static StrMatcher splitMatcher()
  {
    return SPLIT_MATCHER;
  }
  
  public static StrMatcher stringMatcher(String paramString)
  {
    Object localObject;
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      localObject = NONE_MATCHER;
    }
    for (;;)
    {
      return (StrMatcher)localObject;
      localObject = new org/apache/commons/lang/text/StrMatcher$StringMatcher;
      ((StrMatcher.StringMatcher)localObject).<init>(paramString);
    }
  }
  
  public static StrMatcher tabMatcher()
  {
    return TAB_MATCHER;
  }
  
  public static StrMatcher trimMatcher()
  {
    return TRIM_MATCHER;
  }
  
  public int isMatch(char[] paramArrayOfChar, int paramInt)
  {
    int i = paramArrayOfChar.length;
    return isMatch(paramArrayOfChar, paramInt, 0, i);
  }
  
  public abstract int isMatch(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrMatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */