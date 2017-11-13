package com.antonenko.nikita.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    //Properties ------------
    private List<List<Integer>> matrix;
    // ----------------------

    //Initializer -------------------------
    Matrix() {
        this.matrix = new ArrayList();
    }
    // ------------------------------------

    // Get length -------------
    public int nrow() {
        return matrix.size();
    }
    public int ncol() {
        return matrix.get(0).size();
    }
    // ------------------------

    // Print list -------------------------------------
    void print() {
        for (List<Integer> list : matrix) {
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    // --------------------------------------------------

    // Init random list -------------------------------
    void initRandom(int max, int length) {
        Random rand = new Random();
        matrix.clear();
        for (int i = 0; i < length; i++) {
            matrix.add(new ArrayList());
            for (int j = 0; j < length; j++) {
                matrix.get(i).add(rand.nextInt(max + 1));
            }
        }
    }
    // --------------------------------------------------

    // Get Min and Max -------------------------------------
    public int min() {
        int min = matrix.get(0).get(0);
        for (List<Integer> list : matrix) {
            for (int item : list) if (min > item) min = item;
        }
        return  min;
    }
    public int max() {
        int max = matrix.get(0).get(0);
        for (List<Integer> list : matrix) {
            for (int item : list) if (max < item) max = item;
        }
        return  max;
    }
    public int minApi() {
        int min = matrix.get(0).get(0);
        for (List<Integer> list : matrix) {
            int lMin = list.stream().min(Integer::compareTo).get();
            if (min > lMin) min = lMin;
        }
        return  min;
    }
    public int maxApi() {
        int max = matrix.get(0).get(0);
        for (List<Integer> list : matrix) {
            int lMax = list.stream().max(Integer::compareTo).get();
            if (max < lMax) max = lMax;
        }
        return  max;
    }
    // ------------------------------------------------------

}
