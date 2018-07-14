package org.apache.commons.lang.builder;

final class ToStringStyle$SimpleToStringStyle
  extends ToStringStyle
{
  private static final long serialVersionUID = 1L;
  
  ToStringStyle$SimpleToStringStyle()
  {
    setUseClassName(false);
    setUseIdentityHashCode(false);
    setUseFieldNames(false);
    setContentStart("");
    setContentEnd("");
  }
  
  private Object readResolve()
  {
    return ToStringStyle.SIMPLE_STYLE;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle$SimpleToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */