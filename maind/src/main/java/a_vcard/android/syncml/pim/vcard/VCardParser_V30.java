package a_vcard.android.syncml.pim.vcard;

import a_vcard.android.syncml.pim.VBuilder;
import a_vcard.android.util.Log;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class VCardParser_V30
  extends VCardParser_V21
{
  private static final String LOG_TAG = "VCardParser_V30";
  private static final HashSet acceptablePropsWithParam;
  private static final HashSet acceptablePropsWithoutParam;
  private static final HashSet sAcceptableEncodingV30;
  private String mPreviousLine;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[28];
    localObject[0] = "BEGIN";
    localObject[m] = "LOGO";
    localObject[k] = "PHOTO";
    localObject[j] = "LABEL";
    localObject[i] = "FN";
    localObject[5] = "TITLE";
    localObject[6] = "SOUND";
    localObject[7] = "VERSION";
    localObject[8] = "TEL";
    localObject[9] = "EMAIL";
    localObject[10] = "TZ";
    localObject[11] = "GEO";
    localObject[12] = "NOTE";
    localObject[13] = "URL";
    localObject[14] = "BDAY";
    localObject[15] = "ROLE";
    localObject[16] = "REV";
    localObject[17] = "UID";
    localObject[18] = "KEY";
    localObject[19] = "MAILER";
    localObject[20] = "NAME";
    localObject[21] = "PROFILE";
    localObject[22] = "SOURCE";
    localObject[23] = "NICKNAME";
    localObject[24] = "CLASS";
    localObject[25] = "SORT-STRING";
    localObject[26] = "CATEGORIES";
    localObject[27] = "PRODID";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    acceptablePropsWithParam = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[i];
    localObject[0] = "7BIT";
    localObject[m] = "8BIT";
    localObject[k] = "BASE64";
    localObject[j] = "B";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    sAcceptableEncodingV30 = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    acceptablePropsWithoutParam = localHashSet;
  }
  
  protected String getBase64(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    for (;;)
    {
      String str = getLine();
      Object localObject;
      if (str == null)
      {
        localObject = new a_vcard/android/syncml/pim/vcard/VCardException;
        ((VCardException)localObject).<init>("File ended during parsing BASE64 binary");
        throw ((Throwable)localObject);
      }
      int i = str.length();
      if (i == 0) {}
      for (;;)
      {
        return localStringBuilder.toString();
        localObject = " ";
        boolean bool = str.startsWith((String)localObject);
        if (bool) {
          break;
        }
        localObject = "\t";
        bool = str.startsWith((String)localObject);
        if (bool) {
          break;
        }
        this.mPreviousLine = str;
      }
      localStringBuilder.append(str);
    }
  }
  
  protected String getLine()
  {
    Object localObject = this.mPreviousLine;
    String str;
    if (localObject != null)
    {
      str = this.mPreviousLine;
      localObject = null;
      this.mPreviousLine = null;
    }
    for (;;)
    {
      return str;
      localObject = this.mReader;
      str = ((BufferedReader)localObject).readLine();
    }
  }
  
  protected String getNonEmptyLine()
  {
    int i = 1;
    StringBuilder localStringBuilder = null;
    Object localObject = this.mReader;
    String str1 = ((BufferedReader)localObject).readLine();
    String str2;
    if (str1 == null) {
      if (localStringBuilder != null) {
        str2 = localStringBuilder.toString();
      }
    }
    for (;;)
    {
      return str2;
      localObject = this.mPreviousLine;
      if (localObject != null)
      {
        str2 = this.mPreviousLine;
        this.mPreviousLine = null;
      }
      else
      {
        localObject = new a_vcard/android/syncml/pim/vcard/VCardException;
        ((VCardException)localObject).<init>("Reached end of buffer.");
        throw ((Throwable)localObject);
        int j = str1.length();
        if (j == 0)
        {
          if (localStringBuilder != null)
          {
            str2 = localStringBuilder.toString();
            continue;
          }
          localObject = this.mPreviousLine;
          if (localObject == null) {
            break;
          }
          str2 = this.mPreviousLine;
          this.mPreviousLine = null;
          continue;
        }
        j = str1.charAt(0);
        int k = 32;
        if (j != k)
        {
          j = str1.charAt(0);
          k = 9;
          if (j != k) {}
        }
        else
        {
          if (localStringBuilder != null)
          {
            localObject = str1.substring(i);
            localStringBuilder.append((String)localObject);
            break;
          }
          localObject = this.mPreviousLine;
          if (localObject != null)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject = this.mPreviousLine;
            localStringBuilder.append((String)localObject);
            this.mPreviousLine = null;
            localObject = str1.substring(i);
            localStringBuilder.append((String)localObject);
            break;
          }
          localObject = new a_vcard/android/syncml/pim/vcard/VCardException;
          ((VCardException)localObject).<init>("Space exists at the beginning of the line");
          throw ((Throwable)localObject);
        }
        localObject = this.mPreviousLine;
        if (localObject == null)
        {
          this.mPreviousLine = str1;
          if (localStringBuilder == null) {
            break;
          }
          str2 = localStringBuilder.toString();
          continue;
        }
        str2 = this.mPreviousLine;
        this.mPreviousLine = str1;
      }
    }
  }
  
  protected String getVersion()
  {
    return "3.0";
  }
  
  protected void handleAgent(String paramString)
  {
    VCardException localVCardException = new a_vcard/android/syncml/pim/vcard/VCardException;
    localVCardException.<init>("AGENT in vCard 3.0 is not supported yet.");
    throw localVCardException;
  }
  
  protected void handleAnyParam(String paramString1, String paramString2)
  {
    super.handleAnyParam(paramString1, paramString2);
  }
  
  protected void handleParams(String paramString)
  {
    int i = 2;
    try
    {
      super.handleParams(paramString);
      return;
    }
    catch (VCardException localVCardException)
    {
      for (;;)
      {
        localObject1 = "=";
        String[] arrayOfString = paramString.split((String)localObject1, i);
        int j = arrayOfString.length;
        if (j != i) {
          break;
        }
        j = 0;
        localObject1 = arrayOfString[0];
        i = 1;
        localObject2 = arrayOfString[i];
        handleAnyParam((String)localObject1, (String)localObject2);
      }
      Object localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown params value: " + paramString;
      ((VCardException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  protected void handleType(String paramString)
  {
    String[] arrayOfString1 = paramString.split(",");
    Object localObject = this.mBuilder;
    String str1 = "TYPE";
    ((VBuilder)localObject).propertyParamType(str1);
    String[] arrayOfString2 = arrayOfString1;
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString2[j];
      int k = str2.length();
      int m = 2;
      if (k >= m)
      {
        localObject = "\"";
        boolean bool = str2.startsWith((String)localObject);
        if (bool)
        {
          localObject = "\"";
          bool = str2.endsWith((String)localObject);
          if (bool)
          {
            localObject = this.mBuilder;
            int n = 1;
            int i1 = str2.length() + -1;
            str1 = str2.substring(n, i1);
            ((VBuilder)localObject).propertyParamValue(str1);
          }
        }
      }
      for (;;)
      {
        j += 1;
        break;
        localObject = this.mBuilder;
        ((VBuilder)localObject).propertyParamValue(str2);
      }
    }
  }
  
  protected boolean isValidEncoding(String paramString)
  {
    HashSet localHashSet = sAcceptableEncodingV30;
    String str = paramString.toUpperCase();
    return localHashSet.contains(str);
  }
  
  protected boolean isValidPropertyName(String paramString)
  {
    Object localObject1 = acceptablePropsWithParam;
    boolean bool = ((HashSet)localObject1).contains(paramString);
    if (!bool)
    {
      localObject1 = acceptablePropsWithoutParam;
      bool = ((HashSet)localObject1).contains(paramString);
      if (!bool)
      {
        localObject1 = "X-";
        bool = paramString.startsWith((String)localObject1);
        if (!bool)
        {
          localObject1 = this.mWarningValueMap;
          bool = ((HashSet)localObject1).contains(paramString);
          if (!bool)
          {
            this.mWarningValueMap.add(paramString);
            localObject1 = "VCardParser_V30";
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "Property name unsupported by vCard 3.0: ";
            localObject2 = str + paramString;
            Log.w((String)localObject1, (String)localObject2);
          }
        }
      }
    }
    return true;
  }
  
  protected String maybeUnescape(char paramChar)
  {
    char c = 'n';
    if (paramChar != c)
    {
      c = 'N';
      if (paramChar != c) {
        break label22;
      }
    }
    label22:
    for (String str = "\r\n";; str = String.valueOf(paramChar)) {
      return str;
    }
  }
  
  protected String maybeUnescapeText(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      char c2 = '\\';
      int m;
      if (c1 == c2)
      {
        int k = i + -1;
        if (j < k)
        {
          j += 1;
          m = paramString.charAt(j);
          k = 110;
          if (m != k)
          {
            k = 78;
            if (m != k) {}
          }
          else
          {
            String str = "\r\n";
            localStringBuilder.append(str);
          }
        }
      }
      for (;;)
      {
        j += 1;
        break;
        localStringBuilder.append(m);
        continue;
        localStringBuilder.append(c1);
      }
    }
    return localStringBuilder.toString();
  }
  
  protected boolean readBeginVCard(boolean paramBoolean)
  {
    return super.readBeginVCard(paramBoolean);
  }
  
  protected void readEndVCard(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.readEndVCard(paramBoolean1, paramBoolean2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/VCardParser_V30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */