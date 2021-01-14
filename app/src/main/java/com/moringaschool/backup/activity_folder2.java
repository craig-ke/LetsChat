package com.moringaschool.backup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class activity_folder2 extends AppCompatActivity {

    @BindView(R.id.locationTextView)
    TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;
    private String[] countries = new String[]{"Kenya", "Uganda",
            "Tanzania", "South Africa", "Zimbabwe", "South Sudan",
            "Sudan", "Nigeria", "Ukraine", "Canada",
            "Nairobi", "Zambia", "Lesotho",
            "China", "Germany"};
    private String[] news = new String[]{"BREAKING NEWS!!!!Eat healthy", "Before you sleep eat", "Athletes resfuse to run",
            "Before you sleep ,dont forget to wake up!!", "Coffee takes away the lazziness of sleeping", "English Food is filled with a lot of rules!!", "Burgers are too big for life",
            "Fast Food makes life move faster than the wind", "Noodle Soups inect the body with chinese GMO says who??",
            "Mexican wa of life bring life to the new way of living", "BBQ Hawaain chicken is most probably the most intresting thing to try", "Cuban people are too lazy",
            "Bar Food causes old age diseases", "Sports Bar.Huh!! Ironical", "Breakfast should be an exra ordinary meal for everyone", "Foloing the mexicans strike we can sa Mexicans are mexicans"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder2);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        MyArrayAdapter adapter = new MyArrayAdapter(this, android.R.layout.simple_list_item_1, countries, news);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView) view).getText().toString();
                Toast.makeText(activity_folder2.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
        mLocationTextView.setText("Welcome home: " + location);
    }
}
