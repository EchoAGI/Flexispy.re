package org.eclipse.paho.client.mqttv3.c;

import java.util.Enumeration;
import java.util.Hashtable;
import org.eclipse.paho.client.mqttv3.h;
import org.eclipse.paho.client.mqttv3.l;

public class a
  implements h
{
  private Hashtable a;
  
  public l a(String paramString)
  {
    return (l)this.a.get(paramString);
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(String paramString1, String paramString2)
  {
    Hashtable localHashtable = new java/util/Hashtable;
    localHashtable.<init>();
    this.a = localHashtable;
  }
  
  public void a(String paramString, l paraml)
  {
    this.a.put(paramString, paraml);
  }
  
  public Enumeration b()
  {
    return this.a.keys();
  }
  
  public void b(String paramString)
  {
    this.a.remove(paramString);
  }
  
  public void c()
  {
    this.a.clear();
  }
  
  public boolean c(String paramString)
  {
    return this.a.containsKey(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/MyUncaughtExceptionHandler/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */