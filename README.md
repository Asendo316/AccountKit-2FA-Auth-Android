# AccountKit-2FA-Auth-Android
This is a demo project showing the implementation of Facebook Account KIT API for 2 factor password-less login on android with SMS token generation and Email Authorization

## Prerequisites 
* Login to facebook with a developers account https://developers.facebook.com/
* Create a new application accountKit and setup application preferences with account kit login'
* Create account in accountKit https://www.accountkit.com/
* For documentation on account kit usage on android https://developers.facebook.com/docs/accountkit/android

## Bulding the application
* In the Strings.xml, Replace the fields in **[ ]** with the correct details from the new facebook application you have created
```
<resources>
    <string name="app_name">AccountKitSMS</string>
    <string name="FACEBOOK_APP_ID">[YOUR FACEBOOK_APP_ID]</string>
    <string name="ak_login_protocol_scheme">ak[YOUR FACEBOOK_APP_ID]</string>
    <string name="ACCOUNT_KIT_CLIENT_TOKEN">[YOUR ACCOUNT_KIT_CLIENT_TOKEN]</string>
</resources>
```
* Run the application 
* Select **Login with SMS** and provide mobile number to generate OTP for login
* Select **Login with Email** and select the email address to recieve an email verfication and login link
