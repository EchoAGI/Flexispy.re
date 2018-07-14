package com.vvt.im.events;

import java.util.HashMap;
import java.util.Map;

public enum ImMediaFileType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/im/events/ImMediaFileType;
    ((ImMediaFileType)localObject1).<init>("OWNER_PROFILE", 0, 0);
    OWNER_PROFILE = (ImMediaFileType)localObject1;
    localObject1 = new com/vvt/im/events/ImMediaFileType;
    ((ImMediaFileType)localObject1).<init>("USER_PROFILE", m, m);
    USER_PROFILE = (ImMediaFileType)localObject1;
    localObject1 = new com/vvt/im/events/ImMediaFileType;
    ((ImMediaFileType)localObject1).<init>("THUMBMAIL", k, k);
    THUMBMAIL = (ImMediaFileType)localObject1;
    localObject1 = new com/vvt/im/events/ImMediaFileType;
    ((ImMediaFileType)localObject1).<init>("ATTACHMENT", j, j);
    ATTACHMENT = (ImMediaFileType)localObject1;
    localObject1 = new com/vvt/im/events/ImMediaFileType;
    ((ImMediaFileType)localObject1).<init>("CONVERSATION_PROFILE", i, i);
    CONVERSATION_PROFILE = (ImMediaFileType)localObject1;
    int i1 = 5;
    localObject1 = new ImMediaFileType[i1];
    ImMediaFileType localImMediaFileType = OWNER_PROFILE;
    localObject1[0] = localImMediaFileType;
    localImMediaFileType = USER_PROFILE;
    localObject1[m] = localImMediaFileType;
    localImMediaFileType = THUMBMAIL;
    localObject1[k] = localImMediaFileType;
    localImMediaFileType = ATTACHMENT;
    localObject1[j] = localImMediaFileType;
    localImMediaFileType = CONVERSATION_PROFILE;
    localObject1[i] = localImMediaFileType;
    b = (ImMediaFileType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i2 = localObject1.length;
    while (n < i2)
    {
      Object localObject2 = localObject1[n];
      Map localMap = a;
      j = ((ImMediaFileType)localObject2).number;
      Integer localInteger = Integer.valueOf(j);
      localMap.put(localInteger, localObject2);
      n += 1;
    }
  }
  
  private ImMediaFileType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/ImMediaFileType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */