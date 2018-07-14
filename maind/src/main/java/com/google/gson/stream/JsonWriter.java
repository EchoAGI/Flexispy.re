package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class JsonWriter
  implements Closeable, Flushable
{
  private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
  private static final String[] REPLACEMENT_CHARS;
  private String deferredName;
  private boolean htmlSafe;
  private String indent;
  private boolean lenient;
  private final Writer out;
  private String separator;
  private boolean serializeNulls;
  private int[] stack;
  private int stackSize;
  
  static
  {
    int i = 128;
    String[] arrayOfString = new String[i];
    REPLACEMENT_CHARS = arrayOfString;
    int j = 0;
    for (;;)
    {
      i = 31;
      if (j > i) {
        break;
      }
      arrayOfString = REPLACEMENT_CHARS;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      Integer localInteger = Integer.valueOf(j);
      arrayOfObject[0] = localInteger;
      String str = String.format("\\u%04x", arrayOfObject);
      arrayOfString[j] = str;
      j += 1;
    }
    REPLACEMENT_CHARS[34] = "\\\"";
    REPLACEMENT_CHARS[92] = "\\\\";
    REPLACEMENT_CHARS[9] = "\\t";
    REPLACEMENT_CHARS[8] = "\\removeFromPath";
    REPLACEMENT_CHARS[10] = "\\n";
    REPLACEMENT_CHARS[13] = "\\r";
    REPLACEMENT_CHARS[12] = "\\f";
    HTML_SAFE_REPLACEMENT_CHARS = (String[])REPLACEMENT_CHARS.clone();
    HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c";
    HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e";
    HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026";
    HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d";
    HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027";
  }
  
  public JsonWriter(Writer paramWriter)
  {
    Object localObject = new int[32];
    this.stack = ((int[])localObject);
    this.stackSize = 0;
    push(6);
    localObject = ":";
    this.separator = ((String)localObject);
    boolean bool = true;
    this.serializeNulls = bool;
    if (paramWriter == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("out == null");
      throw ((Throwable)localObject);
    }
    this.out = paramWriter;
  }
  
  private void beforeName()
  {
    int i = peek();
    int j = 5;
    if (i == j)
    {
      localObject = this.out;
      int k = 44;
      ((Writer)localObject).write(k);
    }
    do
    {
      newline();
      replaceTop(4);
      return;
      j = 3;
    } while (i == j);
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Nesting problem.");
    throw ((Throwable)localObject);
  }
  
  private void beforeValue()
  {
    int i = peek();
    Object localObject;
    int j;
    switch (i)
    {
    case 3: 
    case 5: 
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Nesting problem.");
      throw ((Throwable)localObject);
    case 7: 
      boolean bool = this.lenient;
      if (!bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("JSON must have only one top-level value.");
        throw ((Throwable)localObject);
      }
    case 6: 
      j = 7;
      replaceTop(j);
    }
    for (;;)
    {
      return;
      j = 2;
      replaceTop(j);
      newline();
      continue;
      localObject = this.out;
      char c = ',';
      ((Writer)localObject).append(c);
      newline();
      continue;
      localObject = this.out;
      String str = this.separator;
      ((Writer)localObject).append(str);
      j = 5;
      replaceTop(j);
    }
  }
  
  private JsonWriter close(int paramInt1, int paramInt2, String paramString)
  {
    int i = peek();
    if ((i != paramInt2) && (i != paramInt1))
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Nesting problem.");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.deferredName;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Dangling name: ");
      String str = this.deferredName;
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int j = this.stackSize + -1;
    this.stackSize = j;
    if (i == paramInt2) {
      newline();
    }
    this.out.write(paramString);
    return this;
  }
  
  private void newline()
  {
    Object localObject = this.indent;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.out;
      String str = "\n";
      ((Writer)localObject).write(str);
      int i = 1;
      int j = this.stackSize;
      while (i < j)
      {
        localObject = this.out;
        str = this.indent;
        ((Writer)localObject).write(str);
        i += 1;
      }
    }
  }
  
  private JsonWriter open(int paramInt, String paramString)
  {
    beforeValue();
    push(paramInt);
    this.out.write(paramString);
    return this;
  }
  
  private int peek()
  {
    int i = this.stackSize;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("JsonWriter is closed.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.stack;
    int j = this.stackSize + -1;
    return localObject[j];
  }
  
  private void push(int paramInt)
  {
    int i = 0;
    int j = this.stackSize;
    int[] arrayOfInt1 = this.stack;
    int k = arrayOfInt1.length;
    if (j == k)
    {
      j = this.stackSize * 2;
      int[] arrayOfInt2 = new int[j];
      arrayOfInt3 = this.stack;
      k = this.stackSize;
      System.arraycopy(arrayOfInt3, 0, arrayOfInt2, 0, k);
      this.stack = arrayOfInt2;
    }
    int[] arrayOfInt3 = this.stack;
    k = this.stackSize;
    i = k + 1;
    this.stackSize = i;
    arrayOfInt3[k] = paramInt;
  }
  
  private void replaceTop(int paramInt)
  {
    int[] arrayOfInt = this.stack;
    int i = this.stackSize + -1;
    arrayOfInt[i] = paramInt;
  }
  
  private void string(String paramString)
  {
    boolean bool = this.htmlSafe;
    if (bool) {}
    Writer localWriter;
    int j;
    int k;
    int m;
    int n;
    for (String[] arrayOfString = HTML_SAFE_REPLACEMENT_CHARS;; arrayOfString = REPLACEMENT_CHARS)
    {
      localWriter = this.out;
      String str1 = "\"";
      localWriter.write(str1);
      j = 0;
      k = paramString.length();
      m = 0;
      for (;;)
      {
        if (m >= k) {
          break label177;
        }
        n = paramString.charAt(m);
        i = 128;
        if (n >= i) {
          break;
        }
        str2 = arrayOfString[n];
        if (str2 != null) {
          break label108;
        }
        m += 1;
      }
    }
    int i = 8232;
    if (n == i) {}
    label108:
    int i1;
    for (String str2 = "\\u2028";; str2 = "\\u2029")
    {
      if (j < m)
      {
        localWriter = this.out;
        i1 = m - j;
        localWriter.write(paramString, j, i1);
      }
      localWriter = this.out;
      localWriter.write(str2);
      j = m + 1;
      break;
      i = 8233;
      if (n != i) {
        break;
      }
    }
    label177:
    if (j < k)
    {
      localWriter = this.out;
      i1 = k - j;
      localWriter.write(paramString, j, i1);
    }
    this.out.write("\"");
  }
  
  private void writeDeferredName()
  {
    String str = this.deferredName;
    if (str != null)
    {
      beforeName();
      str = this.deferredName;
      string(str);
      str = null;
      this.deferredName = null;
    }
  }
  
  public JsonWriter beginArray()
  {
    writeDeferredName();
    return open(1, "[");
  }
  
  public JsonWriter beginObject()
  {
    writeDeferredName();
    return open(3, "{");
  }
  
  public void close()
  {
    int i = 1;
    Object localObject = this.out;
    ((Writer)localObject).close();
    int j = this.stackSize;
    if (j <= i)
    {
      if (j == i)
      {
        localObject = this.stack;
        i = j + -1;
        int k = localObject[i];
        i = 7;
        if (k == i) {}
      }
    }
    else
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Incomplete document");
      throw ((Throwable)localObject);
    }
    this.stackSize = 0;
  }
  
  public JsonWriter endArray()
  {
    return close(1, 2, "]");
  }
  
  public JsonWriter endObject()
  {
    return close(3, 5, "}");
  }
  
  public void flush()
  {
    int i = this.stackSize;
    if (i == 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("JsonWriter is closed.");
      throw localIllegalStateException;
    }
    this.out.flush();
  }
  
  public final boolean getSerializeNulls()
  {
    return this.serializeNulls;
  }
  
  public final boolean isHtmlSafe()
  {
    return this.htmlSafe;
  }
  
  public boolean isLenient()
  {
    return this.lenient;
  }
  
  public JsonWriter jsonValue(String paramString)
  {
    if (paramString == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      beforeValue();
      Writer localWriter = this.out;
      localWriter.append(paramString);
    }
  }
  
  public JsonWriter name(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("name == null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.deferredName;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = this.stackSize;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("JsonWriter is closed.");
      throw ((Throwable)localObject);
    }
    this.deferredName = paramString;
    return this;
  }
  
  public JsonWriter nullValue()
  {
    Object localObject = this.deferredName;
    boolean bool;
    if (localObject != null)
    {
      bool = this.serializeNulls;
      if (bool) {
        writeDeferredName();
      }
    }
    else
    {
      beforeValue();
      localObject = this.out;
      String str = "null";
      ((Writer)localObject).write(str);
    }
    for (;;)
    {
      return this;
      bool = false;
      localObject = null;
      this.deferredName = null;
    }
  }
  
  public final void setHtmlSafe(boolean paramBoolean)
  {
    this.htmlSafe = paramBoolean;
  }
  
  public final void setIndent(String paramString)
  {
    int i = paramString.length();
    String str;
    if (i == 0)
    {
      i = 0;
      this.indent = null;
      str = ":";
    }
    for (this.separator = str;; this.separator = str)
    {
      return;
      this.indent = paramString;
      str = ": ";
    }
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public final void setSerializeNulls(boolean paramBoolean)
  {
    this.serializeNulls = paramBoolean;
  }
  
  public JsonWriter value(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Numeric values must be finite, but was " + paramDouble;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    writeDeferredName();
    beforeValue();
    Object localObject1 = this.out;
    Object localObject2 = Double.toString(paramDouble);
    ((Writer)localObject1).append((CharSequence)localObject2);
    return this;
  }
  
  public JsonWriter value(long paramLong)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    String str = Long.toString(paramLong);
    localWriter.write(str);
    return this;
  }
  
  public JsonWriter value(Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      this = nullValue();
      return this;
    }
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (String str = "true";; str = "false")
    {
      localWriter.write(str);
      break;
    }
  }
  
  public JsonWriter value(Number paramNumber)
  {
    if (paramNumber == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      String str = paramNumber.toString();
      boolean bool = this.lenient;
      if (!bool)
      {
        localObject1 = "-Infinity";
        bool = str.equals(localObject1);
        if (!bool)
        {
          localObject1 = "Infinity";
          bool = str.equals(localObject1);
          if (!bool)
          {
            localObject1 = "NaN";
            bool = str.equals(localObject1);
            if (!bool) {
              break label119;
            }
          }
        }
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Numeric values must be finite, but was " + paramNumber;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      label119:
      beforeValue();
      Object localObject1 = this.out;
      ((Writer)localObject1).append(str);
    }
  }
  
  public JsonWriter value(String paramString)
  {
    if (paramString == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      beforeValue();
      string(paramString);
    }
  }
  
  public JsonWriter value(boolean paramBoolean)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    if (paramBoolean) {}
    for (String str = "true";; str = "false")
    {
      localWriter.write(str);
      return this;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/stream/JsonWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */