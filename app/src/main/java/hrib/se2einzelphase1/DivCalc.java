package hrib.se2einzelphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DivCalc extends AppCompatActivity {

    EditText inputDividend;
    EditText inputDivosor;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div_calc);

        inputDividend = (EditText) findViewById(R.id.inputDividend);
        inputDivosor = (EditText) findViewById(R.id.inputDivisor);
        output = (TextView) findViewById(R.id.output);
    }

    public void onClickDividieren(View v) {
        try {
            double dividend = Double.parseDouble(String.valueOf(inputDividend.getText()));
            double divisor = Double.parseDouble(String.valueOf(inputDivosor.getText()));

            if (dividend == 0 || divisor == 0) {
                output.setText("Bitte Zahlen <> 0");
            } else {
                output.setText("" + (dividend / divisor));
            }
        } catch (Exception e){
                output.setText("Bitte beide Zahlen eintragen");
        }

    }
}
