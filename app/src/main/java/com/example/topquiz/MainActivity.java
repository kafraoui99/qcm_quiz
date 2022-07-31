package com.example.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*EditText myuser,mypass;
    Button mybtn;*/

    EditText nom;
    EditText prenom;
    EditText departement;
    RadioGroup sex;
    Button buttonEnregistrer;
    ListView list;
    ArrayList<String> ListEmploy;
    ArrayAdapter<String> Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*myuser = (EditText) findViewById(R.id.login);
        myuser = (EditText) findViewById(R.id.password);
        mybtn = (Button) findViewById(R.id.button);*/

        buttonEnregistrer = (Button) findViewById(R.id.buttonEnregistrer);
        sex = (RadioGroup) findViewById(R.id.sex);
        list = (ListView) findViewById(R.id.list);
        ListEmploy = new ArrayList<String>();
        Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,ListEmploy);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        departement = (EditText) findViewById(R.id.departement);
    }

    public void btnClick(){

        {
            buttonEnregistrer.setOnclickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

        }

    }



}