package com.vvt.qq.internal.pb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class PBRepeatField
  extends PBField
{
  private final PBField helper;
  private List value;
  
  public PBRepeatField(PBField paramPBField)
  {
    List localList = Collections.emptyList();
    this.value = localList;
    this.helper = paramPBField;
  }
  
  public void add(Object paramObject)
  {
    get().add(paramObject);
  }
  
  public void addAll(Collection paramCollection)
  {
    get().addAll(paramCollection);
  }
  
  public void clear(Object paramObject)
  {
    List localList = Collections.emptyList();
    this.value = localList;
  }
  
  public int computeSize(int paramInt)
  {
    List localList = this.value;
    return computeSizeDirectly(paramInt, localList);
  }
  
  protected int computeSizeDirectly(int paramInt, List paramList)
  {
    int i = 0;
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      PBField localPBField = this.helper;
      int j = localPBField.computeSizeDirectly(paramInt, localObject);
      i += j;
    }
    return i;
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    paramPBField = (PBRepeatField)paramPBField;
    boolean bool = paramPBField.isEmpty();
    List localList1;
    if (bool)
    {
      localList1 = Collections.emptyList();
      this.value = localList1;
    }
    for (;;)
    {
      return;
      localList1 = get();
      localList1.clear();
      List localList2 = paramPBField.value;
      localList1.addAll(localList2);
    }
  }
  
  public Object get(int paramInt)
  {
    return this.value.get(paramInt);
  }
  
  public List get()
  {
    Object localObject = this.value;
    List localList = Collections.emptyList();
    if (localObject == localList)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.value = ((List)localObject);
    }
    return this.value;
  }
  
  public boolean has()
  {
    boolean bool = isEmpty();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isEmpty()
  {
    return this.value.isEmpty();
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    Object localObject = this.helper.readFromDirectly(paramCodedInputStreamMicro);
    add(localObject);
  }
  
  protected List readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("PBRepeatField not support readFromDirectly method.");
    throw localRuntimeException;
  }
  
  public void remove(int paramInt)
  {
    get().remove(paramInt);
  }
  
  public void set(int paramInt, Object paramObject)
  {
    this.value.set(paramInt, paramObject);
  }
  
  public void set(List paramList)
  {
    this.value = paramList;
  }
  
  public int size()
  {
    return this.value.size();
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    List localList = this.value;
    writeToDirectly(paramCodedOutputStreamMicro, paramInt, localList);
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      PBField localPBField = this.helper;
      localPBField.writeToDirectly(paramCodedOutputStreamMicro, paramInt, localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBRepeatField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */