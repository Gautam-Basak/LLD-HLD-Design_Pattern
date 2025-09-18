package com.example.designpattern.CompositeDesignPattern.ProblemStatement;

public class MainClass {
    public static void main(String[] args) {
        
        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        border.ls(); // Single file you created and access it.
        comedyMovieDirectory.ls(); // One directory you created and one file inside it.
        movieDirectory.ls(); // Multiple directory and file you have created under it.

    }
}
