package sg.edu.rp.c346.id21010650.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits;
        fruits = new String[3];
        fruits[0]= ("apple");
        fruits[1]= ("banana");
        fruits[2]= ("cherry");

        String text = "Fruits\n";
        text +=  "=====\n";

        System.out.println(text);


    }
}
