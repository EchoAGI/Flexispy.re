package com.vvt.remotecommand.exception;

public class RemoteCommandException
  extends Exception
{
  private static final long serialVersionUID = 6280987216871977772L;
  
  public RemoteCommandException(String paramString)
  {
    super(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    Class localClass1 = getClass();
    Class localClass2 = paramObject.getClass();
    boolean bool;
    if (localClass1 == localClass2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/RemoteCommandException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */