package jp.suntech.s21026.myhellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear=findViewById(R.id.btClear);
        Button btClearName=findViewById(R.id.btClearName);
        Button btClearLiv=findViewById(R.id.btClearLiv);

        btClear.setOnClickListener(listener);
        btClearName.setOnClickListener(listener);
        btClearLiv.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etLiv);
            TextView output =findViewById(R.id.tvOutput);
            int id = view.getId();
            switch(id){
                case R.id.btClick:
                    String inputStr=input.getText().toString();
                    String livStr=input2.getText().toString();
                    output.setText(livStr+"にお住いの"+inputStr+"さん、こんにちは！");
                    break;
                case R.id.btClear:
                    input.setText(" ");
                    input2.setText(" ");
                    output.setText(" ");
                    break;
                case R.id.btClearName:
                    input.setText(" ");
                    String livStr2=input2.getText().toString();
                    output.setText(livStr2+"にお住いの さん、こんにちは！");
                    break;
                case R.id.btClearLiv:
                    input2.setText(" ");
                    String inputStr2=input.getText().toString();
                    output.setText("にお住いの"+inputStr2+"さん、こんにちは！");
                    break;
            }

        }

    }
}