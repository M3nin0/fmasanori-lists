package main

import "fmt"

func main() {

    var salary, percentage, increase, increasedSalary float64

    fmt.Print("Insert salary: ")
    fmt.Scan(&salary)

    fmt.Print("Insert percentage (0 ~ 100): ")
    fmt.Scan(&percentage)

    increase = salary * ( percentage /100)
    increasedSalary = salary + increase

    fmt.Printf("Your salary had an increase of $%.2f, your salary now is $%.2f", increase, increasedSalary)

}
