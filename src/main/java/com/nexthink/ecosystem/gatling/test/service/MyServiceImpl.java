package com.nexthink.ecosystem.gatling.test.service;

import com.nexthink.ecosystem.gatling.test.repository.MyRepository;
import com.nexthink.ecosystem.gatling.test.resource.MyResourceWithLombok;
import com.nexthink.ecosystem.gatling.test.util.UserUtils;

import javax.inject.Singleton;


@Singleton
public class MyServiceImpl implements MyService {

    private MyRepository repository;


    public MyServiceImpl (MyRepository repository) {

        this.repository = repository;
    }

    @Override
    public MyResourceWithLombok aMethod () {

        MyResourceWithLombok resource = new MyResourceWithLombok();
        UserUtils.doSomethingToHelpMyService(resource);
        return repository.findByFoo();

    }

}
