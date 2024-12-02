package com.example.designpattern.CompositeDesignPattern.FileSystemExample.Composite;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.CompositeDesignPattern.FileSystemExample.Component.FileSystem;

public class Directory implements FileSystem{

    private String directoryName;
    private List<FileSystem> fileSystemsList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemsList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemsList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        
        System.out.println("Directory name " + directoryName);

        for(FileSystem fileSystemObj : fileSystemsList){
            fileSystemObj.ls();;
        }
    }
    
}
