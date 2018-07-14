package com.krecorder.call.alsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlsaMixerMap
  extends HashMap
{
  public AlsaMixerMap()
  {
    a("apq8064", "MultiMedia1 Mixer SLIM_4_TX", "1");
    a("apq8064", "Incall Rec Mode", "1");
    a("apq8064_v2", "MultiMedia1 Mixer SLIM_0_TX", "1");
    a("apq8064_v2", "Incall Rec Mode", "1");
    a("apq8064_v2_x", "MultiMedia1 Mixer SLIM_0_TX", "0");
    a("apq8064_v2_x", "Incall Rec Mode", "0");
    a("apq8064_x", "MultiMedia1 Mixer SLIM_4_TX", "0");
    a("apq8064_x", "Incall Rec Mode", "0");
    a("apq8084", "MultiMedia1 Mixer SLIM_6_TX", "1");
    a("apq8084", "MultiMedia1 Mixer SLIM_0_TX", "0");
    a("apq8084", "Incall Rec Mode", "1");
    a("apq8084_x", "MultiMedia1 Mixer SLIM_6_TX", "0");
    a("apq8084_x", "Incall Rec Mode", "0");
    a("exynos4412", "AIF1ADC1R Mixer AIF2 Switch", "1");
    a("exynos4412", "AIF1ADC1L Mixer AIF2 Switch", "1");
    a("exynos4412_stop", "AIF1ADC1R Mixer AIF2 Switch", "0");
    a("exynos4412_stop", "AIF1ADC1L Mixer AIF2 Switch", "0");
    a("exynos5433", "AIF1TX1 Input 4", "AIF2RX1");
    a("exynos5433", "Main Mic", "1");
    a("exynos5433", "Sub Mic", "1");
    a("exynos5433_x", "AIF1TX1 Input 4", "None");
    a("exynos5433_x", "Main Mic", "0");
    a("exynos5433_x", "Sub Mic", "0");
    a("msm8960", "MultiMedia1 Mixer VOC_REC_DL", "1");
    a("msm8960", "MultiMedia1 Mixer VOC_REC_UL", "1");
    a("msm8960_v3", "MultiMedia1 Mixer VOC_REC_DL", "1");
    a("msm8960_v3", "MultiMedia1 Mixer VOC_REC_UL", "0");
    a("msm8960_v2", "MultiMedia1 Mixer PRI_TX", "0");
    a("msm8960_v2", "MultiMedia1 Mixer VOC_REC_DL", "1");
    a("msm8960_v2", "MultiMedia1 Mixer VOC_REC_UL", "1");
    a("msm8960_x", "MultiMedia1 Mixer VOC_REC_DL", "0");
    a("msm8960_x", "MultiMedia1 Mixer VOC_REC_UL", "0");
    a("msm8974", "MultiMedia1 Mixer VOC_REC_DL", "1");
    a("msm8974", "MultiMedia1 Mixer VOC_REC_UL", "1");
    a("msm8974", "DEC5 Volume", "40");
    a("msm8974", "DEC4 Volume", "94");
    a("msm8974", "DEC2 Volume", "40");
    a("msm8974", "ADC2 Volume", "19");
    a("mtk6732", "Audio IRQ1 CNT", "0");
    a("mtk6732", "Audio IRQ2 CNT", "0");
    a("omap4", "Voice Capture Mixer Capture", "1");
    a("omap4", "Capture Mixer Voice Capture", "1");
    a("omap4", "VXREC Voice UL Volume", "135");
    a("omap4", "VXREC Voice DL Volume", "135");
    a("omap4", "AUDUL Voice UL Volume", "120");
    a("omap4", "AUDUL Voice DL Volume", "0");
    a("omap4", "MUX_UL10", "VX Left");
    a("omap4", "MUX_UL11", "VX Right");
    a("omap_v1", "Voice Capture Mixer Capture", "1");
    a("omap_v1", "Capture Mixer Voice Capture", "1");
    a("omap_v1", "VXREC Voice UL Volume", "135");
    a("omap_v1", "VXREC Voice DL Volume", "120");
    a("omap_v1", "AUDUL Voice UL Volume", "120");
    a("omap_v1", "AUDUL Voice DL Volume", "0");
    a("omap_v1", "MUX_UL10", "VX Left");
    a("omap_v1", "MUX_UL11", "VX Right");
    a("omap4_v2", "Voice Capture Mixer Capture", "1");
    a("omap4_v2", "Capture Mixer Voice Capture", "1");
    a("omap4_v2", "VXREC Voice UL Volume", "120");
    a("omap4_v2", "VXREC Voice DL Volume", "120");
    a("omap4_v2", "AUDUL Voice UL Volume", "120");
    a("omap4_v2", "AUDUL Voice DL Volume", "0");
    a("omap4_v2", "BT UL Volume", "120");
    a("omap4_v2", "MUX_UL00", "VX Left");
    a("omap4_v2", "MUX_UL01", "VX Left");
    a("omap4_x", "Voice Capture Mixer Capture", "0");
    a("omap4_x", "Capture Mixer Voice Capture", "0");
    a("tegra_v1", "Pcm Capture Route", "131072");
    a("tegra_v1", "Call Mode Switch", "0");
    a("tegra_v1", "Capture", "220");
    a("tegra_v1", "Capture MIC Path", "Voice");
    a("tegra_v2", "Pcm Capture Route", "8");
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    b localb = new com/krecorder/call/alsa/b;
    localb.<init>(this, paramString2, paramString3);
    Object localObject = get(paramString1);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      put(paramString1, localObject);
    }
    ((List)get(paramString1)).add(localb);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/alsa/AlsaMixerMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */