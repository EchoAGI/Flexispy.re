package org.apache.commons.lang.text;

import java.io.Reader;

class StrBuilder$StrBuilderReader
  extends Reader
{
  private int mark;
  private int pos;
  private final StrBuilder this$0;
  
  StrBuilder$StrBuilderReader(StrBuilder paramStrBuilder)
  {
    this.this$0 = paramStrBuilder;
  }
  
  public void close() {}
  
  public void mark(int paramInt)
  {
    int i = this.pos;
    this.mark = i;
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    boolean bool = ready();
    if (!bool) {}
    StrBuilder localStrBuilder;
    int j;
    for (int i = -1;; i = localStrBuilder.charAt(j))
    {
      return i;
      localStrBuilder = this.this$0;
      j = this.pos;
      int k = j + 1;
      this.pos = k;
    }
  }
  
  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i;
    int j;
    if ((paramInt1 >= 0) && (paramInt2 >= 0))
    {
      i = paramArrayOfChar.length;
      if (paramInt1 <= i)
      {
        i = paramInt1 + paramInt2;
        j = paramArrayOfChar.length;
        if (i <= j)
        {
          i = paramInt1 + paramInt2;
          if (i >= 0) {
            break label57;
          }
        }
      }
    }
    Object localObject = new java/lang/IndexOutOfBoundsException;
    ((IndexOutOfBoundsException)localObject).<init>();
    throw ((Throwable)localObject);
    label57:
    if (paramInt2 == 0)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      i = this.pos;
      StrBuilder localStrBuilder = this.this$0;
      j = localStrBuilder.size();
      if (i >= j)
      {
        i = -1;
      }
      else
      {
        i = this.pos + paramInt2;
        localStrBuilder = this.this$0;
        j = localStrBuilder.size();
        if (i > j)
        {
          localObject = this.this$0;
          i = ((StrBuilder)localObject).size();
          j = this.pos;
          paramInt2 = i - j;
        }
        localObject = this.this$0;
        j = this.pos;
        int k = this.pos + paramInt2;
        ((StrBuilder)localObject).getChars(j, k, paramArrayOfChar, paramInt1);
        i = this.pos + paramInt2;
        this.pos = i;
        i = paramInt2;
      }
    }
  }
  
  public boolean ready()
  {
    int i = this.pos;
    StrBuilder localStrBuilder = this.this$0;
    int k = localStrBuilder.size();
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void reset()
  {
    int i = this.mark;
    this.pos = i;
  }
  
  public long skip(long paramLong)
  {
    long l1 = 0L;
    long l2 = this.pos + paramLong;
    StrBuilder localStrBuilder1 = this.this$0;
    int i = localStrBuilder1.size();
    long l3 = i;
    boolean bool1 = l2 < l3;
    if (bool1)
    {
      StrBuilder localStrBuilder2 = this.this$0;
      int j = localStrBuilder2.size();
      int k = this.pos;
      j -= k;
      paramLong = j;
    }
    boolean bool2 = paramLong < l1;
    if (bool2) {
      paramLong = l1;
    }
    for (;;)
    {
      return paramLong;
      l1 = this.pos + paramLong;
      int m = (int)l1;
      this.pos = m;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrBuilder$StrBuilderReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */