/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_treillis.Noeuds;
import projet_treillis.Terrain;
//modeliser les forces sur le noeud selon le type de noeud
//rajouter l'identifiant (pour tous les types de noeuds)
/**
 *
 * @author tetsi
 */
public class Noeud_general {
    
    public int identifiant_Noeud;
    public double nx;
    public double ny;
    
    public Noeud_general (double nx, double ny, int identifiant_Noeud){ //dire que les coordonnées doivent etre dans le terrain
        this.nx=nx;
        this.ny=ny;
    }
    public double getnx(){
        return nx;
    }
    
    public double getny(){
        return ny;
    }
    
    public void setnx(double nx){
        this.nx=nx;
    }
    
    public void setny(double ny){
        this.ny=ny;
    }
    
    @Override
    public String toString(){
        return "("+nx+","+ny+")";
    }
    
    public Noeud_general(){
        this(0,0,0);
    }
}