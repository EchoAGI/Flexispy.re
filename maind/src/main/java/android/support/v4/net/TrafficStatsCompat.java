package android.support.v4.net;

import android.os.Build.VERSION;
import java.net.Socket;

public class TrafficStatsCompat
{
  private static final TrafficStatsCompat.TrafficStatsCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;
      ((TrafficStatsCompat.IcsTrafficStatsCompatImpl)localObject).<init>();
    }
    for (IMPL = (TrafficStatsCompat.TrafficStatsCompatImpl)localObject;; IMPL = (TrafficStatsCompat.TrafficStatsCompatImpl)localObject)
    {
      return;
      localObject = new android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;
      ((TrafficStatsCompat.BaseTrafficStatsCompatImpl)localObject).<init>();
    }
  }
  
  public static void clearThreadStatsTag()
  {
    IMPL.clearThreadStatsTag();
  }
  
  public static int getThreadStatsTag()
  {
    return IMPL.getThreadStatsTag();
  }
  
  public static void incrementOperationCount(int paramInt)
  {
    IMPL.incrementOperationCount(paramInt);
  }
  
  public static void incrementOperationCount(int paramInt1, int paramInt2)
  {
    IMPL.incrementOperationCount(paramInt1, paramInt2);
  }
  
  public static void setThreadStatsTag(int paramInt)
  {
    IMPL.setThreadStatsTag(paramInt);
  }
  
  public static void tagSocket(Socket paramSocket)
  {
    IMPL.tagSocket(paramSocket);
  }
  
  public static void untagSocket(Socket paramSocket)
  {
    IMPL.untagSocket(paramSocket);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/TrafficStatsCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */