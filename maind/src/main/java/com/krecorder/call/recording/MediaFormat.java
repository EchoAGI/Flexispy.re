package com.krecorder.call.recording;

public enum MediaFormat
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com.krecorder.call.recording.MediaFormat("AMR", 0);
    AMR = (MediaFormat)localObject;
    localObject = new com.krecorder.call.recording.MediaFormat("WAV", k);
    WAV = (MediaFormat)localObject;
    localObject = new com.krecorder.call.recording.MediaFormat("AAC", j);
    AAC = (MediaFormat)localObject;
    localObject = new com.krecorder.call.recording.MediaFormat("MP3", i);
    MP3 = (MediaFormat)localObject;
    localObject = new MediaFormat[4];
    localObject[0] = AMR;
    localObject[k] = WAV;
    localObject[j] = AAC;
    localObject[i] = MP3;
    a = (MediaFormat[])localObject;
  }
  
  public static MediaFormat fromOrdinal(int paramInt) {
    try {
      localObject = values();
      localObject = localObject[paramInt];
    }
    catch (Exception localException) {
      for (;;) {
        Object localObject;
        MediaFormat localMediaFormat = AMR;
      }
    }
    return (MediaFormat)localObject;
  }
  
  public String getFileExtention() {
    Object localObject = a.a;
    int i = ordinal();
    int j = localObject[i];
    switch (j) {
    default: 
      localObject = ".unk";
    }

    for (;;) {
      return (String)localObject;
      localObject = ".amr";
      continue;
      localObject = ".wav";
      continue;
      localObject = ".aac";
      continue;
      localObject = ".mp3";
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/recording/MediaFormat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */