package com.example.rohit.moviereviewapplication;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MovieReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_review);
    }



    public void Rating_Bar(View view)
    {
        RatingBar r=(RatingBar)findViewById(R.id.Rating_bar_ID);
       String s= String.valueOf(r.getNumStars());
        TextView t=(TextView)findViewById(R.id.Rating_NumStars_ID);
        t.setText(s);
        Toast.makeText(this, String.format("Your Rating: %s", s),Toast.LENGTH_LONG).show();
    }


}
