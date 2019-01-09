package com.treehouse.projects;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args){
        get("/hello", (req, res) -> "We've got a thiinnnngggg going onnnnnnn");
    }
}
