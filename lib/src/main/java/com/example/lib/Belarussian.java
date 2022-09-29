package com.example.lib;

public class Belarussian extends Human {
    public static void main(String[] args) {
                Belarussian belarussian= new Belarussian();
                German german = new German();
        belarussian.speakLanguage();
        german.speakLanguage();

    }

    @Override
    void speakLanguage() {
        System.out.println("Speak belorussian language");
    }
}
class  German extends  Human{

    @Override
    void speakLanguage() {
        System.out.println("Speak german language");

    }
}
abstract class Human{
    abstract void  speakLanguage();

}