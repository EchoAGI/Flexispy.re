package com.vvt.eventdelivery;

public class b
{
  public static String a(String paramString, EventDelivery.Type paramType)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    String str = paramType.toString();
    arrayOfObject[1] = str;
    return String.format("%s/EDM_%s.edm", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */