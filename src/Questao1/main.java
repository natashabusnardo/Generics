package Questao1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("gato", "mamifero");
		
		MeuString<String> t1 = new MeuString<>("natasha");
		MeuString<Double> t2 = new MeuString<>(15.5);
		MeuString<Animal> t3 = new MeuString<>(animal);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}

}
