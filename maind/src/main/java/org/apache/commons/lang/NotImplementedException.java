package org.apache.commons.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.lang.exception.Nestable;
import org.apache.commons.lang.exception.NestableDelegate;

public class NotImplementedException
  extends UnsupportedOperationException
  implements Nestable
{
  private static final String DEFAULT_MESSAGE = "Code is not implemented";
  private static final long serialVersionUID = -6894122266938754088L;
  private Throwable cause;
  private NestableDelegate delegate;
  
  public NotImplementedException()
  {
    super("Code is not implemented");
    NestableDelegate localNestableDelegate = new org/apache/commons/lang/exception/NestableDelegate;
    localNestableDelegate.<init>(this);
    this.delegate = localNestableDelegate;
  }
  
  public NotImplementedException(Class paramClass) {}
  
  public NotImplementedException(String paramString)
  {
    super(paramString);
    NestableDelegate localNestableDelegate = new org/apache/commons/lang/exception/NestableDelegate;
    localNestableDelegate.<init>(this);
    this.delegate = localNestableDelegate;
  }
  
  public NotImplementedException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    NestableDelegate localNestableDelegate = new org/apache/commons/lang/exception/NestableDelegate;
    localNestableDelegate.<init>(this);
    this.delegate = localNestableDelegate;
    this.cause = paramThrowable;
  }
  
  public NotImplementedException(Throwable paramThrowable)
  {
    super("Code is not implemented");
    NestableDelegate localNestableDelegate = new org/apache/commons/lang/exception/NestableDelegate;
    localNestableDelegate.<init>(this);
    this.delegate = localNestableDelegate;
    this.cause = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.cause;
  }
  
  public String getMessage()
  {
    Object localObject = super.getMessage();
    if (localObject != null) {
      localObject = super.getMessage();
    }
    for (;;)
    {
      return (String)localObject;
      localObject = this.cause;
      if (localObject != null) {
        localObject = this.cause.toString();
      } else {
        localObject = null;
      }
    }
  }
  
  public String getMessage(int paramInt)
  {
    if (paramInt == 0) {}
    for (String str = super.getMessage();; str = this.delegate.getMessage(paramInt)) {
      return str;
    }
  }
  
  public String[] getMessages()
  {
    return this.delegate.getMessages();
  }
  
  public Throwable getThrowable(int paramInt)
  {
    return this.delegate.getThrowable(paramInt);
  }
  
  public int getThrowableCount()
  {
    return this.delegate.getThrowableCount();
  }
  
  public Throwable[] getThrowables()
  {
    return this.delegate.getThrowables();
  }
  
  public int indexOfThrowable(Class paramClass)
  {
    return this.delegate.indexOfThrowable(paramClass, 0);
  }
  
  public int indexOfThrowable(Class paramClass, int paramInt)
  {
    return this.delegate.indexOfThrowable(paramClass, paramInt);
  }
  
  public final void printPartialStackTrace(PrintWriter paramPrintWriter)
  {
    super.printStackTrace(paramPrintWriter);
  }
  
  public void printStackTrace()
  {
    this.delegate.printStackTrace();
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    this.delegate.printStackTrace(paramPrintStream);
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    this.delegate.printStackTrace(paramPrintWriter);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/NotImplementedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */