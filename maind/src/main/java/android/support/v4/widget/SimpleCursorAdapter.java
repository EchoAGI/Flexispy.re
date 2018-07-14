package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCursorAdapter
  extends ResourceCursorAdapter
{
  private SimpleCursorAdapter.CursorToStringConverter mCursorToStringConverter;
  protected int[] mFrom;
  String[] mOriginalFrom;
  private int mStringConversionColumn = -1;
  protected int[] mTo;
  private SimpleCursorAdapter.ViewBinder mViewBinder;
  
  public SimpleCursorAdapter(Context paramContext, int paramInt, Cursor paramCursor, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super(paramContext, paramInt, paramCursor);
    this.mTo = paramArrayOfInt;
    this.mOriginalFrom = paramArrayOfString;
    findColumns(paramArrayOfString);
  }
  
  public SimpleCursorAdapter(Context paramContext, int paramInt1, Cursor paramCursor, String[] paramArrayOfString, int[] paramArrayOfInt, int paramInt2)
  {
    super(paramContext, paramInt1, paramCursor, paramInt2);
    this.mTo = paramArrayOfInt;
    this.mOriginalFrom = paramArrayOfString;
    findColumns(paramArrayOfString);
  }
  
  private void findColumns(String[] paramArrayOfString)
  {
    Object localObject = this.mCursor;
    if (localObject != null)
    {
      int i = paramArrayOfString.length;
      localObject = this.mFrom;
      if (localObject != null)
      {
        localObject = this.mFrom;
        j = localObject.length;
        if (j == i) {}
      }
      else
      {
        localObject = new int[i];
        this.mFrom = ((int[])localObject);
      }
      int k = 0;
      while (k < i)
      {
        localObject = this.mFrom;
        Cursor localCursor = this.mCursor;
        String str = paramArrayOfString[k];
        int m = localCursor.getColumnIndexOrThrow(str);
        localObject[k] = m;
        k += 1;
      }
    }
    int j = 0;
    localObject = null;
    this.mFrom = null;
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    SimpleCursorAdapter.ViewBinder localViewBinder = this.mViewBinder;
    Object localObject1 = this.mTo;
    int i = localObject1.length;
    int[] arrayOfInt1 = this.mFrom;
    int[] arrayOfInt2 = this.mTo;
    int j = 0;
    if (j < i)
    {
      int k = arrayOfInt2[j];
      Object localObject2 = paramView.findViewById(k);
      String str1;
      boolean bool1;
      if (localObject2 != null)
      {
        boolean bool2 = false;
        if (localViewBinder != null)
        {
          k = arrayOfInt1[j];
          bool2 = localViewBinder.setViewValue((View)localObject2, paramCursor, k);
        }
        if (!bool2)
        {
          k = arrayOfInt1[j];
          str1 = paramCursor.getString(k);
          if (str1 == null) {
            str1 = "";
          }
          bool1 = localObject2 instanceof TextView;
          if (!bool1) {
            break label155;
          }
          localObject2 = (TextView)localObject2;
          setViewText((TextView)localObject2, str1);
        }
      }
      for (;;)
      {
        j += 1;
        break;
        label155:
        bool1 = localObject2 instanceof ImageView;
        if (!bool1) {
          break label185;
        }
        localObject2 = (ImageView)localObject2;
        setViewImage((ImageView)localObject2, str1);
      }
      label185:
      localObject1 = new java/lang/IllegalStateException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str2 = localObject2.getClass().getName();
      localObject3 = str2 + " is not a " + " view that can be bounds by this SimpleCursorAdapter";
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
  }
  
  public void changeCursorAndColumns(Cursor paramCursor, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.mOriginalFrom = paramArrayOfString;
    this.mTo = paramArrayOfInt;
    super.changeCursor(paramCursor);
    String[] arrayOfString = this.mOriginalFrom;
    findColumns(arrayOfString);
  }
  
  public CharSequence convertToString(Cursor paramCursor)
  {
    Object localObject = this.mCursorToStringConverter;
    if (localObject != null) {
      localObject = this.mCursorToStringConverter.convertToString(paramCursor);
    }
    for (;;)
    {
      return (CharSequence)localObject;
      int i = this.mStringConversionColumn;
      int j = -1;
      if (i > j)
      {
        i = this.mStringConversionColumn;
        localObject = paramCursor.getString(i);
      }
      else
      {
        localObject = super.convertToString(paramCursor);
      }
    }
  }
  
  public SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter()
  {
    return this.mCursorToStringConverter;
  }
  
  public int getStringConversionColumn()
  {
    return this.mStringConversionColumn;
  }
  
  public SimpleCursorAdapter.ViewBinder getViewBinder()
  {
    return this.mViewBinder;
  }
  
  public void setCursorToStringConverter(SimpleCursorAdapter.CursorToStringConverter paramCursorToStringConverter)
  {
    this.mCursorToStringConverter = paramCursorToStringConverter;
  }
  
  public void setStringConversionColumn(int paramInt)
  {
    this.mStringConversionColumn = paramInt;
  }
  
  public void setViewBinder(SimpleCursorAdapter.ViewBinder paramViewBinder)
  {
    this.mViewBinder = paramViewBinder;
  }
  
  public void setViewImage(ImageView paramImageView, String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      paramImageView.setImageResource(i);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        Uri localUri = Uri.parse(paramString);
        paramImageView.setImageURI(localUri);
      }
    }
  }
  
  public void setViewText(TextView paramTextView, String paramString)
  {
    paramTextView.setText(paramString);
  }
  
  public Cursor swapCursor(Cursor paramCursor)
  {
    Cursor localCursor = super.swapCursor(paramCursor);
    String[] arrayOfString = this.mOriginalFrom;
    findColumns(arrayOfString);
    return localCursor;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/SimpleCursorAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */