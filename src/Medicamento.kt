//Exemplo de class:
class Medicamento (val formula: String, var posologia: String, val constraindicacao: String) {
    constructor(formula: String, posologia: String) : this(
        formula,
        posologia,
        "Este medicamento é contraindicado para menores de 10 anos"
    )

    //init é uma função que tem como objetivo iniciar um bloco, ou mais, bloco de códigos.
    init {
        require(formula.trim().length > 0) {
            "Este medicamento não é indicado para menores de idade"
        }
    }

    //Função membro declarada dentro da class
    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}

fun main() {
        //Instanciamentos da class a partir dos construtores
        val medicamento1 = Medicamento("Dorflex", "...")
        val medicamento2 = Medicamento("Dramin", "...", "Minha contraindicação")
    }