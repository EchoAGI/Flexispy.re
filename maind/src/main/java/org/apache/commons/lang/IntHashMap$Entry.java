package org.apache.commons.lang;

class IntHashMap$Entry
{
  final int hash;
  final int key;
  Entry next;
  Object value;
  
  protected IntHashMap$Entry(int paramInt1, int paramInt2, Object paramObject, Entry paramEntry)
  {
    this.hash = paramInt1;
    this.key = paramInt2;
    this.value = paramObject;
    this.next = paramEntry;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/IntHashMap$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */