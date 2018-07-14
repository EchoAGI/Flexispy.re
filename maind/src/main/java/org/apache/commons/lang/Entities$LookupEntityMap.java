package org.apache.commons.lang;

class Entities$LookupEntityMap
  extends Entities.PrimitiveEntityMap
{
  private final int LOOKUP_TABLE_SIZE = 256;
  private String[] lookupTable;
  
  private void createLookupTable()
  {
    int i = 256;
    String[] arrayOfString = new String[i];
    this.lookupTable = arrayOfString;
    int j = 0;
    while (j < i)
    {
      arrayOfString = this.lookupTable;
      String str = super.name(j);
      arrayOfString[j] = str;
      j += 1;
    }
  }
  
  private String[] lookupTable()
  {
    String[] arrayOfString = this.lookupTable;
    if (arrayOfString == null) {
      createLookupTable();
    }
    return this.lookupTable;
  }
  
  public String name(int paramInt)
  {
    int i = 256;
    if (paramInt < i) {}
    for (String str = lookupTable()[paramInt];; str = super.name(paramInt)) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/Entities$LookupEntityMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */