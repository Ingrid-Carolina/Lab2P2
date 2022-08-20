/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;
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
                    ArrayList listaC = new ArrayList();
                    ArrayList<String> CN = new ArrayList();//CN = cliente Nombre
                    ArrayList<Integer> CE = new ArrayList();//CE=La Edad del Cliente
                    ArrayList<String> CID = new ArrayList();//CID=El ID del Cliente
                    ArrayList<Double> CS = new ArrayList();//CS=El sueldo del Cliente
                    ArrayList<Integer> D = new ArrayList();//D=dueño
                    System.out.println("============ Menu Principal ===============");
                    System.out.println("1) Clientes");
                    System.out.println("2) Empleados");
                    System.out.println("3) Automoviles");
                    System.out.println("4) Regresar a sesion principal");
                    System.out.println("===================================");
                    System.out.print("Ingrese la opcion:");
                    int opcion = lea.nextInt();
                    System.out.println("====================================");
                    switch (opcion) {
                        case 1: {
                            Clientes cl = new Clientes();
                            boolean centinela2 = true;
                            while (centinela2 == true) {
                                System.out.println("========Menus de Clientes===========");
                                System.out.println("1)Crear Clientes");
                                System.out.println("2)Listar Clientes");
                                System.out.println("3)Modificar Clientes");
                                System.out.println("4)Eliminar Clientes");
                                System.out.println("5)Listar carros por Cliente");
                                System.out.println("6)Regresar al menu principal");
                                System.out.println("====================================");
                                System.out.print("Ingrese la opcion:");
                                int opcion2 = lea.nextInt();
                                System.out.println("====================================");
                                switch (opcion2) {
                                    case 1:
                                        System.out.println("Ingrese El Nombre del Cliente:");
                                        String nombre = lea.nextLine();
                                        nombre = lea.next();
                                        cl.setNombre(nombre);
                                        CN.add(nombre);
                                        System.out.println("Ingrese la edad del Cliente: ");
                                        int edad = lea.nextInt();
                                        cl.setEdad(edad);
                                        CE.add(edad);
                                        System.out.println("Ingrese el Id[Identidad] del Cliente: ");
                                        String id = lea.nextLine();
                                        id = lea.next();
                                        cl.setID(id);
                                        CID.add(id);
                                        System.out.println("Ingrese el Monto a pagar por el Cliente: ");
                                        double sueldo = lea.nextDouble();
                                        cl.setSaldo(sueldo);
                                        CS.add(sueldo);
                                        break;
                                    case 2:
                                       for (int i = 0; i < CN.size(); i++) {
                                            System.out.println("Nombre es : " + CN.get(i) + " /La Edad es: " + CE.get(i) + " /El numero de ID es: " + CID.get(i) + " /Monto es: " + CS.get(i));
                                        }
                                        break;
                                    case 3:
                                          System.out.println("Eliga al cliente que desea Modificar: ");
                                        for (int i = 0; i < CN.size(); i++) {
                                            System.out.println(i + ") " + CN.get(i));
                                        }
                                        System.out.println("Ingrese el numero de la Posicion del Cliente:");
                                        int pos = lea.nextInt();
                                        System.out.println("Que Desea Modificar del Cliente :\n1.Nombre\n2.Edad\n3.ID\n4.Saldo\nIngrese una opcion :");
                                        int modC = lea.nextInt();
                                        if (modC == 1) {
                                            System.out.println("Ingrese el nuevo nombre del Cliente: ");
                                            String nom = lea.nextLine();
                                            nom = lea.next();
                                            CN.remove(pos);
                                            CN.add(pos, nom);
                                            System.out.println("El Nombre ya sido modifico ");
                                        }
                                        if (modC == 2) {
                                            System.out.println("Ingrese la nueva edad del Cliente:");
                                            int ed = lea.nextInt();
                                            CE.remove(pos);
                                            CE.add(pos, ed);
                                            System.out.println("La Edad ya sido modifico");
                                        }
                                        if (modC == 3) {
                                            System.out.println("Ingrese el nuevo ID del Cliente");
                                            String n_Id = lea.nextLine();
                                            n_Id = lea.next();
                                            CID.remove(pos);
                                            CID.add(pos, n_Id);
                                            System.out.println("El ID ya sido modifico");
                                        }
                                        if (modC == 4) {
                                            System.out.println("Ingrese el nuevo sueldo a pagar del Cliente:");
                                            double n_monto = lea.nextInt();
                                            CS.remove(pos);
                                            CS.add(pos, n_monto);
                                            System.out.println("El Monto ya sido modifico");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Eliga al cliente que desea Eliminar: ");
                                        for (int i = 0; i < CN.size(); i++) {
                                            System.out.println(i + ") " + CN.get(i));
                                        }
                                        System.out.println("Ingrese el numero de la Posicion del Cliente:");
                                        int pos1 = lea.nextInt();
                                        CN.remove(pos1);
                                        CE.remove(pos1);
                                        CID.remove(pos1);
                                        CS.remove(pos1);
                                        System.out.println("El Cliente Ha Sido Eliminado ");
                                        break;
                                    case 5:
                                         System.out.println("Escoga el numero del cliente del que desea listar los autos: ");
                                        for (int i = 0; i < CN.size(); i++) {
                                            System.out.println(i + ") " + CN.get(i));
                                        }
                                        int p3 = lea.nextInt();
                                        System.out.println("Los autos de este cliente son: ");
                                        for (int m = 0; m < D.size(); m++) {
                                            if (p3 == D.indexOf(m)) {
                                                System.out.println("1)-");
                                            }
                                        }
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
                                System.out.println("===========Menus de Empleados============");
                                System.out.println("1)Crear Empleados");
                                System.out.println("2)Listar Empleados");
                                System.out.println("3)Modificar Empleados");
                                System.out.println("4)Eliminar Empleados");
                                System.out.println("5)Estado de Trabajos de los Empleados");
                                System.out.println("6)Regresar al menu principal");
                                System.out.println("=========================================");
                                System.out.println("Ingrese la opcion:");
                                int opc3 = lea.nextInt();
                                System.out.println("=========================================");
                                switch (opc3) {
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

                                        centinela3 = false;
                                        break;

                                }
                            }
                        }//fin del case 2
                        break;
                        case 3: {
                            boolean centinela4 = true;
                            while (centinela4 == true) {
                                System.out.println("=============Menus de Carros=============");
                                System.out.println("1)Añadir Carros al sistema");
                                System.out.println("2)Listar carro");
                                System.out.println("3)Modificar su estado de reparacion");
                                System.out.println("4)Regresar al menu principal");
                                System.out.println("==========================================");
                                System.out.println("Ingrese la opcion:");
                                int opc4 = lea.nextInt();
                                System.out.println("==========================================");
                                switch (opc4) {
                                    case 1:

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;

                                    case 4:

                                        centinela4 = false;
                                        break;
                                }
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
