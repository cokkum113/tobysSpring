package com.example.chap01_userinfo;

public class HelloUppercase implements Hello{
    Hello hello;
    //위임할 타깃 오브젝트, 여기서는 타킷클래스의 오브젝트인 것은 알지만
    //다른 프록시를 추가할 수도 있으므로 인터페이스를 통해 접근한다.

    public HelloUppercase(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String sayHello(String name) {
        return hello.sayHello(name).toUpperCase();
    }

    @Override
    public String sayHi(String name) {
        return hello.sayHi(name).toUpperCase();

    }

    @Override
    public String sayThankYou(String name) {
        return hello.sayThankYou(name).toUpperCase();

    }
}
