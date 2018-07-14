package android.support.v4.content;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader
  extends AsyncTaskLoader
{
  Cursor mCursor;
  final Loader.ForceLoadContentObserver mObserver;
  String[] mProjection;
  String mSelection;
  String[] mSelectionArgs;
  String mSortOrder;
  Uri mUri;
  
  public CursorLoader(Context paramContext)
  {
    super(paramContext);
    Loader.ForceLoadContentObserver localForceLoadContentObserver = new android/support/v4/content/Loader$ForceLoadContentObserver;
    localForceLoadContentObserver.<init>(this);
    this.mObserver = localForceLoadContentObserver;
  }
  
  public CursorLoader(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    Loader.ForceLoadContentObserver localForceLoadContentObserver = new android/support/v4/content/Loader$ForceLoadContentObserver;
    localForceLoadContentObserver.<init>(this);
    this.mObserver = localForceLoadContentObserver;
    this.mUri = paramUri;
    this.mProjection = paramArrayOfString1;
    this.mSelection = paramString1;
    this.mSelectionArgs = paramArrayOfString2;
    this.mSortOrder = paramString2;
  }
  
  public void deliverResult(Cursor paramCursor)
  {
    boolean bool = isReset();
    if (bool) {
      if (paramCursor != null) {
        paramCursor.close();
      }
    }
    for (;;)
    {
      return;
      Cursor localCursor = this.mCursor;
      this.mCursor = paramCursor;
      bool = isStarted();
      if (bool) {
        super.deliverResult(paramCursor);
      }
      if ((localCursor != null) && (localCursor != paramCursor))
      {
        bool = localCursor.isClosed();
        if (!bool) {
          localCursor.close();
        }
      }
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    Object localObject = this.mUri;
    paramPrintWriter.println(localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    localObject = Arrays.toString(this.mProjection);
    paramPrintWriter.println((String)localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    localObject = this.mSelection;
    paramPrintWriter.println((String)localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    localObject = Arrays.toString(this.mSelectionArgs);
    paramPrintWriter.println((String)localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    localObject = this.mSortOrder;
    paramPrintWriter.println((String)localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    localObject = this.mCursor;
    paramPrintWriter.println(localObject);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    boolean bool = this.mContentChanged;
    paramPrintWriter.println(bool);
  }
  
  public String[] getProjection()
  {
    return this.mProjection;
  }
  
  public String getSelection()
  {
    return this.mSelection;
  }
  
  public String[] getSelectionArgs()
  {
    return this.mSelectionArgs;
  }
  
  public String getSortOrder()
  {
    return this.mSortOrder;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public Cursor loadInBackground()
  {
    Object localObject = getContext().getContentResolver();
    Uri localUri = this.mUri;
    String[] arrayOfString1 = this.mProjection;
    String str1 = this.mSelection;
    String[] arrayOfString2 = this.mSelectionArgs;
    String str2 = this.mSortOrder;
    Cursor localCursor = ((ContentResolver)localObject).query(localUri, arrayOfString1, str1, arrayOfString2, str2);
    if (localCursor != null)
    {
      localCursor.getCount();
      localObject = this.mObserver;
      registerContentObserver(localCursor, (ContentObserver)localObject);
    }
    return localCursor;
  }
  
  public void onCanceled(Cursor paramCursor)
  {
    if (paramCursor != null)
    {
      boolean bool = paramCursor.isClosed();
      if (!bool) {
        paramCursor.close();
      }
    }
  }
  
  protected void onReset()
  {
    super.onReset();
    onStopLoading();
    Cursor localCursor = this.mCursor;
    if (localCursor != null)
    {
      localCursor = this.mCursor;
      boolean bool = localCursor.isClosed();
      if (!bool)
      {
        localCursor = this.mCursor;
        localCursor.close();
      }
    }
    this.mCursor = null;
  }
  
  protected void onStartLoading()
  {
    Cursor localCursor = this.mCursor;
    if (localCursor != null)
    {
      localCursor = this.mCursor;
      deliverResult(localCursor);
    }
    boolean bool = takeContentChanged();
    if (!bool)
    {
      localCursor = this.mCursor;
      if (localCursor != null) {}
    }
    else
    {
      forceLoad();
    }
  }
  
  protected void onStopLoading()
  {
    cancelLoad();
  }
  
  void registerContentObserver(Cursor paramCursor, ContentObserver paramContentObserver)
  {
    Loader.ForceLoadContentObserver localForceLoadContentObserver = this.mObserver;
    paramCursor.registerContentObserver(localForceLoadContentObserver);
  }
  
  public void setProjection(String[] paramArrayOfString)
  {
    this.mProjection = paramArrayOfString;
  }
  
  public void setSelection(String paramString)
  {
    this.mSelection = paramString;
  }
  
  public void setSelectionArgs(String[] paramArrayOfString)
  {
    this.mSelectionArgs = paramArrayOfString;
  }
  
  public void setSortOrder(String paramString)
  {
    this.mSortOrder = paramString;
  }
  
  public void setUri(Uri paramUri)
  {
    this.mUri = paramUri;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/content/CursorLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */