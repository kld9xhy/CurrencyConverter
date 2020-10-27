package com.cornk.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private EditText from;
    private TextView to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        from = (EditText) findViewById(R.id.InputEditText);
        to = (TextView) findViewById(R.id.OutputTextView);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list1 = new ArrayList<String>();
        list1.add("VNĐ");
        list1.add("USD");
        list1.add("EUR");
        list1.add("JPY");
        list1.add("KRW");
        list1.add("RUB");
        list1.add("CAD");
        list1.add("HKD");
        list1.add("RMB");
        list1.add("SGD");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list2 = new ArrayList<String>();
        list2.add("VNĐ");
        list2.add("USD");
        list2.add("EUR");
        list2.add("JPY");
        list2.add("KRW");
        list2.add("RUB");
        list2.add("CAD");
        list2.add("HKD");
        list2.add("RMB");
        list2.add("SGD");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
    }
    public void onClick(View v) {

        int index1 = spinner1.getSelectedItemPosition();
        int index2 = spinner2.getSelectedItemPosition();
        float value = Float.parseFloat(from.getText().toString());

        float ratio[] = {23060.00f, 1.0f, 0.85f, 104.45f, 1128.05f, 76.95f, 1.32f, 7.75f, 6.71f, 1.36f};
        float result = value / ratio[index1] * ratio[index2];
        to.setText(result + "");
    }
}