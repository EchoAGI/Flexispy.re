package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FxPanicImageEvent
  extends FxEvent
{
  private int actualDuration;
  private String actualFullPath;
  private int actualSize;
  private String areaCode;
  private int cellId;
  private String cellName;
  private String countryCode;
  private FxMediaType format;
  private c geoTag;
  private byte[] imageData;
  private String networkId;
  private String networkName;
  
  public int getActualDuration()
  {
    return this.actualDuration;
  }
  
  public String getActualFullPath()
  {
    return this.actualFullPath;
  }
  
  public int getActualSize()
  {
    return this.actualSize;
  }
  
  public String getAreaCode()
  {
    return this.areaCode;
  }
  
  public int getCellId()
  {
    return this.cellId;
  }
  
  public String getCellName()
  {
    return this.cellName;
  }
  
  public String getCountryCode()
  {
    return this.countryCode;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.PANIC_IMAGE;
  }
  
  public FxMediaType getFormat()
  {
    return this.format;
  }
  
  public c getGeoTag()
  {
    return this.geoTag;
  }
  
  public byte[] getImageData()
  {
    return this.imageData;
  }
  
  public String getNetworkId()
  {
    return this.networkId;
  }
  
  public String getNetworkName()
  {
    return this.networkName;
  }
  
  public void setActualDuration(int paramInt)
  {
    this.actualDuration = paramInt;
  }
  
  public void setActualFullPath(String paramString)
  {
    this.actualFullPath = paramString;
  }
  
  public void setActualSize(int paramInt)
  {
    this.actualSize = paramInt;
  }
  
  public void setAreaCode(String paramString)
  {
    this.areaCode = paramString;
  }
  
  public void setCellId(int paramInt)
  {
    this.cellId = paramInt;
  }
  
  public void setCellName(String paramString)
  {
    this.cellName = paramString;
  }
  
  public void setCountryCode(String paramString)
  {
    this.countryCode = paramString;
  }
  
  public void setFormat(FxMediaType paramFxMediaType)
  {
    this.format = paramFxMediaType;
  }
  
  public void setGeoTag(c paramc)
  {
    this.geoTag = paramc;
  }
  
  public void setImageData(byte[] paramArrayOfByte)
  {
    this.imageData = paramArrayOfByte;
  }
  
  public void setNetworkId(String paramString)
  {
    this.networkId = paramString;
  }
  
  public void setNetworkName(String paramString)
  {
    this.networkName = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxPanicGpsEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(", networkName =");
    Object localObject2 = getNetworkName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", networkId =");
    localObject2 = getNetworkId();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", cellName =");
    localObject2 = getCellName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", cellId =");
    int i = getCellId();
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder1.append(", countryCode =");
    localObject2 = getCountryCode();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", areaCode =");
    localObject2 = getAreaCode();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", format =");
    localObject2 = getFormat();
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder1.append(", actualSize =");
    i = getActualSize();
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder1.append(", actualDuration =");
    i = getActualDuration();
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder1.append(", actualFullPath =");
    localObject2 = getActualFullPath();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.geoTag;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder1.append(", GeoTag =");
      localObject2 = this.geoTag.toString();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = new java/util/Date;
    l = super.getEventTime();
    ((Date)localObject1).<init>(l);
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>();
    localStringBuilder2 = localStringBuilder2.append(" EventTime = ");
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd hh:mm:ss");
    localObject1 = localSimpleDateFormat.format((Date)localObject1);
    localObject1 = (String)localObject1;
    localStringBuilder1.append((String)localObject1);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxPanicImageEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */