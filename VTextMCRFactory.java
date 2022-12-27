//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package vText;

import com.mathworks.toolbox.javabuilder.MWComponentOptions;
import com.mathworks.toolbox.javabuilder.MWCtfClassLoaderSource;
import com.mathworks.toolbox.javabuilder.MWCtfExtractLocation;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.internal.MWMCR;

public class VTextMCRFactory {
    private static final String sComponentId = "vText_4E95529C8306B5E4FE1D03066F059DCE";
    private static final String sComponentName = "vText";
    private static final MWComponentOptions sDefaultComponentOptions;

    private VTextMCRFactory() {
    }

    public static MWMCR newInstance(MWComponentOptions var0) throws MWException {
        if (null == var0.getCtfSource()) {
            var0 = new MWComponentOptions(var0);
            var0.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }

        return MWMCR.newInstance(var0, VTextMCRFactory.class, "vText", "vText_4E95529C8306B5E4FE1D03066F059DCE", new int[]{7, 14, 0});
    }

    public static MWMCR newInstance() throws MWException {
        return newInstance(sDefaultComponentOptions);
    }

    static {
        sDefaultComponentOptions = new MWComponentOptions(new Object[]{MWCtfExtractLocation.EXTRACT_TO_CACHE, new MWCtfClassLoaderSource(VTextMCRFactory.class)});
    }
}

