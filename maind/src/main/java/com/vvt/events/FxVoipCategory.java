package com.vvt.events;

public enum FxVoipCategory
{
  private int value;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("GOOGLE_TALK", m, m);
    GOOGLE_TALK = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("YAHOO", k, k);
    YAHOO = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("SKYPE", j, j);
    SKYPE = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("LINE", i, i);
    LINE = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("FACETIME", 5, 5);
    FACETIME = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("FACEBOOK", 6, 6);
    FACEBOOK = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("VIBER", 7, 7);
    VIBER = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("WECHAT", 8, 8);
    WECHAT = (FxVoipCategory)localObject;
    localObject = new com/vvt/events/FxVoipCategory;
    ((FxVoipCategory)localObject).<init>("WHATSAPP", 9, 9);
    WHATSAPP = (FxVoipCategory)localObject;
    localObject = new FxVoipCategory[10];
    FxVoipCategory localFxVoipCategory1 = UNKNOWN;
    localObject[0] = localFxVoipCategory1;
    localFxVoipCategory1 = GOOGLE_TALK;
    localObject[m] = localFxVoipCategory1;
    localFxVoipCategory1 = YAHOO;
    localObject[k] = localFxVoipCategory1;
    localFxVoipCategory1 = SKYPE;
    localObject[j] = localFxVoipCategory1;
    localFxVoipCategory1 = LINE;
    localObject[i] = localFxVoipCategory1;
    FxVoipCategory localFxVoipCategory2 = FACETIME;
    localObject[5] = localFxVoipCategory2;
    localFxVoipCategory2 = FACEBOOK;
    localObject[6] = localFxVoipCategory2;
    localFxVoipCategory2 = VIBER;
    localObject[7] = localFxVoipCategory2;
    localFxVoipCategory2 = WECHAT;
    localObject[8] = localFxVoipCategory2;
    localFxVoipCategory2 = WHATSAPP;
    localObject[9] = localFxVoipCategory2;
    a = (FxVoipCategory[])localObject;
  }
  
  private FxVoipCategory(int paramInt1)
  {
    this.value = paramInt1;
  }
  
  public static FxVoipCategory forValue(int paramInt)
  {
    return values()[paramInt];
  }
  
  public int getValue()
  {
    return this.value;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVoipCategory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */