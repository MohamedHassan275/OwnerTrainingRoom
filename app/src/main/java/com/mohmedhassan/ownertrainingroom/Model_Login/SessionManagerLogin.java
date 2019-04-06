package com.mohmedhassan.ownertrainingroom.Model_Login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.mohmedhassan.ownertrainingroom.HomeScreen.HomeScreenActivity;
import com.mohmedhassan.ownertrainingroom.Login.LoginActivity;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class SessionManagerLogin {

    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    private static SessionManagerLogin mInstance;
    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "UserSession";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // UserRoomTraining name (make variable public to access from outside)
    public static final String KEY_ID = "user_id";

    // UserRoomTraining name (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    // UserRoomTraining Name (make variable public to access from outside)
    public static final String KEY_PASSWORD = "password";

    // UserRoomTraining Name (make variable public to access from outside)

    public SessionManagerLogin(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public static synchronized SessionManagerLogin getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SessionManagerLogin(context);
        }
        return mInstance;
    }
    // Get Login State
    public int  getUserId(){
        return pref.getInt(KEY_ID, 0);
    }


    // Get Login State
    public String  getEmail(){
        return pref.getString(KEY_EMAIL, "no email");
    }


    // Get Login State
    public String  getPassword(){
        return pref.getString(KEY_PASSWORD, "no password");
    }




    /**
     * Create login session
     * */
    public void createLoginSession(UserLogin user){

        SharedPreferences sharedPreferences = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);
        editor.putInt(KEY_ID, user.getId());
        editor.putString(KEY_EMAIL, user.getEmail());
        editor.apply();


        //QueryUtils.removeCartItems( _context, null);
    }

    /**
     * Create login session
     * */




    public void checkLogin(){
        // Check login status
        if(this.isLoggedIn()){

            // user is logged in redirect him to Main Activity
            Intent i = new Intent(_context, HomeScreenActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            _context.startActivity(i);

        }else {
            // user is not logged in redirect him to Login Activity
            Intent i = new Intent(_context, LoginActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            _context.startActivity(i);

        }

    }

    /**
     * Clear session details
     * */
    public void logoutUser(){


        //QueryUtils.removeCartItems( _context, null);

        // Clearing all data from Shared Preferences
        editor.clear();
        editor.putBoolean(IS_LOGIN, false);
        editor.commit();

    }

    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }

}

