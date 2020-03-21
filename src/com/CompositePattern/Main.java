package com.CompositePattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Component c0 = new Composite("co");
        Component c1 = new Composite("c1");
        Component c2 = new Composite("c2");
        Component c3 = new Composite("c3");
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        Component leaf4 = new Leaf("4");
        Component leaf5 = new Leaf("5");
        Component leaf6 = new Leaf("6");

        c0.add(c1);
        c0.add(c2);

        c1.add(leaf1);
        c1.add(leaf2);
        c1.add(c3);

        c2.add(leaf3);
        c2.add(leaf4);

        c3.add(leaf5);
        c3.add(leaf6);

        c0.operation();
    }
}
