package cordova_plugin_simplecalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * This class echoes a string called from JavaScript.
 */
public class SimpleCalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // if (action.equals("coolMethod")) {
        //     String message = args.getString(0);
        //     this.coolMethod(message, callbackContext);
        //     return true;
        // }
        if (action.equals("addMethod")) {
           // String message = args.getString(0);
            this.addMethod(args, callbackContext);
            return true;
        }
        if (action.equals("subMethod")) {
           // String message = args.getString(0);
            this.subMethod(args, callbackContext);
            return true;
        }
        if (action.equals("mulMethod")) {
           // String message = args.getString(0);
            this.mulMethod(args, callbackContext);
            return true;
        }
        if (action.equals("divMethod")) {
           // String message = args.getString(0);
            this.divMethod(args, callbackContext);
            return true;
        }
        return false;
    }

    private void addMethod(JSONArray args, CallbackContext callback) {
        if(args != null){
            try
            {
                 int p1 = Integer.parseInt(args.getString(0));
                 int p2 = Integer.parseInt(args.getString(1));
                 //int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                 callback.success("ADD : " + (p1+p2) );
                // callback.success("success result");
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

     private void subMethod(JSONArray args, CallbackContext callback) {
        if(args != null){
            try
            {
                 int p1 = Integer.parseInt(args.getString(0));
                 int p2 = Integer.parseInt(args.getString(1));
                 //int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                 callback.success("SUB : " + (p1-p2) );
                // callback.success("success result");
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

     private void mulMethod(JSONArray args, CallbackContext callback) {
        if(args != null){
            try
            {
                 int p1 = Integer.parseInt(args.getString(0));
                 int p2 = Integer.parseInt(args.getString(1));
                 //int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                 callback.success("MUL : " + (p1*p2) );
                // callback.success("success result");
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

     private void divMethod(JSONArray args, CallbackContext callback) {
        if(args != null){
            try
            {
                 int p1 = Integer.parseInt(args.getString(0));
                 int p2 = Integer.parseInt(args.getString(1));
                 //int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                 callback.success("DIV : " + (p1/p2) );
                // callback.success("success result");
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
