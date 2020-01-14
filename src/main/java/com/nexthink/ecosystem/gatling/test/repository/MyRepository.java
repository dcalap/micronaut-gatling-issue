package com.nexthink.ecosystem.gatling.test.repository;


import com.nexthink.ecosystem.gatling.test.resource.MyResourceWithLombok;

import javax.inject.Singleton;


//Use to persist with the framework, here you will have your queries and so on
//@Repository
@Singleton
public class MyRepository {

    public MyResourceWithLombok findByFoo() {
        //Your query
        return new MyResourceWithLombok();
    }

}
