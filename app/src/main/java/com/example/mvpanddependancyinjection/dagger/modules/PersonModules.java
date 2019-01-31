package com.example.mvpanddependancyinjection.dagger.modules;

import com.example.mvpanddependancyinjection.Model.local.person.Person;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModules {

    @Provides
    public Person getPerson() {
        return new Person("Frank",
                "Darwin",
                "39",
                "male",
                "Dec 5 1979",
                true);
    }
}
