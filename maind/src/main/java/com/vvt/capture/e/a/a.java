package com.vvt.capture.e.a;

import com.vvt.im.events.info.ICallLogData;
import com.vvt.im.events.info.ICallLogData.IsMonitor;

public class a
  extends b
  implements ICallLogData
{
  private long c;
  private long d;
  private String e;
  private String f;
  private int g;
  private int h;
  private ICallLogData.IsMonitor i;
  
  public long a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(ICallLogData.IsMonitor paramIsMonitor)
  {
    this.i = paramIsMonitor;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
  
  public String c()
  {
    return this.f;
  }
  
  public int d()
  {
    return this.g;
  }
  
  public ICallLogData.IsMonitor e()
  {
    return this.i;
  }
  
  public int f()
  {
    return this.h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SkypeCallLogData {");
    Object localObject1 = localStringBuilder.append("id:");
    long l = this.c;
    ((StringBuilder)localObject1).append(l).append(", ");
    localObject1 = localStringBuilder.append("duration:");
    l = this.d;
    ((StringBuilder)localObject1).append(l).append(", ");
    Object localObject2 = localStringBuilder.append("userId:");
    localObject1 = this.e;
    if (localObject1 == null)
    {
      localObject1 = "";
      ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      localObject2 = localStringBuilder.append("contactName:");
      localObject1 = this.f;
      if (localObject1 != null) {
        break label193;
      }
    }
    label193:
    for (localObject1 = "";; localObject1 = this.f)
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
      localObject1 = this.e;
      break;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */