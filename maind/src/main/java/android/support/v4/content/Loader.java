package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{
  boolean mAbandoned = false;
  boolean mContentChanged = false;
  Context mContext;
  int mId;
  Loader.OnLoadCompleteListener mListener;
  boolean mReset = true;
  boolean mStarted = false;
  
  public Loader(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
  }
  
  public void abandon()
  {
    this.mAbandoned = true;
    onAbandon();
  }
  
  public String dataToString(Object paramObject)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    DebugUtils.buildShortClassTag(paramObject, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void deliverResult(Object paramObject)
  {
    Loader.OnLoadCompleteListener localOnLoadCompleteListener = this.mListener;
    if (localOnLoadCompleteListener != null)
    {
      localOnLoadCompleteListener = this.mListener;
      localOnLoadCompleteListener.onLoadComplete(this, paramObject);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    int i = this.mId;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mListener=");
    Loader.OnLoadCompleteListener localOnLoadCompleteListener = this.mListener;
    paramPrintWriter.println(localOnLoadCompleteListener);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    boolean bool = this.mStarted;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mContentChanged=");
    bool = this.mContentChanged;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mAbandoned=");
    bool = this.mAbandoned;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mReset=");
    bool = this.mReset;
    paramPrintWriter.println(bool);
  }
  
  public void forceLoad()
  {
    onForceLoad();
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public boolean isAbandoned()
  {
    return this.mAbandoned;
  }
  
  public boolean isReset()
  {
    return this.mReset;
  }
  
  public boolean isStarted()
  {
    return this.mStarted;
  }
  
  protected void onAbandon() {}
  
  public void onContentChanged()
  {
    boolean bool = this.mStarted;
    if (bool) {
      forceLoad();
    }
    for (;;)
    {
      return;
      bool = true;
      this.mContentChanged = bool;
    }
  }
  
  protected void onForceLoad() {}
  
  protected void onReset() {}
  
  protected void onStartLoading() {}
  
  protected void onStopLoading() {}
  
  public void registerListener(int paramInt, Loader.OnLoadCompleteListener paramOnLoadCompleteListener)
  {
    Object localObject = this.mListener;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is already a listener registered");
      throw ((Throwable)localObject);
    }
    this.mListener = paramOnLoadCompleteListener;
    this.mId = paramInt;
  }
  
  public void reset()
  {
    onReset();
    this.mReset = true;
    this.mStarted = false;
    this.mAbandoned = false;
    this.mContentChanged = false;
  }
  
  public final void startLoading()
  {
    this.mStarted = true;
    this.mReset = false;
    this.mAbandoned = false;
    onStartLoading();
  }
  
  public void stopLoading()
  {
    this.mStarted = false;
    onStopLoading();
  }
  
  public boolean takeContentChanged()
  {
    boolean bool = this.mContentChanged;
    this.mContentChanged = false;
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    DebugUtils.buildShortClassTag(this, localStringBuilder);
    localStringBuilder.append(" id=");
    int i = this.mId;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void unregisterListener(Loader.OnLoadCompleteListener paramOnLoadCompleteListener)
  {
    Object localObject = this.mListener;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No listener register");
      throw ((Throwable)localObject);
    }
    localObject = this.mListener;
    if (localObject != paramOnLoadCompleteListener)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Attempting to unregister the wrong listener");
      throw ((Throwable)localObject);
    }
    this.mListener = null;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/Loader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */