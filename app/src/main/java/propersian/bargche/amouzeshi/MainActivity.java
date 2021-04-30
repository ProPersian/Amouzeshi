package propersian.bargche.amouzeshi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView textView;
    private ViewGroup.LayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createIranFlag();
    }

    private void createIranFlag() {

        linearLayout = findViewById(R.id.content);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.setBackgroundColor(Color.BLACK);

        //int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        //int height = LinearLayout.LayoutParams.WRAP_CONTENT;

        int width = 300;
        int height = 50;
        params = new LinearLayout.LayoutParams(width, height);

        //firstTextView
        textView = new TextView(getApplicationContext());
        textView.setLayoutParams(params);
        textView.setText("");
        textView.setBackgroundColor(Color.GREEN);
        linearLayout.addView(textView);

        //secondTextView
        textView = new TextView(getApplicationContext());
        textView.setLayoutParams(params);
        textView.setText("( ( | ) )");
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundColor(Color.WHITE);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(20);
        linearLayout.addView(textView);

        //thirdTextView
        textView = new TextView(getApplicationContext());
        textView.setLayoutParams(params);
        textView.setText("");
        textView.setBackgroundColor(Color.RED);
        linearLayout.addView(textView);

    }
}