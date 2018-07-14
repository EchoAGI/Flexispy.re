package com.vvt.capture.viber;

import com.vvt.im.events.info.ICallLogData;
import com.vvt.im.events.info.ICallLogData.IsMonitor;

public class a
  extends c
  implements ICallLogData
{
  private long b;
  private long c;
  private String d;
  private String e;
  private int f;
  private ICallLogData.IsMonitor g;
  private int h;
  
  public long a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(ICallLogData.IsMonitor paramIsMonitor)
  {
    this.g = paramIsMonitor;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public int d()
  {
    return this.f;
  }
  
  public ICallLogData.IsMonitor e()
  {
    return this.g;
  }
  
  public int f()
  {
    return this.h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ViberCallLogData {");
    Object localObject1 = localStringBuilder.append("id:");
    long l = this.b;
    ((StringBuilder)localObject1).append(l).append(", ");
    localObject1 = localStringBuilder.append("duration:");
    l = this.c;
    ((StringBuilder)localObject1).append(l).append(", ");
    Object localObject2 = localStringBuilder.append("userId:");
    localObject1 = this.d;
    if (localObject1 == null)
    {
      localObject1 = "";
      ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      localObject2 = localStringBuilder.append("contactName:");
      localObject1 = this.e;
      if (localObject1 != null) {
        break label193;
      }
    }
    label193:
    for (localObject1 = "";; localObject1 = this.e)
    {
      ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      localObject1 = localStringBuilder.append("time:");
      l = h();
      ((StringBuilder)localObject1).append(l).append(", ");
      localObject1 = localStringBuilder.append("direction:");
      localObject2 = i();
      ((StringBuilder)localObject1).append(localObject2).append(", ");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localObject1 = this.d;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */