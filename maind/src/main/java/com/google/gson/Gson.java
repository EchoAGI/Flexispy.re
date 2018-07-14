package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson
{
  static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
  static final boolean DEFAULT_ESCAPE_HTML = true;
  static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
  static final boolean DEFAULT_LENIENT = false;
  static final boolean DEFAULT_PRETTY_PRINT = false;
  static final boolean DEFAULT_SERIALIZE_NULLS = false;
  static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
  private static final TypeToken NULL_KEY_SURROGATE;
  private final ThreadLocal calls;
  private final ConstructorConstructor constructorConstructor;
  private final Excluder excluder;
  private final List factories;
  private final FieldNamingStrategy fieldNamingStrategy;
  private final boolean generateNonExecutableJson;
  private final boolean htmlSafe;
  private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
  private final boolean lenient;
  private final boolean prettyPrinting;
  private final boolean serializeNulls;
  private final Map typeTokenCache;
  
  static
  {
    Gson.1 local1 = new com/google/gson/Gson$1;
    local1.<init>();
    NULL_KEY_SURROGATE = local1;
  }
  
  public Gson()
  {
    this(localExcluder, localFieldNamingPolicy, localMap, false, false, false, true, false, false, false, localLongSerializationPolicy, localList);
  }
  
  Gson(Excluder paramExcluder, FieldNamingStrategy paramFieldNamingStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LongSerializationPolicy paramLongSerializationPolicy, List paramList)
  {
    Object localObject1 = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject1).<init>();
    this.calls = ((ThreadLocal)localObject1);
    localObject1 = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject1).<init>();
    this.typeTokenCache = ((Map)localObject1);
    localObject1 = new com/google/gson/internal/ConstructorConstructor;
    ((ConstructorConstructor)localObject1).<init>(paramMap);
    this.constructorConstructor = ((ConstructorConstructor)localObject1);
    this.excluder = paramExcluder;
    this.fieldNamingStrategy = paramFieldNamingStrategy;
    this.serializeNulls = paramBoolean1;
    this.generateNonExecutableJson = paramBoolean3;
    this.htmlSafe = paramBoolean4;
    this.prettyPrinting = paramBoolean5;
    this.lenient = paramBoolean6;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = TypeAdapters.JSON_ELEMENT_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = ObjectTypeAdapter.FACTORY;
    localArrayList.add(localObject1);
    localArrayList.add(paramExcluder);
    localArrayList.addAll(paramList);
    localObject1 = TypeAdapters.STRING_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.INTEGER_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.BOOLEAN_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.BYTE_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.SHORT_FACTORY;
    localArrayList.add(localObject1);
    TypeAdapter localTypeAdapter = longAdapter(paramLongSerializationPolicy);
    localObject1 = TypeAdapters.newFactory(Long.TYPE, Long.class, localTypeAdapter);
    localArrayList.add(localObject1);
    localObject1 = Double.TYPE;
    Object localObject2 = doubleAdapter(paramBoolean7);
    localObject1 = TypeAdapters.newFactory((Class)localObject1, Double.class, (TypeAdapter)localObject2);
    localArrayList.add(localObject1);
    localObject1 = Float.TYPE;
    localObject2 = floatAdapter(paramBoolean7);
    localObject1 = TypeAdapters.newFactory((Class)localObject1, Float.class, (TypeAdapter)localObject2);
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.NUMBER_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.ATOMIC_INTEGER_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
    localArrayList.add(localObject1);
    Object localObject3 = atomicLongAdapter(localTypeAdapter);
    localObject1 = TypeAdapters.newFactory(AtomicLong.class, (TypeAdapter)localObject3);
    localArrayList.add(localObject1);
    localObject3 = atomicLongArrayAdapter(localTypeAdapter);
    localObject1 = TypeAdapters.newFactory(AtomicLongArray.class, (TypeAdapter)localObject3);
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.CHARACTER_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.STRING_BUILDER_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.STRING_BUFFER_FACTORY;
    localArrayList.add(localObject1);
    localObject3 = TypeAdapters.BIG_DECIMAL;
    localObject1 = TypeAdapters.newFactory(BigDecimal.class, (TypeAdapter)localObject3);
    localArrayList.add(localObject1);
    localObject3 = TypeAdapters.BIG_INTEGER;
    localObject1 = TypeAdapters.newFactory(BigInteger.class, (TypeAdapter)localObject3);
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.URL_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.URI_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.UUID_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.CURRENCY_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.LOCALE_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.INET_ADDRESS_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.BIT_SET_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = DateTypeAdapter.FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.CALENDAR_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TimeTypeAdapter.FACTORY;
    localArrayList.add(localObject1);
    localObject1 = SqlDateTypeAdapter.FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.TIMESTAMP_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = ArrayTypeAdapter.FACTORY;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.CLASS_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = new com/google/gson/internal/bind/CollectionTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((CollectionTypeAdapterFactory)localObject1).<init>((ConstructorConstructor)localObject3);
    localArrayList.add(localObject1);
    localObject1 = new com/google/gson/internal/bind/MapTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((MapTypeAdapterFactory)localObject1).<init>((ConstructorConstructor)localObject3, paramBoolean2);
    localArrayList.add(localObject1);
    localObject1 = new com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((JsonAdapterAnnotationTypeAdapterFactory)localObject1).<init>((ConstructorConstructor)localObject3);
    this.jsonAdapterFactory = ((JsonAdapterAnnotationTypeAdapterFactory)localObject1);
    localObject1 = this.jsonAdapterFactory;
    localArrayList.add(localObject1);
    localObject1 = TypeAdapters.ENUM_FACTORY;
    localArrayList.add(localObject1);
    localObject1 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    localObject2 = this.jsonAdapterFactory;
    ((ReflectiveTypeAdapterFactory)localObject1).<init>((ConstructorConstructor)localObject3, paramFieldNamingStrategy, paramExcluder, (JsonAdapterAnnotationTypeAdapterFactory)localObject2);
    localArrayList.add(localObject1);
    localObject1 = Collections.unmodifiableList(localArrayList);
    this.factories = ((List)localObject1);
  }
  
  private static void assertFullConsumption(Object paramObject, JsonReader paramJsonReader)
  {
    if (paramObject != null) {
      try
      {
        localObject1 = paramJsonReader.peek();
        Object localObject2 = JsonToken.END_DOCUMENT;
        if (localObject1 != localObject2)
        {
          localObject1 = new com/google/gson/JsonIOException;
          localObject2 = "JSON document was not fully consumed.";
          ((JsonIOException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
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
        Object localObject1 = new com/google/gson/JsonIOException;
        ((JsonIOException)localObject1).<init>(localIOException);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  private static TypeAdapter atomicLongAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.5 local5 = new com/google/gson/Gson$5;
    local5.<init>(paramTypeAdapter);
    return local5.nullSafe();
  }
  
  private static TypeAdapter atomicLongArrayAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.6 local6 = new com/google/gson/Gson$6;
    local6.<init>(paramTypeAdapter);
    return local6.nullSafe();
  }
  
  static void checkValidFloatingPoint(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private TypeAdapter doubleAdapter(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = TypeAdapters.DOUBLE;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$2;
      ((Gson.2)localObject).<init>(this);
    }
  }
  
  private TypeAdapter floatAdapter(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = TypeAdapters.FLOAT;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$3;
      ((Gson.3)localObject).<init>(this);
    }
  }
  
  private static TypeAdapter longAdapter(LongSerializationPolicy paramLongSerializationPolicy)
  {
    Object localObject = LongSerializationPolicy.DEFAULT;
    if (paramLongSerializationPolicy == localObject) {
      localObject = TypeAdapters.LONG;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$4;
      ((Gson.4)localObject).<init>();
    }
  }
  
  public Excluder excluder()
  {
    return this.excluder;
  }
  
  public FieldNamingStrategy fieldNamingStrategy()
  {
    return this.fieldNamingStrategy;
  }
  
  public Object fromJson(JsonElement paramJsonElement, Class paramClass)
  {
    Object localObject = fromJson(paramJsonElement, paramClass);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(JsonElement paramJsonElement, Type paramType)
  {
    if (paramJsonElement == null) {}
    for (Object localObject = null;; localObject = fromJson((JsonReader)localObject, paramType))
    {
      return localObject;
      localObject = new com/google/gson/internal/bind/JsonTreeReader;
      ((JsonTreeReader)localObject).<init>(paramJsonElement);
    }
  }
  
  /* Error */
  public Object fromJson(JsonReader paramJsonReader, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 411	com/google/gson/stream/JsonReader:isLenient	()Z
    //   6: istore 4
    //   8: iconst_1
    //   9: istore 5
    //   11: aload_1
    //   12: iload 5
    //   14: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   17: aload_1
    //   18: invokevirtual 299	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   21: pop
    //   22: iconst_0
    //   23: istore_3
    //   24: aload_2
    //   25: invokestatic 421	com/google/gson/reflect/TypeToken:get	(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
    //   28: astore 6
    //   30: aload_0
    //   31: aload 6
    //   33: invokevirtual 425	com/google/gson/Gson:getAdapter	(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    //   36: astore 7
    //   38: aload 7
    //   40: aload_1
    //   41: invokevirtual 431	com/google/gson/TypeAdapter:read	(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    //   44: astore 8
    //   46: aload_1
    //   47: iload 4
    //   49: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   52: aload 8
    //   54: areturn
    //   55: astore 9
    //   57: iload_3
    //   58: ifeq +15 -> 73
    //   61: aconst_null
    //   62: astore 8
    //   64: aload_1
    //   65: iload 4
    //   67: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   70: goto -18 -> 52
    //   73: new 314	com/google/gson/JsonSyntaxException
    //   76: astore 10
    //   78: aload 10
    //   80: aload 9
    //   82: invokespecial 317	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   85: aload 10
    //   87: athrow
    //   88: astore 10
    //   90: aload_1
    //   91: iload 4
    //   93: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   96: aload 10
    //   98: athrow
    //   99: astore 9
    //   101: new 314	com/google/gson/JsonSyntaxException
    //   104: astore 10
    //   106: aload 10
    //   108: aload 9
    //   110: invokespecial 317	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   113: aload 10
    //   115: athrow
    //   116: astore 9
    //   118: new 314	com/google/gson/JsonSyntaxException
    //   121: astore 10
    //   123: aload 10
    //   125: aload 9
    //   127: invokespecial 317	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   130: aload 10
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	Gson
    //   0	133	1	paramJsonReader	JsonReader
    //   0	133	2	paramType	Type
    //   1	57	3	i	int
    //   6	86	4	bool1	boolean
    //   9	4	5	bool2	boolean
    //   28	4	6	localTypeToken	TypeToken
    //   36	3	7	localTypeAdapter	TypeAdapter
    //   44	19	8	localObject1	Object
    //   55	26	9	localEOFException	java.io.EOFException
    //   99	10	9	localIllegalStateException	IllegalStateException
    //   116	10	9	localIOException	IOException
    //   76	10	10	localJsonSyntaxException1	JsonSyntaxException
    //   88	9	10	localObject2	Object
    //   104	27	10	localJsonSyntaxException2	JsonSyntaxException
    // Exception table:
    //   from	to	target	type
    //   17	22	55	java/io/EOFException
    //   24	28	55	java/io/EOFException
    //   31	36	55	java/io/EOFException
    //   40	44	55	java/io/EOFException
    //   17	22	88	finally
    //   24	28	88	finally
    //   31	36	88	finally
    //   40	44	88	finally
    //   73	76	88	finally
    //   80	85	88	finally
    //   85	88	88	finally
    //   101	104	88	finally
    //   108	113	88	finally
    //   113	116	88	finally
    //   118	121	88	finally
    //   125	130	88	finally
    //   130	133	88	finally
    //   17	22	99	java/lang/IllegalStateException
    //   24	28	99	java/lang/IllegalStateException
    //   31	36	99	java/lang/IllegalStateException
    //   40	44	99	java/lang/IllegalStateException
    //   17	22	116	java/io/IOException
    //   24	28	116	java/io/IOException
    //   31	36	116	java/io/IOException
    //   40	44	116	java/io/IOException
  }
  
  public Object fromJson(Reader paramReader, Class paramClass)
  {
    JsonReader localJsonReader = newJsonReader(paramReader);
    Object localObject = fromJson(localJsonReader, paramClass);
    assertFullConsumption(localObject, localJsonReader);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(Reader paramReader, Type paramType)
  {
    JsonReader localJsonReader = newJsonReader(paramReader);
    Object localObject = fromJson(localJsonReader, paramType);
    assertFullConsumption(localObject, localJsonReader);
    return localObject;
  }
  
  public Object fromJson(String paramString, Class paramClass)
  {
    Object localObject = fromJson(paramString, paramClass);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(String paramString, Type paramType)
  {
    if (paramString == null) {}
    StringReader localStringReader;
    for (Object localObject = null;; localObject = fromJson(localStringReader, paramType))
    {
      return localObject;
      localStringReader = new java/io/StringReader;
      localStringReader.<init>(paramString);
    }
  }
  
  public TypeAdapter getAdapter(TypeToken paramTypeToken)
  {
    Object localObject1 = this.typeTokenCache;
    Object localObject2;
    Object localObject4;
    if (paramTypeToken == null)
    {
      localObject2 = NULL_KEY_SURROGATE;
      localObject4 = (TypeAdapter)((Map)localObject1).get(localObject2);
      if (localObject4 == null) {
        break label38;
      }
    }
    for (;;)
    {
      return (TypeAdapter)localObject4;
      localObject2 = paramTypeToken;
      break;
      label38:
      localObject2 = this.calls;
      Object localObject5 = (Map)((ThreadLocal)localObject2).get();
      int i = 0;
      if (localObject5 == null)
      {
        localObject5 = new java/util/HashMap;
        ((HashMap)localObject5).<init>();
        localObject2 = this.calls;
        ((ThreadLocal)localObject2).set(localObject5);
        i = 1;
      }
      Gson.FutureTypeAdapter localFutureTypeAdapter1 = (Gson.FutureTypeAdapter)((Map)localObject5).get(paramTypeToken);
      if (localFutureTypeAdapter1 != null)
      {
        localObject4 = localFutureTypeAdapter1;
        continue;
      }
      try
      {
        Gson.FutureTypeAdapter localFutureTypeAdapter2 = new com/google/gson/Gson$FutureTypeAdapter;
        localFutureTypeAdapter2.<init>();
        ((Map)localObject5).put(paramTypeToken, localFutureTypeAdapter2);
        localObject2 = this.factories;
        localObject2 = ((List)localObject2).iterator();
        TypeAdapter localTypeAdapter;
        do
        {
          boolean bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          Object localObject6 = ((Iterator)localObject2).next();
          localObject6 = (TypeAdapterFactory)localObject6;
          localTypeAdapter = ((TypeAdapterFactory)localObject6).create(this, paramTypeToken);
        } while (localTypeAdapter == null);
        localFutureTypeAdapter2.setDelegate(localTypeAdapter);
        localObject2 = this.typeTokenCache;
        ((Map)localObject2).put(paramTypeToken, localTypeAdapter);
        ((Map)localObject5).remove(paramTypeToken);
        if (i != 0)
        {
          localObject2 = this.calls;
          ((ThreadLocal)localObject2).remove();
        }
        localObject4 = localTypeAdapter;
        continue;
        localObject2 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "GSON cannot handle ";
        localObject1 = ((StringBuilder)localObject1).append(str);
        localObject1 = ((StringBuilder)localObject1).append(paramTypeToken);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      finally
      {
        ((Map)localObject5).remove(paramTypeToken);
        if (i != 0)
        {
          localObject1 = this.calls;
          ((ThreadLocal)localObject1).remove();
        }
      }
    }
  }
  
  public TypeAdapter getAdapter(Class paramClass)
  {
    TypeToken localTypeToken = TypeToken.get(paramClass);
    return getAdapter(localTypeToken);
  }
  
  public TypeAdapter getDelegateAdapter(TypeAdapterFactory paramTypeAdapterFactory, TypeToken paramTypeToken)
  {
    Object localObject1 = this.factories;
    boolean bool1 = ((List)localObject1).contains(paramTypeAdapterFactory);
    if (!bool1) {
      paramTypeAdapterFactory = this.jsonAdapterFactory;
    }
    int i = 0;
    localObject1 = this.factories.iterator();
    TypeAdapter localTypeAdapter;
    do
    {
      TypeAdapterFactory localTypeAdapterFactory;
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break label97;
        }
        localTypeAdapterFactory = (TypeAdapterFactory)((Iterator)localObject1).next();
        if (i != 0) {
          break;
        }
        if (localTypeAdapterFactory == paramTypeAdapterFactory) {
          i = 1;
        }
      }
      localTypeAdapter = localTypeAdapterFactory.create(this, paramTypeToken);
    } while (localTypeAdapter == null);
    return localTypeAdapter;
    label97:
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "GSON cannot serialize " + paramTypeToken;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public boolean htmlSafe()
  {
    return this.htmlSafe;
  }
  
  public JsonReader newJsonReader(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    boolean bool = this.lenient;
    localJsonReader.setLenient(bool);
    return localJsonReader;
  }
  
  public JsonWriter newJsonWriter(Writer paramWriter)
  {
    boolean bool = this.generateNonExecutableJson;
    String str;
    if (bool)
    {
      str = ")]}'\n";
      paramWriter.write(str);
    }
    JsonWriter localJsonWriter = new com/google/gson/stream/JsonWriter;
    localJsonWriter.<init>(paramWriter);
    bool = this.prettyPrinting;
    if (bool)
    {
      str = "  ";
      localJsonWriter.setIndent(str);
    }
    bool = this.serializeNulls;
    localJsonWriter.setSerializeNulls(bool);
    return localJsonWriter;
  }
  
  public boolean serializeNulls()
  {
    return this.serializeNulls;
  }
  
  public String toJson(JsonElement paramJsonElement)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramJsonElement, localStringWriter);
    return localStringWriter.toString();
  }
  
  public String toJson(Object paramObject)
  {
    if (paramObject == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (Object localObject = toJson((JsonElement)localObject);; localObject = toJson(paramObject, (Type)localObject))
    {
      return (String)localObject;
      localObject = paramObject.getClass();
    }
  }
  
  public String toJson(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramObject, paramType, localStringWriter);
    return localStringWriter.toString();
  }
  
  public void toJson(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    boolean bool3 = this.htmlSafe;
    paramJsonWriter.setHtmlSafe(bool3);
    boolean bool4 = paramJsonWriter.getSerializeNulls();
    bool3 = this.serializeNulls;
    paramJsonWriter.setSerializeNulls(bool3);
    try
    {
      Streams.write(paramJsonElement, paramJsonWriter);
      return;
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
    finally
    {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool4);
    }
  }
  
  public void toJson(JsonElement paramJsonElement, Appendable paramAppendable)
  {
    try
    {
      localObject = Streams.writerForAppendable(paramAppendable);
      JsonWriter localJsonWriter = newJsonWriter((Writer)localObject);
      toJson(paramJsonElement, localJsonWriter);
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public void toJson(Object paramObject, Appendable paramAppendable)
  {
    Object localObject;
    if (paramObject != null)
    {
      localObject = paramObject.getClass();
      toJson(paramObject, (Type)localObject, paramAppendable);
    }
    for (;;)
    {
      return;
      localObject = JsonNull.INSTANCE;
      toJson((JsonElement)localObject, paramAppendable);
    }
  }
  
  public void toJson(Object paramObject, Type paramType, JsonWriter paramJsonWriter)
  {
    Object localObject1 = TypeToken.get(paramType);
    TypeAdapter localTypeAdapter = getAdapter((TypeToken)localObject1);
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    boolean bool3 = this.htmlSafe;
    paramJsonWriter.setHtmlSafe(bool3);
    boolean bool4 = paramJsonWriter.getSerializeNulls();
    bool3 = this.serializeNulls;
    paramJsonWriter.setSerializeNulls(bool3);
    try
    {
      localTypeAdapter.write(paramJsonWriter, paramObject);
      return;
    }
    catch (IOException localIOException)
    {
      localObject1 = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
    finally
    {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool4);
    }
  }
  
  public void toJson(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      localObject = Streams.writerForAppendable(paramAppendable);
      JsonWriter localJsonWriter = newJsonWriter((Writer)localObject);
      toJson(paramObject, paramType, localJsonWriter);
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
  
  public JsonElement toJsonTree(Object paramObject)
  {
    if (paramObject == null) {}
    for (Object localObject = JsonNull.INSTANCE;; localObject = toJsonTree(paramObject, (Type)localObject))
    {
      return (JsonElement)localObject;
      localObject = paramObject.getClass();
    }
  }
  
  public JsonElement toJsonTree(Object paramObject, Type paramType)
  {
    JsonTreeWriter localJsonTreeWriter = new com/google/gson/internal/bind/JsonTreeWriter;
    localJsonTreeWriter.<init>();
    toJson(paramObject, paramType, localJsonTreeWriter);
    return localJsonTreeWriter.get();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("{serializeNulls:");
    boolean bool = this.serializeNulls;
    localStringBuilder = localStringBuilder.append(bool).append("factories:");
    Object localObject = this.factories;
    localStringBuilder = localStringBuilder.append(localObject).append(",instanceCreators:");
    localObject = this.constructorConstructor;
    return localObject + "}";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/Gson.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */