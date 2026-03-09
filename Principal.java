public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
int op = sc.nextInt();
    
do{
    
    op = nextInt();

    swicth(op){
        case 1: 
        System.out.println(" Registrar el cliente. ");
        break;
        case 2:
        System.out.println(" Listar clientes. ");
        break;
        case 3:
        println.out.println(" Eliminar un cliente. ");
        break;
        case 4:
        println.out.println(" Registrar un pedido. ");
        break;
        case 5:
        println.out.println(" Listar pedidos de un cliente. ");
        break;
        case 6:
        println.out.println(" Saliendo del sistema.......");
        break;
        default:
        println.out.println(" Error. Porfavor ingrese un numero del 1 al 6. ");
    }
    }while(op=!7)
}
static void mostrarMenu(){
    System.out.println("================¡Bienvenido al menu principal!=================");
    System.out.println("1. Resgistrar el cliente. ");
    System.out.println("2. Listar clientes. ");
    System.out.println("3. Eliminar un cliente. ");
    System.out.println("4. Registrar un pedido. ");
    System.out.println("5. Listar pedidos de un cliente. ");
    System.out.println("6. Salir del menu principal. ");
}
    }
    
