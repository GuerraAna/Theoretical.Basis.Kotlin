package funcoes

//COMO PENSAR EM ORIENTAÇÃO AO OBJETO ANTES DE PROGRAMAR?
//-fazer uma tabela no topo calculadora(objeto) e os valores são as propriedades e métodos;
//. Classe: Conjunto de objetos com características parecidas;
//. Propriedade: características da classe calculadora;
//. Métodos: ações que um objeto pode tomar (somar);
//
//
//Parte teórica funções:
//. Uma função representa uma rotina dentro de um sistema;
//. Lembre-se de Lógica de programação, o caminho mais rápido para se solucionar um probloema é um algoritmo;
//. A fun main é a função principal dentro do Kotlin, é nela que são realizadas diversas ações;
//. Estrutura de uma função:
//        fun nome (base da condição): Tipo do retorno{
//            val nome = condição
//            return nome
//        }
//. A função ela pode ser encontrada dentro de uma classe, como função mebro, pode ser encontrada dentro da função main, pode ser encontrada fora da classe e da função main;
//. No Kotlin, o que fica entre os parênteses de uma função, representa Pasca Notation, ou seja, os parâmetros:
//                Ex: fun main (arg: Array<Strings>){
//                        bloco de código
//                }
//                arg: primeiro parâmetro
//                Array<String>: tipo do parâmetro e tipo de Array
//
//- Tipos de retornos:
//1) Unit: . Pode ficar oculto dentro da função, caso ela não tenha um retorno.
//        Ex: fun main: Unit {
//        }
//2) Return: . Duas possi´veis formas de declarar uma função que tem um retorno:
//            a) fun soma (a: Int, b: Int): Int{
//                val somatoria = a + b
//                return somatoria
//            }
//            b) fun soma (a: Int, b: Int) = a + b
//
//-Argumento padrão: . A sua ocorrência é devido a existência de uma função com o seu bloco de códigois está omitido;
//                   . Esse tipo de função precisa ser invocada na fun main:
//                   Ex: fun ler (bytes: Array<Byte>, tamanho: Int = bytes.size){
//                                código omitido
//                         }
//                      fun main (){
//                        val arrayDeBytes = ler ()
//                        println(arrayDeBytes, 1 )
//                      }
//- Parâmetros nomeados: . Estrutura: fun Nome (Parâmetro: Tipo){ }
//                       Ex: fun posição (
//                                altura: Float,
//                                tempo: Float
//                                ){
//                                }
//- Invocar função: . Chamar na fun main, ex:
//                    fun main ( ){
//                    posicao(
//                            altura = o.1F,
//                            tempo = 1.5F
//                            )
//                    }

//Funções são blocos de códigos que executam uma ação;
//Pode criar uma função em qualquer lugar;
//Nomenclatura: fun nomeDaFuncao ( informação ) {bloco de código}
//Toda a função tem que ser chamada para a fun main (Principal)
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
