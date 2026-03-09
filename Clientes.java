public class Clientes{
    int ID;
    String nombre;
    String apellido;
    int Telef;
    int Activo;
     public Cliente(int id, String nombre, String apellido, String telefono, int activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = activo;
    }

    public String toCSV() {
        return id + "," + nombre + "," + apellido + "," + telefono + "," + activo;
    }

    public void mostrar() {
        if (activo == 1) {
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Telefono: " + telefono);
            System.out.println("--------------------");
        }
    }
}