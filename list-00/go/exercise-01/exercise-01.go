package main

import "fmt"

func main() {

    var meters int
    fmt.Print("Insert meters: ")
    fmt.Scan(&meters)

    fmt.Println("Converted to", meters * 1000, "milimeters.")

}
