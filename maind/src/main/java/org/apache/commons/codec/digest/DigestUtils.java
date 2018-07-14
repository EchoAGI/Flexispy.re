package org.apache.commons.codec.digest;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;

public class DigestUtils
{
  private static final int STREAM_BUFFER_LENGTH = 1024;
  
  private static byte[] digest(MessageDigest paramMessageDigest, InputStream paramInputStream)
  {
    int i = 1024;
    byte[] arrayOfByte = new byte[i];
    for (int j = paramInputStream.read(arrayOfByte, 0, i);; j = paramInputStream.read(arrayOfByte, 0, i))
    {
      int k = -1;
      if (j <= k) {
        break;
      }
      paramMessageDigest.update(arrayOfByte, 0, j);
    }
    return paramMessageDigest.digest();
  }
  
  private static byte[] getBytesUtf8(String paramString)
  {
    return StringUtils.getBytesUtf8(paramString);
  }
  
  static MessageDigest getDigest(String paramString)
  {
    try
    {
      return MessageDigest.getInstance(paramString);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      String str = localNoSuchAlgorithmException.getMessage();
      localRuntimeException.<init>(str);
      throw localRuntimeException;
    }
  }
  
  private static MessageDigest getMd5Digest()
  {
    return getDigest("MD5");
  }
  
  private static MessageDigest getSha256Digest()
  {
    return getDigest("SHA-256");
  }
  
  private static MessageDigest getSha384Digest()
  {
    return getDigest("SHA-384");
  }
  
  private static MessageDigest getSha512Digest()
  {
    return getDigest("SHA-512");
  }
  
  private static MessageDigest getShaDigest()
  {
    return getDigest("SHA");
  }
  
  public static byte[] md5(InputStream paramInputStream)
  {
    return digest(getMd5Digest(), paramInputStream);
  }
  
  public static byte[] md5(String paramString)
  {
    return md5(getBytesUtf8(paramString));
  }
  
  public static byte[] md5(byte[] paramArrayOfByte)
  {
    return getMd5Digest().digest(paramArrayOfByte);
  }
  
  public static String md5Hex(InputStream paramInputStream)
  {
    return Hex.encodeHexString(md5(paramInputStream));
  }
  
  public static String md5Hex(String paramString)
  {
    return Hex.encodeHexString(md5(paramString));
  }
  
  public static String md5Hex(byte[] paramArrayOfByte)
  {
    return Hex.encodeHexString(md5(paramArrayOfByte));
  }
  
  public static byte[] sha(InputStream paramInputStream)
  {
    return digest(getShaDigest(), paramInputStream);
  }
  
  public static byte[] sha(String paramString)
  {
    return sha(getBytesUtf8(paramString));
  }
  
  public static byte[] sha(byte[] paramArrayOfByte)
  {
    return getShaDigest().digest(paramArrayOfByte);
  }
  
  public static byte[] sha256(InputStream paramInputStream)
  {
    return digest(getSha256Digest(), paramInputStream);
  }
  
  public static byte[] sha256(String paramString)
  {
    return sha256(getBytesUtf8(paramString));
  }
  
  public static byte[] sha256(byte[] paramArrayOfByte)
  {
    return getSha256Digest().digest(paramArrayOfByte);
  }
  
  public static String sha256Hex(InputStream paramInputStream)
  {
    return Hex.encodeHexString(sha256(paramInputStream));
  }
  
  public static String sha256Hex(String paramString)
  {
    return Hex.encodeHexString(sha256(paramString));
  }
  
  public static String sha256Hex(byte[] paramArrayOfByte)
  {
    return Hex.encodeHexString(sha256(paramArrayOfByte));
  }
  
  public static byte[] sha384(InputStream paramInputStream)
  {
    return digest(getSha384Digest(), paramInputStream);
  }
  
  public static byte[] sha384(String paramString)
  {
    return sha384(getBytesUtf8(paramString));
  }
  
  public static byte[] sha384(byte[] paramArrayOfByte)
  {
    return getSha384Digest().digest(paramArrayOfByte);
  }
  
  public static String sha384Hex(InputStream paramInputStream)
  {
    return Hex.encodeHexString(sha384(paramInputStream));
  }
  
  public static String sha384Hex(String paramString)
  {
    return Hex.encodeHexString(sha384(paramString));
  }
  
  public static String sha384Hex(byte[] paramArrayOfByte)
  {
    return Hex.encodeHexString(sha384(paramArrayOfByte));
  }
  
  public static byte[] sha512(InputStream paramInputStream)
  {
    return digest(getSha512Digest(), paramInputStream);
  }
  
  public static byte[] sha512(String paramString)
  {
    return sha512(getBytesUtf8(paramString));
  }
  
  public static byte[] sha512(byte[] paramArrayOfByte)
  {
    return getSha512Digest().digest(paramArrayOfByte);
  }
  
  public static String sha512Hex(InputStream paramInputStream)
  {
    return Hex.encodeHexString(sha512(paramInputStream));
  }
  
  public static String sha512Hex(String paramString)
  {
    return Hex.encodeHexString(sha512(paramString));
  }
  
  public static String sha512Hex(byte[] paramArrayOfByte)
  {
    return Hex.encodeHexString(sha512(paramArrayOfByte));
  }
  
  public static String shaHex(InputStream paramInputStream)
  {
    return Hex.encodeHexString(sha(paramInputStream));
  }
  
  public static String shaHex(String paramString)
  {
    return Hex.encodeHexString(sha(paramString));
  }
  
  public static String shaHex(byte[] paramArrayOfByte)
  {
    return Hex.encodeHexString(sha(paramArrayOfByte));
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/codec/digest/DigestUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */