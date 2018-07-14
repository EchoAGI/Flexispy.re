package a_vcard.android.syncml.pim;

import a_vcard.android.content.ContentValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

public class PropertyNode
{
  public ContentValues paramMap;
  public Set paramMap_TYPE;
  public Set propGroupSet;
  public String propName;
  public String propValue;
  public byte[] propValue_bytes;
  public List propValue_vector;
  
  public PropertyNode()
  {
    this.propName = "";
    this.propValue = "";
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.propValue_vector = ((List)localObject);
    localObject = new a_vcard/android/content/ContentValues;
    ((ContentValues)localObject).<init>();
    this.paramMap = ((ContentValues)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.paramMap_TYPE = ((Set)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.propGroupSet = ((Set)localObject);
  }
  
  public PropertyNode(String paramString1, String paramString2, List paramList, byte[] paramArrayOfByte, ContentValues paramContentValues, Set paramSet1, Set paramSet2)
  {
    if (paramString1 != null)
    {
      this.propName = paramString1;
      if (paramString2 == null) {
        break label84;
      }
      this.propValue = paramString2;
      label22:
      if (paramList == null) {
        break label97;
      }
      this.propValue_vector = paramList;
      label31:
      this.propValue_bytes = paramArrayOfByte;
      if (paramContentValues == null) {
        break label116;
      }
      this.paramMap = paramContentValues;
      label48:
      if (paramSet1 == null) {
        break label135;
      }
      this.paramMap_TYPE = paramSet1;
      label59:
      if (paramSet2 == null) {
        break label154;
      }
    }
    Object localObject;
    for (this.propGroupSet = paramSet2;; this.propGroupSet = ((Set)localObject))
    {
      return;
      localObject = "";
      this.propName = ((String)localObject);
      break;
      label84:
      localObject = "";
      this.propValue = ((String)localObject);
      break label22;
      label97:
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.propValue_vector = ((List)localObject);
      break label31;
      label116:
      localObject = new a_vcard/android/content/ContentValues;
      ((ContentValues)localObject).<init>();
      this.paramMap = ((ContentValues)localObject);
      break label48;
      label135:
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
      this.paramMap_TYPE = ((Set)localObject);
      break label59;
      label154:
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
    }
  }
  
  public static PropertyNode decode(String paramString)
  {
    PropertyNode localPropertyNode = new a_vcard/android/syncml/pim/PropertyNode;
    localPropertyNode.<init>();
    String str1 = paramString.trim();
    int i = str1.length();
    if (i == 0) {}
    for (;;)
    {
      return localPropertyNode;
      Object localObject1 = "],";
      Object localObject2 = str1;
      Object localObject3 = localObject1;
      String[] arrayOfString1 = str1.split((String)localObject1);
      String[] arrayOfString2 = arrayOfString1;
      int k = arrayOfString1.length;
      int m = 0;
      int n = 0;
      int i3;
      if (n < k)
      {
        String str2 = arrayOfString2[n];
        int i1 = 91;
        int i2 = str2.indexOf(i1);
        i3 = i2 + -1;
        String str3 = str2.substring(0, i3);
        Pattern localPattern = Pattern.compile("(?<!\\\\),");
        i = i2 + 1;
        i1 = i;
        localObject1 = str2.substring(i);
        i3 = -1;
        localObject2 = localPattern;
        localObject3 = localObject1;
        String[] arrayOfString3 = localPattern.split((CharSequence)localObject1, i3);
        localObject1 = "propName";
        localObject2 = str3;
        localObject3 = localObject1;
        boolean bool1 = str3.equals(localObject1);
        if (bool1)
        {
          bool1 = false;
          localObject1 = arrayOfString3[0];
          localObject2 = localObject1;
          localObject3 = localPropertyNode;
          localPropertyNode.propName = ((String)localObject1);
        }
        for (;;)
        {
          m = n + 1;
          n = m;
          break;
          localObject1 = "propGroupSet";
          localObject3 = localObject1;
          bool1 = str3.equals(localObject1);
          String[] arrayOfString4;
          int i4;
          String str4;
          if (bool1)
          {
            arrayOfString4 = arrayOfString3;
            i4 = arrayOfString3.length;
            m = 0;
            while (m < i4)
            {
              str4 = arrayOfString4[m];
              localObject2 = localPropertyNode;
              localObject2 = localPropertyNode.propGroupSet;
              localObject1 = localObject2;
              localObject3 = str4;
              ((Set)localObject2).add(str4);
              m += 1;
            }
          }
          else
          {
            localObject1 = "paramMap";
            localObject3 = localObject1;
            bool1 = str3.equals(localObject1);
            label340:
            String str7;
            if (bool1)
            {
              localObject2 = localPropertyNode;
              ContentValues localContentValues = localPropertyNode.paramMap;
              localObject2 = localPropertyNode;
              localObject2 = localPropertyNode.paramMap_TYPE;
              Object localObject4 = localObject2;
              arrayOfString4 = arrayOfString3;
              i4 = arrayOfString3.length;
              m = 0;
              String str5;
              String str8;
              if (m < i4)
              {
                str4 = arrayOfString4[m];
                i3 = 2;
                localObject2 = str4;
                localObject3 = "=";
                String[] arrayOfString5 = str4.split((String)localObject3, i3);
                str5 = arrayOfString5[0];
                localObject1 = arrayOfString5[1].replaceAll("\\\\,", ",");
                str6 = "\\\\\\\\";
                str7 = "\\\\";
                str8 = ((String)localObject1).replaceAll(str6, str7);
                localObject1 = "TYPE";
                localObject2 = str5;
                localObject3 = localObject1;
                bool1 = str5.equalsIgnoreCase((String)localObject1);
                if (!bool1) {
                  break label465;
                }
                localObject2 = localObject4;
                localObject3 = str8;
                ((Set)localObject4).add(str8);
              }
              for (;;)
              {
                m += 1;
                break label340;
                break;
                label465:
                localObject2 = localContentValues;
                localObject3 = str5;
                localContentValues.put(str5, str8);
              }
            }
            localObject1 = "propValue";
            localObject3 = localObject1;
            bool1 = str3.equals(localObject1);
            if (bool1)
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localObject2 = localPropertyNode;
              List localList = localPropertyNode.propValue_vector;
              localObject2 = arrayOfString3;
              int i5 = arrayOfString3.length;
              int i6 = 0;
              while (i6 < i5)
              {
                localObject1 = arrayOfString3[i6].replaceAll("\\\\,", ",");
                str6 = "\\\\\\\\";
                str7 = "\\\\";
                String str9 = ((String)localObject1).replaceAll(str6, str7);
                localObject2 = localList;
                localObject3 = str9;
                localList.add(str9);
                localObject2 = str9;
                localStringBuilder.append(str9);
                int j = i5 + -1;
                i1 = j;
                if (i6 < j)
                {
                  localObject1 = ";";
                  localObject2 = localObject1;
                  localStringBuilder.append((String)localObject1);
                }
                i6 += 1;
              }
              localObject1 = localStringBuilder.toString();
              localObject2 = localObject1;
              localObject3 = localPropertyNode;
              localPropertyNode.propValue = ((String)localObject1);
            }
          }
        }
      }
      localObject2 = localPropertyNode;
      localObject2 = localPropertyNode.paramMap;
      localObject1 = localObject2;
      String str6 = "ENCODING";
      String str10 = ((ContentValues)localObject2).getAsString(str6);
      if (str10 != null)
      {
        localObject1 = "BASE64";
        localObject2 = localObject1;
        boolean bool2 = str10.equalsIgnoreCase((String)localObject1);
        if (!bool2)
        {
          localObject1 = "B";
          localObject2 = localObject1;
          bool2 = str10.equalsIgnoreCase((String)localObject1);
          if (!bool2) {}
        }
        else
        {
          localObject2 = localPropertyNode;
          localObject2 = localPropertyNode.propValue_vector;
          localObject1 = localObject2;
          i3 = 0;
          str6 = null;
          localObject1 = Base64.decodeBase64(((String)((List)localObject2).get(0)).getBytes());
          localObject2 = localObject1;
          localObject3 = localPropertyNode;
          localPropertyNode.propValue_bytes = ((byte[])localObject1);
        }
      }
    }
  }
  
  public String encode()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.propName;
    int i = ((String)localObject).length();
    if (i > 0)
    {
      localStringBuilder.append("propName:[");
      localObject = this.propName;
      localStringBuilder.append((String)localObject);
      localObject = "],";
      localStringBuilder.append((String)localObject);
    }
    localObject = this.propGroupSet;
    int n = ((Set)localObject).size();
    Set localSet;
    int i1;
    Iterator localIterator;
    if (n > 0)
    {
      localSet = this.propGroupSet;
      localObject = "propGroup:[";
      localStringBuilder.append((String)localObject);
      i1 = 0;
      localIterator = localSet.iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        String str1 = (String)localIterator.next();
        localStringBuilder.append(str1);
        j = n + -1;
        if (i1 < j)
        {
          localObject = ",";
          localStringBuilder.append((String)localObject);
        }
        i1 += 1;
      }
      localObject = "],";
      localStringBuilder.append((String)localObject);
    }
    localObject = this.paramMap;
    int j = ((ContentValues)localObject).size();
    String str2;
    String str3;
    int m;
    if (j <= 0)
    {
      localObject = this.paramMap_TYPE;
      j = ((Set)localObject).size();
      if (j <= 0) {}
    }
    else
    {
      ContentValues localContentValues = this.paramMap;
      localStringBuilder.append("paramMap:[");
      n = this.paramMap.size();
      i1 = 0;
      localObject = localContentValues.valueSet();
      localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localObject = (String)localEntry.getKey();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("=");
        localObject = localEntry.getValue().toString().replaceAll("\\\\", "\\\\\\\\");
        str2 = ",";
        str3 = "\\\\,";
        localObject = ((String)localObject).replaceAll(str2, str3);
        localStringBuilder.append((String)localObject);
        int k = n + -1;
        if (i1 < k)
        {
          localObject = ",";
          localStringBuilder.append((String)localObject);
        }
        i1 += 1;
      }
      localSet = this.paramMap_TYPE;
      localObject = this.paramMap_TYPE;
      n = ((Set)localObject).size();
      if ((i1 > 0) && (n > 0))
      {
        localObject = ",";
        localStringBuilder.append((String)localObject);
      }
      i1 = 0;
      localIterator = localSet.iterator();
      for (;;)
      {
        boolean bool3 = localIterator.hasNext();
        if (!bool3) {
          break;
        }
        String str4 = (String)localIterator.next();
        localStringBuilder.append("TYPE=");
        localObject = str4.replaceAll("\\\\", "\\\\\\\\");
        str2 = ",";
        str3 = "\\\\,";
        localObject = ((String)localObject).replaceAll(str2, str3);
        localStringBuilder.append((String)localObject);
        m = n + -1;
        if (i1 < m)
        {
          localObject = ",";
          localStringBuilder.append((String)localObject);
        }
        i1 += 1;
      }
      localObject = "],";
      localStringBuilder.append((String)localObject);
    }
    localObject = this.propValue_vector;
    n = ((List)localObject).size();
    if (n > 0)
    {
      localObject = "propValue:[";
      localStringBuilder.append((String)localObject);
      List localList = this.propValue_vector;
      i1 = 0;
      while (i1 < n)
      {
        localObject = ((String)localList.get(i1)).replaceAll("\\\\", "\\\\\\\\");
        str2 = ",";
        str3 = "\\\\,";
        localObject = ((String)localObject).replaceAll(str2, str3);
        localStringBuilder.append((String)localObject);
        m = n + -1;
        if (i1 < m)
        {
          localObject = ",";
          localStringBuilder.append((String)localObject);
        }
        i1 += 1;
      }
      localObject = "],";
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PropertyNode;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject1 = paramObject;
      localObject1 = (PropertyNode)paramObject;
      Object localObject2 = this.propName;
      if (localObject2 != null)
      {
        localObject2 = this.propName;
        Object localObject3 = ((PropertyNode)localObject1).propName;
        bool2 = ((String)localObject2).equals(localObject3);
        if (bool2)
        {
          localObject2 = this.paramMap;
          localObject3 = ((PropertyNode)localObject1).paramMap;
          bool2 = ((ContentValues)localObject2).equals(localObject3);
          if (bool2)
          {
            localObject2 = this.paramMap_TYPE;
            localObject3 = ((PropertyNode)localObject1).paramMap_TYPE;
            bool2 = localObject2.equals(localObject3);
            if (bool2)
            {
              localObject2 = this.propGroupSet;
              localObject3 = ((PropertyNode)localObject1).propGroupSet;
              bool2 = localObject2.equals(localObject3);
              if (bool2)
              {
                localObject2 = this.propValue_bytes;
                if (localObject2 != null)
                {
                  localObject2 = this.propValue_bytes;
                  localObject3 = ((PropertyNode)localObject1).propValue_bytes;
                  bool2 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
                  if (bool2)
                  {
                    bool1 = i;
                    continue;
                  }
                }
                localObject2 = this.propValue;
                localObject3 = ((PropertyNode)localObject1).propValue;
                bool2 = ((String)localObject2).equals(localObject3);
                if (bool2)
                {
                  localObject2 = this.propValue_vector;
                  localObject3 = ((PropertyNode)localObject1).propValue_vector;
                  bool2 = localObject2.equals(localObject3);
                  if (!bool2)
                  {
                    localObject2 = this.propValue_vector;
                    int j = ((List)localObject2).size();
                    if (j != i)
                    {
                      localObject2 = ((PropertyNode)localObject1).propValue_vector;
                      j = ((List)localObject2).size();
                      if (j != i) {
                        continue;
                      }
                    }
                  }
                  bool1 = i;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("propName: ");
    Object localObject = this.propName;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", paramMap: ");
    localObject = this.paramMap.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", propmMap_TYPE: ");
    localObject = this.paramMap_TYPE.toString();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", propGroupSet: ");
    localObject = this.propGroupSet.toString();
    localStringBuilder.append((String)localObject);
    localObject = this.propValue_vector;
    int i;
    if (localObject != null)
    {
      localObject = this.propValue_vector;
      i = ((List)localObject).size();
      int j = 1;
      if (i > j)
      {
        localStringBuilder.append(", propValue_vector size: ");
        localObject = this.propValue_vector;
        i = ((List)localObject).size();
        localStringBuilder.append(i);
      }
    }
    localObject = this.propValue_bytes;
    if (localObject != null)
    {
      localStringBuilder.append(", propValue_bytes size: ");
      localObject = this.propValue_bytes;
      i = localObject.length;
      localStringBuilder.append(i);
    }
    localStringBuilder.append(", propValue: ");
    localObject = this.propValue;
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/PropertyNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */