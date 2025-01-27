package com.example.project;

public class IdGenerate{
    
    // static instance variable - String currentId, initialized to "99"
    private static String currentId = "99";

    // empty IdGenerate constructor
    public IdGenerate() {}

    // returns currentId
    public static String getCurrentId() {
        return currentId;
    }

    // resets currentId by setting it back to "99"
    public static void reset() {
        currentId = "99";
    }

    // increases currentId by 1
    public static void generateID() {
        // Integer.parseInt() to increment currentId -> then it's cast back into a String
        currentId = "" + (Integer.parseInt(currentId) + 1);
    }
}