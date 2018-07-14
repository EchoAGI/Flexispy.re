package android.support.v4.widget;

import android.content.Context;
import android.view.View;

class SearchViewCompat$SearchViewCompatHoneycombImpl
  extends SearchViewCompat.SearchViewCompatStubImpl
{
  public Object newOnQueryTextListener(SearchViewCompat.OnQueryTextListenerCompat paramOnQueryTextListenerCompat)
  {
    SearchViewCompat.SearchViewCompatHoneycombImpl.1 local1 = new android/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl$1;
    local1.<init>(this, paramOnQueryTextListenerCompat);
    return SearchViewCompatHoneycomb.newOnQueryTextListener(local1);
  }
  
  public View newSearchView(Context paramContext)
  {
    return SearchViewCompatHoneycomb.newSearchView(paramContext);
  }
  
  public void setOnQueryTextListener(Object paramObject1, Object paramObject2)
  {
    SearchViewCompatHoneycomb.setOnQueryTextListener(paramObject1, paramObject2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */