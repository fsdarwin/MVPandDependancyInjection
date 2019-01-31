package com.example.mvpanddependancyinjection.Model.local.mockDatabase;

import com.example.mvpanddependancyinjection.Model.local.person.Person;

public class MockDbHelper {

    public Person getSinglePerson(String key){
        return new Person("Charlie",
                "Manson",
                "old",
                "male",
                "unknown",
                false);
    }
}
