import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class CalculoDeMedia{
    static public void main (String [] leoprogramador){
        //prof vai informar o número de alunos que tem
        //ele não pode informar um valor menoe ou igual a 0 
        //para cada aluno, vamos calcular a media 
        int n;
        do{
            n = parseInt(showInputDialog("Quantos alunos você tem?"));
        }
        while(n <=0);
        //cont++ = cont +=1 = cont = cont + 1;
        for(int cont = 1;cont <= n;cont++){
            double a1, a2, a3 ;
            do{
                a1 = parseDouble(showInputDialog("Digita o valor da A1 ai parceiro"));
            }while(a1 < 0 || a1 > 30);
            do{
                a2 = parseDouble(showInputDialog("Digita o valor da A2 ai parceiro"));
            }while(a2 < 0 || a2 > 30);

            do{
                a3 = parseDouble(showInputDialog("Digita o valor da A3 ai parceiro"));
            }while(a3 < 0 || a3 > 40);
            double media = a1 + a2 + a3; 
            showMessageDialog(null,"Média: " + media);
            if(media >= 70){
                showMessageDialog (null, "VOA MLKOTE!!");
            }
                else{
                showMessageDialog(null, "foi de steve");
            }

            }
        }
    }
