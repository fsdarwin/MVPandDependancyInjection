package com.example.mvpanddependancyinjection.View.activities.mainActivity;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvpanddependancyinjection.Model.local.person.Person;
import com.example.mvpanddependancyinjection.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements MainActivityContract {

    MainActivityPresenter mainActivityPresenter;

    TextView tvFirstName;
    TextView tvLastName;
    TextView tvGender;
    TextView tvAge;
    TextView tvBirthDate;
    TextView tvIsSane;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityPresenter = new MainActivityPresenter(this);
        ButterKnife.bind(this);
        //bindViews();
    }

    private void bindViews() {
        //tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvGender = findViewById(R.id.tvGender);
        tvAge = findViewById(R.id.tvAge);
        tvBirthDate = findViewById(R.id.tvBirthDate);
        tvIsSane = findViewById(R.id.tvIsSane);
    }

    public void onClick(View view) {
        mainActivityPresenter.getPerson();
    }

    @Override
    public void passPerson(Person person) {
        if (person != null){
            tvAge.setText(person.getAge());
            tvIsSane.setText(mainActivityPresenter.getMentalStatus(person.isSane()));
            tvGender.setText(person.getGender());
            tvLastName.setText(person.getLastName());
            tvFirstName.setText(person.getFirstName());
            tvBirthDate.setText(person.getBirthDate());

        }

    }
}
