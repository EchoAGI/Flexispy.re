package com.vvt.capture.telegram.internal;

public class TLRPC$EncryptedChat
  extends TLObject
{
  public byte[] a_or_b;
  public long access_hash;
  public int admin_id;
  public byte[] auth_key;
  public int date;
  public long exchange_id;
  public byte[] future_auth_key;
  public long future_key_fingerprint;
  public byte[] g_a;
  public byte[] g_a_or_b;
  public int id;
  public int key_create_date;
  public long key_fingerprint;
  public byte[] key_hash;
  public short key_use_count_in;
  public short key_use_count_out;
  public int layer;
  public byte[] nonce;
  public int participant_id;
  public int seq_in;
  public int seq_out;
  public int ttl;
  public int user_id;
  
  public static EncryptedChat TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in EncryptedChat", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChatRequested_old;
      ((TLRPC.TL_encryptedChatRequested_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChatRequested;
      ((TLRPC.TL_encryptedChatRequested)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChat;
      ((TLRPC.TL_encryptedChat)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChat_old;
      ((TLRPC.TL_encryptedChat_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChatEmpty;
      ((TLRPC.TL_encryptedChatEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChatWaiting;
      ((TLRPC.TL_encryptedChatWaiting)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChatDiscarded;
      ((TLRPC.TL_encryptedChatDiscarded)localObject).<init>();
    }
    if (localObject != null) {
      ((EncryptedChat)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (EncryptedChat)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$EncryptedChat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */