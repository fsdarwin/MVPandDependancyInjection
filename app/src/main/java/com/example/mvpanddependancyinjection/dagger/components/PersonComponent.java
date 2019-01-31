package com.example.mvpanddependancyinjection.dagger.components;

import com.example.mvpanddependancyinjection.Model.local.person.Person;
import com.example.mvpanddependancyinjection.dagger.modules.PersonModules;
import dagger.Component;

@Component(modules = PersonModules.class)
public interface PersonComponent {
    Person getPerson();
}
