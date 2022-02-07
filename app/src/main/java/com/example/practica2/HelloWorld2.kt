package com.example.practica2

fun main () {
    println("Hello World")

    //Caso #1
    var result1 = (suma(null,25))
    println("Test1 passed ${result1==25}")
    var result2 = (suma(null,null))
    println("Test2 passed ${result2==-2}")

    //Caso #2
    var result3 = (suma(-100,5))
    println("Test3 passed ${result3==-1}")
    var result4 = (suma(100,-5))
    println("Test4 passed ${result4==-1}")
    var result5 = (suma(-1500,1500))
    println("Test5 passed ${result5==-1}")

    //Caso #3
    var result6 = (suma(null,null))
    println("Test6 passed ${result6==-2}")

    //Caso #4
    var result7 = (suma(10,12))
    println("Test7 passed ${result7==22}")
    var result8 = (suma(80,13))
    println("Test8 passed ${result8==93}")

    //Caso #5
    var result9 = (suma(5,null))
    println("Test9 passed ${result9==5}")
    var result10 = (suma(null,89))
    println("Test10 passed ${result10==89}")


}

fun suma (n1: Int?, n2: Int?): Int{
    var res = -1

    if(n1!=null && n2!=null) {

        if (n1 >= 0 && n2 >= 0) {
            res = n1 + n2
        }
    }else{
        if(n1==null && n2==null) {
            res = -2
        }else{
            res = if (n1!=null)n1 else n2!!
        }

    }

    return res
}


//Caso #1 Debera aceptar valores nulos
// Prueva #1 n1= null, n2= 25 result = 25
// Prueva #2 n1= null, n2= null result = -1


//caso # 2 si uno de los valores es menos que 0, el resultado debera devolver -1
// Prueba #3 : n1= -100, n2=5 result2= -1
// Prueba #4 : n1= 100, n2=-5 result3= -1
// Prueba #5 : n1= -1500, n2= 1500 result= -1

// Caso #3 si los valores son nulos debera devolver -2
// Prueba #6 : n1= null, n2 = null result = -2

//Caso # 4 en caso que no cumplan la restrinciones anteriores debera devolver la suma
// Prueba #7 : n1=10, n2=12 el resutado debe ser result = 22
// Prueba #8 : n1=80, n2= 13 result = 93

//Caso #5 si uno de los valores es nulo debera devolver el valor que no es nulo
// Prueba #9 : n1=5 , n2= null result5 = 5
// Prueba #10 : n1=null , n2= 89 result5 = 89


