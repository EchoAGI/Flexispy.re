package com.vvt.remotecommand.exception;

public class ProductNotActivatedException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Product is not yet activated.";
  private static final long serialVersionUID = -7372949390721447014L;
  
  public ProductNotActivatedException()
  {
    super("Product is not yet activated.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/ProductNotActivatedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */