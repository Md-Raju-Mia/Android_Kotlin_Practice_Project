package com.raju.myfirstapplication

class MyClass {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")

            /** 2nd lecture kotlin data type*/
            Int
            String
            Boolean
            Float
            Double
            Long
            Char
            Byte
            Short


            /**Kotlin Variable declaration*/

             var a: Int = 10

            println("Hellow world! $a")

            var name : String = "Raju"

            println("Hello $name, welcome to kotlin world!")

            /** When value is assigned initally we can direct write the variable as*/
            /** Kotlin automatically take the type of variable based on given data*/
            var b =11;
            var name1 = "raju"

            /**Common difference between val and var is val can not reassign */
            /**val means value and var means variable
                  1. We can reassing the value of variable
                  2. But we can not reassign the value of val/value*/
            val c = "raju"
//                c="shibli"






        }
    }
}