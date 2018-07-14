package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Currency;

final class TypeAdapters$25
  extends TypeAdapter
{
  public Currency read(JsonReader paramJsonReader)
  {
    return Currency.getInstance(paramJsonReader.nextString());
  }
  
  public void write(JsonWriter paramJsonWriter, Currency paramCurrency)
  {
    String str = paramCurrency.getCurrencyCode();
    paramJsonWriter.value(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$25.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */