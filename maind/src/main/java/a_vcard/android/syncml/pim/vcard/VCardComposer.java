package a_vcard.android.syncml.pim.vcard;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.codec.binary.Base64;

public class VCardComposer
{
  private static final String TAG = "VCardComposer";
  public static final int VERSION_VCARD21_INT = 1;
  public static final int VERSION_VCARD30_INT = 2;
  private static final HashMap emailTypeMap;
  private static final HashSet emailTypes;
  private static final HashMap phoneTypeMap;
  private static final HashSet phoneTypes;
  private String mNewline;
  private StringBuilder mResult;
  
  static
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    Object localObject1 = new java/util/HashSet;
    Object localObject2 = new String[13];
    localObject2[0] = "CELL";
    localObject2[n] = "AOL";
    localObject2[m] = "APPLELINK";
    localObject2[k] = "ATTMAIL";
    localObject2[j] = "CIS";
    localObject2[i] = "EWORLD";
    localObject2[6] = "INTERNET";
    localObject2[7] = "IBMMAIL";
    localObject2[8] = "MCIMAIL";
    localObject2[9] = "POWERSHARE";
    localObject2[10] = "PRODIGY";
    localObject2[11] = "TLX";
    localObject2[12] = "X400";
    localObject2 = Arrays.asList((Object[])localObject2);
    ((HashSet)localObject1).<init>((Collection)localObject2);
    emailTypes = (HashSet)localObject1;
    localObject1 = new java/util/HashSet;
    localObject2 = new String[13];
    localObject2[0] = "PREF";
    localObject2[n] = "WORK";
    localObject2[m] = "HOME";
    localObject2[k] = "VOICE";
    localObject2[j] = "FAX";
    localObject2[i] = "MSG";
    localObject2[6] = "CELL";
    localObject2[7] = "PAGER";
    localObject2[8] = "BBS";
    localObject2[9] = "MODEM";
    localObject2[10] = "CAR";
    localObject2[11] = "ISDN";
    localObject2[12] = "VIDEO";
    localObject2 = Arrays.asList((Object[])localObject2);
    ((HashSet)localObject1).<init>((Collection)localObject2);
    phoneTypes = (HashSet)localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    phoneTypeMap = (HashMap)localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    emailTypeMap = (HashMap)localObject1;
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(n);
    ((HashMap)localObject1).put(localObject2, "HOME");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(m);
    ((HashMap)localObject1).put(localObject2, "CELL");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(k);
    ((HashMap)localObject1).put(localObject2, "WORK");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(j);
    ((HashMap)localObject1).put(localObject2, "WORK;FAX");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(i);
    ((HashMap)localObject1).put(localObject2, "HOME;FAX");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(6);
    ((HashMap)localObject1).put(localObject2, "PAGER");
    localObject1 = phoneTypeMap;
    localObject2 = Integer.valueOf(7);
    ((HashMap)localObject1).put(localObject2, "X-OTHER");
    localObject1 = emailTypeMap;
    localObject2 = Integer.valueOf(n);
    ((HashMap)localObject1).put(localObject2, "HOME");
    localObject1 = emailTypeMap;
    localObject2 = Integer.valueOf(m);
    ((HashMap)localObject1).put(localObject2, "WORK");
  }
  
  private void appendContactMethodStr(List paramList, int paramInt)
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1;
    if (paramInt == i)
    {
      str1 = ";";
      localIterator = paramList.iterator();
    }
    label29:
    Object localObject2;
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break label433;
      }
      ContactStruct.ContactMethod localContactMethod = (ContactStruct.ContactMethod)localIterator.next();
      int j = localContactMethod.kind;
      switch (j)
      {
      default: 
        break;
      case 1: 
        String str2 = "INTERNET";
        localObject1 = localContactMethod.data;
        bool2 = isNull((String)localObject1);
        if (!bool2)
        {
          localObject1 = new java/lang/Integer;
          int k = localContactMethod.type;
          ((Integer)localObject1).<init>(k);
          int m = ((Integer)localObject1).intValue();
          localObject1 = emailTypeMap;
          localObject2 = Integer.valueOf(m);
          bool2 = ((HashMap)localObject1).containsKey(localObject2);
          if (bool2)
          {
            localObject1 = emailTypeMap;
            localObject2 = Integer.valueOf(m);
            str2 = (String)((HashMap)localObject1).get(localObject2);
          }
          for (;;)
          {
            localObject1 = localContactMethod.data;
            bool2 = localHashMap.containsKey(localObject1);
            if (bool2)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject1 = localContactMethod.data;
              localObject1 = (String)localHashMap.get(localObject1);
              localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(str1).append(str2);
              str2 = ((StringBuilder)localObject1).toString();
            }
            localObject1 = localContactMethod.data;
            localHashMap.put(localObject1, str2);
            break label29;
            str1 = ",";
            break;
            localObject1 = localContactMethod.label;
            bool2 = isNull((String)localObject1);
            if (!bool2)
            {
              localObject1 = emailTypes;
              localObject2 = localContactMethod.label.toUpperCase();
              bool2 = ((HashSet)localObject1).contains(localObject2);
              if (bool2)
              {
                localObject1 = localContactMethod.label;
                str2 = ((String)localObject1).toUpperCase();
              }
            }
          }
        }
        break;
      case 2: 
        localObject1 = localContactMethod.data;
        bool2 = isNull((String)localObject1);
        if (!bool2)
        {
          localObject1 = this.mResult.append("ADR;TYPE=POSTAL:");
          localObject2 = localContactMethod.data;
          localObject2 = foldingString((String)localObject2, paramInt);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = this.mNewline;
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        break;
      }
    }
    label433:
    Object localObject1 = localHashMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    boolean bool2 = localIterator.hasNext();
    if (bool2)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramInt == i)
      {
        localObject1 = this.mResult;
        localObject2 = "EMAIL;";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      for (;;)
      {
        localObject2 = this.mResult;
        localObject1 = (String)localEntry.getValue();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(":");
        localObject1 = (String)localEntry.getKey();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = this.mNewline;
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
        localObject1 = this.mResult;
        localObject2 = "EMAIL;TYPE=";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
  }
  
  private void appendNameStr(String paramString)
  {
    StringBuilder localStringBuilder = this.mResult.append("FN:").append(paramString);
    String str = this.mNewline;
    localStringBuilder.append(str);
    localStringBuilder = this.mResult.append("N:").append(paramString);
    str = this.mNewline;
    localStringBuilder.append(str);
  }
  
  private void appendPhoneStr(List paramList, int paramInt)
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    if (paramInt == i) {}
    Object localObject2;
    for (String str1 = ";";; str1 = ",")
    {
      localIterator = paramList.iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        ContactStruct.PhoneData localPhoneData = (ContactStruct.PhoneData)localIterator.next();
        localObject1 = localPhoneData.data;
        bool1 = isNull((String)localObject1);
        if (!bool1)
        {
          String str2 = getPhoneTypeStr(localPhoneData);
          int j = 2;
          if (paramInt == j)
          {
            localObject1 = ";";
            j = str2.indexOf((String)localObject1);
            int k = -1;
            if (j != k)
            {
              localObject1 = ";";
              localObject2 = ",";
              str2 = str2.replace((CharSequence)localObject1, (CharSequence)localObject2);
            }
          }
          localObject1 = localPhoneData.data;
          bool2 = localHashMap.containsKey(localObject1);
          if (bool2)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = localPhoneData.data;
            localObject1 = (String)localHashMap.get(localObject1);
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(str1).append(str2);
            str2 = ((StringBuilder)localObject1).toString();
          }
          localObject1 = localPhoneData.data;
          localHashMap.put(localObject1, str2);
        }
      }
    }
    Object localObject1 = localHashMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    boolean bool2 = localIterator.hasNext();
    if (bool2)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramInt == i)
      {
        localObject1 = this.mResult;
        localObject2 = "TEL;";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      for (;;)
      {
        localObject2 = this.mResult;
        localObject1 = (String)localEntry.getValue();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(":");
        localObject1 = (String)localEntry.getKey();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = this.mNewline;
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
        localObject1 = this.mResult;
        localObject2 = "TEL;TYPE=";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
  }
  
  private void appendPhotoStr(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    int i = 1;
    for (;;)
    {
      String str2;
      try
      {
        localObject1 = new java/lang/String;
        boolean bool1 = true;
        localObject2 = Base64.encodeBase64(paramArrayOfByte, bool1);
        ((String)localObject1).<init>((byte[])localObject2);
        String str1 = foldingString((String)localObject1, paramInt);
        boolean bool2 = isNull(paramString);
        if (!bool2)
        {
          localObject1 = paramString.toUpperCase();
          localObject2 = "JPEG";
          j = ((String)localObject1).indexOf((String)localObject2);
          if (j < 0) {}
        }
        else
        {
          paramString = "JPEG";
          localObject1 = this.mResult;
          localObject2 = "LOGO;TYPE=";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(paramString);
          if (paramInt != i) {
            break label323;
          }
          str2 = ";ENCODING=BASE64:";
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append(str1);
          localObject2 = this.mNewline;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          str1 = ((StringBuilder)localObject1).toString();
          localObject1 = this.mResult.append(str2).append(str1);
          localObject2 = this.mNewline;
          ((StringBuilder)localObject1).append((String)localObject2);
          return;
        }
      }
      catch (Exception localException)
      {
        localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
        localObject2 = localException.getMessage();
        ((VCardException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      Object localObject1 = paramString.toUpperCase();
      Object localObject2 = "GIF";
      int j = ((String)localObject1).indexOf((String)localObject2);
      if (j >= 0)
      {
        paramString = "GIF";
      }
      else
      {
        localObject1 = paramString.toUpperCase();
        localObject2 = "BMP";
        j = ((String)localObject1).indexOf((String)localObject2);
        if (j >= 0)
        {
          paramString = "BMP";
        }
        else
        {
          localObject1 = "/";
          int k = paramString.indexOf((String)localObject1);
          if (k >= 0)
          {
            j = k + 1;
            localObject1 = paramString.substring(j);
            paramString = ((String)localObject1).toUpperCase();
          }
          else
          {
            paramString = paramString.toUpperCase();
            continue;
            label323:
            j = 2;
            if (paramInt == j) {
              str2 = ";ENCODING=removeFromPath:";
            }
          }
        }
      }
    }
  }
  
  private String foldingString(String paramString, int paramInt)
  {
    String str1 = null;
    String str2 = "\r\n";
    boolean bool1 = paramString.endsWith(str2);
    if (bool1)
    {
      int i = paramString.length() + -2;
      paramString = paramString.substring(0, i);
      str2 = "\r\n";
      str1 = "\n";
      paramString = paramString.replaceAll(str2, str1);
      i = 1;
      if (paramInt != i) {
        break label117;
      }
      str1 = "\r\n ";
      str2 = paramString.replaceAll("\n", str1);
    }
    for (;;)
    {
      return str2;
      str2 = "\n";
      boolean bool2 = paramString.endsWith(str2);
      if (!bool2) {
        break;
      }
      int j = paramString.length() + -1;
      paramString = paramString.substring(0, j);
      break;
      label117:
      j = 2;
      if (paramInt == j)
      {
        str1 = "\n ";
        str2 = paramString.replaceAll("\n", str1);
      }
      else
      {
        j = 0;
        str2 = null;
      }
    }
  }
  
  private String getPhoneTypeStr(ContactStruct.PhoneData paramPhoneData)
  {
    int i = paramPhoneData.type;
    Object localObject1 = phoneTypeMap;
    Object localObject2 = Integer.valueOf(i);
    boolean bool = ((HashMap)localObject1).containsKey(localObject2);
    Object localObject3;
    if (bool)
    {
      localObject1 = phoneTypeMap;
      localObject2 = Integer.valueOf(i);
      localObject3 = (String)((HashMap)localObject1).get(localObject2);
    }
    for (;;)
    {
      return (String)localObject3;
      if (i == 0)
      {
        String str = paramPhoneData.label.toUpperCase();
        localObject1 = phoneTypes;
        bool = ((HashSet)localObject1).contains(str);
        if (!bool)
        {
          localObject1 = "X-";
          bool = str.startsWith((String)localObject1);
          if (!bool) {}
        }
        else
        {
          localObject3 = str;
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "X-CUSTOM-";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(str);
        localObject3 = ((StringBuilder)localObject1).toString();
      }
      else
      {
        localObject3 = "VOICE";
      }
    }
  }
  
  private boolean isNull(String paramString)
  {
    String str1;
    boolean bool;
    if (paramString != null)
    {
      str1 = paramString.trim();
      String str2 = "";
      bool = str1.equals(str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public String createVCard(ContactStruct paramContactStruct, int paramInt)
  {
    int i = 1;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    this.mResult = ((StringBuilder)localObject1);
    localObject1 = paramContactStruct.name;
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = paramContactStruct.name.trim();
      localObject2 = "";
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {}
    }
    else
    {
      localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      ((VCardException)localObject1).<init>(" struct.name MUST have value.");
      throw ((Throwable)localObject1);
    }
    if (paramInt == i)
    {
      localObject1 = "\r\n";
      this.mNewline = ((String)localObject1);
      localObject1 = this.mResult.append("BEGIN:VCARD");
      localObject2 = this.mNewline;
      ((StringBuilder)localObject1).append((String)localObject2);
      if (paramInt != i) {
        break label566;
      }
      localObject1 = this.mResult.append("VERSION:2.1");
      localObject2 = this.mNewline;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      localObject1 = paramContactStruct.name;
      bool1 = isNull((String)localObject1);
      if (!bool1)
      {
        localObject1 = paramContactStruct.name;
        appendNameStr((String)localObject1);
      }
      localObject1 = paramContactStruct.company;
      bool1 = isNull((String)localObject1);
      if (!bool1)
      {
        localObject1 = this.mResult.append("ORG:");
        localObject2 = paramContactStruct.company;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = this.mNewline;
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      localObject1 = paramContactStruct.notes;
      int j = ((List)localObject1).size();
      if (j > 0)
      {
        localObject1 = (String)paramContactStruct.notes.get(0);
        bool2 = isNull((String)localObject1);
        if (!bool2)
        {
          localObject2 = this.mResult.append("NOTE:");
          localObject1 = (String)paramContactStruct.notes.get(0);
          localObject1 = foldingString((String)localObject1, paramInt);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = this.mNewline;
          ((StringBuilder)localObject1).append((String)localObject2);
        }
      }
      localObject1 = paramContactStruct.title;
      boolean bool2 = isNull((String)localObject1);
      if (!bool2)
      {
        localObject1 = this.mResult.append("TITLE:");
        localObject2 = paramContactStruct.title;
        localObject2 = foldingString((String)localObject2, paramInt);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = this.mNewline;
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      localObject1 = paramContactStruct.photoBytes;
      if (localObject1 != null)
      {
        localObject1 = paramContactStruct.photoBytes;
        localObject2 = paramContactStruct.photoType;
        appendPhotoStr((byte[])localObject1, (String)localObject2, paramInt);
      }
      localObject1 = paramContactStruct.phoneList;
      if (localObject1 != null)
      {
        localObject1 = paramContactStruct.phoneList;
        appendPhoneStr((List)localObject1, paramInt);
      }
      localObject1 = paramContactStruct.contactmethodList;
      if (localObject1 != null)
      {
        localObject1 = paramContactStruct.contactmethodList;
        appendContactMethodStr((List)localObject1, paramInt);
      }
      localObject1 = this.mResult.append("END:VCARD");
      localObject2 = this.mNewline;
      ((StringBuilder)localObject1).append((String)localObject2);
      return this.mResult.toString();
      int k = 2;
      if (paramInt == k)
      {
        localObject1 = "\n";
        this.mNewline = ((String)localObject1);
        break;
      }
      localObject1 = new a_vcard/android/syncml/pim/vcard/VCardException;
      ((VCardException)localObject1).<init>(" version not match VERSION_VCARD21 or VERSION_VCARD30.");
      throw ((Throwable)localObject1);
      label566:
      localObject1 = this.mResult.append("VERSION:3.0");
      localObject2 = this.mNewline;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/VCardComposer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */