package com.vvt.al.d;

public class a
{
  public String a = "";
  public long b = -1;
  public String c = "";
  
  public a(String paramString1, long paramLong, String paramString2)
  {
    this.a = paramString1;
    this.b = paramLong;
    this.c = paramString2;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.a;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.b);
    arrayOfObject[1] = localObject;
    localObject = this.c;
    arrayOfObject[2] = localObject;
    return String.format("CallRecordingEntry {f: %s, ts: %d, pkg: %s}", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */