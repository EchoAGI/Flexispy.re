package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter
  extends Filter
{
  CursorFilter.CursorFilterClient mClient;
  
  CursorFilter(CursorFilter.CursorFilterClient paramCursorFilterClient)
  {
    this.mClient = paramCursorFilterClient;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    CursorFilter.CursorFilterClient localCursorFilterClient = this.mClient;
    paramObject = (Cursor)paramObject;
    return localCursorFilterClient.convertToString((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    CursorFilter.CursorFilterClient localCursorFilterClient = this.mClient;
    Cursor localCursor = localCursorFilterClient.runQueryOnBackgroundThread(paramCharSequence);
    Filter.FilterResults localFilterResults = new android/widget/Filter$FilterResults;
    localFilterResults.<init>();
    int i;
    if (localCursor != null)
    {
      i = localCursor.getCount();
      localFilterResults.count = i;
    }
    for (localFilterResults.values = localCursor;; localFilterResults.values = null)
    {
      return localFilterResults;
      localFilterResults.count = 0;
      i = 0;
      localCursorFilterClient = null;
    }
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = this.mClient.getCursor();
    Object localObject = paramFilterResults.values;
    if (localObject != null)
    {
      localObject = paramFilterResults.values;
      if (localObject != localCursor)
      {
        CursorFilter.CursorFilterClient localCursorFilterClient = this.mClient;
        localObject = (Cursor)paramFilterResults.values;
        localCursorFilterClient.changeCursor((Cursor)localObject);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/CursorFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */