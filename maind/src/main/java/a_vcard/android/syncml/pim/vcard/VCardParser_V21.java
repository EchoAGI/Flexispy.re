package a_vcard.android.syncml.pim.vcard;

import a_vcard.android.syncml.pim.VBuilder;
import a_vcard.android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class VCardParser_V21
{
  public static final String DEFAULT_CHARSET = "UTF-8";
  private static final String LOG_TAG = "VCardParser_V21";
  private static final int STATE_GROUP_OR_PROPNAME = 0;
  private static final int STATE_PARAMS = 1;
  private static final int STATE_PARAMS_IN_DQUOTE = 2;
  private static final HashSet sAvailableEncodingV21;
  private static final HashSet sAvailablePropertyNameV21;
  private static final HashSet sKnownTypeSet;
  private static final HashSet sKnownValueSet;
  protected VBuilder mBuilder = null;
  private boolean mCanceled;
  protected String mEncoding = null;
  private int mNestCount;
  private String mPreviousLine;
  protected BufferedReader mReader;
  private long mTimeEndProperty;
  private long mTimeEndRecord;
  private long mTimeHandlePropertyValue1;
  private long mTimeHandlePropertyValue2;
  private long mTimeHandlePropertyValue3;
  private long mTimeParseItem1;
  private long mTimeParseItem2;
  private long mTimeParseItem3;
  private long mTimeParseItems;
  private long mTimeStartProperty;
  private long mTimeStartRecord;
  private long mTimeTotal;
  protected HashSet mWarningValueMap;
  protected final String sDefaultEncoding = "8BIT";
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[50];
    localObject[0] = "DOM";
    localObject[m] = "INTL";
    localObject[k] = "POSTAL";
    localObject[j] = "PARCEL";
    localObject[i] = "HOME";
    localObject[5] = "WORK";
    localObject[6] = "PREF";
    localObject[7] = "VOICE";
    localObject[8] = "FAX";
    localObject[9] = "MSG";
    localObject[10] = "CELL";
    localObject[11] = "PAGER";
    localObject[12] = "BBS";
    localObject[13] = "MODEM";
    localObject[14] = "CAR";
    localObject[15] = "ISDN";
    localObject[16] = "VIDEO";
    localObject[17] = "AOL";
    localObject[18] = "APPLELINK";
    localObject[19] = "ATTMAIL";
    localObject[20] = "CIS";
    localObject[21] = "EWORLD";
    localObject[22] = "INTERNET";
    localObject[23] = "IBMMAIL";
    localObject[24] = "MCIMAIL";
    localObject[25] = "POWERSHARE";
    localObject[26] = "PRODIGY";
    localObject[27] = "TLX";
    localObject[28] = "X400";
    localObject[29] = "GIF";
    localObject[30] = "CGM";
    localObject[31] = "WMF";
    localObject[32] = "BMP";
    localObject[33] = "MET";
    localObject[34] = "PMB";
    localObject[35] = "DIB";
    localObject[36] = "PICT";
    localObject[37] = "TIFF";
    localObject[38] = "PDF";
    localObject[39] = "PS";
    localObject[40] = "JPEG";
    localObject[41] = "QTIME";
    localObject[42] = "MPEG";
    localObject[43] = "MPEG2";
    localObject[44] = "AVI";
    localObject[45] = "WAVE";
    localObject[46] = "AIFF";
    localObject[47] = "PCM";
    localObject[48] = "X509";
    localObject[49] = "PGP";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    sKnownTypeSet = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[i];
    localObject[0] = "INLINE";
    localObject[m] = "URL";
    localObject[k] = "CONTENT-ID";
    localObject[j] = "CID";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    sKnownValueSet = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[20];
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
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    sAvailablePropertyNameV21 = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[5];
    localObject[0] = "7BIT";
    localObject[m] = "8BIT";
    localObject[k] = "QUOTED-PRINTABLE";
    localObject[j] = "BASE64";
    localObject[i] = "B";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    sAvailableEncodingV21 = localHashSet;
  }
  
  public VCardParser_V21()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.mWarningValueMap = localHashSet;
  }
  
  public VCardParser_V21(VCardSourceDetector paramVCardSourceDetector)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.mWarningValueMap = localHashSet;
    if (paramVCardSourceDetector != null)
    {
      i = paramVCardSourceDetector.getType();
      int j = 3;
      if (i == j)
      {
        i = 1;
        this.mNestCount = i;
      }
    }
  }
  
  private boolean isLetter(char paramChar)
  {
    char c = 'a';
    if (paramChar >= c)
    {
      c = 'z';
      if (paramChar <= c) {}
    }
    else
    {
      c = 'A';
      if (paramChar < c) {
        break label36;
      }
      c = 'Z';
      if (paramChar > c) {
        break label36;
      }
    }
    label36:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  private boolean parseOneVCard(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    VBuilder localVBuilder1 = null;
    boolean bool3 = false;
    int j;
    boolean bool4;
    if (paramBoolean)
    {
      int i = this.mNestCount;
      if (i > 0)
      {
        j = 0;
        i = this.mNestCount;
        if (j < i)
        {
          bool4 = readBeginVCard(bool3);
          if (bool4) {}
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool3 = true;
      j += 1;
      break;
      bool4 = readBeginVCard(bool3);
      if (bool4)
      {
        VBuilder localVBuilder2 = this.mBuilder;
        if (localVBuilder2 != null)
        {
          l1 = System.currentTimeMillis();
          localVBuilder2 = this.mBuilder;
          String str = "VCARD";
          localVBuilder2.startRecord(str);
          l2 = this.mTimeStartRecord;
          l3 = System.currentTimeMillis() - l1;
          l2 += l3;
          this.mTimeStartRecord = l2;
        }
        long l1 = System.currentTimeMillis();
        parseItems();
        long l2 = this.mTimeParseItems;
        long l3 = System.currentTimeMillis() - l1;
        l2 += l3;
        this.mTimeParseItems = l2;
        readEndVCard(bool1, false);
        localVBuilder1 = this.mBuilder;
        if (localVBuilder1 != null)
        {
          l1 = System.currentTimeMillis();
          localVBuilder1 = this.mBuilder;
          localVBuilder1.endRecord();
          l2 = this.mTimeEndRecord;
          l3 = System.currentTimeMillis() - l1;
          l2 += l3;
          this.mTimeEndRecord = l2;
        }
        bool2 = bool1;
      }
    }
  }
  
  public void cancel()
  {
    this.mCanceled = true;
  }
  
  protected String getBase64(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    for (;;)
    {
      String str = getLine();
      if (str == null)
      {
        VCardException localVCardException = new a_vcard/android/syncml/pim/vcard/VCardException;
        localVCardException.<init>("File ended during parsing BASE64 binary");
        throw localVCardException;
      }
      int i = str.length();
      if (i == 0) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append(str);
    }
  }
  
  protected String getLine()
  {
    return this.mReader.readLine();
  }
  
  protected String getNonEmptyLine()
  {
    String str;
    int i;
    do
    {
      str = getLine();
      if (str == null)
      {
        localObject = new a_vcard/android/syncml/pim/vcard/VCardException;
        ((VCardException)localObject).<init>("Reached end of buffer.");
        throw ((Throwable)localObject);
      }
      Object localObject = str.trim();
      i = ((String)localObject).length();
    } while (i <= 0);
    return str;
  }
  
  protected String getQuotedPrintable(String paramString)
  {
    int i = 61;
    Object localObject = paramString.trim();
    String str1 = "=";
    boolean bool1 = ((String)localObject).endsWith(str1);
    if (bool1)
    {
      int j = paramString.length();
      int m = j + -1;
      do
      {
        j = paramString.charAt(m);
      } while (j != i);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      j = m + 1;
      localObject = paramString.substring(0, j);
      localStringBuilder.append((String)localObject);
      localObject = "\r\n";
      localStringBuilder.append((String)localObject);
      String str2;
      for (;;)
      {
        str2 = getLine();
        if (str2 == null)
        {
          localObject = new a_vcard/android/syncml/pim/vcard/VCardException;
          ((VCardException)localObject).<init>("File ended during parsing quoted-printable String");
          throw ((Throwable)localObject);
        }
        localObject = str2.trim();
        str1 = "=";
        boolean bool2 = ((String)localObject).endsWith(str1);
        if (!bool2) {
          break;
        }
        int k = str2.length();
        m = k + -1;
        do
        {
          k = str2.charAt(m);
        } while (k != i);
        k = m + 1;
        localObject = str2.substring(0, k);
        localStringBuilder.append((String)localObject);
        localObject = "\r\n";
        localStringBuilder.append((String)localObject);
      }
      localStringBuilder.append(str2);
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
  
  protected String getVersion()
  {
    return "2.1";
  }
  
  protected void handleAgent(String paramString)
  {
    VCardException localVCardException = new a_vcard/android/syncml/pim/vcard/VCardException;
    localVCardException.<init>("AGENT Property is not supported.");
    throw localVCardException;
  }
  
  protected void handleAnyParam(String paramString1, String paramString2)
  {
    VBuilder localVBuilder = this.mBuilder;
    if (localVBuilder != null)
    {
      this.mBuilder.propertyParamType(paramString1);
      localVBuilder = this.mBuilder;
      localVBuilder.propertyParamValue(paramString2);
    }
  }
  
  protected void handleCharset(String paramString)
  {
    VBuilder localVBuilder = this.mBuilder;
    if (localVBuilder != null)
    {
      localVBuilder = this.mBuilder;
      String str = "CHARSET";
      localVBuilder.propertyParamType(str);
      localVBuilder = this.mBuilder;
      localVBuilder.propertyParamValue(paramString);
    }
  }
  
  protected void handleEncoding(String paramString)
  {
    boolean bool = isValidEncoding(paramString);
    if (!bool)
    {
      localObject1 = "X-";
      bool = paramString.startsWith((String)localObject1);
      if (!bool) {}
    }
    else
    {
      localObject1 = this.mBuilder;
      if (localObject1 != null)
      {
        localObject1 = this.mBuilder;
        localObject2 = "ENCODING";
        ((VBuilder)localObject1).propertyParamType((String)localObject2);
        localObject1 = this.mBuilder;
        ((VBuilder)localObject1).propertyParamValue(paramString);
      }
      this.mEncoding = paramString;
      return;
    }
    Object localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unknown encoding \"" + paramString + "\"";
    ((VCardException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  protected void handleLanguage(String paramString)
  {
    int i = 1;
    Object localObject1 = "-";
    String[] arrayOfString = paramString.split((String)localObject1);
    int j = arrayOfString.length;
    int m = 2;
    Object localObject2;
    if (j > m)
    {
      localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid Language: \"" + paramString + "\"";
      ((VCardException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = 0;
    localObject1 = null;
    String str = arrayOfString[0];
    int n = str.length();
    int i1 = 0;
    while (i1 < n)
    {
      j = str.charAt(i1);
      boolean bool1 = isLetter(j);
      if (!bool1)
      {
        localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Invalid Language: \"" + paramString + "\"";
        ((VCardException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i1 += 1;
    }
    int k = arrayOfString.length;
    if (k > i)
    {
      str = arrayOfString[i];
      n = str.length();
      i1 = 0;
      while (i1 < n)
      {
        k = str.charAt(i1);
        boolean bool2 = isLetter(k);
        if (!bool2)
        {
          localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Invalid Language: \"" + paramString + "\"";
          ((VCardException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        i1 += 1;
      }
    }
    localObject1 = this.mBuilder;
    if (localObject1 != null)
    {
      localObject1 = this.mBuilder;
      localObject2 = "LANGUAGE";
      ((VBuilder)localObject1).propertyParamType((String)localObject2);
      localObject1 = this.mBuilder;
      ((VBuilder)localObject1).propertyParamValue(paramString);
    }
  }
  
  protected void handleMultiplePropertyValue(String paramString1, String paramString2)
  {
    Object localObject = this.mEncoding;
    String str1 = "QUOTED-PRINTABLE";
    boolean bool = ((String)localObject).equalsIgnoreCase(str1);
    if (bool) {
      paramString2 = getQuotedPrintable(paramString2);
    }
    localObject = this.mBuilder;
    if (localObject != null)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = paramString2.length();
      int k = 0;
      if (k < j)
      {
        int m = paramString2.charAt(k);
        int i = 92;
        if (m == i)
        {
          i = j + -1;
          if (k < i)
          {
            i = k + 1;
            char c = paramString2.charAt(i);
            String str2 = maybeUnescape(c);
            if (str2 != null)
            {
              localStringBuilder.append(str2);
              k += 1;
            }
          }
        }
        for (;;)
        {
          k += 1;
          break;
          localStringBuilder.append(m);
          continue;
          i = 59;
          if (m == i)
          {
            localObject = localStringBuilder.toString();
            localArrayList.add(localObject);
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
          }
          else
          {
            localStringBuilder.append(m);
          }
        }
      }
      localObject = localStringBuilder.toString();
      localArrayList.add(localObject);
      localObject = this.mBuilder;
      ((VBuilder)localObject).propertyValues(localArrayList);
    }
  }
  
  protected void handleParams(String paramString)
  {
    int i = 2;
    Object localObject1 = null;
    Object localObject2 = "=";
    String[] arrayOfString = paramString.split((String)localObject2, i);
    int j = arrayOfString.length;
    String str1;
    String str2;
    boolean bool;
    if (j == i)
    {
      str1 = arrayOfString[0].trim();
      str2 = arrayOfString[1].trim();
      localObject2 = "TYPE";
      bool = str1.equals(localObject2);
      if (bool) {
        handleType(str2);
      }
    }
    for (;;)
    {
      return;
      localObject2 = "VALUE";
      bool = str1.equals(localObject2);
      if (bool)
      {
        handleValue(str2);
      }
      else
      {
        localObject2 = "ENCODING";
        bool = str1.equals(localObject2);
        if (bool)
        {
          handleEncoding(str2);
        }
        else
        {
          localObject2 = "CHARSET";
          bool = str1.equals(localObject2);
          if (bool)
          {
            handleCharset(str2);
          }
          else
          {
            localObject2 = "LANGUAGE";
            bool = str1.equals(localObject2);
            if (bool)
            {
              handleLanguage(str2);
            }
            else
            {
              localObject2 = "X-";
              bool = str1.startsWith((String)localObject2);
              if (bool)
              {
                handleAnyParam(str1, str2);
              }
              else
              {
                localObject2 = new a_vcard/android/syncml/pim/vcard/VCardException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = "Unknown type \"" + str1 + "\"";
                ((VCardException)localObject2).<init>((String)localObject1);
                throw ((Throwable)localObject2);
                localObject2 = arrayOfString[0];
                handleType((String)localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  protected void handlePropertyValue(String paramString1, String paramString2)
  {
    Object localObject1 = this.mEncoding;
    Object localObject2 = "QUOTED-PRINTABLE";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    long l1;
    String str1;
    ArrayList localArrayList;
    long l2;
    long l3;
    if (bool)
    {
      l1 = System.currentTimeMillis();
      str1 = getQuotedPrintable(paramString2);
      localObject1 = this.mBuilder;
      if (localObject1 != null)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localArrayList.add(str1);
        localObject1 = this.mBuilder;
        ((VBuilder)localObject1).propertyValues(localArrayList);
      }
      l2 = this.mTimeHandlePropertyValue2;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
      this.mTimeHandlePropertyValue2 = l2;
    }
    for (;;)
    {
      return;
      localObject1 = this.mEncoding;
      localObject2 = "BASE64";
      bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool)
      {
        localObject1 = this.mEncoding;
        localObject2 = "B";
        bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
        if (!bool) {}
      }
      else
      {
        l1 = System.currentTimeMillis();
        try
        {
          str1 = getBase64(paramString2);
          localObject1 = this.mBuilder;
          if (localObject1 != null)
          {
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            localArrayList.add(str1);
            localObject1 = this.mBuilder;
            ((VBuilder)localObject1).propertyValues(localArrayList);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          for (;;)
          {
            localObject2 = "OutOfMemoryError happened during parsing BASE64 data!";
            Log.e("VCardParser_V21", (String)localObject2);
            localObject1 = this.mBuilder;
            if (localObject1 != null)
            {
              localObject1 = this.mBuilder;
              localObject2 = null;
              ((VBuilder)localObject1).propertyValues(null);
            }
          }
        }
        l2 = this.mTimeHandlePropertyValue3;
        l3 = System.currentTimeMillis() - l1;
        l2 += l3;
        this.mTimeHandlePropertyValue3 = l2;
        continue;
      }
      localObject1 = this.mEncoding;
      if (localObject1 != null)
      {
        localObject1 = this.mEncoding;
        localObject2 = "7BIT";
        bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
        if (!bool)
        {
          localObject1 = this.mEncoding;
          localObject2 = "8BIT";
          bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
          if (!bool)
          {
            localObject1 = this.mEncoding.toUpperCase();
            localObject2 = "X-";
            bool = ((String)localObject1).startsWith((String)localObject2);
            if (!bool)
            {
              localObject1 = "VCardParser_V21";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("The encoding unsupported by vCard spec: \"");
              String str2 = this.mEncoding;
              localObject2 = ((StringBuilder)localObject2).append(str2);
              str2 = "\".";
              localObject2 = str2;
              Log.w((String)localObject1, (String)localObject2);
            }
          }
        }
      }
      l1 = System.currentTimeMillis();
      localObject1 = this.mBuilder;
      if (localObject1 != null)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject1 = maybeUnescapeText(paramString2);
        localArrayList.add(localObject1);
        localObject1 = this.mBuilder;
        ((VBuilder)localObject1).propertyValues(localArrayList);
      }
      l2 = this.mTimeHandlePropertyValue1;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
      this.mTimeHandlePropertyValue1 = l2;
    }
  }
  
  protected void handleType(String paramString)
  {
    String str1 = paramString;
    Object localObject1 = sKnownTypeSet;
    boolean bool = ((HashSet)localObject1).contains(paramString);
    Object localObject2;
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
          localObject1 = "VCardParser_V21";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str2 = "Type unsupported by vCard 2.1: ";
          localObject2 = str2 + paramString;
          Log.w((String)localObject1, (String)localObject2);
        }
      }
    }
    localObject1 = this.mBuilder;
    if (localObject1 != null)
    {
      localObject1 = this.mBuilder;
      localObject2 = "TYPE";
      ((VBuilder)localObject1).propertyParamType((String)localObject2);
      localObject1 = this.mBuilder;
      ((VBuilder)localObject1).propertyParamValue(str1);
    }
  }
  
  protected void handleValue(String paramString)
  {
    Object localObject1 = sKnownValueSet;
    Object localObject2 = paramString.toUpperCase();
    boolean bool = ((HashSet)localObject1).contains(localObject2);
    if (!bool)
    {
      localObject1 = "X-";
      bool = paramString.startsWith((String)localObject1);
      if (!bool) {}
    }
    else
    {
      localObject1 = this.mBuilder;
      if (localObject1 != null)
      {
        localObject1 = this.mBuilder;
        localObject2 = "VALUE";
        ((VBuilder)localObject1).propertyParamType((String)localObject2);
        localObject1 = this.mBuilder;
        ((VBuilder)localObject1).propertyParamValue(paramString);
      }
      return;
    }
    localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unknown value \"" + paramString + "\"";
    ((VCardException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  protected boolean isValidEncoding(String paramString)
  {
    HashSet localHashSet = sAvailableEncodingV21;
    String str = paramString.toUpperCase();
    return localHashSet.contains(str);
  }
  
  protected boolean isValidPropertyName(String paramString)
  {
    Object localObject1 = sAvailablePropertyNameV21;
    Object localObject2 = paramString.toUpperCase();
    boolean bool = ((HashSet)localObject1).contains(localObject2);
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
          localObject1 = "VCardParser_V21";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Property name unsupported by vCard 2.1: ";
          localObject2 = str + paramString;
          Log.w((String)localObject1, (String)localObject2);
        }
      }
    }
    return true;
  }
  
  protected String maybeUnescape(char paramChar)
  {
    char c = '\\';
    if (paramChar != c)
    {
      c = ';';
      if (paramChar != c)
      {
        c = ':';
        if (paramChar != c)
        {
          c = ',';
          if (paramChar != c) {
            break label39;
          }
        }
      }
    }
    for (String str = String.valueOf(paramChar);; str = null)
    {
      return str;
      label39:
      c = '\000';
    }
  }
  
  protected String maybeUnescapeText(String paramString)
  {
    return paramString;
  }
  
  public void parse(InputStream paramInputStream, String paramString, VBuilder paramVBuilder, boolean paramBoolean)
  {
    this.mCanceled = paramBoolean;
    parse(paramInputStream, paramString, paramVBuilder);
  }
  
  public boolean parse(InputStream paramInputStream, VBuilder paramVBuilder)
  {
    return parse(paramInputStream, "UTF-8", paramVBuilder);
  }
  
  public boolean parse(InputStream paramInputStream, String paramString, VBuilder paramVBuilder)
  {
    Object localObject = new a_vcard/android/syncml/pim/vcard/CustomBufferedReader;
    InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
    localInputStreamReader.<init>(paramInputStream, paramString);
    ((CustomBufferedReader)localObject).<init>(localInputStreamReader);
    this.mReader = ((BufferedReader)localObject);
    this.mBuilder = paramVBuilder;
    long l1 = System.currentTimeMillis();
    localObject = this.mBuilder;
    if (localObject != null)
    {
      localObject = this.mBuilder;
      ((VBuilder)localObject).start();
    }
    parseVCardFile();
    localObject = this.mBuilder;
    if (localObject != null)
    {
      localObject = this.mBuilder;
      ((VBuilder)localObject).end();
    }
    long l2 = this.mTimeTotal;
    long l3 = System.currentTimeMillis() - l1;
    l2 += l3;
    this.mTimeTotal = l2;
    return true;
  }
  
  protected boolean parseItem()
  {
    boolean bool = true;
    Object localObject1 = null;
    String str1 = "8BIT";
    this.mEncoding = str1;
    String str2 = getNonEmptyLine();
    long l1 = System.currentTimeMillis();
    String[] arrayOfString = separateLineAndHandleGroup(str2);
    if (arrayOfString == null) {}
    String str3;
    for (;;)
    {
      return bool;
      int i = arrayOfString.length;
      int j = 2;
      if (i != j)
      {
        localObject2 = new a_vcard/android/syncml/pim/vcard/VCardException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "Invalid line \"" + str2 + "\"";
        ((VCardException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      str1 = arrayOfString[0];
      str3 = str1.toUpperCase();
      String str4 = arrayOfString[bool];
      long l2 = this.mTimeParseItem1;
      long l3 = System.currentTimeMillis() - l1;
      l2 += l3;
      this.mTimeParseItem1 = l2;
      localObject2 = "ADR";
      bool = str3.equals(localObject2);
      if (!bool)
      {
        localObject2 = "ORG";
        bool = str3.equals(localObject2);
        if (!bool)
        {
          localObject2 = "N";
          bool = str3.equals(localObject2);
          if (!bool) {
            break label241;
          }
        }
      }
      l1 = System.currentTimeMillis();
      handleMultiplePropertyValue(str3, str4);
      l2 = this.mTimeParseItem3;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
      this.mTimeParseItem3 = l2;
      bool = false;
      localObject2 = null;
      continue;
      label241:
      localObject2 = "AGENT";
      bool = str3.equals(localObject2);
      if (bool)
      {
        handleAgent(str4);
        bool = false;
        localObject2 = null;
      }
      else
      {
        bool = isValidPropertyName(str3);
        if (!bool) {
          break;
        }
        localObject2 = "BEGIN";
        bool = str3.equals(localObject2);
        if (bool)
        {
          localObject2 = "VCARD";
          bool = str4.equals(localObject2);
          if (bool)
          {
            localObject2 = new a_vcard/android/syncml/pim/vcard/VCardNestedException;
            ((VCardNestedException)localObject2).<init>("This vCard has nested vCard data in it.");
            throw ((Throwable)localObject2);
          }
          localObject2 = new a_vcard/android/syncml/pim/vcard/VCardException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = "Unknown BEGIN type: " + str4;
          ((VCardException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        localObject2 = "VERSION";
        bool = str3.equals(localObject2);
        if (bool)
        {
          localObject2 = getVersion();
          bool = str4.equals(localObject2);
          if (!bool)
          {
            localObject2 = new a_vcard/android/syncml/pim/vcard/VCardVersionException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append("Incompatible version: ").append(str4).append(" != ");
            str1 = getVersion();
            localObject1 = str1;
            ((VCardVersionException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
        }
        l1 = System.currentTimeMillis();
        handlePropertyValue(str3, str4);
        l2 = this.mTimeParseItem2;
        l3 = System.currentTimeMillis() - l1;
        l2 += l3;
        this.mTimeParseItem2 = l2;
        bool = false;
        localObject2 = null;
      }
    }
    Object localObject2 = new a_vcard/android/syncml/pim/vcard/VCardException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Unknown property name: \"" + str3 + "\"";
    ((VCardException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  protected void parseItems()
  {
    boolean bool = false;
    VBuilder localVBuilder = this.mBuilder;
    long l1;
    long l2;
    long l3;
    if (localVBuilder != null)
    {
      l1 = System.currentTimeMillis();
      localVBuilder = this.mBuilder;
      localVBuilder.startProperty();
      l2 = this.mTimeStartProperty;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
      this.mTimeStartProperty = l2;
    }
    bool = parseItem();
    localVBuilder = this.mBuilder;
    if ((localVBuilder != null) && (!bool))
    {
      l1 = System.currentTimeMillis();
      localVBuilder = this.mBuilder;
      localVBuilder.endProperty();
      l2 = this.mTimeEndProperty;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
    }
    for (this.mTimeEndProperty = l2; !bool; this.mTimeEndProperty = l2)
    {
      label111:
      localVBuilder = this.mBuilder;
      if (localVBuilder != null)
      {
        l1 = System.currentTimeMillis();
        localVBuilder = this.mBuilder;
        localVBuilder.startProperty();
        l2 = this.mTimeStartProperty;
        l3 = System.currentTimeMillis() - l1;
        l2 += l3;
        this.mTimeStartProperty = l2;
      }
      bool = parseItem();
      localVBuilder = this.mBuilder;
      if ((localVBuilder == null) || (bool)) {
        break label111;
      }
      l1 = System.currentTimeMillis();
      localVBuilder = this.mBuilder;
      localVBuilder.endProperty();
      l2 = this.mTimeEndProperty;
      l3 = System.currentTimeMillis() - l1;
      l2 += l3;
    }
  }
  
  protected void parseVCardFile()
  {
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = this.mCanceled;
      if (bool2) {}
      boolean bool3;
      do
      {
        int i = this.mNestCount;
        if (i <= 0) {
          break;
        }
        boolean bool4 = true;
        int j = 0;
        for (;;)
        {
          i = this.mNestCount;
          if (j >= i) {
            break;
          }
          i = 1;
          readEndVCard(bool4, i);
          bool4 = false;
          int k;
          j += 1;
        }
        bool3 = parseOneVCard(bool1);
      } while (!bool3);
    }
  }
  
  protected boolean readBeginVCard(boolean paramBoolean)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = false;
    VCardException localVCardException = null;
    label152:
    label201:
    do
    {
      String str1 = getLine();
      if (str1 == null) {}
      for (;;)
      {
        return bool1;
        String str2 = str1.trim();
        int k = str2.length();
        if (k <= 0) {
          break;
        }
        str2 = ":";
        String[] arrayOfString = str1.split(str2, i);
        int m = arrayOfString.length;
        if (m == i)
        {
          str2 = arrayOfString[0].trim();
          String str3 = "BEGIN";
          boolean bool2 = str2.equalsIgnoreCase(str3);
          if (bool2)
          {
            str2 = arrayOfString[j].trim();
            str3 = "VCARD";
            bool2 = str2.equalsIgnoreCase(str3);
            if (bool2)
            {
              bool1 = j;
              continue;
            }
          }
        }
        if (paramBoolean) {
          break label201;
        }
        j = this.mNestCount;
        if (j <= 0) {
          break label152;
        }
        this.mPreviousLine = str1;
      }
      localVCardException = new a_vcard/android/syncml/pim/vcard/VCardException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Expected String \"BEGIN:VCARD\" did not come (Instead, \"" + str1 + "\" came)";
      localVCardException.<init>((String)localObject);
      throw localVCardException;
    } while (paramBoolean);
    localVCardException = new a_vcard/android/syncml/pim/vcard/VCardException;
    localVCardException.<init>("Reached where must not be reached.");
    throw localVCardException;
  }
  
  protected void readEndVCard(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 2;
    String str1;
    label12:
    Object localObject1;
    Object localObject2;
    if (paramBoolean1)
    {
      str1 = this.mPreviousLine;
      localObject1 = ":";
      String[] arrayOfString = str1.split((String)localObject1, i);
      int j = arrayOfString.length;
      if (j != i) {
        break label144;
      }
      localObject1 = arrayOfString[0].trim();
      localObject2 = "END";
      boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool) {
        break label144;
      }
      localObject1 = arrayOfString[1].trim();
      localObject2 = "VCARD";
      bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool) {
        break label144;
      }
    }
    for (;;)
    {
      return;
      int k;
      do
      {
        str1 = getLine();
        if (str1 == null)
        {
          localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
          ((VCardException)localObject1).<init>("Expected END:VCARD was not found.");
          throw ((Throwable)localObject1);
        }
        localObject1 = str1.trim();
        k = ((String)localObject1).length();
      } while (k <= 0);
      break label12;
      label144:
      if (!paramBoolean2)
      {
        localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("END:VCARD != \"");
        String str2 = this.mPreviousLine;
        localObject2 = str2 + "\"";
        ((VCardException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      paramBoolean1 = false;
      if (paramBoolean2) {
        break;
      }
    }
  }
  
  protected String[] separateLineAndHandleGroup(String paramString)
  {
    int i = 59;
    int j = 58;
    int k = 34;
    int m = 1;
    int n = paramString.length();
    int i1 = 0;
    int i2 = 0;
    int i3 = 2;
    String[] arrayOfString = new String[i3];
    int i6 = 0;
    if (i6 < n)
    {
      int i7 = paramString.charAt(i6);
      switch (i1)
      {
      }
      for (;;)
      {
        i6 += 1;
        break;
        String str1;
        if (i7 == j)
        {
          str1 = paramString.substring(i2, i6);
          localObject1 = "END";
          boolean bool1 = str1.equalsIgnoreCase((String)localObject1);
          if (bool1)
          {
            this.mPreviousLine = paramString;
            arrayOfString = null;
          }
        }
        for (;;)
        {
          return arrayOfString;
          localObject1 = this.mBuilder;
          if (localObject1 != null)
          {
            localObject1 = this.mBuilder;
            ((VBuilder)localObject1).propertyName(str1);
          }
          arrayOfString[0] = str1;
          int i4 = n + -1;
          if (i6 < i4)
          {
            i4 = i6 + 1;
            localObject1 = paramString.substring(i4);
            arrayOfString[m] = localObject1;
          }
          else
          {
            localObject1 = "";
            arrayOfString[m] = localObject1;
            continue;
            i4 = 46;
            if (i7 == i4)
            {
              String str2 = paramString.substring(i2, i6);
              localObject1 = this.mBuilder;
              if (localObject1 != null)
              {
                localObject1 = this.mBuilder;
                ((VBuilder)localObject1).propertyGroup(str2);
              }
              i2 = i6 + 1;
              break;
            }
            if (i7 != i) {
              break;
            }
            str1 = paramString.substring(i2, i6);
            localObject1 = "END";
            boolean bool2 = str1.equalsIgnoreCase((String)localObject1);
            if (bool2)
            {
              this.mPreviousLine = paramString;
              arrayOfString = null;
            }
            else
            {
              localObject1 = this.mBuilder;
              if (localObject1 != null)
              {
                localObject1 = this.mBuilder;
                ((VBuilder)localObject1).propertyName(str1);
              }
              arrayOfString[0] = str1;
              i2 = i6 + 1;
              i1 = 1;
              break;
              if (i7 == k)
              {
                i1 = 2;
                break;
              }
              if (i7 == i)
              {
                localObject1 = paramString.substring(i2, i6);
                handleParams((String)localObject1);
                i2 = i6 + 1;
                break;
              }
              if (i7 != j) {
                break;
              }
              localObject1 = paramString.substring(i2, i6);
              handleParams((String)localObject1);
              int i5 = n + -1;
              if (i6 < i5)
              {
                i5 = i6 + 1;
                localObject1 = paramString.substring(i5);
                arrayOfString[m] = localObject1;
              }
              else
              {
                localObject1 = "";
                arrayOfString[m] = localObject1;
              }
            }
          }
        }
        if (i7 == k) {
          i1 = 1;
        }
      }
    }
    Object localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Invalid line: \"" + paramString + "\"";
    ((VCardException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void showDebugInfo()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("total parsing time:  ");
    long l1 = this.mTimeTotal;
    localObject1 = ((StringBuilder)localObject1).append(l1);
    Object localObject2 = " ms";
    localObject1 = (String)localObject2;
    Log.d("VCardParser_V21", (String)localObject1);
    Object localObject3 = this.mReader;
    boolean bool = localObject3 instanceof CustomBufferedReader;
    if (bool)
    {
      localObject1 = "VCardParser_V21";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append("total readLine time: ");
      long l2 = ((CustomBufferedReader)this.mReader).getTotalmillisecond();
      localObject3 = ((StringBuilder)localObject2).append(l2);
      localObject2 = " ms";
      localObject3 = (String)localObject2;
      Log.d((String)localObject1, (String)localObject3);
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeStartRecord: ");
    l1 = this.mTimeStartRecord;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeEndRecord: ");
    l1 = this.mTimeEndRecord;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeParseItem1: ");
    l1 = this.mTimeParseItem1;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeParseItem2: ");
    l1 = this.mTimeParseItem2;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeParseItem3: ");
    l1 = this.mTimeParseItem3;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeHandlePropertyValue1: ");
    l1 = this.mTimeHandlePropertyValue1;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeHandlePropertyValue2: ");
    l1 = this.mTimeHandlePropertyValue2;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("mTimeHandlePropertyValue3: ");
    l1 = this.mTimeHandlePropertyValue3;
    localObject1 = l1 + " ms";
    Log.d("VCardParser_V21", (String)localObject1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/VCardParser_V21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */