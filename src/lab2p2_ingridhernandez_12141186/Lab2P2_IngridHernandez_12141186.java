/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ingridhernandez_12141186;

import java.util.Scanner;

/**
 *
 * @author incah
 */
public class Lab2P2_IngridHernandez_12141186 {

    static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean centinela = true;
        while (centinela == true) {
            System.out.println("=====INICION DE LA SECCION========");
            System.out.println("Ingrese el Usuario: ");
            String usuario = lea.next();
            System.out.println("Ingrese la Contraseña: ");
            String contra = lea.next();
            if (!usuario.equalsIgnoreCase("admin")) {
                centinela = true;
                System.out.println("Usuario No Existe");
            }
            if (!contra.equals("admin1234")) {
                centinela = true;
                System.out.println("Contraseña incorrecta");
            }
            if (contra.equals("admin1234") && usuario.equalsIgnoreCase("admin")) {
                boolean centinela1 = true;
                while (centinela1 == true) {
                    System.out.println("===============Menu=================");
                    System.out.println("1. Clientes");
                    System.out.println("2. Empleados");
                    System.out.println("3. Automoviles");
                    System.out.println("4. Regresar a inicio de sesion");
                    System.out.println("===================================");
                    int opcion = lea.nextInt();
                    switch (opcion) {
                        case 1: {
                            boolean centinela2 = true;
                            while (centinela2 == true) {
                                System.out.println("========Menus de Clientes===========");
                                System.out.println("1)Crear Clientes");
                                System.out.println("2)Listar Clientes");
                                System.out.println("3)Listar carros por cliente");
                                System.out.println("4)Modificar Clientes");
                                System.out.println("5)Eliminar Clientes");
                                System.out.println("6)Regresar al menu principal");
                                System.out.println("Ingrese la opcion:");
                                System.out.println("====================================");
                                int opcion2 = lea.nextInt();
                                switch (opcion2) {
                                    case 1:

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;
                                    case 4:

                                        break;
                                    case 5:

                                        break;
                                    case 6:

                                        centinela2 = false;
                                        break;

                                }

                            }
                        }//fin del case 1
                        break;
                        case 2: {
                            boolean centinela3 = true;
                            while (centinela3 == true) {
                                System.out.println("========Menus de Empleados===========");
                                System.out.println("1)Crear Empleados");
                                System.out.println("2)Listar Empleados");
                                System.out.println("3)Modificar Empleados");
                                System.out.println("4)Eliminar Empleados");
                                System.out.println("5)Estado de Trabajos de los Empleados");
                                System.out.println("6)Regresar al menu principal");
                                System.out.println("Ingrese la opcion:");
                                System.out.println("====================================");
                                int opc3 = lea.nextInt();
                            }
                }//fin del case 2
                break;
                case 3:{
                    boolean centinale4 = true;
                            while (centinale4 == true) {
                                 System.out.println("=============Menus de Carros=============");
                                System.out.println("1)Añadir Carros al sistema");
                                System.out.println("2)Listar carro");
                                System.out.println("3)Modificar su estado de reparacion");
                                System.out.println("4)Regresar al menu principal");
                                System.out.println("Ingrese la opcion:");
                                System.out.println("==========================================");
                                int opc4 = lea.nextInt();
                            }
                }//fin del case 3
                break;
                case 4:
                    centinela = false;
                 break;
                 default:
           System.out.println("Opcion Incorrecta");
           break;
                }
                }
            }
        }
    }

}
