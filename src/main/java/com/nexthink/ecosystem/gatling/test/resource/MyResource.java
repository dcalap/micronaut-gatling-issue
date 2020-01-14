package com.nexthink.ecosystem.gatling.test.resource;

import java.util.Objects;


public class MyResource {

    private String foo;
    private String foo1;
    private String foo2;
    private String foo3;
    private String foo4;
    private String foo5;
    private String foo6;
    private String foo7;

    public MyResource (String foo, String foo1, String foo2, String foo3, String foo4, String foo5, String foo6, String foo7) {

        this.foo = foo;
        this.foo1 = foo1;
        this.foo2 = foo2;
        this.foo3 = foo3;
        this.foo4 = foo4;
        this.foo5 = foo5;
        this.foo6 = foo6;
        this.foo7 = foo7;
    }

    public String getFoo () {

        return foo;
    }

    public void setFoo (String foo) {

        this.foo = foo;
    }

    public String getFoo1 () {

        return foo1;
    }

    public void setFoo1 (String foo1) {

        this.foo1 = foo1;
    }

    public String getFoo2 () {

        return foo2;
    }

    public void setFoo2 (String foo2) {

        this.foo2 = foo2;
    }

    public String getFoo3 () {

        return foo3;
    }

    public void setFoo3 (String foo3) {

        this.foo3 = foo3;
    }

    public String getFoo4 () {

        return foo4;
    }

    public void setFoo4 (String foo4) {

        this.foo4 = foo4;
    }

    public String getFoo5 () {

        return foo5;
    }

    public void setFoo5 (String foo5) {

        this.foo5 = foo5;
    }

    public String getFoo6 () {

        return foo6;
    }

    public void setFoo6 (String foo6) {

        this.foo6 = foo6;
    }

    public String getFoo7 () {

        return foo7;
    }

    public void setFoo7 (String foo7) {

        this.foo7 = foo7;
    }

    @Override
    public boolean equals (Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyResource that = (MyResource) o;
        return Objects.equals(foo, that.foo) &&
                Objects.equals(foo1, that.foo1) &&
                Objects.equals(foo2, that.foo2) &&
                Objects.equals(foo3, that.foo3) &&
                Objects.equals(foo4, that.foo4) &&
                Objects.equals(foo5, that.foo5) &&
                Objects.equals(foo6, that.foo6) &&
                Objects.equals(foo7, that.foo7);
    }

    @Override
    public int hashCode () {

        return Objects.hash(foo, foo1, foo2, foo3, foo4, foo5, foo6, foo7);
    }

    @Override
    public String toString () {

        return "MyResource{" +
                "foo='" + foo + '\'' +
                ", foo1='" + foo1 + '\'' +
                ", foo2='" + foo2 + '\'' +
                ", foo3='" + foo3 + '\'' +
                ", foo4='" + foo4 + '\'' +
                ", foo5='" + foo5 + '\'' +
                ", foo6='" + foo6 + '\'' +
                ", foo7='" + foo7 + '\'' +
                '}';
    }

}
