package org.apache.commons.lang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtils
{
  public static final String EMPTY = "";
  public static final int INDEX_NOT_FOUND = 255;
  private static final int PAD_LIMIT = 8192;
  
  public static String abbreviate(String paramString, int paramInt)
  {
    return abbreviate(paramString, 0, paramInt);
  }
  
  public static String abbreviate(String paramString, int paramInt1, int paramInt2)
  {
    int i = 4;
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      Object localObject;
      if (paramInt2 < i)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Minimum abbreviation width is 4");
        throw ((Throwable)localObject);
      }
      int j = paramString.length();
      if (j > paramInt2)
      {
        j = paramString.length();
        if (paramInt1 > j) {
          paramInt1 = paramString.length();
        }
        j = paramString.length() - paramInt1;
        int k = paramInt2 + -3;
        if (j < k)
        {
          j = paramString.length();
          k = paramInt2 + -3;
          paramInt1 = j - k;
        }
        String str;
        if (paramInt1 <= i)
        {
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          k = 0;
          i = paramInt2 + -3;
          str = paramString.substring(0, i);
          localObject = ((StringBuffer)localObject).append(str);
          str = "...";
          localObject = ((StringBuffer)localObject).append(str);
          paramString = ((StringBuffer)localObject).toString();
        }
        else
        {
          j = 7;
          if (paramInt2 < j)
          {
            localObject = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject).<init>("Minimum abbreviation width with offset is 7");
            throw ((Throwable)localObject);
          }
          j = paramInt2 + -3 + paramInt1;
          k = paramString.length();
          if (j < k)
          {
            localObject = new java/lang/StringBuffer;
            ((StringBuffer)localObject).<init>();
            localObject = ((StringBuffer)localObject).append("...");
            str = paramString.substring(paramInt1);
            i = paramInt2 + -3;
            str = abbreviate(str, i);
            localObject = ((StringBuffer)localObject).append(str);
            paramString = ((StringBuffer)localObject).toString();
          }
          else
          {
            localObject = new java/lang/StringBuffer;
            ((StringBuffer)localObject).<init>();
            localObject = ((StringBuffer)localObject).append("...");
            k = paramString.length();
            i = paramInt2 + -3;
            k -= i;
            str = paramString.substring(k);
            localObject = ((StringBuffer)localObject).append(str);
            paramString = ((StringBuffer)localObject).toString();
          }
        }
      }
    }
  }
  
  public static String abbreviateMiddle(String paramString1, String paramString2, int paramInt)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      int i = paramString1.length();
      if (paramInt < i)
      {
        i = paramString2.length() + 2;
        if (paramInt >= i)
        {
          i = paramString2.length();
          int j = paramInt - i;
          i = j / 2;
          int k = j % 2;
          int m = i + k;
          i = paramString1.length();
          k = j / 2;
          int n = i - k;
          StringBuffer localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>(paramInt);
          i = 0;
          String str = paramString1.substring(0, m);
          localStringBuffer.append(str);
          localStringBuffer.append(paramString2);
          str = paramString1.substring(n);
          localStringBuffer.append(str);
          paramString1 = localStringBuffer.toString();
        }
      }
    }
  }
  
  public static String capitalise(String paramString)
  {
    return capitalize(paramString);
  }
  
  public static String capitaliseAllWords(String paramString)
  {
    return WordUtils.capitalize(paramString);
  }
  
  public static String capitalize(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(i);
      char c = Character.toTitleCase(paramString.charAt(0));
      localStringBuffer = localStringBuffer.append(c);
      c = '\001';
      String str = paramString.substring(c);
      localStringBuffer = localStringBuffer.append(str);
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String center(String paramString, int paramInt)
  {
    return center(paramString, paramInt, ' ');
  }
  
  public static String center(String paramString, int paramInt, char paramChar)
  {
    if ((paramString == null) || (paramInt <= 0)) {}
    for (;;)
    {
      return paramString;
      int i = paramString.length();
      int j = paramInt - i;
      if (j > 0)
      {
        int k = j / 2 + i;
        paramString = rightPad(leftPad(paramString, k, paramChar), paramInt, paramChar);
      }
    }
  }
  
  public static String center(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 == null) || (paramInt <= 0)) {}
    for (;;)
    {
      return paramString1;
      boolean bool = isEmpty(paramString2);
      if (bool) {
        paramString2 = " ";
      }
      int j = paramString1.length();
      int k = paramInt - j;
      if (k > 0)
      {
        int i = k / 2 + j;
        paramString1 = rightPad(leftPad(paramString1, i, paramString2), paramInt, paramString2);
      }
    }
  }
  
  public static String chomp(String paramString)
  {
    int i = 10;
    int j = 13;
    boolean bool = isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return paramString;
      k = paramString.length();
      int m = 1;
      if (k != m) {
        break;
      }
      int n = paramString.charAt(0);
      if ((n == j) || (n == i)) {
        paramString = "";
      }
    }
    int k = paramString.length();
    int i1 = k + -1;
    int i2 = paramString.charAt(i1);
    if (i2 == i)
    {
      k = i1 + -1;
      k = paramString.charAt(k);
      if (k == j) {
        i1 += -1;
      }
    }
    for (;;)
    {
      paramString = paramString.substring(0, i1);
      break;
      if (i2 != j) {
        i1 += 1;
      }
    }
  }
  
  public static String chomp(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if ((bool) || (paramString2 == null)) {}
    for (;;)
    {
      return paramString1;
      bool = paramString1.endsWith(paramString2);
      if (bool)
      {
        bool = false;
        int i = paramString1.length();
        int j = paramString2.length();
        i -= j;
        paramString1 = paramString1.substring(0, i);
      }
    }
  }
  
  public static String chompLast(String paramString)
  {
    return chompLast(paramString, "\n");
  }
  
  public static String chompLast(String paramString1, String paramString2)
  {
    int i = paramString1.length();
    if (i == 0) {}
    for (;;)
    {
      return paramString1;
      i = paramString1.length();
      int j = paramString2.length();
      i -= j;
      String str = paramString1.substring(i);
      boolean bool = paramString2.equals(str);
      if (bool)
      {
        bool = false;
        j = paramString1.length();
        int k = paramString2.length();
        j -= k;
        paramString1 = paramString1.substring(0, j);
      }
    }
  }
  
  public static String chop(String paramString)
  {
    String str;
    if (paramString == null) {
      str = null;
    }
    for (;;)
    {
      return str;
      int i = paramString.length();
      int j = 2;
      if (i < j)
      {
        str = "";
      }
      else
      {
        int k = i + -1;
        str = paramString.substring(0, k);
        int m = paramString.charAt(k);
        j = 10;
        if (m == j)
        {
          j = k + -1;
          j = str.charAt(j);
          int n = 13;
          if (j == n)
          {
            j = k + -1;
            str = str.substring(0, j);
          }
        }
      }
    }
  }
  
  public static String chopNewline(String paramString)
  {
    int i = paramString.length();
    int j = i + -1;
    String str;
    if (j <= 0)
    {
      str = "";
      return str;
    }
    int k = paramString.charAt(j);
    i = 10;
    if (k == i)
    {
      i = j + -1;
      i = paramString.charAt(i);
      int m = 13;
      if (i == m) {
        j += -1;
      }
    }
    for (;;)
    {
      i = 0;
      str = paramString.substring(0, j);
      break;
      j += 1;
    }
  }
  
  public static String clean(String paramString)
  {
    if (paramString == null) {}
    for (String str = "";; str = paramString.trim()) {
      return str;
    }
  }
  
  public static String concatenate(Object[] paramArrayOfObject)
  {
    return join(paramArrayOfObject, null);
  }
  
  public static boolean contains(String paramString, char paramChar)
  {
    boolean bool1 = false;
    boolean bool2 = isEmpty(paramString);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      int i = paramString.indexOf(paramChar);
      if (i >= 0) {
        bool1 = true;
      }
    }
  }
  
  public static boolean contains(String paramString1, String paramString2)
  {
    boolean bool = false;
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (;;)
    {
      return bool;
      int i = paramString1.indexOf(paramString2);
      if (i >= 0) {
        bool = true;
      }
    }
  }
  
  public static boolean containsAny(String paramString1, String paramString2)
  {
    boolean bool;
    char[] arrayOfChar;
    if (paramString2 == null)
    {
      bool = false;
      arrayOfChar = null;
    }
    for (;;)
    {
      return bool;
      arrayOfChar = paramString2.toCharArray();
      bool = containsAny(paramString1, arrayOfChar);
    }
  }
  
  public static boolean containsAny(String paramString, char[] paramArrayOfChar)
  {
    boolean bool = false;
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if ((i != 0) && (paramArrayOfChar != null))
      {
        i = paramArrayOfChar.length;
        if (i != 0) {
          break label28;
        }
      }
    }
    return bool;
    label28:
    int j = 0;
    for (;;)
    {
      i = paramString.length();
      if (j >= i) {
        break;
      }
      int k = paramString.charAt(j);
      int m = 0;
      for (;;)
      {
        i = paramArrayOfChar.length;
        if (m >= i) {
          break label87;
        }
        i = paramArrayOfChar[m];
        if (i == k)
        {
          bool = true;
          break;
        }
        m += 1;
      }
      label87:
      j += 1;
    }
  }
  
  public static boolean containsIgnoreCase(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if ((paramString1 == null) || (paramString2 == null)) {}
    label73:
    for (;;)
    {
      return bool2;
      int i = paramString2.length();
      int j = paramString1.length();
      int k = j - i;
      int m = 0;
      for (;;)
      {
        if (m > k) {
          break label73;
        }
        boolean bool3 = paramString1.regionMatches(bool1, m, paramString2, 0, i);
        if (bool3)
        {
          bool2 = bool1;
          break;
        }
        m += 1;
      }
    }
  }
  
  public static boolean containsNone(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    char[] arrayOfChar;
    for (boolean bool = true;; bool = containsNone(paramString1, arrayOfChar))
    {
      return bool;
      arrayOfChar = paramString2.toCharArray();
    }
  }
  
  public static boolean containsNone(String paramString, char[] paramArrayOfChar)
  {
    boolean bool = true;
    if ((paramString == null) || (paramArrayOfChar == null)) {}
    label75:
    label82:
    for (;;)
    {
      return bool;
      int i = paramString.length();
      int j = paramArrayOfChar.length;
      int k = 0;
      for (;;)
      {
        if (k >= i) {
          break label82;
        }
        int m = paramString.charAt(k);
        int n = 0;
        for (;;)
        {
          if (n >= j) {
            break label75;
          }
          int i1 = paramArrayOfChar[n];
          if (i1 == m)
          {
            bool = false;
            break;
          }
          n += 1;
        }
        k += 1;
      }
    }
  }
  
  public static boolean containsOnly(String paramString1, String paramString2)
  {
    boolean bool;
    char[] arrayOfChar;
    if ((paramString1 == null) || (paramString2 == null))
    {
      bool = false;
      arrayOfChar = null;
    }
    for (;;)
    {
      return bool;
      arrayOfChar = paramString2.toCharArray();
      bool = containsOnly(paramString1, arrayOfChar);
    }
  }
  
  public static boolean containsOnly(String paramString, char[] paramArrayOfChar)
  {
    boolean bool = true;
    if ((paramArrayOfChar == null) || (paramString == null)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      int i = paramString.length();
      if (i != 0)
      {
        i = paramArrayOfChar.length;
        if (i == 0)
        {
          bool = false;
        }
        else
        {
          i = indexOfAnyBut(paramString, paramArrayOfChar);
          int j = -1;
          if (i != j) {
            bool = false;
          }
        }
      }
    }
  }
  
  public static int countMatches(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {}
    }
    else
    {
      j = 0;
      return j;
    }
    int j = 0;
    int k = 0;
    for (;;)
    {
      k = paramString1.indexOf(paramString2, k);
      int i = -1;
      if (k == i) {
        break;
      }
      j += 1;
      i = paramString2.length();
      k += i;
    }
  }
  
  public static String defaultIfEmpty(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString2;
      paramString2 = paramString1;
    }
  }
  
  public static String defaultString(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public static String defaultString(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    for (;;)
    {
      return paramString2;
      paramString2 = paramString1;
    }
  }
  
  public static String deleteSpaces(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = CharSetUtils.delete(paramString, " \t\r\n\b")) {
      return str;
    }
  }
  
  public static String deleteWhitespace(String paramString)
  {
    boolean bool = isEmpty(paramString);
    if (bool) {
      return paramString;
    }
    int j = paramString.length();
    char[] arrayOfChar = new char[j];
    int k = 0;
    int m = 0;
    int n = 0;
    label29:
    int i;
    if (m < j)
    {
      bool = Character.isWhitespace(paramString.charAt(m));
      if (bool) {
        break label103;
      }
      k = n + 1;
      i = paramString.charAt(m);
      arrayOfChar[n] = i;
    }
    for (;;)
    {
      m += 1;
      n = k;
      break label29;
      if (n == j) {
        break;
      }
      paramString = new java/lang/String;
      i = 0;
      paramString.<init>(arrayOfChar, 0, n);
      break;
      label103:
      k = n;
    }
  }
  
  public static String difference(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    for (;;)
    {
      return paramString2;
      if (paramString2 == null)
      {
        paramString2 = paramString1;
      }
      else
      {
        int i = indexOfDifference(paramString1, paramString2);
        int j = -1;
        if (i == j) {
          paramString2 = "";
        } else {
          paramString2 = paramString2.substring(i);
        }
      }
    }
  }
  
  public static boolean endsWith(String paramString1, String paramString2)
  {
    return endsWith(paramString1, paramString2, false);
  }
  
  private static boolean endsWith(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = false;
    if ((paramString1 == null) || (paramString2 == null)) {
      if ((paramString1 == null) && (paramString2 == null)) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      int i = paramString2.length();
      int j = paramString1.length();
      if (i <= j)
      {
        i = paramString1.length();
        j = paramString2.length();
        int k = i - j;
        int m = paramString2.length();
        boolean bool2 = paramBoolean;
        bool1 = paramString1.regionMatches(paramBoolean, k, paramString2, 0, m);
      }
    }
  }
  
  public static boolean endsWithIgnoreCase(String paramString1, String paramString2)
  {
    return endsWith(paramString1, paramString2, true);
  }
  
  public static boolean equals(String paramString1, String paramString2)
  {
    boolean bool;
    if (paramString1 == null) {
      if (paramString2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramString1.equals(paramString2);
    }
  }
  
  public static boolean equalsIgnoreCase(String paramString1, String paramString2)
  {
    boolean bool;
    if (paramString1 == null) {
      if (paramString2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramString1.equalsIgnoreCase(paramString2);
    }
  }
  
  public static String escape(String paramString)
  {
    return StringEscapeUtils.escapeJava(paramString);
  }
  
  public static String getChomp(String paramString1, String paramString2)
  {
    int i = paramString1.lastIndexOf(paramString2);
    int j = paramString1.length();
    int k = paramString2.length();
    j -= k;
    if (i == j) {}
    for (;;)
    {
      return paramString2;
      j = -1;
      if (i != j) {
        paramString2 = paramString1.substring(i);
      } else {
        paramString2 = "";
      }
    }
  }
  
  public static String getCommonPrefix(String[] paramArrayOfString)
  {
    int i;
    String str;
    if (paramArrayOfString != null)
    {
      i = paramArrayOfString.length;
      if (i != 0) {}
    }
    else
    {
      str = "";
    }
    for (;;)
    {
      return str;
      int j = indexOfDifference(paramArrayOfString);
      i = -1;
      if (j == i)
      {
        str = paramArrayOfString[0];
        if (str == null) {
          str = "";
        } else {
          str = paramArrayOfString[0];
        }
      }
      else if (j == 0)
      {
        str = "";
      }
      else
      {
        str = paramArrayOfString[0].substring(0, j);
      }
    }
  }
  
  public static int getLevenshteinDistance(String paramString1, String paramString2)
  {
    int i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    if ((paramString1 == null) || (paramString2 == null))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Strings must not be null");
      throw localIllegalArgumentException;
    }
    int j = paramString1.length();
    int k = paramString2.length();
    if (j == 0) {
      i = k;
    }
    for (;;)
    {
      return i;
      if (k == 0)
      {
        i = j;
      }
      else
      {
        if (j > k)
        {
          String str = paramString1;
          paramString1 = paramString2;
          paramString2 = str;
          j = k;
          k = str.length();
        }
        Object localObject1 = new int[j + 1];
        int m = j + 1;
        Object localObject2 = new int[m];
        int n = 0;
        while (n <= j)
        {
          localObject1[n] = n;
          n += 1;
        }
        int i1 = 1;
        while (i1 <= k)
        {
          m = i1 + -1;
          int i2 = paramString2.charAt(m);
          localObject2[0] = i1;
          n = 1;
          if (n <= j)
          {
            m = n + -1;
            m = paramString1.charAt(m);
            if (m == i2) {}
            for (int i3 = 0;; i3 = 1)
            {
              m = n + -1;
              m = localObject2[m] + 1;
              int i4 = localObject1[n] + 1;
              m = Math.min(m, i4);
              i4 = n + -1;
              i4 = localObject1[i4] + i3;
              m = Math.min(m, i4);
              localObject2[n] = m;
              n += 1;
              break;
            }
          }
          Object localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
          i1 += 1;
        }
        i = localObject1[j];
      }
    }
  }
  
  public static String getNestedString(String paramString1, String paramString2)
  {
    return substringBetween(paramString1, paramString2, paramString2);
  }
  
  public static String getNestedString(String paramString1, String paramString2, String paramString3)
  {
    return substringBetween(paramString1, paramString2, paramString3);
  }
  
  public static String getPrechomp(String paramString1, String paramString2)
  {
    int i = paramString1.indexOf(paramString2);
    int j = -1;
    if (i == j) {}
    int k;
    for (String str = "";; str = paramString1.substring(0, k))
    {
      return str;
      j = 0;
      k = paramString2.length() + i;
    }
  }
  
  public static int indexOf(String paramString, char paramChar)
  {
    boolean bool = isEmpty(paramString);
    if (bool) {}
    for (int i = -1;; i = paramString.indexOf(paramChar)) {
      return i;
    }
  }
  
  public static int indexOf(String paramString, char paramChar, int paramInt)
  {
    boolean bool = isEmpty(paramString);
    if (bool) {}
    for (int i = -1;; i = paramString.indexOf(paramChar, paramInt)) {
      return i;
    }
  }
  
  public static int indexOf(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (int i = -1;; i = paramString1.indexOf(paramString2)) {
      return i;
    }
  }
  
  public static int indexOf(String paramString1, String paramString2, int paramInt)
  {
    int i;
    if ((paramString1 == null) || (paramString2 == null)) {
      i = -1;
    }
    for (;;)
    {
      return i;
      i = paramString2.length();
      if (i == 0)
      {
        i = paramString1.length();
        if (paramInt >= i)
        {
          i = paramString1.length();
          continue;
        }
      }
      i = paramString1.indexOf(paramString2, paramInt);
    }
  }
  
  public static int indexOfAny(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label22;
      }
    }
    label22:
    char[] arrayOfChar;
    for (int i = -1;; i = indexOfAny(paramString1, arrayOfChar))
    {
      return i;
      arrayOfChar = paramString2.toCharArray();
    }
  }
  
  public static int indexOfAny(String paramString, char[] paramArrayOfChar)
  {
    int i = -1;
    boolean bool = isEmpty(paramString);
    int k;
    if (!bool)
    {
      bool = ArrayUtils.isEmpty(paramArrayOfChar);
      if (!bool) {}
    }
    else
    {
      k = i;
    }
    for (;;)
    {
      return k;
      k = 0;
      for (;;)
      {
        int j = paramString.length();
        if (k >= j) {
          break label89;
        }
        int m = paramString.charAt(k);
        int n = 0;
        for (;;)
        {
          j = paramArrayOfChar.length;
          if (n >= j) {
            break label80;
          }
          j = paramArrayOfChar[n];
          if (j == m) {
            break;
          }
          n += 1;
        }
        label80:
        k += 1;
      }
      label89:
      k = i;
    }
  }
  
  public static int indexOfAny(String paramString, String[] paramArrayOfString)
  {
    int i = -1;
    int j;
    if ((paramString == null) || (paramArrayOfString == null)) {
      j = i;
    }
    for (;;)
    {
      return j;
      int k = paramArrayOfString.length;
      j = -1 >>> 1;
      int m = 0;
      int n = 0;
      if (n < k)
      {
        String str = paramArrayOfString[n];
        if (str == null) {}
        for (;;)
        {
          n += 1;
          break;
          m = paramString.indexOf(str);
          if ((m != i) && (m < j)) {
            j = m;
          }
        }
      }
      int i1 = -1 >>> 1;
      if (j == i1) {
        j = i;
      }
    }
  }
  
  public static int indexOfAnyBut(String paramString1, String paramString2)
  {
    int i = -1;
    boolean bool = isEmpty(paramString1);
    int k;
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {}
    }
    else
    {
      k = i;
    }
    for (;;)
    {
      return k;
      k = 0;
      for (;;)
      {
        int j = paramString1.length();
        if (k >= j) {
          break label66;
        }
        j = paramString1.charAt(k);
        j = paramString2.indexOf(j);
        if (j < 0) {
          break;
        }
        k += 1;
      }
      label66:
      k = i;
    }
  }
  
  public static int indexOfAnyBut(String paramString, char[] paramArrayOfChar)
  {
    int i = -1;
    boolean bool = isEmpty(paramString);
    int k;
    if (!bool)
    {
      bool = ArrayUtils.isEmpty(paramArrayOfChar);
      if (!bool) {}
    }
    else
    {
      k = i;
    }
    for (;;)
    {
      return k;
      k = 0;
      label29:
      int j = paramString.length();
      if (k < j)
      {
        int m = paramString.charAt(k);
        int n = 0;
        for (;;)
        {
          j = paramArrayOfChar.length;
          if (n >= j) {
            break;
          }
          j = paramArrayOfChar[n];
          if (j == m)
          {
            k += 1;
            break label29;
          }
          n += 1;
        }
      }
      k = i;
    }
  }
  
  public static int indexOfDifference(String paramString1, String paramString2)
  {
    int i = -1;
    if (paramString1 == paramString2) {}
    for (int j = i;; j = 0)
    {
      return j;
      if ((paramString1 != null) && (paramString2 != null)) {
        break;
      }
    }
    j = 0;
    for (;;)
    {
      int k = paramString1.length();
      if (j < k)
      {
        k = paramString2.length();
        if (j < k)
        {
          k = paramString1.charAt(j);
          int m = paramString2.charAt(j);
          if (k == m) {
            break label100;
          }
        }
      }
      k = paramString2.length();
      if (j < k) {
        break;
      }
      k = paramString1.length();
      if (j < k) {
        break;
      }
      j = i;
      break;
      label100:
      j += 1;
    }
  }
  
  public static int indexOfDifference(String[] paramArrayOfString)
  {
    int i = -1;
    int j;
    int m;
    if (paramArrayOfString != null)
    {
      j = paramArrayOfString.length;
      int k = 1;
      if (j > k) {}
    }
    else
    {
      m = i;
    }
    int i2;
    int i3;
    String str;
    for (;;)
    {
      return m;
      int n = 0;
      int i1 = 1;
      i2 = paramArrayOfString.length;
      m = -1 >>> 1;
      i3 = 0;
      int i4 = 0;
      if (i4 < i2)
      {
        str = paramArrayOfString[i4];
        if (str == null)
        {
          n = 1;
          m = 0;
        }
        for (;;)
        {
          i4 += 1;
          break;
          i1 = 0;
          m = Math.min(paramArrayOfString[i4].length(), m);
          str = paramArrayOfString[i4];
          j = str.length();
          i3 = Math.max(j, i3);
        }
      }
      if ((i1 != 0) || ((i3 == 0) && (n == 0)))
      {
        m = i;
      }
      else
      {
        if (m != 0) {
          break;
        }
        m = 0;
      }
    }
    int i5 = -1;
    int i6 = 0;
    for (;;)
    {
      int i7;
      int i8;
      if (i6 < m)
      {
        str = paramArrayOfString[0];
        i7 = str.charAt(i6);
        i8 = 1;
      }
      for (;;)
      {
        if (i8 < i2)
        {
          str = paramArrayOfString[i8];
          j = str.charAt(i6);
          if (j != i7) {
            i5 = i6;
          }
        }
        else
        {
          if (i5 == i) {
            break label244;
          }
          if ((i5 == i) && (m != i3)) {
            break;
          }
          m = i5;
          break;
        }
        i8 += 1;
      }
      label244:
      i6 += 1;
    }
  }
  
  public static int indexOfIgnoreCase(String paramString1, String paramString2)
  {
    return indexOfIgnoreCase(paramString1, paramString2, 0);
  }
  
  public static int indexOfIgnoreCase(String paramString1, String paramString2, int paramInt)
  {
    int i = -1;
    int j;
    if ((paramString1 == null) || (paramString2 == null)) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      int k = paramString1.length();
      int m = paramString2.length();
      k -= m;
      int n = k + 1;
      if (paramInt > n)
      {
        j = i;
      }
      else
      {
        k = paramString2.length();
        if (k == 0)
        {
          j = paramInt;
        }
        else
        {
          j = paramInt;
          for (;;)
          {
            if (j >= n) {
              break label123;
            }
            m = 1;
            int i1 = paramString2.length();
            boolean bool = paramString1.regionMatches(m, j, paramString2, 0, i1);
            if (bool) {
              break;
            }
            j += 1;
          }
          label123:
          j = i;
        }
      }
    }
  }
  
  public static boolean isAllLowerCase(String paramString)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramString != null)
    {
      bool2 = isEmpty(paramString);
      if (!bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label54;
        }
        bool2 = Character.isLowerCase(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label54:
      bool1 = true;
    }
  }
  
  public static boolean isAllUpperCase(String paramString)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramString != null)
    {
      bool2 = isEmpty(paramString);
      if (!bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label54;
        }
        bool2 = Character.isUpperCase(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label54:
      bool1 = true;
    }
  }
  
  public static boolean isAlpha(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label42;
        }
        boolean bool2 = Character.isLetter(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label42:
      bool1 = true;
    }
  }
  
  public static boolean isAlphaSpace(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label60;
        }
        boolean bool2 = Character.isLetter(paramString.charAt(j));
        if (!bool2)
        {
          int k = paramString.charAt(j);
          int m = 32;
          if (k != m) {
            break;
          }
        }
        j += 1;
      }
      label60:
      bool1 = true;
    }
  }
  
  public static boolean isAlphanumeric(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label42;
        }
        boolean bool2 = Character.isLetterOrDigit(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label42:
      bool1 = true;
    }
  }
  
  public static boolean isAlphanumericSpace(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label60;
        }
        boolean bool2 = Character.isLetterOrDigit(paramString.charAt(j));
        if (!bool2)
        {
          int k = paramString.charAt(j);
          int m = 32;
          if (k != m) {
            break;
          }
        }
        j += 1;
      }
      label60:
      bool1 = true;
    }
  }
  
  public static boolean isAsciiPrintable(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label42;
        }
        boolean bool2 = CharUtils.isAsciiPrintable(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label42:
      bool1 = true;
    }
  }
  
  public static boolean isBlank(String paramString)
  {
    boolean bool1 = true;
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    label49:
    for (;;)
    {
      return bool1;
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label49;
        }
        boolean bool2 = Character.isWhitespace(paramString.charAt(j));
        if (!bool2)
        {
          bool1 = false;
          break;
        }
        j += 1;
      }
    }
  }
  
  public static boolean isEmpty(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isNotBlank(String paramString)
  {
    boolean bool = isBlank(paramString);
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isNotEmpty(String paramString)
  {
    boolean bool = isEmpty(paramString);
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isNumeric(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label42;
        }
        boolean bool2 = Character.isDigit(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label42:
      bool1 = true;
    }
  }
  
  public static boolean isNumericSpace(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label60;
        }
        boolean bool2 = Character.isDigit(paramString.charAt(j));
        if (!bool2)
        {
          int k = paramString.charAt(j);
          int m = 32;
          if (k != m) {
            break;
          }
        }
        j += 1;
      }
      label60:
      bool1 = true;
    }
  }
  
  public static boolean isWhitespace(String paramString)
  {
    boolean bool1 = false;
    if (paramString == null) {}
    for (;;)
    {
      return bool1;
      int i = paramString.length();
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label42;
        }
        boolean bool2 = Character.isWhitespace(paramString.charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label42:
      bool1 = true;
    }
  }
  
  public static String join(Collection paramCollection, char paramChar)
  {
    if (paramCollection == null) {}
    for (String str = null;; str = join(paramCollection.iterator(), paramChar)) {
      return str;
    }
  }
  
  public static String join(Collection paramCollection, String paramString)
  {
    if (paramCollection == null) {}
    for (String str = null;; str = join(paramCollection.iterator(), paramString)) {
      return str;
    }
  }
  
  public static String join(Iterator paramIterator, char paramChar)
  {
    boolean bool1;
    String str;
    if (paramIterator == null)
    {
      bool1 = false;
      str = null;
    }
    for (;;)
    {
      return str;
      bool1 = paramIterator.hasNext();
      if (!bool1)
      {
        str = "";
      }
      else
      {
        Object localObject1 = paramIterator.next();
        bool1 = paramIterator.hasNext();
        if (!bool1)
        {
          str = ObjectUtils.toString(localObject1);
        }
        else
        {
          StringBuffer localStringBuffer = new java/lang/StringBuffer;
          int i = 256;
          localStringBuffer.<init>(i);
          if (localObject1 != null) {
            localStringBuffer.append(localObject1);
          }
          for (;;)
          {
            boolean bool2 = paramIterator.hasNext();
            if (!bool2) {
              break;
            }
            localStringBuffer.append(paramChar);
            Object localObject2 = paramIterator.next();
            if (localObject2 != null) {
              localStringBuffer.append(localObject2);
            }
          }
          str = localStringBuffer.toString();
        }
      }
    }
  }
  
  public static String join(Iterator paramIterator, String paramString)
  {
    boolean bool1;
    String str;
    if (paramIterator == null)
    {
      bool1 = false;
      str = null;
    }
    for (;;)
    {
      return str;
      bool1 = paramIterator.hasNext();
      if (!bool1)
      {
        str = "";
      }
      else
      {
        Object localObject1 = paramIterator.next();
        bool1 = paramIterator.hasNext();
        if (!bool1)
        {
          str = ObjectUtils.toString(localObject1);
        }
        else
        {
          StringBuffer localStringBuffer = new java/lang/StringBuffer;
          int i = 256;
          localStringBuffer.<init>(i);
          if (localObject1 != null) {
            localStringBuffer.append(localObject1);
          }
          for (;;)
          {
            boolean bool2 = paramIterator.hasNext();
            if (!bool2) {
              break;
            }
            if (paramString != null) {
              localStringBuffer.append(paramString);
            }
            Object localObject2 = paramIterator.next();
            if (localObject2 != null) {
              localStringBuffer.append(localObject2);
            }
          }
          str = localStringBuffer.toString();
        }
      }
    }
  }
  
  public static String join(Object[] paramArrayOfObject)
  {
    return join(paramArrayOfObject, null);
  }
  
  public static String join(Object[] paramArrayOfObject, char paramChar)
  {
    if (paramArrayOfObject == null) {}
    int i;
    for (String str = null;; str = join(paramArrayOfObject, paramChar, 0, i))
    {
      return str;
      i = paramArrayOfObject.length;
    }
  }
  
  public static String join(Object[] paramArrayOfObject, char paramChar, int paramInt1, int paramInt2)
  {
    int i;
    Object localObject;
    if (paramArrayOfObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        localObject = "";
      }
      else
      {
        localObject = paramArrayOfObject[paramInt1];
        if (localObject == null) {}
        StringBuffer localStringBuffer;
        for (i = 16;; i = ((String)localObject).length())
        {
          i += 1;
          j *= i;
          localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>(j);
          int k = paramInt1;
          while (k < paramInt2)
          {
            if (k > paramInt1) {
              localStringBuffer.append(paramChar);
            }
            localObject = paramArrayOfObject[k];
            if (localObject != null)
            {
              localObject = paramArrayOfObject[k];
              localStringBuffer.append(localObject);
            }
            k += 1;
          }
          localObject = paramArrayOfObject[paramInt1].toString();
        }
        localObject = localStringBuffer.toString();
      }
    }
  }
  
  public static String join(Object[] paramArrayOfObject, String paramString)
  {
    if (paramArrayOfObject == null) {}
    int i;
    for (String str = null;; str = join(paramArrayOfObject, paramString, 0, i))
    {
      return str;
      i = paramArrayOfObject.length;
    }
  }
  
  public static String join(Object[] paramArrayOfObject, String paramString, int paramInt1, int paramInt2)
  {
    int i;
    Object localObject;
    if (paramArrayOfObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      if (paramString == null) {
        paramString = "";
      }
      int j = paramInt2 - paramInt1;
      if (j <= 0)
      {
        localObject = "";
      }
      else
      {
        localObject = paramArrayOfObject[paramInt1];
        if (localObject == null) {}
        StringBuffer localStringBuffer;
        for (i = 16;; i = ((String)localObject).length())
        {
          int k = paramString.length();
          i += k;
          j *= i;
          localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>(j);
          int m = paramInt1;
          while (m < paramInt2)
          {
            if (m > paramInt1) {
              localStringBuffer.append(paramString);
            }
            localObject = paramArrayOfObject[m];
            if (localObject != null)
            {
              localObject = paramArrayOfObject[m];
              localStringBuffer.append(localObject);
            }
            m += 1;
          }
          localObject = paramArrayOfObject[paramInt1].toString();
        }
        localObject = localStringBuffer.toString();
      }
    }
  }
  
  public static int lastIndexOf(String paramString, char paramChar)
  {
    boolean bool = isEmpty(paramString);
    if (bool) {}
    for (int i = -1;; i = paramString.lastIndexOf(paramChar)) {
      return i;
    }
  }
  
  public static int lastIndexOf(String paramString, char paramChar, int paramInt)
  {
    boolean bool = isEmpty(paramString);
    if (bool) {}
    for (int i = -1;; i = paramString.lastIndexOf(paramChar, paramInt)) {
      return i;
    }
  }
  
  public static int lastIndexOf(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (int i = -1;; i = paramString1.lastIndexOf(paramString2)) {
      return i;
    }
  }
  
  public static int lastIndexOf(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (int i = -1;; i = paramString1.lastIndexOf(paramString2, paramInt)) {
      return i;
    }
  }
  
  public static int lastIndexOfAny(String paramString, String[] paramArrayOfString)
  {
    if ((paramString == null) || (paramArrayOfString == null))
    {
      i = -1;
      return i;
    }
    int j = paramArrayOfString.length;
    int i = -1;
    int k = 0;
    int m = 0;
    label23:
    String str;
    if (m < j)
    {
      str = paramArrayOfString[m];
      if (str != null) {
        break label49;
      }
    }
    for (;;)
    {
      m += 1;
      break label23;
      break;
      label49:
      k = paramString.lastIndexOf(str);
      if (k > i) {
        i = k;
      }
    }
  }
  
  public static int lastIndexOfIgnoreCase(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    for (int i = -1;; i = lastIndexOfIgnoreCase(paramString1, paramString2, i))
    {
      return i;
      i = paramString1.length();
    }
  }
  
  public static int lastIndexOfIgnoreCase(String paramString1, String paramString2, int paramInt)
  {
    int i = -1;
    int j;
    if ((paramString1 == null) || (paramString2 == null)) {
      j = i;
    }
    for (;;)
    {
      return j;
      int k = paramString1.length();
      int m = paramString2.length();
      k -= m;
      if (paramInt > k)
      {
        k = paramString1.length();
        m = paramString2.length();
        paramInt = k - m;
      }
      if (paramInt < 0)
      {
        j = i;
      }
      else
      {
        k = paramString2.length();
        if (k == 0)
        {
          j = paramInt;
        }
        else
        {
          j = paramInt;
          for (;;)
          {
            if (j < 0) {
              break label131;
            }
            m = 1;
            int n = paramString2.length();
            boolean bool = paramString1.regionMatches(m, j, paramString2, 0, n);
            if (bool) {
              break;
            }
            j += -1;
          }
          label131:
          j = i;
        }
      }
    }
  }
  
  public static int lastOrdinalIndexOf(String paramString1, String paramString2, int paramInt)
  {
    return ordinalIndexOf(paramString1, paramString2, paramInt, true);
  }
  
  public static String left(String paramString, int paramInt)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      if (paramInt < 0)
      {
        paramString = "";
      }
      else
      {
        int i = paramString.length();
        if (i > paramInt)
        {
          i = 0;
          paramString = paramString.substring(0, paramInt);
        }
      }
    }
  }
  
  public static String leftPad(String paramString, int paramInt)
  {
    return leftPad(paramString, paramInt, ' ');
  }
  
  public static String leftPad(String paramString, int paramInt, char paramChar)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      int i = paramString.length();
      int j = paramInt - i;
      if (j > 0)
      {
        i = 8192;
        String str;
        if (j > i)
        {
          str = String.valueOf(paramChar);
          paramString = leftPad(paramString, paramInt, str);
        }
        else
        {
          str = padding(j, paramChar);
          paramString = str.concat(paramString);
        }
      }
    }
  }
  
  public static String leftPad(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 == null) {
      paramString1 = null;
    }
    for (;;)
    {
      return paramString1;
      int i = isEmpty(paramString2);
      if (i != 0) {
        paramString2 = " ";
      }
      int m = paramString2.length();
      int n = paramString1.length();
      int i1 = paramInt - n;
      if (i1 > 0)
      {
        i = 1;
        if (m == i)
        {
          int j = 8192;
          if (i1 <= j)
          {
            j = paramString2.charAt(0);
            paramString1 = leftPad(paramString1, paramInt, j);
            continue;
          }
        }
        if (i1 == m)
        {
          paramString1 = paramString2.concat(paramString1);
        }
        else
        {
          String str;
          if (i1 < m)
          {
            str = paramString2.substring(0, i1);
            paramString1 = str.concat(paramString1);
          }
          else
          {
            char[] arrayOfChar1 = new char[i1];
            char[] arrayOfChar2 = paramString2.toCharArray();
            int i2 = 0;
            while (i2 < i1)
            {
              int k = i2 % m;
              k = arrayOfChar2[k];
              arrayOfChar1[i2] = k;
              int i3;
              i2 += 1;
            }
            str = new java/lang/String;
            str.<init>(arrayOfChar1);
            paramString1 = str.concat(paramString1);
          }
        }
      }
    }
  }
  
  public static int length(String paramString)
  {
    if (paramString == null) {}
    for (int i = 0;; i = paramString.length()) {
      return i;
    }
  }
  
  public static String lowerCase(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.toLowerCase()) {
      return str;
    }
  }
  
  public static String lowerCase(String paramString, Locale paramLocale)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.toLowerCase(paramLocale)) {
      return str;
    }
  }
  
  public static String mid(String paramString, int paramInt1, int paramInt2)
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
      if (paramInt2 >= 0)
      {
        i = paramString.length();
        if (paramInt1 <= i) {}
      }
      else
      {
        str = "";
        continue;
      }
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      i = paramString.length();
      int j = paramInt1 + paramInt2;
      if (i <= j)
      {
        str = paramString.substring(paramInt1);
      }
      else
      {
        i = paramInt1 + paramInt2;
        str = paramString.substring(paramInt1, i);
      }
    }
  }
  
  public static int ordinalIndexOf(String paramString1, String paramString2, int paramInt)
  {
    return ordinalIndexOf(paramString1, paramString2, paramInt, false);
  }
  
  private static int ordinalIndexOf(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    if ((paramString1 == null) || (paramString2 == null) || (paramInt <= 0)) {}
    label65:
    label120:
    for (;;)
    {
      return i;
      int j = paramString2.length();
      if (j == 0)
      {
        if (paramBoolean) {}
        for (j = paramString1.length();; j = 0)
        {
          i = j;
          break;
        }
      }
      int k = 0;
      if (paramBoolean) {
        i = paramString1.length();
      }
      if (paramBoolean) {
        j = i + -1;
      }
      for (i = paramString1.lastIndexOf(paramString2, j);; i = paramString1.indexOf(paramString2, j))
      {
        if (i < 0) {
          break label120;
        }
        k += 1;
        if (k < paramInt) {
          break label65;
        }
        break;
        j = i + 1;
      }
    }
  }
  
  public static String overlay(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (paramString1 == null) {}
    String str;
    for (Object localObject = null;; localObject = str)
    {
      return (String)localObject;
      if (paramString2 == null) {
        paramString2 = "";
      }
      int i = paramString1.length();
      if (paramInt1 < 0) {
        paramInt1 = 0;
      }
      if (paramInt1 > i) {
        paramInt1 = i;
      }
      if (paramInt2 < 0) {
        paramInt2 = 0;
      }
      if (paramInt2 > i) {
        paramInt2 = i;
      }
      if (paramInt1 > paramInt2)
      {
        int j = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = j;
      }
      localObject = new java/lang/StringBuffer;
      int k = i + paramInt1 - paramInt2;
      int m = paramString2.length();
      k = k + m + 1;
      ((StringBuffer)localObject).<init>(k);
      k = 0;
      str = paramString1.substring(0, paramInt1);
      localObject = ((StringBuffer)localObject).append(str).append(paramString2);
      str = paramString1.substring(paramInt2);
    }
  }
  
  public static String overlayString(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = paramString2.length() + paramInt1;
    int j = paramString1.length();
    i = i + j - paramInt2 + 1;
    localStringBuffer.<init>(i);
    String str = paramString1.substring(0, paramInt1);
    localStringBuffer = localStringBuffer.append(str).append(paramString2);
    str = paramString1.substring(paramInt2);
    return str;
  }
  
  private static String padding(int paramInt, char paramChar)
  {
    if (paramInt < 0)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "Cannot pad a negative amount: " + paramInt;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    char[] arrayOfChar = new char[paramInt];
    int i = 0;
    for (;;)
    {
      int j = arrayOfChar.length;
      if (i >= j) {
        break;
      }
      arrayOfChar[i] = paramChar;
      i += 1;
    }
    Object localObject1 = new java/lang/String;
    ((String)localObject1).<init>(arrayOfChar);
    return (String)localObject1;
  }
  
  public static String prechomp(String paramString1, String paramString2)
  {
    int i = paramString1.indexOf(paramString2);
    int j = -1;
    if (i == j) {}
    for (;;)
    {
      return paramString1;
      j = paramString2.length() + i;
      paramString1 = paramString1.substring(j);
    }
  }
  
  public static String remove(String paramString, char paramChar)
  {
    boolean bool = isEmpty(paramString);
    char c1;
    if (!bool)
    {
      c1 = paramString.indexOf(paramChar);
      char c2 = '￿';
      if (c1 != c2) {
        break label24;
      }
    }
    for (;;)
    {
      return paramString;
      label24:
      char[] arrayOfChar = paramString.toCharArray();
      int i = 0;
      char c3 = '\000';
      for (;;)
      {
        c1 = arrayOfChar.length;
        if (c3 >= c1) {
          break;
        }
        c1 = arrayOfChar[c3];
        if (c1 != paramChar)
        {
          int j = i + 1;
          c1 = arrayOfChar[c3];
          arrayOfChar[i] = c1;
          i = j;
        }
        c3 += '\001';
      }
      paramString = new java/lang/String;
      c1 = '\000';
      paramString.<init>(arrayOfChar, 0, i);
    }
  }
  
  public static String remove(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      String str = "";
      int i = -1;
      paramString1 = replace(paramString1, paramString2, str, i);
    }
  }
  
  public static String removeEnd(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      bool = paramString1.endsWith(paramString2);
      if (bool)
      {
        bool = false;
        int i = paramString1.length();
        int j = paramString2.length();
        i -= j;
        paramString1 = paramString1.substring(0, i);
      }
    }
  }
  
  public static String removeEndIgnoreCase(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      bool = endsWithIgnoreCase(paramString1, paramString2);
      if (bool)
      {
        bool = false;
        int i = paramString1.length();
        int j = paramString2.length();
        i -= j;
        paramString1 = paramString1.substring(0, i);
      }
    }
  }
  
  public static String removeStart(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      bool = paramString1.startsWith(paramString2);
      if (bool)
      {
        int i = paramString2.length();
        paramString1 = paramString1.substring(i);
      }
    }
  }
  
  public static String removeStartIgnoreCase(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      bool = startsWithIgnoreCase(paramString1, paramString2);
      if (bool)
      {
        int i = paramString2.length();
        paramString1 = paramString1.substring(i);
      }
    }
  }
  
  public static String repeat(String paramString, int paramInt)
  {
    int i = 1;
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      if (paramInt <= 0)
      {
        paramString = "";
      }
      else
      {
        int j = paramString.length();
        if ((paramInt != i) && (j != 0))
        {
          int k;
          if (j == i)
          {
            k = 8192;
            if (paramInt <= k)
            {
              k = paramString.charAt(0);
              paramString = padding(paramInt, k);
              continue;
            }
          }
          int m = j * paramInt;
          StringBuffer localStringBuffer;
          int n;
          switch (j)
          {
          default: 
            localStringBuffer = new java/lang/StringBuffer;
            localStringBuffer.<init>(m);
            n = 0;
          }
          for (;;)
          {
            if (n < paramInt)
            {
              localStringBuffer.append(paramString);
              n += 1;
              continue;
              int i1 = paramString.charAt(0);
              char[] arrayOfChar1 = new char[m];
              n = paramInt + -1;
              while (n >= 0)
              {
                arrayOfChar1[n] = i1;
                n += -1;
              }
              paramString = new java/lang/String;
              paramString.<init>(arrayOfChar1);
              break;
              int i2 = paramString.charAt(0);
              int i3 = paramString.charAt(i);
              char[] arrayOfChar2 = new char[m];
              k = paramInt * 2;
              for (n = k + -2; n >= 0; n = n + -1 + -1)
              {
                arrayOfChar2[n] = i2;
                k = n + 1;
                arrayOfChar2[k] = i3;
              }
              paramString = new java/lang/String;
              paramString.<init>(arrayOfChar2);
              break;
            }
          }
          paramString = localStringBuffer.toString();
        }
      }
    }
  }
  
  public static String repeat(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    String str;
    for (Object localObject = repeat(paramString1, paramInt);; localObject = removeEnd(str, paramString2))
    {
      return (String)localObject;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      str = repeat(paramString1 + paramString2, paramInt);
    }
  }
  
  public static String replace(String paramString1, String paramString2, String paramString3)
  {
    return replace(paramString1, paramString2, paramString3, -1);
  }
  
  public static String replace(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    int i = 64;
    int j = -1;
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if ((!bool) && (paramString3 != null) && (paramInt != 0)) {
        break label39;
      }
    }
    label39:
    int m;
    int n;
    do
    {
      return paramString1;
      m = 0;
      n = paramString1.indexOf(paramString2, 0);
    } while (n == j);
    int i1 = paramString2.length();
    int k = paramString3.length();
    int i2 = k - i1;
    if (i2 < 0) {
      i2 = 0;
    }
    label92:
    StringBuffer localStringBuffer;
    if (paramInt < 0)
    {
      i = 16;
      i2 *= i;
      localStringBuffer = new java/lang/StringBuffer;
      i = paramString1.length() + i2;
      localStringBuffer.<init>(i);
    }
    for (;;)
    {
      Object localObject;
      if (n != j)
      {
        localObject = paramString1.substring(m, n);
        localObject = localStringBuffer.append((String)localObject);
        ((StringBuffer)localObject).append(paramString3);
        m = n + i1;
        paramInt += -1;
        if (paramInt != 0) {}
      }
      else
      {
        localObject = paramString1.substring(m);
        localStringBuffer.append((String)localObject);
        paramString1 = localStringBuffer.toString();
        break;
        if (paramInt > i) {
          break label92;
        }
        i = paramInt;
        break label92;
      }
      n = paramString1.indexOf(paramString2, m);
    }
  }
  
  public static String replaceChars(String paramString, char paramChar1, char paramChar2)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.replace(paramChar1, paramChar2)) {
      return str;
    }
  }
  
  public static String replaceChars(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      if (paramString3 == null) {
        paramString3 = "";
      }
      int i = 0;
      int j = paramString3.length();
      int k = paramString1.length();
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(k);
      int m = 0;
      if (m < k)
      {
        char c2 = paramString1.charAt(m);
        int n = paramString2.indexOf(c2);
        if (n >= 0)
        {
          i = 1;
          if (n < j)
          {
            char c1 = paramString3.charAt(n);
            localStringBuffer.append(c1);
          }
        }
        for (;;)
        {
          m += 1;
          break;
          localStringBuffer.append(c2);
        }
      }
      if (i != 0) {
        paramString1 = localStringBuffer.toString();
      }
    }
  }
  
  public static String replaceEach(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    return replaceEach(paramString, paramArrayOfString1, paramArrayOfString2, false, 0);
  }
  
  private static String replaceEach(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean, int paramInt)
  {
    int i;
    int m;
    if (paramString != null)
    {
      i = paramString.length();
      if ((i != 0) && (paramArrayOfString1 != null))
      {
        m = paramArrayOfString1.length;
        i = m;
        if ((m != 0) && (paramArrayOfString2 != null))
        {
          m = paramArrayOfString2.length;
          i = m;
          if (m != 0) {
            break label51;
          }
        }
      }
    }
    for (;;)
    {
      return paramString;
      label51:
      Object localObject1;
      Object localObject2;
      if (paramInt < 0)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "TimeToLive of " + paramInt + " is less than 0: " + paramString;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      int n = paramArrayOfString1.length;
      int i1 = paramArrayOfString2.length;
      if (n != i1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = "Search and Replace array lengths don't match: " + n + " vs " + i1;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      boolean[] arrayOfBoolean = new boolean[n];
      int i2 = -1;
      int i4 = -1;
      int i5 = -1;
      int i7 = 0;
      if (i7 < n)
      {
        i = arrayOfBoolean[i7];
        if (i == 0)
        {
          localObject1 = paramArrayOfString1[i7];
          if (localObject1 != null)
          {
            localObject1 = paramArrayOfString1[i7];
            i = ((String)localObject1).length();
            if (i != 0)
            {
              localObject1 = paramArrayOfString2[i7];
              if (localObject1 != null) {
                break label264;
              }
            }
          }
        }
        for (;;)
        {
          i7 += 1;
          break;
          label264:
          localObject1 = paramArrayOfString1[i7];
          i5 = paramString.indexOf((String)localObject1);
          i = -1;
          m = i;
          if (i5 == i)
          {
            i = 1;
            arrayOfBoolean[i7] = i;
          }
          else
          {
            i = -1;
            m = i;
            if ((i2 == i) || (i5 < i2))
            {
              i2 = i5;
              i4 = i7;
            }
          }
        }
      }
      i = -1;
      m = i;
      if (i2 != i)
      {
        int i9 = 0;
        int i10 = 0;
        i7 = 0;
        m = paramArrayOfString1.length;
        i = m;
        if (i7 < m)
        {
          localObject1 = paramArrayOfString1[i7];
          if (localObject1 != null)
          {
            localObject1 = paramArrayOfString2[i7];
            if (localObject1 != null) {
              break label406;
            }
          }
          for (;;)
          {
            i7 += 1;
            break;
            label406:
            localObject1 = paramArrayOfString2[i7];
            i = ((String)localObject1).length();
            localObject2 = paramArrayOfString1[i7];
            int i12 = ((String)localObject2).length();
            int i13 = i - i12;
            if (i13 > 0)
            {
              i = i13 * 3;
              i10 += i;
            }
          }
        }
        i = paramString.length() / 5;
        m = i;
        int i11 = Math.min(i11, i);
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        i = paramString.length() + i11;
        m = i;
        localStringBuffer.<init>(i);
        i = -1;
        m = i;
        int j;
        if (i2 != i)
        {
          i7 = i9;
          while (i7 < i2)
          {
            i = paramString.charAt(i7);
            m = i;
            localStringBuffer.append(i);
            i7 += 1;
          }
          localObject1 = paramArrayOfString2[i4];
          localStringBuffer.append((String)localObject1);
          localObject1 = paramArrayOfString1[i4];
          j = ((String)localObject1).length();
          i9 = i2 + j;
          int i3 = -1;
          i4 = -1;
          int i6 = -1;
          i8 = 0;
          label606:
          if (i8 < n)
          {
            j = arrayOfBoolean[i8];
            if (j == 0)
            {
              localObject1 = paramArrayOfString1[i8];
              if (localObject1 != null)
              {
                localObject1 = paramArrayOfString1[i8];
                j = ((String)localObject1).length();
                if (j != 0)
                {
                  localObject1 = paramArrayOfString2[i8];
                  if (localObject1 != null) {
                    break label674;
                  }
                }
              }
            }
          }
          for (;;)
          {
            i8 += 1;
            break label606;
            break;
            label674:
            localObject1 = paramArrayOfString1[i8];
            i6 = paramString.indexOf((String)localObject1, i9);
            j = -1;
            m = j;
            if (i6 == j)
            {
              j = 1;
              arrayOfBoolean[i8] = j;
            }
            else
            {
              j = -1;
              m = j;
              if ((i3 == j) || (i6 < i3))
              {
                i3 = i6;
                i4 = i8;
              }
            }
          }
        }
        int i14 = paramString.length();
        int i8 = i9;
        for (;;)
        {
          m = i14;
          if (i8 >= i14) {
            break;
          }
          j = paramString.charAt(i8);
          m = j;
          localStringBuffer.append(j);
          i8 += 1;
        }
        String str = localStringBuffer.toString();
        if (!paramBoolean)
        {
          paramString = str;
        }
        else
        {
          int k = paramInt + -1;
          paramString = replaceEach(str, paramArrayOfString1, paramArrayOfString2, paramBoolean, k);
        }
      }
    }
  }
  
  public static String replaceEachRepeatedly(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramArrayOfString1 == null) {}
    for (int i = 0;; i = paramArrayOfString1.length) {
      return replaceEach(paramString, paramArrayOfString1, paramArrayOfString2, true, i);
    }
  }
  
  public static String replaceOnce(String paramString1, String paramString2, String paramString3)
  {
    return replace(paramString1, paramString2, paramString3, 1);
  }
  
  public static String reverse(String paramString)
  {
    if (paramString == null) {}
    for (Object localObject = null;; localObject = ((StringBuffer)localObject).reverse().toString())
    {
      return (String)localObject;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>(paramString);
    }
  }
  
  public static String reverseDelimited(String paramString, char paramChar)
  {
    if (paramString == null) {}
    String[] arrayOfString;
    for (String str = null;; str = join(arrayOfString, paramChar))
    {
      return str;
      arrayOfString = split(paramString, paramChar);
      ArrayUtils.reverse(arrayOfString);
    }
  }
  
  public static String reverseDelimitedString(String paramString1, String paramString2)
  {
    char c;
    String str;
    if (paramString1 == null)
    {
      c = '\000';
      str = null;
    }
    for (;;)
    {
      return str;
      String[] arrayOfString = split(paramString1, paramString2);
      ArrayUtils.reverse(arrayOfString);
      if (paramString2 == null)
      {
        c = ' ';
        str = join(arrayOfString, c);
      }
      else
      {
        str = join(arrayOfString, paramString2);
      }
    }
  }
  
  public static String right(String paramString, int paramInt)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      if (paramInt < 0)
      {
        paramString = "";
      }
      else
      {
        int i = paramString.length();
        if (i > paramInt)
        {
          i = paramString.length() - paramInt;
          paramString = paramString.substring(i);
        }
      }
    }
  }
  
  public static String rightPad(String paramString, int paramInt)
  {
    return rightPad(paramString, paramInt, ' ');
  }
  
  public static String rightPad(String paramString, int paramInt, char paramChar)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      int i = paramString.length();
      int j = paramInt - i;
      if (j > 0)
      {
        i = 8192;
        String str;
        if (j > i)
        {
          str = String.valueOf(paramChar);
          paramString = rightPad(paramString, paramInt, str);
        }
        else
        {
          str = padding(j, paramChar);
          paramString = paramString.concat(str);
        }
      }
    }
  }
  
  public static String rightPad(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 == null) {
      paramString1 = null;
    }
    for (;;)
    {
      return paramString1;
      int i = isEmpty(paramString2);
      if (i != 0) {
        paramString2 = " ";
      }
      int m = paramString2.length();
      int n = paramString1.length();
      int i1 = paramInt - n;
      if (i1 > 0)
      {
        i = 1;
        if (m == i)
        {
          int j = 8192;
          if (i1 <= j)
          {
            j = paramString2.charAt(0);
            paramString1 = rightPad(paramString1, paramInt, j);
            continue;
          }
        }
        if (i1 == m)
        {
          paramString1 = paramString1.concat(paramString2);
        }
        else
        {
          String str;
          if (i1 < m)
          {
            str = paramString2.substring(0, i1);
            paramString1 = paramString1.concat(str);
          }
          else
          {
            char[] arrayOfChar1 = new char[i1];
            char[] arrayOfChar2 = paramString2.toCharArray();
            int i2 = 0;
            while (i2 < i1)
            {
              int k = i2 % m;
              k = arrayOfChar2[k];
              arrayOfChar1[i2] = k;
              int i3;
              i2 += 1;
            }
            str = new java/lang/String;
            str.<init>(arrayOfChar1);
            paramString1 = paramString1.concat(str);
          }
        }
      }
    }
  }
  
  public static String[] split(String paramString)
  {
    return split(paramString, null, -1);
  }
  
  public static String[] split(String paramString, char paramChar)
  {
    return splitWorker(paramString, paramChar, false);
  }
  
  public static String[] split(String paramString1, String paramString2)
  {
    return splitWorker(paramString1, paramString2, -1, false);
  }
  
  public static String[] split(String paramString1, String paramString2, int paramInt)
  {
    return splitWorker(paramString1, paramString2, paramInt, false);
  }
  
  public static String[] splitByCharacterType(String paramString)
  {
    return splitByCharacterType(paramString, false);
  }
  
  private static String[] splitByCharacterType(String paramString, boolean paramBoolean)
  {
    int i;
    Object localObject;
    if (paramString == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (String[])localObject;
      i = paramString.length();
      if (i == 0)
      {
        localObject = ArrayUtils.EMPTY_STRING_ARRAY;
      }
      else
      {
        char[] arrayOfChar = paramString.toCharArray();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int m = 0;
        i = arrayOfChar[0];
        int n = Character.getType(i);
        int i1 = 0 + 1;
        int i3;
        int i2;
        for (;;)
        {
          int j = arrayOfChar.length;
          if (i1 >= j) {
            break label210;
          }
          j = arrayOfChar[i1];
          i3 = Character.getType(j);
          if (i3 != n) {
            break;
          }
          i1 += 1;
        }
        int i4;
        if (paramBoolean)
        {
          k = 2;
          if (i3 == k)
          {
            k = 1;
            if (n == k)
            {
              i4 = i2 + -1;
              if (i4 != m)
              {
                localObject = new java/lang/String;
                i5 = i4 - m;
                ((String)localObject).<init>(arrayOfChar, m, i5);
                localArrayList.add(localObject);
              }
            }
          }
        }
        for (m = i4;; m = i2)
        {
          n = i3;
          break;
          localObject = new java/lang/String;
          i5 = i2 - m;
          ((String)localObject).<init>(arrayOfChar, m, i5);
          localArrayList.add(localObject);
        }
        label210:
        localObject = new java/lang/String;
        int i5 = arrayOfChar.length - m;
        ((String)localObject).<init>(arrayOfChar, m, i5);
        localArrayList.add(localObject);
        int k = localArrayList.size();
        localObject = new String[k];
        localObject = (String[])localArrayList.toArray((Object[])localObject);
      }
    }
  }
  
  public static String[] splitByCharacterTypeCamelCase(String paramString)
  {
    return splitByCharacterType(paramString, true);
  }
  
  public static String[] splitByWholeSeparator(String paramString1, String paramString2)
  {
    return splitByWholeSeparatorWorker(paramString1, paramString2, -1, false);
  }
  
  public static String[] splitByWholeSeparator(String paramString1, String paramString2, int paramInt)
  {
    return splitByWholeSeparatorWorker(paramString1, paramString2, paramInt, false);
  }
  
  public static String[] splitByWholeSeparatorPreserveAllTokens(String paramString1, String paramString2)
  {
    return splitByWholeSeparatorWorker(paramString1, paramString2, -1, true);
  }
  
  public static String[] splitByWholeSeparatorPreserveAllTokens(String paramString1, String paramString2, int paramInt)
  {
    return splitByWholeSeparatorWorker(paramString1, paramString2, paramInt, true);
  }
  
  private static String[] splitByWholeSeparatorWorker(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    Object localObject = null;
    if (paramString1 == null) {}
    for (;;)
    {
      return (String[])localObject;
      int j = paramString1.length();
      if (j == 0)
      {
        localObject = ArrayUtils.EMPTY_STRING_ARRAY;
      }
      else
      {
        if (paramString2 != null)
        {
          String str = "";
          boolean bool = str.equals(paramString2);
          if (!bool) {}
        }
        else
        {
          localObject = splitWorker(paramString1, null, paramInt, paramBoolean);
          continue;
        }
        int k = paramString2.length();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int m = 0;
        int n = 0;
        int i1 = 0;
        while (i1 < j)
        {
          i1 = paramString1.indexOf(paramString2, n);
          i = -1;
          if (i1 > i)
          {
            if (i1 > n)
            {
              m += 1;
              if (m == paramInt)
              {
                i1 = j;
                localObject = paramString1.substring(n);
                localArrayList.add(localObject);
              }
              else
              {
                localObject = paramString1.substring(n, i1);
                localArrayList.add(localObject);
                n = i1 + k;
              }
            }
            else
            {
              if (paramBoolean)
              {
                m += 1;
                if (m != paramInt) {
                  break label232;
                }
                i1 = j;
                localObject = paramString1.substring(n);
                localArrayList.add(localObject);
              }
              for (;;)
              {
                n = i1 + k;
                break;
                label232:
                localObject = "";
                localArrayList.add(localObject);
              }
            }
          }
          else
          {
            localObject = paramString1.substring(n);
            localArrayList.add(localObject);
            i1 = j;
          }
        }
        i = localArrayList.size();
        localObject = new String[i];
        localObject = (String[])localArrayList.toArray((Object[])localObject);
      }
    }
  }
  
  public static String[] splitPreserveAllTokens(String paramString)
  {
    return splitWorker(paramString, null, -1, true);
  }
  
  public static String[] splitPreserveAllTokens(String paramString, char paramChar)
  {
    return splitWorker(paramString, paramChar, true);
  }
  
  public static String[] splitPreserveAllTokens(String paramString1, String paramString2)
  {
    return splitWorker(paramString1, paramString2, -1, true);
  }
  
  public static String[] splitPreserveAllTokens(String paramString1, String paramString2, int paramInt)
  {
    return splitWorker(paramString1, paramString2, paramInt, true);
  }
  
  private static String[] splitWorker(String paramString, char paramChar, boolean paramBoolean)
  {
    char c;
    Object localObject;
    if (paramString == null)
    {
      c = '\000';
      localObject = null;
    }
    for (;;)
    {
      return (String[])localObject;
      int i = paramString.length();
      if (i == 0)
      {
        localObject = ArrayUtils.EMPTY_STRING_ARRAY;
      }
      else
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        while (j < i)
        {
          c = paramString.charAt(j);
          if (c == paramChar)
          {
            if ((m != 0) || (paramBoolean))
            {
              localObject = paramString.substring(k, j);
              localArrayList.add(localObject);
              m = 0;
              n = 1;
            }
            j += 1;
            k = j;
          }
          else
          {
            n = 0;
            m = 1;
            j += 1;
          }
        }
        if ((m != 0) || ((paramBoolean) && (n != 0)))
        {
          localObject = paramString.substring(k, j);
          localArrayList.add(localObject);
        }
        c = localArrayList.size();
        localObject = new String[c];
        localObject = (String[])localArrayList.toArray((Object[])localObject);
      }
    }
  }
  
  private static String[] splitWorker(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    boolean bool;
    if (paramString1 == null) {
      bool = false;
    }
    int j;
    for (Object localObject = null;; localObject = ArrayUtils.EMPTY_STRING_ARRAY)
    {
      return (String[])localObject;
      j = paramString1.length();
      if (j != 0) {
        break;
      }
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int k = 1;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (paramString2 == null)
    {
      i3 = k;
      label65:
      if (m >= j) {
        break label510;
      }
      bool = Character.isWhitespace(paramString1.charAt(m));
      if (bool)
      {
        if ((i1 == 0) && (!paramBoolean)) {
          break label531;
        }
        i2 = 1;
        k = i3 + 1;
        if (i3 == paramInt)
        {
          m = j;
          i2 = 0;
        }
        localObject = paramString1.substring(n, m);
        localArrayList.add(localObject);
        i1 = 0;
      }
    }
    for (;;)
    {
      m += 1;
      n = m;
      i3 = k;
      break label65;
      i2 = 0;
      i1 = 1;
      m += 1;
      break label65;
      int i = paramString2.length();
      int i4 = 1;
      if (i == i4)
      {
        i = 0;
        localObject = null;
        int i5 = paramString2.charAt(0);
        i3 = k;
        while (m < j)
        {
          i = paramString1.charAt(m);
          if (i == i5)
          {
            if ((i1 == 0) && (!paramBoolean)) {
              break label517;
            }
            i2 = 1;
            k = i3 + 1;
            if (i3 == paramInt)
            {
              m = j;
              i2 = 0;
            }
            localObject = paramString1.substring(n, m);
            localArrayList.add(localObject);
            i1 = 0;
            m += 1;
            n = m;
            i3 = k;
          }
          else
          {
            i2 = 0;
            i1 = 1;
            m += 1;
          }
        }
        k = i3;
        label319:
        if ((i1 != 0) || ((paramBoolean) && (i2 != 0)))
        {
          localObject = paramString1.substring(n, m);
          localArrayList.add(localObject);
        }
        i = localArrayList.size();
        localObject = new String[i];
        localObject = (String[])localArrayList.toArray((Object[])localObject);
        break;
      }
      for (;;)
      {
        if (m < j)
        {
          i = paramString1.charAt(m);
          i = paramString2.indexOf(i);
          if (i >= 0)
          {
            if ((i1 == 0) && (!paramBoolean)) {
              break label503;
            }
            i2 = 1;
            k = i3 + 1;
            if (i3 == paramInt)
            {
              m = j;
              i2 = 0;
            }
            localObject = paramString1.substring(n, m);
            localArrayList.add(localObject);
            i1 = 0;
          }
          for (;;)
          {
            m += 1;
            n = m;
            i3 = k;
            break;
            i2 = 0;
            i1 = 1;
            m += 1;
            break;
            label503:
            k = i3;
          }
        }
        label510:
        k = i3;
        break label319;
        label517:
        k = i3;
        break;
        i3 = k;
      }
      label531:
      k = i3;
    }
  }
  
  public static boolean startsWith(String paramString1, String paramString2)
  {
    return startsWith(paramString1, paramString2, false);
  }
  
  private static boolean startsWith(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = false;
    if ((paramString1 == null) || (paramString2 == null)) {
      if ((paramString1 == null) && (paramString2 == null)) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      int i = paramString2.length();
      int j = paramString1.length();
      if (i <= j)
      {
        int k = paramString2.length();
        boolean bool2 = paramBoolean;
        bool1 = paramString1.regionMatches(paramBoolean, 0, paramString2, 0, k);
      }
    }
  }
  
  public static boolean startsWithAny(String paramString, String[] paramArrayOfString)
  {
    boolean bool1 = false;
    boolean bool2 = isEmpty(paramString);
    if (!bool2)
    {
      bool2 = ArrayUtils.isEmpty(paramArrayOfString);
      if (!bool2) {}
    }
    else
    {
      return bool1;
    }
    int j = 0;
    for (;;)
    {
      int i = paramArrayOfString.length;
      if (j >= i) {
        break;
      }
      String str = paramArrayOfString[j];
      boolean bool3 = startsWith(paramString, str);
      if (bool3)
      {
        bool1 = true;
        break;
      }
      j += 1;
    }
  }
  
  public static boolean startsWithIgnoreCase(String paramString1, String paramString2)
  {
    return startsWith(paramString1, paramString2, true);
  }
  
  public static String strip(String paramString)
  {
    return strip(paramString, null);
  }
  
  public static String strip(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString1;
      paramString1 = stripEnd(stripStart(paramString1, paramString2), paramString2);
    }
  }
  
  public static String[] stripAll(String[] paramArrayOfString)
  {
    return stripAll(paramArrayOfString, null);
  }
  
  public static String[] stripAll(String[] paramArrayOfString, String paramString)
  {
    int i;
    String[] arrayOfString;
    if (paramArrayOfString != null)
    {
      i = paramArrayOfString.length;
      if (i != 0) {}
    }
    else
    {
      arrayOfString = paramArrayOfString;
    }
    for (;;)
    {
      return arrayOfString;
      arrayOfString = new String[i];
      int j = 0;
      while (j < i)
      {
        String str = strip(paramArrayOfString[j], paramString);
        arrayOfString[j] = str;
        j += 1;
      }
    }
  }
  
  public static String stripEnd(String paramString1, String paramString2)
  {
    int i;
    if (paramString1 != null)
    {
      i = paramString1.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString1;
      label15:
      if (paramString2 == null) {
        while (i != 0)
        {
          int j = i + -1;
          boolean bool = Character.isWhitespace(paramString1.charAt(j));
          if (!bool) {
            break;
          }
          i += -1;
        }
      }
      int k = paramString2.length();
      if (k != 0)
      {
        while (i != 0)
        {
          k = i + -1;
          k = paramString1.charAt(k);
          k = paramString2.indexOf(k);
          int m = -1;
          if (k == m) {
            break;
          }
          i += -1;
        }
        k = 0;
        paramString1 = paramString1.substring(0, i);
      }
    }
  }
  
  public static String stripStart(String paramString1, String paramString2)
  {
    int i;
    if (paramString1 != null)
    {
      i = paramString1.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString1;
      label15:
      int j = 0;
      if (paramString2 == null) {
        while (j != i)
        {
          boolean bool = Character.isWhitespace(paramString1.charAt(j));
          if (!bool) {
            break;
          }
          j += 1;
        }
      }
      int k = paramString2.length();
      if (k != 0)
      {
        while (j != i)
        {
          k = paramString1.charAt(j);
          k = paramString2.indexOf(k);
          int m = -1;
          if (k == m) {
            break;
          }
          j += 1;
        }
        paramString1 = paramString1.substring(j);
      }
    }
  }
  
  public static String stripToEmpty(String paramString)
  {
    if (paramString == null) {}
    for (String str = "";; str = strip(paramString, null)) {
      return str;
    }
  }
  
  public static String stripToNull(String paramString)
  {
    String str = null;
    if (paramString == null) {}
    for (;;)
    {
      return str;
      paramString = strip(paramString, null);
      int i = paramString.length();
      if (i == 0) {
        paramString = null;
      }
      str = paramString;
    }
  }
  
  public static String substring(String paramString, int paramInt)
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
      if (paramInt < 0)
      {
        i = paramString.length();
        paramInt += i;
      }
      if (paramInt < 0) {
        paramInt = 0;
      }
      i = paramString.length();
      if (paramInt > i) {
        str = "";
      } else {
        str = paramString.substring(paramInt);
      }
    }
  }
  
  public static String substring(String paramString, int paramInt1, int paramInt2)
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
      if (paramInt2 < 0)
      {
        i = paramString.length();
        paramInt2 += i;
      }
      if (paramInt1 < 0)
      {
        i = paramString.length();
        paramInt1 += i;
      }
      i = paramString.length();
      if (paramInt2 > i) {
        paramInt2 = paramString.length();
      }
      if (paramInt1 > paramInt2)
      {
        str = "";
      }
      else
      {
        if (paramInt1 < 0) {
          paramInt1 = 0;
        }
        if (paramInt2 < 0) {
          paramInt2 = 0;
        }
        str = paramString.substring(paramInt1, paramInt2);
      }
    }
  }
  
  public static String substringAfter(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString1;
      if (paramString2 == null)
      {
        paramString1 = "";
      }
      else
      {
        int j = paramString1.indexOf(paramString2);
        int i = -1;
        if (j == i)
        {
          paramString1 = "";
        }
        else
        {
          i = paramString2.length() + j;
          paramString1 = paramString1.substring(i);
        }
      }
    }
  }
  
  public static String substringAfterLast(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString1;
      bool = isEmpty(paramString2);
      if (bool)
      {
        paramString1 = "";
      }
      else
      {
        int j = paramString1.lastIndexOf(paramString2);
        int i = -1;
        if (j != i)
        {
          i = paramString1.length();
          int k = paramString2.length();
          i -= k;
          if (j != i) {}
        }
        else
        {
          paramString1 = "";
          continue;
        }
        i = paramString2.length() + j;
        paramString1 = paramString1.substring(i);
      }
    }
  }
  
  public static String substringBefore(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if ((bool) || (paramString2 == null)) {}
    for (;;)
    {
      return paramString1;
      int i = paramString2.length();
      if (i == 0)
      {
        paramString1 = "";
      }
      else
      {
        int j = paramString1.indexOf(paramString2);
        i = -1;
        if (j != i)
        {
          i = 0;
          paramString1 = paramString1.substring(0, j);
        }
      }
    }
  }
  
  public static String substringBeforeLast(String paramString1, String paramString2)
  {
    boolean bool = isEmpty(paramString1);
    if (!bool)
    {
      bool = isEmpty(paramString2);
      if (!bool) {
        break label20;
      }
    }
    for (;;)
    {
      return paramString1;
      label20:
      int j = paramString1.lastIndexOf(paramString2);
      int i = -1;
      if (j != i)
      {
        i = 0;
        paramString1 = paramString1.substring(0, j);
      }
    }
  }
  
  public static String substringBetween(String paramString1, String paramString2)
  {
    return substringBetween(paramString1, paramString2, paramString2);
  }
  
  public static String substringBetween(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    String str = null;
    int j = -1;
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {}
    for (;;)
    {
      return str;
      int k = paramString1.indexOf(paramString2);
      if (k != j)
      {
        int m = paramString2.length() + k;
        int n = paramString1.indexOf(paramString3, m);
        if (n != j)
        {
          i = paramString2.length() + k;
          str = paramString1.substring(i, n);
        }
      }
    }
  }
  
  public static String[] substringsBetween(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    String[] arrayOfString = null;
    if (paramString1 != null)
    {
      boolean bool1 = isEmpty(paramString2);
      if (!bool1)
      {
        bool1 = isEmpty(paramString3);
        if (!bool1) {
          break label34;
        }
      }
    }
    label34:
    int k;
    for (;;)
    {
      return arrayOfString;
      k = paramString1.length();
      if (k != 0) {
        break;
      }
      arrayOfString = ArrayUtils.EMPTY_STRING_ARRAY;
    }
    int m = paramString3.length();
    int n = paramString2.length();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    label154:
    int i3;
    for (int i1 = 0;; i1 = i3 + m)
    {
      int j = k - m;
      int i2;
      if (i1 < j)
      {
        i2 = paramString1.indexOf(paramString2, i1);
        if (i2 >= 0) {
          break label154;
        }
      }
      do
      {
        boolean bool2 = localArrayList.isEmpty();
        if (bool2) {
          break;
        }
        i = localArrayList.size();
        arrayOfString = new String[i];
        arrayOfString = (String[])localArrayList.toArray(arrayOfString);
        break;
        i2 += n;
        i3 = paramString1.indexOf(paramString3, i2);
      } while (i3 < 0);
      String str = paramString1.substring(i2, i3);
      localArrayList.add(str);
    }
  }
  
  public static String swapCase(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(i);
      char c = '\000';
      int j = 0;
      if (j < i)
      {
        c = paramString.charAt(j);
        boolean bool = Character.isUpperCase(c);
        if (bool) {
          c = Character.toLowerCase(c);
        }
        for (;;)
        {
          localStringBuffer.append(c);
          j += 1;
          break;
          bool = Character.isTitleCase(c);
          if (bool)
          {
            c = Character.toLowerCase(c);
          }
          else
          {
            bool = Character.isLowerCase(c);
            if (bool) {
              c = Character.toUpperCase(c);
            }
          }
        }
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String trim(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.trim()) {
      return str;
    }
  }
  
  public static String trimToEmpty(String paramString)
  {
    if (paramString == null) {}
    for (String str = "";; str = paramString.trim()) {
      return str;
    }
  }
  
  public static String trimToNull(String paramString)
  {
    String str = trim(paramString);
    boolean bool = isEmpty(str);
    if (bool) {
      str = null;
    }
    return str;
  }
  
  public static String uncapitalise(String paramString)
  {
    return uncapitalize(paramString);
  }
  
  public static String uncapitalize(String paramString)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      label15:
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(i);
      char c = Character.toLowerCase(paramString.charAt(0));
      localStringBuffer = localStringBuffer.append(c);
      c = '\001';
      String str = paramString.substring(c);
      localStringBuffer = localStringBuffer.append(str);
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String upperCase(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.toUpperCase()) {
      return str;
    }
  }
  
  public static String upperCase(String paramString, Locale paramLocale)
  {
    if (paramString == null) {}
    for (String str = null;; str = paramString.toUpperCase(paramLocale)) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/StringUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */