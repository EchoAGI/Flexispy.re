package org.apache.commons.lang;

public class CharUtils
{
  private static final Character[] CHAR_ARRAY;
  private static final String CHAR_STRING = "\000\001\002\003\004\005\006\007\b\t\n\013\f\r\016\017\020\021\022\023\024\025\026\027\030\031\032\033\034\035\036\037 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
  private static final String[] CHAR_STRING_ARRAY;
  public static final char CR = '\r';
  public static final char LF = '\n';
  
  static
  {
    int i = 128;
    CHAR_STRING_ARRAY = new String[i];
    Object localObject1 = new Character[i];
    CHAR_ARRAY = (Character[])localObject1;
    int j = 127;
    while (j >= 0)
    {
      localObject1 = CHAR_STRING_ARRAY;
      int k = j + 1;
      Object localObject2 = "\000\001\002\003\004\005\006\007\b\t\n\013\f\r\016\017\020\021\022\023\024\025\026\027\030\031\032\033\034\035\036\037 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".substring(j, k);
      localObject1[j] = localObject2;
      localObject1 = CHAR_ARRAY;
      localObject2 = new java/lang/Character;
      k = (char)j;
      ((Character)localObject2).<init>(k);
      localObject1[j] = localObject2;
      j += -1;
    }
  }
  
  public static boolean isAscii(char paramChar)
  {
    char c = '';
    if (paramChar < c) {}
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiAlpha(char paramChar)
  {
    char c = 'A';
    if (paramChar >= c)
    {
      c = 'Z';
      if (paramChar <= c) {}
    }
    else
    {
      c = 'a';
      if (paramChar < c) {
        break label36;
      }
      c = 'z';
      if (paramChar > c) {
        break label36;
      }
    }
    label36:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiAlphaLower(char paramChar)
  {
    char c = 'a';
    if (paramChar >= c)
    {
      c = 'z';
      if (paramChar > c) {}
    }
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiAlphaUpper(char paramChar)
  {
    char c = 'A';
    if (paramChar >= c)
    {
      c = 'Z';
      if (paramChar > c) {}
    }
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiAlphanumeric(char paramChar)
  {
    char c = 'A';
    if (paramChar >= c)
    {
      c = 'Z';
      if (paramChar <= c) {}
    }
    else
    {
      c = 'a';
      if (paramChar >= c)
      {
        c = 'z';
        if (paramChar <= c) {}
      }
      else
      {
        c = '0';
        if (paramChar < c) {
          break label52;
        }
        c = '9';
        if (paramChar > c) {
          break label52;
        }
      }
    }
    label52:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiControl(char paramChar)
  {
    char c = ' ';
    if (paramChar >= c)
    {
      c = '';
      if (paramChar != c) {
        break label20;
      }
    }
    label20:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiNumeric(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar > c) {}
    }
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static boolean isAsciiPrintable(char paramChar)
  {
    char c = ' ';
    if (paramChar >= c)
    {
      c = '';
      if (paramChar >= c) {}
    }
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static char toChar(Character paramCharacter)
  {
    if (paramCharacter == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The Character must not be null");
      throw localIllegalArgumentException;
    }
    return paramCharacter.charValue();
  }
  
  public static char toChar(Character paramCharacter, char paramChar)
  {
    if (paramCharacter == null) {}
    for (;;)
    {
      return paramChar;
      paramChar = paramCharacter.charValue();
    }
  }
  
  public static char toChar(String paramString)
  {
    boolean bool = StringUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The String must not be empty");
      throw localIllegalArgumentException;
    }
    return paramString.charAt(0);
  }
  
  public static char toChar(String paramString, char paramChar)
  {
    boolean bool = StringUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return paramChar;
      bool = false;
      paramChar = paramString.charAt(0);
    }
  }
  
  public static Character toCharacterObject(char paramChar)
  {
    Object localObject = CHAR_ARRAY;
    char c = localObject.length;
    if (paramChar < c) {
      localObject = CHAR_ARRAY[paramChar];
    }
    for (;;)
    {
      return (Character)localObject;
      localObject = new java/lang/Character;
      ((Character)localObject).<init>(paramChar);
    }
  }
  
  public static Character toCharacterObject(String paramString)
  {
    boolean bool = StringUtils.isEmpty(paramString);
    if (bool) {
      bool = false;
    }
    char c;
    for (Character localCharacter = null;; localCharacter = toCharacterObject(c))
    {
      return localCharacter;
      c = paramString.charAt(0);
    }
  }
  
  public static int toIntValue(char paramChar)
  {
    boolean bool = isAsciiNumeric(paramChar);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "The character " + paramChar + " is not in the range '0' - '9'";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramChar + '￐';
  }
  
  public static int toIntValue(char paramChar, int paramInt)
  {
    boolean bool = isAsciiNumeric(paramChar);
    if (!bool) {}
    for (;;)
    {
      return paramInt;
      paramInt = paramChar + '￐';
    }
  }
  
  public static int toIntValue(Character paramCharacter)
  {
    if (paramCharacter == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The character must not be null");
      throw localIllegalArgumentException;
    }
    return toIntValue(paramCharacter.charValue());
  }
  
  public static int toIntValue(Character paramCharacter, int paramInt)
  {
    if (paramCharacter == null) {}
    for (;;)
    {
      return paramInt;
      char c = paramCharacter.charValue();
      paramInt = toIntValue(c, paramInt);
    }
  }
  
  public static String toString(char paramChar)
  {
    char c = '';
    String str;
    if (paramChar < c) {
      str = CHAR_STRING_ARRAY[paramChar];
    }
    for (;;)
    {
      return str;
      str = new java/lang/String;
      int i = 1;
      char[] arrayOfChar = new char[i];
      arrayOfChar[0] = paramChar;
      str.<init>(arrayOfChar);
    }
  }
  
  public static String toString(Character paramCharacter)
  {
    char c;
    if (paramCharacter == null) {
      c = '\000';
    }
    for (String str = null;; str = toString(c))
    {
      return str;
      c = paramCharacter.charValue();
    }
  }
  
  public static String unicodeEscaped(char paramChar)
  {
    char c = '\020';
    Object localObject;
    String str;
    if (paramChar < c)
    {
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("\\u000");
      str = Integer.toHexString(paramChar);
      localObject = str;
    }
    for (;;)
    {
      return (String)localObject;
      c = 'Ā';
      if (paramChar < c)
      {
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append("\\u00");
        str = Integer.toHexString(paramChar);
        localObject = str;
      }
      else
      {
        c = 'က';
        if (paramChar < c)
        {
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          localObject = ((StringBuffer)localObject).append("\\u0");
          str = Integer.toHexString(paramChar);
          localObject = str;
        }
        else
        {
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          localObject = ((StringBuffer)localObject).append("\\u");
          str = Integer.toHexString(paramChar);
          localObject = str;
        }
      }
    }
  }
  
  public static String unicodeEscaped(Character paramCharacter)
  {
    char c;
    if (paramCharacter == null) {
      c = '\000';
    }
    for (String str = null;; str = unicodeEscaped(c))
    {
      return str;
      c = paramCharacter.charValue();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */