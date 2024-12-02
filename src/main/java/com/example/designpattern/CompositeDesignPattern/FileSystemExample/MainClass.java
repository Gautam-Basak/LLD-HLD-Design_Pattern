package com.example.designpattern.CompositeDesignPattern.FileSystemExample;

import com.example.designpattern.CompositeDesignPattern.FileSystemExample.Component.FileSystem;
import com.example.designpattern.CompositeDesignPattern.FileSystemExample.Composite.Directory;
import com.example.designpattern.CompositeDesignPattern.FileSystemExample.Leaf.File;

public class MainClass {
    public static void main(String[] args) {
        
        // Here we are creating Directory Favourite Movie
        Directory movieDirectory = new Directory("Favourite Movie");

        // Here we are creating File (Border Movie) and add inside Directory Favourite
        // Movie
        FileSystem border = new File("Border Movie");
        movieDirectory.add(border);

        // Here we are creating another Directory Comedy Movie
        Directory comedyMovieDirectory = new Directory("Comedy Movie");

        // Here we are creating File (Hulchul Movie) and add inside Directory Comedy
        // Movie
        FileSystem hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);

        // Here we are adding the Comedy Movie directory in Favourite Movie Directory.
        // This is where we are adding "itself"
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
