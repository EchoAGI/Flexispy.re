package a_vcard.android.syncml.pim.vcard;

import a_vcard.android.syncml.pim.VBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VCardSourceDetector
  implements VBuilder
{
  private static Set APPLE_SIGNS;
  private static Set FOMA_SIGNS;
  private static Set JAPANESE_MOBILE_PHONE_SIGNS;
  static final int TYPE_APPLE = 1;
  static final int TYPE_FOMA = 3;
  private static String TYPE_FOMA_CHARSET_SIGN = "X-SD-CHAR_CODE";
  static final int TYPE_JAPANESE_MOBILE_PHONE = 2;
  static final int TYPE_UNKNOWN = 0;
  static final int TYPE_WINDOWS_MOBILE_JP = 4;
  private static Set WINDOWS_MOBILE_PHONE_SIGNS;
  private boolean mNeedParseSpecifiedCharset;
  private String mSpecifiedCharset;
  private int mType = 0;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[5];
    localObject[0] = "X-PHONETIC-FIRST-NAME";
    localObject[m] = "X-PHONETIC-MIDDLE-NAME";
    localObject[k] = "X-PHONETIC-LAST-NAME";
    localObject[j] = "X-ABADR";
    localObject[i] = "X-ABUID";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    APPLE_SIGNS = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[j];
    localObject[0] = "X-GNO";
    localObject[m] = "X-GN";
    localObject[k] = "X-REDUCTION";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    JAPANESE_MOBILE_PHONE_SIGNS = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[j];
    localObject[0] = "X-MICROSOFT-ASST_TEL";
    localObject[m] = "X-MICROSOFT-ASSISTANT";
    localObject[k] = "X-MICROSOFT-OFFICELOC";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    WINDOWS_MOBILE_PHONE_SIGNS = localHashSet;
    localHashSet = new java/util/HashSet;
    localObject = new String[6];
    localObject[0] = "X-SD-VERN";
    localObject[m] = "X-SD-FORMAT_VER";
    localObject[k] = "X-SD-CATEGORIES";
    localObject[j] = "X-SD-CLASS";
    localObject[i] = "X-SD-DCREATED";
    localObject[5] = "X-SD-DESCRIPTION";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    FOMA_SIGNS = localHashSet;
  }
  
  public void end() {}
  
  public void endProperty() {}
  
  public void endRecord() {}
  
  public String getEstimatedCharset()
  {
    String str = this.mSpecifiedCharset;
    if (str != null) {
      str = this.mSpecifiedCharset;
    }
    for (;;)
    {
      return str;
      int i = this.mType;
      switch (i)
      {
      default: 
        i = 0;
        str = null;
        break;
      case 2: 
      case 3: 
      case 4: 
        str = "SHIFT_JIS";
        break;
      case 1: 
        str = "UTF-8";
      }
    }
  }
  
  int getType()
  {
    return this.mType;
  }
  
  public void propertyGroup(String paramString) {}
  
  public void propertyName(String paramString)
  {
    int i = 3;
    int j = 1;
    Object localObject = TYPE_FOMA_CHARSET_SIGN;
    boolean bool1 = paramString.equalsIgnoreCase((String)localObject);
    if (bool1)
    {
      this.mType = i;
      this.mNeedParseSpecifiedCharset = j;
    }
    for (;;)
    {
      return;
      int k = this.mType;
      if (k == 0)
      {
        localObject = WINDOWS_MOBILE_PHONE_SIGNS;
        boolean bool2 = ((Set)localObject).contains(paramString);
        if (bool2)
        {
          int m = 4;
          this.mType = m;
        }
        else
        {
          localObject = FOMA_SIGNS;
          boolean bool3 = ((Set)localObject).contains(paramString);
          if (bool3)
          {
            this.mType = i;
          }
          else
          {
            localObject = JAPANESE_MOBILE_PHONE_SIGNS;
            bool3 = ((Set)localObject).contains(paramString);
            if (bool3)
            {
              int n = 2;
              this.mType = n;
            }
            else
            {
              localObject = APPLE_SIGNS;
              boolean bool4 = ((Set)localObject).contains(paramString);
              if (bool4) {
                this.mType = j;
              }
            }
          }
        }
      }
    }
  }
  
  public void propertyParamType(String paramString) {}
  
  public void propertyParamValue(String paramString) {}
  
  public void propertyValues(List paramList)
  {
    boolean bool = this.mNeedParseSpecifiedCharset;
    if (bool)
    {
      int i = paramList.size();
      if (i > 0)
      {
        i = 0;
        String str = (String)paramList.get(0);
        this.mSpecifiedCharset = str;
      }
    }
  }
  
  public void start() {}
  
  public void startProperty()
  {
    this.mNeedParseSpecifiedCharset = false;
  }
  
  public void startRecord(String paramString) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/VCardSourceDetector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */