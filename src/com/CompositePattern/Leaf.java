package com.CompositePattern;

public class Leaf extends Component {
    public Leaf(String name){
        super(name);
    }

    // 由于叶子节点没有再增加分枝和树叶, 所以add和remove没有意义.
    @Override
    public void add(Component c) {
        System.out.println("不能增加叶子节点!");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能移除叶子节点!");
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶类:" + name + "!");
    }
}
