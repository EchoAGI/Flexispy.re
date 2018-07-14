package a_vcard.android.syncml.pim;

import java.util.List;

public abstract interface VBuilder
{
  public abstract void end();
  
  public abstract void endProperty();
  
  public abstract void endRecord();
  
  public abstract void propertyGroup(String paramString);
  
  public abstract void propertyName(String paramString);
  
  public abstract void propertyParamType(String paramString);
  
  public abstract void propertyParamValue(String paramString);
  
  public abstract void propertyValues(List paramList);
  
  public abstract void start();
  
  public abstract void startProperty();
  
  public abstract void startRecord(String paramString);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/syncml/pim/VBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */