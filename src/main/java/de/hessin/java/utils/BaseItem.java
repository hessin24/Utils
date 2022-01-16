package de.hessin.java.utils;

public class BaseItem implements Item{

    private String name, title, desc, hash, key;
    private Object value, tag, jocker, logo;
    private long id;
    private int pos, resId;
    public BaseItem(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void setID(long id) {
        this.id = id;
    }

    @Override
    public long getID() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getKey() {
        // TODO Auto-generated method stub
        return key;
    }

    @Override
    public Object getValue() {
        // TODO Auto-generated method stub
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }
    @Override
    public Object getTag() {
        // TODO Auto-generated method stub
        return tag;
    }

    public void setPosition (int pos) {
        this.pos = pos;
    }
    @Override
    public int getPosition() {
        // TODO Auto-generated method stub
        return pos;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return desc;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    @Override
    public String getHash() {
        // TODO Auto-generated method stub
        return hash;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }
    @Override
    public Object getLogo() {
        // TODO Auto-generated method stub
        return logo;
    }

    public void set(Object univ) {
        this.jocker = univ;
    }
    @Override
    public Object get() {
        // TODO Auto-generated method stub
        return jocker;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public int getResId() {
        return resId;
    }

}