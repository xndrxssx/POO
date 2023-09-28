/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo;

/**
 *
 * @author ALCC
 */
public class Tarefa {
    private String nomeTarefa;
    private int tempoRealizar;
    private String descricao;
    private String data;
    private String prazo;
    private boolean complete;

    //construtor diz como um objeto vai ser criado
    public Tarefa (String nomeTarefa){
        this.nomeTarefa=nomeTarefa;
        this.complete=false;
    }

    //pega o atributo privado e retorna como publica pra poder mexer nela
    public String getNomeTarefa(){
        return nomeTarefa;
    }

    //verifica se a tarefa esta completa
    public boolean estaCompleta (){
        return complete;
    }

    public void marcarCompleta(){
        complete=true;
    }

    @Override
    public String toString (){
        return "["+(complete?"x":" ")+"]"+nomeTarefa;
    }
    
    public static void main(){

        
        
    }
    
}
