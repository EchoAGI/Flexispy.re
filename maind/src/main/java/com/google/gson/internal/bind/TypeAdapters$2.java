package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.BitSet;

final class TypeAdapters$2
  extends TypeAdapter
{
  public BitSet read(JsonReader paramJsonReader)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    Object localObject2 = paramJsonReader.peek();
    JsonToken localJsonToken1 = JsonToken.NULL;
    BitSet localBitSet;
    if (localObject2 == localJsonToken1)
    {
      paramJsonReader.nextNull();
      localBitSet = null;
    }
    for (;;)
    {
      return localBitSet;
      localBitSet = new java/util/BitSet;
      localBitSet.<init>();
      paramJsonReader.beginArray();
      int i = 0;
      JsonToken localJsonToken2 = paramJsonReader.peek();
      localObject2 = JsonToken.END_ARRAY;
      if (localJsonToken2 != localObject2)
      {
        localObject2 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
        int j = localJsonToken2.ordinal();
        int k = localObject2[j];
        JsonSyntaxException localJsonSyntaxException;
        boolean bool2;
        switch (k)
        {
        default: 
          localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = "Invalid bitset value type: " + localJsonToken2;
          localJsonSyntaxException.<init>((String)localObject1);
          throw localJsonSyntaxException;
        case 1: 
          k = paramJsonReader.nextInt();
          if (k != 0) {
            bool2 = bool1;
          }
          break;
        }
        for (;;)
        {
          if (bool2) {
            localBitSet.set(i);
          }
          i += 1;
          localJsonToken2 = paramJsonReader.peek();
          break;
          bool2 = false;
          continue;
          bool2 = paramJsonReader.nextBoolean();
          continue;
          String str = paramJsonReader.nextString();
          try
          {
            k = Integer.parseInt(str);
            if (k != 0) {}
            for (bool2 = bool1;; bool2 = false) {
              break;
            }
            paramJsonReader.endArray();
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = "Error: Expecting: bitset number value (1, 0), Found: " + str;
            localJsonSyntaxException.<init>((String)localObject1);
            throw localJsonSyntaxException;
          }
        }
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, BitSet paramBitSet)
  {
    if (paramBitSet == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      int i = 0;
      int j = paramBitSet.length();
      if (i < j)
      {
        boolean bool = paramBitSet.get(i);
        if (bool) {}
        for (int k = 1;; k = 0)
        {
          long l = k;
          paramJsonWriter.value(l);
          i += 1;
          break;
        }
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */