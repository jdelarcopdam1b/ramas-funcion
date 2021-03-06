
public class Empleado {

    private String nombre;
    private int codEmp;

    public Empleado(String nombre, int codEmp) {
        this.nombre = nombre;
        this.codEmp = codEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cod_empleado=" + codEmp +
                '}';
    }

    public void fichajeEntrada(){
        System.out.println("linea codigo 1");
        System.out.println("linea codigo 2");
    }

    public void fichajeSalida(){
        System.out.println("Codigo estable");
    }
}
