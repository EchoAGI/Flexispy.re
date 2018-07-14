package com.android.mockcdma;

import android.util.SparseBooleanArray;

public class b
  extends f
{
  private static final char[] h;
  private static final char[] i;
  private static final SparseBooleanArray j;
  public int a;
  public int b;
  public int c;
  public int d;
  
  static
  {
    Object localObject1 = new char[12];
    localObject1[0] = 48;
    localObject1[1] = 49;
    localObject1[2] = 50;
    localObject1[3] = 51;
    localObject1[4] = 52;
    localObject1[5] = 53;
    localObject1[6] = 54;
    localObject1[7] = 55;
    localObject1[8] = 56;
    localObject1[9] = 57;
    localObject1[10] = 42;
    localObject1[11] = 35;
    h = (char[])localObject1;
    localObject1 = new char[8];
    localObject1[0] = 40;
    localObject1[1] = 41;
    localObject1[2] = 32;
    localObject1[3] = 45;
    localObject1[4] = 43;
    localObject1[5] = 46;
    localObject1[6] = 47;
    localObject1[7] = 92;
    i = (char[])localObject1;
    localObject1 = new android/util/SparseBooleanArray;
    Object localObject2 = h;
    int k = localObject2.length;
    char[] arrayOfChar = i;
    int m = arrayOfChar.length;
    k += m;
    ((SparseBooleanArray)localObject1).<init>(k);
    j = (SparseBooleanArray)localObject1;
    int n = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = h;
      k = localObject2.length;
      if (n >= k) {
        break;
      }
      localObject2 = j;
      arrayOfChar = h;
      m = arrayOfChar[n];
      boolean bool = true;
      ((SparseBooleanArray)localObject2).put(m, bool);
      n += 1;
    }
    n = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = i;
      k = localObject2.length;
      if (n >= k) {
        break;
      }
      localObject2 = j;
      arrayOfChar = i;
      m = arrayOfChar[n];
      ((SparseBooleanArray)localObject2).put(m, false);
      n += 1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("CdmaSmsAddress ");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("{ digitMode=");
    int k = this.a;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", numberMode=");
    k = this.b;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", numberPlan=");
    k = this.d;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", numberOfDigits=");
    k = this.c;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", ton=");
    k = this.e;
    localObject = k;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", address=\"");
    String str = this.f;
    localObject = str + "\"";
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", origBytes=");
    str = d.a(this.g);
    localObject = str;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/mockcdma/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */