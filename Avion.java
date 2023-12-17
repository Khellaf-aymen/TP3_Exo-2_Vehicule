public class Avion extends Vehicule {
int heuresVol;



    public Avion(String marque, float prixach, int dateAchat,int heuresVol) {
        super(marque, prixach, dateAchat);
        this.heuresVol = heuresVol;
    }

    @Override
   
     public double calculprix(){
        return (heuresVol/5000)*0.08*prixach;
     }

    @Override
    public void afficher() {
        System.out.println("marque :"+marque);
        System.out.println("prix :"+prixach+"$");
        System.out.println("date achat :"+dateAchat);
        System.out.println("heuresVol :"+heuresVol+"h");
    }

    @Override
    public boolean equals(Object obj) 
    {
        
    if(
    this.marque == ((Avion)obj).marque        &&
    this.prixach   == ((Avion)obj).prixach    &&
    this.dateAchat == ((Avion)obj).dateAchat  &&
    this.heuresVol == ((Avion)obj).heuresVol
      ) return true;

 else return false;
    }

    
}
