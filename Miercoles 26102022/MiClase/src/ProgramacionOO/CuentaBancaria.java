package ProgramacionOO;

public class CuentaBancaria {

	
	private  String NCuenta;
	private double saldo;
	private String NombreCliente,Email;
	private String NTelefono;
	public String getNCuenta() {
		return this.NCuenta;
	}
	public void setNCuenta(String NCuenta) {
		this.NCuenta = NCuenta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getNombreCliente() {
		return this.NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.NombreCliente = nombreCliente;
	}
	public String getNTelefono() {
		return this.NTelefono;
	}
	public void setNTelefono(String NTelefono) {
		this.NTelefono = NTelefono;
	}

	public void MostrarDatos() {
		System.out.println("Su nombre es :" + this.NombreCliente);
		System.out.println("Su Email es : " + this.Email);
		System.out.println("Su num de telefono es : " + this.NTelefono);
		
	}
	public void Depositar(double montoDeposito) {
		this.saldo +=montoDeposito;
		System.out.println("El monto depositado fue : " + montoDeposito);
		System.out.println("Su saldo actual es de :" + this.getSaldo());
		
	}
 
	  public void Retirar(double montoRetiro) {
		  
		  if(montoRetiro>this.saldo ){
			  System.out.println("No tiene saldo suficiente");
			  System.out.println("Su saldo es de : "  + this.saldo);
		  }
		  else {
			  this.saldo-=montoRetiro;
			  System.out.println("Su monto retirado es de :" + montoRetiro);
			  System.out.println("Su saldo restante es : " + this.saldo);
		  }
			  
		  }
	  }

