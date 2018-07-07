package xyz.tahakhan;

import xyz.tahakhan.DataStructures.Interfaces.QuickFind;
import xyz.tahakhan.DataStructures.QuickFindImpl;

public class Main {

    public static void main(String[] args) {

        QuickFind quickFind = new QuickFindImpl(10);

        quickFind.union(1,2);
        quickFind.union(3,4);
        quickFind.union(5,6);
        quickFind.union(7,8);
        quickFind.union(7,9);
        quickFind.union(9,1);
        quickFind.union(5,0);

        System.out.println(quickFind.connected(0,6));
        System.out.println(quickFind.connected(1,7));
    }
}
