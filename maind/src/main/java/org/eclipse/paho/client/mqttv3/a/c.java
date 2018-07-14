package org.eclipse.paho.client.mqttv3.a;

import org.eclipse.paho.client.mqttv3.a.b.e;
import org.eclipse.paho.client.mqttv3.b;
import org.eclipse.paho.client.mqttv3.n;

class c
  implements Runnable
{
  Thread a = null;
  e b;
  long c;
  n d;
  
  c(a parama, e parame, long paramLong, n paramn)
  {
    this.b = parame;
    this.c = paramLong;
    this.d = paramn;
  }
  
  void a()
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("MQTT Disc: ");
    String str = this.e.j().a();
    localObject = str;
    localThread.<init>(this, (String)localObject);
    this.a = localThread;
    this.a.start();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: invokestatic 67	org/eclipse/paho/client/mqttv3/a/a:n	()Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   3: astore_1
    //   4: invokestatic 70	org/eclipse/paho/client/mqttv3/a/a:m	()Ljava/lang/String;
    //   7: astore_2
    //   8: ldc 63
    //   10: astore_3
    //   11: ldc 72
    //   13: astore 4
    //   15: aload_1
    //   16: aload_2
    //   17: aload_3
    //   18: aload 4
    //   20: invokeinterface 77 4 0
    //   25: aload_0
    //   26: getfield 18	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   29: invokestatic 80	org/eclipse/paho/client/mqttv3/a/a:d	(Lorg/eclipse/paho/client/mqttv3/a/a;)Lorg/eclipse/paho/client/mqttv3/a/d;
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 28	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	J
    //   37: lstore 5
    //   39: aload_1
    //   40: lload 5
    //   42: invokevirtual 85	org/eclipse/paho/client/mqttv3/a/d:removeFromPath	(J)V
    //   45: aload_0
    //   46: getfield 18	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   49: astore_1
    //   50: aload_0
    //   51: getfield 26	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:removeFromPath	Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/e;
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   59: astore_3
    //   60: aload_1
    //   61: aload_2
    //   62: aload_3
    //   63: invokevirtual 88	org/eclipse/paho/client/mqttv3/a/a:a	(Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/u;Lorg/eclipse/paho/client/mqttv3/n;)V
    //   66: aload_0
    //   67: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   70: astore_1
    //   71: aload_1
    //   72: getfield 93	org/eclipse/paho/client/mqttv3/n:a	Lorg/eclipse/paho/client/mqttv3/a/q;
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 98	org/eclipse/paho/client/mqttv3/a/q:FxFileObserverWorker	()V
    //   80: aload_0
    //   81: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   84: getfield 93	org/eclipse/paho/client/mqttv3/n:a	Lorg/eclipse/paho/client/mqttv3/a/q;
    //   87: aconst_null
    //   88: aconst_null
    //   89: invokevirtual 101	org/eclipse/paho/client/mqttv3/a/q:a	(Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   92: aload_0
    //   93: getfield 18	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   96: astore_1
    //   97: aload_0
    //   98: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   101: astore_2
    //   102: aload_1
    //   103: aload_2
    //   104: aconst_null
    //   105: invokevirtual 104	org/eclipse/paho/client/mqttv3/a/a:a	(Lorg/eclipse/paho/client/mqttv3/n;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   108: return
    //   109: astore_1
    //   110: aload_0
    //   111: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   114: getfield 93	org/eclipse/paho/client/mqttv3/n:a	Lorg/eclipse/paho/client/mqttv3/a/q;
    //   117: aconst_null
    //   118: aconst_null
    //   119: invokevirtual 101	org/eclipse/paho/client/mqttv3/a/q:a	(Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   122: aload_0
    //   123: getfield 18	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   126: astore_2
    //   127: aload_0
    //   128: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   131: astore_3
    //   132: aload_2
    //   133: aload_3
    //   134: aconst_null
    //   135: invokevirtual 104	org/eclipse/paho/client/mqttv3/a/a:a	(Lorg/eclipse/paho/client/mqttv3/n;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   138: aload_1
    //   139: athrow
    //   140: astore_1
    //   141: aload_0
    //   142: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   145: getfield 93	org/eclipse/paho/client/mqttv3/n:a	Lorg/eclipse/paho/client/mqttv3/a/q;
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 101	org/eclipse/paho/client/mqttv3/a/q:a	(Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   153: aload_0
    //   154: getfield 18	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   157: astore_1
    //   158: aload_0
    //   159: getfield 30	org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler:d	Lorg/eclipse/paho/client/mqttv3/n;
    //   162: astore_2
    //   163: goto -61 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	MyUncaughtExceptionHandler
    //   3	100	1	localObject1	Object
    //   109	30	1	localObject2	Object
    //   140	1	1	localMqttException	org.eclipse.paho.client.mqttv3.MqttException
    //   157	1	1	locala	a
    //   7	156	2	localObject3	Object
    //   10	124	3	localObject4	Object
    //   13	6	4	str	String
    //   37	4	5	l	long
    // Exception table:
    //   from	to	target	type
    //   45	49	109	finally
    //   50	54	109	finally
    //   55	59	109	finally
    //   62	66	109	finally
    //   66	70	109	finally
    //   71	75	109	finally
    //   76	80	109	finally
    //   45	49	140	org/eclipse/paho/client/mqttv3/MqttException
    //   50	54	140	org/eclipse/paho/client/mqttv3/MqttException
    //   55	59	140	org/eclipse/paho/client/mqttv3/MqttException
    //   62	66	140	org/eclipse/paho/client/mqttv3/MqttException
    //   66	70	140	org/eclipse/paho/client/mqttv3/MqttException
    //   71	75	140	org/eclipse/paho/client/mqttv3/MqttException
    //   76	80	140	org/eclipse/paho/client/mqttv3/MqttException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */