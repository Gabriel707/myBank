package mybank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.saldo = 100;
		contaDoGabriel.deposita(50);
		System.out.println(contaDoGabriel.saldo);
		
		boolean conseguiuRetirar = contaDoGabriel.saca(20);
		System.out.println(contaDoGabriel.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaGabi= new Conta();
		contaDaGabi.deposita(1000);
		boolean sucessoTransferencia = contaDaGabi.transfere(300, contaDoGabriel);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Falta de recursos.");
		}
		System.out.println(contaDaGabi.saldo);
		System.out.println(contaDoGabriel.saldo);
		
		
		contaDoGabriel.titular = "Gabriel Araujo";
		System.out.println(contaDoGabriel.titular);
			
	}
}
