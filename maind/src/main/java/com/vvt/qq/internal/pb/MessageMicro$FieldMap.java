package com.vvt.qq.internal.pb;

import android.util.Log;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class MessageMicro$FieldMap
{
  private Object[] defaultValues;
  private Field[] fields;
  private int[] tags;
  
  MessageMicro$FieldMap(int[] paramArrayOfInt, String[] paramArrayOfString, Object[] paramArrayOfObject, Class paramClass)
  {
    this.tags = paramArrayOfInt;
    this.defaultValues = paramArrayOfObject;
    Field[] arrayOfField1 = new Field[paramArrayOfInt.length];
    this.fields = arrayOfField1;
    int i = 0;
    arrayOfField1 = null;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        return;
      }
      try
      {
        Field[] arrayOfField2 = this.fields;
        localObject1 = paramArrayOfString[i];
        localObject1 = paramClass.getField((String)localObject1);
        arrayOfField2[i] = localObject1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1 = "MessageMicro";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Missing: ");
          String str = paramArrayOfString[i];
          localObject2 = str;
          Log.e((String)localObject1, (String)localObject2);
          localException.printStackTrace();
        }
      }
      i += 1;
    }
  }
  
  void clear(MessageMicro paramMessageMicro)
  {
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      localObject1 = this.tags;
      i = localObject1.length;
      if (j >= i) {
        break;
      }
      localObject1 = (PBField)this.fields[j].get(paramMessageMicro);
      Object localObject2 = this.defaultValues[j];
      ((PBField)localObject1).clear(localObject2);
      i = j + 1;
    }
  }
  
  void copyFields(MessageMicro paramMessageMicro1, MessageMicro paramMessageMicro2)
  {
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      localObject1 = this.tags;
      i = localObject1.length;
      if (j >= i) {
        break;
      }
      Object localObject2 = this.fields[j];
      localObject1 = (PBField)((Field)localObject2).get(paramMessageMicro1);
      localObject2 = (PBField)((Field)localObject2).get(paramMessageMicro2);
      ((PBField)localObject1).copyFrom((PBField)localObject2);
      i = j + 1;
    }
  }
  
  Field get(int paramInt)
  {
    int[] arrayOfInt = this.tags;
    int i = Arrays.binarySearch(arrayOfInt, paramInt);
    if (i < 0) {
      i = 0;
    }
    Field[] arrayOfField;
    for (arrayOfInt = null;; arrayOfInt = arrayOfField[i])
    {
      return arrayOfInt;
      arrayOfField = this.fields;
    }
  }
  
  int getSerializedSize(MessageMicro paramMessageMicro)
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    int k = 0;
    for (;;)
    {
      localObject = this.tags;
      i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = (PBField)this.fields[j].get(paramMessageMicro);
      int[] arrayOfInt = this.tags;
      int m = WireFormatMicro.getTagFieldNumber(arrayOfInt[j]);
      i = ((PBField)localObject).computeSize(m);
      k += i;
      i = j + 1;
      j = i;
    }
    return k;
  }
  
  public boolean readFieldFrom(CodedInputStreamMicro paramCodedInputStreamMicro, int paramInt, MessageMicro paramMessageMicro)
  {
    Object localObject = this.tags;
    int i = Arrays.binarySearch((int[])localObject, paramInt);
    if (i < 0)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      Field[] arrayOfField = this.fields;
      localObject = (PBField)arrayOfField[i].get(paramMessageMicro);
      ((PBField)localObject).readFrom(paramCodedInputStreamMicro);
      int j = 1;
    }
  }
  
  void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, MessageMicro paramMessageMicro)
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.tags;
      i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = (PBField)this.fields[j].get(paramMessageMicro);
      int[] arrayOfInt = this.tags;
      int k = WireFormatMicro.getTagFieldNumber(arrayOfInt[j]);
      ((PBField)localObject).writeTo(paramCodedOutputStreamMicro, k);
      i = j + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/MessageMicro$FieldMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */