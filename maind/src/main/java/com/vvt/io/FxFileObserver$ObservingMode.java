package com.vvt.io;

public enum FxFileObserver$ObservingMode
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/io/FxFileObserver$ObservingMode;
    ((ObservingMode)localObject).<init>("MODE_ALL_NOTIFY", 0);
    MODE_ALL_NOTIFY = (ObservingMode)localObject;
    localObject = new com/vvt/io/FxFileObserver$ObservingMode;
    ((ObservingMode)localObject).<init>("MODE_MINIMUM_NOTIFY", i);
    MODE_MINIMUM_NOTIFY = (ObservingMode)localObject;
    localObject = new ObservingMode[2];
    ObservingMode localObservingMode = MODE_ALL_NOTIFY;
    localObject[0] = localObservingMode;
    localObservingMode = MODE_MINIMUM_NOTIFY;
    localObject[i] = localObservingMode;
    a = (ObservingMode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/FxFileObserver$ObservingMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */