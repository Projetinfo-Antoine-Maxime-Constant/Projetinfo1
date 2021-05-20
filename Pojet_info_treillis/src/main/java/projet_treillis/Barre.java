/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_treillis;

import projet_treillis.Noeuds.Noeud_general;

/**
 *
 * @author tetsi
 */
public class Barre {
    
    public Noeud_general debut;
    public Noeud_general fin;
    
    public Barre(Noeud_general debut, Noeud_general fin){
        this.debut=debut;
        this.fin=fin;
    }
    
    public Noeud_general getDebut(){
        return debut;
    }
    
    public Noeud_general getFin(){
        return fin;
    }
}
