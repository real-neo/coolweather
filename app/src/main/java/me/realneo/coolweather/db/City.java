package me.realneo.coolweather.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "city", indices = {@Index("province_id")}, foreignKeys = @ForeignKey(entity = Province.class, parentColumns = "id", childColumns = "province_id", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE))
public class City {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int code;
    @ColumnInfo(name = "province_id")
    private int provinceId;

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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
