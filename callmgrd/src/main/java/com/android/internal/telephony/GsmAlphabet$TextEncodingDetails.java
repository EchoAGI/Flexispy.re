package com.android.internal.telephony;

public class GsmAlphabet$TextEncodingDetails
{
  public int codeUnitCount;
  public int codeUnitSize;
  public int codeUnitsRemaining;
  public int languageShiftTable;
  public int languageTable;
  public int msgCount;
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("TextEncodingDetails { msgCount=");
    int i = this.msgCount;
    localStringBuilder = localStringBuilder.append(i).append(", codeUnitCount=");
    i = this.codeUnitCount;
    localStringBuilder = localStringBuilder.append(i).append(", codeUnitsRemaining=");
    i = this.codeUnitsRemaining;
    localStringBuilder = localStringBuilder.append(i).append(", codeUnitSize=");
    i = this.codeUnitSize;
    localStringBuilder = localStringBuilder.append(i).append(", languageTable=");
    i = this.languageTable;
    localStringBuilder = localStringBuilder.append(i).append(", languageShiftTable=");
    i = this.languageShiftTable;
    return i + " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/GsmAlphabet$TextEncodingDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */