fun main(){
    //---Variables inmutables---//
    /*
    No pueden cambiar su valor
    */

    val nombre = "Santiago"//Se recomienda nombrarlas en mayúsculas.

    println(nombre)

    //---Identificadores de variables---//
    /*
    Un identificador puede comnezar con _ o con una letra
    Puede incluir, pero no comenzar con un número
    No se permiten espacios en blanco
    No pueden contener los signos @, -, +, *
    Los identificadores distinguen entre minusculas y mayusculas
    No se pueden usar palabras reservadas
    Sugerencia: siempre el nombre de la variable debería ser declarativo de lo
    que contiene
    */

    //---Palabras recerbadas---//
    /*
    interface   continue    super   this    for if
    breack  try return  do  package class
    else    while   is  null    throw   objet   when
    */

    //---Tipos de datos---//

    //Numericos enteros
    var numero1: Byte = 2 //Ocupa 8 Bits en memoria
    //Puede representar hasta 256 valores, desde el -128 al 127
    println(numero1)

    val numero2: Short = 4884//Ocupa 16 bits
    // 65524 valores y va del -32768 al 32767
    println(numero2)

    val numero3 = 3566363//Es el mas utilizado
    //Ocupa 32 bits
    println(numero3)

    val numero4: Long = 41389861 //64 bits
    //Sirve para numero muy grandes
    println(numero4)

    //Numeros reales

    val numero5: Float = 3.14f //Son numero decimales
    //El tipo floar siempre lleva la f al final del numero
    //No se separa con coma, siempre con punto
    println(numero5)

    val numero6: Double = 2.34//Es para numeros decimales
    //Aunque en este caso no agregamos ninguna letra

    //Numericos sin sigo
    /*
    Nos permite almacenar mas nunmeros positivos
    eliminando a los negativos
    */
    var enteroSinSigno: UByte = 200u
    numero1 = 127
    println("El nuevo valor de numero1 es $numero1")
    println(enteroSinSigno)

    //010020






}