package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;

public class SearchViewCompat
{
  private static final SearchViewCompat.SearchViewCompatImpl IMPL;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;
      ((SearchViewCompat.SearchViewCompatHoneycombImpl)localObject).<init>();
    }
    for (IMPL = (SearchViewCompat.SearchViewCompatImpl)localObject;; IMPL = (SearchViewCompat.SearchViewCompatImpl)localObject)
    {
      return;
      localObject = new android/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;
      ((SearchViewCompat.SearchViewCompatStubImpl)localObject).<init>();
    }
  }
  
  private SearchViewCompat(Context paramContext) {}
  
  public static View newSearchView(Context paramContext)
  {
    return IMPL.newSearchView(paramContext);
  }
  
  public static void setOnQueryTextListener(View paramView, SearchViewCompat.OnQueryTextListenerCompat paramOnQueryTextListenerCompat)
  {
    SearchViewCompat.SearchViewCompatImpl localSearchViewCompatImpl = IMPL;
    Object localObject = paramOnQueryTextListenerCompat.mListener;
    localSearchViewCompatImpl.setOnQueryTextListener(paramView, localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/SearchViewCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */