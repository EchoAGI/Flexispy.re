package com.vvt.remotecommand.processor;

import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecontrol.a;

public abstract class RemoteCommandProcessor {
    enum QueueCategory {
        MAIN,
        INDIVIDUAL
    }

    private a a;

    public RemoteCommandProcessor(a parama)
    {
        this.a = parama;
    }

    public abstract void a(RemoteCommand paramRemoteCommand, c paramc);

    public abstract RemoteCommandProcessor.QueueCategory d();

    public abstract String e();

    public abstract boolean f();

    public abstract long g();

    public a h()
    {
        return this.a;
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/RemoteCommandProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */