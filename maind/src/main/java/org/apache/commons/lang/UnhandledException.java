package org.apache.commons.lang;

import org.apache.commons.lang.exception.NestableRuntimeException;

public class UnhandledException
  extends NestableRuntimeException
{
  private static final long serialVersionUID = 1832101364842773720L;
  
  public UnhandledException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public UnhandledException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/UnhandledException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */