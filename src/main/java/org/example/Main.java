package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(createMessage ());
    }

    private static List <String> createMessage (){
        List <String> messages=List.of(
        "Is anybody home???",
        "No, isn't",
        "But it's a just question!"
        );
        return messages;
    }
}