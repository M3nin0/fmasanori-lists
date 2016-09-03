package main

import "fmt"

func main() {

    var price, discountPercentage float64

    fmt.Print("Insert price: ")
    fmt.Scan(&price)

    fmt.Print("Insert discount percentage (0 ~ 100): ")
    fmt.Scan(&discountPercentage)

    fmt.Printf("You got a discount of $%.2f! Pay only $%.2f.", price * (discountPercentage / 100), price * (1 - discountPercentage / 100))

}
