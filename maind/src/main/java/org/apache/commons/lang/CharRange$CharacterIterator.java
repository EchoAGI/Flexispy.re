package org.apache.commons.lang;

import java.util.Iterator;
import java.util.NoSuchElementException;

class CharRange$CharacterIterator
  implements Iterator
{
  private char current;
  private boolean hasNext;
  private CharRange range;
  
  private CharRange$CharacterIterator(CharRange paramCharRange)
  {
    this.range = paramCharRange;
    this.hasNext = true;
    CharRange localCharRange = this.range;
    boolean bool = CharRange.access$100(localCharRange);
    char c;
    if (bool)
    {
      localCharRange = this.range;
      c = CharRange.access$200(localCharRange);
      if (c == 0)
      {
        localCharRange = this.range;
        c = CharRange.access$300(localCharRange);
        int i = (char)-1;
        if (c == i) {
          this.hasNext = false;
        }
      }
    }
    for (;;)
    {
      return;
      localCharRange = this.range;
      c = (char)(CharRange.access$300(localCharRange) + '\001');
      this.current = c;
      continue;
      this.current = '\000';
      continue;
      localCharRange = this.range;
      c = CharRange.access$200(localCharRange);
      this.current = c;
    }
  }
  
  CharRange$CharacterIterator(CharRange paramCharRange, CharRange.1 param1)
  {
    this(paramCharRange);
  }
  
  private void prepareNext()
  {
    int i = (char)-1;
    CharRange localCharRange1 = this.range;
    boolean bool = CharRange.access$100(localCharRange1);
    int j;
    if (bool)
    {
      j = this.current;
      if (j == i) {
        this.hasNext = false;
      }
    }
    for (;;)
    {
      return;
      j = this.current + '\001';
      CharRange localCharRange2 = this.range;
      int k = CharRange.access$200(localCharRange2);
      if (j == k)
      {
        localCharRange1 = this.range;
        j = CharRange.access$300(localCharRange1);
        if (j == i)
        {
          this.hasNext = false;
        }
        else
        {
          localCharRange1 = this.range;
          j = (char)(CharRange.access$300(localCharRange1) + '\001');
          this.current = j;
        }
      }
      else
      {
        j = (char)(this.current + '\001');
        this.current = j;
        continue;
        j = this.current;
        localCharRange2 = this.range;
        k = CharRange.access$300(localCharRange2);
        if (j < k)
        {
          j = (char)(this.current + '\001');
          this.current = j;
        }
        else
        {
          this.hasNext = false;
        }
      }
    }
  }
  
  public boolean hasNext()
  {
    return this.hasNext;
  }
  
  public Object next()
  {
    boolean bool = this.hasNext;
    if (!bool)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    char c = this.current;
    prepareNext();
    Object localObject = new java/lang/Character;
    ((Character)localObject).<init>(c);
    return localObject;
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/CharRange$CharacterIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */