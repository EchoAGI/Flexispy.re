package com.vvt.connectionhistorymanager;

public enum ErrorType
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/connectionhistorymanager/ErrorType;
    ((ErrorType)localObject).<init>("NONE", 0);
    NONE = (ErrorType)localObject;
    localObject = new com/vvt/connectionhistorymanager/ErrorType;
    ((ErrorType)localObject).<init>("HTTP", j);
    HTTP = (ErrorType)localObject;
    localObject = new com/vvt/connectionhistorymanager/ErrorType;
    ((ErrorType)localObject).<init>("SERVER", i);
    SERVER = (ErrorType)localObject;
    localObject = new ErrorType[3];
    ErrorType localErrorType = NONE;
    localObject[0] = localErrorType;
    localErrorType = HTTP;
    localObject[j] = localErrorType;
    localErrorType = SERVER;
    localObject[i] = localErrorType;
    a = (ErrorType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/connectionhistorymanager/ErrorType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */