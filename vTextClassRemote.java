//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package vText;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.rmi.RemoteException;

public interface vTextClassRemote extends Poolable {
    Object[] autoDetect(int var1, Object... var2) throws RemoteException;

    Object[] autoDetectWrite(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected10s(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected10s10k(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected10sPartial(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected10sTime(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected5s(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected5s10k(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected5sPartial(int var1, Object... var2) throws RemoteException;

    Object[] compareDetected5sTime(int var1, Object... var2) throws RemoteException;

    Object[] complexmodulus(int var1, Object... var2) throws RemoteException;

    Object[] dataAcq(int var1, Object... var2) throws RemoteException;

    Object[] dataAcq10s(int var1, Object... var2) throws RemoteException;

    Object[] dataAcqXs(int var1, Object... var2) throws RemoteException;

    Object[] filterbgnoise(int var1, Object... var2) throws RemoteException;

    Object[] recognize(int var1, Object... var2) throws RemoteException;

    Object[] recognize10s(int var1, Object... var2) throws RemoteException;

    Object[] recognizePartial(int var1, Object... var2) throws RemoteException;

    Object[] recognizePartial10k(int var1, Object... var2) throws RemoteException;

    Object[] setEventMagnitude(int var1, Object... var2) throws RemoteException;

    Object[] setupListener(int var1, Object... var2) throws RemoteException;

    Object[] timedomain(int var1, Object... var2) throws RemoteException;

    Object[] viewWave(int var1, Object... var2) throws RemoteException;

    Object[] VoiceEventClass(int var1, Object... var2) throws RemoteException;

    Object[] VoiceEventDataClass(int var1, Object... var2) throws RemoteException;

    void dispose() throws RemoteException;
}

