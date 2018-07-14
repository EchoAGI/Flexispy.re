package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LocalBroadcastManager
{
  private static final boolean DEBUG = false;
  static final int MSG_EXEC_PENDING_BROADCASTS = 1;
  private static final String TAG = "LocalBroadcastManager";
  private static LocalBroadcastManager mInstance;
  private static final Object mLock;
  private final HashMap mActions;
  private final Context mAppContext;
  private final Handler mHandler;
  private final ArrayList mPendingBroadcasts;
  private final HashMap mReceivers;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    mLock = localObject;
  }
  
  private LocalBroadcastManager(Context paramContext)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.mReceivers = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.mActions = ((HashMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mPendingBroadcasts = ((ArrayList)localObject);
    this.mAppContext = paramContext;
    localObject = new android/support/v4/content/LocalBroadcastManager$1;
    Looper localLooper = paramContext.getMainLooper();
    ((LocalBroadcastManager.1)localObject).<init>(this, localLooper);
    this.mHandler = ((Handler)localObject);
  }
  
  private void executePendingBroadcasts()
  {
    LocalBroadcastManager.BroadcastRecord[] arrayOfBroadcastRecord = null;
    for (;;)
    {
      int j;
      synchronized (this.mReceivers)
      {
        Object localObject2 = this.mPendingBroadcasts;
        int i = ((ArrayList)localObject2).size();
        if (i <= 0) {
          return;
        }
        arrayOfBroadcastRecord = new LocalBroadcastManager.BroadcastRecord[i];
        localObject2 = this.mPendingBroadcasts;
        ((ArrayList)localObject2).toArray(arrayOfBroadcastRecord);
        localObject2 = this.mPendingBroadcasts;
        ((ArrayList)localObject2).clear();
        j = 0;
        int k = arrayOfBroadcastRecord.length;
        if (j >= k) {
          break;
        }
        LocalBroadcastManager.BroadcastRecord localBroadcastRecord = arrayOfBroadcastRecord[j];
        int m = 0;
        localObject2 = localBroadcastRecord.receivers;
        k = ((ArrayList)localObject2).size();
        if (m < k)
        {
          localObject2 = ((LocalBroadcastManager.ReceiverRecord)localBroadcastRecord.receivers.get(m)).receiver;
          ??? = this.mAppContext;
          Intent localIntent = localBroadcastRecord.intent;
          ((BroadcastReceiver)localObject2).onReceive((Context)???, localIntent);
          m += 1;
        }
      }
      j += 1;
    }
  }
  
  public static LocalBroadcastManager getInstance(Context paramContext)
  {
    synchronized (mLock)
    {
      LocalBroadcastManager localLocalBroadcastManager = mInstance;
      if (localLocalBroadcastManager == null)
      {
        localLocalBroadcastManager = new android/support/v4/content/LocalBroadcastManager;
        Context localContext = paramContext.getApplicationContext();
        localLocalBroadcastManager.<init>(localContext);
        mInstance = localLocalBroadcastManager;
      }
      localLocalBroadcastManager = mInstance;
      return localLocalBroadcastManager;
    }
  }
  
  public void registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.mReceivers)
    {
      LocalBroadcastManager.ReceiverRecord localReceiverRecord = new android/support/v4/content/LocalBroadcastManager$ReceiverRecord;
      localReceiverRecord.<init>(paramIntentFilter, paramBroadcastReceiver);
      HashMap localHashMap2 = this.mReceivers;
      Object localObject2 = localHashMap2.get(paramBroadcastReceiver);
      localObject2 = (ArrayList)localObject2;
      int i;
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        i = 1;
        ((ArrayList)localObject2).<init>(i);
        localHashMap2 = this.mReceivers;
        localHashMap2.put(paramBroadcastReceiver, localObject2);
      }
      ((ArrayList)localObject2).add(paramIntentFilter);
      int j = 0;
      for (;;)
      {
        i = paramIntentFilter.countActions();
        if (j >= i) {
          break;
        }
        String str = paramIntentFilter.getAction(j);
        localHashMap2 = this.mActions;
        Object localObject3 = localHashMap2.get(str);
        localObject3 = (ArrayList)localObject3;
        if (localObject3 == null)
        {
          localObject3 = new java/util/ArrayList;
          i = 1;
          ((ArrayList)localObject3).<init>(i);
          localHashMap2 = this.mActions;
          localHashMap2.put(str, localObject3);
        }
        ((ArrayList)localObject3).add(localReceiverRecord);
        j += 1;
      }
      return;
    }
  }
  
  public boolean sendBroadcast(Intent paramIntent)
  {
    Object localObject1 = this;
    Object localObject5;
    ArrayList localArrayList;
    int m;
    Object localObject4;
    for (;;)
    {
      int k;
      Object localObject6;
      int n;
      synchronized (this.mReceivers)
      {
        String str1 = paramIntent.getAction();
        Object localObject2 = this.mAppContext;
        localObject2 = ((Context)localObject2).getContentResolver();
        localObject1 = paramIntent;
        String str2 = paramIntent.resolveTypeIfNeeded((ContentResolver)localObject2);
        Uri localUri = paramIntent.getData();
        String str3 = paramIntent.getScheme();
        Set localSet = paramIntent.getCategories();
        int i = paramIntent.getFlags() & 0x8;
        Object localObject8;
        boolean bool1;
        if (i != 0)
        {
          k = 1;
          if (k != 0)
          {
            localObject2 = "LocalBroadcastManager";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Resolving type ";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).append(str2);
            localObject6 = " scheme ";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).append(str3);
            localObject6 = " of intent ";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject1 = paramIntent;
            localObject5 = ((StringBuilder)localObject5).append(paramIntent);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.v((String)localObject2, (String)localObject5);
          }
          localObject1 = this;
          localObject2 = this.mActions;
          localObject5 = paramIntent.getAction();
          Object localObject7 = ((HashMap)localObject2).get(localObject5);
          localObject7 = (ArrayList)localObject7;
          if (localObject7 == null) {
            break label841;
          }
          if (k != 0)
          {
            localObject2 = "LocalBroadcastManager";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Action list: ";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).append(localObject7);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.v((String)localObject2, (String)localObject5);
          }
          localArrayList = null;
          m = 0;
          i = ((ArrayList)localObject7).size();
          if (m >= i) {
            break;
          }
          localObject8 = ((ArrayList)localObject7).get(m);
          localObject8 = (LocalBroadcastManager.ReceiverRecord)localObject8;
          if (k != 0)
          {
            localObject2 = "LocalBroadcastManager";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Matching against filter ";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject1 = ((LocalBroadcastManager.ReceiverRecord)localObject8).filter;
            localObject6 = localObject1;
            localObject5 = ((StringBuilder)localObject5).append(localObject1);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.v((String)localObject2, (String)localObject5);
          }
          bool1 = ((LocalBroadcastManager.ReceiverRecord)localObject8).broadcasting;
          if (bool1)
          {
            if (k != 0)
            {
              localObject2 = "LocalBroadcastManager";
              localObject5 = "  Filter's target already added";
              Log.v((String)localObject2, (String)localObject5);
            }
            m += 1;
            continue;
          }
        }
        else
        {
          k = 0;
          continue;
        }
        localObject2 = ((LocalBroadcastManager.ReceiverRecord)localObject8).filter;
        localObject5 = "LocalBroadcastManager";
        n = ((IntentFilter)localObject2).match(str1, str2, str3, localUri, localSet, (String)localObject5);
        if (n >= 0)
        {
          if (k != 0)
          {
            localObject2 = "LocalBroadcastManager";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "  Filter matched!  match=0x";
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = Integer.toHexString(n);
            localObject1 = localObject6;
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.v((String)localObject2, (String)localObject5);
          }
          if (localArrayList == null)
          {
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
          }
          localArrayList.add(localObject8);
          bool1 = true;
          ((LocalBroadcastManager.ReceiverRecord)localObject8).broadcasting = bool1;
        }
      }
      if (k != 0)
      {
        String str4;
        switch (n)
        {
        default: 
          str4 = "unknown reason";
        }
        for (;;)
        {
          localObject4 = "LocalBroadcastManager";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject6 = "  Filter did not match: ";
          localObject1 = localObject6;
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject5 = ((StringBuilder)localObject5).append(str4);
          localObject5 = ((StringBuilder)localObject5).toString();
          Log.v((String)localObject4, (String)localObject5);
          break;
          str4 = "action";
          continue;
          str4 = "category";
          continue;
          str4 = "data";
          continue;
          str4 = "type";
        }
      }
    }
    boolean bool2;
    if (localArrayList != null)
    {
      m = 0;
      for (;;)
      {
        int j = localArrayList.size();
        if (m >= j) {
          break;
        }
        localObject4 = localArrayList.get(m);
        localObject4 = (LocalBroadcastManager.ReceiverRecord)localObject4;
        i1 = 0;
        localObject5 = null;
        ((LocalBroadcastManager.ReceiverRecord)localObject4).broadcasting = false;
        m += 1;
      }
      localObject1 = this;
      localObject4 = this.mPendingBroadcasts;
      localObject5 = new android/support/v4/content/LocalBroadcastManager$BroadcastRecord;
      localObject1 = paramIntent;
      ((LocalBroadcastManager.BroadcastRecord)localObject5).<init>(paramIntent, localArrayList);
      ((ArrayList)localObject4).add(localObject5);
      localObject1 = this;
      localObject4 = this.mHandler;
      int i1 = 1;
      bool2 = ((Handler)localObject4).hasMessages(i1);
      if (!bool2)
      {
        localObject4 = this.mHandler;
        i1 = 1;
        ((Handler)localObject4).sendEmptyMessage(i1);
      }
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      label841:
      bool2 = false;
      localObject4 = null;
    }
  }
  
  public void sendBroadcastSync(Intent paramIntent)
  {
    boolean bool = sendBroadcast(paramIntent);
    if (bool) {
      executePendingBroadcasts();
    }
  }
  
  public void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver)
  {
    synchronized (this.mReceivers)
    {
      Object localObject1 = this.mReceivers;
      Object localObject3 = ((HashMap)localObject1).remove(paramBroadcastReceiver);
      localObject3 = (ArrayList)localObject3;
      if (localObject3 == null) {
        return;
      }
      int i = 0;
      for (;;)
      {
        int j = ((ArrayList)localObject3).size();
        if (i >= j) {
          break;
        }
        Object localObject4 = ((ArrayList)localObject3).get(i);
        localObject4 = (IntentFilter)localObject4;
        int k = 0;
        for (;;)
        {
          j = ((IntentFilter)localObject4).countActions();
          if (k >= j) {
            break;
          }
          String str = ((IntentFilter)localObject4).getAction(k);
          localObject1 = this.mActions;
          Object localObject5 = ((HashMap)localObject1).get(str);
          localObject5 = (ArrayList)localObject5;
          if (localObject5 != null)
          {
            int m = 0;
            for (;;)
            {
              j = ((ArrayList)localObject5).size();
              if (m >= j) {
                break;
              }
              localObject1 = ((ArrayList)localObject5).get(m);
              localObject1 = (LocalBroadcastManager.ReceiverRecord)localObject1;
              localObject1 = ((LocalBroadcastManager.ReceiverRecord)localObject1).receiver;
              if (localObject1 == paramBroadcastReceiver)
              {
                ((ArrayList)localObject5).remove(m);
                m += -1;
              }
              m += 1;
            }
            j = ((ArrayList)localObject5).size();
            if (j <= 0)
            {
              localObject1 = this.mActions;
              ((HashMap)localObject1).remove(str);
            }
          }
          k += 1;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/LocalBroadcastManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */