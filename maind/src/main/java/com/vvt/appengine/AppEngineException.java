package com.vvt.appengine;

public class AppEngineException extends Exception {
    private static final long serialVersionUID = -8190594015633067665L;
    private Throwable mThrowable;

    public AppEngineException(Throwable paramThrowable)
    {
        this.mThrowable = paramThrowable;
    }

    public Throwable getException()
    {
        return this.mThrowable;
    }
}

/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/AppEngineException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */