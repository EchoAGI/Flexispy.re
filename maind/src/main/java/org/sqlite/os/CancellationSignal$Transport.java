package org.sqlite.os;

final class CancellationSignal$Transport
  extends ICancellationSignal.Stub
{
  final CancellationSignal mCancellationSignal;
  
  private CancellationSignal$Transport()
  {
    CancellationSignal localCancellationSignal = new org/sqlite/os/CancellationSignal;
    localCancellationSignal.<init>();
    this.mCancellationSignal = localCancellationSignal;
  }
  
  public void cancel()
  {
    this.mCancellationSignal.cancel();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/os/CancellationSignal$Transport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */