/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tetris2024;

/**
 *
 * @author marcel
 */
public class Shape {
    
    private Tetrominoes pieceShape;
    private int coordinates[][];
    
    private static final int[][][] coordsTable = new int[][][] {
     { { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } },
     { { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 } },
     { { 0, -1 }, { 0, 0 }, { 1, 0 }, { 1, 1 } },
     { { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 } },
     { { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 } },
     { { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } },
     { { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } },
     { { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } }
    };
    
    public Shape() {
        int randomShape = (int) (Math.random() * 7) + 1;
        pieceShape = Tetrominoes.values()[randomShape];
        coordinates = coordsTable[randomShape];
        coordinates = new int [4][2]; //instanciación
        //inicialización
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                coordinates[i][j] = coordsTable[randomShape][i][j];
            }
            
        }
    }
    
    public Shape getCopy() {
        Shape newShape = new Shape();
        newShape.pieceShape = pieceShape;
        for (int i = 0; i < 4; i++) {
            newShape.coordinates[i][0] = coordinates[i][0];
            newShape.coordinates[i][1] = coordinates[i][1];
            
        }
        return newShape;
    }
    
    public void rotateRight() {
        if (pieceShape == Tetrominoes.SquareShape) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            int temp = coordinates[i][0];
            coordinates[i][0] = -coordinates[i][1];
            coordinates[i][1] = temp;
        }
    }
    
    
    public int getX (int index){
        return coordinates[index][0];
    }
    
    public int getY (int index){
        return coordinates[index][1];
    }
    
    public Tetrominoes getShape() {
        return pieceShape;
    }
    
    public int getMinX() {
        int min = coordinates[0][0];
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][0] < min) {
                min = coordinates[i][0];
            }
        }
        return min;
    }
    
    public int getMaxX() {
        int max = coordinates[0][0];
        for (int i = 1; i < coordinates.length; i++){
            if (coordinates[i][0] > max) {
                max = coordinates [i][0];
            }
        }
        return max;
    }
    
    public int getMinY(){
        int min = coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][1] < min) {
                min = coordinates[i][1]; 
            }
        }
        return min;
    }
    
    public int getMaxY() {
        int max = coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][1] > max) {
                max = coordinates[i][1]; 
            }
        }
        return max;
    }
}
