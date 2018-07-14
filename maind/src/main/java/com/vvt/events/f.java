package com.vvt.events;

public class f
{
  public static FxMediaType a(String paramString)
  {
    Object localObject = paramString.toUpperCase().replace("AUDIO/", "").replace("IMAGE/", "");
    String str1 = "";
    localObject = ((String)localObject).replace("VIDEO/", str1);
    String str2 = "CGM";
    boolean bool1 = ((String)localObject).equals(str2);
    if (bool1) {
      localObject = FxMediaType.CGM;
    }
    for (;;)
    {
      return (FxMediaType)localObject;
      str2 = "SVG";
      bool1 = ((String)localObject).equals(str2);
      if (bool1)
      {
        localObject = FxMediaType.SVG;
      }
      else
      {
        str2 = "ODG";
        bool1 = ((String)localObject).equals(str2);
        if (bool1)
        {
          localObject = FxMediaType.ODG;
        }
        else
        {
          str2 = "EPS";
          bool1 = ((String)localObject).equals(str2);
          if (bool1)
          {
            localObject = FxMediaType.EPS;
          }
          else
          {
            str2 = "PDF";
            bool1 = ((String)localObject).equals(str2);
            if (bool1)
            {
              localObject = FxMediaType.PDF;
            }
            else
            {
              str2 = "SWF";
              bool1 = ((String)localObject).equals(str2);
              if (bool1)
              {
                localObject = FxMediaType.SWF;
              }
              else
              {
                str2 = "WMF";
                bool1 = ((String)localObject).equals(str2);
                if (bool1)
                {
                  localObject = FxMediaType.WMF;
                }
                else
                {
                  str2 = "XPS";
                  bool1 = ((String)localObject).equals(str2);
                  if (bool1)
                  {
                    localObject = FxMediaType.XPS;
                  }
                  else
                  {
                    str2 = "EMS";
                    bool1 = ((String)localObject).equals(str2);
                    if (bool1)
                    {
                      localObject = FxMediaType.EMS;
                    }
                    else
                    {
                      str2 = "EMF_PLUS";
                      bool1 = ((String)localObject).equals(str2);
                      if (bool1)
                      {
                        localObject = FxMediaType.EMF_PLUS;
                      }
                      else
                      {
                        str2 = "EMZ";
                        bool1 = ((String)localObject).equals(str2);
                        if (bool1)
                        {
                          localObject = FxMediaType.EMZ;
                        }
                        else
                        {
                          str2 = "MP4";
                          bool1 = ((String)localObject).equals(str2);
                          if (bool1)
                          {
                            localObject = FxMediaType.MP4;
                          }
                          else
                          {
                            str2 = "WMV";
                            bool1 = ((String)localObject).equals(str2);
                            if (bool1)
                            {
                              localObject = FxMediaType.WMV;
                            }
                            else
                            {
                              str2 = "ASF";
                              bool1 = ((String)localObject).equals(str2);
                              if (bool1)
                              {
                                localObject = FxMediaType.ASF;
                              }
                              else
                              {
                                str2 = "3GPP";
                                bool1 = ((String)localObject).equals(str2);
                                if (bool1)
                                {
                                  localObject = FxMediaType.THREE_GP;
                                }
                                else
                                {
                                  str2 = "3GP";
                                  bool1 = ((String)localObject).equals(str2);
                                  if (bool1)
                                  {
                                    localObject = FxMediaType.THREE_GP;
                                  }
                                  else
                                  {
                                    str2 = "3G2";
                                    bool1 = ((String)localObject).equals(str2);
                                    if (bool1)
                                    {
                                      localObject = FxMediaType.THREE_G2;
                                    }
                                    else
                                    {
                                      str2 = "M4V";
                                      bool1 = ((String)localObject).equals(str2);
                                      if (bool1)
                                      {
                                        localObject = FxMediaType.M4V;
                                      }
                                      else
                                      {
                                        str2 = "AVI";
                                        bool1 = ((String)localObject).equals(str2);
                                        if (bool1)
                                        {
                                          localObject = FxMediaType.AVI;
                                        }
                                        else
                                        {
                                          str2 = "JPG";
                                          bool1 = ((String)localObject).equals(str2);
                                          if (bool1)
                                          {
                                            localObject = FxMediaType.JPEG;
                                          }
                                          else
                                          {
                                            str2 = "JPEG";
                                            bool1 = ((String)localObject).equals(str2);
                                            if (bool1)
                                            {
                                              localObject = FxMediaType.JPEG;
                                            }
                                            else
                                            {
                                              str2 = "GIF";
                                              bool1 = ((String)localObject).equals(str2);
                                              if (bool1)
                                              {
                                                localObject = FxMediaType.GIF;
                                              }
                                              else
                                              {
                                                str2 = "BMP";
                                                bool1 = ((String)localObject).equals(str2);
                                                if (bool1)
                                                {
                                                  localObject = FxMediaType.BMP;
                                                }
                                                else
                                                {
                                                  str2 = "EXIF";
                                                  bool1 = ((String)localObject).equals(str2);
                                                  if (bool1)
                                                  {
                                                    localObject = FxMediaType.EXIF;
                                                  }
                                                  else
                                                  {
                                                    str2 = "TIFF";
                                                    bool1 = ((String)localObject).equals(str2);
                                                    if (bool1)
                                                    {
                                                      localObject = FxMediaType.TIFF;
                                                    }
                                                    else
                                                    {
                                                      str2 = "RAW";
                                                      bool1 = ((String)localObject).equals(str2);
                                                      if (bool1)
                                                      {
                                                        localObject = FxMediaType.RAW;
                                                      }
                                                      else
                                                      {
                                                        str2 = "PNG";
                                                        bool1 = ((String)localObject).equals(str2);
                                                        if (bool1)
                                                        {
                                                          localObject = FxMediaType.PNG;
                                                        }
                                                        else
                                                        {
                                                          str2 = "PPM";
                                                          bool1 = ((String)localObject).equals(str2);
                                                          if (bool1)
                                                          {
                                                            localObject = FxMediaType.PPM;
                                                          }
                                                          else
                                                          {
                                                            str2 = "PGM";
                                                            bool1 = ((String)localObject).equals(str2);
                                                            if (bool1)
                                                            {
                                                              localObject = FxMediaType.PGM;
                                                            }
                                                            else
                                                            {
                                                              str2 = "PBM";
                                                              bool1 = ((String)localObject).equals(str2);
                                                              if (bool1)
                                                              {
                                                                localObject = FxMediaType.PBM;
                                                              }
                                                              else
                                                              {
                                                                str2 = "PNM";
                                                                bool1 = ((String)localObject).equals(str2);
                                                                if (bool1)
                                                                {
                                                                  localObject = FxMediaType.PNM;
                                                                }
                                                                else
                                                                {
                                                                  str2 = "ECW";
                                                                  bool1 = ((String)localObject).equals(str2);
                                                                  if (bool1)
                                                                  {
                                                                    localObject = FxMediaType.ECW;
                                                                  }
                                                                  else
                                                                  {
                                                                    str2 = "MP3";
                                                                    bool1 = ((String)localObject).equals(str2);
                                                                    if (bool1)
                                                                    {
                                                                      localObject = FxMediaType.MP3;
                                                                    }
                                                                    else
                                                                    {
                                                                      str2 = "AAC";
                                                                      bool1 = ((String)localObject).equals(str2);
                                                                      if (bool1)
                                                                      {
                                                                        localObject = FxMediaType.AAC;
                                                                      }
                                                                      else
                                                                      {
                                                                        str2 = "AAC_PLUS";
                                                                        bool1 = ((String)localObject).equals(str2);
                                                                        if (bool1)
                                                                        {
                                                                          localObject = FxMediaType.AAC_PLUS;
                                                                        }
                                                                        else
                                                                        {
                                                                          str2 = "eAAC_PLUS";
                                                                          bool1 = ((String)localObject).equals(str2);
                                                                          if (bool1)
                                                                          {
                                                                            localObject = FxMediaType.eAAC_PLUS;
                                                                          }
                                                                          else
                                                                          {
                                                                            str2 = "AMR";
                                                                            bool1 = ((String)localObject).equals(str2);
                                                                            if (bool1)
                                                                            {
                                                                              localObject = FxMediaType.AMR_WM;
                                                                            }
                                                                            else
                                                                            {
                                                                              str2 = "AMR_NB";
                                                                              bool1 = ((String)localObject).equals(str2);
                                                                              if (bool1)
                                                                              {
                                                                                localObject = FxMediaType.AMR_NB;
                                                                              }
                                                                              else
                                                                              {
                                                                                str2 = "AMR_WM";
                                                                                bool1 = ((String)localObject).equals(str2);
                                                                                if (bool1)
                                                                                {
                                                                                  localObject = FxMediaType.AMR_WM;
                                                                                }
                                                                                else
                                                                                {
                                                                                  str2 = "QCP";
                                                                                  bool1 = ((String)localObject).equals(str2);
                                                                                  if (bool1)
                                                                                  {
                                                                                    localObject = FxMediaType.QCP;
                                                                                  }
                                                                                  else
                                                                                  {
                                                                                    str2 = "WMA";
                                                                                    bool1 = ((String)localObject).equals(str2);
                                                                                    if (bool1)
                                                                                    {
                                                                                      localObject = FxMediaType.WMA;
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                      str2 = "MIDI";
                                                                                      bool1 = ((String)localObject).equals(str2);
                                                                                      if (bool1)
                                                                                      {
                                                                                        localObject = FxMediaType.MIDI;
                                                                                      }
                                                                                      else
                                                                                      {
                                                                                        str2 = "RA";
                                                                                        bool1 = ((String)localObject).equals(str2);
                                                                                        if (bool1)
                                                                                        {
                                                                                          localObject = FxMediaType.RA;
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                          str2 = "PCM";
                                                                                          bool1 = ((String)localObject).equals(str2);
                                                                                          if (bool1)
                                                                                          {
                                                                                            localObject = FxMediaType.PCM;
                                                                                          }
                                                                                          else
                                                                                          {
                                                                                            str2 = "AIFF";
                                                                                            bool1 = ((String)localObject).equals(str2);
                                                                                            if (bool1)
                                                                                            {
                                                                                              localObject = FxMediaType.AIFF;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                              str2 = "BWF";
                                                                                              bool1 = ((String)localObject).equals(str2);
                                                                                              if (bool1)
                                                                                              {
                                                                                                localObject = FxMediaType.BWF;
                                                                                              }
                                                                                              else
                                                                                              {
                                                                                                str2 = "AU";
                                                                                                bool1 = ((String)localObject).equals(str2);
                                                                                                if (bool1)
                                                                                                {
                                                                                                  localObject = FxMediaType.au;
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                  str2 = "WAV";
                                                                                                  bool1 = ((String)localObject).equals(str2);
                                                                                                  if (bool1)
                                                                                                  {
                                                                                                    localObject = FxMediaType.WAV;
                                                                                                  }
                                                                                                  else
                                                                                                  {
                                                                                                    str2 = "M4P";
                                                                                                    bool1 = ((String)localObject).equals(str2);
                                                                                                    if (bool1)
                                                                                                    {
                                                                                                      localObject = FxMediaType.M4P;
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                      str2 = "M4A";
                                                                                                      bool1 = ((String)localObject).equals(str2);
                                                                                                      if (bool1)
                                                                                                      {
                                                                                                        localObject = FxMediaType.M4A;
                                                                                                      }
                                                                                                      else
                                                                                                      {
                                                                                                        str2 = "M4R";
                                                                                                        bool1 = ((String)localObject).equals(str2);
                                                                                                        if (bool1)
                                                                                                        {
                                                                                                          localObject = FxMediaType.M4R;
                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                          str2 = "MP2";
                                                                                                          boolean bool2 = ((String)localObject).equals(str2);
                                                                                                          if (bool2) {
                                                                                                            localObject = FxMediaType.MP2;
                                                                                                          } else {
                                                                                                            localObject = FxMediaType.UNKNOWN;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */