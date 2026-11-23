package polimorfismo

//--->POLIMORFISMO RESUMO<---
//
//. Polimorfismo é a capacidade do objeto de ser referenciado de várias formas;
//. O OBJETO NÃO SE TRANSFORMA, TODO OBJETO NASCE DE UM TIPO E MORRE DO MESMO TIPO!!!!!
//. O que muda, no objeto, é a maneira de como nos referimos a ele;
//. Os métodos são os influenciadores para a "mudança" do objeto, dando várias formas de como tratá-lo;
//. Tem como objetivo evitar a carga excessiva de crianção de métodos;
//
//OBS: Polimorfismo é semelhante a herança.

// ===== Exemplos executáveis =====

open class Animal {
    open fun som(): String = "..."
}

class Cachorro : Animal() {
    override fun som() = "Au au"
}

class Gato : Animal() {
    override fun som() = "Miau"
}

fun main() {
    //O objeto nasce Cachorro e morre Cachorro — não se transforma.
    //O que muda é a forma como nos referimos a ele: como Animal.
    val animal: Animal = Cachorro()
    println(animal.som())

    //Uma lista de Animal aceita qualquer subclasse — cada um responde do seu jeito
    val animais: List<Animal> = listOf(Cachorro(), Gato())
    animais.forEach { println(it.som()) }
}
