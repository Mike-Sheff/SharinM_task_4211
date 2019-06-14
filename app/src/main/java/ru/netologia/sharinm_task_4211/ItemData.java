package ru.netologia.sharinm_task_4211;

import android.graphics.drawable.Drawable;

public class ItemData {

    private String title;
    private String subtitle;
    private Drawable image;
    private boolean checked;

    public ItemData(Drawable image, String title, String subtitle, boolean checked) {
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.checked = checked;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Drawable getImage() {
        return image;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
