package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_config
  extends TLObject
{
  public static int constructor = 112969208;
  public int chat_big_size;
  public int chat_size_max;
  public int date;
  public ArrayList dc_options;
  public ArrayList disabled_features;
  public int expires;
  public int forwarded_count_max;
  public int megagroup_size_max;
  public int notify_cloud_delay_ms;
  public int notify_default_delay_ms;
  public int offline_blur_timeout_ms;
  public int offline_idle_timeout_ms;
  public int online_cloud_timeout_ms;
  public int online_update_period_ms;
  public int push_chat_limit;
  public int push_chat_period_ms;
  public int saved_gifs_limit;
  public boolean test_mode;
  public int this_dc;
  
  public TLRPC$TL_config()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.dc_options = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.disabled_features = localArrayList;
  }
  
  public static TL_config TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_config", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_config)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_config;
      ((TL_config)localObject).<init>();
      ((TL_config)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = m;
    m = paramAbstractSerializedData.readInt32(paramBoolean);
    this.expires = m;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.test_mode = bool;
    int n = paramAbstractSerializedData.readInt32(paramBoolean);
    this.this_dc = n;
    n = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1;
    Object localObject2;
    Integer localInteger;
    int i1;
    Object localObject3;
    if (n != i)
    {
      if (paramBoolean)
      {
        localObject1 = new java/lang/RuntimeException;
        localObject2 = new Object[j];
        localInteger = Integer.valueOf(n);
        localObject2[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
        ((RuntimeException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      n = 0;
      localInteger = null;
      if (n >= i1) {
        break label190;
      }
      int i2 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.TL_dcOption.TLdeserialize(paramAbstractSerializedData, i2, paramBoolean);
      if (localObject3 != null) {
        break label167;
      }
    }
    label167:
    label190:
    label476:
    for (;;)
    {
      return;
      localObject2 = this.dc_options;
      ((ArrayList)localObject2).add(localObject3);
      n += 1;
      break;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.chat_size_max = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.megagroup_size_max = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.forwarded_count_max = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.online_update_period_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.offline_blur_timeout_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.offline_idle_timeout_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.online_cloud_timeout_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.notify_cloud_delay_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.notify_default_delay_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.chat_big_size = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.push_chat_period_ms = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.push_chat_limit = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      this.saved_gifs_limit = n;
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      if (n != i)
      {
        if (paramBoolean)
        {
          localObject1 = new java/lang/RuntimeException;
          localObject2 = new Object[j];
          localInteger = Integer.valueOf(n);
          localObject2[0] = localInteger;
          str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
          ((RuntimeException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        n = paramAbstractSerializedData.readInt32(paramBoolean);
        for (;;)
        {
          if (k >= n) {
            break label476;
          }
          i1 = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject1 = TLRPC.TL_disabledFeature.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
          if (localObject1 == null) {
            break;
          }
          localObject3 = this.disabled_features;
          ((ArrayList)localObject3).add(localObject1);
          k += 1;
        }
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = 481674261;
    int j = 0;
    int k = constructor;
    paramAbstractSerializedData.writeInt32(k);
    k = this.date;
    paramAbstractSerializedData.writeInt32(k);
    k = this.expires;
    paramAbstractSerializedData.writeInt32(k);
    boolean bool = this.test_mode;
    paramAbstractSerializedData.writeBool(bool);
    int m = this.this_dc;
    paramAbstractSerializedData.writeInt32(m);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.dc_options;
    int n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    for (int i1 = 0; i1 < n; i1 = m)
    {
      localObject = (TLRPC.TL_dcOption)this.dc_options.get(i1);
      ((TLRPC.TL_dcOption)localObject).serializeToStream(paramAbstractSerializedData);
      m = i1 + 1;
    }
    m = this.chat_size_max;
    paramAbstractSerializedData.writeInt32(m);
    m = this.megagroup_size_max;
    paramAbstractSerializedData.writeInt32(m);
    m = this.forwarded_count_max;
    paramAbstractSerializedData.writeInt32(m);
    m = this.online_update_period_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.offline_blur_timeout_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.offline_idle_timeout_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.online_cloud_timeout_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.notify_cloud_delay_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.notify_default_delay_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.chat_big_size;
    paramAbstractSerializedData.writeInt32(m);
    m = this.push_chat_period_ms;
    paramAbstractSerializedData.writeInt32(m);
    m = this.push_chat_limit;
    paramAbstractSerializedData.writeInt32(m);
    m = this.saved_gifs_limit;
    paramAbstractSerializedData.writeInt32(m);
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.disabled_features;
    i1 = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(i1);
    while (j < i1)
    {
      localObject = (TLRPC.TL_disabledFeature)this.disabled_features.get(j);
      ((TLRPC.TL_disabledFeature)localObject).serializeToStream(paramAbstractSerializedData);
      m = j + 1;
      j = m;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_config.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */