package com.martin.hams_cuisine.HelperAdapter.HomeAdapter;

public class RecyclerViewHelper2 {
    int image;
    String title, description;
    //ratingbar ratingbar;

    public RecyclerViewHelper2(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
