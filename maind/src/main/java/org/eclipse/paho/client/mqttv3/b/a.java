package org.eclipse.paho.client.mqttv3.b;

public class a
  implements b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.c;
  
  public void a(String paramString) {}
  
  public void a(String paramString1, String paramString2, String paramString3) {}
  
  public void a(String paramString1, String paramString2, String paramString3, Object[] paramArrayOfObject)
  {
    String str = "sourceClass: %s sourceMethod: %s msg: %s";
    int i = 3;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    int j = 2;
    arrayOfObject[j] = paramString3;
    String.format(str, arrayOfObject);
    boolean bool = b;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2, String paramString3, Object[] paramArrayOfObject, Throwable paramThrowable) {}
  
  public boolean a(int paramInt)
  {
    int i = 4;
    if (paramInt <= i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public void b(String paramString1, String paramString2, String paramString3) {}
  
  public void b(String paramString1, String paramString2, String paramString3, Object[] paramArrayOfObject) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */