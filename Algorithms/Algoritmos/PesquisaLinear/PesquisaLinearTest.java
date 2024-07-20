public class PesquisaLinearTest
{
    public static void main(String[] args){
        int[] numeros = {90, 70, 50, 80, 60, 85};

        System.out.println(PesquisaLinear.search(numeros, 80));
        System.out.println(PesquisaLinear.searchRecursive(numeros, 80, 0));
    }
}
