//Introdução à variáveis;
//Tipos de dados: Int, Long, Float, Double, Array, Boolean, Char, Byte, Short, Null!;
//Conversão de dados: toByte | toShort | toInit | toLong | toFloat | toDouble | toChar;
//println(Int.MAX_VALUE) -> Serve para todos os dados;
//Array (matriz e vetor): var nome = arrayOF(" ") -> identificação: println(nome[]);
//Nullability utiliza "?", para indicar valores nulos, depois dos dados (Ex: var mouth: String? = null);
//Operadores Comparativos: a > b (ou a.compareTo(b)>0 | a < b (ou a.compareTo(b)<0 | a >= b (ou a.compareTo>=b) | a <= b (ou a.compare(b)<=b| a == b (ou a.equals(b)) | a != b (ou !(a.equals(b));
//Operadores lógicos: E = && | OU = || ;
//Funções e expressões: in (contém) | !in (não contém) | (int..Int) (range);
//Indexação: First() | last() | String.length | String[index];
//Concatenação + | .plus | ${ }
//Formatação: capitalize() | toUpperCase() | toLowerCase() | decapitalize() | trimEnd() | trimStart() | trim() | replace(x,y) | $valor ou format(valor);
//Empty: isEmpty() vazio. (Ex: val s = "" | println(s.toEmpty) //true
//Blank: isBlank() branco ou nulo. (Ex: val s = "   " | println(s.toBlank) //true

fun main( ) {
    //var = mutável;
    //val = imutável e durante a execução;
    //const val = imutável e fora da execução;

    var usuario: String
    usuario = "Maria"
    //O println imprimirá a ultima atualização da variável usuário.
    println(usuario)

    //Variável imutável e dentro da execução.
    val pi: Double = 3.14159
    println("$pi ou use println(pi)")


    //Double: variável com casa decimal muito alta;
    //Float: variável com casa decimal menor que o Double (Ex: val x = 3.5f);
    //Long: Armazena números inteiros (Ex: val y = 23442342342342342342344L);
    //Int: Armazena números inteiros menores que o Long (Ex: val y = 12312313);
    //String: Armazena valores escritos, caracteres (Ex: val string = "Ana");
    //Boolean: Armazena valores verdadeiros ou falsos (Ex: val boolean = true);

    var numero: Double = 12.2344432423424
    var numero1: Float = 12.344F
    var numero2: Long = 12345432123445678L
    var numero3: Int = 123
    var numero4: String = "Ana Clara"
    var numero5: Boolean = true

    //Variáveis de par odrenado:
    //Ex: val(x,y) = coord
    //Ex: val(x,_) = coord
    //Ex: val(_,y) = coord


    //Alguns operadores aritméticos, duas formas de representar (existem outras):
    //Existe uma maneira de calcular direto no print use (Ex: ${x.plus(y)} );
    //Forma mais extensa:
}

fun soma (x: Int, y: Int): Int {
    val somatoria:Int = x + y
    return somatoria
}
fun subtracao (x: Int, y: Int): Int {
    val sub: Int = x - y
    return sub
}
fun multiplicacao (x: Int, y: Int): Int {
    val multi: Int = x*y
    return multi
}
fun divisao (x: Int, y:Int): Int {
    val divid: Int = x / y
    return divid
}
fun resto (x: Int, y: Int): Int {
    val rest: Int = x % y
    return rest
}
fun porcentagem (x: Int, y: Int): Int {
    val porc: Int = x*y/100
    return porc
}
//Forma mais curta: Código limpo.
fun soma1(x: Int, y:Int) = x.plus(y)
fun subtracao1(x: Int, y: Int) = x.minus(y)
fun multiplicacao1(x: Int, y: Int) = x.times(y)
fun divisao1(x: Int, y:Int) = x.div(y)
fun resto1(x: Int, y:Int) = x % y
fun porcentagem1(x: Int, y:Int) = x.times(y)/100



