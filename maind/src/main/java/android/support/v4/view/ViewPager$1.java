package android.support.v4.view;

import java.util.Comparator;

final class ViewPager$1
  implements Comparator
{
  public int compare(ViewPager.ItemInfo paramItemInfo1, ViewPager.ItemInfo paramItemInfo2)
  {
    int i = paramItemInfo1.position;
    int j = paramItemInfo2.position;
    return i - j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/ViewPager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */