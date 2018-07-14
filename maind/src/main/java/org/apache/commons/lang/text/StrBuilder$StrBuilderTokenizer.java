package org.apache.commons.lang.text;

import java.util.List;

class StrBuilder$StrBuilderTokenizer
  extends StrTokenizer
{
  private final StrBuilder this$0;
  
  StrBuilder$StrBuilderTokenizer(StrBuilder paramStrBuilder)
  {
    this.this$0 = paramStrBuilder;
  }
  
  public String getContent()
  {
    String str = super.getContent();
    if (str == null)
    {
      StrBuilder localStrBuilder = this.this$0;
      str = localStrBuilder.toString();
    }
    return str;
  }
  
  protected List tokenize(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i;
    if (paramArrayOfChar == null)
    {
      localObject = this.this$0.buffer;
      StrBuilder localStrBuilder = this.this$0;
      i = localStrBuilder.size();
    }
    for (Object localObject = super.tokenize((char[])localObject, 0, i);; localObject = super.tokenize(paramArrayOfChar, paramInt1, paramInt2)) {
      return (List)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrBuilder$StrBuilderTokenizer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */