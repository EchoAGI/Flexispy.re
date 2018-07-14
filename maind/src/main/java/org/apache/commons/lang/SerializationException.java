package org.apache.commons.lang;

import org.apache.commons.lang.exception.NestableRuntimeException;

public class SerializationException
  extends NestableRuntimeException
{
  private static final long serialVersionUID = 4029025366392702726L;
  
  public SerializationException() {}
  
  public SerializationException(String paramString)
  {
    super(paramString);
  }
  
  public SerializationException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public SerializationException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/SerializationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */