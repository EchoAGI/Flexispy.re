package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser
  implements Iterator
{
  private final Object lock;
  private final JsonReader parser;
  
  public JsonStreamParser(Reader paramReader)
  {
    Object localObject = new com/google/gson/stream/JsonReader;
    ((JsonReader)localObject).<init>(paramReader);
    this.parser = ((JsonReader)localObject);
    this.parser.setLenient(true);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.lock = localObject;
  }
  
  public JsonStreamParser(String paramString)
  {
    this(localStringReader);
  }
  
  /* Error */
  public boolean hasNext()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/google/gson/JsonStreamParser:lock	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 21	com/google/gson/JsonStreamParser:parser	Lcom/google/gson/stream/JsonReader;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 38	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   16: astore_2
    //   17: getstatic 44	com/google/gson/stream/JsonToken:END_DOCUMENT	Lcom/google/gson/stream/JsonToken;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpeq +11 -> 34
    //   26: iconst_1
    //   27: istore 4
    //   29: aload_1
    //   30: monitorexit
    //   31: iload 4
    //   33: ireturn
    //   34: iconst_0
    //   35: istore 4
    //   37: aconst_null
    //   38: astore_2
    //   39: goto -10 -> 29
    //   42: astore 5
    //   44: new 46	com/google/gson/JsonSyntaxException
    //   47: astore_2
    //   48: aload_2
    //   49: aload 5
    //   51: invokespecial 49	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   54: aload_2
    //   55: athrow
    //   56: astore_2
    //   57: aload_1
    //   58: monitorexit
    //   59: aload_2
    //   60: athrow
    //   61: astore 5
    //   63: new 51	com/google/gson/JsonIOException
    //   66: astore_2
    //   67: aload_2
    //   68: aload 5
    //   70: invokespecial 52	com/google/gson/JsonIOException:<init>	(Ljava/lang/Throwable;)V
    //   73: aload_2
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	JsonStreamParser
    //   11	44	2	localObject2	Object
    //   56	4	2	localObject3	Object
    //   66	8	2	localJsonIOException	JsonIOException
    //   20	3	3	localJsonToken	com.google.gson.stream.JsonToken
    //   27	9	4	bool	boolean
    //   42	8	5	localMalformedJsonException	com.google.gson.stream.MalformedJsonException
    //   61	8	5	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	11	42	com/google/gson/stream/MalformedJsonException
    //   12	16	42	com/google/gson/stream/MalformedJsonException
    //   17	20	42	com/google/gson/stream/MalformedJsonException
    //   7	11	56	finally
    //   12	16	56	finally
    //   17	20	56	finally
    //   29	31	56	finally
    //   44	47	56	finally
    //   49	54	56	finally
    //   54	56	56	finally
    //   57	59	56	finally
    //   63	66	56	finally
    //   68	73	56	finally
    //   73	75	56	finally
    //   7	11	61	java/io/IOException
    //   12	16	61	java/io/IOException
    //   17	20	61	java/io/IOException
  }
  
  public JsonElement next()
  {
    boolean bool = hasNext();
    Object localObject;
    if (!bool)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.parser;
      return Streams.parse((JsonReader)localObject);
    }
    catch (StackOverflowError localStackOverflowError)
    {
      localObject = new com/google/gson/JsonParseException;
      ((JsonParseException)localObject).<init>("Failed parsing JSON source to Json", localStackOverflowError);
      throw ((Throwable)localObject);
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      localObject = new com/google/gson/JsonParseException;
      ((JsonParseException)localObject).<init>("Failed parsing JSON source to Json", localOutOfMemoryError);
      throw ((Throwable)localObject);
    }
    catch (JsonParseException localJsonParseException)
    {
      localObject = localJsonParseException.getCause();
      bool = localObject instanceof EOFException;
      NoSuchElementException localNoSuchElementException;
      if (bool)
      {
        localNoSuchElementException = new java/util/NoSuchElementException;
        localNoSuchElementException.<init>();
      }
      throw localNoSuchElementException;
    }
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/JsonStreamParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */