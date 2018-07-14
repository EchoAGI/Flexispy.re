package com.vvt.remotecommand;

import java.io.Serializable;
import java.util.ArrayList;

public class RemoteCommandList implements Serializable {
  private static final long serialVersionUID = 673578204744841226L;
  private ArrayList list;
  
  public RemoteCommandList() {
    this.list = new java.util.ArrayList();
  }
  
  public ArrayList getList()
  {
    return this.list;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/RemoteCommandList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */