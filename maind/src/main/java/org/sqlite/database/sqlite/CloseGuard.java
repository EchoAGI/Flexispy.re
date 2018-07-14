package org.sqlite.database.sqlite;

public final class CloseGuard
{
  private static volatile boolean ENABLED;
  private static final CloseGuard NOOP;
  private static volatile CloseGuard.Reporter REPORTER;
  private Throwable allocationSite;
  
  static
  {
    Object localObject = new org/sqlite/database/sqlite/CloseGuard;
    ((CloseGuard)localObject).<init>();
    NOOP = (CloseGuard)localObject;
    ENABLED = true;
    localObject = new org/sqlite/database/sqlite/CloseGuard$DefaultReporter;
    ((CloseGuard.DefaultReporter)localObject).<init>(null);
    REPORTER = (CloseGuard.Reporter)localObject;
  }
  
  public static CloseGuard get()
  {
    boolean bool = ENABLED;
    CloseGuard localCloseGuard;
    if (!bool) {
      localCloseGuard = NOOP;
    }
    for (;;)
    {
      return localCloseGuard;
      localCloseGuard = new org/sqlite/database/sqlite/CloseGuard;
      localCloseGuard.<init>();
    }
  }
  
  public static CloseGuard.Reporter getReporter()
  {
    return REPORTER;
  }
  
  public static void setEnabled(boolean paramBoolean)
  {
    ENABLED = paramBoolean;
  }
  
  public static void setReporter(CloseGuard.Reporter paramReporter)
  {
    if (paramReporter == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("reporter == null");
      throw localNullPointerException;
    }
    REPORTER = paramReporter;
  }
  
  public void close()
  {
    this.allocationSite = null;
  }
  
  public void open(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("closer == null");
      throw ((Throwable)localObject);
    }
    Object localObject = NOOP;
    if (this != localObject)
    {
      boolean bool = ENABLED;
      if (bool) {
        break label34;
      }
    }
    for (;;)
    {
      return;
      label34:
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Explicit termination method '" + paramString + "' not called";
      Throwable localThrowable = new java/lang/Throwable;
      localThrowable.<init>((String)localObject);
      this.allocationSite = localThrowable;
    }
  }
  
  public void warnIfOpen()
  {
    Object localObject = this.allocationSite;
    if (localObject != null)
    {
      boolean bool = ENABLED;
      if (bool) {
        break label18;
      }
    }
    for (;;)
    {
      return;
      label18:
      localObject = "A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.";
      CloseGuard.Reporter localReporter = REPORTER;
      Throwable localThrowable = this.allocationSite;
      localReporter.report((String)localObject, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/CloseGuard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */