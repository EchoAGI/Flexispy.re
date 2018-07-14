package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

public abstract interface LoaderManager$LoaderCallbacks
{
  public abstract Loader onCreateLoader(int paramInt, Bundle paramBundle);
  
  public abstract void onLoadFinished(Loader paramLoader, Object paramObject);
  
  public abstract void onLoaderReset(Loader paramLoader);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/LoaderManager$LoaderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */