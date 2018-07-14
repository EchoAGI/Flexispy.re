package org.apache.commons.lang.text;

import java.io.Writer;

class StrBuilder$StrBuilderWriter
  extends Writer
{
  private final StrBuilder this$0;
  
  StrBuilder$StrBuilderWriter(StrBuilder paramStrBuilder)
  {
    this.this$0 = paramStrBuilder;
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(int paramInt)
  {
    StrBuilder localStrBuilder = this.this$0;
    char c = (char)paramInt;
    localStrBuilder.append(c);
  }
  
  public void write(String paramString)
  {
    this.this$0.append(paramString);
  }
  
  public void write(String paramString, int paramInt1, int paramInt2)
  {
    this.this$0.append(paramString, paramInt1, paramInt2);
  }
  
  public void write(char[] paramArrayOfChar)
  {
    this.this$0.append(paramArrayOfChar);
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.this$0.append(paramArrayOfChar, paramInt1, paramInt2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrBuilder$StrBuilderWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */