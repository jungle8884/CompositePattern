package com.CompositePattern;

abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }

    public void add(Component c){};
    public void remove(Component c){};
    public Component getChild(int i){return null;}
    public void operation(){};
}
