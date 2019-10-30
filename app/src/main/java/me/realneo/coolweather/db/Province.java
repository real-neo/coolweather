package me.realneo.coolweather.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "province")
public class Province {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
