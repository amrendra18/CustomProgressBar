package com.example.customprogressbar;

import com.example.customprogressbar.CustomProgressBar.Style;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {
    CustomProgressBar pb1, pb2, pb3, pb4, pb5, pb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1 = (CustomProgressBar) findViewById(R.id.CustomProgressBar1);
        pb2 = (CustomProgressBar) findViewById(R.id.CustomProgressBar2);
        pb3 = (CustomProgressBar) findViewById(R.id.CustomProgressBar3);
        pb4 = (CustomProgressBar) findViewById(R.id.CustomProgressBar4);
        pb5 = (CustomProgressBar) findViewById(R.id.CustomProgressBar5);
        pb6 = (CustomProgressBar) findViewById(R.id.CustomProgressBar6);

        // pb1.setVisibility(View.INVISIBLE);
        // pb2.setVisibility(View.INVISIBLE);
        // pb3.setVisibility(View.INVISIBLE);
        // pb4.setVisibility(View.INVISIBLE);
        // pb5.setVisibility(View.INVISIBLE);
        // pb6.setVisibility(View.INVISIBLE);

        // REGULAR
        pb1.setStartAngle(270);
        pb1.setProgressRingBackgroundColor("#DFDFDF");
        pb1.setProgressRingForegroundColor("#2C98C1");
        pb1.setCenterBackgroundColor("#213051");
        pb1.setStyle(Style.REGULAR);// Default style
        pb1.setVisibility(View.VISIBLE);

        // REGULAR can be tweaked
        pb2.setStartAngle(180);
        pb2.setRingRadiusRatio(0.75f);
        pb2.setTextColor(Color.WHITE);
        pb2.setStyle(Style.REGULAR);// Default style
        pb2.setProgressRingBackgroundColor(Color.TRANSPARENT);
        pb2.setProgressRingForegroundColor("#e300fc");
        pb2.setCenterBackgroundColor("#213051");
        pb2.setVisibility(View.VISIBLE);

        // HOLLOW
        pb3.setStartAngle(90);
        pb3.setRingRadiusRatio(0.65f);
        pb3.setTextSize(20);
        pb3.setTextColor(Color.BLACK);
        pb3.setStyle(Style.HOLLOW);
        pb3.setVisibility(View.VISIBLE);

        // PIE
        pb4.setStartAngle(0);
        pb4.setTextSize(32);//
        // pb4.setDisplayProgressPercentage(false); // can be used
        pb4.setProgressRingBackgroundColor(Color.LTGRAY);
        pb4.setProgressRingForegroundColor(Color.BLACK);
        // centerBackgroundColor doesnt effect this style
        pb4.setStyle(Style.PIE);
        pb4.setVisibility(View.VISIBLE);

        // PIE_OUTER
        pb5.setStartAngle(0);// Default
        pb5.setRingRadiusRatio(0.80f);
        pb5.setTextSize(18);
        pb5.setCenterBackgroundColor("#fcd200");
        pb5.setProgressRingForegroundColor("#fc8200");
        pb5.setProgressRingBackgroundColor("#213051"); // wont affect this style
        pb5.setTextColor(Color.BLUE);
        pb5.setStyle(Style.PIE_OUTER);
        pb5.setVisibility(View.VISIBLE);

        // PIE_INNER
        pb6.setStartAngle(180);
        pb6.setRingRadiusRatio(0.90f);
        pb6.setTextSize(26);
        pb6.setTextColor(Color.WHITE);
        pb6.setCenterBackgroundColor("#001dfc");
        pb6.setProgressRingForegroundColor("#a3cbf7");
        // pb6.setProgressRingBackgroundColor(Color.TRANSPARENT); // doesnt
        // affect this style
        pb6.setStyle(Style.PIE_INNER);
        pb6.setVisibility(View.VISIBLE);

        new ShowProgress().execute();
    }

    class ShowProgress extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            int i = 0;
            while (true) {
                publishProgress(i);
                if (i >= 100) {
                    break;
                }
                i++;
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            pb1.setProgress(0);
            pb2.setProgress(0);
            pb3.setProgress(0);
            pb4.setProgress(0);
            pb5.setProgress(0);
            pb6.setProgress(0);
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            pb1.setProgress(values[0]);
            pb2.setProgress(values[0]);
            pb3.setProgress(values[0]);
            pb4.setProgress(values[0]);
            pb5.setProgress(values[0]);
            pb6.setProgress(values[0]);
        }

        @Override
        protected void onCancelled(Void result) {
            super.onCancelled(result);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
