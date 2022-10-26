package ProgramacionOO;
import java.util.*;
public class Test {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		CuentaBancaria c1 = new CuentaBancaria();
		c1.Depositar(1456.78);
		c1.setNombreCliente("Josue lopez");
		c1.setEmail("Josuegabrielrojas@gmaiil.com");
		c1.setNCuenta("2837473");
		c1.setNTelefono("81927295");
		c1.Retirar(200.000);
		c1.MostrarDatos();
		
	}
	
	
}
