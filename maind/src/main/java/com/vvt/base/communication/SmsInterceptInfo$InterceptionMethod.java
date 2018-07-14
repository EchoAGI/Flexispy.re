package com.vvt.base.communication;

public enum SmsInterceptInfo$InterceptionMethod
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/base/communication/SmsInterceptInfo$InterceptionMethod;
    ((InterceptionMethod)localObject).<init>("NOT_INTERCEPT", 0);
    NOT_INTERCEPT = (InterceptionMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$InterceptionMethod;
    ((InterceptionMethod)localObject).<init>("FORWARD_ONLY", k);
    FORWARD_ONLY = (InterceptionMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$InterceptionMethod;
    ((InterceptionMethod)localObject).<init>("HIDE_ONLY", j);
    HIDE_ONLY = (InterceptionMethod)localObject;
    localObject = new com/vvt/base/communication/SmsInterceptInfo$InterceptionMethod;
    ((InterceptionMethod)localObject).<init>("HIDE_AND_FORWARD", i);
    HIDE_AND_FORWARD = (InterceptionMethod)localObject;
    localObject = new InterceptionMethod[4];
    InterceptionMethod localInterceptionMethod = NOT_INTERCEPT;
    localObject[0] = localInterceptionMethod;
    localInterceptionMethod = FORWARD_ONLY;
    localObject[k] = localInterceptionMethod;
    localInterceptionMethod = HIDE_ONLY;
    localObject[j] = localInterceptionMethod;
    localInterceptionMethod = HIDE_AND_FORWARD;
    localObject[i] = localInterceptionMethod;
    a = (InterceptionMethod[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/communication/SmsInterceptInfo$InterceptionMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */