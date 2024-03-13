package Miniprojet;

public class Malade {
	 static int  Id;
	    String name;
	    int age;
	    String condition;//la conditon du malade selon le medecin 
	    Specialiste drchoisie;

	    public Malade( String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}
