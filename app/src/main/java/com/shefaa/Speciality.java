package com.shefaa;

/**
 * * Created by Ahmed Adel Al-Desouqy on 07-May-18.
 */

public class Speciality {
    private int iconDrawable;
    private String title;

    public Speciality() {
    }

    public Speciality(int iconDrawable, String title) {
        this.iconDrawable = iconDrawable;
        this.title = title;
    }

    public int getIconDrawable() {
        return iconDrawable;
    }

    public void setIconDrawable(int iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
