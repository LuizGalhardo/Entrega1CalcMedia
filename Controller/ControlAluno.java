package Controller;

import Model.Aluno;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Luiz Galhardo
 */
public class ControlAluno {
    
    
    private Aluno aluno;
    private List<Aluno> bdAluno = new ArrayList<Aluno>();
    private static ControlAluno controlAlunoUnico;
    
    
    
    public static ControlAluno getControlAluno(){
            if(controlAlunoUnico == null){
                controlAlunoUnico = new ControlAluno();
            }    
            
            return controlAlunoUnico;
        }
    
    
    
     public List<Aluno> getBdAluno(){
            return bdAluno;
        }
     
     
     public Aluno cadAluno(Aluno aluno){
         
         if(consAluno(aluno)== null){
			bdAluno.add(aluno);
			return aluno;
		}
		else{
			return null;
		}
     }
     
         
     public Aluno consAluno(Aluno aluno){
		for(int i = 0; i < bdAluno.size(); i++){
			if(aluno.getCdAluno() == bdAluno.get(i).getCdAluno()){
				return bdAluno.get(i);
			}
		}
		return null;
	}     
     
    
}
