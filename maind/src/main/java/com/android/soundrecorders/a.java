package com.android.soundrecorders;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import java.io.IOException;
import java.io.RandomAccessFile;

class a
  implements AudioRecord.OnRecordPositionUpdateListener
{
  a(WaveRecorder paramWaveRecorder) {}
  
  public void onMarkerReached(AudioRecord paramAudioRecord) {}
  
  public void onPeriodicNotification(AudioRecord paramAudioRecord)
  {
    Object localObject1 = WaveRecorder.b(this.a);
    Object localObject2 = WaveRecorder.a(this.a);
    byte[] arrayOfByte = WaveRecorder.a(this.a);
    int i = arrayOfByte.length;
    ((AudioRecord)localObject1).read((byte[])localObject2, 0, i);
    try
    {
      localObject1 = this.a;
      localObject1 = WaveRecorder.c((WaveRecorder)localObject1);
      localObject2 = this.a;
      localObject2 = WaveRecorder.a((WaveRecorder)localObject2);
      ((RandomAccessFile)localObject1).write((byte[])localObject2);
      localObject1 = this.a;
      localObject2 = this.a;
      localObject2 = WaveRecorder.a((WaveRecorder)localObject2);
      int j = localObject2.length;
      WaveRecorder.a((WaveRecorder)localObject1, j);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = WaveRecorder.g();
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/android/soundrecorders/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */