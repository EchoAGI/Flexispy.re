package org.eclipse.paho.client.mqttv3.d;

import java.util.Enumeration;
import java.util.Properties;
import org.eclipse.paho.client.mqttv3.b.b;
import org.eclipse.paho.client.mqttv3.b.c;

public class a
{
  private static final String a = org.eclipse.paho.client.mqttv3.a.a.class.getName();
  private static final b b;
  private static final String c = System.getProperty("line.separator", "\n");
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public static String a(String paramString, int paramInt, char paramChar)
  {
    int i = paramString.length();
    if (i >= paramInt) {}
    for (;;)
    {
      return paramString;
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>(paramInt);
      localStringBuffer.append(paramString);
      i = paramString.length();
      i = paramInt - i;
      for (;;)
      {
        i += -1;
        if (i < 0) {
          break;
        }
        localStringBuffer.append(paramChar);
      }
      paramString = localStringBuffer.toString();
    }
  }
  
  public static String a(Properties paramProperties, String paramString)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = paramProperties.propertyNames();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = c;
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append("==============").append(" ").append(paramString).append(" ").append("==============");
    localObject3 = c;
    localObject2 = (String)localObject3;
    localStringBuffer.append((String)localObject2);
    for (;;)
    {
      boolean bool = ((Enumeration)localObject1).hasMoreElements();
      if (!bool) {
        break;
      }
      localObject2 = (String)((Enumeration)localObject1).nextElement();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      int i = 28;
      char c1 = ' ';
      String str = a((String)localObject2, i, c1);
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = ":  ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject2 = paramProperties.get(localObject2);
      localObject2 = ((StringBuilder)localObject3).append(localObject2);
      localObject3 = c;
      localObject2 = (String)localObject3;
      localStringBuffer.append((String)localObject2);
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("==========================================");
    localObject1 = c;
    localObject2 = (String)localObject1;
    localStringBuffer.append((String)localObject2);
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/d/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */