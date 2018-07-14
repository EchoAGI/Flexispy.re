package com.vvt.preference;

public class FxPreferenceException
  extends Exception
{
  public static final String MSG_PREFERENCE_NOT_FOUND = "Specified preference is missing";
  public static final String MSG_READING_FAILED = "Preferences reading failed";
  public static final String MSG_WRITING_FAILED = "Preferences writing failed";
  private static final long serialVersionUID = 1033842059251013814L;
  
  public FxPreferenceException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/FxPreferenceException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */