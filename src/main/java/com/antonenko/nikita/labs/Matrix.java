package com.antonenko.nikita.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    //Properties ------------
    private List<List<Integer>> matrix;
    private Person author;
    // ----------------------

    //Initializer -------------------------
    Matrix(String name, int age, Person.Sex sex) {
        this.matrix = new ArrayList();
        this.author = new Person(name,age,sex);
    }
    // ------------------------------------

    // Get -------------
    public int nrow() {
        return matrix.size();
    }
    public int ncol() {
        return matrix.get(0).size();
    }
    public String getName(){
        return author.getName();
    }
    public int getAge() {
        return author.getAge();
    }
    public List<List<Integer>> getMatrix() { return matrix; }
    public Person.Sex getSex() { return author.getSex(); }
    // ------------------------

    // Print list -------------------------------------
    void print() {
        for (List<Integer> list : matrix) {
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        author.print();
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

    // Equals -----------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix1 = (Matrix) o;

        if (nrow() != matrix1.nrow()) return false;
        if (ncol() != matrix1.ncol()) return false;
        if (!matrix.equals(matrix1.matrix)) return false;
        return author.equals(matrix1.author);
    }

    @Override
    public int hashCode() {
        int result = nrow();
        result = 31 * result + ncol();
        result = 31 * result + matrix.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
    // ------------------------------------------------------
}
