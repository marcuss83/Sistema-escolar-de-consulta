package escola;

import Models.Aluno;
import Models.Coordenador;
import Models.Pessoa;
import Models.Professor;
import Views.TelaInicial;
import java.util.ArrayList;

public class Escola {

   
    public static ArrayList<Aluno> listaAluno = new ArrayList<>();
    public static ArrayList<Professor> listaProfessor = new ArrayList<>();
    public static ArrayList<Coordenador> listaCordenador = new ArrayList<>();
    
    
    
    public static void main(String[] args) {
        TelaInicial t = new TelaInicial();
        t.setVisible(true);
    }
    
}
