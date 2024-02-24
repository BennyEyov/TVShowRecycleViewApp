package com.example.tvshowrecycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ArrayList<DataModel> dataSet;
    private CustomAdapter adapter;
    private EditText searchEditText;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking EditText and Button
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);

        // Adding listener for search
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchEditText.getText().toString().trim();
                filterData(query);
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dataSet = new ArrayList<>();

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for (int i = 0; i < MyData.charactersNameArray.length; i++){
            dataSet.add(new DataModel(MyData.charactersNameArray[i],
                    MyData.charactersDescriptionArray[i],
                    MyData.charactersPicsArray[i],
                    MyData.longDescriptionsArray[i]
            ));
        }

        adapter = new CustomAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }

    private void filterData(String query) {
        ArrayList<DataModel> filteredList = new ArrayList<>();
        for (DataModel data : dataSet) {
            if (data.getCharacterName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(data);
            }
        }
        adapter = new CustomAdapter(filteredList);
        recyclerView.setAdapter(adapter);
    }
}