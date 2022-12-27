//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package vText;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.MWComponentInstance;
import com.mathworks.toolbox.javabuilder.internal.MWFunctionSignature;
import com.mathworks.toolbox.javabuilder.internal.MWMCR;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class vTextClass extends MWComponentInstance<vTextClass> {
    private static final Set<Disposable> sInstances = new HashSet();
    private static final MWFunctionSignature sAutoDetectSignature = new MWFunctionSignature(1, false, "autoDetect", 8, false);
    private static final MWFunctionSignature sAutoDetectWriteSignature = new MWFunctionSignature(1, false, "autoDetectWrite", 3, false);
    private static final MWFunctionSignature sCompareDetected10sSignature = new MWFunctionSignature(1, false, "compareDetected10s", 3, false);
    private static final MWFunctionSignature sCompareDetected10s10kSignature = new MWFunctionSignature(1, false, "compareDetected10s10k", 3, false);
    private static final MWFunctionSignature sCompareDetected10sPartialSignature = new MWFunctionSignature(1, false, "compareDetected10sPartial", 3, false);
    private static final MWFunctionSignature sCompareDetected10sTimeSignature = new MWFunctionSignature(1, false, "compareDetected10sTime", 3, false);
    private static final MWFunctionSignature sCompareDetected5sSignature = new MWFunctionSignature(1, false, "compareDetected5s", 3, false);
    private static final MWFunctionSignature sCompareDetected5s10kSignature = new MWFunctionSignature(1, false, "compareDetected5s10k", 3, false);
    private static final MWFunctionSignature sCompareDetected5sPartialSignature = new MWFunctionSignature(1, false, "compareDetected5sPartial", 3, false);
    private static final MWFunctionSignature sCompareDetected5sTimeSignature = new MWFunctionSignature(1, false, "compareDetected5sTime", 3, false);
    private static final MWFunctionSignature sComplexmodulusSignature = new MWFunctionSignature(1, false, "complexmodulus", 1, false);
    private static final MWFunctionSignature sDataAcqSignature = new MWFunctionSignature(1, false, "dataAcq", 1, false);
    private static final MWFunctionSignature sDataAcq10sSignature = new MWFunctionSignature(1, false, "dataAcq10s", 1, false);
    private static final MWFunctionSignature sDataAcqXsSignature = new MWFunctionSignature(1, false, "dataAcqXs", 2, false);
    private static final MWFunctionSignature sFilterbgnoiseSignature = new MWFunctionSignature(1, false, "filterbgnoise", 2, false);
    private static final MWFunctionSignature sRecognizeSignature = new MWFunctionSignature(1, false, "recognize", 4, false);
    private static final MWFunctionSignature sRecognize10sSignature = new MWFunctionSignature(1, false, "recognize10s", 4, false);
    private static final MWFunctionSignature sRecognizePartialSignature = new MWFunctionSignature(1, false, "recognizePartial", 4, false);
    private static final MWFunctionSignature sRecognizePartial10kSignature = new MWFunctionSignature(1, false, "recognizePartial10k", 4, false);
    private static final MWFunctionSignature sSetEventMagnitudeSignature = new MWFunctionSignature(1, false, "setEventMagnitude", 1, false);
    private static final MWFunctionSignature sSetupListenerSignature = new MWFunctionSignature(1, false, "setupListener", 1, false);
    private static final MWFunctionSignature sTimedomainSignature = new MWFunctionSignature(1, false, "timedomain", 1, false);
    private static final MWFunctionSignature sViewWaveSignature = new MWFunctionSignature(1, false, "viewWave", 1, false);
    private static final MWFunctionSignature sVoiceEventClassSignature = new MWFunctionSignature(1, true, "VoiceEventClass", 1, true);
    private static final MWFunctionSignature sVoiceEventDataClassSignature = new MWFunctionSignature(1, true, "VoiceEventDataClass", 1, true);

    private vTextClass(MWMCR var1) throws MWException {
        super(var1);
        Class var2 = vTextClass.class;
        synchronized(vTextClass.class) {
            sInstances.add((Disposable) this);
        }
    }

    public vTextClass() throws MWException {
        this(VTextMCRFactory.newInstance());
    }

    private static MWComponentOptions getPathToComponentOptions(String var0) {
        MWComponentOptions var1 = new MWComponentOptions(new Object[]{new MWCtfExtractLocation(var0), new MWCtfDirectorySource(var0)});
        return var1;
    }

    /** @deprecated */
    public vTextClass(String var1) throws MWException {
        this(VTextMCRFactory.newInstance(getPathToComponentOptions(var1)));
    }

    public vTextClass(MWComponentOptions var1) throws MWException {
        this(VTextMCRFactory.newInstance(var1));
    }

    public void dispose() {
        boolean var9 = false;

        try {
            var9 = true;
            super.dispose();
            var9 = false;
        } finally {
            if (var9) {
                Class var4 = vTextClass.class;
                synchronized(vTextClass.class) {
                    sInstances.remove(this);
                }
            }
        }

        Class var1 = vTextClass.class;
        synchronized(vTextClass.class) {
            sInstances.remove(this);
        }
    }

    public static void main(String[] var0) {
        try {
            MWMCR var1 = VTextMCRFactory.newInstance();
            var1.runMain(sAutoDetectSignature, var0);
            var1.dispose();
        } catch (Throwable var2) {
            var2.printStackTrace();
        }

    }

    public static void disposeAllInstances() {
        Class var0 = vTextClass.class;
        synchronized(vTextClass.class) {
            Iterator var1 = sInstances.iterator();

            while(var1.hasNext()) {
                Disposable var2 = (Disposable)var1.next();
                var2.dispose();
            }

            sInstances.clear();
        }
    }

    public void autoDetect(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sAutoDetectSignature);
    }

    public void autoDetect(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sAutoDetectSignature);
    }

    public Object[] autoDetect(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sAutoDetectSignature), sAutoDetectSignature);
        return var3;
    }

    public void autoDetectWrite(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sAutoDetectWriteSignature);
    }

    public void autoDetectWrite(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sAutoDetectWriteSignature);
    }

    public Object[] autoDetectWrite(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sAutoDetectWriteSignature), sAutoDetectWriteSignature);
        return var3;
    }

    public void compareDetected10s(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected10sSignature);
    }

    public void compareDetected10s(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected10sSignature);
    }

    public Object[] compareDetected10s(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected10sSignature), sCompareDetected10sSignature);
        return var3;
    }

    public void compareDetected10s10k(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected10s10kSignature);
    }

    public void compareDetected10s10k(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected10s10kSignature);
    }

    public Object[] compareDetected10s10k(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected10s10kSignature), sCompareDetected10s10kSignature);
        return var3;
    }

    public void compareDetected10sPartial(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected10sPartialSignature);
    }

    public void compareDetected10sPartial(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected10sPartialSignature);
    }

    public Object[] compareDetected10sPartial(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected10sPartialSignature), sCompareDetected10sPartialSignature);
        return var3;
    }

    public void compareDetected10sTime(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected10sTimeSignature);
    }

    public void compareDetected10sTime(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected10sTimeSignature);
    }

    public Object[] compareDetected10sTime(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected10sTimeSignature), sCompareDetected10sTimeSignature);
        return var3;
    }

    public void compareDetected5s(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected5sSignature);
    }

    public void compareDetected5s(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected5sSignature);
    }

    public Object[] compareDetected5s(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected5sSignature), sCompareDetected5sSignature);
        return var3;
    }

    public void compareDetected5s10k(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected5s10kSignature);
    }

    public void compareDetected5s10k(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected5s10kSignature);
    }

    public Object[] compareDetected5s10k(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected5s10kSignature), sCompareDetected5s10kSignature);
        return var3;
    }

    public void compareDetected5sPartial(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected5sPartialSignature);
    }

    public void compareDetected5sPartial(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected5sPartialSignature);
    }

    public Object[] compareDetected5sPartial(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected5sPartialSignature), sCompareDetected5sPartialSignature);
        return var3;
    }

    public void compareDetected5sTime(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sCompareDetected5sTimeSignature);
    }

    public void compareDetected5sTime(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sCompareDetected5sTimeSignature);
    }

    public Object[] compareDetected5sTime(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sCompareDetected5sTimeSignature), sCompareDetected5sTimeSignature);
        return var3;
    }

    public void complexmodulus(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sComplexmodulusSignature);
    }

    public void complexmodulus(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sComplexmodulusSignature);
    }

    public Object[] complexmodulus(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sComplexmodulusSignature), sComplexmodulusSignature);
        return var3;
    }

    public void dataAcq(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sDataAcqSignature);
    }

    public void dataAcq(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sDataAcqSignature);
    }

    public Object[] dataAcq(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sDataAcqSignature), sDataAcqSignature);
        return var3;
    }

    public void dataAcq10s(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sDataAcq10sSignature);
    }

    public void dataAcq10s(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sDataAcq10sSignature);
    }

    public Object[] dataAcq10s(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sDataAcq10sSignature), sDataAcq10sSignature);
        return var3;
    }

    public void dataAcqXs(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sDataAcqXsSignature);
    }

    public void dataAcqXs(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sDataAcqXsSignature);
    }

    public Object[] dataAcqXs(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sDataAcqXsSignature), sDataAcqXsSignature);
        return var3;
    }

    public void filterbgnoise(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sFilterbgnoiseSignature);
    }

    public void filterbgnoise(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sFilterbgnoiseSignature);
    }

    public Object[] filterbgnoise(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sFilterbgnoiseSignature), sFilterbgnoiseSignature);
        return var3;
    }

    public void recognize(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sRecognizeSignature);
    }

    public void recognize(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sRecognizeSignature);
    }

    public Object[] recognize(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sRecognizeSignature), sRecognizeSignature);
        return var3;
    }

    public void recognize10s(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sRecognize10sSignature);
    }

    public void recognize10s(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sRecognize10sSignature);
    }

    public Object[] recognize10s(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sRecognize10sSignature), sRecognize10sSignature);
        return var3;
    }

    public void recognizePartial(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sRecognizePartialSignature);
    }

    public void recognizePartial(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sRecognizePartialSignature);
    }

    public Object[] recognizePartial(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sRecognizePartialSignature), sRecognizePartialSignature);
        return var3;
    }

    public void recognizePartial10k(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sRecognizePartial10kSignature);
    }

    public void recognizePartial10k(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sRecognizePartial10kSignature);
    }

    public Object[] recognizePartial10k(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sRecognizePartial10kSignature), sRecognizePartial10kSignature);
        return var3;
    }

    public void setEventMagnitude(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sSetEventMagnitudeSignature);
    }

    public void setEventMagnitude(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sSetEventMagnitudeSignature);
    }

    public Object[] setEventMagnitude(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sSetEventMagnitudeSignature), sSetEventMagnitudeSignature);
        return var3;
    }

    public void setupListener(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sSetupListenerSignature);
    }

    public void setupListener(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sSetupListenerSignature);
    }

    public Object[] setupListener(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sSetupListenerSignature), sSetupListenerSignature);
        return var3;
    }

    public void timedomain(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sTimedomainSignature);
    }

    public void timedomain(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sTimedomainSignature);
    }

    public Object[] timedomain(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sTimedomainSignature), sTimedomainSignature);
        return var3;
    }

    public void viewWave(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sViewWaveSignature);
    }

    public void viewWave(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sViewWaveSignature);
    }

    public Object[] viewWave(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sViewWaveSignature), sViewWaveSignature);
        return var3;
    }

    public void VoiceEventClass(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sVoiceEventClassSignature);
    }

    public void VoiceEventClass(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sVoiceEventClassSignature);
    }

    public Object[] VoiceEventClass(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sVoiceEventClassSignature), sVoiceEventClassSignature);
        return var3;
    }

    public void VoiceEventDataClass(List var1, List var2) throws MWException {
        this.fMCR.invoke(var1, var2, sVoiceEventDataClassSignature);
    }

    public void VoiceEventDataClass(Object[] var1, Object[] var2) throws MWException {
        this.fMCR.invoke(Arrays.asList(var1), Arrays.asList(var2), sVoiceEventDataClassSignature);
    }

    public Object[] VoiceEventDataClass(int var1, Object... var2) throws MWException {
        Object[] var3 = new Object[var1];
        this.fMCR.invoke(Arrays.asList(var3), MWMCR.getRhsCompat(var2, sVoiceEventDataClassSignature), sVoiceEventDataClassSignature);
        return var3;
    }
}
