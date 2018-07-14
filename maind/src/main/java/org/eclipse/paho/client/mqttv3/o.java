package org.eclipse.paho.client.mqttv3;

import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.a.a;
import org.eclipse.paho.client.mqttv3.a.q;

public class o
{
  private a a;
  private String b;
  
  public o(String paramString, a parama)
  {
    this.a = parama;
    this.b = paramString;
  }
  
  private static void a(String paramString)
  {
    String str = null;
    int i = "+".charAt(0);
    Object localObject = "/";
    int j = ((String)localObject).charAt(0);
    char[] arrayOfChar = paramString.toCharArray();
    int k = arrayOfChar.length;
    int m = 0;
    Object[] arrayOfObject = null;
    while (m < k)
    {
      int n = m + -1;
      int i1;
      if (n >= 0)
      {
        n = m + -1;
        n = arrayOfChar[n];
        i1 = n;
        n = m + 1;
        if (n >= k) {
          break label170;
        }
        n = m + 1;
        n = arrayOfChar[n];
      }
      for (;;)
      {
        int i2 = arrayOfChar[m];
        if ((i2 != i) || (((i1 == j) || (i1 == 0)) && ((n == j) || (n == 0)))) {
          break label178;
        }
        localObject = new java/lang/IllegalArgumentException;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = paramString;
        str = String.format("Invalid usage of single-level wildcard in topic string '%s'!", arrayOfObject);
        ((IllegalArgumentException)localObject).<init>(str);
        throw ((Throwable)localObject);
        i1 = 0;
        break;
        label170:
        n = 0;
        localObject = null;
      }
      label178:
      n = m + 1;
      m = n;
    }
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    int i = (char)-1;
    int j = 2;
    int k = 1;
    Object localObject1 = "UTF-8";
    Object localObject3;
    try
    {
      localObject1 = paramString.getBytes((String)localObject1);
      int m = localObject1.length;
      if ((m < k) || (m > i))
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object[] arrayOfObject = new Object[j];
        Integer localInteger = Integer.valueOf(k);
        arrayOfObject[0] = localInteger;
        localInteger = Integer.valueOf(i);
        arrayOfObject[k] = localInteger;
        localObject3 = String.format("Invalid topic length, should be in range[%d, %d]!", arrayOfObject);
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject3);
    }
    if (paramBoolean)
    {
      localObject2 = new String[j];
      localObject2[0] = "#";
      localObject3 = "+";
      localObject2[k] = localObject3;
      boolean bool1 = org.eclipse.paho.client.mqttv3.d.b.a(paramString, (CharSequence[])localObject2);
      if (!bool1) {}
    }
    boolean bool2;
    do
    {
      for (;;)
      {
        return;
        localObject2 = "#";
        int n = org.eclipse.paho.client.mqttv3.d.b.b(paramString, (CharSequence)localObject2);
        if (n <= k)
        {
          localObject2 = "#";
          bool2 = paramString.contains((CharSequence)localObject2);
          if (bool2)
          {
            localObject2 = "/#";
            bool2 = paramString.endsWith((String)localObject2);
            if (bool2) {}
          }
        }
        else
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = "Invalid usage of multi-level wildcard in topic string: " + paramString;
          ((IllegalArgumentException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        a(paramString);
      }
      localObject2 = "#+";
      bool2 = org.eclipse.paho.client.mqttv3.d.b.a(paramString, (CharSequence)localObject2);
    } while (!bool2);
    Object localObject2 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject2).<init>("The topic name MUST NOT contain any wildard characters (#+)");
    throw ((Throwable)localObject2);
  }
  
  private org.eclipse.paho.client.mqttv3.a.b.o b(k paramk)
  {
    org.eclipse.paho.client.mqttv3.a.b.o localo = new org/eclipse/paho/client/mqttv3/a/b/o;
    String str = a();
    localo.<init>(str, paramk);
    return localo;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public j a(k paramk)
  {
    j localj = new org/eclipse/paho/client/mqttv3/j;
    Object localObject = this.a.j().a();
    localj.<init>((String)localObject);
    localj.a(paramk);
    localObject = this.a;
    org.eclipse.paho.client.mqttv3.a.b.o localo = b(paramk);
    ((a)localObject).b(localo, localj);
    localj.a.g();
    return localj;
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */