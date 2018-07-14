package org.apache.commons.lang.builder;

import org.apache.commons.lang.SystemUtils;

final class ToStringStyle$MultiLineToStringStyle
  extends ToStringStyle
{
  private static final long serialVersionUID = 1L;
  
  ToStringStyle$MultiLineToStringStyle()
  {
    setContentStart("[");
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    String str = SystemUtils.LINE_SEPARATOR;
    localObject = str + "  ";
    setFieldSeparator((String)localObject);
    setFieldSeparatorAtStart(true);
    localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    str = SystemUtils.LINE_SEPARATOR;
    localObject = str + "]";
    setContentEnd((String)localObject);
  }
  
  private Object readResolve()
  {
    return ToStringStyle.MULTI_LINE_STYLE;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/builder/ToStringStyle$MultiLineToStringStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */