package crimeradar.example.com.crimeradar;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GeoWatchService extends Service {
    public GeoWatchService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        //TODO for communication return IBinder implementation
        return null;
    }
}
