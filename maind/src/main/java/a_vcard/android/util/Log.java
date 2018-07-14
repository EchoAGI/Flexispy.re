package a_vcard.android.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Log
{
  public static final int ASSERT = 7;
  public static final int DEBUG = 3;
  public static final int ERROR = 6;
  public static final int INFO = 4;
  public static final int VERBOSE = 2;
  public static final int WARN = 5;
  private static final Logger logger = Logger.getLogger(Log.class.getName());
  
  public static int d(String paramString1, String paramString2)
  {
    return println(3, paramString1, paramString2);
  }
  
  public static int d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2).append('\n');
    String str = getStackTraceString(paramThrowable);
    localObject = str;
    return println(3, paramString1, (String)localObject);
  }
  
  public static int e(String paramString1, String paramString2)
  {
    return println(6, paramString1, paramString2);
  }
  
  public static int e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2).append('\n');
    String str = getStackTraceString(paramThrowable);
    localObject = str;
    return println(6, paramString1, (String)localObject);
  }
  
  public static String getStackTraceString(Throwable paramThrowable)
  {
    if (paramThrowable == null) {}
    StringWriter localStringWriter;
    for (String str = "";; str = localStringWriter.toString())
    {
      return str;
      localStringWriter = new java/io/StringWriter;
      localStringWriter.<init>();
      PrintWriter localPrintWriter = new java/io/PrintWriter;
      localPrintWriter.<init>(localStringWriter);
      paramThrowable.printStackTrace(localPrintWriter);
    }
  }
  
  public static int i(String paramString1, String paramString2)
  {
    return println(4, paramString1, paramString2);
  }
  
  public static int i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2).append('\n');
    String str = getStackTraceString(paramThrowable);
    localObject = str;
    return println(4, paramString1, (String)localObject);
  }
  
  public static boolean isLoggable(String paramString, int paramInt)
  {
    return true;
  }
  
  public static int println(int paramInt, String paramString1, String paramString2)
  {
    Logger localLogger = logger;
    Level localLevel = prioToLevel(paramInt);
    localLogger.logp(localLevel, paramString1, null, paramString2);
    return 1;
  }
  
  private static Level prioToLevel(int paramInt)
  {
    Level localLevel;
    switch (paramInt)
    {
    default: 
      localLevel = Level.WARNING;
    }
    for (;;)
    {
      return localLevel;
      localLevel = Level.ALL;
      continue;
      localLevel = Level.FINEST;
      continue;
      localLevel = Level.SEVERE;
      continue;
      localLevel = Level.INFO;
      continue;
      localLevel = Level.ALL;
      continue;
      localLevel = Level.WARNING;
    }
  }
  
  public static int v(String paramString1, String paramString2)
  {
    return println(2, paramString1, paramString2);
  }
  
  public static int v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2).append('\n');
    String str = getStackTraceString(paramThrowable);
    localObject = str;
    return println(2, paramString1, (String)localObject);
  }
  
  public static int w(String paramString1, String paramString2)
  {
    return println(5, paramString1, paramString2);
  }
  
  public static int w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString2).append('\n');
    String str = getStackTraceString(paramThrowable);
    localObject = str;
    return println(5, paramString1, (String)localObject);
  }
  
  public static int w(String paramString, Throwable paramThrowable)
  {
    String str = getStackTraceString(paramThrowable);
    return println(5, paramString, str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/util/Log.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */