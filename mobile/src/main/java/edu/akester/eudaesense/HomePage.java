package edu.akester.eudaesense;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {
    private static final String TAG = "HomePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        ImageView iv = (ImageView)findViewById(R.id.homePageImage);
        iv.setImageResource(R.drawable.homescreen);

        Button button1 = (Button)findViewById(R.id.Charm);
        button1.setBackgroundColor(Color.TRANSPARENT);
        button1.setTextColor(Color.TRANSPARENT);

        Button button2 = (Button)findViewById(R.id.Dandelions);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button2.setTextColor(Color.TRANSPARENT);

        Button button3 = (Button)findViewById(R.id.Perspective);
        button3.setBackgroundColor(Color.TRANSPARENT);
        button3.setTextColor(Color.TRANSPARENT);

        Button button4 = (Button)findViewById(R.id.Reminder);
        button4.setBackgroundColor(Color.TRANSPARENT);
        button4.setTextColor(Color.TRANSPARENT);

        Button button5 = (Button)findViewById(R.id.ToDo);
        button5.setBackgroundColor(Color.TRANSPARENT);
        button5.setTextColor(Color.TRANSPARENT);
    }

    //On click function
    public void charm(View view) {
        Log.d(TAG, "charm");
        Intent intent = new Intent(this, CharmPage.class);
        startActivity(intent);
    }

    //On click function
    public void dandelions(View view) {
        Log.d(TAG, "dandelions");
        Intent intent = new Intent(this, DandelionsPage.class);
        startActivity(intent);
    }

    //On click function
    public void perspective(View view) {
        Log.d(TAG, "perspective");
        Intent intent = new Intent(this, PerspectivePage.class);
        startActivity(intent);
    }

    //On click function
    public void reminder(View view) {
        Log.d(TAG, "reminder");
        Intent intent = new Intent(this, ReminderPage.class);
        startActivity(intent);
    }

    //On click function
    public void todo(View view) {
        Log.d(TAG, "todo");
        Intent intent = new Intent(this, ToDoPage.class);
        startActivity(intent);
    }

}
