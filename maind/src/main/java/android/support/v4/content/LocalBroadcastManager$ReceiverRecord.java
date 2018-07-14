package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

class LocalBroadcastManager$ReceiverRecord
{
  boolean broadcasting;
  final IntentFilter filter;
  final BroadcastReceiver receiver;
  
  LocalBroadcastManager$ReceiverRecord(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    this.filter = paramIntentFilter;
    this.receiver = paramBroadcastReceiver;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("Receiver{");
    Object localObject = this.receiver;
    localStringBuilder.append(localObject);
    localStringBuilder.append(" filter=");
    localObject = this.filter;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/LocalBroadcastManager$ReceiverRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */