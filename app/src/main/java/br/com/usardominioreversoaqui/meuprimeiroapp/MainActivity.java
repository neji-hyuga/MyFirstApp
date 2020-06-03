package br.com.usardominioreversoaqui.meuprimeiroapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressedButton(View view) {
        TextView answerTextView = findViewById(R.id.text_answer_id);
        EditText inputText = findViewById(R.id.text_input_id);

        answerTextView.setText("a idade é " + inputText.getText());

        Toast.makeText(this,
                "do you wanna try again?",
                Toast.LENGTH_SHORT).show();
    }
}
