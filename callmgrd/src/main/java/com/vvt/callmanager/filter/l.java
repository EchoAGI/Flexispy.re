package com.vvt.callmanager.filter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;

class l
  extends Handler
{
  l(k paramk) {}
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = paramMessage.getData();
    Object localObject2 = "DATA_NEW_SMS";
    localObject1 = ((Bundle)localObject1).getByteArray((String)localObject2);
    if (localObject1 != null)
    {
      int i = localObject1.length;
      if (i > 0)
      {
        localObject1 = i.a((byte[])localObject1);
        localObject2 = this.a.c;
        FilterSms.b((FilterSms)localObject2, (Parcel)localObject1);
      }
    }
    for (;;)
    {
      return;
      boolean bool = FilterSms.c();
      if (!bool) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */