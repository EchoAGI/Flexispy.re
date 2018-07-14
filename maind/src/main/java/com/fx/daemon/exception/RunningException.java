package com.fx.daemon.exception;

public class RunningException
  extends Exception
{
  public static final String ALREADY_RUNNING = "Daemon is already running";
  public static final String CANNOT_ACQUIRE_WAKELOCK = "Cannot acquire WakeLock";
  public static final String CANNOT_GET_ROOT_SHELL = "Cannot get root shell";
  public static final String MITM_SETUP_FAILED = "MITM setup failed";
  public static final String PHONE_NOT_ACTIVE = "Phone service is not active";
  public static final String SOCKET_SETUP_FAILED = "Socket server setup failed";
  public static final String STARTUP_FAILED = "Daemon startup failed";
  public static final String STARTUP_SCRIPT_NOT_FOUND = "Startup script not found";
  public static final String STARTUP_TIMEOUT = "Daemon startup take too long";
  private static final long serialVersionUID = -731750846412760440L;
  
  public RunningException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/exception/RunningException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */