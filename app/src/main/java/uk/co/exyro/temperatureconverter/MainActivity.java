package uk.co.exyro.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tempCelsius;
    TextView tempFahr;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);

        tempCelsius = findViewById(R.id.etTempCelsius);
        tempFahr = findViewById(R.id.tvTempF);
    }

    public void handleTemperature(View view) {
        Log.d("converterTemperature", "Click sul button");

        //1. read temperature in Celsius
        String temperatureCelsius = tempCelsius.getText().toString();

        Log.d("converterTemperature", "Temperature Celsius = " + temperatureCelsius);

        // 2. Convert temperature from Celsius to Farenheight

        double tempC = Double.parseDouble(temperatureCelsius);
        double tempF = tempC * 1.8 + 32;

        //3. save in the TextView the result in F

        tempFahr.setText(Double.toString(tempF));

    }
}
