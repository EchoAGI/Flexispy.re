package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser
{
  /* Error */
  public JsonElement parse(JsonReader paramJsonReader)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 14	com/google/gson/stream/JsonReader:isLenient	()Z
    //   4: istore_2
    //   5: iconst_1
    //   6: istore_3
    //   7: aload_1
    //   8: iload_3
    //   9: invokevirtual 19	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   12: aload_1
    //   13: invokestatic 25	com/google/gson/internal/Streams:parse	(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
    //   16: astore 4
    //   18: aload_1
    //   19: iload_2
    //   20: invokevirtual 19	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   23: aload 4
    //   25: areturn
    //   26: astore 5
    //   28: new 27	com/google/gson/JsonParseException
    //   31: astore 4
    //   33: new 29	java/lang/StringBuilder
    //   36: astore 6
    //   38: aload 6
    //   40: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   43: ldc 32
    //   45: astore 7
    //   47: aload 6
    //   49: aload 7
    //   51: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: astore 6
    //   56: aload 6
    //   58: aload_1
    //   59: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   62: astore 6
    //   64: ldc 41
    //   66: astore 7
    //   68: aload 6
    //   70: aload 7
    //   72: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: astore 6
    //   77: aload 6
    //   79: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore 6
    //   84: aload 4
    //   86: aload 6
    //   88: aload 5
    //   90: invokespecial 48	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: aload 4
    //   95: athrow
    //   96: astore 4
    //   98: aload_1
    //   99: iload_2
    //   100: invokevirtual 19	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   103: aload 4
    //   105: athrow
    //   106: astore 5
    //   108: new 27	com/google/gson/JsonParseException
    //   111: astore 4
    //   113: new 29	java/lang/StringBuilder
    //   116: astore 6
    //   118: aload 6
    //   120: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   123: ldc 32
    //   125: astore 7
    //   127: aload 6
    //   129: aload 7
    //   131: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: astore 6
    //   136: aload 6
    //   138: aload_1
    //   139: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   142: astore 6
    //   144: ldc 41
    //   146: astore 7
    //   148: aload 6
    //   150: aload 7
    //   152: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: astore 6
    //   157: aload 6
    //   159: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: astore 6
    //   164: aload 4
    //   166: aload 6
    //   168: aload 5
    //   170: invokespecial 48	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   173: aload 4
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	JsonParser
    //   0	176	1	paramJsonReader	JsonReader
    //   4	96	2	bool1	boolean
    //   6	3	3	bool2	boolean
    //   16	78	4	localObject1	Object
    //   96	8	4	localObject2	Object
    //   111	63	4	localJsonParseException	JsonParseException
    //   26	63	5	localStackOverflowError	StackOverflowError
    //   106	63	5	localOutOfMemoryError	OutOfMemoryError
    //   36	131	6	localObject3	Object
    //   45	106	7	str	String
    // Exception table:
    //   from	to	target	type
    //   12	16	26	java/lang/StackOverflowError
    //   12	16	96	finally
    //   28	31	96	finally
    //   33	36	96	finally
    //   38	43	96	finally
    //   49	54	96	finally
    //   58	62	96	finally
    //   70	75	96	finally
    //   77	82	96	finally
    //   88	93	96	finally
    //   93	96	96	finally
    //   108	111	96	finally
    //   113	116	96	finally
    //   118	123	96	finally
    //   129	134	96	finally
    //   138	142	96	finally
    //   150	155	96	finally
    //   157	162	96	finally
    //   168	173	96	finally
    //   173	176	96	finally
    //   12	16	106	java/lang/OutOfMemoryError
  }
  
  public JsonElement parse(Reader paramReader)
  {
    JsonElement localJsonElement;
    try
    {
      JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
      localJsonReader.<init>(paramReader);
      localJsonElement = parse(localJsonReader);
      boolean bool = localJsonElement.isJsonNull();
      if (!bool)
      {
        localObject1 = localJsonReader.peek();
        Object localObject2 = JsonToken.END_DOCUMENT;
        if (localObject1 != localObject2)
        {
          localObject1 = new com/google/gson/JsonSyntaxException;
          localObject2 = "Did not consume the entire document.";
          ((JsonSyntaxException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
    }
    catch (MalformedJsonException localMalformedJsonException)
    {
      localObject1 = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject1).<init>(localMalformedJsonException);
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      localObject1 = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject1 = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject1).<init>(localNumberFormatException);
      throw ((Throwable)localObject1);
    }
    return localJsonElement;
  }
  
  public JsonElement parse(String paramString)
  {
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    return parse(localStringReader);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/JsonParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */