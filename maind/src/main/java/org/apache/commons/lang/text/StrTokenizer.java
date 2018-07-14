package org.apache.commons.lang.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class StrTokenizer
  implements ListIterator, Cloneable
{
  private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
  private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
  private char[] chars;
  private StrMatcher delimMatcher;
  private boolean emptyAsNull;
  private boolean ignoreEmptyTokens;
  private StrMatcher ignoredMatcher;
  private StrMatcher quoteMatcher;
  private int tokenPos;
  private String[] tokens;
  private StrMatcher trimmerMatcher;
  
  static
  {
    StrTokenizer localStrTokenizer = new org/apache/commons/lang/text/StrTokenizer;
    localStrTokenizer.<init>();
    CSV_TOKENIZER_PROTOTYPE = localStrTokenizer;
    localStrTokenizer = CSV_TOKENIZER_PROTOTYPE;
    StrMatcher localStrMatcher = StrMatcher.commaMatcher();
    localStrTokenizer.setDelimiterMatcher(localStrMatcher);
    localStrTokenizer = CSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.doubleQuoteMatcher();
    localStrTokenizer.setQuoteMatcher(localStrMatcher);
    localStrTokenizer = CSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.noneMatcher();
    localStrTokenizer.setIgnoredMatcher(localStrMatcher);
    localStrTokenizer = CSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.trimMatcher();
    localStrTokenizer.setTrimmerMatcher(localStrMatcher);
    CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
    CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    localStrTokenizer = new org/apache/commons/lang/text/StrTokenizer;
    localStrTokenizer.<init>();
    TSV_TOKENIZER_PROTOTYPE = localStrTokenizer;
    localStrTokenizer = TSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.tabMatcher();
    localStrTokenizer.setDelimiterMatcher(localStrMatcher);
    localStrTokenizer = TSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.doubleQuoteMatcher();
    localStrTokenizer.setQuoteMatcher(localStrMatcher);
    localStrTokenizer = TSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.noneMatcher();
    localStrTokenizer.setIgnoredMatcher(localStrMatcher);
    localStrTokenizer = TSV_TOKENIZER_PROTOTYPE;
    localStrMatcher = StrMatcher.trimMatcher();
    localStrTokenizer.setTrimmerMatcher(localStrMatcher);
    TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
    TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
  }
  
  public StrTokenizer()
  {
    StrMatcher localStrMatcher = StrMatcher.splitMatcher();
    this.delimMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.quoteMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.ignoredMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.trimmerMatcher = localStrMatcher;
    this.emptyAsNull = false;
    this.ignoreEmptyTokens = true;
    this.chars = null;
  }
  
  public StrTokenizer(String paramString)
  {
    Object localObject = StrMatcher.splitMatcher();
    this.delimMatcher = ((StrMatcher)localObject);
    localObject = StrMatcher.noneMatcher();
    this.quoteMatcher = ((StrMatcher)localObject);
    localObject = StrMatcher.noneMatcher();
    this.ignoredMatcher = ((StrMatcher)localObject);
    localObject = StrMatcher.noneMatcher();
    this.trimmerMatcher = ((StrMatcher)localObject);
    localObject = null;
    this.emptyAsNull = false;
    boolean bool = true;
    this.ignoreEmptyTokens = bool;
    if (paramString != null) {
      localObject = paramString.toCharArray();
    }
    for (this.chars = ((char[])localObject);; this.chars = null)
    {
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public StrTokenizer(String paramString, char paramChar)
  {
    this(paramString);
    setDelimiterChar(paramChar);
  }
  
  public StrTokenizer(String paramString, char paramChar1, char paramChar2)
  {
    this(paramString, paramChar1);
    setQuoteChar(paramChar2);
  }
  
  public StrTokenizer(String paramString1, String paramString2)
  {
    this(paramString1);
    setDelimiterString(paramString2);
  }
  
  public StrTokenizer(String paramString, StrMatcher paramStrMatcher)
  {
    this(paramString);
    setDelimiterMatcher(paramStrMatcher);
  }
  
  public StrTokenizer(String paramString, StrMatcher paramStrMatcher1, StrMatcher paramStrMatcher2)
  {
    this(paramString, paramStrMatcher1);
    setQuoteMatcher(paramStrMatcher2);
  }
  
  public StrTokenizer(char[] paramArrayOfChar)
  {
    StrMatcher localStrMatcher = StrMatcher.splitMatcher();
    this.delimMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.quoteMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.ignoredMatcher = localStrMatcher;
    localStrMatcher = StrMatcher.noneMatcher();
    this.trimmerMatcher = localStrMatcher;
    this.emptyAsNull = false;
    this.ignoreEmptyTokens = true;
    this.chars = paramArrayOfChar;
  }
  
  public StrTokenizer(char[] paramArrayOfChar, char paramChar)
  {
    this(paramArrayOfChar);
    setDelimiterChar(paramChar);
  }
  
  public StrTokenizer(char[] paramArrayOfChar, char paramChar1, char paramChar2)
  {
    this(paramArrayOfChar, paramChar1);
    setQuoteChar(paramChar2);
  }
  
  public StrTokenizer(char[] paramArrayOfChar, String paramString)
  {
    this(paramArrayOfChar);
    setDelimiterString(paramString);
  }
  
  public StrTokenizer(char[] paramArrayOfChar, StrMatcher paramStrMatcher)
  {
    this(paramArrayOfChar);
    setDelimiterMatcher(paramStrMatcher);
  }
  
  public StrTokenizer(char[] paramArrayOfChar, StrMatcher paramStrMatcher1, StrMatcher paramStrMatcher2)
  {
    this(paramArrayOfChar, paramStrMatcher1);
    setQuoteMatcher(paramStrMatcher2);
  }
  
  private void addToken(List paramList, String paramString)
  {
    boolean bool;
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      bool = isIgnoreEmptyTokens();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = isEmptyTokenAsNull();
      if (bool) {
        paramString = null;
      }
      paramList.add(paramString);
    }
  }
  
  private void checkTokenized()
  {
    Object localObject = this.tokens;
    List localList;
    int i;
    if (localObject == null)
    {
      localObject = this.chars;
      if (localObject != null) {
        break label58;
      }
      localList = tokenize(null, 0, 0);
      i = localList.size();
      localObject = new String[i];
      localObject = (String[])localList.toArray((Object[])localObject);
    }
    for (this.tokens = ((String[])localObject);; this.tokens = ((String[])localObject))
    {
      return;
      label58:
      localObject = this.chars;
      char[] arrayOfChar = this.chars;
      int j = arrayOfChar.length;
      localList = tokenize((char[])localObject, 0, j);
      i = localList.size();
      localObject = new String[i];
      localObject = (String[])localList.toArray((Object[])localObject);
    }
  }
  
  private static StrTokenizer getCSVClone()
  {
    return (StrTokenizer)CSV_TOKENIZER_PROTOTYPE.clone();
  }
  
  public static StrTokenizer getCSVInstance()
  {
    return getCSVClone();
  }
  
  public static StrTokenizer getCSVInstance(String paramString)
  {
    StrTokenizer localStrTokenizer = getCSVClone();
    localStrTokenizer.reset(paramString);
    return localStrTokenizer;
  }
  
  public static StrTokenizer getCSVInstance(char[] paramArrayOfChar)
  {
    StrTokenizer localStrTokenizer = getCSVClone();
    localStrTokenizer.reset(paramArrayOfChar);
    return localStrTokenizer;
  }
  
  private static StrTokenizer getTSVClone()
  {
    return (StrTokenizer)TSV_TOKENIZER_PROTOTYPE.clone();
  }
  
  public static StrTokenizer getTSVInstance()
  {
    return getTSVClone();
  }
  
  public static StrTokenizer getTSVInstance(String paramString)
  {
    StrTokenizer localStrTokenizer = getTSVClone();
    localStrTokenizer.reset(paramString);
    return localStrTokenizer;
  }
  
  public static StrTokenizer getTSVInstance(char[] paramArrayOfChar)
  {
    StrTokenizer localStrTokenizer = getTSVClone();
    localStrTokenizer.reset(paramArrayOfChar);
    return localStrTokenizer;
  }
  
  private boolean isQuote(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    if (i < paramInt4)
    {
      j = paramInt1 + i;
      if (j < paramInt2)
      {
        j = paramInt1 + i;
        j = paramArrayOfChar[j];
        int k = paramInt3 + i;
        k = paramArrayOfChar[k];
        if (j == k) {
          break label60;
        }
      }
    }
    for (int j = 0;; j = 1)
    {
      return j;
      label60:
      i += 1;
      break;
    }
  }
  
  private int readNextToken(char[] paramArrayOfChar, int paramInt1, int paramInt2, StrBuilder paramStrBuilder, List paramList)
  {
    Object localObject1;
    int i;
    Object localObject2;
    int k;
    if (paramInt1 < paramInt2)
    {
      localObject1 = getIgnoredMatcher();
      i = ((StrMatcher)localObject1).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
      localObject2 = getTrimmerMatcher();
      int j = ((StrMatcher)localObject2).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
      k = Math.max(i, j);
      if (k != 0)
      {
        localObject1 = getDelimiterMatcher();
        i = ((StrMatcher)localObject1).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
        if (i <= 0)
        {
          localObject1 = getQuoteMatcher();
          i = ((StrMatcher)localObject1).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
          if (i <= 0) {
            break label120;
          }
        }
      }
    }
    if (paramInt1 >= paramInt2)
    {
      localObject1 = "";
      addToken(paramList, (String)localObject1);
      i = -1;
    }
    for (;;)
    {
      return i;
      label120:
      paramInt1 += k;
      break;
      localObject1 = getDelimiterMatcher();
      int m = ((StrMatcher)localObject1).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
      if (m > 0)
      {
        localObject1 = "";
        addToken(paramList, (String)localObject1);
        i = paramInt1 + m;
      }
      else
      {
        localObject1 = getQuoteMatcher();
        int n = ((StrMatcher)localObject1).isMatch(paramArrayOfChar, paramInt1, paramInt1, paramInt2);
        if (n > 0)
        {
          int i1 = paramInt1 + n;
          localObject1 = this;
          localObject2 = paramArrayOfChar;
          i = readWithQuotes(paramArrayOfChar, i1, paramInt2, paramStrBuilder, paramList, paramInt1, n);
        }
        else
        {
          i = readWithQuotes(paramArrayOfChar, paramInt1, paramInt2, paramStrBuilder, paramList, 0, 0);
        }
      }
    }
  }
  
  private int readWithQuotes(char[] paramArrayOfChar, int paramInt1, int paramInt2, StrBuilder paramStrBuilder, List paramList, int paramInt3, int paramInt4)
  {
    paramStrBuilder.clear();
    int i = paramInt1;
    int j;
    int k;
    if (paramInt4 > 0)
    {
      j = 1;
      k = 0;
    }
    Object localObject;
    int m;
    int i2;
    int i3;
    for (;;)
    {
      if (i < paramInt2)
      {
        if (j != 0)
        {
          localObject = this;
          m = paramInt4;
          boolean bool1 = isQuote(paramArrayOfChar, i, paramInt2, paramInt3, paramInt4);
          if (bool1)
          {
            m = i + paramInt4;
            bool1 = isQuote(paramArrayOfChar, m, paramInt2, paramInt3, paramInt4);
            if (bool1)
            {
              paramStrBuilder.append(paramArrayOfChar, i, paramInt4);
              n = paramInt4 * 2;
              i += n;
              k = paramStrBuilder.size();
              continue;
              j = 0;
              break;
            }
            j = 0;
            i += paramInt4;
            continue;
          }
          i2 = i + 1;
          n = paramArrayOfChar[i];
          paramStrBuilder.append(n);
          k = paramStrBuilder.size();
          i = i2;
          continue;
        }
        localObject = getDelimiterMatcher();
        i3 = ((StrMatcher)localObject).isMatch(paramArrayOfChar, i, paramInt1, paramInt2);
        if (i3 > 0)
        {
          localObject = paramStrBuilder.substring(0, k);
          addToken(paramList, (String)localObject);
        }
      }
    }
    int i1;
    for (int n = i + i3;; i1 = -1)
    {
      return n;
      if (paramInt4 > 0)
      {
        localObject = this;
        m = paramInt4;
        boolean bool2 = isQuote(paramArrayOfChar, i, paramInt2, paramInt3, paramInt4);
        if (bool2)
        {
          j = 1;
          i += paramInt4;
          break;
        }
      }
      localObject = getIgnoredMatcher();
      int i4 = ((StrMatcher)localObject).isMatch(paramArrayOfChar, i, paramInt1, paramInt2);
      if (i4 > 0)
      {
        i += i4;
        break;
      }
      localObject = getTrimmerMatcher();
      int i5 = ((StrMatcher)localObject).isMatch(paramArrayOfChar, i, paramInt1, paramInt2);
      if (i5 > 0)
      {
        paramStrBuilder.append(paramArrayOfChar, i, i5);
        i += i5;
        break;
      }
      i2 = i + 1;
      char c = paramArrayOfChar[i];
      paramStrBuilder.append(c);
      k = paramStrBuilder.size();
      i = i2;
      break;
      localObject = paramStrBuilder.substring(0, k);
      addToken(paramList, (String)localObject);
    }
  }
  
  public void add(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("add() is unsupported");
    throw localUnsupportedOperationException;
  }
  
  public Object clone()
  {
    try
    {
      localObject = cloneReset();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
    return localObject;
  }
  
  Object cloneReset()
  {
    StrTokenizer localStrTokenizer = (StrTokenizer)super.clone();
    char[] arrayOfChar = localStrTokenizer.chars;
    if (arrayOfChar != null)
    {
      arrayOfChar = (char[])localStrTokenizer.chars.clone();
      localStrTokenizer.chars = arrayOfChar;
    }
    localStrTokenizer.reset();
    return localStrTokenizer;
  }
  
  public String getContent()
  {
    Object localObject = this.chars;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = new java/lang/String;
      char[] arrayOfChar = this.chars;
      ((String)localObject).<init>(arrayOfChar);
    }
  }
  
  public StrMatcher getDelimiterMatcher()
  {
    return this.delimMatcher;
  }
  
  public StrMatcher getIgnoredMatcher()
  {
    return this.ignoredMatcher;
  }
  
  public StrMatcher getQuoteMatcher()
  {
    return this.quoteMatcher;
  }
  
  public String[] getTokenArray()
  {
    checkTokenized();
    return (String[])this.tokens.clone();
  }
  
  public List getTokenList()
  {
    checkTokenized();
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject = this.tokens;
    int i = localObject.length;
    localArrayList.<init>(i);
    int j = 0;
    for (;;)
    {
      localObject = this.tokens;
      i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = this.tokens[j];
      localArrayList.add(localObject);
      j += 1;
    }
    return localArrayList;
  }
  
  public StrMatcher getTrimmerMatcher()
  {
    return this.trimmerMatcher;
  }
  
  public boolean hasNext()
  {
    checkTokenized();
    int i = this.tokenPos;
    String[] arrayOfString = this.tokens;
    int k = arrayOfString.length;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean hasPrevious()
  {
    checkTokenized();
    int i = this.tokenPos;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isEmptyTokenAsNull()
  {
    return this.emptyAsNull;
  }
  
  public boolean isIgnoreEmptyTokens()
  {
    return this.ignoreEmptyTokens;
  }
  
  public Object next()
  {
    boolean bool = hasNext();
    if (bool)
    {
      localObject = this.tokens;
      int i = this.tokenPos;
      int j = i + 1;
      this.tokenPos = j;
      return localObject[i];
    }
    Object localObject = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int nextIndex()
  {
    return this.tokenPos;
  }
  
  public String nextToken()
  {
    boolean bool = hasNext();
    int i;
    if (bool)
    {
      localObject = this.tokens;
      i = this.tokenPos;
      int j = i + 1;
      this.tokenPos = j;
    }
    for (Object localObject = localObject[i];; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  public Object previous()
  {
    boolean bool = hasPrevious();
    if (bool)
    {
      localObject = this.tokens;
      int i = this.tokenPos + -1;
      this.tokenPos = i;
      return localObject[i];
    }
    Object localObject = new java/util/NoSuchElementException;
    ((NoSuchElementException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int previousIndex()
  {
    return this.tokenPos + -1;
  }
  
  public String previousToken()
  {
    boolean bool = hasPrevious();
    int i;
    if (bool)
    {
      localObject = this.tokens;
      i = this.tokenPos + -1;
      this.tokenPos = i;
    }
    for (Object localObject = localObject[i];; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("remove() is unsupported");
    throw localUnsupportedOperationException;
  }
  
  public StrTokenizer reset()
  {
    this.tokenPos = 0;
    this.tokens = null;
    return this;
  }
  
  public StrTokenizer reset(String paramString)
  {
    reset();
    char[] arrayOfChar;
    if (paramString != null) {
      arrayOfChar = paramString.toCharArray();
    }
    for (this.chars = arrayOfChar;; this.chars = null)
    {
      return this;
      arrayOfChar = null;
    }
  }
  
  public StrTokenizer reset(char[] paramArrayOfChar)
  {
    reset();
    this.chars = paramArrayOfChar;
    return this;
  }
  
  public void set(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("set() is unsupported");
    throw localUnsupportedOperationException;
  }
  
  public StrTokenizer setDelimiterChar(char paramChar)
  {
    StrMatcher localStrMatcher = StrMatcher.charMatcher(paramChar);
    return setDelimiterMatcher(localStrMatcher);
  }
  
  public StrTokenizer setDelimiterMatcher(StrMatcher paramStrMatcher)
  {
    StrMatcher localStrMatcher;
    if (paramStrMatcher == null) {
      localStrMatcher = StrMatcher.noneMatcher();
    }
    for (this.delimMatcher = localStrMatcher;; this.delimMatcher = paramStrMatcher) {
      return this;
    }
  }
  
  public StrTokenizer setDelimiterString(String paramString)
  {
    StrMatcher localStrMatcher = StrMatcher.stringMatcher(paramString);
    return setDelimiterMatcher(localStrMatcher);
  }
  
  public StrTokenizer setEmptyTokenAsNull(boolean paramBoolean)
  {
    this.emptyAsNull = paramBoolean;
    return this;
  }
  
  public StrTokenizer setIgnoreEmptyTokens(boolean paramBoolean)
  {
    this.ignoreEmptyTokens = paramBoolean;
    return this;
  }
  
  public StrTokenizer setIgnoredChar(char paramChar)
  {
    StrMatcher localStrMatcher = StrMatcher.charMatcher(paramChar);
    return setIgnoredMatcher(localStrMatcher);
  }
  
  public StrTokenizer setIgnoredMatcher(StrMatcher paramStrMatcher)
  {
    if (paramStrMatcher != null) {
      this.ignoredMatcher = paramStrMatcher;
    }
    return this;
  }
  
  public StrTokenizer setQuoteChar(char paramChar)
  {
    StrMatcher localStrMatcher = StrMatcher.charMatcher(paramChar);
    return setQuoteMatcher(localStrMatcher);
  }
  
  public StrTokenizer setQuoteMatcher(StrMatcher paramStrMatcher)
  {
    if (paramStrMatcher != null) {
      this.quoteMatcher = paramStrMatcher;
    }
    return this;
  }
  
  public StrTokenizer setTrimmerMatcher(StrMatcher paramStrMatcher)
  {
    if (paramStrMatcher != null) {
      this.trimmerMatcher = paramStrMatcher;
    }
    return this;
  }
  
  public int size()
  {
    checkTokenized();
    return this.tokens.length;
  }
  
  public String toString()
  {
    Object localObject = this.tokens;
    if (localObject == null) {}
    List localList;
    for (localObject = "StrTokenizer[not tokenized yet]";; localObject = localList)
    {
      return (String)localObject;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append("StrTokenizer");
      localList = getTokenList();
    }
  }
  
  protected List tokenize(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    Object localObject1;
    if ((paramArrayOfChar == null) || (paramInt2 == 0)) {
      localObject1 = Collections.EMPTY_LIST;
    }
    for (;;)
    {
      return (List)localObject1;
      StrBuilder localStrBuilder = new org/apache/commons/lang/text/StrBuilder;
      localStrBuilder.<init>();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      int i = paramInt1;
      while ((i >= 0) && (i < paramInt2))
      {
        Object localObject2 = this;
        i = readNextToken(paramArrayOfChar, i, paramInt2, localStrBuilder, (List)localObject1);
        if (i >= paramInt2)
        {
          localObject2 = "";
          addToken((List)localObject1, (String)localObject2);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrTokenizer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */