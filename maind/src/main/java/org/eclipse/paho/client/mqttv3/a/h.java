package org.eclipse.paho.client.mqttv3.a;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.o;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;
import org.eclipse.paho.client.mqttv3.j;
import org.eclipse.paho.client.mqttv3.n;

public class h
{
  private static final String a = h.class.getName();
  private static final b b;
  private Hashtable c;
  private String d;
  private MqttException e = null;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public h(String paramString)
  {
    b.a(paramString);
    Object localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.c = ((Hashtable)localObject);
    this.d = paramString;
    localObject = b;
    String str = a;
    ((b)localObject).a(str, "<Init>", "308");
  }
  
  protected j a(o paramo)
  {
    Object localObject1 = "restoreToken";
    synchronized (this.c)
    {
      int i = paramo.j();
      localObject1 = Integer.valueOf(i);
      String str1 = ((Integer)localObject1).toString();
      localObject1 = this.c;
      boolean bool = ((Hashtable)localObject1).containsKey(str1);
      if (bool)
      {
        localObject1 = this.c;
        localObject1 = ((Hashtable)localObject1).get(str1);
        localObject1 = (j)localObject1;
        localObject3 = b;
        str2 = a;
        str3 = "restoreToken";
        str4 = "302";
        j = 3;
        arrayOfObject = new Object[j];
        arrayOfObject[0] = str1;
        k = 1;
        arrayOfObject[k] = paramo;
        k = 2;
        arrayOfObject[k] = localObject1;
        ((b)localObject3).b(str2, str3, str4, arrayOfObject);
        return (j)localObject1;
      }
      localObject1 = new org/eclipse/paho/client/mqttv3/j;
      Object localObject3 = this.d;
      ((j)localObject1).<init>((String)localObject3);
      localObject3 = ((j)localObject1).a;
      ((q)localObject3).a(str1);
      localObject3 = this.c;
      ((Hashtable)localObject3).put(str1, localObject1);
      localObject3 = b;
      String str2 = a;
      String str3 = "restoreToken";
      String str4 = "303";
      int j = 3;
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = str1;
      int k = 1;
      arrayOfObject[k] = paramo;
      k = 2;
      arrayOfObject[k] = localObject1;
      ((b)localObject3).b(str2, str3, str4, arrayOfObject);
    }
  }
  
  public n a(String paramString)
  {
    return (n)this.c.get(paramString);
  }
  
  public n a(u paramu)
  {
    String str = paramu.e();
    return (n)this.c.get(str);
  }
  
  public void a()
  {
    Object localObject1 = "open";
    synchronized (this.c)
    {
      localObject1 = b;
      String str1 = a;
      String str2 = "open";
      String str3 = "310";
      ((b)localObject1).a(str1, str2, str3);
      localObject1 = null;
      this.e = null;
      return;
    }
  }
  
  protected void a(MqttException paramMqttException)
  {
    Object localObject1 = "quiesce";
    synchronized (this.c)
    {
      localObject1 = b;
      String str1 = a;
      String str2 = "quiesce";
      String str3 = "309";
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramMqttException;
      ((b)localObject1).b(str1, str2, str3, arrayOfObject);
      this.e = paramMqttException;
      return;
    }
  }
  
  protected void a(n paramn, String paramString)
  {
    Object localObject1 = "saveToken";
    synchronized (this.c)
    {
      localObject1 = b;
      String str1 = a;
      String str2 = "saveToken";
      String str3 = "307";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramString;
      j = 1;
      String str4 = paramn.toString();
      arrayOfObject[j] = str4;
      ((b)localObject1).b(str1, str2, str3, arrayOfObject);
      localObject1 = paramn.a;
      ((q)localObject1).a(paramString);
      localObject1 = this.c;
      ((Hashtable)localObject1).put(paramString, paramn);
      return;
    }
  }
  
  protected void a(n paramn, u paramu)
  {
    Object localObject1 = "saveToken";
    synchronized (this.c)
    {
      localObject1 = this.e;
      if (localObject1 == null)
      {
        localObject1 = paramu.e();
        b localb = b;
        String str1 = a;
        String str2 = "saveToken";
        String str3 = "300";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = localObject1;
        j = 1;
        arrayOfObject[j] = paramu;
        localb.b(str1, str2, str3, arrayOfObject);
        a(paramn, (String)localObject1);
        return;
      }
      localObject1 = this.e;
      throw ((Throwable)localObject1);
    }
  }
  
  public n b(String paramString)
  {
    Object localObject1 = b;
    Object localObject3 = a;
    ??? = "removeToken";
    String str = "306";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString;
    ((b)localObject1).b((String)localObject3, (String)???, str, arrayOfObject);
    if (paramString != null) {}
    for (;;)
    {
      synchronized (this.c)
      {
        localObject1 = this.c;
        localObject1 = ((Hashtable)localObject1).get(paramString);
        localObject1 = (n)localObject1;
        if (localObject1 != null) {
          try
          {
            localObject3 = this.c;
            localObject3 = ((Hashtable)localObject3).remove(paramString);
            localObject3 = (n)localObject3;
            return (n)localObject3;
          }
          finally {}
        }
      }
      Object localObject5 = null;
    }
  }
  
  public n b(u paramu)
  {
    if (paramu != null) {
      localObject = paramu.e();
    }
    for (Object localObject = b((String)localObject);; localObject = null) {
      return (n)localObject;
    }
  }
  
  public j[] b()
  {
    Object localObject1 = "getOutstandingDelTokens";
    Object localObject4;
    synchronized (this.c)
    {
      localObject1 = b;
      localObject4 = a;
      Object localObject5 = "getOutstandingDelTokens";
      Object localObject6 = "311";
      ((b)localObject1).a((String)localObject4, (String)localObject5, (String)localObject6);
      localObject4 = new java/util/Vector;
      ((Vector)localObject4).<init>();
      localObject1 = this.c;
      localObject5 = ((Hashtable)localObject1).elements();
      boolean bool2;
      do
      {
        do
        {
          do
          {
            boolean bool1 = ((Enumeration)localObject5).hasMoreElements();
            if (!bool1) {
              break;
            }
            localObject1 = ((Enumeration)localObject5).nextElement();
            localObject1 = (n)localObject1;
          } while (localObject1 == null);
          bool2 = localObject1 instanceof j;
        } while (!bool2);
        localObject6 = ((n)localObject1).a;
        bool2 = ((q)localObject6).n();
      } while (bool2);
      ((Vector)localObject4).addElement(localObject1);
    }
    int i = ((Vector)localObject4).size();
    Object localObject3 = new j[i];
    localObject3 = ((Vector)localObject4).toArray((Object[])localObject3);
    localObject3 = (j[])localObject3;
    localObject3 = (j[])localObject3;
    return (j[])localObject3;
  }
  
  public Vector c()
  {
    Object localObject1 = "getOutstandingTokens";
    Object localObject3;
    synchronized (this.c)
    {
      localObject1 = b;
      localObject3 = a;
      Object localObject4 = "getOutstandingTokens";
      String str = "312";
      ((b)localObject1).a((String)localObject3, (String)localObject4, str);
      localObject3 = new java/util/Vector;
      ((Vector)localObject3).<init>();
      localObject1 = this.c;
      localObject4 = ((Hashtable)localObject1).elements();
      do
      {
        boolean bool = ((Enumeration)localObject4).hasMoreElements();
        if (!bool) {
          break;
        }
        localObject1 = ((Enumeration)localObject4).nextElement();
        localObject1 = (n)localObject1;
      } while (localObject1 == null);
      ((Vector)localObject3).addElement(localObject1);
    }
    return (Vector)localObject3;
  }
  
  public void d()
  {
    Object localObject1 = b;
    ??? = a;
    String str1 = "clear";
    String str2 = "305";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    Integer localInteger = new java/lang/Integer;
    Hashtable localHashtable = this.c;
    int j = localHashtable.size();
    localInteger.<init>(j);
    arrayOfObject[0] = localInteger;
    ((b)localObject1).b((String)???, str1, str2, arrayOfObject);
    synchronized (this.c)
    {
      localObject1 = this.c;
      ((Hashtable)localObject1).clear();
      return;
    }
  }
  
  public int e()
  {
    synchronized (this.c)
    {
      Hashtable localHashtable2 = this.c;
      int i = localHashtable2.size();
      return i;
    }
  }
  
  public String toString()
  {
    Object localObject1 = "line.separator";
    String str2 = System.getProperty((String)localObject1, "\n");
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    synchronized (this.c)
    {
      localObject1 = this.c;
      Enumeration localEnumeration = ((Hashtable)localObject1).elements();
      boolean bool = localEnumeration.hasMoreElements();
      if (bool)
      {
        localObject1 = localEnumeration.nextElement();
        localObject1 = (n)localObject1;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str3 = "{";
        localObject3 = ((StringBuilder)localObject3).append(str3);
        localObject1 = ((n)localObject1).a;
        localObject1 = ((StringBuilder)localObject3).append(localObject1);
        localObject3 = "}";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append(str2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localStringBuffer.append((String)localObject1);
      }
    }
    String str1 = localStringBuffer.toString();
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */