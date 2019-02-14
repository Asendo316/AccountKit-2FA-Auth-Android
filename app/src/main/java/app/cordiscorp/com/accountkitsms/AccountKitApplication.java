package app.cordiscorp.com.accountkitsms;

import android.app.Application;

import com.facebook.accountkit.AccountKit;

/**
 * Created by Ibkunle Adeoluwa on 2/14/2019.
 */
public class AccountKitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AccountKit.initialize(getApplicationContext());

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable e) {
                handleUncaughtException(thread, e);
            }
        });
    }

    public void handleUncaughtException(Thread thread, Throwable e) {
        e.printStackTrace(); // not all Android versions will print the stack trace automatically

        System.exit(1); // kill off the crashed app
    }

}