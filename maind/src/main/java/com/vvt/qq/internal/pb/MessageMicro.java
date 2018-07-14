package com.vvt.qq.internal.pb;

import java.io.IOException;
import java.lang.reflect.Field;

public abstract class MessageMicro
  extends PBPrimitiveField
{
  private MessageMicro.FieldMap _fields = null;
  private int cachedSize = -1;
  
  private final MessageMicro.FieldMap getFieldMap()
  {
    Object localObject = this._fields;
    if (localObject == null) {}
    try
    {
      localObject = getClass();
      String str = "__fieldMap__";
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool = true;
      ((Field)localObject).setAccessible(bool);
      localObject = ((Field)localObject).get(this);
      localObject = (MessageMicro.FieldMap)localObject;
      this._fields = ((MessageMicro.FieldMap)localObject);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        localNoSuchFieldException.printStackTrace();
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        localSecurityException.printStackTrace();
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
    return this._fields;
  }
  
  protected static MessageMicro.FieldMap initFieldMap(int[] paramArrayOfInt, String[] paramArrayOfString, Object[] paramArrayOfObject, Class paramClass)
  {
    MessageMicro.FieldMap localFieldMap = new com/vvt/qq/internal/pb/MessageMicro$FieldMap;
    localFieldMap.<init>(paramArrayOfInt, paramArrayOfString, paramArrayOfObject, paramClass);
    return localFieldMap;
  }
  
  public static void main(String[] paramArrayOfString) {}
  
  public void clear(Object paramObject)
  {
    try
    {
      MessageMicro.FieldMap localFieldMap = getFieldMap();
      localFieldMap.clear(this);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
    setHasFlag(false);
  }
  
  public int computeSize(int paramInt)
  {
    boolean bool = has();
    if (bool) {}
    for (int i = CodedOutputStreamMicro.computeMessageSize(paramInt, this);; i = 0) {
      return i;
    }
  }
  
  protected int computeSizeDirectly(int paramInt, MessageMicro paramMessageMicro)
  {
    return CodedOutputStreamMicro.computeMessageSize(paramInt, paramMessageMicro);
  }
  
  protected void copyFrom(PBField paramPBField)
  {
    try
    {
      MessageMicro.FieldMap localFieldMap = getFieldMap();
      Object localObject1 = paramPBField;
      localObject1 = (MessageMicro)paramPBField;
      Object localObject2 = localObject1;
      localFieldMap.copyFields(this, (MessageMicro)localObject1);
      paramPBField = (MessageMicro)paramPBField;
      boolean bool = paramPBField.has();
      setHasFlag(bool);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
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
  
  public MessageMicro get()
  {
    return this;
  }
  
  public final int getCachedSize()
  {
    return getSerializedSize();
  }
  
  public final int getSerializedSize()
  {
    int i = -1;
    try
    {
      MessageMicro.FieldMap localFieldMap = getFieldMap();
      i = localFieldMap.getSerializedSize(this);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
    this.cachedSize = i;
    return i;
  }
  
  public final MessageMicro mergeFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    MessageMicro.FieldMap localFieldMap = getFieldMap();
    boolean bool1 = true;
    setHasFlag(bool1);
    for (;;)
    {
      int i = paramCodedInputStreamMicro.readTag();
      try
      {
        boolean bool3 = localFieldMap.readFieldFrom(paramCodedInputStreamMicro, i, this);
        if (!bool3)
        {
          if (i == 0) {}
          for (;;)
          {
            return this;
            boolean bool2 = parseUnknownField(paramCodedInputStreamMicro, i);
            if (bool2) {
              break;
            }
          }
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localIllegalArgumentException.printStackTrace();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localIllegalAccessException.printStackTrace();
      }
      catch (InstantiationException localInstantiationException)
      {
        localInstantiationException.printStackTrace();
      }
    }
  }
  
  public final MessageMicro mergeFrom(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return mergeFrom(paramArrayOfByte, 0, i);
  }
  
  public final MessageMicro mergeFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      CodedInputStreamMicro localCodedInputStreamMicro = CodedInputStreamMicro.newInstance(paramArrayOfByte, paramInt1, paramInt2);
      mergeFrom(localCodedInputStreamMicro);
      localCodedInputStreamMicro.checkLastTagWas(0);
      return this;
    }
    catch (InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException)
    {
      throw localInvalidProtocolBufferMicroException;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Reading from a byte array threw an IOException (should never happen).");
      throw localRuntimeException;
    }
  }
  
  protected boolean parseUnknownField(CodedInputStreamMicro paramCodedInputStreamMicro, int paramInt)
  {
    return paramCodedInputStreamMicro.skipField(paramInt);
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    paramCodedInputStreamMicro.readMessage(this);
  }
  
  protected MessageMicro readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not decompiled: com.tencent.mobileqq.pb.MessageMicro.readFromDirectly(com.tencent.mobileqq.pb.CodedInputStreamMicro):T");
    throw localUnsupportedOperationException;
  }
  
  public void set(MessageMicro paramMessageMicro)
  {
    set(paramMessageMicro, true);
  }
  
  public void set(MessageMicro paramMessageMicro, boolean paramBoolean)
  {
    copyFrom(paramMessageMicro);
    setHasFlag(paramBoolean);
    this.cachedSize = -1;
  }
  
  public final void toByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      CodedOutputStreamMicro localCodedOutputStreamMicro = CodedOutputStreamMicro.newInstance(paramArrayOfByte, paramInt1, paramInt2);
      writeTo(localCodedOutputStreamMicro);
      localCodedOutputStreamMicro.checkNoSpaceLeft();
      return;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Serializing to a byte array threw an IOException (should never happen).");
      throw localRuntimeException;
    }
  }
  
  public final byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[getSerializedSize()];
    int i = arrayOfByte.length;
    toByteArray(arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public final void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro)
  {
    try
    {
      MessageMicro.FieldMap localFieldMap = getFieldMap();
      localFieldMap.writeTo(paramCodedOutputStreamMicro, this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
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
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
  {
    boolean bool = has();
    if (bool) {
      paramCodedOutputStreamMicro.writeMessage(paramInt, this);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, MessageMicro paramMessageMicro)
  {
    paramCodedOutputStreamMicro.writeMessage(paramInt, paramMessageMicro);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/MessageMicro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */