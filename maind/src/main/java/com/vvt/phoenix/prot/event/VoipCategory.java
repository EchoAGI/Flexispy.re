package com.vvt.phoenix.prot.event;

public enum VoipCategory
{
  private int value;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("GOOGLE_TALK", m, m);
    GOOGLE_TALK = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("YAHOO", k, k);
    YAHOO = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("SKYPE", j, j);
    SKYPE = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("LINE", i, i);
    LINE = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("FACETIME", 5, 5);
    FACETIME = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("FACEBOOK", 6, 6);
    FACEBOOK = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("VIBER", 7, 7);
    VIBER = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("WECHAT", 8, 8);
    WECHAT = (VoipCategory)localObject;
    localObject = new com/vvt/phoenix/prot/event/VoipCategory;
    ((VoipCategory)localObject).<init>("WHATSAPP", 9, 9);
    WHATSAPP = (VoipCategory)localObject;
    localObject = new VoipCategory[10];
    VoipCategory localVoipCategory1 = UNKNOWN;
    localObject[0] = localVoipCategory1;
    localVoipCategory1 = GOOGLE_TALK;
    localObject[m] = localVoipCategory1;
    localVoipCategory1 = YAHOO;
    localObject[k] = localVoipCategory1;
    localVoipCategory1 = SKYPE;
    localObject[j] = localVoipCategory1;
    localVoipCategory1 = LINE;
    localObject[i] = localVoipCategory1;
    VoipCategory localVoipCategory2 = FACETIME;
    localObject[5] = localVoipCategory2;
    localVoipCategory2 = FACEBOOK;
    localObject[6] = localVoipCategory2;
    localVoipCategory2 = VIBER;
    localObject[7] = localVoipCategory2;
    localVoipCategory2 = WECHAT;
    localObject[8] = localVoipCategory2;
    localVoipCategory2 = WHATSAPP;
    localObject[9] = localVoipCategory2;
    a = (VoipCategory[])localObject;
  }
  
  private VoipCategory(int paramInt1)
  {
    this.value = paramInt1;
  }
  
  public int getValue()
  {
    return this.value;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/VoipCategory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */