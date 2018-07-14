package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class CursorAdapter$ChangeObserver
  extends ContentObserver
{
  public CursorAdapter$ChangeObserver(CursorAdapter paramCursorAdapter)
  {
    super(localHandler);
  }
  
  public boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public void onChange(boolean paramBoolean)
  {
    this.this$0.onContentChanged();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/CursorAdapter$ChangeObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */