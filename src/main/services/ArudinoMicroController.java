package services;
import exceptions.PMVPhisicalException;
import exceptions.ConnectException;
import exceptions.ProceduralException;


public interface ArudinoMicroController {
    public void setBTconnection ()
            throws ConnectException;

    public void startDriving ()
            throws PMVPhisicalException, ConnectException, ProceduralException;

    public void stopDriving ()
            throws PMVPhisicalException, ConnectException, ProceduralException;

    public void undoBTconnection ();
}
