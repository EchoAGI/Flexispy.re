package a_vcard.android.syncml.pim.vcard;

import a_vcard.android.syncml.pim.VDataBuilder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class VCardParser
{
  private static final String TAG = "VCardParser";
  public static final String VERSION_VCARD21 = "vcard2.1";
  public static final int VERSION_VCARD21_INT = 1;
  public static final String VERSION_VCARD30 = "vcard3.0";
  public static final int VERSION_VCARD30_INT = 2;
  VCardParser_V21 mParser = null;
  String mVersion = null;
  
  private void judgeVersion(String paramString)
  {
    Object localObject = this.mVersion;
    int i;
    if (localObject == null)
    {
      localObject = "\nVERSION:";
      i = paramString.indexOf((String)localObject);
      int j = -1;
      if (i != j) {
        break label106;
      }
      localObject = "vcard2.1";
      this.mVersion = ((String)localObject);
    }
    for (;;)
    {
      localObject = this.mVersion;
      String str1 = "vcard2.1";
      boolean bool = ((String)localObject).equals(str1);
      if (bool)
      {
        localObject = new a_vcard/android/syncml/pim/vcard/VCardParser_V21;
        ((VCardParser_V21)localObject).<init>();
        this.mParser = ((VCardParser_V21)localObject);
      }
      localObject = this.mVersion;
      str1 = "vcard3.0";
      bool = ((String)localObject).equals(str1);
      if (bool)
      {
        localObject = new a_vcard/android/syncml/pim/vcard/VCardParser_V30;
        ((VCardParser_V30)localObject).<init>();
        this.mParser = ((VCardParser_V21)localObject);
      }
      return;
      label106:
      int m = i + 1;
      int k = paramString.indexOf("\n", m);
      String str2 = paramString.substring(i, k);
      localObject = "2.1";
      k = str2.indexOf((String)localObject);
      if (k > 0)
      {
        localObject = "vcard2.1";
        this.mVersion = ((String)localObject);
      }
      else
      {
        localObject = "3.0";
        k = str2.indexOf((String)localObject);
        if (k > 0)
        {
          localObject = "vcard3.0";
          this.mVersion = ((String)localObject);
        }
        else
        {
          localObject = "vcard2.1";
          this.mVersion = ((String)localObject);
        }
      }
    }
  }
  
  private void setVersion(String paramString)
  {
    this.mVersion = paramString;
  }
  
  private String verifyVCard(String paramString)
  {
    judgeVersion(paramString);
    String str = "\n";
    paramString = paramString.replaceAll("\r\n", str);
    String[] arrayOfString = paramString.split("\n");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject = "";
    localStringBuilder.<init>((String)localObject);
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      localObject = arrayOfString[i];
      str = ":";
      j = ((String)localObject).indexOf(str);
      if (j < 0)
      {
        localObject = arrayOfString[i];
        j = ((String)localObject).length();
        if (j == 0)
        {
          j = i + 1;
          localObject = arrayOfString[j];
          str = ":";
          j = ((String)localObject).indexOf(str);
          if (j > 0)
          {
            localObject = arrayOfString[i];
            localObject = localStringBuilder.append((String)localObject);
            str = "\r\n";
            ((StringBuilder)localObject).append(str);
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = localStringBuilder.append(" ");
        str = arrayOfString[i];
        localObject = ((StringBuilder)localObject).append(str);
        str = "\r\n";
        ((StringBuilder)localObject).append(str);
        continue;
        localObject = arrayOfString[i];
        localObject = localStringBuilder.append((String)localObject);
        str = "\r\n";
        ((StringBuilder)localObject).append(str);
      }
    }
    return localStringBuilder.toString();
  }
  
  public boolean parse(String paramString, VDataBuilder paramVDataBuilder)
  {
    return parse(paramString, "US-ASCII", paramVDataBuilder);
  }
  
  public boolean parse(String paramString1, String paramString2, VDataBuilder paramVDataBuilder)
  {
    paramString1 = verifyVCard(paramString1);
    Object localObject1 = this.mParser;
    Object localObject2 = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = paramString1.getBytes(paramString2);
    ((ByteArrayInputStream)localObject2).<init>(arrayOfByte);
    boolean bool1 = ((VCardParser_V21)localObject1).parse((InputStream)localObject2, paramString2, paramVDataBuilder);
    if (!bool1)
    {
      localObject1 = this.mVersion;
      localObject2 = "vcard2.1";
      bool2 = ((String)localObject1).equals(localObject2);
      if (bool2)
      {
        localObject1 = "vcard3.0";
        setVersion((String)localObject1);
      }
    }
    for (boolean bool2 = parse(paramString1, paramVDataBuilder);; bool2 = true)
    {
      return bool2;
      localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      ((VCardException)localObject1).<init>("parse failed.(even use 3.0 parser)");
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/VCardParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */