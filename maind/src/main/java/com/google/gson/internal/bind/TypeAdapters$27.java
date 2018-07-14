package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class TypeAdapters$27
  extends TypeAdapter
{
  private static final String DAY_OF_MONTH = "dayOfMonth";
  private static final String HOUR_OF_DAY = "hourOfDay";
  private static final String MINUTE = "minute";
  private static final String MONTH = "month";
  private static final String SECOND = "second";
  private static final String YEAR = "year";
  
  public Calendar read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    boolean bool;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (Calendar)localObject;
      paramJsonReader.beginObject();
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      for (;;)
      {
        localObject = paramJsonReader.peek();
        localJsonToken = JsonToken.END_OBJECT;
        if (localObject == localJsonToken) {
          break;
        }
        String str = paramJsonReader.nextName();
        int i2 = paramJsonReader.nextInt();
        localObject = "year";
        bool = ((String)localObject).equals(str);
        if (bool)
        {
          i = i2;
        }
        else
        {
          localObject = "month";
          bool = ((String)localObject).equals(str);
          if (bool)
          {
            j = i2;
          }
          else
          {
            localObject = "dayOfMonth";
            bool = ((String)localObject).equals(str);
            if (bool)
            {
              k = i2;
            }
            else
            {
              localObject = "hourOfDay";
              bool = ((String)localObject).equals(str);
              if (bool)
              {
                m = i2;
              }
              else
              {
                localObject = "minute";
                bool = ((String)localObject).equals(str);
                if (bool)
                {
                  n = i2;
                }
                else
                {
                  localObject = "second";
                  bool = ((String)localObject).equals(str);
                  if (bool) {
                    i1 = i2;
                  }
                }
              }
            }
          }
        }
      }
      paramJsonReader.endObject();
      localObject = new java/util/GregorianCalendar;
      ((GregorianCalendar)localObject).<init>(i, j, k, m, n, i1);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Calendar paramCalendar)
  {
    if (paramCalendar == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginObject();
      paramJsonWriter.name("year");
      long l = paramCalendar.get(1);
      paramJsonWriter.value(l);
      paramJsonWriter.name("month");
      l = paramCalendar.get(2);
      paramJsonWriter.value(l);
      paramJsonWriter.name("dayOfMonth");
      l = paramCalendar.get(5);
      paramJsonWriter.value(l);
      paramJsonWriter.name("hourOfDay");
      l = paramCalendar.get(11);
      paramJsonWriter.value(l);
      paramJsonWriter.name("minute");
      l = paramCalendar.get(12);
      paramJsonWriter.value(l);
      String str = "second";
      paramJsonWriter.name(str);
      int i = paramCalendar.get(13);
      l = i;
      paramJsonWriter.value(l);
      paramJsonWriter.endObject();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$27.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */