package com.vvt.capture.sms;

public enum TextComparisonMode
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/capture/sms/TextComparisonMode;
    ((TextComparisonMode)localObject).<init>("CONTAINS", 0);
    CONTAINS = (TextComparisonMode)localObject;
    localObject = new com/vvt/capture/sms/TextComparisonMode;
    ((TextComparisonMode)localObject).<init>("STARTWITH", i);
    STARTWITH = (TextComparisonMode)localObject;
    localObject = new TextComparisonMode[2];
    TextComparisonMode localTextComparisonMode = CONTAINS;
    localObject[0] = localTextComparisonMode;
    localTextComparisonMode = STARTWITH;
    localObject[i] = localTextComparisonMode;
    a = (TextComparisonMode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/TextComparisonMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */