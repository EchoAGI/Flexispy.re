package a_vcard.android.syncml.pim;

import a_vcard.android.content.ContentValues;
import a_vcard.android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

public class VDataBuilder
  implements VBuilder
{
  public static String DEFAULT_CHARSET = "UTF-8";
  private static String LOG_TAG = "VDATABuilder";
  private String mCurrentParamType;
  private PropertyNode mCurrentPropNode;
  private VNode mCurrentVNode;
  private int mNodeListPos;
  private String mSourceCharset;
  private boolean mStrictLineBreakParsing;
  private String mTargetCharset;
  public List vNodeList;
  
  public VDataBuilder()
  {
    this(str1, str2, false);
  }
  
  public VDataBuilder(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.vNodeList = ((List)localObject);
    localObject = null;
    this.mNodeListPos = 0;
    if (paramString1 != null)
    {
      this.mSourceCharset = paramString1;
      if (paramString2 == null) {
        break label66;
      }
    }
    for (this.mTargetCharset = paramString2;; this.mTargetCharset = ((String)localObject))
    {
      this.mStrictLineBreakParsing = paramBoolean;
      return;
      localObject = DEFAULT_CHARSET;
      this.mSourceCharset = ((String)localObject);
      break;
      label66:
      localObject = DEFAULT_CHARSET;
    }
  }
  
  public VDataBuilder(String paramString, boolean paramBoolean)
  {
    this(null, paramString, paramBoolean);
  }
  
  private String encodeString(String paramString1, String paramString2)
  {
    String str1 = this.mSourceCharset;
    boolean bool = str1.equalsIgnoreCase(paramString2);
    if (bool) {}
    for (;;)
    {
      return paramString1;
      str1 = this.mSourceCharset;
      Charset localCharset = Charset.forName(str1);
      ByteBuffer localByteBuffer = localCharset.encode(paramString1);
      int i = localByteBuffer.remaining();
      byte[] arrayOfByte = new byte[i];
      localByteBuffer.get(arrayOfByte);
      try
      {
        paramString1 = new java/lang/String;
        paramString1.<init>(arrayOfByte, paramString2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        str1 = LOG_TAG;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str2 = "Failed to encode: charset=";
        localObject = str2 + paramString2;
        Log.e(str1, (String)localObject);
        paramString1 = new java/lang/String;
        paramString1.<init>(arrayOfByte);
      }
    }
  }
  
  private String handleOneValue(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool1;
    Object localObject4;
    if (paramString3 != null)
    {
      localObject1 = "BASE64";
      localObject2 = paramString3;
      localObject3 = localObject1;
      bool1 = paramString3.equals(localObject1);
      if (!bool1)
      {
        localObject1 = "B";
        localObject3 = localObject1;
        bool1 = paramString3.equals(localObject1);
        if (!bool1) {}
      }
      else
      {
        localObject2 = this;
        localObject1 = this.mCurrentPropNode;
        localObject4 = Base64.decodeBase64(paramString1.getBytes());
        localObject2 = localObject4;
        localObject3 = localObject1;
        ((PropertyNode)localObject1).propValue_bytes = ((byte[])localObject4);
      }
    }
    for (;;)
    {
      return paramString1;
      localObject1 = "QUOTED-PRINTABLE";
      localObject3 = localObject1;
      bool1 = paramString3.equals(localObject1);
      Object localObject5;
      if (bool1)
      {
        localObject2 = paramString1;
        localObject3 = "= ";
        String str1 = " ";
        localObject1 = paramString1.replaceAll((String)localObject3, str1);
        localObject4 = "=\t";
        localObject5 = "\t";
        String str2 = ((String)localObject1).replaceAll((String)localObject4, (String)localObject5);
        localObject2 = this;
        boolean bool2 = this.mStrictLineBreakParsing;
        bool1 = bool2;
        if (bool2) {
          localObject1 = "\r\n";
        }
        StringBuilder localStringBuilder;
        ArrayList localArrayList;
        for (String[] arrayOfString1 = str2.split((String)localObject1);; arrayOfString1 = (String[])localArrayList.toArray((Object[])localObject1))
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String[] arrayOfString2 = arrayOfString1;
          int j = arrayOfString1.length;
          int k = 0;
          while (k < j)
          {
            String str3 = arrayOfString2[k];
            localObject1 = "=";
            localObject2 = localObject1;
            bool1 = str3.endsWith((String)localObject1);
            if (bool1)
            {
              bool1 = false;
              localObject1 = null;
              int m = str3.length() + -1;
              bool2 = false;
              localObject2 = null;
              str3 = str3.substring(0, m);
            }
            localStringBuilder.append(str3);
            k += 1;
          }
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          int n = str2.length();
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          int i1 = 0;
          if (i1 < n)
          {
            localObject2 = str2;
            int i2 = str2.charAt(i1);
            i = 10;
            bool2 = i;
            if (i2 == i)
            {
              localObject1 = localStringBuilder.toString();
              localObject2 = localArrayList;
              localObject3 = localObject1;
              localArrayList.add(localObject1);
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
            }
            for (;;)
            {
              i1 += 1;
              break;
              i = 13;
              bool2 = i;
              if (i2 == i)
              {
                localObject1 = localStringBuilder.toString();
                localObject2 = localArrayList;
                localObject3 = localObject1;
                localArrayList.add(localObject1);
                localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                i = n + -1;
                bool2 = i;
                if (i1 < i)
                {
                  i = i1 + 1;
                  int i3 = str2.charAt(i);
                  i = 10;
                  bool2 = i3;
                  if (i3 == i) {
                    i1 += 1;
                  }
                }
              }
              else
              {
                localStringBuilder.append(i2);
              }
            }
          }
          String str4 = localStringBuilder.toString();
          int i = str4.length();
          if (i > 0)
          {
            localObject2 = localArrayList;
            localArrayList.add(str4);
          }
          i = 0;
          bool2 = false;
          localObject1 = new String[0];
          localObject2 = localArrayList;
          localObject3 = localObject1;
        }
        try
        {
          localObject1 = localStringBuilder.toString();
          localObject2 = this;
          localObject2 = this.mSourceCharset;
          localObject4 = localObject2;
          arrayOfByte = ((String)localObject1).getBytes((String)localObject2);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            try
            {
              arrayOfByte = QuotedPrintableCodec.decodeQuotedPrintable(arrayOfByte);
              try
              {
                paramString1 = new java/lang/String;
                localObject2 = paramString1;
                localObject3 = paramString2;
                paramString1.<init>(arrayOfByte, paramString2);
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException1)
              {
                localObject1 = LOG_TAG;
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject5 = "Failed to encode: charset=";
                localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
                localObject2 = localObject4;
                localObject3 = paramString2;
                localObject4 = paramString2;
                Log.e((String)localObject1, (String)localObject4);
                paramString1 = new java/lang/String;
                localObject2 = paramString1;
                paramString1.<init>(arrayOfByte);
              }
            }
            catch (DecoderException localDecoderException)
            {
              byte[] arrayOfByte;
              localObject1 = LOG_TAG;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject5 = "Failed to decode quoted-printable: ";
              localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
              localObject2 = localObject4;
              localObject4 = localDecoderException;
              Log.e((String)localObject1, (String)localObject4);
              paramString1 = "";
            }
            localUnsupportedEncodingException2;
            localObject1 = LOG_TAG;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = ((StringBuilder)localObject4).append("Failed to encode: charset=");
            localObject2 = this;
            localObject2 = this.mSourceCharset;
            localObject5 = localObject2;
            localObject4 = (String)localObject2;
            Log.e((String)localObject1, (String)localObject4);
            localObject1 = localStringBuilder.toString();
            arrayOfByte = ((String)localObject1).getBytes();
          }
        }
      }
      else
      {
        paramString1 = encodeString(paramString1, paramString2);
      }
    }
  }
  
  private String listToString(List paramList)
  {
    int i = 1;
    int k = paramList.size();
    StringBuilder localStringBuilder;
    Object localObject;
    int j;
    if (k > i)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        i = localIterator.hasNext();
        if (i == 0) {
          break;
        }
        String str1 = (String)localIterator.next();
        localObject = localStringBuilder.append(str1);
        String str2 = ";";
        ((StringBuilder)localObject).append(str2);
      }
      int m = localStringBuilder.length();
      if (m > 0)
      {
        j = m + -1;
        j = localStringBuilder.charAt(j);
        int n = 59;
        if (j == n)
        {
          j = m + -1;
          localObject = localStringBuilder.substring(0, j);
        }
      }
    }
    for (;;)
    {
      return (String)localObject;
      localObject = localStringBuilder.toString();
      continue;
      if (k == j) {
        localObject = (String)paramList.get(0);
      } else {
        localObject = "";
      }
    }
  }
  
  public void end() {}
  
  public void endProperty()
  {
    ArrayList localArrayList = this.mCurrentVNode.propList;
    PropertyNode localPropertyNode = this.mCurrentPropNode;
    localArrayList.add(localPropertyNode);
  }
  
  public void endRecord()
  {
    Object localObject = this.vNodeList;
    int i = this.mNodeListPos;
    VNode localVNode = (VNode)((List)localObject).get(i);
    int j = 0;
    localObject = null;
    localVNode.parseStatus = 0;
    do
    {
      j = this.mNodeListPos;
      if (j <= 0) {
        break;
      }
      j = this.mNodeListPos + -1;
      this.mNodeListPos = j;
      localObject = this.vNodeList;
      i = this.mNodeListPos;
      localObject = (VNode)((List)localObject).get(i);
      j = ((VNode)localObject).parseStatus;
      i = 1;
    } while (j != i);
    localObject = this.vNodeList;
    i = this.mNodeListPos;
    localObject = (VNode)((List)localObject).get(i);
    this.mCurrentVNode = ((VNode)localObject);
  }
  
  public String getResult()
  {
    return null;
  }
  
  public void propertyGroup(String paramString)
  {
    this.mCurrentPropNode.propGroupSet.add(paramString);
  }
  
  public void propertyName(String paramString)
  {
    this.mCurrentPropNode.propName = paramString;
  }
  
  public void propertyParamType(String paramString)
  {
    this.mCurrentParamType = paramString;
  }
  
  public void propertyParamValue(String paramString)
  {
    Object localObject = this.mCurrentParamType;
    String str;
    if (localObject != null)
    {
      localObject = this.mCurrentParamType;
      str = "TYPE";
      boolean bool = ((String)localObject).equalsIgnoreCase(str);
      if (!bool) {}
    }
    else
    {
      localObject = this.mCurrentPropNode.paramMap_TYPE;
      ((Set)localObject).add(paramString);
    }
    for (;;)
    {
      this.mCurrentParamType = null;
      return;
      localObject = this.mCurrentPropNode.paramMap;
      str = this.mCurrentParamType;
      ((ContentValues)localObject).put(str, paramString);
    }
  }
  
  public void propertyValues(List paramList)
  {
    int i;
    Object localObject1;
    Object localObject2;
    if (paramList != null)
    {
      i = paramList.size();
      if (i != 0) {}
    }
    else
    {
      this.mCurrentPropNode.propValue_bytes = null;
      this.mCurrentPropNode.propValue_vector.clear();
      this.mCurrentPropNode.propValue_vector.add("");
      localObject1 = this.mCurrentPropNode;
      localObject2 = "";
    }
    for (((PropertyNode)localObject1).propValue = ((String)localObject2);; ((PropertyNode)localObject1).propValue = ((String)localObject2))
    {
      return;
      ContentValues localContentValues = this.mCurrentPropNode.paramMap;
      String str1 = DEFAULT_CHARSET;
      localObject1 = "ENCODING";
      String str2 = localContentValues.getAsString((String)localObject1);
      if (str1 != null)
      {
        i = str1.length();
        if (i != 0) {}
      }
      else
      {
        str1 = this.mTargetCharset;
      }
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        String str3 = (String)localIterator.next();
        localObject1 = this.mCurrentPropNode.propValue_vector;
        localObject2 = handleOneValue(str3, str1, str2);
        ((List)localObject1).add(localObject2);
      }
      localObject1 = this.mCurrentPropNode;
      localObject2 = this.mCurrentPropNode.propValue_vector;
      localObject2 = listToString((List)localObject2);
    }
  }
  
  public void start() {}
  
  public void startProperty()
  {
    PropertyNode localPropertyNode = new a_vcard/android/syncml/pim/PropertyNode;
    localPropertyNode.<init>();
    this.mCurrentPropNode = localPropertyNode;
  }
  
  public void startRecord(String paramString)
  {
    VNode localVNode = new a_vcard/android/syncml/pim/VNode;
    localVNode.<init>();
    localVNode.parseStatus = 1;
    localVNode.VName = paramString;
    this.vNodeList.add(localVNode);
    int i = this.vNodeList.size() + -1;
    this.mNodeListPos = i;
    Object localObject = this.vNodeList;
    int j = this.mNodeListPos;
    localObject = (VNode)((List)localObject).get(j);
    this.mCurrentVNode = ((VNode)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/VDataBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */