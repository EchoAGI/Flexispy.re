package org.apache.commons.lang.mutable;

import java.io.Serializable;

public class MutableObject
  implements Mutable, Serializable
{
  private static final long serialVersionUID = 86241875189L;
  private Object value;
  
  public MutableObject() {}
  
  public MutableObject(Object paramObject)
  {
    this.value = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MutableObject;
    if (bool2)
    {
      paramObject = (MutableObject)paramObject;
      Object localObject1 = ((MutableObject)paramObject).value;
      Object localObject2 = this.value;
      if (localObject2 != localObject1)
      {
        localObject2 = this.value;
        if (localObject2 != null)
        {
          localObject2 = this.value;
          bool2 = localObject2.equals(localObject1);
          if (!bool2) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public Object getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    Object localObject = this.value;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.value;
      i = localObject.hashCode();
    }
  }
  
  public void setValue(Object paramObject)
  {
    this.value = paramObject;
  }
  
  public String toString()
  {
    Object localObject = this.value;
    if (localObject == null) {}
    for (localObject = "null";; localObject = this.value.toString()) {
      return (String)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/mutable/MutableObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */