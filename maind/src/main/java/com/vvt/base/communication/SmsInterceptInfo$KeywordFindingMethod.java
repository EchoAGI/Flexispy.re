package com.vvt.base.communication;

public enum SmsInterceptInfo$KeywordFindingMethod
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("NOT_SPECIFIED", 0);
    NOT_SPECIFIED = (KeywordFindingMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("START_WITH", m);
    START_WITH = (KeywordFindingMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("CONTAINS", k);
    CONTAINS = (KeywordFindingMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("END_WITH", j);
    END_WITH = (KeywordFindingMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("PATTERN_MATCHED", i);
    PATTERN_MATCHED = (KeywordFindingMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod;
    ((KeywordFindingMethod)localObject).<init>("CONTAINS_PHONE_NUMBER", 5);
    CONTAINS_PHONE_NUMBER = (KeywordFindingMethod)localObject;
    localObject = new KeywordFindingMethod[6];
    KeywordFindingMethod localKeywordFindingMethod1 = NOT_SPECIFIED;
    localObject[0] = localKeywordFindingMethod1;
    localKeywordFindingMethod1 = START_WITH;
    localObject[m] = localKeywordFindingMethod1;
    localKeywordFindingMethod1 = CONTAINS;
    localObject[k] = localKeywordFindingMethod1;
    localKeywordFindingMethod1 = END_WITH;
    localObject[j] = localKeywordFindingMethod1;
    localKeywordFindingMethod1 = PATTERN_MATCHED;
    localObject[i] = localKeywordFindingMethod1;
    KeywordFindingMethod localKeywordFindingMethod2 = CONTAINS_PHONE_NUMBER;
    localObject[5] = localKeywordFindingMethod2;
    a = (KeywordFindingMethod[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/communication/SmsInterceptInfo$KeywordFindingMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */