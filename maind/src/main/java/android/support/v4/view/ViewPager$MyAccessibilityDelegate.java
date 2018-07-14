package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ViewPager$MyAccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  ViewPager$MyAccessibilityDelegate(ViewPager paramViewPager) {}
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    String str = ViewPager.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    int i = 1;
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    Object localObject1 = ViewPager.class.getName();
    paramAccessibilityNodeInfoCompat.setClassName((CharSequence)localObject1);
    localObject1 = ViewPager.access$100(this.this$0);
    if (localObject1 != null)
    {
      localObject1 = ViewPager.access$100(this.this$0);
      int k = ((PagerAdapter)localObject1).getCount();
      if (k <= i) {}
    }
    for (;;)
    {
      paramAccessibilityNodeInfoCompat.setScrollable(i);
      Object localObject2 = ViewPager.access$100(this.this$0);
      int m;
      if (localObject2 != null)
      {
        localObject2 = this.this$0;
        j = ViewPager.access$200((ViewPager)localObject2);
        if (j >= 0)
        {
          localObject2 = this.this$0;
          j = ViewPager.access$200((ViewPager)localObject2);
          localObject1 = ViewPager.access$100(this.this$0);
          m = ((PagerAdapter)localObject1).getCount() + -1;
          if (j < m)
          {
            j = 4096;
            paramAccessibilityNodeInfoCompat.addAction(j);
          }
        }
      }
      localObject2 = ViewPager.access$100(this.this$0);
      if (localObject2 != null)
      {
        localObject2 = this.this$0;
        j = ViewPager.access$200((ViewPager)localObject2);
        if (j > 0)
        {
          localObject2 = this.this$0;
          j = ViewPager.access$200((ViewPager)localObject2);
          localObject1 = ViewPager.access$100(this.this$0);
          m = ((PagerAdapter)localObject1).getCount();
          if (j < m)
          {
            j = 8192;
            paramAccessibilityNodeInfoCompat.addAction(j);
          }
        }
      }
      return;
      int j = 0;
      localObject2 = null;
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = true;
    ViewPager localViewPager = null;
    boolean bool2 = super.performAccessibilityAction(paramView, paramInt, paramBundle);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject;
      int i;
      PagerAdapter localPagerAdapter;
      int j;
      switch (paramInt)
      {
      default: 
        bool1 = false;
        break;
      case 4096: 
        localObject = ViewPager.access$100(this.this$0);
        if (localObject != null)
        {
          localObject = this.this$0;
          i = ViewPager.access$200((ViewPager)localObject);
          if (i >= 0)
          {
            localObject = this.this$0;
            i = ViewPager.access$200((ViewPager)localObject);
            localPagerAdapter = ViewPager.access$100(this.this$0);
            j = localPagerAdapter.getCount() + -1;
            if (i < j)
            {
              localViewPager = this.this$0;
              localObject = this.this$0;
              i = ViewPager.access$200((ViewPager)localObject) + 1;
              localViewPager.setCurrentItem(i);
              continue;
            }
          }
        }
        bool1 = false;
        break;
      case 8192: 
        localObject = ViewPager.access$100(this.this$0);
        if (localObject != null)
        {
          localObject = this.this$0;
          i = ViewPager.access$200((ViewPager)localObject);
          if (i > 0)
          {
            localObject = this.this$0;
            i = ViewPager.access$200((ViewPager)localObject);
            localPagerAdapter = ViewPager.access$100(this.this$0);
            j = localPagerAdapter.getCount();
            if (i < j)
            {
              localViewPager = this.this$0;
              localObject = this.this$0;
              i = ViewPager.access$200((ViewPager)localObject) + -1;
              localViewPager.setCurrentItem(i);
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$MyAccessibilityDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */