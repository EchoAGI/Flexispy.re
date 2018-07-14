package com.vvt.pushnotification;

import com.codebutler.android_websockets.b;
import com.codebutler.android_websockets.e;
import com.vvt.pushnotification.connectionhistory.PushProtocal;
import java.net.URI;
import java.nio.channels.NotYetConnectedException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class h
  implements f
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static final URI c;
  private g d;
  private c e;
  private b f;
  private String g;
  private CountDownLatch h = null;
  private Exception i;
  private e j;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("wss://");
    String str = com.vvt.ac.a.a();
    c = URI.create(str);
  }
  
  public h(String paramString)
  {
    i locali = new com/vvt/pushnotification/i;
    locali.<init>(this);
    this.j = locali;
    this.g = paramString;
  }
  
  private String a(int paramInt)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = "responseCode";
    try
    {
      Integer localInteger = new java/lang/Integer;
      int k = 1001;
      localInteger.<init>(k);
      localJSONObject.put(str, localInteger);
      str = "messageId";
      localJSONObject.put(str, paramInt);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
    return localJSONObject.toString();
  }
  
  private void a(Throwable paramThrowable)
  {
    g localg = this.d;
    if (localg != null)
    {
      localg = this.d;
      PushProtocal localPushProtocal = PushProtocal.WEBSOCKET;
      localg.a(localPushProtocal, paramThrowable);
    }
  }
  
  private b i()
  {
    Object localObject1 = new BasicNameValuePair[1];
    Object localObject2 = new org/apache/http/message/BasicNameValuePair;
    String str = this.g;
    ((BasicNameValuePair)localObject2).<init>("deviceId", str);
    localObject1[0] = localObject2;
    localObject1 = Arrays.asList((Object[])localObject1);
    b localb = new com/codebutler/android_websockets/b;
    localObject2 = c;
    e locale = this.j;
    localb.<init>((URI)localObject2, locale, (List)localObject1);
    return localb;
  }
  
  public void a()
  {
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = this.f;
        if (localObject1 != null)
        {
          localObject1 = this.f;
          bool1 = ((b)localObject1).d();
          if (bool1)
          {
            bool1 = a;
            if (bool1) {}
            return;
          }
        }
      }
      finally
      {
        Object localObject1;
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        Object localObject3 = this.d;
        if (localObject3 == null) {
          continue;
        }
        localObject3 = this.d;
        Object localObject4 = PushProtocal.WEBSOCKET;
        ((g)localObject3).b((PushProtocal)localObject4, localThrowable);
        continue;
        Object localObject2 = this.d;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = this.i;
        if (localObject2 == null) {
          continue;
        }
        localObject2 = this.d;
        localObject3 = PushProtocal.WEBSOCKET;
        localObject4 = this.i;
        ((g)localObject2).b((PushProtocal)localObject3, (Throwable)localObject4);
        continue;
      }
      localObject1 = this.f;
      if (localObject1 == null)
      {
        localObject1 = i();
        this.f = ((b)localObject1);
      }
      localObject1 = this.f;
      bool1 = ((b)localObject1).d();
      if (!bool1)
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = this.f;
        ((b)localObject1).b();
        localObject1 = this.h;
        ((CountDownLatch)localObject1).await();
        localObject1 = this.f;
        bool1 = ((b)localObject1).d();
        if (!bool1) {
          continue;
        }
        localObject1 = this.d;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          localObject3 = PushProtocal.WEBSOCKET;
          ((g)localObject1).a((PushProtocal)localObject3);
        }
      }
    }
  }
  
  public void a(c paramc)
  {
    this.e = paramc;
  }
  
  public void a(g paramg)
  {
    this.d = paramg;
  }
  
  public void a(String paramString)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      Object localObject2 = "messageId";
      int k = ((JSONObject)localObject1).getInt((String)localObject2);
      Object localObject3 = "payload";
      localObject1 = ((JSONObject)localObject1).getString((String)localObject3);
      boolean bool2 = a;
      if (bool2) {}
      localObject3 = this.f;
      localObject2 = a(k);
      ((b)localObject3).a((String)localObject2);
      localObject2 = this.e;
      if (localObject2 != null)
      {
        localObject2 = this.e;
        ((c)localObject2).a((String)localObject1);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        boolean bool3 = b;
        if (!bool3) {}
      }
    }
    catch (NotYetConnectedException localNotYetConnectedException) {}finally
    {
      for (;;)
      {
        boolean bool1 = b;
        if (bool1) {}
        a(localThrowable);
      }
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    b localb = this.f;
    if (localb != null)
    {
      this.f.c();
      localb = null;
      this.f = null;
      bool = a;
      if (!bool) {}
    }
  }
  
  /* Error */
  public boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 30	com/vvt/pushnotification/AppEngine1:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: aconst_null
    //   11: astore_2
    //   12: new 149	java/util/concurrent/CountDownLatch
    //   15: astore_3
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_3
    //   20: iload 4
    //   22: invokespecial 185	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   25: aload_0
    //   26: aload_3
    //   27: putfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   30: aload_0
    //   31: invokespecial 145	com/vvt/pushnotification/AppEngine1:i	()Lcom/codebutler/android_websockets/removeFromPath;
    //   34: astore_3
    //   35: aload_0
    //   36: aload_3
    //   37: putfield 139	com/vvt/pushnotification/AppEngine1:f	Lcom/codebutler/android_websockets/removeFromPath;
    //   40: aload_0
    //   41: getfield 139	com/vvt/pushnotification/AppEngine1:f	Lcom/codebutler/android_websockets/removeFromPath;
    //   44: astore_3
    //   45: aload_3
    //   46: invokevirtual 147	com/codebutler/android_websockets/removeFromPath:removeFromPath	()V
    //   49: aload_0
    //   50: getfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   53: astore_3
    //   54: aload_3
    //   55: invokevirtual 152	java/util/concurrent/CountDownLatch:await	()V
    //   58: aload_0
    //   59: getfield 139	com/vvt/pushnotification/AppEngine1:f	Lcom/codebutler/android_websockets/removeFromPath;
    //   62: astore_3
    //   63: aload_3
    //   64: invokevirtual 142	com/codebutler/android_websockets/removeFromPath:d	()Z
    //   67: istore_1
    //   68: iload_1
    //   69: ifeq +41 -> 110
    //   72: aload_0
    //   73: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   76: astore_2
    //   77: aload_2
    //   78: ifnull +21 -> 99
    //   81: aload_0
    //   82: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   85: astore_2
    //   86: getstatic 113	com/vvt/pushnotification/connectionhistory/PushProtocal:WEBSOCKET	Lcom/vvt/pushnotification/connectionhistory/PushProtocal;
    //   89: astore 5
    //   91: aload_2
    //   92: aload 5
    //   94: invokeinterface 155 2 0
    //   99: aconst_null
    //   100: astore_2
    //   101: aload_0
    //   102: aconst_null
    //   103: putfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   106: aload_0
    //   107: monitorexit
    //   108: iload_1
    //   109: ireturn
    //   110: aload_0
    //   111: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull -17 -> 99
    //   119: aload_0
    //   120: getfield 76	com/vvt/pushnotification/AppEngine1:i	Ljava/lang/Exception;
    //   123: astore_2
    //   124: aload_2
    //   125: ifnull -26 -> 99
    //   128: aload_0
    //   129: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   132: astore_2
    //   133: getstatic 113	com/vvt/pushnotification/connectionhistory/PushProtocal:WEBSOCKET	Lcom/vvt/pushnotification/connectionhistory/PushProtocal;
    //   136: astore 5
    //   138: aload_0
    //   139: getfield 76	com/vvt/pushnotification/AppEngine1:i	Ljava/lang/Exception;
    //   142: astore 6
    //   144: aload_2
    //   145: aload 5
    //   147: aload 6
    //   149: invokeinterface 157 3 0
    //   154: goto -55 -> 99
    //   157: astore_2
    //   158: getstatic 34	com/vvt/pushnotification/AppEngine1:removeFromPath	Z
    //   161: istore 4
    //   163: iload 4
    //   165: ifeq +3 -> 168
    //   168: aload_0
    //   169: getfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   172: astore 5
    //   174: aload 5
    //   176: invokevirtual 188	java/util/concurrent/CountDownLatch:countDown	()V
    //   179: aload_0
    //   180: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   183: astore 5
    //   185: aload 5
    //   187: ifnull +24 -> 211
    //   190: aload_0
    //   191: getfield 107	com/vvt/pushnotification/AppEngine1:d	Lcom/vvt/pushnotification/FxFileObserverWorker;
    //   194: astore 5
    //   196: getstatic 113	com/vvt/pushnotification/connectionhistory/PushProtocal:WEBSOCKET	Lcom/vvt/pushnotification/connectionhistory/PushProtocal;
    //   199: astore 6
    //   201: aload 5
    //   203: aload 6
    //   205: aload_2
    //   206: invokeinterface 157 3 0
    //   211: aconst_null
    //   212: astore_2
    //   213: aload_0
    //   214: aconst_null
    //   215: putfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   218: goto -112 -> 106
    //   221: astore_3
    //   222: aload_0
    //   223: monitorexit
    //   224: aload_3
    //   225: athrow
    //   226: astore_3
    //   227: aconst_null
    //   228: astore_2
    //   229: aload_0
    //   230: aconst_null
    //   231: putfield 65	com/vvt/pushnotification/AppEngine1:AppEngine1	Ljava/util/concurrent/CountDownLatch;
    //   234: aload_3
    //   235: athrow
    //   236: astore 7
    //   238: iconst_0
    //   239: istore_1
    //   240: aconst_null
    //   241: astore_3
    //   242: aload 7
    //   244: astore_2
    //   245: goto -87 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	AppEngine1
    //   5	235	1	bool1	boolean
    //   11	134	2	localObject1	Object
    //   157	49	2	localThrowable	Throwable
    //   212	33	2	localObject2	Object
    //   15	49	3	localObject3	Object
    //   221	4	3	localObject4	Object
    //   226	9	3	localObject5	Object
    //   241	1	3	localObject6	Object
    //   17	4	4	k	int
    //   161	3	4	bool2	boolean
    //   89	113	5	localObject7	Object
    //   142	62	6	localObject8	Object
    //   236	7	7	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   72	76	157	finally
    //   81	85	157	finally
    //   86	89	157	finally
    //   92	99	157	finally
    //   110	114	157	finally
    //   119	123	157	finally
    //   128	132	157	finally
    //   133	136	157	finally
    //   138	142	157	finally
    //   147	154	157	finally
    //   2	5	221	finally
    //   102	106	221	finally
    //   214	218	221	finally
    //   230	234	221	finally
    //   234	236	221	finally
    //   158	161	226	finally
    //   168	172	226	finally
    //   174	179	226	finally
    //   179	183	226	finally
    //   190	194	226	finally
    //   196	199	226	finally
    //   205	211	226	finally
    //   12	15	236	finally
    //   20	25	236	finally
    //   26	30	236	finally
    //   30	34	236	finally
    //   36	40	236	finally
    //   40	44	236	finally
    //   45	49	236	finally
    //   49	53	236	finally
    //   54	58	236	finally
    //   58	62	236	finally
    //   63	67	236	finally
  }
  
  public void d()
  {
    Object localObject1 = null;
    boolean bool = a;
    if (bool) {}
    Object localObject2 = this.f;
    if (localObject2 != null)
    {
      localObject2 = this.f;
      bool = ((b)localObject2).d();
      if (bool)
      {
        bool = true;
        localObject2 = new byte[bool];
        localObject2[0] = 0;
        localObject1 = this.f;
        ((b)localObject1).a((byte[])localObject2);
      }
    }
    for (;;)
    {
      return;
      bool = b;
      if (bool) {}
      this.f.c();
      localObject2 = new java/lang/Exception;
      localObject1 = "Error sending keepalive. WebSocket is closed. Please reconnect.";
      ((Exception)localObject2).<init>((String)localObject1);
      a((Throwable)localObject2);
      continue;
      localObject2 = new java/lang/Exception;
      localObject1 = "Websocket is null. Please reconnect";
      ((Exception)localObject2).<init>((String)localObject1);
      a((Throwable)localObject2);
    }
  }
  
  public void e()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      bool = ((b)localObject).d();
      if (!bool)
      {
        this.f.c();
        localObject = null;
        this.f = null;
        bool = a;
        if (bool) {}
        localObject = new java/lang/Exception;
        String str = "Err in reconnectIfReq. WebSocket is closed. Please reconnect.";
        ((Exception)localObject).<init>(str);
        a((Throwable)localObject);
      }
    }
  }
  
  public boolean f()
  {
    b localb = this.f;
    boolean bool1;
    if (localb != null)
    {
      localb = this.f;
      bool1 = localb.d();
      if (bool1) {
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return bool1;
      bool1 = false;
      localb = null;
    }
  }
  
  public String toString()
  {
    return "WebSocketPushNotificationService";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */