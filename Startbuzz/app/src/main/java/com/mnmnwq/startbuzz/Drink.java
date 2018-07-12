package com.mnmnwq.startbuzz;

/**
 * Created by Administrator on 2018-07-12.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    /**
     * drink 数组
     */
    public static final Drink[] drinks = {
            new Drink("Latter","A couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","Espresso,hot milk , and a steamed milk doam",R.drawable.cappuccino),
            new Drink("Filter","Highedt Quakity beans roasted and brewed fresh",R.drawable.filter)
    };

    /**
     * 每个饮品都有名称，描述，图片资源
     * @param name
     * @param description
     * @param imageResourceId
     */
    private Drink(String name,String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
