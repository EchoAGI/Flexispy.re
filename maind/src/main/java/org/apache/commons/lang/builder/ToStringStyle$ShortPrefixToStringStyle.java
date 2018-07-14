package org.apache.commons.lang.builder;

final class ToStringStyle$ShortPrefixToStringStyle
  extends ToStringStyle
{
  private static final long serialVersionUID = 1L;
  
  ToStringStyle$ShortPrefixToStringStyle()
  {
    setUseShortClassName(true);
    setUseIdentityHashCode(false);
  }
  
  private Object readResolve()
  {
    return ToStringStyle.SHORT_PREFIX_STYLE;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle$ShortPrefixToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */