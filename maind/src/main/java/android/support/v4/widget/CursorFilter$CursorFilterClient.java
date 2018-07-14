package android.support.v4.widget;

import android.database.Cursor;

abstract interface CursorFilter$CursorFilterClient
{
  public abstract void changeCursor(Cursor paramCursor);
  
  public abstract CharSequence convertToString(Cursor paramCursor);
  
  public abstract Cursor getCursor();
  
  public abstract Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/CursorFilter$CursorFilterClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */