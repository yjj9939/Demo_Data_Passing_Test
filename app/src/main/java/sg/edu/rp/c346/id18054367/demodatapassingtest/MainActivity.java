package sg.edu.rp.c346.id18054367.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassCharacter;
    TextView tvPassDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassCharacter = findViewById(R.id.buttonPassChar);
        tvPassDouble = findViewById(R.id.textViewPassDouble);

        btnPassInteger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }

        });

        btnPassCharacter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value",'a');
                startActivity(intent);
            }

        });

        tvPassDouble.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }

        });
    }
}
