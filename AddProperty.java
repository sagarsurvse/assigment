package com.hardcastle.assigmment1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddProperty extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);

//getting the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //setting the title
        toolbar.setTitle("Add Property");
        toolbar.setTitleTextColor(Color.WHITE);

        //placing toolbar in place of actionbar
        setSupportActionBar(toolbar);


        // Spinner element
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Spinner element
        final Spinner spinner1 = (Spinner) findViewById(R.id.building);
        final Spinner spinner3 = (Spinner) findViewById(R.id.Annualturnover);
        final Spinner spinner4 = (Spinner) findViewById(R.id.Annualproduction);
        final Spinner spinner5 = (Spinner) findViewById(R.id.unitCategory);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner click listener
        spinner1.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);


        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("UAM ");
        categories.add("EM-II");
        categories.add("IEM");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        // Spinner Drop down elements
        List<String> categories1 = new ArrayList<String>();
        categories1.add(" >= 25 Lakh-Micro ");
        categories1.add("25 lakh - 5 crores-Small");
        categories1.add(">5 crore-Medium");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories1);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter1);


        // Spinner Drop down elements
        List<String> categories3 = new ArrayList<String>();
        categories3.add(" <1 Lakh ");
        categories3.add("1-5 Lakh");
        categories3.add("5-10 Lakh");
        categories3.add(" 10-20 Lakh");
        categories3.add("20-75 Lakh");
        categories3.add("75 lakh – 1.5 Crore");
        categories3.add(" 1.5 - 5 Crore ");
        categories3.add("5 – 20 Crore");
        categories3.add("20 – 50 Crore");
        categories3.add("50-75 Crore");
        categories3.add("75- 250 Crore");
        categories3.add("50-75 Crore");
        categories3.add("75- 250 Crore");
        categories3.add(">= 250 Crore");
        categories3.add("others");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);

        // Drop down layout style - list view with radio button
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner3.setAdapter(dataAdapter3);


        // Spinner Drop down elements
        List<String> categories4 = new ArrayList<String>();
        categories4.add(" <1 Lakh ");
        categories4.add("1-5 Lakh");
        categories4.add("5-10 Lakh");
        categories4.add(" 10-20 Lakh");
        categories4.add("20-75 Lakh");
        categories4.add("75 lakh – 1.5 Crore");
        categories4.add(" 1.5 - 5 Crore ");
        categories4.add("5 – 20 Crore");
        categories4.add("20 – 50 Crore");
        categories4.add("50-75 Crore");
        categories4.add("75- 250 Crore");
        categories4.add("50-75 Crore");
        categories4.add("75- 250 Crore");
        categories4.add(">= 250 Crore");
        categories4.add("others");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories4);

        // Drop down layout style - list view with radio button
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner4.setAdapter(dataAdapter4);


// Spinner Drop down elements
        List<String> categories5 = new ArrayList<String>();
        categories5.add(" Red ");
        categories5.add("Orange");
        categories5.add("Green");
        categories5.add("White");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories5);

        // Drop down layout style - list view with radio button
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner5.setAdapter(dataAdapter5);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}
