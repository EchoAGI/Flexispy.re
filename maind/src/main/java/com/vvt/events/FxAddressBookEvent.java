package com.vvt.events;

import android.telephony.PhoneNumberUtils;
import com.vvt.ag.b;
import com.vvt.ak.a;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FxAddressBookEvent
  extends FxEvent
{
  private static final boolean a = a.a;
  private long mClientId;
  private byte[] mContactPicture;
  private String mFirstName;
  private String mHomeEMail;
  private ArrayList mHomePhone;
  private String mLastName;
  private ArrayList mMobilePhone;
  private String mNote;
  private String mOtherEMail;
  private ArrayList mOtherPhone;
  private long mServerId;
  private byte[] mVCardData;
  private String mWorkEMail;
  private ArrayList mWorkPhone;
  
  public FxAddressBookEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mOtherPhone = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mHomePhone = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mMobilePhone = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mWorkPhone = localArrayList;
  }
  
  private int a(byte[] paramArrayOfByte)
  {
    String str;
    if (paramArrayOfByte == null) {
      str = "";
    }
    for (int i = str.hashCode();; i = Arrays.hashCode(paramArrayOfByte)) {
      return i;
    }
  }
  
  private String a(String paramString)
  {
    String str1;
    if (paramString == null) {
      str1 = "";
    }
    for (;;)
    {
      return str1;
      str1 = "null";
      boolean bool = paramString.equals(str1);
      if (bool)
      {
        str1 = "";
      }
      else
      {
        str1 = paramString.trim();
        String str2 = "";
        bool = str1.equals(str2);
        if (bool)
        {
          str1 = "";
        }
        else
        {
          str1 = null;
          bool = paramString.equals(null);
          if (bool) {
            str1 = "";
          } else {
            str1 = paramString.trim();
          }
        }
      }
    }
  }
  
  private String a(ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(", ");
      localStringBuilder2.append(str);
    }
    return localStringBuilder1.toString();
  }
  
  private boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = 1;
    int j = paramArrayList1.size();
    if (j == 0)
    {
      j = paramArrayList2.size();
      if (j == 0) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      Iterator localIterator1 = paramArrayList1.iterator();
      boolean bool = localIterator1.hasNext();
      String str1;
      if (bool)
      {
        str1 = (String)localIterator1.next();
        String str2 = a(str1);
        Iterator localIterator2 = paramArrayList2.iterator();
        do
        {
          bool = localIterator2.hasNext();
          if (!bool) {
            break;
          }
          str1 = (String)localIterator2.next();
          bool = PhoneNumberUtils.compare(str2, str1);
        } while (!bool);
        bool = i;
      }
      else
      {
        bool = false;
        str1 = null;
      }
    }
  }
  
  public void addHomePhone(String paramString)
  {
    this.mHomePhone.add(paramString);
  }
  
  public void addMobilePhone(String paramString)
  {
    this.mMobilePhone.add(paramString);
  }
  
  public void addOtherNumber(String paramString)
  {
    this.mOtherPhone.add(paramString);
  }
  
  public void addWorkPhone(String paramString)
  {
    this.mWorkPhone.add(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        boolean bool2 = paramObject instanceof FxAddressBookEvent;
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (FxAddressBookEvent)paramObject;
          String str1 = this.mFirstName;
          str1 = a(str1);
          String str2 = ((FxAddressBookEvent)paramObject).mFirstName;
          str2 = a(str2);
          bool2 = str1.equals(str2);
          str2 = this.mLastName;
          str2 = a(str2);
          Object localObject1 = ((FxAddressBookEvent)paramObject).mLastName;
          localObject1 = a((String)localObject1);
          boolean bool3 = str2.equals(localObject1);
          localObject1 = this.mHomePhone;
          ArrayList localArrayList1 = ((FxAddressBookEvent)paramObject).getHomePhones();
          boolean bool4 = a((ArrayList)localObject1, localArrayList1);
          localArrayList1 = this.mMobilePhone;
          ArrayList localArrayList2 = ((FxAddressBookEvent)paramObject).getMobilePhones();
          boolean bool5 = a(localArrayList1, localArrayList2);
          localArrayList2 = this.mWorkPhone;
          Object localObject2 = ((FxAddressBookEvent)paramObject).getWorkPhones();
          boolean bool6 = a(localArrayList2, (ArrayList)localObject2);
          localObject2 = this.mHomeEMail;
          localObject2 = a((String)localObject2);
          String str3 = ((FxAddressBookEvent)paramObject).mHomeEMail;
          str3 = a(str3);
          boolean bool7 = ((String)localObject2).equals(str3);
          str3 = this.mWorkEMail;
          str3 = a(str3);
          String str4 = ((FxAddressBookEvent)paramObject).mWorkEMail;
          str4 = a(str4);
          boolean bool8 = str3.equals(str4);
          str4 = this.mOtherEMail;
          str4 = a(str4);
          String str5 = ((FxAddressBookEvent)paramObject).mOtherEMail;
          str5 = a(str5);
          boolean bool9 = str4.equals(str5);
          str5 = this.mNote;
          str5 = a(str5);
          String str6 = ((FxAddressBookEvent)paramObject).mNote;
          str6 = a(str6);
          boolean bool10 = str5.equals(str6);
          if ((!bool2) || (!bool3) || (!bool4) || (!bool5) || (!bool6) || (!bool7) || (!bool8) || (!bool9) || (!bool10)) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public long getClientId()
  {
    return this.mClientId;
  }
  
  public byte[] getContactPicture()
  {
    return this.mContactPicture;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.ADDRESS_BOOK;
  }
  
  public String getFirstName()
  {
    return this.mFirstName;
  }
  
  public String getHomeEMail()
  {
    return this.mHomeEMail;
  }
  
  public ArrayList getHomePhones()
  {
    return this.mHomePhone;
  }
  
  public String getLastName()
  {
    return this.mLastName;
  }
  
  public ArrayList getMobilePhones()
  {
    return this.mMobilePhone;
  }
  
  public String getNote()
  {
    return this.mNote;
  }
  
  public String getOtherEMail()
  {
    return this.mOtherEMail;
  }
  
  public ArrayList getOtherNumbers()
  {
    return this.mOtherPhone;
  }
  
  public long getServerId()
  {
    return this.mServerId;
  }
  
  public byte[] getVCardData()
  {
    return this.mVCardData;
  }
  
  public String getWorkEMail()
  {
    return this.mWorkEMail;
  }
  
  public ArrayList getWorkPhones()
  {
    return this.mWorkPhone;
  }
  
  public int hashCode()
  {
    Object localObject = this.mFirstName;
    int i = a((String)localObject).hashCode();
    int j = 31 + i;
    localObject = this.mLastName;
    i = a((String)localObject).hashCode();
    j += i;
    localObject = this.mHomePhone;
    i = a((ArrayList)localObject).hashCode();
    j += i;
    localObject = this.mMobilePhone;
    i = a((ArrayList)localObject).hashCode();
    j += i;
    localObject = this.mWorkPhone;
    i = a((ArrayList)localObject).hashCode();
    j += i;
    localObject = this.mWorkPhone;
    i = a((ArrayList)localObject).hashCode();
    j += i;
    localObject = this.mHomeEMail;
    i = a((String)localObject).hashCode();
    j += i;
    localObject = this.mWorkEMail;
    i = a((String)localObject).hashCode();
    j += i;
    localObject = this.mNote;
    i = a((String)localObject).hashCode();
    j += i;
    localObject = this.mContactPicture;
    i = a((byte[])localObject);
    return j + i;
  }
  
  public boolean isValidContact()
  {
    Object localObject = this.mFirstName;
    boolean bool1 = b.a((String)localObject);
    if (bool1)
    {
      localObject = this.mLastName;
      bool1 = b.a((String)localObject);
      if (bool1)
      {
        localObject = this.mHomePhone;
        int i = ((ArrayList)localObject).size();
        if (i == 0)
        {
          localObject = this.mMobilePhone;
          i = ((ArrayList)localObject).size();
          if (i == 0)
          {
            localObject = this.mWorkPhone;
            i = ((ArrayList)localObject).size();
            if (i == 0)
            {
              localObject = this.mHomeEMail;
              bool2 = b.a((String)localObject);
              if (bool2)
              {
                localObject = this.mWorkEMail;
                bool2 = b.a((String)localObject);
                if (bool2) {
                  break label102;
                }
              }
            }
          }
        }
      }
    }
    boolean bool2 = true;
    for (;;)
    {
      return bool2;
      label102:
      bool2 = false;
      localObject = null;
    }
  }
  
  public void setClientId(long paramLong)
  {
    this.mClientId = paramLong;
  }
  
  public void setContactPicture(byte[] paramArrayOfByte)
  {
    this.mContactPicture = paramArrayOfByte;
  }
  
  public void setFirstName(String paramString)
  {
    this.mFirstName = paramString;
  }
  
  public void setHomeEMail(String paramString)
  {
    this.mHomeEMail = paramString;
  }
  
  public void setLastName(String paramString)
  {
    this.mLastName = paramString;
  }
  
  public void setNote(String paramString)
  {
    this.mNote = paramString;
  }
  
  public void setOtherEMail(String paramString)
  {
    this.mOtherEMail = paramString;
  }
  
  public void setServerId(long paramLong)
  {
    this.mServerId = paramLong;
  }
  
  public void setVCardData(byte[] paramArrayOfByte)
  {
    this.mVCardData = paramArrayOfByte;
  }
  
  public void setWorkEMail(String paramString)
  {
    this.mWorkEMail = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxAddressBookEvent {");
    Object localObject1 = localStringBuilder1.append(" AddressBookid =");
    long l = this.mClientId;
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", FirstName =");
    Object localObject2 = this.mFirstName;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", LastName =");
    localObject2 = this.mLastName;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.mHomePhone;
    int i = ((ArrayList)localObject1).size();
    StringBuilder localStringBuilder2;
    if (i > 0)
    {
      localObject1 = this.mHomePhone;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localStringBuilder2 = localStringBuilder1.append(", HomePhone =");
        localStringBuilder2.append((String)localObject1);
      }
    }
    localObject1 = ", HomePhone =";
    localStringBuilder1.append((String)localObject1);
    localObject1 = this.mMobilePhone;
    int j = ((ArrayList)localObject1).size();
    if (j > 0)
    {
      localObject1 = this.mMobilePhone;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localStringBuilder2 = localStringBuilder1.append(", MobilePhone =");
        localStringBuilder2.append((String)localObject1);
      }
    }
    localObject1 = ", MobilePhone =";
    localStringBuilder1.append((String)localObject1);
    localObject1 = this.mWorkPhone;
    int k = ((ArrayList)localObject1).size();
    if (k > 0)
    {
      localObject1 = this.mWorkPhone;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localStringBuilder2 = localStringBuilder1.append(", WorkPhone =");
        localStringBuilder2.append((String)localObject1);
      }
    }
    localObject1 = ", WorkPhone =";
    localStringBuilder1.append((String)localObject1);
    localObject1 = this.mOtherPhone;
    int m = ((ArrayList)localObject1).size();
    if (m > 0)
    {
      localObject1 = this.mOtherPhone;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool4 = ((Iterator)localObject2).hasNext();
        if (!bool4) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localStringBuilder2 = localStringBuilder1.append(", OtherPhone =");
        localStringBuilder2.append((String)localObject1);
      }
    }
    localObject1 = ", OtherPhone =";
    localStringBuilder1.append((String)localObject1);
    localObject1 = localStringBuilder1.append(", HomeEMail =");
    localObject2 = this.mHomeEMail;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", WorkEMail =");
    localObject2 = this.mWorkEMail;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", OtherEMail =");
    localObject2 = this.mOtherEMail;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", Note =");
    localObject2 = this.mNote;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    ((StringBuilder)localObject1).append(l);
    localObject1 = this.mContactPicture;
    int n;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", ContactPicture Size=");
      localObject2 = this.mContactPicture;
      n = localObject2.length;
      ((StringBuilder)localObject1).append(n);
    }
    localObject1 = this.mVCardData;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", VCardData Size =");
      localObject2 = this.mVCardData;
      n = localObject2.length;
      ((StringBuilder)localObject1).append(n);
    }
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAddressBookEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */