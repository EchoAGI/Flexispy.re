package org.apache.commons.lang.mutable;

import java.io.Serializable;
import org.apache.commons.lang.BooleanUtils;

public class MutableBoolean
  implements Mutable, Serializable, Comparable
{
  private static final long serialVersionUID = -4830728138360036487L;
  private boolean value;
  
  public MutableBoolean() {}
  
  public MutableBoolean(Boolean paramBoolean)
  {
    boolean bool = paramBoolean.booleanValue();
    this.value = bool;
  }
  
  public MutableBoolean(boolean paramBoolean)
  {
    this.value = paramBoolean;
  }
  
  public boolean booleanValue()
  {
    return this.value;
  }
  
  public int compareTo(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (MutableBoolean)paramObject;
    boolean bool1 = ((MutableBoolean)localObject).value;
    int i = this.value;
    if (i == bool1) {
      i = 0;
    }
    for (;;)
    {
      return i;
      boolean bool2 = this.value;
      if (bool2) {
        bool2 = true;
      } else {
        int j = -1;
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableBoolean;
    if (bool2)
    {
      bool2 = this.value;
      paramObject = (MutableBoolean)paramObject;
      boolean bool3 = ((MutableBoolean)paramObject).booleanValue();
      if (bool2 == bool3) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public Object getValue()
  {
    return BooleanUtils.toBooleanObject(this.value);
  }
  
  public int hashCode()
  {
    boolean bool = this.value;
    Boolean localBoolean;
    if (bool) {
      localBoolean = Boolean.TRUE;
    }
    for (int i = localBoolean.hashCode();; i = localBoolean.hashCode())
    {
      return i;
      localBoolean = Boolean.FALSE;
    }
  }
  
  public boolean isFalse()
  {
    boolean bool = this.value;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isTrue()
  {
    boolean bool1 = true;
    boolean bool2 = this.value;
    if (bool2 == bool1) {}
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public void setValue(Object paramObject)
  {
    boolean bool = ((Boolean)paramObject).booleanValue();
    setValue(bool);
  }
  
  public void setValue(boolean paramBoolean)
  {
    this.value = paramBoolean;
  }
  
  public Boolean toBoolean()
  {
    return BooleanUtils.toBooleanObject(this.value);
  }
  
  public String toString()
  {
    return String.valueOf(this.value);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableBoolean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */