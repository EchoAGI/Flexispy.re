package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final DateFormat format;
  
  static
  {
    TimeTypeAdapter.1 local1 = new com/google/gson/internal/bind/TimeTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public TimeTypeAdapter()
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("hh:mm:ss a");
    this.format = localSimpleDateFormat;
  }
  
  /* Error */
  public Time read(com.google.gson.stream.JsonReader paramJsonReader)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 36	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   6: astore_2
    //   7: getstatic 42	com/google/gson/stream/JsonToken:NULL	Lcom/google/gson/stream/JsonToken;
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: if_acmpne +13 -> 26
    //   16: aload_1
    //   17: invokevirtual 45	com/google/gson/stream/JsonReader:nextNull	()V
    //   20: aconst_null
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: areturn
    //   26: aload_0
    //   27: getfield 26	com/google/gson/internal/bind/TimeTypeAdapter:format	Ljava/text/DateFormat;
    //   30: astore_2
    //   31: aload_1
    //   32: invokevirtual 49	com/google/gson/stream/JsonReader:nextString	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual 55	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   41: astore 4
    //   43: new 57	java/sql/Time
    //   46: astore_2
    //   47: aload 4
    //   49: invokevirtual 63	java/util/Date:getTime	()J
    //   52: lstore 5
    //   54: aload_2
    //   55: lload 5
    //   57: invokespecial 66	java/sql/Time:<init>	(J)V
    //   60: goto -38 -> 22
    //   63: astore 7
    //   65: new 68	com/google/gson/JsonSyntaxException
    //   68: astore_2
    //   69: aload_2
    //   70: aload 7
    //   72: invokespecial 71	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   75: aload_2
    //   76: athrow
    //   77: astore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	TimeTypeAdapter
    //   0	82	1	paramJsonReader	com.google.gson.stream.JsonReader
    //   6	70	2	localObject1	Object
    //   77	4	2	localObject2	Object
    //   10	28	3	localObject3	Object
    //   41	7	4	localDate	java.util.Date
    //   52	4	5	l	long
    //   63	8	7	localParseException	java.text.ParseException
    // Exception table:
    //   from	to	target	type
    //   26	30	63	java/text/ParseException
    //   31	35	63	java/text/ParseException
    //   37	41	63	java/text/ParseException
    //   43	46	63	java/text/ParseException
    //   47	52	63	java/text/ParseException
    //   55	60	63	java/text/ParseException
    //   2	6	77	finally
    //   7	10	77	finally
    //   16	20	77	finally
    //   26	30	77	finally
    //   31	35	77	finally
    //   37	41	77	finally
    //   43	46	77	finally
    //   47	52	77	finally
    //   55	60	77	finally
    //   65	68	77	finally
    //   70	75	77	finally
    //   75	77	77	finally
  }
  
  public void write(JsonWriter paramJsonWriter, Time paramTime)
  {
    if (paramTime == null) {}
    for (Object localObject1 = null;; localObject1 = ((DateFormat)localObject1).format(paramTime))
    {
      try
      {
        paramJsonWriter.value((String)localObject1);
        return;
      }
      finally {}
      localObject1 = this.format;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TimeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */