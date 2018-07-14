package org.apache.commons.lang.builder;

final class ToStringStyle$NoFieldNameToStringStyle
  extends ToStringStyle
{
  private static final long serialVersionUID = 1L;
  
  ToStringStyle$NoFieldNameToStringStyle()
  {
    setUseFieldNames(false);
  }
  
  private Object readResolve()
  {
    return ToStringStyle.NO_FIELD_NAMES_STYLE;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle$NoFieldNameToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */