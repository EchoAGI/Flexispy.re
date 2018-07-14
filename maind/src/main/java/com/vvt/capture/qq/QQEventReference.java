package com.vvt.capture.qq;

import com.vvt.base.capture.g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class QQEventReference
  implements g, Serializable
{
  private static final long serialVersionUID = 7258104532816267048L;
  private HashMap ref;
  
  public QQEventReference()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.ref = localHashMap;
  }
  
  public HashMap getReference()
  {
    return this.ref;
  }
  
  public boolean isChangeFound(g paramg)
  {
    int i = 1;
    boolean bool1 = paramg instanceof QQEventReference;
    Object localObject1;
    int j;
    Object localObject2;
    if (bool1)
    {
      paramg = (QQEventReference)paramg;
      localObject1 = this.ref.keySet();
      j = ((Set)localObject1).size();
      localObject2 = paramg.ref.keySet();
      int k = ((Set)localObject2).size();
      if (j != k) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      localObject1 = this.ref.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label190;
        }
        localObject1 = (String)localIterator.next();
        localObject2 = paramg.ref.keySet();
        boolean bool3 = ((Set)localObject2).contains(localObject1);
        if (!bool3) {
          break;
        }
        long l1 = ((Long)this.ref.get(localObject1)).longValue();
        localObject2 = paramg.ref;
        localObject1 = (Long)((HashMap)localObject2).get(localObject1);
        long l2 = ((Long)localObject1).longValue();
        bool2 = l1 < l2;
      } while (!bool2);
      boolean bool2 = i;
      continue;
      bool2 = i;
      continue;
      label190:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public boolean isNewEventFound(g paramg)
  {
    int i = 1;
    boolean bool1 = paramg instanceof QQEventReference;
    Object localObject1;
    int j;
    Object localObject2;
    if (bool1)
    {
      paramg = (QQEventReference)paramg;
      localObject1 = paramg.ref.keySet();
      j = ((Set)localObject1).size();
      localObject2 = this.ref.keySet();
      int k = ((Set)localObject2).size();
      if (j > k) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      localObject1 = paramg.ref.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label190;
        }
        localObject1 = (String)localIterator.next();
        localObject2 = this.ref.keySet();
        boolean bool3 = ((Set)localObject2).contains(localObject1);
        if (!bool3) {
          break;
        }
        long l1 = ((Long)this.ref.get(localObject1)).longValue();
        localObject2 = paramg.ref;
        localObject1 = (Long)((HashMap)localObject2).get(localObject1);
        long l2 = ((Long)localObject1).longValue();
        bool2 = l2 < l1;
      } while (!bool2);
      boolean bool2 = i;
      continue;
      bool2 = i;
      continue;
      label190:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public void setReference(HashMap paramHashMap)
  {
    this.ref = paramHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.ref.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = ((StringBuilder)localObject2).append("[");
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
      localObject3 = ":";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject1 = ((Map.Entry)localObject1).getValue();
      localObject1 = ((StringBuilder)localObject2).append(localObject1);
      localObject2 = "] ";
      localObject1 = (String)localObject2;
      localStringBuilder.append((String)localObject1);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/qq/QQEventReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */