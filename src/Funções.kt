//Funções são blocos de códigos que executam uma ação;
//Pode criar uma função em qualquer lugar;
//Nomenclatura: fun nomeDaFuncao ( informação ) {bloco de código}
//Toda a função tem que ser chamada para a fun ProjectClasses.main (Principal)
//private fun nomeSobrenome (nome: String, sobreNome: String) -> defini uma função com estrutura imutável;
//Função de Ordem Superior: São funções acima ou abaixo da função main. São chamadas por diversas formas;
//Função Single-Line: fun nomeDaFuncao(nome: Tipo) = retorno;
//Função extensão: fun tipo.nomeDaFuncao( ) -> Chamada semre pelo this interno a função. (Ex: fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()

//função sem retorno
fun anaClara(nome:String, nome1:String) {
    println("Ana Clara")
}


//função com retorno
fun somar(numero:Int, numero1:Int):Int{
    val total =numero +numero1
    return total
}

//função principal
fun main () {
    anaClara("Ana", "Clara")
    val resultado = somar(10, 5)

    //Estruturas de controle: if/else.
    if (resultado > 5) {
        //bloco de códigos
    } else if (resultado < 5) {

    } else {
    }

    //Estruturas de controle: when/else. (case..)
    val resultad = 2
    when (resultad) {
        resultad->{
        }
        else->{
        }
    }

    //Obs: Estrutura de repetição aceita in, range, until, downTo, step;
    //Estruturas de controle: elvis operator.
    //val a: Int;? = null
    //var number = a ?: 0
    //Le-se: a é nulo ou não? Sim é nulo, então, number é igual a zero.

    //Repetição: While
    //While(Condição){
    //{

    //Repetição: do..while:
    //do{
    //bloco
    // while(Condição)

    //Repetição: forEach:
    //for(i in 0..20 step 2{
    //          println(i)
    //}

    //For: (in/until/downtTo) (step: intervalo)
    //Ex: for (i in 0..20 step2){
    //          println(i)
    //{
}


