package com.example.mvpanddependancyinjection.View.activities.mainActivity;

import com.example.mvpanddependancyinjection.Model.local.mockDatabase.MockDbHelper;
import com.example.mvpanddependancyinjection.dagger.components.DaggerPersonComponent;
import com.example.mvpanddependancyinjection.dagger.components.PersonComponent;

public class MainActivityPresenter {
    MainActivityContract mainActivityContract;
    PersonComponent personComponent;

    public MainActivityPresenter(MainActivityContract mainActivityContract) {
        this.mainActivityContract = mainActivityContract;
        personComponent = DaggerPersonComponent.builder().build();
    }

    public void getPerson(){
        mainActivityContract.passPerson(personComponent.getPerson());
        //mainActivityContract.passPerson(new MockDbHelper().getSinglePerson("someKey"));
    }

    public String getMentalStatus(boolean isSane){
        return isSane ? "Yes,thank you.":"Fruitier than a nutcake.";
    }
}
