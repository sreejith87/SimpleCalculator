package cordova_plugin_simplecalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdvanceCalculator
{
    public void powMethod(JSONArray args, CallbackContext callback) {
        if(args != null){
            try
            {
                 int p1 = Integer.parseInt(args.getString(0));
                 callback.success("Power 2 : " + (p1*p1) );
            }
            catch(Exception ex)
            {
                callback.success("ex... " + ex);
            }
        }
        else
        {
            callback.error("Dont pass null values");
        }
    }
}