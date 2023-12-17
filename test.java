public class test {

    public static void main(String[] args) {
        Vehicule ve1 = new Voiture("tipos", 1000, 2020,4,120,18000);
         Vehicule ve2 = new Voiture("tipo", 1000, 2020,6,120,180000);
        Avion a = new Avion("boeing", 100, 2020,123);
        Voiture v = new Voiture("tesla", 100, 2020, 4, 220, 1000);
a.afficher();
System.out.println(a.calculprix());
v.afficher();
System.out.println(v.calculprix());
System.out.println(ve1.equals(ve2));

    }
}
