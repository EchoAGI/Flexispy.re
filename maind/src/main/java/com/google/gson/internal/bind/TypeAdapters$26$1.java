package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26$1
  extends TypeAdapter
{
  TypeAdapters$26$1(TypeAdapters.26 param26, TypeAdapter paramTypeAdapter) {}
  
  public Timestamp read(JsonReader paramJsonReader)
  {
    Object localObject = this.val$dateTypeAdapter;
    Date localDate = (Date)((TypeAdapter)localObject).read(paramJsonReader);
    if (localDate != null)
    {
      localObject = new java/sql/Timestamp;
      long l = localDate.getTime();
      ((Timestamp)localObject).<init>(l);
    }
    for (;;)
    {
      return (Timestamp)localObject;
      localObject = null;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Timestamp paramTimestamp)
  {
    this.val$dateTypeAdapter.write(paramJsonWriter, paramTimestamp);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$26$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */