package org.apache.commons.lang;

import java.io.Serializable;

public class ObjectUtils$Null
  implements Serializable
{
  private static final long serialVersionUID = 7092611880189329093L;
  
  private Object readResolve()
  {
    return ObjectUtils.NULL;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/ObjectUtils$Null.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */