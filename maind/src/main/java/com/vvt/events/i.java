package com.vvt.events;

public class i
{
  private int a;
  private String b;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxSettingElement {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" settingID =");
    int i = this.a;
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(" settingValue =");
    String str = this.b;
    localStringBuilder2.append(str);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */