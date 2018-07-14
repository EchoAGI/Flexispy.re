package org.apache.commons.lang;

import java.util.Arrays;

public class IncompleteArgumentException
  extends IllegalArgumentException
{
  private static final long serialVersionUID = 4954193403612068178L;
  
  public IncompleteArgumentException(String paramString)
  {
    super((String)localObject);
  }
  
  public IncompleteArgumentException(String paramString, String[] paramArrayOfString)
  {
    super((String)localObject);
  }
  
  private static final String safeArrayToString(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {}
    for (String str = null;; str = Arrays.asList(paramArrayOfObject).toString()) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/IncompleteArgumentException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */