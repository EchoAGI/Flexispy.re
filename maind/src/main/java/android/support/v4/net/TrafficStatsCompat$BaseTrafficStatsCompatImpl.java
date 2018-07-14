package android.support.v4.net;

import java.net.Socket;

class TrafficStatsCompat$BaseTrafficStatsCompatImpl
  implements TrafficStatsCompat.TrafficStatsCompatImpl
{
  private ThreadLocal mThreadSocketTags;
  
  TrafficStatsCompat$BaseTrafficStatsCompatImpl()
  {
    TrafficStatsCompat.BaseTrafficStatsCompatImpl.1 local1 = new android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$1;
    local1.<init>(this);
    this.mThreadSocketTags = local1;
  }
  
  public void clearThreadStatsTag()
  {
    ((TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags)this.mThreadSocketTags.get()).statsTag = -1;
  }
  
  public int getThreadStatsTag()
  {
    return ((TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags)this.mThreadSocketTags.get()).statsTag;
  }
  
  public void incrementOperationCount(int paramInt) {}
  
  public void incrementOperationCount(int paramInt1, int paramInt2) {}
  
  public void setThreadStatsTag(int paramInt)
  {
    ((TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags)this.mThreadSocketTags.get()).statsTag = paramInt;
  }
  
  public void tagSocket(Socket paramSocket) {}
  
  public void untagSocket(Socket paramSocket) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */