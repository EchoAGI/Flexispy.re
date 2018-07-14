package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class JsonTreeReader
  extends JsonReader
{
  private static final Object SENTINEL_CLOSED;
  private static final Reader UNREADABLE_READER;
  private int[] pathIndices;
  private String[] pathNames;
  private Object[] stack;
  private int stackSize;
  
  static
  {
    Object localObject = new com/google/gson/internal/bind/JsonTreeReader$1;
    ((JsonTreeReader.1)localObject).<init>();
    UNREADABLE_READER = (Reader)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    SENTINEL_CLOSED = localObject;
  }
  
  public JsonTreeReader(JsonElement paramJsonElement)
  {
    super((Reader)localObject);
    localObject = new Object[i];
    this.stack = ((Object[])localObject);
    this.stackSize = 0;
    localObject = new String[i];
    this.pathNames = ((String[])localObject);
    localObject = new int[i];
    this.pathIndices = ((int[])localObject);
    push(paramJsonElement);
  }
  
  private void expect(JsonToken paramJsonToken)
  {
    Object localObject1 = peek();
    if (localObject1 != paramJsonToken)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected ").append(paramJsonToken).append(" but was ");
      Object localObject3 = peek();
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = locationString();
      localObject2 = (String)localObject3;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private String locationString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(" at path ");
    String str = getPath();
    return str;
  }
  
  private Object peekStack()
  {
    Object[] arrayOfObject = this.stack;
    int i = this.stackSize + -1;
    return arrayOfObject[i];
  }
  
  private Object popStack()
  {
    Object[] arrayOfObject = this.stack;
    int i = this.stackSize + -1;
    this.stackSize = i;
    Object localObject = arrayOfObject[i];
    arrayOfObject = this.stack;
    i = this.stackSize;
    arrayOfObject[i] = null;
    return localObject;
  }
  
  private void push(Object paramObject)
  {
    int i = 0;
    int j = this.stackSize;
    Object[] arrayOfObject1 = this.stack;
    int k = arrayOfObject1.length;
    if (j == k)
    {
      Object[] arrayOfObject2 = new Object[this.stackSize * 2];
      int[] arrayOfInt = new int[this.stackSize * 2];
      j = this.stackSize * 2;
      String[] arrayOfString = new String[j];
      localObject = this.stack;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfObject2, 0, k);
      localObject = this.pathIndices;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt, 0, k);
      localObject = this.pathNames;
      k = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfString, 0, k);
      this.stack = arrayOfObject2;
      this.pathIndices = arrayOfInt;
      this.pathNames = arrayOfString;
    }
    Object localObject = this.stack;
    k = this.stackSize;
    i = k + 1;
    this.stackSize = i;
    localObject[k] = paramObject;
  }
  
  public void beginArray()
  {
    Object localObject = JsonToken.BEGIN_ARRAY;
    expect((JsonToken)localObject);
    localObject = ((JsonArray)peekStack()).iterator();
    push(localObject);
    localObject = this.pathIndices;
    int i = this.stackSize + -1;
    localObject[i] = 0;
  }
  
  public void beginObject()
  {
    Object localObject = JsonToken.BEGIN_OBJECT;
    expect((JsonToken)localObject);
    localObject = ((JsonObject)peekStack()).entrySet().iterator();
    push(localObject);
  }
  
  public void close()
  {
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    Object localObject = SENTINEL_CLOSED;
    arrayOfObject[0] = localObject;
    this.stack = arrayOfObject;
    this.stackSize = i;
  }
  
  public void endArray()
  {
    Object localObject = JsonToken.END_ARRAY;
    expect((JsonToken)localObject);
    popStack();
    popStack();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject[j] + 1;
      localObject[j] = k;
    }
  }
  
  public void endObject()
  {
    Object localObject = JsonToken.END_OBJECT;
    expect((JsonToken)localObject);
    popStack();
    popStack();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject[j] + 1;
      localObject[j] = k;
    }
  }
  
  public String getPath()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    char c1 = '$';
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(c1);
    int j = 0;
    int k = this.stackSize;
    if (j < k)
    {
      localObject = this.stack[j];
      boolean bool1 = localObject instanceof JsonArray;
      if (bool1)
      {
        localObject = this.stack;
        j += 1;
        localObject = localObject[j];
        bool1 = localObject instanceof Iterator;
        if (bool1)
        {
          char c2 = '[';
          localObject = localStringBuilder.append(c2);
          int[] arrayOfInt = this.pathIndices;
          int i = arrayOfInt[j];
          localObject = ((StringBuilder)localObject).append(i);
          i = 93;
          ((StringBuilder)localObject).append(i);
        }
      }
      for (;;)
      {
        j += 1;
        break;
        localObject = this.stack[j];
        boolean bool2 = localObject instanceof JsonObject;
        if (bool2)
        {
          localObject = this.stack;
          j += 1;
          localObject = localObject[j];
          bool2 = localObject instanceof Iterator;
          if (bool2)
          {
            char c3 = '.';
            localStringBuilder.append(c3);
            localObject = this.pathNames[j];
            if (localObject != null)
            {
              localObject = this.pathNames[j];
              localStringBuilder.append((String)localObject);
            }
          }
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public boolean hasNext()
  {
    JsonToken localJsonToken1 = peek();
    JsonToken localJsonToken2 = JsonToken.END_OBJECT;
    boolean bool;
    if (localJsonToken1 != localJsonToken2)
    {
      localJsonToken2 = JsonToken.END_ARRAY;
      if (localJsonToken1 != localJsonToken2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localJsonToken2 = null;
    }
  }
  
  public boolean nextBoolean()
  {
    Object localObject = JsonToken.BOOLEAN;
    expect((JsonToken)localObject);
    localObject = (JsonPrimitive)popStack();
    boolean bool = ((JsonPrimitive)localObject).getAsBoolean();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject[j] + 1;
      localObject[j] = k;
    }
    return bool;
  }
  
  public double nextDouble()
  {
    JsonToken localJsonToken = peek();
    Object localObject1 = JsonToken.NUMBER;
    Object localObject2;
    if (localJsonToken != localObject1)
    {
      localObject1 = JsonToken.STRING;
      if (localJsonToken != localObject1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected ");
        Object localObject3 = JsonToken.NUMBER;
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" but was ").append(localJsonToken);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = (JsonPrimitive)peekStack();
    double d = ((JsonPrimitive)localObject1).getAsDouble();
    boolean bool = isLenient();
    if (!bool)
    {
      bool = Double.isNaN(d);
      if (!bool)
      {
        bool = Double.isInfinite(d);
        if (!bool) {}
      }
      else
      {
        localObject1 = new java/lang/NumberFormatException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "JSON forbids NaN and infinities: " + d;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    popStack();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject1 = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject1[j] + 1;
      localObject1[j] = k;
    }
    return d;
  }
  
  public int nextInt()
  {
    JsonToken localJsonToken = peek();
    Object localObject1 = JsonToken.NUMBER;
    if (localJsonToken != localObject1)
    {
      localObject1 = JsonToken.STRING;
      if (localJsonToken != localObject1)
      {
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected ");
        Object localObject3 = JsonToken.NUMBER;
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" but was ").append(localJsonToken);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = (JsonPrimitive)peekStack();
    int i = ((JsonPrimitive)localObject1).getAsInt();
    popStack();
    int j = this.stackSize;
    if (j > 0)
    {
      localObject1 = this.pathIndices;
      int k = this.stackSize + -1;
      int m = localObject1[k] + 1;
      localObject1[k] = m;
    }
    return i;
  }
  
  public long nextLong()
  {
    JsonToken localJsonToken = peek();
    Object localObject1 = JsonToken.NUMBER;
    if (localJsonToken != localObject1)
    {
      localObject1 = JsonToken.STRING;
      if (localJsonToken != localObject1)
      {
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected ");
        Object localObject3 = JsonToken.NUMBER;
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" but was ").append(localJsonToken);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = (JsonPrimitive)peekStack();
    long l = ((JsonPrimitive)localObject1).getAsLong();
    popStack();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject1 = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject1[j] + 1;
      localObject1[j] = k;
    }
    return l;
  }
  
  public String nextName()
  {
    Object localObject = JsonToken.NAME;
    expect((JsonToken)localObject);
    Map.Entry localEntry = (Map.Entry)((Iterator)peekStack()).next();
    String str = (String)localEntry.getKey();
    localObject = this.pathNames;
    int i = this.stackSize + -1;
    localObject[i] = str;
    localObject = localEntry.getValue();
    push(localObject);
    return str;
  }
  
  public void nextNull()
  {
    Object localObject = JsonToken.NULL;
    expect((JsonToken)localObject);
    popStack();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject[j] + 1;
      localObject[j] = k;
    }
  }
  
  public String nextString()
  {
    JsonToken localJsonToken = peek();
    Object localObject1 = JsonToken.STRING;
    if (localJsonToken != localObject1)
    {
      localObject1 = JsonToken.NUMBER;
      if (localJsonToken != localObject1)
      {
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected ");
        Object localObject3 = JsonToken.STRING;
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" but was ").append(localJsonToken);
        localObject3 = locationString();
        localObject2 = (String)localObject3;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = (JsonPrimitive)popStack();
    String str = ((JsonPrimitive)localObject1).getAsString();
    int i = this.stackSize;
    if (i > 0)
    {
      localObject1 = this.pathIndices;
      int j = this.stackSize + -1;
      int k = localObject1[j] + 1;
      localObject1[j] = k;
    }
    return str;
  }
  
  public JsonToken peek()
  {
    int i = this.stackSize;
    if (i == 0) {
      localObject1 = JsonToken.END_DOCUMENT;
    }
    Object localObject2;
    for (;;)
    {
      return (JsonToken)localObject1;
      localObject2 = peekStack();
      boolean bool1 = localObject2 instanceof Iterator;
      if (bool1)
      {
        localObject1 = this.stack;
        int j = this.stackSize + -2;
        localObject1 = localObject1[j];
        boolean bool2 = localObject1 instanceof JsonObject;
        Object localObject3 = localObject2;
        localObject3 = (Iterator)localObject2;
        bool1 = ((Iterator)localObject3).hasNext();
        if (bool1)
        {
          if (bool2)
          {
            localObject1 = JsonToken.NAME;
          }
          else
          {
            localObject1 = ((Iterator)localObject3).next();
            push(localObject1);
            localObject1 = peek();
          }
        }
        else if (bool2) {
          localObject1 = JsonToken.END_OBJECT;
        } else {
          localObject1 = JsonToken.END_ARRAY;
        }
      }
      else
      {
        bool1 = localObject2 instanceof JsonObject;
        if (bool1)
        {
          localObject1 = JsonToken.BEGIN_OBJECT;
        }
        else
        {
          bool1 = localObject2 instanceof JsonArray;
          if (bool1)
          {
            localObject1 = JsonToken.BEGIN_ARRAY;
          }
          else
          {
            bool1 = localObject2 instanceof JsonPrimitive;
            if (bool1)
            {
              Object localObject4 = localObject2;
              localObject4 = (JsonPrimitive)localObject2;
              bool1 = ((JsonPrimitive)localObject4).isString();
              if (bool1)
              {
                localObject1 = JsonToken.STRING;
              }
              else
              {
                bool1 = ((JsonPrimitive)localObject4).isBoolean();
                if (bool1)
                {
                  localObject1 = JsonToken.BOOLEAN;
                }
                else
                {
                  bool1 = ((JsonPrimitive)localObject4).isNumber();
                  if (bool1)
                  {
                    localObject1 = JsonToken.NUMBER;
                  }
                  else
                  {
                    localObject1 = new java/lang/AssertionError;
                    ((AssertionError)localObject1).<init>();
                    throw ((Throwable)localObject1);
                  }
                }
              }
            }
            else
            {
              bool1 = localObject2 instanceof JsonNull;
              if (!bool1) {
                break;
              }
              localObject1 = JsonToken.NULL;
            }
          }
        }
      }
    }
    Object localObject1 = SENTINEL_CLOSED;
    if (localObject2 == localObject1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("JsonReader is closed");
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/lang/AssertionError;
    ((AssertionError)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public void promoteNameToValue()
  {
    Object localObject = JsonToken.NAME;
    expect((JsonToken)localObject);
    Map.Entry localEntry = (Map.Entry)((Iterator)peekStack()).next();
    localObject = localEntry.getValue();
    push(localObject);
    JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
    localObject = (String)localEntry.getKey();
    localJsonPrimitive.<init>((String)localObject);
    push(localJsonPrimitive);
  }
  
  public void skipValue()
  {
    Object localObject = peek();
    JsonToken localJsonToken = JsonToken.NAME;
    int i;
    String str;
    if (localObject == localJsonToken)
    {
      nextName();
      localObject = this.pathNames;
      i = this.stackSize + -2;
      str = "null";
      localObject[i] = str;
    }
    for (;;)
    {
      localObject = this.pathIndices;
      i = this.stackSize + -1;
      int j = localObject[i] + 1;
      localObject[i] = j;
      return;
      popStack();
      localObject = this.pathNames;
      i = this.stackSize + -1;
      str = "null";
      localObject[i] = str;
    }
  }
  
  public String toString()
  {
    return getClass().getSimpleName();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/JsonTreeReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */