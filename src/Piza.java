import javax.swing.*;
import static javax.swing.JOptionPane.*;


    public class Piza {
        public static void main(String[] args) {

            String cantidad;
            String valorPizza;
            String valorIngredientes;
            String ingredientes;
            String ingredientesExtras;
            int posicionGuardar;
            int posicionConsultar = 0;
            int valorTotal;
            String[][] Pizza = new String[5][4];

            boolean continuar = true;
            while (continuar) ;
            String menu = JOptionPane.showInputDialog("1. cantida  \n" + "2.valor pizza \n" + "3.valor ingredientes \n"
                    + "4.ingredientes \n" + "5.valorTotal");


            switch (menu) {
                case "1":

                    cantidad = JOptionPane.showInputDialog("por favor ingrese cuantas pizzas quiere comprar (maximo 5)");
                    valorPizza = JOptionPane.showInputDialog("el valor base es de $5000 ");
                    ingredientes = JOptionPane.showInputDialog("ingrese el numero de ingredientes maximo (4)");
                    valorIngredientes = JOptionPane.showInputDialog("ingrese el costo de un ingrediente");
                    ingredientesExtras = JOptionPane.showInputDialog("jamon $500" + "peperoni $900" + "pollo $700" + "tomate $300" +
                            "atun $1200" + "albaca $400" + "champiñones $800 ");
                    posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la poscion a guardar "));


                    if (posicionGuardar < 0 || posicionGuardar > 5) {

                    } else {
                        if (Pizza[posicionGuardar][0] != null) {

                        }
                    }
                    Pizza[posicionGuardar][0] = cantidad;
                    Pizza[posicionGuardar][1] = valorPizza;
                    Pizza[posicionGuardar][2] = ingredientes;
                    Pizza[posicionGuardar][3] = valorIngredientes;
                    Pizza[posicionGuardar][4] = ingredientesExtras;

                    JOptionPane.showMessageDialog(null, "se guardo la pizza correctamente en la " + "posicion " + posicionGuardar);

                    break;
                case "2":
                    valorPizza = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("el valor por pizza es de 5 mil")));

                    if (Pizza[posicionConsultar][1] == null) {

                        JOptionPane.showMessageDialog(null, "valor de la pizza es de 5 mil ");


                    } else {
                        JOptionPane.showMessageDialog(null, "cantidad:" + Pizza[posicionConsultar][0]
                                + "\nvalorPizza: " + Pizza[posicionConsultar][1] + "\ningredientes:" + Pizza[posicionConsultar][2]
                                + "\nvalorIngredientes: " + Pizza[posicionConsultar][3] + "\ningrediestesExtras: " + Pizza[posicionConsultar][4]);

                    }
                    break;
                case "3":
                    ingredientes = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ingredientes maximo (4)")));

                    if (Pizza[posicionConsultar][2] == null) {

                    } else {
                        JOptionPane.showMessageDialog(null, "cantidad:" + Pizza[posicionConsultar][0]
                                + "\nvalorPizza: " + Pizza[posicionConsultar][1] + "\ningredientes: " + Pizza[posicionConsultar][2]
                                + "\nvalorIngredientes: " + Pizza[posicionConsultar][3] + "\ningredientesExtras:"
                                + Pizza[posicionConsultar][4]);

                    }


                    break;
                case "4":
                    valorIngredientes = JOptionPane.showInputDialog("ingrese el costo de un ingrediente");

                    if (Pizza[posicionConsultar][3] == null) {

                    } else {
                        JOptionPane.showMessageDialog(null, "cantidad:" + Pizza[posicionConsultar][0]
                                + "\nvalorPizza: " + Pizza[posicionConsultar][1] + "\ningredientes:" + Pizza[posicionConsultar][2]
                                + "\nvalorIngredientes: " + Pizza[posicionConsultar][3] + "\ningrediestesExtras: " + Pizza[posicionConsultar][4]);


                    }
                    break;
                case "5":
                    ingredientesExtras = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("por favor selecione un ingrediente extra (puede ser: )")));

                    if (Pizza[posicionConsultar][4] == null) {
                        JOptionPane.showMessageDialog(null, "que ingredietes quieres poner lo singredientes son los siguientes : "
                                + "\njamon $500" + "\npeperoni $900" + "\npollo $700" + "\ntomate $300" + "\natun $1200" + "\nalbaca $400"
                                + "\nchampiñones $800");
                        posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la poscion a guardar "));


                    }
            }
        }
    }
