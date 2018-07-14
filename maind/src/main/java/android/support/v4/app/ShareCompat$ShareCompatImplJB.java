package android.support.v4.app;

import android.view.MenuItem;

class ShareCompat$ShareCompatImplJB
  extends ShareCompat.ShareCompatImplICS
{
  public String escapeHtml(CharSequence paramCharSequence)
  {
    return ShareCompatJB.escapeHtml(paramCharSequence);
  }
  
  boolean shouldAddChooserIntent(MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat$ShareCompatImplJB.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */