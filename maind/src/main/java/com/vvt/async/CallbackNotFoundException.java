package com.vvt.async;

class CallbackNotFoundException
  extends RuntimeException
{
  private static final long serialVersionUID = 1L;
  
  public CallbackNotFoundException() {}
  
  CallbackNotFoundException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/async/CallbackNotFoundException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */