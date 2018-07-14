package org.eclipse.paho.client.mqttv3;

import org.eclipse.paho.client.mqttv3.a.l;

public class MqttException
  extends Exception
{
  public static final short REASON_CODE_BROKER_UNAVAILABLE = 3;
  public static final short REASON_CODE_CLIENT_ALREADY_DISCONNECTED = 32101;
  public static final short REASON_CODE_CLIENT_CLOSED = 32111;
  public static final short REASON_CODE_CLIENT_CONNECTED = 32100;
  public static final short REASON_CODE_CLIENT_DISCONNECTING = 32102;
  public static final short REASON_CODE_CLIENT_DISCONNECT_PROHIBITED = 32107;
  public static final short REASON_CODE_CLIENT_EXCEPTION = 0;
  public static final short REASON_CODE_CLIENT_NOT_CONNECTED = 32104;
  public static final short REASON_CODE_CLIENT_TIMEOUT = 32000;
  public static final short REASON_CODE_CONNECTION_LOST = 32109;
  public static final short REASON_CODE_CONNECT_IN_PROGRESS = 32110;
  public static final short REASON_CODE_FAILED_AUTHENTICATION = 4;
  public static final short REASON_CODE_INVALID_CLIENT_ID = 2;
  public static final short REASON_CODE_INVALID_MESSAGE = 32108;
  public static final short REASON_CODE_INVALID_PROTOCOL_VERSION = 1;
  public static final short REASON_CODE_MAX_INFLIGHT = 32202;
  public static final short REASON_CODE_NOT_AUTHORIZED = 5;
  public static final short REASON_CODE_NO_MESSAGE_IDS_AVAILABLE = 32001;
  public static final short REASON_CODE_SERVER_CONNECT_ERROR = 32103;
  public static final short REASON_CODE_SOCKET_FACTORY_MISMATCH = 32105;
  public static final short REASON_CODE_SSL_CONFIG_ERROR = 32106;
  public static final short REASON_CODE_SUBSCRIBE_FAILED = 128;
  public static final short REASON_CODE_TOKEN_INUSE = 32201;
  public static final short REASON_CODE_UNEXPECTED_ERROR = 6;
  private static final long serialVersionUID = 300L;
  private Throwable cause;
  private int reasonCode;
  
  public MqttException(int paramInt)
  {
    this.reasonCode = paramInt;
  }
  
  public MqttException(int paramInt, Throwable paramThrowable)
  {
    this.reasonCode = paramInt;
    this.cause = paramThrowable;
  }
  
  public MqttException(Throwable paramThrowable)
  {
    this.reasonCode = 0;
    this.cause = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.cause;
  }
  
  public String getMessage()
  {
    return l.a(this.reasonCode);
  }
  
  public int getReasonCode()
  {
    return this.reasonCode;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getMessage();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" (");
    int i = this.reasonCode;
    localObject1 = i + ")";
    localObject2 = this.cause;
    if (localObject2 != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(" - ");
      localObject2 = this.cause.toString();
      localObject1 = (String)localObject2;
    }
    return (String)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/MqttException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */