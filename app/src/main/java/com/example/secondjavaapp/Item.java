package com.example.secondjavaapp;

public class Item {

    private String Id, CategoryID, Name, CategoryName, Type, Date,Pictures, YoutubePath, FilePath;

    public Item(String id, String categoryID, String name, String categoryName, String type, String date,String pictures, String youtubePath, String filePath) {
        Id = id;
        Pictures=pictures;
        CategoryID = categoryID;
        Name = name;
        CategoryName = categoryName;
        Type = type;
        Date = date;
        YoutubePath = youtubePath;
        FilePath = filePath;
    }

    public String getId() {
        return Id;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public String getName() {
        return Name;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public String getType() {
        return Type;
    }

    public String getDate() {
        return Date;
    }

    public String getPictures() {
        return Pictures;
    }

    public String getYoutubePath() {
        return YoutubePath;
    }

    public String getFilePath() {
        return FilePath;
    }
}
