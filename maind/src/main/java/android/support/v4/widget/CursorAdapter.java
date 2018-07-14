package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class CursorAdapter
  extends BaseAdapter
  implements Filterable, CursorFilter.CursorFilterClient
{
  public static final int FLAG_AUTO_REQUERY = 1;
  public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
  protected boolean mAutoRequery;
  protected CursorAdapter.ChangeObserver mChangeObserver;
  protected Context mContext;
  protected Cursor mCursor;
  protected CursorFilter mCursorFilter;
  protected DataSetObserver mDataSetObserver;
  protected boolean mDataValid;
  protected FilterQueryProvider mFilterQueryProvider;
  protected int mRowIDColumn;
  
  public CursorAdapter(Context paramContext, Cursor paramCursor)
  {
    init(paramContext, paramCursor, 1);
  }
  
  public CursorAdapter(Context paramContext, Cursor paramCursor, int paramInt)
  {
    init(paramContext, paramCursor, paramInt);
  }
  
  public CursorAdapter(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      init(paramContext, paramCursor, i);
      return;
    }
  }
  
  public abstract void bindView(View paramView, Context paramContext, Cursor paramCursor);
  
  public void changeCursor(Cursor paramCursor)
  {
    Cursor localCursor = swapCursor(paramCursor);
    if (localCursor != null) {
      localCursor.close();
    }
  }
  
  public CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (String str = "";; str = paramCursor.toString()) {
      return str;
    }
  }
  
  public int getCount()
  {
    boolean bool = this.mDataValid;
    Cursor localCursor;
    int i;
    if (bool)
    {
      localCursor = this.mCursor;
      if (localCursor != null)
      {
        localCursor = this.mCursor;
        i = localCursor.getCount();
      }
    }
    for (;;)
    {
      return i;
      i = 0;
      localCursor = null;
    }
  }
  
  public Cursor getCursor()
  {
    return this.mCursor;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = this.mDataValid;
    View localView;
    if (bool)
    {
      Object localObject = this.mCursor;
      ((Cursor)localObject).moveToPosition(paramInt);
      if (paramView == null)
      {
        localObject = this.mContext;
        Cursor localCursor = this.mCursor;
        localView = newDropDownView((Context)localObject, localCursor, paramViewGroup);
        localObject = this.mContext;
        localCursor = this.mCursor;
        bindView(localView, (Context)localObject, localCursor);
      }
    }
    for (;;)
    {
      return localView;
      localView = paramView;
      break;
      localView = null;
    }
  }
  
  public Filter getFilter()
  {
    CursorFilter localCursorFilter = this.mCursorFilter;
    if (localCursorFilter == null)
    {
      localCursorFilter = new android/support/v4/widget/CursorFilter;
      localCursorFilter.<init>(this);
      this.mCursorFilter = localCursorFilter;
    }
    return this.mCursorFilter;
  }
  
  public FilterQueryProvider getFilterQueryProvider()
  {
    return this.mFilterQueryProvider;
  }
  
  public Object getItem(int paramInt)
  {
    boolean bool = this.mDataValid;
    if (bool)
    {
      localCursor = this.mCursor;
      if (localCursor != null) {
        this.mCursor.moveToPosition(paramInt);
      }
    }
    for (Cursor localCursor = this.mCursor;; localCursor = null)
    {
      return localCursor;
      bool = false;
    }
  }
  
  public long getItemId(int paramInt)
  {
    long l = 0L;
    boolean bool = this.mDataValid;
    if (bool)
    {
      Cursor localCursor1 = this.mCursor;
      if (localCursor1 != null)
      {
        localCursor1 = this.mCursor;
        bool = localCursor1.moveToPosition(paramInt);
        if (bool)
        {
          Cursor localCursor2 = this.mCursor;
          int i = this.mRowIDColumn;
          l = localCursor2.getLong(i);
        }
      }
    }
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = this.mDataValid;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("this should only be called when the cursor is valid");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mCursor;
    bool = ((Cursor)localObject1).moveToPosition(paramInt);
    Object localObject2;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "couldn't move cursor to position " + paramInt;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramView == null)
    {
      localObject1 = this.mContext;
      localObject2 = this.mCursor;
    }
    for (View localView = newView((Context)localObject1, (Cursor)localObject2, paramViewGroup);; localView = paramView)
    {
      localObject1 = this.mContext;
      localObject2 = this.mCursor;
      bindView(localView, (Context)localObject1, (Cursor)localObject2);
      return localView;
    }
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  void init(Context paramContext, Cursor paramCursor, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    int j = 1;
    int k = paramInt & 0x1;
    if (k == j)
    {
      paramInt |= 0x2;
      this.mAutoRequery = j;
      if (paramCursor == null) {
        break label190;
      }
      label35:
      this.mCursor = paramCursor;
      this.mDataValid = j;
      this.mContext = paramContext;
      if (j == 0) {
        break label196;
      }
      localObject = "_id";
      i = paramCursor.getColumnIndexOrThrow((String)localObject);
      label70:
      this.mRowIDColumn = i;
      i = paramInt & 0x2;
      k = 2;
      if (i != k) {
        break label202;
      }
      localObject = new android/support/v4/widget/CursorAdapter$ChangeObserver;
      ((CursorAdapter.ChangeObserver)localObject).<init>(this);
      this.mChangeObserver = ((CursorAdapter.ChangeObserver)localObject);
      localObject = new android/support/v4/widget/CursorAdapter$MyDataSetObserver;
      ((CursorAdapter.MyDataSetObserver)localObject).<init>(this, null);
    }
    for (this.mDataSetObserver = ((DataSetObserver)localObject);; this.mDataSetObserver = null)
    {
      if (j != 0)
      {
        localObject = this.mChangeObserver;
        if (localObject != null)
        {
          localObject = this.mChangeObserver;
          paramCursor.registerContentObserver((ContentObserver)localObject);
        }
        localObject = this.mDataSetObserver;
        if (localObject != null)
        {
          localObject = this.mDataSetObserver;
          paramCursor.registerDataSetObserver((DataSetObserver)localObject);
        }
      }
      return;
      this.mAutoRequery = false;
      break;
      label190:
      j = 0;
      break label35;
      label196:
      i = -1;
      break label70;
      label202:
      this.mChangeObserver = null;
    }
  }
  
  protected void init(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      init(paramContext, paramCursor, i);
      return;
    }
  }
  
  public View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return newView(paramContext, paramCursor, paramViewGroup);
  }
  
  public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  protected void onContentChanged()
  {
    boolean bool = this.mAutoRequery;
    if (bool)
    {
      Cursor localCursor = this.mCursor;
      if (localCursor != null)
      {
        localCursor = this.mCursor;
        bool = localCursor.isClosed();
        if (!bool)
        {
          localCursor = this.mCursor;
          bool = localCursor.requery();
          this.mDataValid = bool;
        }
      }
    }
  }
  
  public Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    Object localObject = this.mFilterQueryProvider;
    if (localObject != null) {}
    for (localObject = this.mFilterQueryProvider.runQuery(paramCharSequence);; localObject = this.mCursor) {
      return (Cursor)localObject;
    }
  }
  
  public void setFilterQueryProvider(FilterQueryProvider paramFilterQueryProvider)
  {
    this.mFilterQueryProvider = paramFilterQueryProvider;
  }
  
  public Cursor swapCursor(Cursor paramCursor)
  {
    Object localObject = this.mCursor;
    Cursor localCursor;
    if (paramCursor == localObject) {
      localCursor = null;
    }
    for (;;)
    {
      return localCursor;
      localCursor = this.mCursor;
      if (localCursor != null)
      {
        localObject = this.mChangeObserver;
        if (localObject != null)
        {
          localObject = this.mChangeObserver;
          localCursor.unregisterContentObserver((ContentObserver)localObject);
        }
        localObject = this.mDataSetObserver;
        if (localObject != null)
        {
          localObject = this.mDataSetObserver;
          localCursor.unregisterDataSetObserver((DataSetObserver)localObject);
        }
      }
      this.mCursor = paramCursor;
      int i;
      if (paramCursor != null)
      {
        localObject = this.mChangeObserver;
        if (localObject != null)
        {
          localObject = this.mChangeObserver;
          paramCursor.registerContentObserver((ContentObserver)localObject);
        }
        localObject = this.mDataSetObserver;
        if (localObject != null)
        {
          localObject = this.mDataSetObserver;
          paramCursor.registerDataSetObserver((DataSetObserver)localObject);
        }
        localObject = "_id";
        i = paramCursor.getColumnIndexOrThrow((String)localObject);
        this.mRowIDColumn = i;
        i = 1;
        this.mDataValid = i;
        notifyDataSetChanged();
      }
      else
      {
        this.mRowIDColumn = -1;
        i = 0;
        localObject = null;
        this.mDataValid = false;
        notifyDataSetInvalidated();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/CursorAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */