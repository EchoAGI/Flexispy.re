package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

class SearchViewCompatHoneycomb
{
  public static Object newOnQueryTextListener(SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge paramOnQueryTextListenerCompatBridge)
  {
    SearchViewCompatHoneycomb.1 local1 = new android/support/v4/widget/SearchViewCompatHoneycomb$1;
    local1.<init>(paramOnQueryTextListenerCompatBridge);
    return local1;
  }
  
  public static View newSearchView(Context paramContext)
  {
    SearchView localSearchView = new android/widget/SearchView;
    localSearchView.<init>(paramContext);
    return localSearchView;
  }
  
  public static void setOnQueryTextListener(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (SearchView)paramObject1;
    paramObject2 = (SearchView.OnQueryTextListener)paramObject2;
    ((SearchView)paramObject1).setOnQueryTextListener((SearchView.OnQueryTextListener)paramObject2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/SearchViewCompatHoneycomb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */