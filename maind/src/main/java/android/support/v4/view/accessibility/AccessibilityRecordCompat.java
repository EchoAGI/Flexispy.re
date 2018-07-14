package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Parcelable;
import android.view.View;
import java.util.List;

public class AccessibilityRecordCompat
{
  private static final AccessibilityRecordCompat.AccessibilityRecordImpl IMPL;
  private final Object mRecord;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordJellyBeanImpl;
      ((AccessibilityRecordCompat.AccessibilityRecordJellyBeanImpl)localObject).<init>();
      IMPL = (AccessibilityRecordCompat.AccessibilityRecordImpl)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 15;
      if (i >= j)
      {
        localObject = new android/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordIcsMr1Impl;
        ((AccessibilityRecordCompat.AccessibilityRecordIcsMr1Impl)localObject).<init>();
        IMPL = (AccessibilityRecordCompat.AccessibilityRecordImpl)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordIcsImpl;
          ((AccessibilityRecordCompat.AccessibilityRecordIcsImpl)localObject).<init>();
          IMPL = (AccessibilityRecordCompat.AccessibilityRecordImpl)localObject;
        }
        else
        {
          localObject = new android/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordStubImpl;
          ((AccessibilityRecordCompat.AccessibilityRecordStubImpl)localObject).<init>();
          IMPL = (AccessibilityRecordCompat.AccessibilityRecordImpl)localObject;
        }
      }
    }
  }
  
  public AccessibilityRecordCompat(Object paramObject)
  {
    this.mRecord = paramObject;
  }
  
  public static AccessibilityRecordCompat obtain()
  {
    AccessibilityRecordCompat localAccessibilityRecordCompat = new android/support/v4/view/accessibility/AccessibilityRecordCompat;
    Object localObject = IMPL.obtain();
    localAccessibilityRecordCompat.<init>(localObject);
    return localAccessibilityRecordCompat;
  }
  
  public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat paramAccessibilityRecordCompat)
  {
    AccessibilityRecordCompat localAccessibilityRecordCompat = new android/support/v4/view/accessibility/AccessibilityRecordCompat;
    Object localObject1 = IMPL;
    Object localObject2 = paramAccessibilityRecordCompat.mRecord;
    localObject1 = ((AccessibilityRecordCompat.AccessibilityRecordImpl)localObject1).obtain(localObject2);
    localAccessibilityRecordCompat.<init>(localObject1);
    return localAccessibilityRecordCompat;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          Object localObject3 = paramObject;
          localObject3 = (AccessibilityRecordCompat)paramObject;
          localObject1 = this.mRecord;
          if (localObject1 == null)
          {
            localObject1 = ((AccessibilityRecordCompat)localObject3).mRecord;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.mRecord;
            localObject2 = ((AccessibilityRecordCompat)localObject3).mRecord;
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public int getAddedCount()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getAddedCount(localObject);
  }
  
  public CharSequence getBeforeText()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getBeforeText(localObject);
  }
  
  public CharSequence getClassName()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getClassName(localObject);
  }
  
  public CharSequence getContentDescription()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getContentDescription(localObject);
  }
  
  public int getCurrentItemIndex()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getCurrentItemIndex(localObject);
  }
  
  public int getFromIndex()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getFromIndex(localObject);
  }
  
  public Object getImpl()
  {
    return this.mRecord;
  }
  
  public int getItemCount()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getItemCount(localObject);
  }
  
  public int getMaxScrollX()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getMaxScrollX(localObject);
  }
  
  public int getMaxScrollY()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getMaxScrollY(localObject);
  }
  
  public Parcelable getParcelableData()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getParcelableData(localObject);
  }
  
  public int getRemovedCount()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getRemovedCount(localObject);
  }
  
  public int getScrollX()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getScrollX(localObject);
  }
  
  public int getScrollY()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getScrollY(localObject);
  }
  
  public AccessibilityNodeInfoCompat getSource()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getSource(localObject);
  }
  
  public List getText()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getText(localObject);
  }
  
  public int getToIndex()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getToIndex(localObject);
  }
  
  public int getWindowId()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.getWindowId(localObject);
  }
  
  public int hashCode()
  {
    Object localObject = this.mRecord;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.mRecord;
      i = localObject.hashCode();
    }
  }
  
  public boolean isChecked()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.isChecked(localObject);
  }
  
  public boolean isEnabled()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.isEnabled(localObject);
  }
  
  public boolean isFullScreen()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.isFullScreen(localObject);
  }
  
  public boolean isPassword()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.isPassword(localObject);
  }
  
  public boolean isScrollable()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    return localAccessibilityRecordImpl.isScrollable(localObject);
  }
  
  public void recycle()
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.recycle(localObject);
  }
  
  public void setAddedCount(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setAddedCount(localObject, paramInt);
  }
  
  public void setBeforeText(CharSequence paramCharSequence)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setBeforeText(localObject, paramCharSequence);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setChecked(localObject, paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setClassName(localObject, paramCharSequence);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setContentDescription(localObject, paramCharSequence);
  }
  
  public void setCurrentItemIndex(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setCurrentItemIndex(localObject, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setEnabled(localObject, paramBoolean);
  }
  
  public void setFromIndex(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setFromIndex(localObject, paramInt);
  }
  
  public void setFullScreen(boolean paramBoolean)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setFullScreen(localObject, paramBoolean);
  }
  
  public void setItemCount(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setItemCount(localObject, paramInt);
  }
  
  public void setMaxScrollX(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setMaxScrollX(localObject, paramInt);
  }
  
  public void setMaxScrollY(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setMaxScrollY(localObject, paramInt);
  }
  
  public void setParcelableData(Parcelable paramParcelable)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setParcelableData(localObject, paramParcelable);
  }
  
  public void setPassword(boolean paramBoolean)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setPassword(localObject, paramBoolean);
  }
  
  public void setRemovedCount(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setRemovedCount(localObject, paramInt);
  }
  
  public void setScrollX(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setScrollX(localObject, paramInt);
  }
  
  public void setScrollY(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setScrollY(localObject, paramInt);
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setScrollable(localObject, paramBoolean);
  }
  
  public void setSource(View paramView)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setSource(localObject, paramView);
  }
  
  public void setSource(View paramView, int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setSource(localObject, paramView, paramInt);
  }
  
  public void setToIndex(int paramInt)
  {
    AccessibilityRecordCompat.AccessibilityRecordImpl localAccessibilityRecordImpl = IMPL;
    Object localObject = this.mRecord;
    localAccessibilityRecordImpl.setToIndex(localObject, paramInt);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityRecordCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */