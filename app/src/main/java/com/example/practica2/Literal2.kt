package com.example.practica2

//Crear un programa que lea una secuencia de numeros y que devuelva un arreglo
//de datos ordenados, debera aceptar valores nulos.
//-El array que recibira sera de numeros enteros.
//-Si la secuencia de datos es null debera volver un array vacio
//-Si la secuencia es vacia o no contiene elementos debera devolver el array vacio
//-De lo contrario devolvera los numeros ordenados de mayor a menor
//-debera desarrollar 10 casos de prueba
fun main()
{
    //Se le dan valores a los Arrays
    val array1 = arrayOf<Int>()
    val array2 = arrayOf<Int>(2,42,6)
    val array3 = arrayOf<Int>(10,5,30)
    val array4 = arrayOf<Int>(6,8,9)
    val array5 = arrayOf<Int>()
    val array6 = arrayOf<Int>(5,6,9)
    val array7 = arrayOf<Int>(5,5,10)
    val array8 = arrayOf<Int>()
    val array9= arrayOf<Int>()
    val array10 = arrayOf<Int>(1,10,66)

    //Se suman el valor de los arrays

    val Prueba1 = sumaarrays(array1)
    val Prueba2 = sumaarrays(array2)
    val Prueba3 = sumaarrays(array3)
    val Prueba4 = sumaarrays(array4)
    val Prueba5 = sumaarrays(array5)
    val Prueba6 = sumaarrays(array6)
    val Prueba7 = sumaarrays(array7)
    val Prueba8 = sumaarrays(array8)
    val Prueba9 = sumaarrays(array9)
    val Prueba10 = sumaarrays(array10)

    //Se imprime el resultado de cada array
    println("Test1 pasado  ${Prueba1==-1}")
    println("Test2 pasado  ${Prueba2==50}")
    println("Test3 pasado  ${Prueba3==45}")
    println("Test4 pasado  ${Prueba4==23}")
    println("Test5 pasado  ${Prueba5==-1}")
    println("Test6 pasado  ${Prueba6==20}")
    println("Test7 pasado  ${Prueba7==20}")
    println("Test8 pasado  ${Prueba8==-1}")
    println("Test9 pasado  ${Prueba9==-1}")
    println("Test10 pasado ${Prueba10==77}")

}

fun sumaarrays(args : Array<Int>): Int
{
    var datos = 0
    if (args.isNotEmpty()){
        for (index in args){
            datos = datos + index
        }
    } else{
        datos = -1
    }
    return datos
}