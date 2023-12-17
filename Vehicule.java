public abstract class Vehicule  {
    public int anneAtuale = 2023; 
    public String marque;
    public double prixach;
    public int dateAchat; 



    public Vehicule(String marque, float prixach, int dateAchat) {
        this.marque = marque;
        this.prixach = prixach;
        this.dateAchat = dateAchat;
        
    }



public abstract void afficher() ; 
public abstract boolean equals(Object obj);
public abstract double calculprix();
    /*{
System.out.println("marque :"+marque);
System.out.println("prix :"+prixach);
System.out.println("date achat :"+dateAchat);
    }
    double calculprix(){
        return prixach - (anneAtuale - dateAchat)*0.05*prixach; 
    }*/




/*  {

   


    if(this.marque == ((Vehicule)obj).marque &&
       this.prixach == ((Vehicule)obj).prixach &&
       this.dateAchat == ((Vehicule)obj).dateAchat
                                            )
    return true;

    else

    return false;
}
 */






}
