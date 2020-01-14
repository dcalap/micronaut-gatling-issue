package com.nexthink.ecosystem.gatling.test.util;

import com.nexthink.ecosystem.gatling.test.resource.MyResourceWithLombok;


public class UserUtils {

    public static String doSomethingToHelpMyService(MyResourceWithLombok resource) {

        return resource.getFoo1();

    }

}
