package com.vvt.pushnotification;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.vvt.pushnotification.connectionhistory.ConnectionType;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class e
{
  public static ConnectionType a(Context paramContext)
  {
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i = -1;
    NetworkInfo localNetworkInfo = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localNetworkInfo != null) {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    }
    for (int j = ((NetworkInfo)localObject).getType();; j = i)
    {
      if (j == 0) {
        localObject = ConnectionType.GPRS;
      }
      for (;;)
      {
        return (ConnectionType)localObject;
        i = 1;
        if (j == i) {
          localObject = ConnectionType.WIFI;
        } else {
          localObject = ConnectionType.UNKNOWN;
        }
      }
    }
  }
  
  public static String a(Throwable paramThrowable)
  {
    if (paramThrowable != null)
    {
      localObject = new java/io/StringWriter;
      ((StringWriter)localObject).<init>();
      PrintWriter localPrintWriter = new java/io/PrintWriter;
      localPrintWriter.<init>((Writer)localObject);
      paramThrowable.printStackTrace(localPrintWriter);
      localPrintWriter.flush();
    }
    for (Object localObject = ((StringWriter)localObject).toString();; localObject = "") {
      return (String)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */