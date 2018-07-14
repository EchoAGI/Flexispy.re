package a_vcard.android.syncml.pim;

import java.util.ArrayList;

public class VNode
{
  public String VName;
  public int parseStatus;
  public ArrayList propList;
  
  public VNode()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.propList = localArrayList;
    this.parseStatus = 1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/VNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */