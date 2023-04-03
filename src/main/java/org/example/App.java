package org.example;

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        User user = new User ("Anastasiia", "Petrenko");
        System.out.println(new Gson().toJson(user));
    }
}
