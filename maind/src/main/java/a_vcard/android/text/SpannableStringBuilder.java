package a_vcard.android.text;

import a_vcard.com.android.internal.util.ArrayUtils;
import java.lang.reflect.Array;

public class SpannableStringBuilder
  implements Spannable, Editable
{
  private static final int END_MASK = 15;
  private static final int MARK = 1;
  private static final InputFilter[] NO_FILTERS = new InputFilter[0];
  private static final int PARAGRAPH = 3;
  private static final int POINT = 2;
  private static final int START_MASK = 240;
  private static final int START_SHIFT = 4;
  private InputFilter[] mFilters;
  private int mGapLength;
  private int mGapStart;
  private int mSpanCount;
  private int[] mSpanEnds;
  private int[] mSpanFlags;
  private int[] mSpanStarts;
  private Object[] mSpans;
  private char[] mText;
  
  public SpannableStringBuilder()
  {
    this("");
  }
  
  public SpannableStringBuilder(CharSequence paramCharSequence)
  {
    this(paramCharSequence, 0, i);
  }
  
  public SpannableStringBuilder(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    Object localObject1 = NO_FILTERS;
    this.mFilters = ((InputFilter[])localObject1);
    int i = paramInt2 - paramInt1;
    int j = ArrayUtils.idealCharArraySize(i + 1);
    localObject1 = new char[j];
    this.mText = ((char[])localObject1);
    this.mGapStart = i;
    int k = j - i;
    this.mGapLength = k;
    localObject1 = this.mText;
    TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, (char[])localObject1, 0);
    this.mSpanCount = 0;
    int i1 = ArrayUtils.idealIntArraySize(0);
    localObject1 = new Object[i1];
    this.mSpans = ((Object[])localObject1);
    localObject1 = new int[i1];
    this.mSpanStarts = ((int[])localObject1);
    localObject1 = new int[i1];
    this.mSpanEnds = ((int[])localObject1);
    localObject1 = new int[i1];
    this.mSpanFlags = ((int[])localObject1);
    boolean bool1 = paramCharSequence instanceof Spanned;
    if (bool1)
    {
      Object localObject2 = paramCharSequence;
      localObject2 = (Spanned)paramCharSequence;
      localObject1 = Object.class;
      Object[] arrayOfObject = ((Spanned)localObject2).getSpans(paramInt1, paramInt2, (Class)localObject1);
      int i2 = 0;
      int m = arrayOfObject.length;
      if (i2 < m)
      {
        localObject1 = arrayOfObject[i2];
        boolean bool2 = localObject1 instanceof NoCopySpan;
        if (bool2) {}
        for (;;)
        {
          i2 += 1;
          break;
          localObject1 = arrayOfObject[i2];
          int i3 = ((Spanned)localObject2).getSpanStart(localObject1) - paramInt1;
          localObject1 = arrayOfObject[i2];
          int n = ((Spanned)localObject2).getSpanEnd(localObject1);
          int i4 = n - paramInt1;
          localObject1 = arrayOfObject[i2];
          int i5 = ((Spanned)localObject2).getSpanFlags(localObject1);
          if (i3 < 0) {
            i3 = 0;
          }
          n = paramInt2 - paramInt1;
          if (i3 > n) {
            i3 = paramInt2 - paramInt1;
          }
          if (i4 < 0) {
            i4 = 0;
          }
          n = paramInt2 - paramInt1;
          if (i4 > n) {
            i4 = paramInt2 - paramInt1;
          }
          localObject1 = arrayOfObject[i2];
          setSpan(localObject1, i3, i4, i5);
        }
      }
    }
  }
  
  private int change(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    return change(true, paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
  }
  
  private int change(boolean paramBoolean, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    Object localObject1 = "replace";
    checkRange((String)localObject1, paramInt1, paramInt2);
    int i = paramInt4 - paramInt3;
    TextWatcher[] arrayOfTextWatcher = null;
    if (paramBoolean)
    {
      j = paramInt2 - paramInt1;
      m = paramInt4 - paramInt3;
      arrayOfTextWatcher = sendTextWillChange(paramInt1, j, m);
    }
    int j = this.mSpanCount;
    int n = j + -1;
    int i1;
    int i2;
    label200:
    Object localObject2;
    if (n >= 0)
    {
      localObject1 = this.mSpanFlags;
      j = localObject1[n] & 0x33;
      m = 51;
      int i3;
      int i4;
      int i5;
      if (j == m)
      {
        localObject1 = this.mSpanStarts;
        i1 = localObject1[n];
        j = this.mGapStart;
        if (i1 > j)
        {
          j = this.mGapLength;
          i1 -= j;
        }
        localObject1 = this.mSpanEnds;
        i2 = localObject1[n];
        j = this.mGapStart;
        if (i2 > j)
        {
          j = this.mGapLength;
          i2 -= j;
        }
        i3 = i1;
        i4 = i2;
        i5 = length();
        if ((i1 > paramInt1) && (i1 <= paramInt2))
        {
          i1 = paramInt2;
          if (i1 < i5)
          {
            if (i1 <= paramInt2) {
              break label348;
            }
            j = i1 + -1;
            j = charAt(j);
            m = 10;
            if (j != m) {
              break label348;
            }
          }
        }
        if ((i2 > paramInt1) && (i2 <= paramInt2)) {
          i2 = paramInt2;
        }
      }
      for (;;)
      {
        if (i2 < i5)
        {
          if (i2 > paramInt2)
          {
            j = i2 + -1;
            j = charAt(j);
            m = 10;
            if (j != m) {}
          }
        }
        else
        {
          if ((i1 != i3) || (i2 != i4))
          {
            localObject1 = this.mSpans[n];
            localObject2 = this.mSpanFlags;
            m = localObject2[n];
            setSpan(localObject1, i1, i2, m);
          }
          n += -1;
          break;
          label348:
          i1 += 1;
          break label200;
        }
        i2 += 1;
      }
    }
    moveGapTo(paramInt2);
    j = paramInt4 - paramInt3;
    int m = this.mGapLength;
    int i6 = paramInt2 - paramInt1;
    m += i6;
    if (j >= m)
    {
      localObject1 = this.mText;
      j = localObject1.length;
      m = this.mGapLength;
      j = j - m + paramInt4 - paramInt3;
      m = paramInt2 - paramInt1;
      j -= m;
      resizeFor(j);
    }
    j = this.mGapStart;
    m = paramInt4 - paramInt3;
    i6 = paramInt2 - paramInt1;
    m -= i6;
    j += m;
    this.mGapStart = j;
    j = this.mGapLength;
    m = paramInt4 - paramInt3;
    i6 = paramInt2 - paramInt1;
    m -= i6;
    j -= m;
    this.mGapLength = j;
    j = this.mGapLength;
    m = 1;
    if (j < m)
    {
      localObject1 = new java/lang/Exception;
      localObject2 = "mGapLength < 1";
      ((Exception)localObject1).<init>((String)localObject2);
      ((Exception)localObject1).printStackTrace();
    }
    localObject1 = this.mText;
    TextUtils.getChars(paramCharSequence, paramInt3, paramInt4, (char[])localObject1, paramInt1);
    boolean bool = paramCharSequence instanceof Spanned;
    int k;
    Object localObject4;
    int i7;
    int i8;
    if (bool)
    {
      Object localObject3 = paramCharSequence;
      localObject3 = (Spanned)paramCharSequence;
      localObject1 = Object.class;
      Object[] arrayOfObject = ((Spanned)localObject3).getSpans(paramInt3, paramInt4, (Class)localObject1);
      n = 0;
      for (;;)
      {
        k = arrayOfObject.length;
        if (n >= k) {
          break;
        }
        localObject1 = arrayOfObject[n];
        i1 = ((Spanned)localObject3).getSpanStart(localObject1);
        localObject1 = arrayOfObject[n];
        i2 = ((Spanned)localObject3).getSpanEnd(localObject1);
        if (i1 < paramInt3) {
          i1 = paramInt3;
        }
        if (i2 > paramInt4) {
          i2 = paramInt4;
        }
        localObject1 = arrayOfObject[n];
        k = getSpanStart(localObject1);
        if (k < 0)
        {
          m = 0;
          localObject2 = null;
          localObject4 = arrayOfObject[n];
          i7 = i1 - paramInt3 + paramInt1;
          k = i2 - paramInt3;
          i8 = k + paramInt1;
          localObject1 = arrayOfObject[n];
          int i9 = ((Spanned)localObject3).getSpanFlags(localObject1);
          localObject1 = this;
          setSpan(false, localObject4, i7, i8, i9);
        }
        n += 1;
      }
    }
    if (paramInt4 > paramInt3)
    {
      k = paramInt2 - paramInt1;
      if (k == 0) {
        if (paramBoolean)
        {
          k = paramInt2 - paramInt1;
          m = paramInt4 - paramInt3;
          sendTextChange(arrayOfTextWatcher, paramInt1, k, m);
          sendTextHasChanged(arrayOfTextWatcher);
        }
      }
    }
    for (;;)
    {
      return i;
      k = this.mGapStart;
      m = this.mGapLength;
      k += m;
      localObject2 = this.mText;
      m = localObject2.length;
      int i10;
      if (k == m)
      {
        i10 = 1;
        k = this.mSpanCount;
        n = k + -1;
        label900:
        if (n < 0) {
          break label1462;
        }
        localObject1 = this.mSpanStarts;
        k = localObject1[n];
        int i11;
        if (k >= paramInt1)
        {
          localObject1 = this.mSpanStarts;
          k = localObject1[n];
          m = this.mGapStart;
          i6 = this.mGapLength;
          m += i6;
          if (k < m)
          {
            localObject1 = this.mSpanFlags;
            i11 = (localObject1[n] & 0xF0) >> 4;
            k = 2;
            if (i11 != k)
            {
              k = 3;
              if ((i11 != k) || (i10 == 0)) {
                break label1432;
              }
            }
            localObject1 = this.mSpanStarts;
            m = this.mGapStart;
            i6 = this.mGapLength;
            m += i6;
            localObject1[n] = m;
          }
        }
        label1039:
        localObject1 = this.mSpanEnds;
        k = localObject1[n];
        if (k >= paramInt1)
        {
          localObject1 = this.mSpanEnds;
          k = localObject1[n];
          m = this.mGapStart;
          i6 = this.mGapLength;
          m += i6;
          if (k < m)
          {
            localObject1 = this.mSpanFlags;
            i11 = localObject1[n] & 0xF;
            k = 2;
            if (i11 != k)
            {
              k = 3;
              if ((i11 != k) || (i10 == 0)) {
                break label1447;
              }
            }
            localObject1 = this.mSpanEnds;
            m = this.mGapStart;
            i6 = this.mGapLength;
            m += i6;
            localObject1[n] = m;
          }
        }
      }
      for (;;)
      {
        localObject1 = this.mSpanEnds;
        k = localObject1[n];
        localObject2 = this.mSpanStarts;
        m = localObject2[n];
        if (k < m)
        {
          localObject1 = this.mSpans;
          m = n + 1;
          localObject4 = this.mSpans;
          i7 = this.mSpanCount;
          i8 = n + 1;
          i7 -= i8;
          System.arraycopy(localObject1, m, localObject4, n, i7);
          localObject1 = this.mSpanStarts;
          m = n + 1;
          localObject4 = this.mSpanStarts;
          i7 = this.mSpanCount;
          i8 = n + 1;
          i7 -= i8;
          System.arraycopy(localObject1, m, localObject4, n, i7);
          localObject1 = this.mSpanEnds;
          m = n + 1;
          localObject4 = this.mSpanEnds;
          i7 = this.mSpanCount;
          i8 = n + 1;
          i7 -= i8;
          System.arraycopy(localObject1, m, localObject4, n, i7);
          localObject1 = this.mSpanFlags;
          m = n + 1;
          localObject4 = this.mSpanFlags;
          i7 = this.mSpanCount;
          i8 = n + 1;
          i7 -= i8;
          System.arraycopy(localObject1, m, localObject4, n, i7);
          k = this.mSpanCount + -1;
          this.mSpanCount = k;
        }
        n += -1;
        break label900;
        i10 = 0;
        break;
        label1432:
        localObject1 = this.mSpanStarts;
        localObject1[n] = paramInt1;
        break label1039;
        label1447:
        localObject1 = this.mSpanEnds;
        localObject1[n] = paramInt1;
      }
      label1462:
      if (paramBoolean)
      {
        k = paramInt2 - paramInt1;
        m = paramInt4 - paramInt3;
        sendTextChange(arrayOfTextWatcher, paramInt1, k, m);
        sendTextHasChanged(arrayOfTextWatcher);
      }
    }
  }
  
  private void checkRange(String paramString, int paramInt1, int paramInt2)
  {
    IndexOutOfBoundsException localIndexOutOfBoundsException;
    Object localObject;
    String str;
    if (paramInt2 < paramInt1)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString).append(" ");
      str = region(paramInt1, paramInt2);
      localObject = str + " has end before start";
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    int i = length();
    if ((paramInt1 > i) || (paramInt2 > i))
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString).append(" ");
      str = region(paramInt1, paramInt2);
      localObject = str + " ends beyond length " + i;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString).append(" ");
      str = region(paramInt1, paramInt2);
      localObject = str + " starts before 0";
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
  }
  
  private boolean isprint(char paramChar)
  {
    char c = ' ';
    if (paramChar >= c)
    {
      c = '~';
      if (paramChar > c) {}
    }
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  private void moveGapTo(int paramInt)
  {
    int i = 3;
    int j = 2;
    int k = this.mGapStart;
    if (paramInt == k) {}
    for (;;)
    {
      return;
      k = length();
      int m;
      int n;
      Object localObject;
      int i2;
      label102:
      int i3;
      label105:
      int i4;
      int i5;
      if (paramInt == k)
      {
        m = 1;
        k = this.mGapStart;
        if (paramInt >= k) {
          break label267;
        }
        k = this.mGapStart;
        n = k - paramInt;
        localObject = this.mText;
        char[] arrayOfChar1 = this.mText;
        int i1 = this.mGapStart;
        i2 = this.mGapLength;
        i1 = i1 + i2 - n;
        System.arraycopy(localObject, paramInt, arrayOfChar1, i1, n);
        i3 = 0;
        k = this.mSpanCount;
        if (i3 >= k) {
          break label445;
        }
        i4 = this.mSpanStarts[i3];
        localObject = this.mSpanEnds;
        i5 = localObject[i3];
        k = this.mGapStart;
        if (i4 > k)
        {
          k = this.mGapLength;
          i4 -= k;
        }
        if (i4 <= paramInt) {
          break label324;
        }
        k = this.mGapLength;
        i4 += k;
        label185:
        k = this.mGapStart;
        if (i5 > k)
        {
          k = this.mGapLength;
          i5 -= k;
        }
        if (i5 <= paramInt) {
          break label386;
        }
        k = this.mGapLength;
        i5 += k;
      }
      for (;;)
      {
        this.mSpanStarts[i3] = i4;
        localObject = this.mSpanEnds;
        localObject[i3] = i5;
        i3 += 1;
        break label105;
        m = 0;
        break;
        label267:
        k = this.mGapStart;
        n = paramInt - k;
        localObject = this.mText;
        int i6 = this.mGapLength + paramInt - n;
        char[] arrayOfChar2 = this.mText;
        i2 = this.mGapStart;
        System.arraycopy(localObject, i6, arrayOfChar2, i2, n);
        break label102;
        label324:
        if (i4 != paramInt) {
          break label185;
        }
        localObject = this.mSpanFlags;
        k = localObject[i3] & 0xF0;
        int i7 = k >> 4;
        if ((i7 != j) && ((m == 0) || (i7 != i))) {
          break label185;
        }
        k = this.mGapLength;
        i4 += k;
        break label185;
        label386:
        if (i5 == paramInt)
        {
          localObject = this.mSpanFlags;
          k = localObject[i3];
          i7 = k & 0xF;
          if ((i7 == j) || ((m != 0) && (i7 == i)))
          {
            k = this.mGapLength;
            i5 += k;
          }
        }
      }
      label445:
      this.mGapStart = paramInt;
    }
  }
  
  private static String region(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "(" + paramInt1 + " ... " + paramInt2 + ")";
  }
  
  private void resizeFor(int paramInt)
  {
    int i = ArrayUtils.idealCharArraySize(paramInt + 1);
    char[] arrayOfChar1 = new char[i];
    int j = this.mText.length;
    int k = this.mGapStart;
    int m = this.mGapLength;
    k += m;
    int n = j - k;
    Object localObject1 = this.mText;
    k = this.mGapStart;
    System.arraycopy(localObject1, 0, arrayOfChar1, 0, k);
    localObject1 = this.mText;
    Object localObject2 = this.mText;
    k = localObject2.length - n;
    m = i - n;
    System.arraycopy(localObject1, k, arrayOfChar1, m, n);
    int i1 = 0;
    for (;;)
    {
      j = this.mSpanCount;
      if (i1 >= j) {
        break;
      }
      localObject1 = this.mSpanStarts;
      j = localObject1[i1];
      k = this.mGapStart;
      char[] arrayOfChar2;
      if (j > k)
      {
        localObject1 = this.mSpanStarts;
        k = localObject1[i1];
        arrayOfChar2 = this.mText;
        m = arrayOfChar2.length;
        m = i - m;
        k += m;
        localObject1[i1] = k;
      }
      localObject1 = this.mSpanEnds;
      j = localObject1[i1];
      k = this.mGapStart;
      if (j > k)
      {
        localObject1 = this.mSpanEnds;
        k = localObject1[i1];
        arrayOfChar2 = this.mText;
        m = arrayOfChar2.length;
        m = i - m;
        k += m;
        localObject1[i1] = k;
      }
      i1 += 1;
    }
    localObject1 = this.mText;
    int i2 = localObject1.length;
    this.mText = arrayOfChar1;
    j = this.mGapLength;
    localObject2 = this.mText;
    k = localObject2.length - i2;
    j += k;
    this.mGapLength = j;
    j = this.mGapLength;
    k = 1;
    if (j < k)
    {
      localObject1 = new java/lang/Exception;
      localObject2 = "mGapLength < 1";
      ((Exception)localObject1).<init>((String)localObject2);
      ((Exception)localObject1).printStackTrace();
    }
  }
  
  private void sendSpanAdded(Object paramObject, int paramInt1, int paramInt2)
  {
    Class localClass = SpanWatcher.class;
    SpanWatcher[] arrayOfSpanWatcher = (SpanWatcher[])getSpans(paramInt1, paramInt2, localClass);
    int i = arrayOfSpanWatcher.length;
    int j = 0;
    while (j < i)
    {
      localClass = arrayOfSpanWatcher[j];
      localClass.onSpanAdded(this, paramObject, paramInt1, paramInt2);
      j += 1;
    }
  }
  
  private void sendSpanChanged(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.min(paramInt1, paramInt3);
    int j = Math.max(paramInt2, paramInt4);
    Object localObject = SpanWatcher.class;
    SpanWatcher[] arrayOfSpanWatcher = (SpanWatcher[])getSpans(i, j, (Class)localObject);
    int k = arrayOfSpanWatcher.length;
    int m = 0;
    while (m < k)
    {
      SpanWatcher localSpanWatcher = arrayOfSpanWatcher[m];
      localObject = paramObject;
      localSpanWatcher.onSpanChanged(this, paramObject, paramInt1, paramInt2, paramInt3, paramInt4);
      m += 1;
    }
  }
  
  private void sendSpanRemoved(Object paramObject, int paramInt1, int paramInt2)
  {
    Class localClass = SpanWatcher.class;
    SpanWatcher[] arrayOfSpanWatcher = (SpanWatcher[])getSpans(paramInt1, paramInt2, localClass);
    int i = arrayOfSpanWatcher.length;
    int j = 0;
    while (j < i)
    {
      localClass = arrayOfSpanWatcher[j];
      localClass.onSpanRemoved(this, paramObject, paramInt1, paramInt2);
      j += 1;
    }
  }
  
  private void sendTextChange(TextWatcher[] paramArrayOfTextWatcher, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfTextWatcher.length;
    int j = 0;
    while (j < i)
    {
      TextWatcher localTextWatcher = paramArrayOfTextWatcher[j];
      localTextWatcher.onTextChanged(this, paramInt1, paramInt2, paramInt3);
      j += 1;
    }
  }
  
  private void sendTextHasChanged(TextWatcher[] paramArrayOfTextWatcher)
  {
    int i = paramArrayOfTextWatcher.length;
    int j = 0;
    while (j < i)
    {
      TextWatcher localTextWatcher = paramArrayOfTextWatcher[j];
      localTextWatcher.afterTextChanged(this);
      j += 1;
    }
  }
  
  private TextWatcher[] sendTextWillChange(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + paramInt2;
    Class localClass = TextWatcher.class;
    TextWatcher[] arrayOfTextWatcher = (TextWatcher[])getSpans(paramInt1, i, localClass);
    int j = arrayOfTextWatcher.length;
    int k = 0;
    while (k < j)
    {
      TextWatcher localTextWatcher = arrayOfTextWatcher[k];
      localTextWatcher.beforeTextChanged(this, paramInt1, paramInt2, paramInt3);
      k += 1;
    }
    return arrayOfTextWatcher;
  }
  
  private void setSpan(boolean paramBoolean, Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    int j = paramInt2;
    Object localObject1 = "setSpan";
    Object localObject2 = this;
    checkRange((String)localObject1, paramInt1, paramInt2);
    int k = paramInt3;
    int m = paramInt3 & 0xF0;
    int n = 48;
    int i1;
    if ((m == n) && (paramInt1 != 0))
    {
      m = length();
      k = paramInt1;
      if (paramInt1 != m)
      {
        m = paramInt1 + -1;
        i1 = charAt(m);
        m = 10;
        if (i1 != m)
        {
          localObject1 = new java/lang/RuntimeException;
          ((RuntimeException)localObject1).<init>("PARAGRAPH span must start at paragraph boundary");
          throw ((Throwable)localObject1);
        }
      }
    }
    m = paramInt3 & 0xF;
    n = 3;
    if ((m == n) && (paramInt2 != 0))
    {
      m = length();
      k = paramInt2;
      if (paramInt2 != m)
      {
        m = paramInt2 + -1;
        localObject2 = this;
        i1 = charAt(m);
        m = 10;
        if (i1 != m)
        {
          localObject1 = new java/lang/RuntimeException;
          ((RuntimeException)localObject1).<init>("PARAGRAPH span must end at paragraph boundary");
          throw ((Throwable)localObject1);
        }
      }
    }
    localObject2 = this;
    m = this.mGapStart;
    k = paramInt1;
    label249:
    int i3;
    label271:
    Object localObject4;
    if (paramInt1 > m)
    {
      m = this.mGapLength;
      paramInt1 += m;
      localObject2 = this;
      m = this.mGapStart;
      k = paramInt2;
      if (paramInt2 <= m) {
        break label509;
      }
      m = this.mGapLength;
      paramInt2 += m;
      localObject2 = this;
      int i2 = this.mSpanCount;
      localObject2 = this.mSpans;
      Object localObject3 = localObject2;
      i3 = 0;
      if (i3 >= i2) {
        break label590;
      }
      localObject1 = localObject3[i3];
      localObject2 = paramObject;
      if (localObject1 != paramObject) {
        break label581;
      }
      localObject2 = this;
      int i4 = this.mSpanStarts[i3];
      localObject1 = this.mSpanEnds;
      int i5 = localObject1[i3];
      m = this.mGapStart;
      if (i4 > m)
      {
        m = this.mGapLength;
        i4 -= m;
      }
      localObject2 = this;
      m = this.mGapStart;
      if (i5 > m)
      {
        m = this.mGapLength;
        i5 -= m;
      }
      localObject2 = this;
      this.mSpanStarts[i3] = paramInt1;
      this.mSpanEnds[i3] = paramInt2;
      localObject1 = this.mSpanFlags;
      localObject1[i3] = paramInt3;
      if (paramBoolean)
      {
        localObject1 = this;
        localObject4 = paramObject;
        sendSpanChanged(paramObject, i4, i5, i, j);
      }
    }
    for (;;)
    {
      return;
      m = this.mGapStart;
      if (paramInt1 != m) {
        break;
      }
      k = paramInt3;
      int i6 = (paramInt3 & 0xF0) >> 4;
      m = 2;
      if (i6 != m)
      {
        m = 3;
        if (i6 != m) {
          break;
        }
        m = length();
        k = paramInt1;
        if (paramInt1 != m) {
          break;
        }
      }
      localObject2 = this;
      m = this.mGapLength;
      paramInt1 += m;
      break;
      label509:
      m = this.mGapStart;
      if (paramInt2 != m) {
        break label249;
      }
      i6 = paramInt3 & 0xF;
      m = 2;
      if (i6 != m)
      {
        m = 3;
        if (i6 != m) {
          break label249;
        }
        m = length();
        if (paramInt2 != m) {
          break label249;
        }
      }
      localObject2 = this;
      m = this.mGapLength;
      paramInt2 += m;
      break label249;
      label581:
      i3 += 1;
      break label271;
      label590:
      localObject2 = this;
      m = this.mSpanCount + 1;
      localObject4 = this.mSpans;
      n = localObject4.length;
      if (m >= n)
      {
        m = this.mSpanCount + 1;
        int i7 = ArrayUtils.idealIntArraySize(m);
        Object[] arrayOfObject = new Object[i7];
        int[] arrayOfInt1 = new int[i7];
        int[] arrayOfInt2 = new int[i7];
        int[] arrayOfInt3 = new int[i7];
        localObject2 = this;
        localObject1 = this.mSpans;
        k = this.mSpanCount;
        int i8 = k;
        localObject2 = arrayOfObject;
        System.arraycopy(localObject1, 0, arrayOfObject, 0, k);
        localObject2 = this;
        localObject1 = this.mSpanStarts;
        k = this.mSpanCount;
        i8 = k;
        localObject2 = arrayOfInt1;
        System.arraycopy(localObject1, 0, arrayOfInt1, 0, k);
        localObject2 = this;
        localObject1 = this.mSpanEnds;
        k = this.mSpanCount;
        i8 = k;
        System.arraycopy(localObject1, 0, arrayOfInt2, 0, k);
        localObject1 = this.mSpanFlags;
        n = 0;
        localObject4 = null;
        i8 = this.mSpanCount;
        k = 0;
        System.arraycopy(localObject1, 0, arrayOfInt3, 0, i8);
        localObject2 = arrayOfObject;
        this.mSpans = arrayOfObject;
        localObject2 = arrayOfInt1;
        this.mSpanStarts = arrayOfInt1;
        localObject2 = this;
        this.mSpanEnds = arrayOfInt2;
        this.mSpanFlags = arrayOfInt3;
      }
      localObject2 = this;
      localObject1 = this.mSpans;
      n = this.mSpanCount;
      localObject1[n] = paramObject;
      localObject1 = this.mSpanStarts;
      n = this.mSpanCount;
      localObject1[n] = paramInt1;
      localObject1 = this.mSpanEnds;
      n = this.mSpanCount;
      localObject1[n] = paramInt2;
      localObject1 = this.mSpanFlags;
      n = this.mSpanCount;
      localObject1[n] = paramInt3;
      m = this.mSpanCount + 1;
      this.mSpanCount = m;
      if (paramBoolean) {
        sendSpanAdded(paramObject, i, j);
      }
    }
  }
  
  public static SpannableStringBuilder valueOf(CharSequence paramCharSequence)
  {
    boolean bool = paramCharSequence instanceof SpannableStringBuilder;
    if (bool) {}
    SpannableStringBuilder localSpannableStringBuilder;
    for (paramCharSequence = (SpannableStringBuilder)paramCharSequence;; paramCharSequence = localSpannableStringBuilder)
    {
      return paramCharSequence;
      localSpannableStringBuilder = new a_vcard/android/text/SpannableStringBuilder;
      localSpannableStringBuilder.<init>(paramCharSequence);
    }
  }
  
  public SpannableStringBuilder append(char paramChar)
  {
    String str = String.valueOf(paramChar);
    return append(str);
  }
  
  public SpannableStringBuilder append(CharSequence paramCharSequence)
  {
    int i = length();
    int j = paramCharSequence.length();
    return replace(i, i, paramCharSequence, 0, j);
  }
  
  public SpannableStringBuilder append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = length();
    return replace(i, i, paramCharSequence, paramInt1, paramInt2);
  }
  
  public char charAt(int paramInt)
  {
    int i = length();
    Object localObject1;
    Object localObject2;
    if (paramInt < 0)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "charAt: " + paramInt + " < 0";
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramInt >= i)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "charAt: " + paramInt + " >= length " + i;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int j = this.mGapStart;
    int k;
    if (paramInt >= j)
    {
      localObject1 = this.mText;
      k = this.mGapLength + paramInt;
    }
    for (j = localObject1[k];; j = localObject1[paramInt])
    {
      return j;
      localObject1 = this.mText;
    }
  }
  
  public void clear()
  {
    int i = length();
    replace(0, i, "", 0, 0);
  }
  
  public void clearSpans()
  {
    int i = this.mSpanCount;
    int j = i + -1;
    while (j >= 0)
    {
      Object localObject1 = this.mSpans[j];
      int k = this.mSpanStarts[j];
      Object localObject2 = this.mSpanEnds;
      int m = localObject2[j];
      i = this.mGapStart;
      if (k > i)
      {
        i = this.mGapLength;
        k -= i;
      }
      i = this.mGapStart;
      if (m > i)
      {
        i = this.mGapLength;
        m -= i;
      }
      this.mSpanCount = j;
      localObject2 = this.mSpans;
      localObject2[j] = null;
      sendSpanRemoved(localObject1, k, m);
      j += -1;
    }
  }
  
  public SpannableStringBuilder delete(int paramInt1, int paramInt2)
  {
    String str = "";
    int i = paramInt1;
    SpannableStringBuilder localSpannableStringBuilder = replace(paramInt1, paramInt2, str, 0, 0);
    int j = this.mGapLength;
    i = length() * 2;
    if (j > i)
    {
      j = length();
      resizeFor(j);
    }
    return localSpannableStringBuilder;
  }
  
  public void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    Object localObject = "getChars";
    checkRange((String)localObject, paramInt1, paramInt2);
    int i = this.mGapStart;
    int j;
    if (paramInt2 <= i)
    {
      localObject = this.mText;
      j = paramInt2 - paramInt1;
      System.arraycopy(localObject, paramInt1, paramArrayOfChar, paramInt3, j);
    }
    for (;;)
    {
      return;
      i = this.mGapStart;
      int k;
      if (paramInt1 >= i)
      {
        localObject = this.mText;
        j = this.mGapLength + paramInt1;
        k = paramInt2 - paramInt1;
        System.arraycopy(localObject, j, paramArrayOfChar, paramInt3, k);
      }
      else
      {
        localObject = this.mText;
        j = this.mGapStart - paramInt1;
        System.arraycopy(localObject, paramInt1, paramArrayOfChar, paramInt3, j);
        localObject = this.mText;
        j = this.mGapStart;
        k = this.mGapLength;
        j += k;
        k = this.mGapStart - paramInt1 + paramInt3;
        int m = this.mGapStart;
        m = paramInt2 - m;
        System.arraycopy(localObject, j, paramArrayOfChar, k, m);
      }
    }
  }
  
  public InputFilter[] getFilters()
  {
    return this.mFilters;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    int i = this.mSpanCount;
    Object[] arrayOfObject = this.mSpans;
    int j = i + -1;
    int k;
    if (j >= 0)
    {
      Object localObject = arrayOfObject[j];
      if (localObject == paramObject)
      {
        localObject = this.mSpanEnds;
        k = localObject[j];
        int m = this.mGapStart;
        if (k > m)
        {
          m = this.mGapLength;
          k -= m;
        }
      }
    }
    for (;;)
    {
      return k;
      j += -1;
      break;
      k = -1;
    }
  }
  
  public int getSpanFlags(Object paramObject)
  {
    int i = this.mSpanCount;
    Object[] arrayOfObject = this.mSpans;
    int j = i + -1;
    Object localObject;
    int k;
    if (j >= 0)
    {
      localObject = arrayOfObject[j];
      if (localObject == paramObject)
      {
        localObject = this.mSpanFlags;
        k = localObject[j];
      }
    }
    for (;;)
    {
      return k;
      j += -1;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  public int getSpanStart(Object paramObject)
  {
    int i = this.mSpanCount;
    Object[] arrayOfObject = this.mSpans;
    int j = i + -1;
    int k;
    if (j >= 0)
    {
      Object localObject = arrayOfObject[j];
      if (localObject == paramObject)
      {
        localObject = this.mSpanStarts;
        k = localObject[j];
        int m = this.mGapStart;
        if (k > m)
        {
          m = this.mGapLength;
          k -= m;
        }
      }
    }
    for (;;)
    {
      return k;
      j += -1;
      break;
      k = -1;
    }
  }
  
  public Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    int i = this.mSpanCount;
    Object[] arrayOfObject = this.mSpans;
    int[] arrayOfInt1 = this.mSpanStarts;
    int[] arrayOfInt2 = this.mSpanEnds;
    int[] arrayOfInt3 = this.mSpanFlags;
    int j = this.mGapStart;
    int k = this.mGapLength;
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    int n = 0;
    int i1 = 0;
    int i4;
    int i5;
    Object localObject3;
    int i7;
    int i11;
    if (n < i)
    {
      int i2 = arrayOfInt1[n];
      int i3 = arrayOfInt2[n];
      i4 = i2;
      if (i2 > j) {
        i2 -= k;
      }
      i4 = i3;
      if (i3 > j) {
        i3 -= k;
      }
      i4 = i2;
      i5 = paramInt2;
      if (i2 > paramInt2) {
        m = i1;
      }
      for (;;)
      {
        n += 1;
        i1 = m;
        break;
        i4 = i3;
        i5 = paramInt1;
        if (i3 < paramInt1)
        {
          m = i1;
        }
        else
        {
          i4 = i2;
          i5 = i3;
          if (i2 != i3)
          {
            i4 = paramInt1;
            i5 = paramInt2;
            if (paramInt1 != paramInt2)
            {
              i4 = i2;
              if (i2 == paramInt2)
              {
                m = i1;
                continue;
              }
              i4 = i3;
              i5 = paramInt1;
              if (i3 == paramInt1)
              {
                m = i1;
                continue;
              }
            }
          }
          int i6;
          if (paramClass != null)
          {
            localObject3 = arrayOfObject[n];
            i6 = paramClass.isInstance(localObject3);
            if (i6 == 0)
            {
              m = i1;
              continue;
            }
          }
          if (i1 == 0)
          {
            localObject2 = arrayOfObject[n];
            m = i1 + 1;
          }
          else
          {
            i6 = 1;
            i4 = i6;
            if (i1 == i6)
            {
              i7 = i - n + 1;
              i5 = i7;
              localObject3 = (Object[])Array.newInstance(paramClass, i7);
              localObject1 = localObject3;
              localObject1 = (Object[])localObject3;
              i7 = 0;
              localObject3 = null;
              localObject1[0] = localObject2;
            }
            i7 = arrayOfInt3[n];
            int i9 = 16711680;
            int i12 = i7 & i9;
            if (i12 != 0)
            {
              int i13 = 0;
              for (;;)
              {
                if (i13 < i1)
                {
                  localObject3 = localObject1[i13];
                  i7 = getSpanFlags(localObject3);
                  int i10 = 16711680;
                  int i15 = i7 & i10;
                  if (i12 <= i15) {}
                }
                else
                {
                  i7 = i13 + 1;
                  i11 = i1 - i13;
                  i4 = i7;
                  i5 = i11;
                  System.arraycopy(localObject1, i13, localObject1, i7, i11);
                  localObject3 = arrayOfObject[n];
                  localObject1[i13] = localObject3;
                  m = i1 + 1;
                  break;
                }
                int i14;
                i13 += 1;
              }
            }
            m = i1 + 1;
            localObject3 = arrayOfObject[n];
            localObject1[i1] = localObject3;
          }
        }
      }
    }
    if (i1 == 0) {
      localObject3 = (Object[])ArrayUtils.emptyArray(paramClass);
    }
    for (;;)
    {
      return (Object[])localObject3;
      i7 = 1;
      i4 = i7;
      int i8;
      if (i1 == i7)
      {
        i5 = 1;
        localObject3 = (Object[])Array.newInstance(paramClass, i5);
        localObject1 = localObject3;
        localObject1 = (Object[])localObject3;
        i8 = 0;
        localObject1[0] = localObject2;
        localObject3 = localObject1;
        localObject3 = (Object[])localObject1;
      }
      else
      {
        i4 = localObject1.length;
        i8 = i4;
        if (i1 == i4)
        {
          localObject3 = localObject1;
          localObject3 = (Object[])localObject1;
        }
        else
        {
          localObject3 = (Object[])Array.newInstance(paramClass, i1);
          Object localObject4 = localObject3;
          localObject4 = (Object[])localObject3;
          i8 = 0;
          i11 = 0;
          i4 = 0;
          i5 = 0;
          System.arraycopy(localObject1, 0, localObject4, 0, i1);
          localObject4 = (Object[])localObject4;
          localObject3 = localObject4;
        }
      }
    }
  }
  
  public SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    return replace(paramInt, paramInt, paramCharSequence, 0, i);
  }
  
  public SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    return replace(paramInt1, paramInt1, paramCharSequence, paramInt2, paramInt3);
  }
  
  public int length()
  {
    int i = this.mText.length;
    int j = this.mGapLength;
    return i - j;
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    int i = this.mSpanCount;
    Object[] arrayOfObject = this.mSpans;
    int[] arrayOfInt1 = this.mSpanStarts;
    int[] arrayOfInt2 = this.mSpanEnds;
    int j = this.mGapStart;
    int k = this.mGapLength;
    if (paramClass == null) {
      paramClass = Object.class;
    }
    int m = 0;
    while (m < i)
    {
      int n = arrayOfInt1[m];
      int i1 = arrayOfInt2[m];
      if (n > j) {
        n -= k;
      }
      if (i1 > j) {
        i1 -= k;
      }
      Object localObject;
      boolean bool;
      if ((n > paramInt1) && (n < paramInt2))
      {
        localObject = arrayOfObject[m];
        bool = paramClass.isInstance(localObject);
        if (bool) {
          paramInt2 = n;
        }
      }
      if ((i1 > paramInt1) && (i1 < paramInt2))
      {
        localObject = arrayOfObject[m];
        bool = paramClass.isInstance(localObject);
        if (bool) {
          paramInt2 = i1;
        }
      }
      m += 1;
    }
    return paramInt2;
  }
  
  public void removeSpan(Object paramObject)
  {
    int i = this.mSpanCount;
    int j = i + -1;
    for (;;)
    {
      if (j >= 0)
      {
        Object localObject1 = this.mSpans[j];
        if (localObject1 == paramObject)
        {
          int k = this.mSpanStarts[j];
          localObject1 = this.mSpanEnds;
          int m = localObject1[j];
          i = this.mGapStart;
          if (k > i)
          {
            i = this.mGapLength;
            k -= i;
          }
          i = this.mGapStart;
          if (m > i)
          {
            i = this.mGapLength;
            m -= i;
          }
          i = this.mSpanCount;
          int n = j + 1;
          int i1 = i - n;
          localObject1 = this.mSpans;
          n = j + 1;
          Object localObject2 = this.mSpans;
          System.arraycopy(localObject1, n, localObject2, j, i1);
          localObject1 = this.mSpanStarts;
          n = j + 1;
          localObject2 = this.mSpanStarts;
          System.arraycopy(localObject1, n, localObject2, j, i1);
          localObject1 = this.mSpanEnds;
          n = j + 1;
          localObject2 = this.mSpanEnds;
          System.arraycopy(localObject1, n, localObject2, j, i1);
          localObject1 = this.mSpanFlags;
          n = j + 1;
          localObject2 = this.mSpanFlags;
          System.arraycopy(localObject1, n, localObject2, j, i1);
          i = this.mSpanCount + -1;
          this.mSpanCount = i;
          localObject1 = this.mSpans;
          n = this.mSpanCount;
          localObject2 = null;
          localObject1[n] = null;
          sendSpanRemoved(paramObject, k, m);
        }
      }
      else
      {
        return;
      }
      j += -1;
    }
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    return replace(paramInt1, paramInt2, paramCharSequence, 0, i);
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    Object localObject1 = this.mFilters;
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      localObject1 = this.mFilters[j];
      localObject2 = paramCharSequence;
      k = paramInt3;
      m = paramInt4;
      localObject3 = this;
      n = paramInt1;
      CharSequence localCharSequence = ((InputFilter)localObject1).filter(paramCharSequence, paramInt3, paramInt4, this, paramInt1, paramInt2);
      if (localCharSequence != null)
      {
        paramCharSequence = localCharSequence;
        paramInt3 = 0;
        paramInt4 = localCharSequence.length();
      }
      j += 1;
    }
    if ((paramInt2 == paramInt1) && (paramInt3 == paramInt4)) {}
    for (;;)
    {
      return this;
      if ((paramInt2 != paramInt1) && (paramInt3 != paramInt4)) {
        break;
      }
      change(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    }
    int i1 = Selection.getSelectionStart(this);
    int i2 = Selection.getSelectionEnd(this);
    localObject1 = "replace";
    checkRange((String)localObject1, paramInt1, paramInt2);
    moveGapTo(paramInt2);
    int i3 = paramInt2 - paramInt1;
    int i4 = paramInt4 - paramInt3;
    TextWatcher[] arrayOfTextWatcher = sendTextWillChange(paramInt1, i3, i4);
    int i5 = paramInt2 - paramInt1;
    i3 = this.mGapLength;
    i4 = 2;
    if (i3 < i4)
    {
      i3 = length() + 1;
      resizeFor(i3);
    }
    i3 = this.mSpanCount;
    j = i3 + -1;
    while (j >= 0)
    {
      localObject1 = this.mSpanStarts;
      i3 = localObject1[j];
      i4 = this.mGapStart;
      if (i3 == i4)
      {
        localObject1 = this.mSpanStarts;
        i4 = localObject1[j] + 1;
        localObject1[j] = i4;
      }
      localObject1 = this.mSpanEnds;
      i3 = localObject1[j];
      i4 = this.mGapStart;
      if (i3 == i4)
      {
        localObject1 = this.mSpanEnds;
        i4 = localObject1[j] + 1;
        localObject1[j] = i4;
      }
      j += -1;
    }
    localObject1 = this.mText;
    i4 = this.mGapStart;
    int k = 32;
    localObject1[i4] = k;
    i3 = this.mGapStart + 1;
    this.mGapStart = i3;
    i3 = this.mGapLength + -1;
    this.mGapLength = i3;
    i3 = this.mGapLength;
    i4 = 1;
    if (i3 < i4)
    {
      localObject1 = new java/lang/Exception;
      localObject2 = "mGapLength < 1";
      ((Exception)localObject1).<init>((String)localObject2);
      ((Exception)localObject1).printStackTrace();
    }
    int i6 = paramInt2 + 1 - paramInt1;
    k = paramInt1 + 1;
    int m = paramInt1 + 1;
    localObject1 = this;
    Object localObject3 = paramCharSequence;
    int n = paramInt3;
    int i7 = change(false, k, m, paramCharSequence, paramInt3, paramInt4);
    m = paramInt1 + 1;
    k = paramInt1;
    change(false, paramInt1, m, "", 0, 0);
    i4 = 0;
    Object localObject2 = null;
    k = paramInt1 + i7;
    i3 = paramInt1 + i7 + i6;
    m = i3 + -1;
    localObject3 = "";
    n = 0;
    Object localObject4 = null;
    change(false, k, m, (CharSequence)localObject3, 0, 0);
    long l1;
    long l2;
    long l3;
    long l4;
    if ((i1 > paramInt1) && (i1 < paramInt2))
    {
      l1 = i1 - paramInt1;
      l2 = l1;
      l3 = i7 * l1;
      k = paramInt2 - paramInt1;
      l4 = k;
      l2 = l3 / l4;
      l1 = l2;
      i3 = (int)l2;
      m = i3 + paramInt1;
      i4 = 0;
      localObject2 = null;
      Object localObject5 = Selection.SELECTION_START;
      n = 34;
      setSpan(false, localObject5, m, m, n);
    }
    for (;;)
    {
      if ((i2 > paramInt1) && (i2 < paramInt2))
      {
        l1 = i2 - paramInt1;
        l2 = l1;
        l3 = i7 * l1;
        k = paramInt2 - paramInt1;
        l4 = k;
        l2 = l3 / l4;
        l1 = l2;
        i3 = (int)l2;
        i2 = i3 + paramInt1;
        n = 0;
        localObject4 = Selection.SELECTION_END;
        int i8 = 34;
        localObject3 = this;
        setSpan(false, localObject4, i2, i2, i8);
      }
      sendTextChange(arrayOfTextWatcher, paramInt1, i5, i7);
      sendTextHasChanged(arrayOfTextWatcher);
      break;
      m = i1;
    }
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    if (paramArrayOfInputFilter == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
    this.mFilters = paramArrayOfInputFilter;
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    setSpan(true, paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    SpannableStringBuilder localSpannableStringBuilder = new a_vcard/android/text/SpannableStringBuilder;
    localSpannableStringBuilder.<init>(this, paramInt1, paramInt2);
    return localSpannableStringBuilder;
  }
  
  public String toString()
  {
    int i = length();
    char[] arrayOfChar = new char[i];
    getChars(0, i, arrayOfChar, 0);
    String str = new java/lang/String;
    str.<init>(arrayOfChar);
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/SpannableStringBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */