package com.vvt.preference;

import java.io.Serializable;
import java.util.ArrayList;

public class PrefNotificationMessage
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 4561474316646521494L;
  private ArrayList messageItems;
  
  public PrefNotificationMessage()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.messageItems = localArrayList;
  }
  
  public ArrayList getMessageItems()
  {
    return this.messageItems;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.NOTIFICATION_MESSAGES;
  }
  
  public void setMessageItems(ArrayList paramArrayList)
  {
    this.messageItems = paramArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefNotificationMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */