package de.derandroidpro.ratingbartutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    RatingBar rb1;
    TextView tv1;
    float userrating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RatingBar) findViewById( R.id.ratingBar);
        rb1.setNumStars(6);
        rb1.setStepSize((float)1);
        rb1.setRating(5);
        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            userrating= rb1.getRating();

                if(userrating == 0){

                    rb1.setRating(1);

                }
                if(userrating == 1){
                    tv1.setText("Sehr schlecht (1 Stern)");
                }
                if(userrating == 2){
                    tv1.setText("Schlecht (2 Sterne)");
                }
                if(userrating == 3){
                    tv1.setText("Nicht so gut (3 Sterne)");
                }
                if(userrating == 4){
                    tv1.setText("In Ordnung (4 Sterne)");
                }
                if(userrating == 5){
                    tv1.setText("Gut (5 Sterne)");
                }
                if(userrating == 6){
                    tv1.setText("Sehr gut (6 Sterne)");
                }




            }
        });



        tv1 = (TextView) findViewById(R.id.textView);
    }





}
