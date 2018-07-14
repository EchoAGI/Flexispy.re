package android.support.v4.widget;

public abstract class SearchViewCompat$OnQueryTextListenerCompat
{
  final Object mListener;
  
  public SearchViewCompat$OnQueryTextListenerCompat()
  {
    Object localObject = SearchViewCompat.access$000().newOnQueryTextListener(this);
    this.mListener = localObject;
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    return false;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return false;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */