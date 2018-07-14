package com.vvt.network;

public class NetworkServiceInfo
{
  private NetworkServiceInfo.State a;
  private NetworkServiceInfo.Type b;
  
  public NetworkServiceInfo()
  {
    Object localObject = NetworkServiceInfo.State.UNKNOWN;
    this.a = ((NetworkServiceInfo.State)localObject);
    localObject = NetworkServiceInfo.Type.UNKNOWN;
    this.b = ((NetworkServiceInfo.Type)localObject);
  }
  
  public NetworkServiceInfo.State a()
  {
    return this.a;
  }
  
  public void a(NetworkServiceInfo.State paramState)
  {
    this.a = paramState;
  }
  
  public void a(NetworkServiceInfo.Type paramType)
  {
    this.b = paramType;
  }
  
  public NetworkServiceInfo.Type b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    Object localObject2;
    boolean bool;
    if (paramObject != null)
    {
      Object localObject1 = this.a;
      localObject2 = paramObject;
      localObject2 = ((NetworkServiceInfo)paramObject).a();
      if (localObject1 == localObject2)
      {
        localObject2 = this.b;
        paramObject = (NetworkServiceInfo)paramObject;
        localObject1 = ((NetworkServiceInfo)paramObject).b();
        if (localObject2 == localObject1) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject2 = null;
      continue;
      bool = false;
      localObject2 = null;
    }
  }
  
  public int hashCode()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.a.toString();
    localStringBuilder = localStringBuilder.append(str);
    str = this.b.toString();
    return str.hashCode();
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.a.toString();
    arrayOfObject[0] = str;
    str = this.b.toString();
    arrayOfObject[1] = str;
    return String.format("NetworkInfo: state=%s, type=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/network/NetworkServiceInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */