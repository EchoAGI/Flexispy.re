package com.vvt.pushnotification.connectionhistory;

public class b
  implements a
{
  public int a = 5;
  private String b;
  
  public b(String paramString)
  {
    this.b = paramString;
  }
  
  public PushConnectionHistoryEntry a()
  {
    try
    {
      Object localObject1 = new com/vvt/pushnotification/connectionhistory/c;
      String str = this.b;
      ((c)localObject1).<init>(str);
      localObject1 = ((c)localObject1).e();
      return (PushConnectionHistoryEntry)localObject1;
    }
    finally {}
  }
  
  public void a(PushConnectionHistoryEntry paramPushConnectionHistoryEntry)
  {
    try
    {
      c localc = new com/vvt/pushnotification/connectionhistory/c;
      String str = this.b;
      localc.<init>(str);
      int i = localc.c();
      int j = this.a;
      if (i >= j) {
        localc.d();
      }
      localc.a(paramPushConnectionHistoryEntry);
      return;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */