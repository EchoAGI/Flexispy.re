package com.vvt.http;

import com.vvt.ak.a;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class e
{
  static final HostnameVerifier a;
  private static final boolean b = a.a;
  private static final boolean c = a.e;
  
  static
  {
    g localg = new com/vvt/http/g;
    localg.<init>();
    a = localg;
  }
  
  public static long a(String paramString)
  {
    localObject1 = null;
    l1 = 0L;
    for (;;)
    {
      try
      {
        bool1 = b;
        if (bool1) {}
        localObject2 = new java/net/URL;
        ((URL)localObject2).<init>(paramString);
        localObject7 = "http://";
        boolean bool2 = paramString.startsWith((String)localObject7);
        if (!bool2) {
          continue;
        }
        localObject2 = ((URL)localObject2).openConnection();
        localObject2 = (HttpURLConnection)localObject2;
        localObject1 = localObject2;
        ((URLConnection)localObject1).connect();
        localObject2 = "content-length";
        localObject2 = ((URLConnection)localObject1).getHeaderField((String)localObject2);
        l1 = Long.parseLong((String)localObject2);
        if (localObject1 != null)
        {
          bool1 = localObject1 instanceof HttpURLConnection;
          if (bool1)
          {
            localObject2 = localObject1;
            localObject2 = (HttpURLConnection)localObject1;
            ((HttpURLConnection)localObject2).disconnect();
          }
          bool1 = localObject1 instanceof HttpsURLConnection;
          if (bool1)
          {
            localObject1 = (HttpsURLConnection)localObject1;
            ((HttpsURLConnection)localObject1).disconnect();
          }
        }
        l2 = l1;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        Object localObject2;
        Object localObject7;
        boolean bool3;
        bool1 = c;
        if ((bool1) && (localObject1 == null)) {
          continue;
        }
        bool1 = localObject1 instanceof HttpURLConnection;
        if (!bool1) {
          continue;
        }
        Object localObject3 = localObject1;
        localObject3 = (HttpURLConnection)localObject1;
        ((HttpURLConnection)localObject3).disconnect();
        bool1 = localObject1 instanceof HttpsURLConnection;
        if (!bool1) {
          continue;
        }
        localObject1 = (HttpsURLConnection)localObject1;
        ((HttpsURLConnection)localObject1).disconnect();
        l2 = l1;
        continue;
      }
      catch (Exception localException)
      {
        bool1 = c;
        if ((bool1) && (localObject1 == null)) {
          continue;
        }
        bool1 = localObject1 instanceof HttpURLConnection;
        if (!bool1) {
          continue;
        }
        Object localObject4 = localObject1;
        localObject4 = (HttpURLConnection)localObject1;
        ((HttpURLConnection)localObject4).disconnect();
        bool1 = localObject1 instanceof HttpsURLConnection;
        if (!bool1) {
          continue;
        }
        localObject1 = (HttpsURLConnection)localObject1;
        ((HttpsURLConnection)localObject1).disconnect();
        long l2 = l1;
        continue;
      }
      finally
      {
        localObject8 = localObject5;
        if (localObject1 == null) {
          continue;
        }
        boolean bool1 = localObject1 instanceof HttpURLConnection;
        if (!bool1) {
          continue;
        }
        Object localObject6 = localObject1;
        localObject6 = (HttpURLConnection)localObject1;
        ((HttpURLConnection)localObject6).disconnect();
        bool1 = localObject1 instanceof HttpsURLConnection;
        if (!bool1) {
          continue;
        }
        localObject1 = (HttpsURLConnection)localObject1;
        ((HttpsURLConnection)localObject1).disconnect();
      }
      bool3 = b;
      if (bool3) {}
      bool3 = b;
      if (bool3) {}
      return l2;
      a();
      localObject2 = ((URL)localObject2).openConnection();
      localObject2 = (HttpsURLConnection)localObject2;
      localObject7 = a;
      ((HttpsURLConnection)localObject2).setHostnameVerifier((HostnameVerifier)localObject7);
      localObject1 = localObject2;
    }
  }
  
  private static void a()
  {
    int i = 1;
    Object localObject1 = new TrustManager[i];
    f localf = new com/vvt/http/f;
    localf.<init>();
    localObject1[0] = localf;
    Object localObject2 = "TLS";
    try
    {
      localObject2 = SSLContext.getInstance((String)localObject2);
      localf = null;
      SecureRandom localSecureRandom = new java/security/SecureRandom;
      localSecureRandom.<init>();
      ((SSLContext)localObject2).init(null, (TrustManager[])localObject1, localSecureRandom);
      localObject1 = ((SSLContext)localObject2).getSocketFactory();
      HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)localObject1);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */