//COMO PENSAR EM ORIENTAÇÃO AO OBJETO ANTES DE PROGRAMAR?
//-fazer uma tabela no topo calculadora(objeto) e os valores são as propriedades e métodos;
//. Classe: Conjunto de objetos com características parecidas;
//. Propriedade: características da classe calculadora;
//. Métodos: ações que um objeto pode tomar (somar);




//Enum = Enumeração
//Cada constante no Enum é um objeto
//O Enum é inicializado como enum class
//O membro Enum é um objeto com uma função definida
//Separa as constantes dos membros por ponto e vírgula;
//Um membro no Enum é definido por: override fun nome () = valor;
//Uma classe E  num pode implementar uma Interface;
//Uma classe Enum não pode derivar de uma classe;
//Membro é uma função interna ao Enum

enum class Estado (val descricao:String){
    SP(descricao = "São Paulo"),
    RJ(descricao = "Rio de Janeiro");
}

enum class MeioDePagamento {
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    BOLETO;
}

fun pagarComBoleto(){
    println("Pagamento por Boleto")
}
fun pagarComCartaoCredito() {
    println("Pagamento por Cartão")
}

fun pagarComCartaoDebito(){

}

fun main( ) {
    println(Estado.SP)
    println(Estado.RJ)
    println(Estado.RJ.name) //Representação de String do Enum;
    println(Estado.RJ.ordinal) //Representação numérica do Enum: O print resulta em 0;
    println(Estado.SP.ordinal) //Representação numérica do Enum: O print resulta em 1;
    println(Estado.valueOf(value = "SP")) //valueOf devolve a lista de Enum que existe;
    println()
    Estado.values().forEach(::println) //forEach executa cada função em Array;
    println(Estado.SP.descricao) //Recurso inicializador;

    when (MeioDePagamento.CARTAO_CREDITO) {
        MeioDePagamento.BOLETO -> {
            pagarComBoleto()
        }
        MeioDePagamento.CARTAO_CREDITO -> {
            pagarComCartaoCredito()
        }
        MeioDePagamento.CARTAO_DEBITO -> {
            pagarComCartaoDebito()
        }
    }

}
