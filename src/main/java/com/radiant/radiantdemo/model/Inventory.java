package com.radiant.radiantdemo.model;

public abstract class Inventory {
    private long id;
    protected String description;
    protected float quantity;
    protected String unit;
    protected String hull;
    protected String condition;
    protected String location;
    protected String remarks;

    public Inventory(long id, String description, float quantity, String unit, String hull, String condition, String location, String remarks) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.hull = hull;
        this.condition = condition;
        this.location = location;
        this.remarks = remarks;
    }

    // Instantiate all fields except hull
    public Inventory(long id, String description, float quantity, String unit, String condition, String location, String remarks) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.condition = condition;
        this.location = location;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getHull() {
        return hull;
    }

    public void setHull(String hull) {
        this.hull = hull;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
