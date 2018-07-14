package com.vvt.io.exception;

public class FxFileNotFoundException
  extends Throwable
{
  public static final String UPLOAD_ACTUAL_MEDIA_FILE_NOT_FOUND = "Cannot upload media file.\nFile has been removed.\nPairing ID: %s";
  private static final long serialVersionUID = 1L;
  
  public FxFileNotFoundException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/exception/FxFileNotFoundException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */