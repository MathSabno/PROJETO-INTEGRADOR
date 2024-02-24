/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

public class isNumeric {
    static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+"); 
    }
    static boolean isNumericCorretagem (String str){
        return str != null && str.matches("[0-9]+");
    }
}
