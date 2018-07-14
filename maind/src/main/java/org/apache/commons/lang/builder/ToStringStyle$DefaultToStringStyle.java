package org.apache.commons.lang.builder;

final class ToStringStyle$DefaultToStringStyle
  extends ToStringStyle
{
  private static final long serialVersionUID = 1L;
  
  private Object readResolve()
  {
    return ToStringStyle.DEFAULT_STYLE;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle$DefaultToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */