package mollie.steven.frieten.helpers;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by steve on 3/01/2018.
 */

public class PrefManager {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    Context _context;

    //shared pref mode
    int PRIVATE_MODE = 0;

    //Shared prefs file name
    private static final String PREF_NAME = "frieten.pref";

    //first time launch
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context){
        this._context = context;
        prefs = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = prefs.edit();
    }

    public void setIsFirstTimeLaunch(boolean isFirstTimeLaunch){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTimeLaunch);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return prefs.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
