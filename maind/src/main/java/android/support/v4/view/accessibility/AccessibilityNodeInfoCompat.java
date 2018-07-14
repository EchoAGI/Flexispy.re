package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeInfoCompat
{
  public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
  public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
  public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
  public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
  public static final int ACTION_CLEAR_FOCUS = 2;
  public static final int ACTION_CLEAR_SELECTION = 8;
  public static final int ACTION_CLICK = 16;
  public static final int ACTION_FOCUS = 1;
  public static final int ACTION_LONG_CLICK = 32;
  public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
  public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
  public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
  public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
  public static final int ACTION_SCROLL_BACKWARD = 8192;
  public static final int ACTION_SCROLL_FORWARD = 4096;
  public static final int ACTION_SELECT = 4;
  public static final int FOCUS_ACCESSIBILITY = 2;
  public static final int FOCUS_INPUT = 1;
  private static final AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl IMPL;
  public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
  public static final int MOVEMENT_GRANULARITY_LINE = 4;
  public static final int MOVEMENT_GRANULARITY_PAGE = 16;
  public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
  public static final int MOVEMENT_GRANULARITY_WORD = 2;
  private final Object mInfo;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl;
      ((AccessibilityNodeInfoCompat.AccessibilityNodeInfoJellybeanImpl)localObject).<init>();
      IMPL = (AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl;
        ((AccessibilityNodeInfoCompat.AccessibilityNodeInfoIcsImpl)localObject).<init>();
        IMPL = (AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl)localObject;
      }
      else
      {
        localObject = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl;
        ((AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl)localObject).<init>();
        IMPL = (AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl)localObject;
      }
    }
  }
  
  public AccessibilityNodeInfoCompat(Object paramObject)
  {
    this.mInfo = paramObject;
  }
  
  public static AccessibilityNodeInfoCompat obtain()
  {
    return wrapNonNullInstance(IMPL.obtain());
  }
  
  public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = paramAccessibilityNodeInfoCompat.mInfo;
    return wrapNonNullInstance(localAccessibilityNodeInfoImpl.obtain(localObject));
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView)
  {
    return wrapNonNullInstance(IMPL.obtain(paramView));
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView, int paramInt)
  {
    return wrapNonNullInstance(IMPL.obtain(paramView, paramInt));
  }
  
  static AccessibilityNodeInfoCompat wrapNonNullInstance(Object paramObject)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat;
    if (paramObject != null)
    {
      localAccessibilityNodeInfoCompat = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
      localAccessibilityNodeInfoCompat.<init>(paramObject);
    }
    for (;;)
    {
      return localAccessibilityNodeInfoCompat;
      localAccessibilityNodeInfoCompat = null;
    }
  }
  
  public void addAction(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.addAction(localObject, paramInt);
  }
  
  public void addChild(View paramView)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.addChild(localObject, paramView);
  }
  
  public void addChild(View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.addChild(localObject, paramView, paramInt);
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
          localObject3 = (AccessibilityNodeInfoCompat)paramObject;
          localObject1 = this.mInfo;
          if (localObject1 == null)
          {
            localObject1 = ((AccessibilityNodeInfoCompat)localObject3).mInfo;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.mInfo;
            localObject2 = ((AccessibilityNodeInfoCompat)localObject3).mInfo;
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public List findAccessibilityNodeInfosByText(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = IMPL;
    Object localObject2 = this.mInfo;
    List localList = ((AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl)localObject1).findAccessibilityNodeInfosByText(localObject2, paramString);
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject3 = localList.get(j);
      localObject1 = new android/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
      ((AccessibilityNodeInfoCompat)localObject1).<init>(localObject3);
      localArrayList.add(localObject1);
      j += 1;
    }
    return localArrayList;
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return wrapNonNullInstance(localAccessibilityNodeInfoImpl.findFocus(localObject, paramInt));
  }
  
  public AccessibilityNodeInfoCompat focusSearch(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return wrapNonNullInstance(localAccessibilityNodeInfoImpl.focusSearch(localObject, paramInt));
  }
  
  public int getActions()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getActions(localObject);
  }
  
  public void getBoundsInParent(Rect paramRect)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.getBoundsInParent(localObject, paramRect);
  }
  
  public void getBoundsInScreen(Rect paramRect)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.getBoundsInScreen(localObject, paramRect);
  }
  
  public AccessibilityNodeInfoCompat getChild(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return wrapNonNullInstance(localAccessibilityNodeInfoImpl.getChild(localObject, paramInt));
  }
  
  public int getChildCount()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getChildCount(localObject);
  }
  
  public CharSequence getClassName()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getClassName(localObject);
  }
  
  public CharSequence getContentDescription()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getContentDescription(localObject);
  }
  
  public Object getInfo()
  {
    return this.mInfo;
  }
  
  public int getMovementGranularities()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getMovementGranularities(localObject);
  }
  
  public CharSequence getPackageName()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getPackageName(localObject);
  }
  
  public AccessibilityNodeInfoCompat getParent()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return wrapNonNullInstance(localAccessibilityNodeInfoImpl.getParent(localObject));
  }
  
  public CharSequence getText()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getText(localObject);
  }
  
  public int getWindowId()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.getWindowId(localObject);
  }
  
  public int hashCode()
  {
    Object localObject = this.mInfo;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.mInfo;
      i = localObject.hashCode();
    }
  }
  
  public boolean isAccessibilityFocused()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isAccessibilityFocused(localObject);
  }
  
  public boolean isCheckable()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isCheckable(localObject);
  }
  
  public boolean isChecked()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isChecked(localObject);
  }
  
  public boolean isClickable()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isClickable(localObject);
  }
  
  public boolean isEnabled()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isEnabled(localObject);
  }
  
  public boolean isFocusable()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isFocusable(localObject);
  }
  
  public boolean isFocused()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isFocused(localObject);
  }
  
  public boolean isLongClickable()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isLongClickable(localObject);
  }
  
  public boolean isPassword()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isPassword(localObject);
  }
  
  public boolean isScrollable()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isScrollable(localObject);
  }
  
  public boolean isSelected()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isSelected(localObject);
  }
  
  public boolean isVisibleToUser()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.isVisibleToUser(localObject);
  }
  
  public boolean performAction(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.performAction(localObject, paramInt);
  }
  
  public boolean performAction(int paramInt, Bundle paramBundle)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    return localAccessibilityNodeInfoImpl.performAction(localObject, paramInt, paramBundle);
  }
  
  public void recycle()
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.recycle(localObject);
  }
  
  public void setAccessibilityFocused(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setAccessibilityFocused(localObject, paramBoolean);
  }
  
  public void setBoundsInParent(Rect paramRect)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setBoundsInParent(localObject, paramRect);
  }
  
  public void setBoundsInScreen(Rect paramRect)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setBoundsInScreen(localObject, paramRect);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setCheckable(localObject, paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setChecked(localObject, paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setClassName(localObject, paramCharSequence);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setClickable(localObject, paramBoolean);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setContentDescription(localObject, paramCharSequence);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setEnabled(localObject, paramBoolean);
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setFocusable(localObject, paramBoolean);
  }
  
  public void setFocused(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setFocused(localObject, paramBoolean);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setLongClickable(localObject, paramBoolean);
  }
  
  public void setMovementGranularities(int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setMovementGranularities(localObject, paramInt);
  }
  
  public void setPackageName(CharSequence paramCharSequence)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setPackageName(localObject, paramCharSequence);
  }
  
  public void setParent(View paramView)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setParent(localObject, paramView);
  }
  
  public void setParent(View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setParent(localObject, paramView, paramInt);
  }
  
  public void setPassword(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setPassword(localObject, paramBoolean);
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setScrollable(localObject, paramBoolean);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setSelected(localObject, paramBoolean);
  }
  
  public void setSource(View paramView)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setSource(localObject, paramView);
  }
  
  public void setSource(View paramView, int paramInt)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setSource(localObject, paramView, paramInt);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setText(localObject, paramCharSequence);
  }
  
  public void setVisibleToUser(boolean paramBoolean)
  {
    AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl localAccessibilityNodeInfoImpl = IMPL;
    Object localObject = this.mInfo;
    localAccessibilityNodeInfoImpl.setVisibleToUser(localObject, paramBoolean);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/accessibility/AccessibilityNodeInfoCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */