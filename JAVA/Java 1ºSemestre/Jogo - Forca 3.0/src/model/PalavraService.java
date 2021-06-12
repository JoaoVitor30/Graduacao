package model;

import java.util.Random;
import javax.swing.JOptionPane;
import view.TelaMenu;

public class PalavraService {
    
    private Palavra p;

    public PalavraService() {
        p = new Palavra();
    }
    
       public void iniciar(){
            Random rand = new Random();
            String palavraSorteada = "";
            String dica = "";
            int posicaoPalavraSorteada = 0;

             if (TelaMenu.getNivel() == "F"){
                 palavraSorteada = this.p.getDataForcaFacil().get(rand.nextInt(this.p.getDataForcaFacil().size()));
                 posicaoPalavraSorteada = this.getPosicao(palavraSorteada,TelaMenu.getNivel());

                 DicaNivelFacil nf = new DicaNivelFacil(this.p.getDataForcaFacil());
                 dica = nf.getDica(posicaoPalavraSorteada);

             }else if (TelaMenu.getNivel() == "M"){
                 palavraSorteada = this.p.getDataForcaMedio().get(rand.nextInt(this.p.getDataForcaMedio().size()));
                 posicaoPalavraSorteada = this.getPosicao(palavraSorteada,TelaMenu.getNivel());

                 DicaNivelMedio nm = new DicaNivelMedio(this.p.getDataForcaMedio());
                 dica = nm.getDica(posicaoPalavraSorteada);

             }else{
                 palavraSorteada = this.p.getDataForcaDificil().get(rand.nextInt(this.p.getDataForcaDificil().size()));
                 posicaoPalavraSorteada = this.getPosicao(palavraSorteada,TelaMenu.getNivel());

                 DicaNivelDificil nd = new DicaNivelDificil(this.p.getDataForcaDificil());
                 dica = nd.getDica(posicaoPalavraSorteada);

             }

              JOptionPane.showMessageDialog(null, "Palavra Sorteada: " + palavraSorteada +"\n Dica:" + dica);
    }
    
    private int getPosicao(String palavra, String id){
        int posicao = 0;
        
        if (id.equals("F")){
            for (int i = 0; i < this.p.getDataForcaFacil().size(); i++){
            
            if(this.p.getDataForcaFacil().get(i).equalsIgnoreCase(palavra)){
                   posicao = i;
                   break;
               }
           }
        }else if (id.equals("M")){
             for (int i = 0; i < this.p.getDataForcaMedio().size(); i++){
            
                if(this.p.getDataForcaMedio().get(i).equalsIgnoreCase(palavra)){
                   posicao = i;
                   break;
               }
            }
        }else if(id.equals("D")){
             for (int i = 0; i < this.p.getDataForcaDificil().size(); i++){
            
                if(this.p.getDataForcaDificil().get(i).equalsIgnoreCase(palavra)){
                   posicao = i;
                   break;
                }
            }
        }
        return posicao;
    }
}
