package com.vvt.qq.internal.pb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class PBRepeatMessageField
  extends PBField
{
  private final Class helper;
  private List value;
  
  public PBRepeatMessageField(Class paramClass)
  {
    List localList = Collections.emptyList();
    this.value = localList;
    this.helper = paramClass;
  }
  
  public void add(MessageMicro paramMessageMicro)
  {
    get().add(paramMessageMicro);
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
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ((MessageMicro)localIterator.next());
    }
    return 0;
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    MessageMicro localMessageMicro = null;
    paramPBField = (PBRepeatMessageField)paramPBField;
    boolean bool = paramPBField.isEmpty();
    if (bool)
    {
      localObject1 = Collections.emptyList();
      this.value = ((List)localObject1);
      return;
    }
    List localList = get();
    Class localClass = paramPBField.get(0).getClass();
    Object localObject1 = paramPBField.value;
    int i = ((List)localObject1).size();
    int j = localList.size();
    int k = i - j;
    if (k > 0) {
      for (j = 0;; j = i)
      {
        if (j >= k) {
          break label180;
        }
        try
        {
          localObject1 = localClass.newInstance();
          localObject1 = (MessageMicro)localObject1;
          localList.add(localObject1);
        }
        catch (InstantiationException localInstantiationException)
        {
          for (;;)
          {
            localInstantiationException.printStackTrace();
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;)
          {
            localIllegalAccessException.printStackTrace();
          }
        }
        i = j + 1;
      }
    }
    Object localObject2;
    if (k < 0)
    {
      i = -k;
      j = localList.size();
      localObject2 = localList.subList(i, j);
      ((List)localObject2).clear();
    }
    label180:
    for (j = 0;; j = i)
    {
      i = localList.size();
      if (j >= i) {
        break;
      }
      localObject2 = (MessageMicro)localList.get(j);
      localMessageMicro = (MessageMicro)paramPBField.value.get(j);
      ((MessageMicro)localObject2).copyFrom(localMessageMicro);
      i = j + 1;
    }
  }
  
  public MessageMicro get(int paramInt)
  {
    return (MessageMicro)this.value.get(paramInt);
  }
  
  public List get()
  {
    Object localObject = this.value;
    if (localObject == null)
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
    try
    {
      Object localObject = this.helper;
      localObject = ((Class)localObject).newInstance();
      localObject = (MessageMicro)localObject;
      paramCodedInputStreamMicro.readMessage((MessageMicro)localObject);
      add((MessageMicro)localObject);
      return;
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        localInstantiationException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
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
  
  public void set(int paramInt, MessageMicro paramMessageMicro)
  {
    this.value.set(paramInt, paramMessageMicro);
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
      ((MessageMicro)localIterator.next());
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/PBRepeatMessageField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */