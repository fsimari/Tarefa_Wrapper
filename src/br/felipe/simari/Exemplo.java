package br.felipe.simari;

public class Exemplo {
    public static void main(String[] args) {
         Boolean status = true;
         Boolean status1 = Boolean.TRUE;

         ////BOXING
         Character c = 'A';
         Integer idadeI = 10;
         Long cpf = Long.valueOf(123123);
         Long cpf1 = 123121l;

         ////UNBOXING  PRIMITICO PARA WRAPPER
         boolean status2 = Boolean.TRUE;
         char letra = (Character.valueOf('B'));
         int idade2 = (Integer.valueOf(12));


        Cliente cliente = new Cliente();
        System.out.println(cliente.getLetra() + " não reconhecido");
        System.out.println( letra + " não reconhecido");


        ///casting explicito ex: (short)  (short é menor que int)
        int num1 = 10;
        short num2 = (short)num1;

        ////casting implicito (implicito pois short é maior que int
        int idade = 10;
        long idadeL = idade;

    }
}
