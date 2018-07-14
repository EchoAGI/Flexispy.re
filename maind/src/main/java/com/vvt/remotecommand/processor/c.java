package com.vvt.remotecommand.processor;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.RemoteCommandException;

public abstract interface c
{
  public abstract void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor);
  
  public abstract void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, RemoteCommandException paramRemoteCommandException);
  
  public abstract void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, String paramString);
  
  public abstract void b(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, String paramString);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */