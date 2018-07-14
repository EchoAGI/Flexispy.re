package org.apache.commons.lang;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringEscapeUtils
{
  private static final char CSV_DELIMITER = ',';
  private static final char CSV_QUOTE = '"';
  private static final String CSV_QUOTE_STR = String.valueOf('"');
  private static final char[] CSV_SEARCH_CHARS;
  
  static
  {
    char[] arrayOfChar = new char[4];
    arrayOfChar[0] = 44;
    arrayOfChar[1] = 34;
    arrayOfChar[2] = 13;
    arrayOfChar[3] = 10;
    CSV_SEARCH_CHARS = arrayOfChar;
  }
  
  public static String escapeCsv(String paramString)
  {
    Object localObject = CSV_SEARCH_CHARS;
    boolean bool = StringUtils.containsNone(paramString, (char[])localObject);
    if (bool) {}
    for (;;)
    {
      return paramString;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        localStringWriter.<init>();
        escapeCsv(localStringWriter, paramString);
        paramString = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static void escapeCsv(Writer paramWriter, String paramString)
  {
    int i = 34;
    char[] arrayOfChar = CSV_SEARCH_CHARS;
    boolean bool = StringUtils.containsNone(paramString, arrayOfChar);
    if (bool) {
      if (paramString != null) {
        paramWriter.write(paramString);
      }
    }
    for (;;)
    {
      return;
      paramWriter.write(i);
      int k = 0;
      for (;;)
      {
        int j = paramString.length();
        if (k >= j) {
          break;
        }
        int m = paramString.charAt(k);
        if (m == i) {
          paramWriter.write(i);
        }
        paramWriter.write(m);
        k += 1;
      }
      paramWriter.write(i);
    }
  }
  
  public static String escapeHtml(String paramString)
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
      return (String)localObject;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        double d1 = paramString.length();
        double d2 = 1.5D;
        d1 *= d2;
        i = (int)d1;
        localStringWriter.<init>(i);
        escapeHtml(localStringWriter, paramString);
        localObject = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static void escapeHtml(Writer paramWriter, String paramString)
  {
    Object localObject;
    if (paramWriter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Writer must not be null.");
      throw ((Throwable)localObject);
    }
    if (paramString == null) {}
    for (;;)
    {
      return;
      localObject = Entities.HTML40;
      ((Entities)localObject).escape(paramWriter, paramString);
    }
  }
  
  public static String escapeJava(String paramString)
  {
    return escapeJavaStyleString(paramString, false, false);
  }
  
  public static void escapeJava(Writer paramWriter, String paramString)
  {
    escapeJavaStyleString(paramWriter, paramString, false, false);
  }
  
  public static String escapeJavaScript(String paramString)
  {
    boolean bool = true;
    return escapeJavaStyleString(paramString, bool, bool);
  }
  
  public static void escapeJavaScript(Writer paramWriter, String paramString)
  {
    boolean bool = true;
    escapeJavaStyleString(paramWriter, paramString, bool, bool);
  }
  
  private static String escapeJavaStyleString(String paramString, boolean paramBoolean1, boolean paramBoolean2)
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
      return (String)localObject;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        i = paramString.length() * 2;
        localStringWriter.<init>(i);
        escapeJavaStyleString(localStringWriter, paramString, paramBoolean1, paramBoolean2);
        localObject = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  private static void escapeJavaStyleString(Writer paramWriter, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 92;
    Object localObject;
    if (paramWriter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Writer must not be null");
      throw ((Throwable)localObject);
    }
    if (paramString == null) {
      return;
    }
    int j = paramString.length();
    int k = 0;
    label37:
    char c1;
    char c2;
    String str;
    if (k < j)
    {
      c1 = paramString.charAt(k);
      c2 = '࿿';
      if (c1 <= c2) {
        break label117;
      }
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("\\u");
      str = hex(c1);
      localObject = str;
      paramWriter.write((String)localObject);
    }
    for (;;)
    {
      k += 1;
      break label37;
      break;
      label117:
      c2 = 'ÿ';
      if (c1 > c2)
      {
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append("\\u0");
        str = hex(c1);
        localObject = str;
        paramWriter.write((String)localObject);
      }
      else
      {
        c2 = '';
        if (c1 > c2)
        {
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          localObject = ((StringBuffer)localObject).append("\\u00");
          str = hex(c1);
          localObject = str;
          paramWriter.write((String)localObject);
        }
        else
        {
          c2 = ' ';
          if (c1 < c2) {
            switch (c1)
            {
            case '\013': 
            default: 
              c2 = '\017';
              if (c1 > c2)
              {
                localObject = new java/lang/StringBuffer;
                ((StringBuffer)localObject).<init>();
                localObject = ((StringBuffer)localObject).append("\\u00");
                str = hex(c1);
                localObject = str;
                paramWriter.write((String)localObject);
              }
              break;
            case '\b': 
              paramWriter.write(i);
              c2 = 'b';
              paramWriter.write(c2);
              break;
            case '\n': 
              paramWriter.write(i);
              c2 = 'n';
              paramWriter.write(c2);
              break;
            case '\t': 
              paramWriter.write(i);
              c2 = 't';
              paramWriter.write(c2);
              break;
            case '\f': 
              paramWriter.write(i);
              c2 = 'f';
              paramWriter.write(c2);
              break;
            case '\r': 
              paramWriter.write(i);
              c2 = 'r';
              paramWriter.write(c2);
              continue;
              localObject = new java/lang/StringBuffer;
              ((StringBuffer)localObject).<init>();
              localObject = ((StringBuffer)localObject).append("\\u000");
              str = hex(c1);
              localObject = str;
              paramWriter.write((String)localObject);
              break;
            }
          } else {
            switch (c1)
            {
            default: 
              paramWriter.write(c1);
              break;
            case '\'': 
              if (paramBoolean1) {
                paramWriter.write(i);
              }
              c2 = '\'';
              paramWriter.write(c2);
              break;
            case '"': 
              paramWriter.write(i);
              c2 = '"';
              paramWriter.write(c2);
              break;
            case '\\': 
              paramWriter.write(i);
              paramWriter.write(i);
              break;
            case '/': 
              if (paramBoolean2) {
                paramWriter.write(i);
              }
              c2 = '/';
              paramWriter.write(c2);
            }
          }
        }
      }
    }
  }
  
  public static String escapeSql(String paramString)
  {
    if (paramString == null) {}
    String str2;
    for (String str1 = null;; str1 = StringUtils.replace(paramString, "'", str2))
    {
      return str1;
      str2 = "''";
    }
  }
  
  public static String escapeXml(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = Entities.XML.escape(paramString)) {
      return str;
    }
  }
  
  public static void escapeXml(Writer paramWriter, String paramString)
  {
    Object localObject;
    if (paramWriter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Writer must not be null.");
      throw ((Throwable)localObject);
    }
    if (paramString == null) {}
    for (;;)
    {
      return;
      localObject = Entities.XML;
      ((Entities)localObject).escape(paramWriter, paramString);
    }
  }
  
  private static String hex(char paramChar)
  {
    String str = Integer.toHexString(paramChar);
    Locale localLocale = Locale.ENGLISH;
    return str.toUpperCase(localLocale);
  }
  
  public static String unescapeCsv(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        localStringWriter.<init>();
        unescapeCsv(localStringWriter, paramString);
        localObject = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static void unescapeCsv(Writer paramWriter, String paramString)
  {
    int i = 34;
    if (paramString == null) {}
    for (;;)
    {
      return;
      int j = paramString.length();
      int k = 2;
      if (j < k)
      {
        paramWriter.write(paramString);
      }
      else
      {
        Object localObject = null;
        j = paramString.charAt(0);
        if (j == i)
        {
          j = paramString.length() + -1;
          j = paramString.charAt(j);
          if (j == i) {}
        }
        else
        {
          paramWriter.write(paramString);
          continue;
        }
        k = paramString.length() + -1;
        String str1 = paramString.substring(1, k);
        localObject = CSV_SEARCH_CHARS;
        boolean bool = StringUtils.containsAny(str1, (char[])localObject);
        if (bool)
        {
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          String str2 = CSV_QUOTE_STR;
          localObject = ((StringBuffer)localObject).append(str2);
          str2 = CSV_QUOTE_STR;
          localObject = str2;
          str2 = CSV_QUOTE_STR;
          paramString = StringUtils.replace(str1, (String)localObject, str2);
        }
        paramWriter.write(paramString);
      }
    }
  }
  
  public static String unescapeHtml(String paramString)
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
      return (String)localObject;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        double d1 = paramString.length();
        double d2 = 1.5D;
        d1 *= d2;
        i = (int)d1;
        localStringWriter.<init>(i);
        unescapeHtml(localStringWriter, paramString);
        localObject = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static void unescapeHtml(Writer paramWriter, String paramString)
  {
    Object localObject;
    if (paramWriter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Writer must not be null.");
      throw ((Throwable)localObject);
    }
    if (paramString == null) {}
    for (;;)
    {
      return;
      localObject = Entities.HTML40;
      ((Entities)localObject).unescape(paramWriter, paramString);
    }
  }
  
  public static String unescapeJava(String paramString)
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
      return (String)localObject;
      try
      {
        StringWriter localStringWriter = new java/io/StringWriter;
        i = paramString.length();
        localStringWriter.<init>(i);
        unescapeJava(localStringWriter, paramString);
        localObject = localStringWriter.toString();
      }
      catch (IOException localIOException)
      {
        localObject = new org/apache/commons/lang/UnhandledException;
        ((UnhandledException)localObject).<init>(localIOException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static void unescapeJava(Writer paramWriter, String paramString)
  {
    int i = 4;
    char c1 = '\\';
    Object localObject1;
    if (paramWriter == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The Writer must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramString == null) {}
    for (;;)
    {
      return;
      int j = paramString.length();
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(i);
      int k = 0;
      int m = 0;
      int n = 0;
      if (n < j)
      {
        char c2 = paramString.charAt(n);
        int i1;
        if (m != 0)
        {
          localStringBuffer.append(c2);
          i1 = localStringBuffer.length();
          if (i1 != i) {}
        }
        for (;;)
        {
          try
          {
            localObject1 = localStringBuffer.toString();
            int i2 = 16;
            int i3 = Integer.parseInt((String)localObject1, i2);
            i1 = (char)i3;
            paramWriter.write(i1);
            i1 = 0;
            localObject1 = null;
            localStringBuffer.setLength(0);
            m = 0;
            k = 0;
            n += 1;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localObject1 = new org/apache/commons/lang/exception/NestableRuntimeException;
            Object localObject2 = new java/lang/StringBuffer;
            ((StringBuffer)localObject2).<init>();
            localObject2 = "Unable to parse unicode value: " + localStringBuffer;
            ((NestableRuntimeException)localObject1).<init>((String)localObject2, localNumberFormatException);
            throw ((Throwable)localObject1);
          }
          if (k != 0)
          {
            k = 0;
            switch (c2)
            {
            default: 
              paramWriter.write(c2);
              break;
            case '\\': 
              paramWriter.write(c1);
              break;
            case '\'': 
              i1 = 39;
              paramWriter.write(i1);
              break;
            case '"': 
              i1 = 34;
              paramWriter.write(i1);
              break;
            case 'r': 
              i1 = 13;
              paramWriter.write(i1);
              break;
            case 'f': 
              i1 = 12;
              paramWriter.write(i1);
              break;
            case 't': 
              i1 = 9;
              paramWriter.write(i1);
              break;
            case 'n': 
              i1 = 10;
              paramWriter.write(i1);
              break;
            case 'b': 
              i1 = 8;
              paramWriter.write(i1);
              break;
            case 'u': 
              m = 1;
              break;
            }
          }
          else if (c2 == c1)
          {
            k = 1;
          }
          else
          {
            paramWriter.write(c2);
          }
        }
      }
      if (k != 0) {
        paramWriter.write(c1);
      }
    }
  }
  
  public static String unescapeJavaScript(String paramString)
  {
    return unescapeJava(paramString);
  }
  
  public static void unescapeJavaScript(Writer paramWriter, String paramString)
  {
    unescapeJava(paramWriter, paramString);
  }
  
  public static String unescapeXml(String paramString)
  {
    if (paramString == null) {}
    for (String str = null;; str = Entities.XML.unescape(paramString)) {
      return str;
    }
  }
  
  public static void unescapeXml(Writer paramWriter, String paramString)
  {
    Object localObject;
    if (paramWriter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The Writer must not be null.");
      throw ((Throwable)localObject);
    }
    if (paramString == null) {}
    for (;;)
    {
      return;
      localObject = Entities.XML;
      ((Entities)localObject).unescape(paramWriter, paramString);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/StringEscapeUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */