package org.apache.commons.codec.language;

public class DoubleMetaphone$DoubleMetaphoneResult
{
  private StringBuffer alternate;
  private int maxLength;
  private StringBuffer primary;
  private final DoubleMetaphone this$0;
  
  public DoubleMetaphone$DoubleMetaphoneResult(DoubleMetaphone paramDoubleMetaphone, int paramInt)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = this.this$0.getMaxCodeLen();
    localStringBuffer.<init>(i);
    this.primary = localStringBuffer;
    localStringBuffer = new java/lang/StringBuffer;
    i = this.this$0.getMaxCodeLen();
    localStringBuffer.<init>(i);
    this.alternate = localStringBuffer;
    this.maxLength = paramInt;
  }
  
  public void append(char paramChar)
  {
    appendPrimary(paramChar);
    appendAlternate(paramChar);
  }
  
  public void append(char paramChar1, char paramChar2)
  {
    appendPrimary(paramChar1);
    appendAlternate(paramChar2);
  }
  
  public void append(String paramString)
  {
    appendPrimary(paramString);
    appendAlternate(paramString);
  }
  
  public void append(String paramString1, String paramString2)
  {
    appendPrimary(paramString1);
    appendAlternate(paramString2);
  }
  
  public void appendAlternate(char paramChar)
  {
    StringBuffer localStringBuffer = this.alternate;
    int i = localStringBuffer.length();
    int j = this.maxLength;
    if (i < j)
    {
      localStringBuffer = this.alternate;
      localStringBuffer.append(paramChar);
    }
  }
  
  public void appendAlternate(String paramString)
  {
    int i = this.maxLength;
    Object localObject = this.alternate;
    int j = ((StringBuffer)localObject).length();
    int k = i - j;
    i = paramString.length();
    StringBuffer localStringBuffer;
    if (i <= k)
    {
      localStringBuffer = this.alternate;
      localStringBuffer.append(paramString);
    }
    for (;;)
    {
      return;
      localStringBuffer = this.alternate;
      j = 0;
      localObject = paramString.substring(0, k);
      localStringBuffer.append((String)localObject);
    }
  }
  
  public void appendPrimary(char paramChar)
  {
    StringBuffer localStringBuffer = this.primary;
    int i = localStringBuffer.length();
    int j = this.maxLength;
    if (i < j)
    {
      localStringBuffer = this.primary;
      localStringBuffer.append(paramChar);
    }
  }
  
  public void appendPrimary(String paramString)
  {
    int i = this.maxLength;
    Object localObject = this.primary;
    int j = ((StringBuffer)localObject).length();
    int k = i - j;
    i = paramString.length();
    StringBuffer localStringBuffer;
    if (i <= k)
    {
      localStringBuffer = this.primary;
      localStringBuffer.append(paramString);
    }
    for (;;)
    {
      return;
      localStringBuffer = this.primary;
      j = 0;
      localObject = paramString.substring(0, k);
      localStringBuffer.append((String)localObject);
    }
  }
  
  public String getAlternate()
  {
    return this.alternate.toString();
  }
  
  public String getPrimary()
  {
    return this.primary.toString();
  }
  
  public boolean isComplete()
  {
    StringBuffer localStringBuffer = this.primary;
    int i = localStringBuffer.length();
    int k = this.maxLength;
    if (i >= k)
    {
      localStringBuffer = this.alternate;
      i = localStringBuffer.length();
      int m = this.maxLength;
      if (i >= m) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localStringBuffer = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */