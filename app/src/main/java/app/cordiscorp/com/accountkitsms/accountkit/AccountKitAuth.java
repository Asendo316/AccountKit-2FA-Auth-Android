package app.cordiscorp.com.accountkitsms.accountkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;


/**
 * Created by Ibkunle Adeoluwa on 2/14/2019.
 */
public class AccountKitAuth {
    public static int APP_REQUEST_CODE = 99;


    public static void phoneLogin(View view, Context context, Activity activity) {
        final Intent intent = new Intent(context, AccountKitActivity.class);
        AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
                new AccountKitConfiguration.AccountKitConfigurationBuilder(
                        LoginType.PHONE,
                        AccountKitActivity.ResponseType.CODE); // or .ResponseType.TOKEN
        // ... perform additional configuration ...
        intent.putExtra(
                AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
                configurationBuilder.build());
        activity.startActivityForResult(intent, APP_REQUEST_CODE);
    }


    public static void emailLogin(View view, Context context, Activity activity) {
        final Intent intent = new Intent(context, AccountKitActivity.class);
        AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
                new AccountKitConfiguration.AccountKitConfigurationBuilder(
                        LoginType.EMAIL,
                        AccountKitActivity.ResponseType.CODE); // or .ResponseType.TOKEN
        // ... perform additional configuration ...
        intent.putExtra(
                AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
                configurationBuilder.build());
        activity.startActivityForResult(intent, APP_REQUEST_CODE);
    }
}
