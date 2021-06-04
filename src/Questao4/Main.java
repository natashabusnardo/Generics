package Questao4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Componente<Object> c = new Componente<>();
		
		System.out.println(c.addComponente("123", 15));
        System.out.println(c.addComponente("123", "c1"));
        System.out.println(c.addComponente("456", 13.2));
        System.out.println(c.busca("123"));
		
	}

}
