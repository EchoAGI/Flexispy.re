package a_vcard.android.syncml.pim.vcard;

import a_vcard.android.content.ContentValues;
import a_vcard.android.syncml.pim.PropertyNode;
import a_vcard.android.syncml.pim.VNode;
import a_vcard.android.telephony.PhoneNumberUtils;
import a_vcard.android.text.TextUtils;
import a_vcard.android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class ContactStruct
{
  private static final String LOG_TAG = "ContactStruct";
  public static final int NAME_ORDER_TYPE_ENGLISH = 0;
  public static final int NAME_ORDER_TYPE_JAPANESE = 1;
  public String company;
  public List contactmethodList;
  public Map extensionMap;
  public String name;
  public List notes;
  public List organizationList;
  public List phoneList;
  public String phoneticName;
  public byte[] photoBytes;
  public String photoType;
  public String title;
  
  public ContactStruct()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.notes = localArrayList;
  }
  
  public static ContactStruct constructContactFromVNode(VNode paramVNode, int paramInt)
  {
    Object localObject1 = paramVNode;
    Object localObject2 = paramVNode.VName;
    String str1 = "VCARD";
    boolean bool1 = ((String)localObject2).equals(str1);
    if (!bool1)
    {
      localObject2 = "ContactStruct";
      str1 = "Non VCARD data is inserted.";
      Log.e((String)localObject2, str1);
      localContactStruct = null;
      return localContactStruct;
    }
    Object localObject3 = null;
    String str2 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    ContactStruct localContactStruct = new a_vcard/android/syncml/pim/vcard/ContactStruct;
    localContactStruct.<init>();
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    localObject2 = paramVNode.propList;
    Iterator localIterator1 = ((ArrayList)localObject2).iterator();
    StringBuilder localStringBuilder;
    int i17;
    label2300:
    int i3;
    for (;;)
    {
      bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      PropertyNode localPropertyNode = (PropertyNode)localIterator1.next();
      localObject1 = localPropertyNode;
      String str3 = localPropertyNode.propName;
      localObject1 = localPropertyNode;
      localObject2 = localPropertyNode.propValue;
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1)
      {
        localObject2 = "VERSION";
        localObject1 = str3;
        bool1 = str3.equals(localObject2);
        if (!bool1)
        {
          localObject2 = "FN";
          bool1 = str3.equals(localObject2);
          if (bool1)
          {
            localObject1 = localPropertyNode;
            localObject1 = localPropertyNode.propValue;
            localObject3 = localObject1;
          }
          else
          {
            localObject2 = "NAME";
            bool1 = str3.equals(localObject2);
            if ((bool1) && (localObject3 == null))
            {
              localObject1 = localPropertyNode;
              localObject1 = localPropertyNode.propValue;
              localObject3 = localObject1;
            }
            else
            {
              localObject2 = "N";
              localObject1 = str3;
              bool1 = str3.equals(localObject2);
              if (bool1)
              {
                localObject1 = localPropertyNode;
                localObject2 = localPropertyNode.propValue_vector;
                str2 = getNameFromNProperty((List)localObject2, paramInt);
              }
              else
              {
                localObject2 = "SORT-STRING";
                bool1 = str3.equals(localObject2);
                if (bool1)
                {
                  localObject1 = localPropertyNode;
                  localObject2 = localPropertyNode.propValue;
                  localContactStruct.phoneticName = ((String)localObject2);
                }
                else
                {
                  localObject2 = "SOUND";
                  bool1 = str3.equals(localObject2);
                  Object localObject7;
                  int i11;
                  if (bool1)
                  {
                    localObject1 = localPropertyNode;
                    localObject2 = localPropertyNode.paramMap_TYPE;
                    str1 = "X-IRMC-N";
                    bool1 = ((Set)localObject2).contains(str1);
                    if (bool1)
                    {
                      localObject2 = localContactStruct.phoneticName;
                      if (localObject2 == null)
                      {
                        localStringBuilder = new java/lang/StringBuilder;
                        localStringBuilder.<init>();
                        localObject1 = localPropertyNode.propValue;
                        localObject7 = localObject1;
                        int i10 = ((String)localObject1).length();
                        i11 = 0;
                        while (i11 < i10)
                        {
                          localObject1 = localObject7;
                          char c2 = ((String)localObject7).charAt(i11);
                          int i = 59;
                          if (c2 != i) {
                            localStringBuilder.append(c2);
                          }
                          i11 += 1;
                        }
                        localObject2 = localStringBuilder.toString();
                        localContactStruct.phoneticName = ((String)localObject2);
                        continue;
                      }
                    }
                    localObject1 = localPropertyNode;
                    localContactStruct.addExtension(localPropertyNode);
                  }
                  else
                  {
                    localObject2 = "ADR";
                    boolean bool2 = str3.equals(localObject2);
                    Iterator localIterator2;
                    int i14;
                    Object localObject8;
                    boolean bool10;
                    String str4;
                    String str5;
                    Object localObject9;
                    int i15;
                    if (bool2)
                    {
                      localObject1 = localPropertyNode;
                      localObject1 = localPropertyNode.propValue_vector;
                      int i12 = 1;
                      localIterator2 = ((List)localObject1).iterator();
                      int j;
                      do
                      {
                        bool2 = localIterator2.hasNext();
                        if (!bool2) {
                          break;
                        }
                        localObject7 = (String)localIterator2.next();
                        j = ((String)localObject7).length();
                      } while (j <= 0);
                      i12 = 0;
                      if (i12 == 0)
                      {
                        int i13 = 2;
                        i14 = -1;
                        localObject8 = "";
                        bool10 = false;
                        localObject1 = localPropertyNode;
                        localObject2 = localPropertyNode.paramMap_TYPE;
                        localIterator2 = ((Set)localObject2).iterator();
                        for (;;)
                        {
                          boolean bool3 = localIterator2.hasNext();
                          if (!bool3) {
                            break;
                          }
                          str4 = (String)localIterator2.next();
                          localObject2 = "PREF";
                          localObject1 = str4;
                          bool3 = str4.equals(localObject2);
                          if ((bool3) && (i6 == 0))
                          {
                            i6 = 1;
                            bool10 = true;
                          }
                          else
                          {
                            localObject2 = "HOME";
                            localObject1 = str4;
                            bool3 = str4.equalsIgnoreCase((String)localObject2);
                            if (bool3)
                            {
                              i14 = 1;
                              localObject8 = "";
                            }
                            else
                            {
                              localObject2 = "WORK";
                              bool3 = str4.equalsIgnoreCase((String)localObject2);
                              if (!bool3)
                              {
                                localObject2 = "COMPANY";
                                bool3 = str4.equalsIgnoreCase((String)localObject2);
                                if (!bool3) {}
                              }
                              else
                              {
                                i14 = 2;
                                localObject8 = "";
                                continue;
                              }
                              localObject2 = "POSTAL";
                              bool3 = str4.equalsIgnoreCase((String)localObject2);
                              if (bool3)
                              {
                                i13 = 2;
                              }
                              else
                              {
                                localObject2 = "PARCEL";
                                bool3 = str4.equalsIgnoreCase((String)localObject2);
                                if (!bool3)
                                {
                                  localObject2 = "DOM";
                                  bool3 = str4.equalsIgnoreCase((String)localObject2);
                                  if (!bool3)
                                  {
                                    localObject2 = "INTL";
                                    bool3 = str4.equalsIgnoreCase((String)localObject2);
                                    if (!bool3)
                                    {
                                      localObject2 = str4.toUpperCase();
                                      str1 = "X-";
                                      bool3 = ((String)localObject2).startsWith(str1);
                                      if ((bool3) && (i14 < 0))
                                      {
                                        i14 = 0;
                                        str5 = null;
                                        k = 2;
                                        localObject8 = str4.substring(k);
                                      }
                                      else if (i14 < 0)
                                      {
                                        i14 = 0;
                                        str5 = null;
                                        localObject8 = str4;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (i14 < 0) {
                          i14 = 1;
                        }
                        localObject1 = localPropertyNode;
                        localObject1 = localPropertyNode.propValue_vector;
                        localObject9 = localObject1;
                        i15 = ((List)localObject1).size();
                        int k = 1;
                        if (i15 > k)
                        {
                          localStringBuilder = new java/lang/StringBuilder;
                          localStringBuilder.<init>();
                          int i16 = 1;
                          localObject2 = Locale.getDefault().getCountry();
                          str1 = Locale.JAPAN.getCountry();
                          boolean bool4 = ((String)localObject2).equals(str1);
                          String str6;
                          if (bool4)
                          {
                            i11 = i15 + -1;
                            while (i11 >= 0)
                            {
                              localObject1 = localObject9;
                              str6 = (String)((List)localObject9).get(i11);
                              int m = str6.length();
                              if (m > 0)
                              {
                                if (i16 == 0)
                                {
                                  m = 32;
                                  localStringBuilder.append(m);
                                }
                                localStringBuilder.append(str6);
                                i16 = 0;
                              }
                              i11 += -1;
                            }
                          }
                          i11 = 0;
                          while (i11 < i15)
                          {
                            localObject1 = localObject9;
                            str6 = (String)((List)localObject9).get(i11);
                            int n = str6.length();
                            if (n > 0)
                            {
                              if (i16 == 0)
                              {
                                n = 32;
                                localStringBuilder.append(n);
                              }
                              localStringBuilder.append(str6);
                              i16 = 0;
                            }
                            i11 += 1;
                          }
                          localObject2 = localStringBuilder.toString();
                        }
                        for (String str7 = ((String)localObject2).trim();; str7 = localPropertyNode.propValue)
                        {
                          localContactStruct.addContactmethod(i13, i14, str7, (String)localObject8, bool10);
                          break;
                          localObject1 = localPropertyNode;
                        }
                      }
                    }
                    else
                    {
                      localObject2 = "ORG";
                      boolean bool5 = str3.equals(localObject2);
                      if (bool5)
                      {
                        i14 = 1;
                        bool10 = false;
                        localObject1 = localPropertyNode;
                        localObject2 = localPropertyNode.paramMap_TYPE;
                        localIterator2 = ((Set)localObject2).iterator();
                        for (;;)
                        {
                          bool5 = localIterator2.hasNext();
                          if (!bool5) {
                            break;
                          }
                          str4 = (String)localIterator2.next();
                          localObject2 = "PREF";
                          localObject1 = str4;
                          bool5 = str4.equals(localObject2);
                          if ((bool5) && (i9 == 0))
                          {
                            i9 = 1;
                            bool10 = true;
                          }
                        }
                        localObject1 = localPropertyNode;
                        localObject1 = localPropertyNode.propValue_vector;
                        localObject9 = localObject1;
                        i15 = ((List)localObject1).size();
                        localStringBuilder = new java/lang/StringBuilder;
                        localStringBuilder.<init>();
                        Iterator localIterator3 = ((List)localObject1).iterator();
                        for (;;)
                        {
                          bool5 = localIterator3.hasNext();
                          if (!bool5) {
                            break;
                          }
                          localObject2 = (String)localIterator3.next();
                          localStringBuilder.append((String)localObject2);
                          bool5 = localIterator3.hasNext();
                          if (bool5)
                          {
                            char c1 = ' ';
                            localStringBuilder.append(c1);
                          }
                        }
                        localObject2 = localStringBuilder.toString();
                        str1 = "";
                        localContactStruct.addOrganization(i14, (String)localObject2, str1, bool10);
                      }
                      else
                      {
                        localObject2 = "TITLE";
                        boolean bool6 = str3.equals(localObject2);
                        if (bool6)
                        {
                          localObject1 = localPropertyNode;
                          localObject2 = localPropertyNode.propValue;
                          localContactStruct.setPosition((String)localObject2);
                        }
                        else
                        {
                          localObject2 = "ROLE";
                          bool6 = str3.equals(localObject2);
                          if (bool6)
                          {
                            localObject1 = localPropertyNode;
                            localObject2 = localPropertyNode.propValue;
                            localContactStruct.setPosition((String)localObject2);
                          }
                          else
                          {
                            localObject2 = "PHOTO";
                            bool6 = str3.equals(localObject2);
                            String str8;
                            if (bool6)
                            {
                              localObject1 = localPropertyNode;
                              localObject2 = localPropertyNode.paramMap;
                              str1 = "VALUE";
                              str8 = ((ContentValues)localObject2).getAsString(str1);
                              if (str8 != null)
                              {
                                localObject2 = "URL";
                                localObject1 = str8;
                                bool6 = str8.equals(localObject2);
                                if (bool6) {}
                              }
                              else
                              {
                                localObject1 = localPropertyNode;
                                localObject2 = localPropertyNode.propValue_bytes;
                                localContactStruct.photoBytes = ((byte[])localObject2);
                                localObject2 = localPropertyNode.paramMap;
                                str1 = "TYPE";
                                str5 = ((ContentValues)localObject2).getAsString(str1);
                                if (str5 != null) {
                                  localContactStruct.photoType = str5;
                                }
                              }
                            }
                            else
                            {
                              localObject2 = "LOGO";
                              bool6 = str3.equals(localObject2);
                              if (bool6)
                              {
                                localObject1 = localPropertyNode;
                                localObject2 = localPropertyNode.paramMap;
                                str1 = "VALUE";
                                str8 = ((ContentValues)localObject2).getAsString(str1);
                                if (str8 != null)
                                {
                                  localObject2 = "URL";
                                  localObject1 = str8;
                                  bool6 = str8.equals(localObject2);
                                  if (bool6) {}
                                }
                                else
                                {
                                  localObject2 = localContactStruct.photoBytes;
                                  if (localObject2 == null)
                                  {
                                    localObject1 = localPropertyNode;
                                    localObject2 = localPropertyNode.propValue_bytes;
                                    localContactStruct.photoBytes = ((byte[])localObject2);
                                    localObject2 = localPropertyNode.paramMap;
                                    str1 = "TYPE";
                                    str5 = ((ContentValues)localObject2).getAsString(str1);
                                    if (str5 != null) {
                                      localContactStruct.photoType = str5;
                                    }
                                  }
                                }
                              }
                              else
                              {
                                localObject2 = "EMAIL";
                                bool6 = str3.equals(localObject2);
                                if (bool6)
                                {
                                  i14 = -1;
                                  localObject8 = null;
                                  bool10 = false;
                                  localObject1 = localPropertyNode;
                                  localObject2 = localPropertyNode.paramMap_TYPE;
                                  localIterator2 = ((Set)localObject2).iterator();
                                  for (;;)
                                  {
                                    bool6 = localIterator2.hasNext();
                                    if (!bool6) {
                                      break;
                                    }
                                    str4 = (String)localIterator2.next();
                                    localObject2 = "PREF";
                                    localObject1 = str4;
                                    bool6 = str4.equals(localObject2);
                                    if ((bool6) && (i8 == 0))
                                    {
                                      i8 = 1;
                                      bool10 = true;
                                    }
                                    else
                                    {
                                      localObject2 = "HOME";
                                      localObject1 = str4;
                                      bool6 = str4.equalsIgnoreCase((String)localObject2);
                                      if (bool6)
                                      {
                                        i14 = 1;
                                      }
                                      else
                                      {
                                        localObject2 = "WORK";
                                        bool6 = str4.equalsIgnoreCase((String)localObject2);
                                        if (bool6)
                                        {
                                          i14 = 2;
                                        }
                                        else
                                        {
                                          localObject2 = "CELL";
                                          bool6 = str4.equalsIgnoreCase((String)localObject2);
                                          if (bool6)
                                          {
                                            i14 = 0;
                                            str5 = null;
                                            localObject8 = "_AUTO_CELL";
                                          }
                                          else
                                          {
                                            localObject2 = str4.toUpperCase();
                                            str1 = "X-";
                                            bool6 = ((String)localObject2).startsWith(str1);
                                            if ((bool6) && (i14 < 0))
                                            {
                                              i14 = 0;
                                              str5 = null;
                                              int i1 = 2;
                                              localObject8 = str4.substring(i1);
                                            }
                                            else if (i14 < 0)
                                            {
                                              i14 = 0;
                                              str5 = null;
                                              localObject8 = str4;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (i14 < 0) {
                                    i14 = 3;
                                  }
                                  i17 = 1;
                                  localObject1 = localPropertyNode;
                                  String str9 = localPropertyNode.propValue;
                                  localObject2 = localContactStruct;
                                  localContactStruct.addContactmethod(i17, i14, str9, (String)localObject8, bool10);
                                }
                                else
                                {
                                  localObject2 = "TEL";
                                  boolean bool7 = str3.equals(localObject2);
                                  if (bool7)
                                  {
                                    i14 = -1;
                                    localObject8 = null;
                                    bool10 = false;
                                    int i18 = 0;
                                    localObject1 = localPropertyNode;
                                    localObject2 = localPropertyNode.paramMap_TYPE;
                                    localIterator2 = ((Set)localObject2).iterator();
                                    int i2;
                                    for (;;)
                                    {
                                      bool7 = localIterator2.hasNext();
                                      if (!bool7) {
                                        break;
                                      }
                                      str4 = (String)localIterator2.next();
                                      localObject2 = "PREF";
                                      localObject1 = str4;
                                      bool7 = str4.equals(localObject2);
                                      if ((bool7) && (i7 == 0))
                                      {
                                        i7 = 1;
                                        bool10 = true;
                                      }
                                      else
                                      {
                                        localObject2 = "HOME";
                                        localObject1 = str4;
                                        bool7 = str4.equalsIgnoreCase((String)localObject2);
                                        if (bool7)
                                        {
                                          i14 = 1;
                                        }
                                        else
                                        {
                                          localObject2 = "WORK";
                                          bool7 = str4.equalsIgnoreCase((String)localObject2);
                                          if (bool7)
                                          {
                                            i14 = 3;
                                          }
                                          else
                                          {
                                            localObject2 = "CELL";
                                            bool7 = str4.equalsIgnoreCase((String)localObject2);
                                            if (bool7)
                                            {
                                              i14 = 2;
                                            }
                                            else
                                            {
                                              localObject2 = "PAGER";
                                              bool7 = str4.equalsIgnoreCase((String)localObject2);
                                              if (bool7)
                                              {
                                                i14 = 6;
                                              }
                                              else
                                              {
                                                localObject2 = "FAX";
                                                bool7 = str4.equalsIgnoreCase((String)localObject2);
                                                if (bool7)
                                                {
                                                  i18 = 1;
                                                }
                                                else
                                                {
                                                  localObject2 = "VOICE";
                                                  bool7 = str4.equalsIgnoreCase((String)localObject2);
                                                  if (!bool7)
                                                  {
                                                    localObject2 = "MSG";
                                                    bool7 = str4.equalsIgnoreCase((String)localObject2);
                                                    if (!bool7)
                                                    {
                                                      localObject2 = str4.toUpperCase();
                                                      str1 = "X-";
                                                      bool7 = ((String)localObject2).startsWith(str1);
                                                      if ((bool7) && (i14 < 0))
                                                      {
                                                        i14 = 0;
                                                        str5 = null;
                                                        i2 = 2;
                                                        localObject8 = str4.substring(i2);
                                                      }
                                                      else if (i14 < 0)
                                                      {
                                                        i14 = 0;
                                                        str5 = null;
                                                        localObject8 = str4;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (i14 < 0) {
                                      i14 = 1;
                                    }
                                    if (i18 != 0)
                                    {
                                      i2 = 1;
                                      if (i14 != i2) {
                                        break label2300;
                                      }
                                      i14 = 5;
                                    }
                                    for (;;)
                                    {
                                      localObject1 = localPropertyNode;
                                      localObject2 = localPropertyNode.propValue;
                                      localContactStruct.addPhone(i14, (String)localObject2, (String)localObject8, bool10);
                                      break;
                                      i2 = 3;
                                      if (i14 == i2) {
                                        i14 = 4;
                                      }
                                    }
                                  }
                                  localObject2 = "NOTE";
                                  i3 = str3.equals(localObject2);
                                  if (i3 != 0)
                                  {
                                    localObject2 = localContactStruct.notes;
                                    localObject1 = localPropertyNode;
                                    str1 = localPropertyNode.propValue;
                                    ((List)localObject2).add(str1);
                                  }
                                  else
                                  {
                                    localObject2 = "BDAY";
                                    i3 = str3.equals(localObject2);
                                    if (i3 != 0)
                                    {
                                      localObject1 = localPropertyNode;
                                      localContactStruct.addExtension(localPropertyNode);
                                    }
                                    else
                                    {
                                      localObject2 = "URL";
                                      i3 = str3.equals(localObject2);
                                      if (i3 != 0)
                                      {
                                        localObject1 = localPropertyNode;
                                        localContactStruct.addExtension(localPropertyNode);
                                      }
                                      else
                                      {
                                        localObject2 = "REV";
                                        i3 = str3.equals(localObject2);
                                        if (i3 != 0)
                                        {
                                          localObject1 = localPropertyNode;
                                          localContactStruct.addExtension(localPropertyNode);
                                        }
                                        else
                                        {
                                          localObject2 = "UID";
                                          i3 = str3.equals(localObject2);
                                          if (i3 != 0)
                                          {
                                            localObject1 = localPropertyNode;
                                            localContactStruct.addExtension(localPropertyNode);
                                          }
                                          else
                                          {
                                            localObject2 = "KEY";
                                            i3 = str3.equals(localObject2);
                                            if (i3 != 0)
                                            {
                                              localObject1 = localPropertyNode;
                                              localContactStruct.addExtension(localPropertyNode);
                                            }
                                            else
                                            {
                                              localObject2 = "MAILER";
                                              i3 = str3.equals(localObject2);
                                              if (i3 != 0)
                                              {
                                                localObject1 = localPropertyNode;
                                                localContactStruct.addExtension(localPropertyNode);
                                              }
                                              else
                                              {
                                                localObject2 = "TZ";
                                                i3 = str3.equals(localObject2);
                                                if (i3 != 0)
                                                {
                                                  localObject1 = localPropertyNode;
                                                  localContactStruct.addExtension(localPropertyNode);
                                                }
                                                else
                                                {
                                                  localObject2 = "GEO";
                                                  i3 = str3.equals(localObject2);
                                                  if (i3 != 0)
                                                  {
                                                    localObject1 = localPropertyNode;
                                                    localContactStruct.addExtension(localPropertyNode);
                                                  }
                                                  else
                                                  {
                                                    localObject2 = "NICKNAME";
                                                    i3 = str3.equals(localObject2);
                                                    if (i3 != 0)
                                                    {
                                                      localObject1 = localPropertyNode;
                                                      localContactStruct.addExtension(localPropertyNode);
                                                    }
                                                    else
                                                    {
                                                      localObject2 = "CLASS";
                                                      i3 = str3.equals(localObject2);
                                                      if (i3 != 0)
                                                      {
                                                        localObject1 = localPropertyNode;
                                                        localContactStruct.addExtension(localPropertyNode);
                                                      }
                                                      else
                                                      {
                                                        localObject2 = "PROFILE";
                                                        i3 = str3.equals(localObject2);
                                                        if (i3 != 0)
                                                        {
                                                          localObject1 = localPropertyNode;
                                                          localContactStruct.addExtension(localPropertyNode);
                                                        }
                                                        else
                                                        {
                                                          localObject2 = "CATEGORIES";
                                                          i3 = str3.equals(localObject2);
                                                          if (i3 != 0)
                                                          {
                                                            localObject1 = localPropertyNode;
                                                            localContactStruct.addExtension(localPropertyNode);
                                                          }
                                                          else
                                                          {
                                                            localObject2 = "SOURCE";
                                                            i3 = str3.equals(localObject2);
                                                            if (i3 != 0)
                                                            {
                                                              localObject1 = localPropertyNode;
                                                              localContactStruct.addExtension(localPropertyNode);
                                                            }
                                                            else
                                                            {
                                                              localObject2 = "PRODID";
                                                              i3 = str3.equals(localObject2);
                                                              if (i3 != 0)
                                                              {
                                                                localObject1 = localPropertyNode;
                                                                localContactStruct.addExtension(localPropertyNode);
                                                              }
                                                              else
                                                              {
                                                                localObject2 = "X-PHONETIC-FIRST-NAME";
                                                                i3 = str3.equals(localObject2);
                                                                if (i3 != 0)
                                                                {
                                                                  localObject1 = localPropertyNode;
                                                                  localObject1 = localPropertyNode.propValue;
                                                                  localObject4 = localObject1;
                                                                }
                                                                else
                                                                {
                                                                  localObject2 = "X-PHONETIC-MIDDLE-NAME";
                                                                  i3 = str3.equals(localObject2);
                                                                  if (i3 != 0)
                                                                  {
                                                                    localObject1 = localPropertyNode;
                                                                    localObject1 = localPropertyNode.propValue;
                                                                    localObject5 = localObject1;
                                                                  }
                                                                  else
                                                                  {
                                                                    localObject2 = "X-PHONETIC-LAST-NAME";
                                                                    i3 = str3.equals(localObject2);
                                                                    if (i3 != 0)
                                                                    {
                                                                      localObject1 = localPropertyNode;
                                                                      localObject1 = localPropertyNode.propValue;
                                                                      localObject6 = localObject1;
                                                                    }
                                                                    else
                                                                    {
                                                                      localObject1 = localPropertyNode;
                                                                      localContactStruct.addExtension(localPropertyNode);
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label2904:
    Object localObject10;
    if (localObject3 != null)
    {
      localObject1 = localObject3;
      localContactStruct.name = ((String)localObject3);
      localObject2 = localContactStruct.phoneticName;
      if ((localObject2 == null) && ((localObject4 != null) || (localObject5 != null) || (localObject6 != null)))
      {
        i3 = 1;
        if (paramInt != i3) {
          break label3370;
        }
        localObject10 = localObject6;
      }
    }
    for (Object localObject11 = localObject4;; localObject11 = localObject6)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (localObject10 != null)
      {
        localObject1 = localObject10;
        localStringBuilder.append((String)localObject10);
      }
      if (localObject5 != null)
      {
        localObject1 = localObject5;
        localStringBuilder.append((String)localObject5);
      }
      if (localObject11 != null)
      {
        localObject1 = localObject11;
        localStringBuilder.append((String)localObject11);
      }
      localObject2 = localStringBuilder.toString();
      localContactStruct.phoneticName = ((String)localObject2);
      localObject2 = localContactStruct.phoneticName;
      if (localObject2 != null)
      {
        localObject2 = localContactStruct.phoneticName.trim();
        localContactStruct.phoneticName = ((String)localObject2);
      }
      if (i7 == 0)
      {
        localObject2 = localContactStruct.phoneList;
        if (localObject2 != null)
        {
          localObject2 = localContactStruct.phoneList;
          i3 = ((List)localObject2).size();
          if (i3 > 0)
          {
            localObject2 = localContactStruct.phoneList;
            str1 = null;
            localObject2 = (ContactStruct.PhoneData)((List)localObject2).get(0);
            i17 = 1;
            ((ContactStruct.PhoneData)localObject2).isPrimary = i17;
          }
        }
      }
      ContactStruct.ContactMethod localContactMethod;
      if (i6 == 0)
      {
        localObject2 = localContactStruct.contactmethodList;
        if (localObject2 != null)
        {
          localObject2 = localContactStruct.contactmethodList;
          localIterator1 = ((List)localObject2).iterator();
          do
          {
            boolean bool8 = localIterator1.hasNext();
            if (!bool8) {
              break;
            }
            localContactMethod = (ContactStruct.ContactMethod)localIterator1.next();
            localObject1 = localContactMethod;
            i4 = localContactMethod.kind;
            i17 = 2;
          } while (i4 != i17);
          int i4 = 1;
          localContactMethod.isPrimary = i4;
        }
      }
      if (i8 == 0)
      {
        localObject2 = localContactStruct.contactmethodList;
        if (localObject2 != null)
        {
          localObject2 = localContactStruct.contactmethodList;
          localIterator1 = ((List)localObject2).iterator();
          do
          {
            boolean bool9 = localIterator1.hasNext();
            if (!bool9) {
              break;
            }
            localContactMethod = (ContactStruct.ContactMethod)localIterator1.next();
            localObject1 = localContactMethod;
            i5 = localContactMethod.kind;
            i17 = 1;
          } while (i5 != i17);
          i5 = 1;
          localContactMethod.isPrimary = i5;
        }
      }
      if (i9 != 0) {
        break;
      }
      localObject2 = localContactStruct.organizationList;
      if (localObject2 == null) {
        break;
      }
      localObject2 = localContactStruct.organizationList;
      int i5 = ((List)localObject2).size();
      if (i5 <= 0) {
        break;
      }
      localObject2 = localContactStruct.organizationList;
      str1 = null;
      localObject2 = (ContactStruct.OrganizationData)((List)localObject2).get(0);
      i17 = 1;
      ((ContactStruct.OrganizationData)localObject2).isPrimary = i17;
      break;
      if (str2 != null)
      {
        localObject1 = str2;
        localContactStruct.name = str2;
        break label2904;
      }
      localObject2 = "";
      localContactStruct.name = ((String)localObject2);
      break label2904;
      label3370:
      localObject10 = localObject4;
    }
  }
  
  private static String getNameFromNProperty(List paramList, int paramInt)
  {
    int i = 3;
    int j = 2;
    char c = ' ';
    int k = 1;
    int m = paramList.size();
    String str1;
    String str2;
    String str3;
    if (m > k)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int n = 1;
      int i1;
      if (m > i)
      {
        str1 = (String)paramList.get(i);
        i1 = str1.length();
        if (i1 > 0)
        {
          str1 = (String)paramList.get(i);
          localStringBuilder.append(str1);
          n = 0;
        }
      }
      if (paramInt == k)
      {
        str2 = (String)paramList.get(0);
        str3 = (String)paramList.get(k);
        i1 = str2.length();
        if (i1 > 0)
        {
          if (n == 0) {
            localStringBuilder.append(c);
          }
          localStringBuilder.append(str2);
          n = 0;
        }
        if (m > j)
        {
          str1 = (String)paramList.get(j);
          i1 = str1.length();
          if (i1 > 0)
          {
            if (n == 0) {
              localStringBuilder.append(c);
            }
            str1 = (String)paramList.get(j);
            localStringBuilder.append(str1);
            n = 0;
          }
        }
        i1 = str3.length();
        if (i1 > 0)
        {
          if (n == 0) {
            localStringBuilder.append(c);
          }
          localStringBuilder.append(str3);
          n = 0;
        }
        i1 = 4;
        if (m > i1)
        {
          str1 = (String)paramList.get(4);
          i1 = str1.length();
          if (i1 > 0)
          {
            if (n == 0) {
              localStringBuilder.append(c);
            }
            i1 = 4;
            str1 = (String)paramList.get(i1);
            localStringBuilder.append(str1);
            n = 0;
          }
        }
        str1 = localStringBuilder.toString();
      }
    }
    for (;;)
    {
      return str1;
      str2 = (String)paramList.get(k);
      str3 = (String)paramList.get(0);
      break;
      if (m == k) {
        str1 = (String)paramList.get(0);
      } else {
        str1 = "";
      }
    }
  }
  
  public void addContactmethod(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = this.contactmethodList;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.contactmethodList = ((List)localObject);
    }
    ContactStruct.ContactMethod localContactMethod = new a_vcard/android/syncml/pim/vcard/ContactStruct$ContactMethod;
    localContactMethod.<init>();
    localContactMethod.kind = paramInt1;
    localContactMethod.type = paramInt2;
    localContactMethod.data = paramString1;
    localContactMethod.label = paramString2;
    localContactMethod.isPrimary = paramBoolean;
    this.contactmethodList.add(localContactMethod);
  }
  
  public void addExtension(PropertyNode paramPropertyNode)
  {
    Object localObject1 = paramPropertyNode.propValue;
    int i = ((String)localObject1).length();
    if (i == 0) {
      return;
    }
    String str = paramPropertyNode.propName;
    localObject1 = this.extensionMap;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.extensionMap = ((Map)localObject1);
    }
    localObject1 = this.extensionMap;
    boolean bool = ((Map)localObject1).containsKey(str);
    Object localObject2;
    if (!bool)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject1 = this.extensionMap;
      ((Map)localObject1).put(str, localObject2);
    }
    for (;;)
    {
      localObject1 = paramPropertyNode.encode();
      ((List)localObject2).add(localObject1);
      break;
      localObject1 = this.extensionMap;
      localObject2 = (List)((Map)localObject1).get(str);
    }
  }
  
  public void addOrganization(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = this.organizationList;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.organizationList = ((List)localObject);
    }
    ContactStruct.OrganizationData localOrganizationData = new a_vcard/android/syncml/pim/vcard/ContactStruct$OrganizationData;
    localOrganizationData.<init>();
    localOrganizationData.type = paramInt;
    localOrganizationData.companyName = paramString1;
    localOrganizationData.positionName = paramString2;
    localOrganizationData.isPrimary = paramBoolean;
    this.organizationList.add(localOrganizationData);
  }
  
  public void addPhone(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = this.phoneList;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.phoneList = ((List)localObject);
    }
    ContactStruct.PhoneData localPhoneData = new a_vcard/android/syncml/pim/vcard/ContactStruct$PhoneData;
    localPhoneData.<init>();
    localPhoneData.type = paramInt;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = paramString1.trim();
    int i = str.length();
    int j = 0;
    while (j < i)
    {
      char c1 = str.charAt(j);
      char c2 = '0';
      if (c2 <= c1)
      {
        c2 = '9';
        if (c1 <= c2) {}
      }
      else
      {
        if (j != 0) {
          break label131;
        }
        c2 = '+';
        if (c1 != c2) {
          break label131;
        }
      }
      localStringBuilder.append(c1);
      label131:
      j += 1;
    }
    localObject = PhoneNumberUtils.formatNumber(localStringBuilder.toString());
    localPhoneData.data = ((String)localObject);
    localPhoneData.label = paramString2;
    localPhoneData.isPrimary = paramBoolean;
    this.phoneList.add(localPhoneData);
  }
  
  public String displayString()
  {
    Object localObject = this.name;
    int i = ((String)localObject).length();
    if (i > 0) {
      localObject = this.name;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = this.contactmethodList;
      Iterator localIterator;
      if (localObject != null)
      {
        localObject = this.contactmethodList;
        i = ((List)localObject).size();
        if (i > 0)
        {
          localObject = this.contactmethodList;
          localIterator = ((List)localObject).iterator();
          ContactStruct.ContactMethod localContactMethod;
          boolean bool2;
          do
          {
            int j;
            int m;
            do
            {
              boolean bool1 = localIterator.hasNext();
              if (!bool1) {
                break;
              }
              localContactMethod = (ContactStruct.ContactMethod)localIterator.next();
              j = localContactMethod.kind;
              m = 1;
            } while (j != m);
            bool2 = localContactMethod.isPrimary;
          } while (!bool2);
          localObject = localContactMethod.data;
          continue;
        }
      }
      localObject = this.phoneList;
      if (localObject != null)
      {
        localObject = this.phoneList;
        int k = ((List)localObject).size();
        if (k > 0)
        {
          localObject = this.phoneList;
          localIterator = ((List)localObject).iterator();
          boolean bool3;
          ContactStruct.PhoneData localPhoneData;
          do
          {
            bool3 = localIterator.hasNext();
            if (!bool3) {
              break;
            }
            localPhoneData = (ContactStruct.PhoneData)localIterator.next();
            bool3 = localPhoneData.isPrimary;
          } while (!bool3);
          localObject = localPhoneData.data;
          continue;
        }
      }
      localObject = "";
    }
  }
  
  public boolean isIgnorable()
  {
    Object localObject = this.name;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    int i;
    if (bool)
    {
      localObject = this.phoneticName;
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = this.phoneList;
        if (localObject != null)
        {
          localObject = this.phoneList;
          i = ((List)localObject).size();
          if (i != 0) {}
        }
        else
        {
          localObject = this.contactmethodList;
          if (localObject != null)
          {
            localObject = this.contactmethodList;
            i = ((List)localObject).size();
            if (i != 0) {}
          }
          else
          {
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  public void setPosition(String paramString)
  {
    Object localObject = this.organizationList;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.organizationList = ((List)localObject);
    }
    localObject = this.organizationList;
    int i = ((List)localObject).size();
    if (i == 0)
    {
      int j = 2;
      String str = "";
      addOrganization(j, str, null, false);
      i = 1;
    }
    localObject = this.organizationList;
    int k = i + -1;
    ((ContactStruct.OrganizationData)((List)localObject).get(k)).positionName = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/vcard/ContactStruct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */