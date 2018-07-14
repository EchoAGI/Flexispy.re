package com.vvt.eventrepository.querycriteria;

public enum QueryOrder
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/eventrepository/querycriteria/QueryOrder;
    ((QueryOrder)localObject).<init>("QueryNewestFirst", 0);
    QueryNewestFirst = (QueryOrder)localObject;
    localObject = new com/vvt/eventrepository/querycriteria/QueryOrder;
    ((QueryOrder)localObject).<init>("QueryOldestFist", i);
    QueryOldestFist = (QueryOrder)localObject;
    localObject = new QueryOrder[2];
    QueryOrder localQueryOrder = QueryNewestFirst;
    localObject[0] = localQueryOrder;
    localQueryOrder = QueryOldestFist;
    localObject[i] = localQueryOrder;
    a = (QueryOrder[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/querycriteria/QueryOrder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */