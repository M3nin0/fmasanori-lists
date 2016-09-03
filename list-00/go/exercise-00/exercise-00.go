package main

import "fmt"

func main() {

    var a, b int
    
    fmt.Print("Insert number 1: ")
    fmt.Scan(&a)

    fmt.Print("Insert number 2: ")
    fmt.Scan(&b)

    fmt.Println("Sum: ", a + b)

}
