package org.apache.commons.lang.text;

import java.text.Format;
import java.util.Locale;

public abstract interface FormatFactory
{
  public abstract Format getFormat(String paramString1, String paramString2, Locale paramLocale);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/FormatFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */