package com.google.android.gms.samples.vision.amazingocr;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class about extends AppCompatActivity {

    TextView a1,b1,b2,c1,c2,a2,d1,d2,d3,d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
//        a1=(TextView)findViewById(R.id.textView);
//        a1.setPaintFlags(a1.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
//        b1=(TextView)findViewById(R.id.textView1);
//        b2=(TextView)findViewById(R.id.textView2);
//        c1=(TextView)findViewById(R.id.textView3);
//        c2=(TextView)findViewById(R.id.textView4);
//        a2=(TextView)findViewById(R.id.textView5);
//        a2.setPaintFlags(a2.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
//        d1=(TextView)findViewById(R.id.textView6);
//        d2=(TextView)findViewById(R.id.textView7);
//        d3=(TextView)findViewById(R.id.textView8);
//        d4=(TextView)findViewById(R.id.textView9);


        TextView textViewMubin = (TextView) findViewById(R.id.textViewMubin);
        textViewMubin.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/detail_view_text.ttf"));

        TextView buttonAppDeveloper = (TextView) findViewById(R.id.textViewAppDeveloper);
        buttonAppDeveloper.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/detail_view_text.ttf"));

        TextView rollTextDeveloper = (TextView) findViewById(R.id.rollTextDeveloper);
        rollTextDeveloper.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/listitem_name.ttf"));

        TextView textViewTawhid = (TextView) findViewById(R.id.textViewTawhid);
        textViewTawhid.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/detail_view_text.ttf"));

        TextView textViewAppDesigner = (TextView) findViewById(R.id.textViewAppDesigner);
        textViewAppDesigner.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/detail_view_text.ttf"));

        TextView rollTextDesigner = (TextView) findViewById(R.id.rollTextDesigner);
        rollTextDesigner.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/listitem_name.ttf"));


        // buttons for mubin986

        Button buttonFBmubin;

        buttonFBmubin = (Button) findViewById(R.id.buttonFBmubin);
        buttonFBmubin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchFBmubin();
            }
        });


        Button buttonTWITTERmubin;

        buttonTWITTERmubin = (Button) findViewById(R.id.buttonTWITTERmubin);
        buttonTWITTERmubin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchTWITTERmubin();
            }
        });


        Button buttonWEBmubin;

        buttonWEBmubin = (Button) findViewById(R.id.buttonWEBmubin);
        buttonWEBmubin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mojargonit.com")));
            }
        });




        Button buttonFBmubinSmall;

        buttonFBmubinSmall = (Button) findViewById(R.id.buttonFBmubinSmall);
        buttonFBmubinSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchFBmubin();
            }
        });


        Button buttonTWITTERmubinSmall;

        buttonTWITTERmubinSmall = (Button) findViewById(R.id.buttonTWITTERmubinSmall);
        buttonTWITTERmubinSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchTWITTERmubin();
            }
        });


        Button buttonWEBmubinSmall;

        buttonWEBmubinSmall = (Button) findViewById(R.id.buttonWEBmubinSmall);
        buttonWEBmubinSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mojargonit.com")));
            }
        });











        // buttons for tjoarder90

        Button buttonFBtawhid;

        buttonFBtawhid = (Button) findViewById(R.id.buttonFBtawhid);
        buttonFBtawhid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchFBtawhid();
            }
        });


        Button buttonTWITTERtawhid;

        buttonTWITTERtawhid = (Button) findViewById(R.id.buttonTWITTERtawhid);
        buttonTWITTERtawhid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchTWITTERtawhid();
            }
        });


        Button buttonWEBtawhid;

        buttonWEBtawhid = (Button) findViewById(R.id.buttonWEBtawhid);
        buttonWEBtawhid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://shovo.crevado.com")));
            }
        });




        Button buttonFBtawhidSmall;

        buttonFBtawhidSmall = (Button) findViewById(R.id.buttonFBtawhidSmall);
        buttonFBtawhidSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchFBtawhid();
            }
        });


        Button buttonTWITTERtawhidSmall;

        buttonTWITTERtawhidSmall = (Button) findViewById(R.id.buttonTWITTERtawhidSmall);
        buttonTWITTERtawhidSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                launchTWITTERtawhid();
            }
        });


        Button buttonWEBtawhidSmall;

        buttonWEBtawhidSmall = (Button) findViewById(R.id.buttonWEBtawhidSmall);
        buttonWEBtawhidSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://shovo.crevado.com")));
            }
        });
    }


    //social media direct links // mubin986
    public final void launchTWITTERmubin() {


        try
        {
            // Check if the Twitter app is installed on the phone.
            getPackageManager().getPackageInfo("com.twitter.android", 0);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setClassName("com.twitter.android", "com.twitter.android.ProfileActivity");
            // Don't forget to put the "L" at the end of the id.
            intent.putExtra("user_id", 269609470L);
            startActivity(intent);
        }
        catch (PackageManager.NameNotFoundException e)
        {
            // If Twitter app is not installed, start browser.
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/mubin986")));
        }


    }



    public final void launchFBmubin() {
        final String urlFb = "fb://profile/"+"100001613545364";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        // If a Facebook app is installed, use it. Otherwise, launch
        // a browser
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {
            final String urlBrowser = "https://www.facebook.com/"+"100001613545364";
            intent.setData(Uri.parse(urlBrowser));
        }

        startActivity(intent);
    }




    //social media direct links // tjoarder90
    public final void launchTWITTERtawhid() {


        try
        {
            // Check if the Twitter app is installed on the phone.
            getPackageManager().getPackageInfo("com.twitter.android", 0);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setClassName("com.twitter.android", "com.twitter.android.ProfileActivity");
            // Don't forget to put the "L" at the end of the id.
            intent.putExtra("user_id", 2931903198L);
            startActivity(intent);
        }
        catch (PackageManager.NameNotFoundException e)
        {
            // If Twitter app is not installed, start browser.
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/leonelshovo")));
        }


    }



    public final void launchFBtawhid() {
        final String urlFb = "fb://profile/"+"100002554590105";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        // If a Facebook app is installed, use it. Otherwise, launch
        // a browser
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {
            final String urlBrowser = "https://www.facebook.com/"+"100002554590105";
            intent.setData(Uri.parse(urlBrowser));
        }

        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

}
