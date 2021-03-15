//Arrays armazena vários itens dentro de uma variável. Podendo ser matriz ou vetor;
//Ao criar um Array ele automaticamente cria índices, sempre começando do índice zero (0);
//É possível alterar valores do Array;
//O Array pode misturar números e letras;

fun main (args: Array<String> ) {
    //Array e listas:
    //Array tem valor fixo, ou seja, não pode crescer;
    //arrayOf são valores constantes
    val numbers = arrayOf(1, 2, 3)
    println(numbers[0])

    //O {10} é um bloco de código -> 5 índices com o número 10 atribuido;
    val ten = Array(5, {10})
    println(ten[0])
    //OU
    val ten1 = Array(5){
        10
    }

    //TIPOS PRIMITIVOS DE ARRAYS É O IDEAL PARA PERFORMACE NO PROJETO;
    //PARA trabalhar com Int, Float, Double, Boolean
    val numberInt = intArrayOf(1, 2, 3)
    //Desafios, use: val n = intArrayOf(readLine()!!.toInt())


    //Lista de textos:
    val texts = listOf("Ola","Mundo", "list")
    println(texts[0])

    //Adicionar valores aleatórios
    val names = mutableListOf<String>()
    names.add("Ola")
    names.add("mutável")
    names.add("Mundo")
    names.add("Veja")

    //Manipular o tamanho das listas
    names.isEmpty()
    names.size
    names.first()
    names.last()
    names.min()
    names.joinToString(separator = ":")
    names.slice(indices = 0..2).contains("veja")
    names.sort()

    for (name in names){
        print(names)
    }

    /* for(index, names) in names.withIndes(){
        println("$index, $names")
    }


    //Criar uma lista de objetos para criar valores nulos:
    var listOfNullables: List<Int?> = listOf(1, 2, null, 4)
    var listOfNullables: List<Int>? = listOf(1, 2, null,



    val nomes = arrayOf("Ana", "Letícia", 20)
    //nomes[0] = "Pedro"
    println(nomes[0])
    println(nomes[1])
    println(nomes[2])
*/


}