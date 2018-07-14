package com.codebutler.android_websockets;

import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

class c
  implements Runnable
{
  c(b paramb) {}
  
  public void run()
  {
    bool1 = true;
    float f = Float.MIN_VALUE;
    try
    {
      localObject1 = this.a;
      str2 = b.a((b)localObject1);
      localObject1 = this.a;
      localObject1 = b.b((b)localObject1);
      int i = ((URI)localObject1).getPort();
      int k = -1;
      if (i == k) {
        break label817;
      }
      localObject1 = this.a;
      localObject1 = b.b((b)localObject1);
      i = ((URI)localObject1).getPort();
      n = i;
    }
    catch (EOFException localEOFException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool4;
        Object localObject7;
        int i1;
        Log.d("WebSocketClient", "WebSocket EOF!", localEOFException);
        localObject9 = b.f(this.a);
        localObject4 = "EOF";
        ((e)localObject9).a(0, (String)localObject4, localEOFException);
        return;
        localObject2 = this.a;
        localObject2 = b.b((b)localObject2);
        localObject2 = ((URI)localObject2).getScheme();
        localObject4 = "wss";
        boolean bool2 = ((String)localObject2).equals(localObject4);
        if (bool2)
        {
          j = 443;
          n = j;
        }
        else
        {
          j = 80;
          n = j;
          continue;
          localObject2 = this.a;
          localObject2 = b.b((b)localObject2);
          localObject2 = ((URI)localObject2).getPath();
          continue;
          localObject2 = "http";
          continue;
          localObject2 = SocketFactory.getDefault();
        }
      }
      Object localObject2 = "\r\n";
      ((PrintWriter)localObject8).print((String)localObject2);
      ((PrintWriter)localObject8).flush();
      localObject4 = new com/codebutler/android_websockets/a;
      localObject2 = this.a;
      localObject2 = b.d((b)localObject2);
      localObject2 = ((Socket)localObject2).getInputStream();
      ((a)localObject4).<init>((InputStream)localObject2);
      localObject2 = this.a;
      localObject8 = this.a;
      localObject8 = b.a((b)localObject8, (a)localObject4);
      localObject2 = b.a((b)localObject2, (String)localObject8);
      if (localObject2 != null) {
        break label1027;
      }
      localObject2 = new org/apache/http/HttpException;
      localObject9 = "Received no reply from server.";
      ((HttpException)localObject2).<init>((String)localObject9);
      throw ((Throwable)localObject2);
    }
    catch (SSLException localSSLException)
    {
      for (;;)
      {
        Log.d("WebSocketClient", "Websocket SSL error!", localSSLException);
        localObject9 = b.f(this.a);
        localObject4 = "SSL";
        ((e)localObject9).a(0, (String)localObject4, localSSLException);
      }
      int n = localSSLException.getStatusCode();
      int i3 = 101;
      if (n == i3) {
        break label1098;
      }
      localObject9 = new org/apache/http/client/HttpResponseException;
      int m = localSSLException.getStatusCode();
      String str1 = localSSLException.getReasonPhrase();
      ((HttpResponseException)localObject9).<init>(m, str1);
      throw ((Throwable)localObject9);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2;
        Object localObject5;
        Object localObject6;
        Object localObject8;
        Object localObject9 = b.f(this.a);
        ((e)localObject9).a(localException);
        continue;
        int j = 0;
        Object localObject3 = null;
        boolean bool3;
        for (;;)
        {
          localObject8 = this.a;
          localObject8 = b.a((b)localObject8, (a)localObject4);
          boolean bool5 = TextUtils.isEmpty((CharSequence)localObject8);
          if (bool5) {
            break;
          }
          localObject5 = this.a;
          localObject8 = b.b((b)localObject5, (String)localObject8);
          localObject5 = ((Header)localObject8).getName();
          localObject6 = "Sec-WebSocket-Accept";
          bool5 = ((String)localObject5).equals(localObject6);
          if (bool5)
          {
            localObject3 = this.a;
            localObject3 = b.c((b)localObject3, str2);
            localObject8 = ((Header)localObject8).getValue();
            localObject8 = ((String)localObject8).trim();
            bool3 = ((String)localObject3).equals(localObject8);
            if (!bool3)
            {
              localObject3 = new org/apache/http/HttpException;
              localObject9 = "Bad Sec-WebSocket-Accept header value.";
              ((HttpException)localObject3).<init>((String)localObject9);
              throw ((Throwable)localObject3);
            }
            bool3 = bool1;
          }
        }
        if (!bool3)
        {
          localObject3 = new org/apache/http/HttpException;
          localObject9 = "No Sec-WebSocket-Accept header.";
          ((HttpException)localObject3).<init>((String)localObject9);
          throw ((Throwable)localObject3);
        }
        localObject3 = this.a;
        localObject3 = b.f((b)localObject3);
        ((e)localObject3).a();
        localObject3 = this.a;
        localObject3 = b.g((b)localObject3);
        ((HybiParser)localObject3).a((a)localObject4);
        continue;
        Object localObject4 = localObject3;
      }
    }
    localObject1 = this.a;
    localObject1 = b.b((b)localObject1);
    localObject1 = ((URI)localObject1).getPath();
    bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool2)
    {
      localObject1 = "/";
      localObject4 = this.a;
      localObject4 = b.b((b)localObject4);
      localObject4 = ((URI)localObject4).getQuery();
      bool4 = TextUtils.isEmpty((CharSequence)localObject4);
      if (bool4) {
        break label1292;
      }
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = "?";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = this.a;
      localObject4 = b.b((b)localObject4);
      localObject4 = ((URI)localObject4).getQuery();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject4 = localObject1;
      localObject1 = this.a;
      localObject1 = b.b((b)localObject1);
      localObject1 = ((URI)localObject1).getScheme();
      localObject5 = "wss";
      bool2 = ((String)localObject1).equals(localObject5);
      if (!bool2) {
        break label890;
      }
      localObject1 = "https";
      localObject5 = new java/net/URI;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject7 = "//";
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject7 = this.a;
      localObject7 = b.b((b)localObject7);
      localObject7 = ((URI)localObject7).getHost();
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject6 = ((StringBuilder)localObject6).toString();
      i1 = 0;
      localObject7 = null;
      ((URI)localObject5).<init>((String)localObject1, (String)localObject6, null);
      localObject1 = this.a;
      localObject1 = b.b((b)localObject1);
      localObject1 = ((URI)localObject1).getScheme();
      localObject6 = "wss";
      bool2 = ((String)localObject1).equals(localObject6);
      if (!bool2) {
        break label896;
      }
      localObject1 = this.a;
      localObject1 = b.c((b)localObject1);
      localObject6 = this.a;
      localObject7 = this.a;
      localObject7 = b.b((b)localObject7);
      localObject7 = ((URI)localObject7).getHost();
      localObject1 = ((SocketFactory)localObject1).createSocket((String)localObject7, n);
      b.a((b)localObject6, (Socket)localObject1);
      localObject8 = new java/io/PrintWriter;
      localObject1 = this.a;
      localObject1 = b.d((b)localObject1);
      localObject1 = ((Socket)localObject1).getOutputStream();
      ((PrintWriter)localObject8).<init>((OutputStream)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject6 = "GET ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject6);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = " HTTP/1.1\r\n";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = "Upgrade: websocket\r\n";
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = "Connection: Upgrade\r\n";
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "Host: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = this.a;
      localObject4 = b.b((b)localObject4);
      localObject4 = ((URI)localObject4).getHost();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = "\r\n";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "Origin: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = ((URI)localObject5).toString();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = "\r\n";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "Sec-WebSocket-Key: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).append(str2);
      localObject4 = "\r\n";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = "Sec-WebSocket-Version: 13\r\n";
      ((PrintWriter)localObject8).print((String)localObject1);
      localObject1 = this.a;
      localObject1 = b.e((b)localObject1);
      if (localObject1 == null) {
        break label903;
      }
      localObject1 = this.a;
      localObject1 = b.e((b)localObject1);
      localObject4 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject4).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = ((Iterator)localObject4).next();
        localObject1 = (NameValuePair)localObject1;
        localObject5 = "%s: %s\r\n";
        int i2 = 2;
        localObject6 = new Object[i2];
        i1 = 0;
        localObject7 = null;
        String str3 = ((NameValuePair)localObject1).getName();
        localObject6[0] = str3;
        i1 = 1;
        localObject1 = ((NameValuePair)localObject1).getValue();
        localObject6[i1] = localObject1;
        localObject1 = String.format((String)localObject5, (Object[])localObject6);
        ((PrintWriter)localObject8).print((String)localObject1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/codebutler/android_websockets/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */