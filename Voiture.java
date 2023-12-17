public class Voiture extends Vehicule implements Driving {
    int nbrPortes ; 
    int puissances ; 
    int kilometrage; 

    public Voiture(String marque, float prixach, int dateAchat, int nbrPortes, int puissances, int kilometrage) {
        super(marque, prixach, dateAchat);
        this.nbrPortes = nbrPortes;
        this.puissances = puissances;
        this.kilometrage = kilometrage;
    }
  
@Override
public double calculprix(){
       return  (kilometrage/100000)*0.1*prixach;
    }
@Override
public void afficher(){
System.out.println("marque :"+marque);
System.out.println("prix :"+prixach+"£");
System.out.println("date achat :"+dateAchat);    
System.out.println("nbrPortes :"+nbrPortes);
System.out.println("puissances :"+puissances +"hp");
System.out.println("kilometrage :"+ kilometrage+"km");

    }

@Override
public boolean equals(Object obj) {

    if(
    this.marque == ((Voiture)obj).marque         &&
    this.prixach == ((Voiture)obj).prixach       &&
    this.dateAchat == ((Voiture)obj).dateAchat   &&
    this.nbrPortes == ((Voiture)obj).nbrPortes   &&
    this.puissances == ((Voiture)obj).puissances &&
    this.kilometrage == ((Voiture)obj).kilometrage
      ) return true;

 else return false;
   
}

@Override
public void roadDriving() {
    System.out.println("the car is in driving state");
    
}
    


    
}
