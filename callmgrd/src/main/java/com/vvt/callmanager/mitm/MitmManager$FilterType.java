package com.vvt.callmanager.mitm;

 enum MitmManager$FilterType
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/callmanager/mitm/MitmManager$FilterType;
    ((FilterType)localObject).<init>("FILTER_CALL", 0);
    FILTER_CALL = (FilterType)localObject;
    localObject = new com/vvt/callmanager/mitm/MitmManager$FilterType;
    ((FilterType)localObject).<init>("FILTER_SMS", i);
    FILTER_SMS = (FilterType)localObject;
    localObject = new FilterType[2];
    FilterType localFilterType = FILTER_CALL;
    localObject[0] = localFilterType;
    localFilterType = FILTER_SMS;
    localObject[i] = localFilterType;
    a = (FilterType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/MitmManager$FilterType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */