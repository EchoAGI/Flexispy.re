package com.android.mockcdma;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class g
{
  public j a;
  public h b;
  public ArrayList c;
  
  public g()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.c = localArrayList;
  }
  
  public static g a(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    g localg = new com/android/mockcdma/g;
    localg.<init>();
    for (;;)
    {
      int i = localByteArrayInputStream.available();
      if (i <= 0) {
        break;
      }
      i = localByteArrayInputStream.read();
      int j = localByteArrayInputStream.read();
      Object localObject;
      int k;
      switch (i)
      {
      default: 
        i locali = new com/android/mockcdma/i;
        locali.<init>();
        locali.a = i;
        localObject = new byte[j];
        locali.b = ((byte[])localObject);
        localObject = locali.b;
        localByteArrayInputStream.read((byte[])localObject, 0, j);
        localObject = localg.c;
        ((ArrayList)localObject).add(locali);
        break;
      case 0: 
        localObject = new com/android/mockcdma/h;
        ((h)localObject).<init>();
        j = localByteArrayInputStream.read();
        ((h)localObject).a = j;
        j = localByteArrayInputStream.read();
        ((h)localObject).c = j;
        j = localByteArrayInputStream.read();
        ((h)localObject).b = j;
        ((h)localObject).d = bool;
        j = ((h)localObject).c;
        if (j != 0)
        {
          j = ((h)localObject).b;
          if (j != 0)
          {
            j = ((h)localObject).b;
            k = ((h)localObject).c;
            if (j <= k) {
              localg.b = ((h)localObject);
            }
          }
        }
        break;
      case 8: 
        localObject = new com/android/mockcdma/h;
        ((h)localObject).<init>();
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((h)localObject).a = j;
        j = localByteArrayInputStream.read();
        ((h)localObject).c = j;
        j = localByteArrayInputStream.read();
        ((h)localObject).b = j;
        ((h)localObject).d = false;
        j = ((h)localObject).c;
        if (j != 0)
        {
          j = ((h)localObject).b;
          if (j != 0)
          {
            j = ((h)localObject).b;
            k = ((h)localObject).c;
            if (j <= k) {
              localg.b = ((h)localObject);
            }
          }
        }
        break;
      case 4: 
        localObject = new com/android/mockcdma/j;
        ((j)localObject).<init>();
        j = localByteArrayInputStream.read();
        ((j)localObject).a = j;
        j = localByteArrayInputStream.read();
        ((j)localObject).b = j;
        ((j)localObject).c = bool;
        localg.a = ((j)localObject);
        break;
      case 5: 
        localObject = new com/android/mockcdma/j;
        ((j)localObject).<init>();
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((j)localObject).a = j;
        j = localByteArrayInputStream.read() << 8;
        k = localByteArrayInputStream.read();
        j |= k;
        ((j)localObject).b = j;
        ((j)localObject).c = false;
        localg.a = ((j)localObject);
      }
    }
    return localg;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("UserDataHeader ");
    localStringBuilder.append("{ ConcatRef ");
    Object localObject1 = this.b;
    if (localObject1 == null)
    {
      localObject1 = "unset";
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(", PortAddrs ");
      localObject1 = this.a;
      if (localObject1 != null) {
        break label427;
      }
      localObject1 = "unset";
      localStringBuilder.append((String)localObject1);
    }
    for (;;)
    {
      localObject1 = this.c;
      Object localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (i)((Iterator)localObject2).next();
        localStringBuilder.append(", MiscElt ");
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("{ id=");
        int i = ((i)localObject1).a;
        localObject3 = i;
        localStringBuilder.append((String)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append(", length=");
        i = ((i)localObject1).b.length;
        localObject3 = i;
        localStringBuilder.append((String)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = ", data=";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = d.a(((i)localObject1).b);
        localObject1 = (String)localObject1;
        localStringBuilder.append((String)localObject1);
        localObject1 = " }";
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("{ refNumber=");
      int j = this.b.a;
      localObject1 = j;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", msgCount=");
      j = this.b.c;
      localObject1 = j;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", seqNumber=");
      j = this.b.b;
      localObject1 = j;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", isEightBits=");
      localObject2 = this.b;
      boolean bool2 = ((h)localObject2).d;
      localObject1 = bool2;
      localStringBuilder.append((String)localObject1);
      localObject1 = " }";
      localStringBuilder.append((String)localObject1);
      break;
      label427:
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("{ destPort=");
      int k = this.a.a;
      localObject1 = k;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", origPort=");
      k = this.a.b;
      localObject1 = k;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", areEightBits=");
      localObject2 = this.a;
      boolean bool3 = ((j)localObject2).c;
      localObject1 = bool3;
      localStringBuilder.append((String)localObject1);
      localObject1 = " }";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */