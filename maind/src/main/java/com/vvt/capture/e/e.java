package com.vvt.capture.e;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class e
  implements X509TrustManager
{
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return new X509Certificate[0];
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */