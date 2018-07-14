package android.support.v4.net;

class TrafficStatsCompat$BaseTrafficStatsCompatImpl$1
  extends ThreadLocal
{
  TrafficStatsCompat$BaseTrafficStatsCompatImpl$1(TrafficStatsCompat.BaseTrafficStatsCompatImpl paramBaseTrafficStatsCompatImpl) {}
  
  protected TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags initialValue()
  {
    TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags localSocketTags = new android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;
    localSocketTags.<init>(null);
    return localSocketTags;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */