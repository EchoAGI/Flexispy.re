package org.apache.commons.lang;

public class IllegalClassException
  extends IllegalArgumentException
{
  private static final long serialVersionUID = 8063272569377254819L;
  
  public IllegalClassException(Class paramClass1, Class paramClass2)
  {
    super((String)localObject);
  }
  
  public IllegalClassException(Class paramClass, Object paramObject) {}
  
  public IllegalClassException(String paramString)
  {
    super(paramString);
  }
  
  private static final String safeGetClassName(Class paramClass)
  {
    if (paramClass == null) {}
    for (String str = null;; str = paramClass.getName()) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/IllegalClassException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */