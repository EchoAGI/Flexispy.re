package com.vvt.o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class a
{
  public static SimpleDateFormat a;
  public static SimpleDateFormat b;
  private static final boolean c = com.vvt.ak.a.a;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss Z");
    a = localSimpleDateFormat;
    localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss");
    b = localSimpleDateFormat;
  }
  
  public static int a(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    localGregorianCalendar.<init>();
    localGregorianCalendar.setTime(paramDate);
    return localGregorianCalendar.get(7);
  }
  
  public static long a(Date paramDate1, Date paramDate2)
  {
    long l1 = paramDate2.getTime();
    long l2 = paramDate1.getTime();
    l1 -= l2;
    l2 = 86400000L;
    l1 /= l2;
    boolean bool = c;
    if (bool) {}
    return l1;
  }
  
  public static int b(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    localGregorianCalendar.<init>();
    localGregorianCalendar.setTime(paramDate);
    return localGregorianCalendar.get(5);
  }
  
  public static int c(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    localGregorianCalendar.<init>();
    localGregorianCalendar.setTime(paramDate);
    return localGregorianCalendar.get(2);
  }
  
  public static int d(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    localGregorianCalendar.<init>();
    localGregorianCalendar.setTime(paramDate);
    return localGregorianCalendar.get(1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/o/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */