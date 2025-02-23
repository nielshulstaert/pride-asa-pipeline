package com.compomics.pride_asa_pipeline.core.logic.inference.modification;

/**
 *
 * @author Kenneth Verheggen
 */
public enum QuantMethod {
ITRAQ_QUANTIFIED, 
TMT_QUANTIFIED, 
O18_QUANTIFIED(258), 
AQUA_QUANTIFIED, 
ICAT_QUANTIFIED, 
ICPL_QUANTIFIED, 
SILAC_QUANTIFIED, 
TIC_QUANTIFIED, 
SILAC_HEAVY_REAGENT(259,267),
SILAC_MEDIUM_REAGENT,
SILAC_LIGHT_REAGENT,
ICAT_HEAVY_REAGENT,
ICAT_LIGHT_REAGENT, 
ICPL_0_REAGENT(365), 
ICPL_4_REAGENT(687), 
ICPL_6_REAGENT(364), 
ICPL_10_REAGENT(866), 
ITRAQ_113_REAGENT(730), 
ITRAQ_114_REAGENT(532,730), 
ITRAQ_115_REAGENT(533,731), 
ITRAQ_116_REAGENT(730), 
ITRAQ_117_REAGENT(730), 
ITRAQ_118_REAGENT(731), 
ITRAQ_119_REAGENT(731), 
ITRAQ_121_REAGENT(731), 
TMT_126_REAGENT, 
TMT_127_REAGENT, 
TMT_128_REAGENT, 
TMT_129_REAGENT, 
TMT_130_REAGENT, 
TMT_131_REAGENT;

   
    
    
    private final int[] unimodIDs;

    private QuantMethod(int... unimodIDs) {
        this.unimodIDs = unimodIDs;
    }
    
    public int[] getAssociatedPSINames(){
        return unimodIDs;
    }
}
