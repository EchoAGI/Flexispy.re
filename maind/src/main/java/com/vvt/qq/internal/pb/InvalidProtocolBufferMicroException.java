package com.vvt.qq.internal.pb;

import java.io.IOException;

public class InvalidProtocolBufferMicroException
  extends IOException
{
  private static final long serialVersionUID = -1616151763072450476L;
  
  public InvalidProtocolBufferMicroException(String paramString)
  {
    super(paramString);
  }
  
  static InvalidProtocolBufferMicroException invalidEndTag()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("Protocol message end-group tag did not match expected tag.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException invalidTag()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("Protocol message contained an invalid tag (zero).");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException invalidWireType()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("Protocol message tag had invalid wire type.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException malformedVarint()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("CodedInputStream encountered a malformed varint.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException negativeSize()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException recursionLimitExceeded()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException sizeLimitExceeded()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    return localInvalidProtocolBufferMicroException;
  }
  
  static InvalidProtocolBufferMicroException truncatedMessage()
  {
    InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException = new com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException;
    localInvalidProtocolBufferMicroException.<init>("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    return localInvalidProtocolBufferMicroException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/pb/InvalidProtocolBufferMicroException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */