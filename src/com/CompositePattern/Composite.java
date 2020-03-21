package com.CompositePattern;

import java.util.ArrayList;

public class Composite extends Component{
    private ArrayList<Component> children = new ArrayList<Component>();
    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println("组件类" + name + "!");
        for(Component c : children){
            c.operation();
        }
    }
}
