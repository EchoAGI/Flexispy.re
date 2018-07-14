package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class ListFragment$2
  implements AdapterView.OnItemClickListener
{
  ListFragment$2(ListFragment paramListFragment) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ListFragment localListFragment = this.this$0;
    Object localObject = paramAdapterView;
    localObject = (ListView)paramAdapterView;
    localListFragment.onListItemClick((ListView)localObject, paramView, paramInt, paramLong);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ListFragment$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */