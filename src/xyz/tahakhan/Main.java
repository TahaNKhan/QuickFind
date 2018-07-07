package xyz.tahakhan;

import xyz.tahakhan.DataStructures.Interfaces.UFQuickFind;
import xyz.tahakhan.DataStructures.UFQuickFindImpl;

public class Main {

    public static void main(String[] args) {

        UFQuickFind UFQuickFind = new UFQuickFindImpl(10);

        UFQuickFind.union(1,2);
        UFQuickFind.union(3,4);
        UFQuickFind.union(5,6);
        UFQuickFind.union(7,8);
        UFQuickFind.union(7,9);
        UFQuickFind.union(9,1);
        UFQuickFind.union(5,0);

        System.out.println(UFQuickFind.connected(0,6));
        System.out.println(UFQuickFind.connected(1,7));
    }
}
