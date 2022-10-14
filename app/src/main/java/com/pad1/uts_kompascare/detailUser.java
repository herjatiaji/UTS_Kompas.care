package com.pad1.uts_kompascare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class detailUser extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    String mSpinnerText;
    EditText tanggal;
    Spinner spinner;
    TextView usernem;
    Button btncari;
    public static int umur;
    public static String kategori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user2);
        usernem = findViewById(R.id.tvusername);
        tanggal = findViewById(R.id.tanggal);
        Intent intent = getIntent();
        String message = intent.getStringExtra(loginActivity.MESSAGE_ORDER);
        usernem.setText(message);
        btncari = findViewById(R.id.buttoncari);


        Spinner spinner = findViewById(R.id.label_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.kategorii, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        if (spinner!= null){
            spinner.setOnItemSelectedListener(this);
        }





        tanggal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b == true){
                    showDatePicker();
                }
            }
        });
        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });

        btncari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kategori = spinner.getSelectedItem().toString();
                Intent inten = new Intent(detailUser.this,MainActivity.class);
                startActivity(inten);
            }
        });
    }
    public void showDatePicker(){
        DialogFragment dateFragment = new datePickerFragment();
        dateFragment.show(getSupportFragmentManager(),"date-picker");

    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = month_string + "-" + day_string + "-" + year_string;
        tanggal.setText(dateMessage);
        umur = 2022 - year;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSpinnerText = parent.getItemAtPosition(position).toString();
        showText();

    }

    private void showText() {
        if (mSpinnerText !=null){
            Toast.makeText(this,mSpinnerText, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}