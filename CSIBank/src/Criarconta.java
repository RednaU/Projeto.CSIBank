
public class Criarconta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 80.00;
		conta1.agencia = 1996;
		conta1.numero = 123729;
		conta1.titular = "Matheus";
		
		Conta conta2 = new Conta();
		conta2.saldo = 80.00;
		conta2.agencia = 1996;
		conta2.numero = 123729;
		conta2.titular = "Matheus";
			   
		if(conta1 == conta2) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
}


}
