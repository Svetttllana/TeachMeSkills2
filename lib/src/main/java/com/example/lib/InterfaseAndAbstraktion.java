package com.example.lib;
public class InterfaseAndAbstraktion {
    public static void main(String[] args) {

    }
}
abstract class Bird{
    abstract void walk();

    }
interface IFlyingBird{
    void fly();
}
class Vorona extends Bird implements IFlyingBird {


    @Override
    public void walk() {

    }


    @Override
    public void fly() {

    }
}

class Papugai extends Bird  {

    @Override
    void walk() {

    }
}

class Penguin extends Bird{


    @Override
    void walk() {

    }
}
