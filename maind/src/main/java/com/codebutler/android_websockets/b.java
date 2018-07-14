package com.codebutler.android_websockets;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;

public class b
{
  private static TrustManager[] j;
  private URI a;
  private e b;
  private Socket c;
  private Thread d;
  private HandlerThread e;
  private Handler f;
  private List g;
  private HybiParser h;
  private final Object i;
  
  public b(URI paramURI, e parame, List paramList)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.i = localObject;
    this.a = paramURI;
    this.b = parame;
    this.g = paramList;
    localObject = new com/codebutler/android_websockets/HybiParser;
    ((HybiParser)localObject).<init>(this);
    this.h = ((HybiParser)localObject);
    localObject = new android/os/HandlerThread;
    ((HandlerThread)localObject).<init>("websocket-thread");
    this.e = ((HandlerThread)localObject);
    this.e.start();
    localObject = new android/os/Handler;
    Looper localLooper = this.e.getLooper();
    ((Handler)localObject).<init>(localLooper);
    this.f = ((Handler)localObject);
  }
  
  private String a(a parama)
  {
    String str1 = null;
    int k = -1;
    int m = parama.read();
    if (m == k) {}
    for (;;)
    {
      return str1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      String str2 = "";
      localStringBuilder.<init>(str2);
      int n;
      do
      {
        int i1 = 10;
        if (m == i1) {
          break;
        }
        int i2 = 13;
        if (m != i2)
        {
          m = (char)m;
          localStringBuilder.append(m);
        }
        n = parama.read();
      } while (n != k);
      continue;
      str1 = localStringBuilder.toString();
    }
  }
  
  private StatusLine b(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      bool = false;
    }
    for (Object localObject = null;; localObject = BasicLineParser.parseStatusLine(paramString, (LineParser)localObject))
    {
      return (StatusLine)localObject;
      localObject = new org/apache/http/message/BasicLineParser;
      ((BasicLineParser)localObject).<init>();
    }
  }
  
  private Header c(String paramString)
  {
    BasicLineParser localBasicLineParser = new org/apache/http/message/BasicLineParser;
    localBasicLineParser.<init>();
    return BasicLineParser.parseHeader(paramString, localBasicLineParser);
  }
  
  private String d(String paramString)
  {
    Object localObject1 = "SHA-1";
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      String str = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject2 = ((String)localObject2).getBytes();
      ((MessageDigest)localObject1).update((byte[])localObject2);
      localObject1 = ((MessageDigest)localObject1).digest();
      localObject2 = null;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0);
      return ((String)localObject1).trim();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
    }
  }
  
  private String e()
  {
    int k = 16;
    byte[] arrayOfByte = new byte[k];
    int m = 0;
    while (m < k)
    {
      double d1 = Math.random();
      double d2 = 256.0D;
      d1 *= d2;
      int n = (byte)(int)d1;
      arrayOfByte[m] = n;
      m += 1;
    }
    return Base64.encodeToString(arrayOfByte, 0).trim();
  }
  
  private SSLSocketFactory f()
  {
    SSLContext localSSLContext = SSLContext.getInstance("TLS");
    TrustManager[] arrayOfTrustManager = j;
    localSSLContext.init(null, arrayOfTrustManager, null);
    return localSSLContext.getSocketFactory();
  }
  
  public e a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    byte[] arrayOfByte = this.h.a(paramString);
    b(arrayOfByte);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = this.h.a(paramArrayOfByte);
    b(arrayOfByte);
  }
  
  public void b()
  {
    Thread localThread = this.d;
    if (localThread != null)
    {
      localThread = this.d;
      boolean bool = localThread.isAlive();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      localThread = new java/lang/Thread;
      c localc = new com/codebutler/android_websockets/c;
      localc.<init>(this);
      localThread.<init>(localc);
      this.d = localThread;
      localThread = this.d;
      localThread.start();
    }
  }
  
  void b(byte[] paramArrayOfByte)
  {
    Handler localHandler = this.f;
    d locald = new com/codebutler/android_websockets/d;
    locald.<init>(this, paramArrayOfByte);
    localHandler.post(locald);
  }
  
  public void c()
  {
    Socket localSocket = this.c;
    if (localSocket != null) {}
    try
    {
      localSocket = this.c;
      localSocket.close();
      localSocket = null;
      this.c = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str = "Error while disconnecting";
        Log.d("WebSocketClient", str, localIOException);
        e locale = this.b;
        locale.a(localIOException);
      }
    }
  }
  
  public boolean d()
  {
    Socket localSocket = this.c;
    boolean bool;
    if (localSocket != null)
    {
      localSocket = this.c;
      bool = localSocket.isConnected();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSocket = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/codebutler/android_websockets/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */