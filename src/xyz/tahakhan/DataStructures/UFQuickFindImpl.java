package xyz.tahakhan.DataStructures;

import xyz.tahakhan.DataStructures.Interfaces.UFQuickFind;

public class UFQuickFindImpl implements UFQuickFind {

    private int[] QFArray;

    public UFQuickFindImpl(int capacity) {
        QFArray = new int[capacity];
        for (int i = 0; i < QFArray.length; i++)
        {
            QFArray[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        if (p >= QFArray.length || q >= QFArray.length) {
            throw new IllegalArgumentException();
        }
        return QFArray[p] == QFArray[q];
    }

    @Override
    public void union(int p, int q) {
        if (p >= QFArray.length || q >= QFArray.length) {
            throw new IllegalArgumentException();
        }
        int arbitraryNumber = QFArray[p];
        for (int i = 0; i < QFArray.length; i++) {
           if (QFArray[i] == QFArray[q])
           {
               QFArray[i] = arbitraryNumber;
           }
        }
    }
}
