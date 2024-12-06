import javax.swing.JOptionPane;

public class ejercicio_arreglos {
    public static void main(String[] args) {
        String Materias[] = {"CalcDif", "FundPro", "FundInv", "Quimica", "DesaSus", "MateDic"};
        String encabezado[] = {"Materia", "U1", "U2", "U3", "U4", "U5", "Promedio"};
        byte calificaciones[][] = new byte[6][5]; 
        double promedio;
        double sumaTotal = 0; 

        // Ingresar las calificaciones
        for (int x = 0; x < 6; x++) { 
            for (int y = 0; y < 5; y++) {
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu calificación de "
                        + Materias[x] + " para Unidad " + (y + 1)));
            }
        }

        // Impresión de encabezados
        for (String encabezadoTitulo : encabezado) {
            System.out.print(encabezadoTitulo + "\t");
        }
        System.out.println();

        // Imprimir calificaciones y calcular promedios
        for (int x = 0; x < 6; x++) {
            System.out.print(Materias[x] + "\t");

            int sumaMateria = 0; 
            for (int y = 0; y < 5; y++) {
                System.out.print(calificaciones[x][y] + "\t");
                sumaMateria += calificaciones[x][y]; 
            }

            // Calcular promedio por materia
            promedio = sumaMateria / 5.0;
            System.out.printf("%.2f\t", promedio);
            sumaTotal += promedio; 

            System.out.println();
            
            
        }

        // Calcular y mostrar promedio total
        double promedioTotal = sumaTotal / 6.0; 
        System.out.println("Promedio total de todas las materias: " + String.format("%.2f", promedioTotal));
    }
    
    
}
