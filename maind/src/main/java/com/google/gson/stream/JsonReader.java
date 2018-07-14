package com.google.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class JsonReader
  implements Closeable
{
  private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
  private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
  private static final int NUMBER_CHAR_DECIMAL = 3;
  private static final int NUMBER_CHAR_DIGIT = 2;
  private static final int NUMBER_CHAR_EXP_DIGIT = 7;
  private static final int NUMBER_CHAR_EXP_E = 5;
  private static final int NUMBER_CHAR_EXP_SIGN = 6;
  private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
  private static final int NUMBER_CHAR_NONE = 0;
  private static final int NUMBER_CHAR_SIGN = 1;
  private static final int PEEKED_BEGIN_ARRAY = 3;
  private static final int PEEKED_BEGIN_OBJECT = 1;
  private static final int PEEKED_BUFFERED = 11;
  private static final int PEEKED_DOUBLE_QUOTED = 9;
  private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
  private static final int PEEKED_END_ARRAY = 4;
  private static final int PEEKED_END_OBJECT = 2;
  private static final int PEEKED_EOF = 17;
  private static final int PEEKED_FALSE = 6;
  private static final int PEEKED_LONG = 15;
  private static final int PEEKED_NONE = 0;
  private static final int PEEKED_NULL = 7;
  private static final int PEEKED_NUMBER = 16;
  private static final int PEEKED_SINGLE_QUOTED = 8;
  private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
  private static final int PEEKED_TRUE = 5;
  private static final int PEEKED_UNQUOTED = 10;
  private static final int PEEKED_UNQUOTED_NAME = 14;
  private final char[] buffer;
  private final Reader in;
  private boolean lenient = false;
  private int limit;
  private int lineNumber;
  private int lineStart;
  private int[] pathIndices;
  private String[] pathNames;
  int peeked;
  private long peekedLong;
  private int peekedNumberLength;
  private String peekedString;
  private int pos;
  private int[] stack;
  private int stackSize;
  
  static
  {
    JsonReader.1 local1 = new com/google/gson/stream/JsonReader$1;
    local1.<init>();
    com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = local1;
  }
  
  public JsonReader(Reader paramReader)
  {
    int j = 1024;
    Object localObject = new char[j];
    this.buffer = ((char[])localObject);
    this.pos = 0;
    this.limit = 0;
    this.lineNumber = 0;
    this.lineStart = 0;
    this.peeked = 0;
    localObject = new int[i];
    this.stack = ((int[])localObject);
    this.stackSize = 0;
    localObject = this.stack;
    int k = this.stackSize;
    int m = k + 1;
    this.stackSize = m;
    m = 6;
    localObject[k] = m;
    localObject = new String[i];
    this.pathNames = ((String[])localObject);
    localObject = new int[i];
    this.pathIndices = ((int[])localObject);
    if (paramReader == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("in == null");
      throw ((Throwable)localObject);
    }
    this.in = paramReader;
  }
  
  private void checkLenient()
  {
    boolean bool = this.lenient;
    if (!bool) {
      throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
  }
  
  private void consumeNonExecutePrefix()
  {
    nextNonWhitespace(true);
    int i = this.pos + -1;
    this.pos = i;
    i = this.pos;
    char[] arrayOfChar1 = NON_EXECUTE_PREFIX;
    int k = arrayOfChar1.length;
    i += k;
    k = this.limit;
    char[] arrayOfChar2;
    if (i > k)
    {
      arrayOfChar2 = NON_EXECUTE_PREFIX;
      i = arrayOfChar2.length;
      boolean bool = fillBuffer(i);
      if (bool) {}
    }
    for (;;)
    {
      return;
      int m = 0;
      for (;;)
      {
        arrayOfChar2 = NON_EXECUTE_PREFIX;
        j = arrayOfChar2.length;
        if (m >= j) {
          break label124;
        }
        arrayOfChar2 = this.buffer;
        k = this.pos + m;
        j = arrayOfChar2[k];
        arrayOfChar1 = NON_EXECUTE_PREFIX;
        k = arrayOfChar1[m];
        if (j != k) {
          break;
        }
        m += 1;
      }
      label124:
      int j = this.pos;
      arrayOfChar1 = NON_EXECUTE_PREFIX;
      k = arrayOfChar1.length;
      j += k;
      this.pos = j;
    }
  }
  
  private boolean fillBuffer(int paramInt)
  {
    boolean bool = false;
    char[] arrayOfChar = this.buffer;
    int i = this.lineStart;
    int j = this.pos;
    i -= j;
    this.lineStart = i;
    i = this.limit;
    j = this.pos;
    if (i != j)
    {
      i = this.limit;
      j = this.pos;
      i -= j;
      this.limit = i;
      i = this.pos;
      j = this.limit;
      System.arraycopy(arrayOfChar, i, arrayOfChar, 0, j);
    }
    for (;;)
    {
      this.pos = 0;
      do
      {
        Reader localReader = this.in;
        j = this.limit;
        int k = arrayOfChar.length;
        int m = this.limit;
        k -= m;
        int n = localReader.read(arrayOfChar, j, k);
        i = -1;
        if (n == i) {
          break;
        }
        i = this.limit + n;
        this.limit = i;
        i = this.lineNumber;
        if (i == 0)
        {
          i = this.lineStart;
          if (i == 0)
          {
            i = this.limit;
            if (i > 0)
            {
              i = arrayOfChar[0];
              j = 65279;
              if (i == j)
              {
                i = this.pos + 1;
                this.pos = i;
                i = this.lineStart + 1;
                this.lineStart = i;
                paramInt += 1;
              }
            }
          }
        }
        i = this.limit;
      } while (i < paramInt);
      bool = true;
      return bool;
      this.limit = 0;
    }
  }
  
  private boolean isLiteral(char paramChar)
  {
    switch (paramChar)
    {
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      checkLenient();
    }
  }
  
  private String locationString()
  {
    int i = this.lineNumber + 1;
    int j = this.pos;
    int k = this.lineStart;
    int m = j - k + 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(" at line ").append(i).append(" column ").append(m).append(" path ");
    String str = getPath();
    return str;
  }
  
  private int nextNonWhitespace(boolean paramBoolean)
  {
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    int j = this.limit;
    for (;;)
    {
      Object localObject1;
      int n;
      int i1;
      int k;
      if (i == j)
      {
        this.pos = i;
        boolean bool1 = fillBuffer(1);
        if (!bool1)
        {
          if (paramBoolean)
          {
            localObject1 = new java/io/EOFException;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("End of input");
            String str = locationString();
            localObject2 = str;
            ((EOFException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        else
        {
          i = this.pos;
          j = this.limit;
        }
      }
      else
      {
        n = i + 1;
        i1 = arrayOfChar[i];
        k = 10;
        if (i1 == k)
        {
          k = this.lineNumber + 1;
          this.lineNumber = k;
          this.lineStart = n;
          i = n;
          continue;
        }
        k = 32;
        if (i1 == k) {
          break label461;
        }
        k = 13;
        if (i1 == k) {
          break label461;
        }
        k = 9;
        if (i1 == k)
        {
          i = n;
          continue;
        }
        k = 47;
        if (i1 == k)
        {
          this.pos = n;
          if (n == j)
          {
            k = this.pos + -1;
            this.pos = k;
            boolean bool3 = fillBuffer(2);
            k = this.pos + 1;
            this.pos = k;
            if (!bool3) {
              i = n;
            }
          }
        }
      }
      for (;;)
      {
        return i1;
        checkLenient();
        k = this.pos;
        int i2 = arrayOfChar[k];
        int m;
        switch (i2)
        {
        default: 
          i = n;
          break;
        case 42: 
          k = this.pos + 1;
          this.pos = k;
          localObject1 = "*/";
          boolean bool2 = skipTo((String)localObject1);
          if (!bool2) {
            throw syntaxError("Unterminated comment");
          }
          m = this.pos;
          i = m + 2;
          j = this.limit;
          break;
        case 47: 
          m = this.pos + 1;
          this.pos = m;
          skipToEndOfLine();
          i = this.pos;
          j = this.limit;
          break;
          m = 35;
          if (i1 == m)
          {
            this.pos = n;
            checkLenient();
            skipToEndOfLine();
            i = this.pos;
            j = this.limit;
            break;
          }
          this.pos = n;
          i = n;
          continue;
          i1 = -1;
        }
      }
      label461:
      i = n;
    }
  }
  
  private String nextQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    boolean bool;
    do
    {
      int i = this.pos;
      int j = this.limit;
      int k = i;
      int m = i;
      if (m < j)
      {
        i = m + 1;
        char c1 = arrayOfChar[m];
        if (c1 == paramChar)
        {
          this.pos = i;
          c2 = i - k + -1;
          localStringBuilder.append(arrayOfChar, k, c2);
          return localStringBuilder.toString();
        }
        c2 = '\\';
        if (c1 == c2)
        {
          this.pos = i;
          c2 = i - k + -1;
          localStringBuilder.append(arrayOfChar, k, c2);
          c2 = readEscapeCharacter();
          localStringBuilder.append(c2);
          i = this.pos;
          j = this.limit;
          k = i;
        }
        for (;;)
        {
          m = i;
          break;
          c2 = '\n';
          if (c1 == c2)
          {
            c2 = this.lineNumber + 1;
            this.lineNumber = c2;
            this.lineStart = i;
          }
        }
      }
      char c2 = m - k;
      localStringBuilder.append(arrayOfChar, k, c2);
      this.pos = m;
      bool = fillBuffer(1);
    } while (bool);
    throw syntaxError("Unterminated string");
  }
  
  private String nextUnquotedValue()
  {
    StringBuilder localStringBuilder = null;
    int i = 0;
    int j;
    int m;
    char[] arrayOfChar;
    for (;;)
    {
      j = this.pos + i;
      m = this.limit;
      if (j >= m) {
        break;
      }
      arrayOfChar = this.buffer;
      m = this.pos + i;
      j = arrayOfChar[m];
      switch (j)
      {
      default: 
        i += 1;
      }
    }
    checkLenient();
    label195:
    String str;
    if (localStringBuilder == null)
    {
      str = new java/lang/String;
      arrayOfChar = this.buffer;
      m = this.pos;
      str.<init>(arrayOfChar, m, i);
    }
    for (;;)
    {
      j = this.pos + i;
      this.pos = j;
      return str;
      arrayOfChar = this.buffer;
      j = arrayOfChar.length;
      if (i < j)
      {
        j = i + 1;
        boolean bool1 = fillBuffer(j);
        if (!bool1) {
          break label195;
        }
        break;
      }
      if (localStringBuilder == null)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
      arrayOfChar = this.buffer;
      m = this.pos;
      localStringBuilder.append(arrayOfChar, m, i);
      int k = this.pos + i;
      this.pos = k;
      i = 0;
      boolean bool2 = fillBuffer(1);
      if (bool2) {
        break;
      }
      break label195;
      arrayOfChar = this.buffer;
      m = this.pos;
      localStringBuilder.append(arrayOfChar, m, i);
      str = localStringBuilder.toString();
    }
  }
  
  private int peekKeyword()
  {
    int i = 0;
    char[] arrayOfChar = this.buffer;
    int j = this.pos;
    int k = arrayOfChar[j];
    int m = 116;
    String str1;
    String str2;
    int i1;
    int i2;
    int i3;
    if (k != m)
    {
      m = 84;
      if (k != m) {}
    }
    else
    {
      str1 = "true";
      str2 = "TRUE";
      i1 = 5;
      i2 = str1.length();
      i3 = 1;
      label60:
      if (i3 >= i2) {
        break label257;
      }
      m = this.pos + i3;
      j = this.limit;
      if (m < j) {
        break label192;
      }
      m = i3 + 1;
      boolean bool1 = fillBuffer(m);
      if (bool1) {
        break label192;
      }
      i1 = 0;
    }
    for (;;)
    {
      return i1;
      int n = 102;
      if (k != n)
      {
        n = 70;
        if (k != n) {}
      }
      else
      {
        str1 = "false";
        str2 = "FALSE";
        i1 = 6;
        break;
      }
      n = 110;
      if (k != n)
      {
        n = 78;
        if (k != n) {}
      }
      else
      {
        str1 = "null";
        str2 = "NULL";
        i1 = 7;
        break;
      }
      i1 = 0;
      continue;
      label192:
      arrayOfChar = this.buffer;
      j = this.pos + i3;
      k = arrayOfChar[j];
      n = str1.charAt(i3);
      if (k != n)
      {
        n = str2.charAt(i3);
        if (k != n)
        {
          i1 = 0;
          continue;
        }
      }
      i3 += 1;
      break label60;
      label257:
      n = this.pos + i2;
      j = this.limit;
      if (n >= j)
      {
        n = i2 + 1;
        boolean bool2 = fillBuffer(n);
        if (!bool2) {}
      }
      else
      {
        arrayOfChar = this.buffer;
        j = this.pos + i2;
        char c = arrayOfChar[j];
        boolean bool3 = isLiteral(c);
        if (bool3)
        {
          i1 = 0;
          continue;
        }
      }
      i = this.pos + i2;
      this.pos = i;
      this.peeked = i1;
    }
  }
  
  private int peekNumber()
  {
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    int j = this.limit;
    long l1 = 0L;
    int k = 0;
    boolean bool1 = true;
    int m = 0;
    int n = 0;
    int i1 = i + n;
    if (i1 == j)
    {
      i1 = arrayOfChar.length;
      if (n == i1) {
        i1 = 0;
      }
    }
    for (;;)
    {
      label56:
      return i1;
      i1 = n + 1;
      boolean bool2 = fillBuffer(i1);
      label78:
      long l2;
      if (!bool2)
      {
        int i2 = 2;
        if ((m != i2) || (!bool1)) {
          break label602;
        }
        l2 = Long.MIN_VALUE;
        boolean bool3 = l1 < l2;
        if ((!bool3) && (k == 0)) {
          break label602;
        }
        if (k == 0) {
          break label594;
        }
      }
      for (;;)
      {
        this.peekedLong = l1;
        int i3 = this.pos + n;
        this.pos = i3;
        i3 = 15;
        this.peeked = i3;
        break label56;
        i = this.pos;
        j = this.limit;
        i3 = i + n;
        int i6 = arrayOfChar[i3];
        switch (i6)
        {
        default: 
          i3 = 48;
          if (i6 >= i3)
          {
            i3 = 57;
            if (i6 <= i3) {}
          }
          else
          {
            boolean bool4 = isLiteral(i6);
            if (!bool4) {
              break label78;
            }
            bool4 = false;
          }
          break;
        case 45: 
          if (m == 0)
          {
            k = 1;
            m = 1;
          }
        case 43: 
        case 69: 
        case 101: 
        case 46: 
          for (;;)
          {
            n += 1;
            break;
            int i4 = 5;
            if (m == i4)
            {
              m = 6;
            }
            else
            {
              i4 = 0;
              break label56;
              i4 = 5;
              if (m == i4)
              {
                m = 6;
              }
              else
              {
                i4 = 0;
                break label56;
                i4 = 2;
                if (m != i4)
                {
                  i4 = 4;
                  if (m != i4) {}
                }
                else
                {
                  m = 5;
                  continue;
                }
                i4 = 0;
                break label56;
                i4 = 2;
                if (m == i4)
                {
                  m = 3;
                }
                else
                {
                  i4 = 0;
                  break label56;
                  i4 = 1;
                  if ((m == i4) || (m == 0))
                  {
                    i4 = -(i6 + -48);
                    l1 = i4;
                    m = 2;
                  }
                  else
                  {
                    i4 = 2;
                    if (m == i4)
                    {
                      l2 = 0L;
                      boolean bool5 = l1 < l2;
                      if (!bool5)
                      {
                        bool5 = false;
                        break label56;
                      }
                      l2 = 10 * l1;
                      int i7 = i6 + -48;
                      long l3 = i7;
                      long l4 = l2 - l3;
                      l2 = -922337203685477580L;
                      bool5 = l1 < l2;
                      if (!bool5)
                      {
                        l2 = -922337203685477580L;
                        bool5 = l1 < l2;
                        if (bool5) {
                          break label544;
                        }
                        bool5 = l4 < l1;
                        if (!bool5) {
                          break label544;
                        }
                      }
                      label544:
                      for (bool5 = true;; bool5 = false)
                      {
                        bool1 &= bool5;
                        l1 = l4;
                        break;
                      }
                    }
                    i5 = 3;
                    if (m == i5)
                    {
                      m = 4;
                    }
                    else
                    {
                      i5 = 5;
                      if (m != i5)
                      {
                        i5 = 6;
                        if (m != i5) {}
                      }
                      else
                      {
                        m = 7;
                      }
                    }
                  }
                }
              }
            }
          }
          label594:
          l1 = -l1;
        }
      }
      label602:
      int i5 = 2;
      if (m != i5)
      {
        i5 = 4;
        if (m != i5)
        {
          i5 = 7;
          if (m != i5) {
            break label652;
          }
        }
      }
      this.peekedNumberLength = n;
      i5 = 16;
      this.peeked = i5;
      continue;
      label652:
      i5 = 0;
    }
  }
  
  private void push(int paramInt)
  {
    int i = 0;
    int j = this.stackSize;
    int[] arrayOfInt1 = this.stack;
    int k = arrayOfInt1.length;
    if (j == k)
    {
      int[] arrayOfInt2 = new int[this.stackSize * 2];
      int[] arrayOfInt3 = new int[this.stackSize * 2];
      j = this.stackSize * 2;
      String[] arrayOfString = new String[j];
      localObject = this.stack;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt2, 0, k);
      localObject = this.pathIndices;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt3, 0, k);
      localObject = this.pathNames;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfString, 0, k);
      this.stack = arrayOfInt2;
      this.pathIndices = arrayOfInt3;
      this.pathNames = arrayOfString;
    }
    Object localObject = this.stack;
    k = this.stackSize;
    i = k + 1;
    this.stackSize = i;
    localObject[k] = paramInt;
  }
  
  private char readEscapeCharacter()
  {
    int i = 4;
    int j = this.pos;
    int n = this.limit;
    if (j == n)
    {
      boolean bool1 = fillBuffer(1);
      if (!bool1) {
        throw syntaxError("Unterminated escape sequence");
      }
    }
    Object localObject1 = this.buffer;
    n = this.pos;
    int i1 = n + 1;
    this.pos = i1;
    int i2 = localObject1[n];
    int i3;
    int m;
    switch (i2)
    {
    default: 
      throw syntaxError("Invalid escape sequence");
    case 117: 
      int k = this.pos + 4;
      n = this.limit;
      if (k > n)
      {
        boolean bool2 = fillBuffer(i);
        if (!bool2) {
          throw syntaxError("Unterminated escape sequence");
        }
      }
      i3 = 0;
      int i5 = this.pos;
      int i6 = i5 + 4;
      if (i5 < i6)
      {
        localObject1 = this.buffer;
        int i7 = localObject1[i5];
        i3 = (char)(i3 << 4);
        m = 48;
        if (i7 >= m)
        {
          m = 57;
          if (i7 <= m)
          {
            m = i7 + -48 + i3;
            i3 = (char)m;
          }
        }
        for (;;)
        {
          i5 += 1;
          break;
          m = 97;
          if (i7 >= m)
          {
            m = 102;
            if (i7 <= m)
            {
              m = i7 + -97 + 10 + i3;
              i3 = (char)m;
              continue;
            }
          }
          m = 65;
          if (i7 < m) {
            break label363;
          }
          m = 70;
          if (i7 > m) {
            break label363;
          }
          m = i7 + -65 + 10 + i3;
          i3 = (char)m;
        }
        label363:
        localObject1 = new java/lang/NumberFormatException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("\\u");
        String str = new java/lang/String;
        char[] arrayOfChar = this.buffer;
        int i8 = this.pos;
        str.<init>(arrayOfChar, i8, i);
        localObject2 = str;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      m = this.pos + 4;
      this.pos = m;
    }
    for (;;)
    {
      return i3;
      int i4 = 9;
      continue;
      i4 = 8;
      continue;
      i4 = 10;
      continue;
      i4 = 13;
      continue;
      i4 = 12;
      continue;
      m = this.lineNumber + 1;
      this.lineNumber = m;
      m = this.pos;
      this.lineStart = m;
      i4 = i2;
    }
  }
  
  private void skipQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    boolean bool;
    do
    {
      int i = this.pos;
      int j = this.limit;
      int k = i;
      if (k < j)
      {
        i = k + 1;
        char c1 = arrayOfChar[k];
        if (c1 == paramChar)
        {
          this.pos = i;
          return;
        }
        char c2 = '\\';
        if (c1 == c2)
        {
          this.pos = i;
          readEscapeCharacter();
          i = this.pos;
          j = this.limit;
        }
        for (;;)
        {
          k = i;
          break;
          c2 = '\n';
          if (c1 == c2)
          {
            c2 = this.lineNumber + 1;
            this.lineNumber = c2;
            this.lineStart = i;
          }
        }
      }
      this.pos = k;
      bool = fillBuffer(1);
    } while (bool);
    throw syntaxError("Unterminated string");
  }
  
  private boolean skipTo(String paramString)
  {
    char[] arrayOfChar;
    for (;;)
    {
      int i = this.pos;
      int m = paramString.length();
      i += m;
      m = this.limit;
      if (i > m)
      {
        i = paramString.length();
        boolean bool = fillBuffer(i);
        if (!bool) {
          break label160;
        }
      }
      arrayOfChar = this.buffer;
      m = this.pos;
      j = arrayOfChar[m];
      m = 10;
      if (j != m) {
        break;
      }
      j = this.lineNumber + 1;
      this.lineNumber = j;
      j = this.pos + 1;
      this.lineStart = j;
      j = this.pos + 1;
      this.pos = j;
    }
    int i1 = 0;
    for (;;)
    {
      j = paramString.length();
      if (i1 >= j) {
        break label156;
      }
      arrayOfChar = this.buffer;
      int n = this.pos + i1;
      j = arrayOfChar[n];
      n = paramString.charAt(i1);
      if (j != n) {
        break;
      }
      int i2;
      i1 += 1;
    }
    label156:
    int j = 1;
    for (;;)
    {
      return j;
      label160:
      int k = 0;
      arrayOfChar = null;
    }
  }
  
  private void skipToEndOfLine()
  {
    int i = this.pos;
    int k = this.limit;
    int n;
    int j;
    if (i >= k)
    {
      boolean bool = fillBuffer(1);
      if (!bool) {}
    }
    else
    {
      char[] arrayOfChar = this.buffer;
      k = this.pos;
      int m = k + 1;
      this.pos = m;
      n = arrayOfChar[k];
      j = 10;
      if (n != j) {
        break label83;
      }
      j = this.lineNumber + 1;
      this.lineNumber = j;
      j = this.pos;
      this.lineStart = j;
    }
    for (;;)
    {
      return;
      label83:
      j = 13;
      if (n != j) {
        break;
      }
    }
  }
  
  private void skipUnquotedValue()
  {
    int i = 0;
    for (;;)
    {
      j = this.pos + i;
      int k = this.limit;
      if (j >= k) {
        break;
      }
      char[] arrayOfChar = this.buffer;
      k = this.pos + i;
      j = arrayOfChar[k];
      switch (j)
      {
      default: 
        i += 1;
      }
    }
    checkLenient();
    int j = this.pos + i;
    this.pos = j;
    for (;;)
    {
      return;
      j = this.pos + i;
      this.pos = j;
      boolean bool = fillBuffer(1);
      if (bool) {
        break;
      }
    }
  }
  
  private IOException syntaxError(String paramString)
  {
    MalformedJsonException localMalformedJsonException = new com/google/gson/stream/MalformedJsonException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString);
    String str = locationString();
    localObject = str;
    localMalformedJsonException.<init>((String)localObject);
    throw localMalformedJsonException;
  }
  
  public void beginArray()
  {
    Object localObject1 = null;
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 3;
    if (i == j)
    {
      push(1);
      localObject2 = this.pathIndices;
      int k = this.stackSize + -1;
      localObject2[k] = 0;
      this.peeked = 0;
      return;
    }
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Expected BEGIN_ARRAY but was ");
    localObject1 = peek();
    localObject3 = ((StringBuilder)localObject3).append(localObject1);
    localObject1 = locationString();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public void beginObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 1;
    if (i == j)
    {
      push(3);
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Expected BEGIN_OBJECT but was ");
    Object localObject2 = peek();
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = locationString();
    localObject1 = (String)localObject2;
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public void close()
  {
    this.peeked = 0;
    this.stack[0] = 8;
    this.stackSize = 1;
    this.in.close();
  }
  
  int doPeek()
  {
    int i = 7;
    int j = 5;
    int k = 4;
    int m = 2;
    int i2 = 1;
    Object localObject1 = this.stack;
    int i4 = this.stackSize + -1;
    int i5 = localObject1[i4];
    label62:
    int i6;
    if (i5 == i2)
    {
      localObject1 = this.stack;
      i4 = this.stackSize + -1;
      localObject1[i4] = m;
      i6 = nextNonWhitespace(i2);
      switch (i6)
      {
      default: 
        m = this.pos + -1;
        this.pos = m;
        k = peekKeyword();
        if (k == 0) {
          break;
        }
      }
    }
    for (;;)
    {
      return k;
      if (i5 == m)
      {
        i6 = nextNonWhitespace(i2);
        switch (i6)
        {
        case 44: 
        default: 
          throw syntaxError("Unterminated array");
        case 93: 
          this.peeked = k;
          break;
        case 59: 
          checkLenient();
          break;
        }
      }
      else
      {
        int i7 = 3;
        int i8;
        if ((i5 == i7) || (i5 == j))
        {
          int[] arrayOfInt = this.stack;
          i8 = this.stackSize + -1;
          arrayOfInt[i8] = k;
          if (i5 == j)
          {
            i6 = nextNonWhitespace(i2);
            switch (i6)
            {
            default: 
              throw syntaxError("Unterminated object");
            case 125: 
              this.peeked = m;
              k = m;
              break;
            case 59: 
              checkLenient();
            }
          }
          else
          {
            i6 = nextNonWhitespace(i2);
          }
        }
        else
        {
          int n;
          switch (i6)
          {
          default: 
            checkLenient();
            m = this.pos + -1;
            this.pos = m;
            m = (char)i6;
            n = isLiteral(m);
            if (n != 0)
            {
              k = 14;
              this.peeked = k;
            }
            break;
          case 34: 
            k = 13;
            this.peeked = k;
            break;
          case 39: 
            checkLenient();
            k = 12;
            this.peeked = k;
            break;
          case 125: 
            if (i5 != j)
            {
              this.peeked = n;
              k = n;
            }
            else
            {
              throw syntaxError("Expected name");
              throw syntaxError("Expected name");
              if (i5 == k)
              {
                localObject1 = this.stack;
                i4 = this.stackSize + -1;
                localObject1[i4] = j;
                i6 = nextNonWhitespace(i2);
                switch (i6)
                {
                case 58: 
                default: 
                  throw syntaxError("Expected ':'");
                }
                checkLenient();
                i8 = this.pos;
                i4 = this.limit;
                if (i8 >= i4)
                {
                  boolean bool2 = fillBuffer(i2);
                  if (!bool2) {
                    break label62;
                  }
                }
                localObject1 = this.buffer;
                i4 = this.pos;
                i9 = localObject1[i4];
                i4 = 62;
                if (i9 != i4) {
                  break label62;
                }
                i9 = this.pos + 1;
                this.pos = i9;
                break label62;
              }
              int i9 = 6;
              if (i5 == i9)
              {
                boolean bool3 = this.lenient;
                if (bool3) {
                  consumeNonExecutePrefix();
                }
                localObject1 = this.stack;
                i4 = this.stackSize + -1;
                localObject1[i4] = i;
                break label62;
              }
              if (i5 == i)
              {
                localObject1 = null;
                i6 = nextNonWhitespace(false);
                i10 = -1;
                if (i6 == i10)
                {
                  k = 17;
                  this.peeked = k;
                  continue;
                }
                checkLenient();
                i10 = this.pos + -1;
                this.pos = i10;
                break label62;
              }
              int i10 = 8;
              if (i5 != i10) {
                break label62;
              }
              Object localObject2 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject2).<init>("JsonReader is closed");
              throw ((Throwable)localObject2);
              if (i5 == i2)
              {
                this.peeked = k;
              }
              else
              {
                int i1;
                if ((i5 == i2) || (i5 == n))
                {
                  checkLenient();
                  i1 = this.pos + -1;
                  this.pos = i1;
                  this.peeked = i;
                  k = i;
                }
                else
                {
                  throw syntaxError("Unexpected value");
                  checkLenient();
                  k = 8;
                  this.peeked = k;
                  continue;
                  k = 9;
                  this.peeked = k;
                  continue;
                  k = 3;
                  this.peeked = k;
                  continue;
                  this.peeked = i2;
                  k = i2;
                  continue;
                  k = peekNumber();
                  if (k == 0)
                  {
                    localObject2 = this.buffer;
                    int i3 = this.pos;
                    i1 = localObject2[i3];
                    boolean bool1 = isLiteral(i1);
                    if (!bool1) {
                      throw syntaxError("Expected value");
                    }
                    checkLenient();
                    k = 10;
                    this.peeked = k;
                  }
                }
              }
            }
            break;
          }
        }
      }
    }
  }
  
  public void endArray()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 4;
    if (i == j)
    {
      j = this.stackSize + -1;
      this.stackSize = j;
      localObject1 = this.pathIndices;
      int k = this.stackSize + -1;
      int m = localObject1[k] + 1;
      localObject1[k] = m;
      this.peeked = 0;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected END_ARRAY but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void endObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 2;
    if (i == j)
    {
      j = this.stackSize + -1;
      this.stackSize = j;
      localObject1 = this.pathNames;
      int k = this.stackSize;
      localObject1[k] = null;
      localObject1 = this.pathIndices;
      k = this.stackSize + -1;
      int m = localObject1[k] + 1;
      localObject1[k] = m;
      this.peeked = 0;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected END_OBJECT but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String getPath()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    char c1 = '$';
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(c1);
    int j = 0;
    int k = this.stackSize;
    if (j < k)
    {
      localObject = this.stack;
      int m = localObject[j];
      switch (m)
      {
      }
      for (;;)
      {
        j += 1;
        break;
        m = 91;
        localObject = localStringBuilder.append(m);
        int[] arrayOfInt = this.pathIndices;
        int i = arrayOfInt[j];
        localObject = ((StringBuilder)localObject).append(i);
        i = 93;
        ((StringBuilder)localObject).append(i);
        continue;
        char c2 = '.';
        localStringBuilder.append(c2);
        localObject = this.pathNames[j];
        if (localObject != null)
        {
          localObject = this.pathNames[j];
          localStringBuilder.append((String)localObject);
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public boolean hasNext()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 2;
    if (i != j)
    {
      j = 4;
      if (i == j) {}
    }
    int k;
    for (j = 1;; k = 0) {
      return j;
    }
  }
  
  public final boolean isLenient()
  {
    return this.lenient;
  }
  
  public boolean nextBoolean()
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 5;
    int k;
    if (i == j)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      k = localObject1[j] + 1;
      localObject1[j] = k;
      bool = true;
    }
    for (;;)
    {
      return bool;
      j = 6;
      if (i != j) {
        break;
      }
      this.peeked = 0;
      localObject2 = this.pathIndices;
      k = this.stackSize + -1;
      int m = localObject2[k] + 1;
      localObject2[k] = m;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a boolean but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public double nextDouble()
  {
    int i = 11;
    int j = 8;
    int k = this.peeked;
    if (k == 0) {
      k = doPeek();
    }
    int m = 15;
    Object localObject1;
    int i2;
    double d;
    if (k == m)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      i2 = localObject1[j] + 1;
      localObject1[j] = i2;
      long l = this.peekedLong;
      d = l;
    }
    for (;;)
    {
      return d;
      m = 16;
      if (k == m)
      {
        localObject1 = new java/lang/String;
        localObject2 = this.buffer;
        i2 = this.pos;
        int i3 = this.peekedNumberLength;
        ((String)localObject1).<init>((char[])localObject2, i2, i3);
        this.peekedString = ((String)localObject1);
        m = this.pos;
        j = this.peekedNumberLength;
        m += j;
        this.pos = m;
      }
      do
      {
        for (;;)
        {
          this.peeked = i;
          localObject1 = this.peekedString;
          d = Double.parseDouble((String)localObject1);
          boolean bool = this.lenient;
          if (bool) {
            break label406;
          }
          bool = Double.isNaN(d);
          if (!bool)
          {
            bool = Double.isInfinite(d);
            if (!bool) {
              break label406;
            }
          }
          localObject1 = new com/google/gson/stream/MalformedJsonException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("JSON forbids NaN and infinities: ").append(d);
          localObject3 = locationString();
          localObject2 = (String)localObject3;
          ((MalformedJsonException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          int n;
          if (k != j)
          {
            n = 9;
            if (k != n) {}
          }
          else
          {
            if (k == j) {}
            for (n = 39;; i1 = 34)
            {
              localObject1 = nextQuotedValue(n);
              this.peekedString = ((String)localObject1);
              break;
            }
          }
          i1 = 10;
          if (k != i1) {
            break;
          }
          localObject1 = nextUnquotedValue();
          this.peekedString = ((String)localObject1);
        }
      } while (k == i);
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected a double but was ");
      Object localObject3 = peek();
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = locationString();
      localObject2 = (String)localObject3;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      label406:
      int i1 = 0;
      this.peekedString = null;
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      i2 = localObject1[j] + 1;
      localObject1[j] = i2;
    }
  }
  
  public int nextInt()
  {
    int i = 10;
    int j = 8;
    int k = this.peeked;
    if (k == 0) {
      k = doPeek();
    }
    int m = 15;
    int i3;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i4;
    if (k == m)
    {
      i3 = (int)this.peekedLong;
      long l1 = this.peekedLong;
      long l2 = i3;
      boolean bool1 = l1 < l2;
      if (bool1)
      {
        localObject1 = new java/lang/NumberFormatException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
        l2 = this.peekedLong;
        localObject2 = ((StringBuilder)localObject2).append(l2);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      i = localObject1[j] + 1;
      localObject1[j] = i;
      i4 = i3;
      return i4;
    }
    int n = 16;
    if (k == n)
    {
      localObject1 = new java/lang/String;
      localObject2 = this.buffer;
      i = this.pos;
      int i5 = this.peekedNumberLength;
      ((String)localObject1).<init>((char[])localObject2, i, i5);
      this.peekedString = ((String)localObject1);
      n = this.pos;
      j = this.peekedNumberLength;
      n += j;
      this.pos = n;
    }
    for (;;)
    {
      this.peeked = 11;
      localObject1 = this.peekedString;
      double d1 = Double.parseDouble((String)localObject1);
      i3 = (int)d1;
      double d2 = i3;
      boolean bool2 = d2 < d1;
      if (bool2)
      {
        localObject1 = new java/lang/NumberFormatException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
        localObject3 = this.peekedString;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        if (k != j)
        {
          i1 = 9;
          if ((k != i1) && (k != i)) {}
        }
        else if (k == i)
        {
          localObject1 = nextUnquotedValue();
          this.peekedString = ((String)localObject1);
        }
      }
      try
      {
        localObject1 = this.peekedString;
        i3 = Integer.parseInt((String)localObject1);
        i1 = 0;
        localObject1 = null;
        this.peeked = 0;
        localObject1 = this.pathIndices;
        j = this.stackSize + -1;
        i = localObject1[j] + 1;
        localObject1[j] = i;
        i4 = i3;
      }
      catch (NumberFormatException localNumberFormatException) {}
      if (k == j) {}
      for (int i1 = 39;; i2 = 34)
      {
        localObject1 = nextQuotedValue(i1);
        this.peekedString = ((String)localObject1);
        break;
      }
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
      localObject3 = peek();
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = locationString();
      localObject2 = (String)localObject3;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      int i2 = 0;
      this.peekedString = null;
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      i = localObject1[j] + 1;
      localObject1[j] = i;
      i4 = i3;
      break;
    }
  }
  
  public long nextLong()
  {
    int i = 10;
    int j = 8;
    int k = this.peeked;
    if (k == 0) {
      k = doPeek();
    }
    int m = 15;
    Object localObject1;
    long l;
    if (k == m)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      i = localObject1[j] + 1;
      localObject1[j] = i;
      l = this.peekedLong;
    }
    for (;;)
    {
      return l;
      m = 16;
      if (k == m)
      {
        localObject1 = new java/lang/String;
        localObject3 = this.buffer;
        i = this.pos;
        int i2 = this.peekedNumberLength;
        ((String)localObject1).<init>((char[])localObject3, i, i2);
        this.peekedString = ((String)localObject1);
        m = this.pos;
        j = this.peekedNumberLength;
        m += j;
        this.pos = m;
      }
      for (;;)
      {
        this.peeked = 11;
        localObject1 = this.peekedString;
        double d1 = Double.parseDouble((String)localObject1);
        l = d1;
        double d2 = l;
        boolean bool = d2 < d1;
        if (!bool) {
          break label444;
        }
        localObject1 = new java/lang/NumberFormatException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Expected a long but was ");
        localObject4 = this.peekedString;
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = locationString();
        localObject3 = (String)localObject4;
        ((NumberFormatException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
        if (k != j)
        {
          n = 9;
          if ((k != n) && (k != i)) {
            break label376;
          }
        }
        if (k != i) {
          break label343;
        }
        localObject1 = nextUnquotedValue();
        this.peekedString = ((String)localObject1);
        try
        {
          localObject1 = this.peekedString;
          l = Long.parseLong((String)localObject1);
          n = 0;
          localObject1 = null;
          this.peeked = 0;
          localObject1 = this.pathIndices;
          j = this.stackSize + -1;
          i = localObject1[j] + 1;
          localObject1[j] = i;
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
      label343:
      if (k == j) {}
      for (int n = 39;; i1 = 34)
      {
        localObject2 = nextQuotedValue(n);
        this.peekedString = ((String)localObject2);
        break;
      }
      label376:
      Object localObject2 = new java/lang/IllegalStateException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Expected a long but was ");
      Object localObject4 = peek();
      localObject3 = ((StringBuilder)localObject3).append(localObject4);
      localObject4 = locationString();
      localObject3 = (String)localObject4;
      ((IllegalStateException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
      label444:
      int i1 = 0;
      this.peekedString = null;
      this.peeked = 0;
      localObject2 = this.pathIndices;
      j = this.stackSize + -1;
      i = localObject2[j] + 1;
      localObject2[j] = i;
    }
  }
  
  public String nextName()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 14;
    String str;
    if (i == j) {
      str = nextUnquotedValue();
    }
    for (;;)
    {
      this.peeked = 0;
      localObject1 = this.pathNames;
      int m = this.stackSize + -1;
      localObject1[m] = str;
      return str;
      j = 12;
      if (i == j)
      {
        j = 39;
        str = nextQuotedValue(j);
      }
      else
      {
        int k = 13;
        if (i != k) {
          break;
        }
        k = 34;
        str = nextQuotedValue(k);
      }
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a name but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void nextNull()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 7;
    if (i == j)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      int k = this.stackSize + -1;
      int m = localObject1[k] + 1;
      localObject1[k] = m;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected null but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String nextString()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 10;
    String str;
    if (i == j) {
      str = nextUnquotedValue();
    }
    for (;;)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      int n = this.stackSize + -1;
      int i1 = localObject1[n] + 1;
      localObject1[n] = i1;
      return str;
      j = 8;
      if (i == j)
      {
        j = 39;
        str = nextQuotedValue(j);
      }
      else
      {
        int k = 9;
        if (i == k)
        {
          k = 34;
          str = nextQuotedValue(k);
        }
        else
        {
          int m = 11;
          if (i == m)
          {
            str = this.peekedString;
            m = 0;
            localObject1 = null;
            this.peekedString = null;
          }
          else
          {
            m = 15;
            if (i == m)
            {
              long l = this.peekedLong;
              str = Long.toString(l);
            }
            else
            {
              m = 16;
              if (i != m) {
                break;
              }
              str = new java/lang/String;
              localObject1 = this.buffer;
              n = this.pos;
              i1 = this.peekedNumberLength;
              str.<init>((char[])localObject1, n, i1);
              m = this.pos;
              n = this.peekedNumberLength;
              m += n;
              this.pos = m;
            }
          }
        }
      }
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a string but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonToken peek()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    Object localObject;
    switch (i)
    {
    default: 
      localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>();
      throw ((Throwable)localObject);
    case 1: 
      localObject = JsonToken.BEGIN_OBJECT;
    }
    for (;;)
    {
      return (JsonToken)localObject;
      localObject = JsonToken.END_OBJECT;
      continue;
      localObject = JsonToken.BEGIN_ARRAY;
      continue;
      localObject = JsonToken.END_ARRAY;
      continue;
      localObject = JsonToken.NAME;
      continue;
      localObject = JsonToken.BOOLEAN;
      continue;
      localObject = JsonToken.NULL;
      continue;
      localObject = JsonToken.STRING;
      continue;
      localObject = JsonToken.NUMBER;
      continue;
      localObject = JsonToken.END_DOCUMENT;
    }
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public void skipValue()
  {
    int i = 3;
    int j = 1;
    int k = 0;
    int m = this.peeked;
    if (m == 0) {
      m = doPeek();
    }
    if (m == i)
    {
      push(j);
      k += 1;
    }
    for (;;)
    {
      int n = 0;
      Object localObject = null;
      this.peeked = 0;
      if (k != 0) {
        break;
      }
      localObject = this.pathIndices;
      int i3 = this.stackSize + -1;
      j = localObject[i3] + 1;
      localObject[i3] = j;
      localObject = this.pathNames;
      i3 = this.stackSize + -1;
      localObject[i3] = "null";
      return;
      if (m == j)
      {
        push(i);
        k += 1;
      }
      else
      {
        n = 4;
        if (m == n)
        {
          n = this.stackSize + -1;
          this.stackSize = n;
          k += -1;
        }
        else
        {
          n = 2;
          if (m == n)
          {
            n = this.stackSize + -1;
            this.stackSize = n;
            k += -1;
          }
          else
          {
            n = 14;
            if (m != n)
            {
              n = 10;
              if (m != n) {}
            }
            else
            {
              skipUnquotedValue();
              continue;
            }
            n = 8;
            if (m != n)
            {
              n = 12;
              if (m != n) {}
            }
            else
            {
              n = 39;
              skipQuotedValue(n);
              continue;
            }
            int i1 = 9;
            if (m != i1)
            {
              i1 = 13;
              if (m != i1) {}
            }
            else
            {
              i1 = 34;
              skipQuotedValue(i1);
              continue;
            }
            int i2 = 16;
            if (m == i2)
            {
              i2 = this.pos;
              i3 = this.peekedNumberLength;
              i2 += i3;
              this.pos = i2;
            }
          }
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getSimpleName();
    localStringBuilder = localStringBuilder.append(str);
    str = locationString();
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/stream/JsonReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */