package com.vvt.productinfo;

import java.io.Serializable;

public class ProductInfoImpl
  implements a, Serializable
{
  private static final long serialVersionUID = -5082705228632235683L;
  private String productDescription;
  private int productId;
  private byte productLanguage;
  private String productName;
  private String productVersion;
  private String protocolHashTail;
  
  public String getProductDescription()
  {
    return this.productDescription;
  }
  
  public int getProductId()
  {
    return this.productId;
  }
  
  public byte getProductLanguage()
  {
    return this.productLanguage;
  }
  
  public String getProductName()
  {
    return this.productName;
  }
  
  public String getProductVersion()
  {
    return this.productVersion;
  }
  
  public String getProtocolHashTail()
  {
    return this.protocolHashTail;
  }
  
  public void setProductDescription(String paramString)
  {
    this.productDescription = paramString;
  }
  
  public void setProductId(int paramInt)
  {
    this.productId = paramInt;
  }
  
  public void setProductLanguage(byte paramByte)
  {
    this.productLanguage = paramByte;
  }
  
  public void setProductName(String paramString)
  {
    this.productName = paramString;
  }
  
  public void setProductVersion(String paramString)
  {
    this.productVersion = paramString;
  }
  
  public void setProtocolHashTail(String paramString)
  {
    this.protocolHashTail = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/productinfo/ProductInfoImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */