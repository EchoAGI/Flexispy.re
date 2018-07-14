package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  private final Excluder excluder;
  private final FieldNamingStrategy fieldNamingPolicy;
  private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
  
  public ReflectiveTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, FieldNamingStrategy paramFieldNamingStrategy, Excluder paramExcluder, JsonAdapterAnnotationTypeAdapterFactory paramJsonAdapterAnnotationTypeAdapterFactory)
  {
    this.constructorConstructor = paramConstructorConstructor;
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    this.excluder = paramExcluder;
    this.jsonAdapterFactory = paramJsonAdapterAnnotationTypeAdapterFactory;
  }
  
  private ReflectiveTypeAdapterFactory.BoundField createBoundField(Gson paramGson, Field paramField, String paramString, TypeToken paramTypeToken, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = Primitives.isPrimitive(paramTypeToken.getRawType());
    Object localObject1 = JsonAdapter.class;
    JsonAdapter localJsonAdapter = (JsonAdapter)paramField.getAnnotation((Class)localObject1);
    TypeAdapter localTypeAdapter = null;
    Object localObject2;
    if (localJsonAdapter != null)
    {
      localObject1 = this.jsonAdapterFactory;
      localObject2 = this.constructorConstructor;
      localTypeAdapter = ((JsonAdapterAnnotationTypeAdapterFactory)localObject1).getTypeAdapter((ConstructorConstructor)localObject2, paramGson, paramTypeToken, localJsonAdapter);
    }
    if (localTypeAdapter != null) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      if (localTypeAdapter == null) {
        localTypeAdapter = paramGson.getAdapter(paramTypeToken);
      }
      localObject1 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
      localObject2 = this;
      ((ReflectiveTypeAdapterFactory.1)localObject1).<init>(this, paramString, paramBoolean1, paramBoolean2, paramField, bool2, localTypeAdapter, paramGson, paramTypeToken, bool1);
      return (ReflectiveTypeAdapterFactory.BoundField)localObject1;
    }
  }
  
  static boolean excludeField(Field paramField, boolean paramBoolean, Excluder paramExcluder)
  {
    Class localClass = paramField.getType();
    boolean bool = paramExcluder.excludeClass(localClass, paramBoolean);
    if (!bool)
    {
      bool = paramExcluder.excludeField(paramField, paramBoolean);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
  
  private Map getBoundFields(Gson paramGson, TypeToken paramTypeToken, Class paramClass)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    boolean bool1 = paramClass.isInterface();
    if (bool1) {
      return localLinkedHashMap;
    }
    Type localType1 = paramTypeToken.getType();
    for (;;)
    {
      Object localObject1 = Object.class;
      if (paramClass == localObject1) {
        break;
      }
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int k = arrayOfField.length;
      int m = k;
      bool1 = false;
      localObject1 = null;
      int n = 0;
      k = n;
      if (n < m)
      {
        Field localField = arrayOfField[n];
        boolean bool2 = excludeField(localField, true);
        bool1 = false;
        localObject1 = null;
        boolean bool3 = excludeField(localField, false);
        if ((!bool2) && (!bool3)) {}
        Object localObject3;
        do
        {
          int i = n + 1;
          n = i;
          break;
          i = 1;
          localField.setAccessible(i);
          localObject1 = paramTypeToken.getType();
          localObject2 = localField.getGenericType();
          Type localType2 = .Gson.Types.resolve((Type)localObject1, paramClass, (Type)localObject2);
          List localList = getFieldNames(localField);
          localObject3 = null;
          int i1 = 0;
          for (;;)
          {
            int j = localList.size();
            if (i1 >= j) {
              break;
            }
            String str = (String)localList.get(i1);
            if (i1 != 0) {
              bool2 = false;
            }
            localObject4 = TypeToken.get(localType2);
            localObject1 = this;
            localObject2 = paramGson;
            ReflectiveTypeAdapterFactory.BoundField localBoundField1 = createBoundField(paramGson, localField, str, (TypeToken)localObject4, bool2, bool3);
            ReflectiveTypeAdapterFactory.BoundField localBoundField2 = (ReflectiveTypeAdapterFactory.BoundField)localLinkedHashMap.put(str, localBoundField1);
            if (localObject3 == null) {
              localObject3 = localBoundField2;
            }
            i1 += 1;
          }
        } while (localObject3 == null);
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(localType1).append(" declares multiple JSON fields named ");
        Object localObject4 = ((ReflectiveTypeAdapterFactory.BoundField)localObject3).name;
        localObject2 = (String)localObject4;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = paramTypeToken.getType();
      Object localObject2 = paramClass.getGenericSuperclass();
      localObject1 = .Gson.Types.resolve((Type)localObject1, paramClass, (Type)localObject2);
      paramTypeToken = TypeToken.get((Type)localObject1);
      paramClass = paramTypeToken.getRawType();
    }
  }
  
  private List getFieldNames(Field paramField)
  {
    Object localObject1 = SerializedName.class;
    SerializedName localSerializedName = (SerializedName)paramField.getAnnotation((Class)localObject1);
    Object localObject2;
    if (localSerializedName == null)
    {
      localObject1 = this.fieldNamingPolicy;
      String str1 = ((FieldNamingStrategy)localObject1).translateName(paramField);
      localObject2 = Collections.singletonList(str1);
    }
    for (;;)
    {
      return (List)localObject2;
      String str2 = localSerializedName.value();
      String[] arrayOfString = localSerializedName.alternate();
      int i = arrayOfString.length;
      if (i == 0)
      {
        localObject2 = Collections.singletonList(str2);
      }
      else
      {
        localObject2 = new java/util/ArrayList;
        i = arrayOfString.length + 1;
        ((ArrayList)localObject2).<init>(i);
        ((List)localObject2).add(str2);
        int j = arrayOfString.length;
        i = 0;
        localObject1 = null;
        while (i < j)
        {
          String str3 = arrayOfString[i];
          ((List)localObject2).add(str3);
          i += 1;
        }
      }
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Class localClass = paramTypeToken.getRawType();
    Object localObject = Object.class;
    boolean bool = ((Class)localObject).isAssignableFrom(localClass);
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      ObjectConstructor localObjectConstructor = this.constructorConstructor.get(paramTypeToken);
      localObject = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
      Map localMap = getBoundFields(paramGson, paramTypeToken, localClass);
      ((ReflectiveTypeAdapterFactory.Adapter)localObject).<init>(localObjectConstructor, localMap);
    }
  }
  
  public boolean excludeField(Field paramField, boolean paramBoolean)
  {
    Excluder localExcluder = this.excluder;
    return excludeField(paramField, paramBoolean, localExcluder);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */