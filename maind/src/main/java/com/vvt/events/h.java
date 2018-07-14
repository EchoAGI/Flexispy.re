package com.vvt.events;

public class h
{
  private FxRecipientType a;
  private String b;
  private String c;
  
  public FxRecipientType a()
  {
    return this.a;
  }
  
  public void a(FxRecipientType paramFxRecipientType)
  {
    this.a = paramFxRecipientType;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.a;
    arrayOfObject[0] = localObject;
    localObject = this.c;
    arrayOfObject[1] = localObject;
    localObject = this.b;
    arrayOfObject[2] = localObject;
    return String.format("%s: %s(%s)", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */