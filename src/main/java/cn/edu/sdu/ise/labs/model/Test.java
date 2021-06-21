package cn.edu.sdu.ise.labs.model;

public class Test {
    private Integer id;

    private String name;

    private String persId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPersId() {
        return persId;
    }

    public void setPersId(String persId) {
        this.persId = persId == null ? null : persId.trim();
    }
}