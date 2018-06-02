package aye2practica6;

public class CuentaCorriente {
	private float saldo;
	private int opsVal;
	private int opsInv;
	
	public CuentaCorriente() {
		this.saldo = 0;
		this.opsVal = 0;
		this.opsInv = 0;
	}
	
	public CuentaCorriente(float f) {
		this.saldo = this.saldo + f;
	}
	
	public void saldo() {
		System.out.println("El saldo actual es de " + this.getSaldo());
	}
	
	public void deposito(float f) {
		this.saldo = this.saldo + f;
	}
	
	public void extraccion(float f) {
		this.saldo = this.saldo - f;
		if (this.saldo < 0) {
			this.opsInv += 1; 
		} else{
			this.opsVal += 1;
		}
	}
	
	public void CantidadOperacionesVal() {
		
		System.out.println("La cantidad de operaciones válidas es " + this.getOpsVal());
		
	}
	
	public void CantidadOperacionesInv() {
		System.out.println("La cantidad de operaciones inválidas es " + this.getOpsInv());
	}

	private float getSaldo() {
		return saldo;
	}

	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	private int getOpsVal() {
		return opsVal;
	}

	private void setOpsVal(int opsVal) {
		this.opsVal = opsVal;
	}

	private int getOpsInv() {
		return opsInv;
	}

	private void setOpsInv(int opsInv) {
		this.opsInv = opsInv;
	}
	
	
}
