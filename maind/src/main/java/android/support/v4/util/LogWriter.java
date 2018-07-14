package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

public class LogWriter
  extends Writer
{
  private StringBuilder mBuilder;
  private final String mTag;
  
  public LogWriter(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    this.mBuilder = localStringBuilder;
    this.mTag = paramString;
  }
  
  private void flushBuilder()
  {
    Object localObject = this.mBuilder;
    int i = ((StringBuilder)localObject).length();
    if (i > 0)
    {
      localObject = this.mTag;
      String str = this.mBuilder.toString();
      Log.d((String)localObject, str);
      localObject = this.mBuilder;
      str = null;
      StringBuilder localStringBuilder = this.mBuilder;
      int j = localStringBuilder.length();
      ((StringBuilder)localObject).delete(0, j);
    }
  }
  
  public void close()
  {
    flushBuilder();
  }
  
  public void flush()
  {
    flushBuilder();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      int j = paramInt1 + i;
      int k = paramArrayOfChar[j];
      j = 10;
      if (k == j) {
        flushBuilder();
      }
      for (;;)
      {
        i += 1;
        break;
        StringBuilder localStringBuilder = this.mBuilder;
        localStringBuilder.append(k);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/LogWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */