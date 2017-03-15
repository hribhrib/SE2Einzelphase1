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
    // do something when the button is clicked
        output.setText(inputDividend.getText());

    }
}
